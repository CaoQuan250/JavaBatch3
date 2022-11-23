package com.example.stringboot.CarRental.Controller.View;


import com.example.stringboot.CarRental.Dto.CarDto;
import com.example.stringboot.CarRental.Model.Brand;
import com.example.stringboot.CarRental.Model.Car;
import com.example.stringboot.CarRental.Rep.CarRep;
import com.example.stringboot.CarRental.Service.BookingService;
import com.example.stringboot.CarRental.Service.BrandService;
import com.example.stringboot.CarRental.Service.CarService;
import com.example.stringboot.CarRental.Service.CarServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

@Controller
public class CarView {
    @Autowired
    CarService carService;
    @Autowired
    BrandService brandService;
    @Autowired
    CarServiceImp carServiceImp;
    @Autowired
    CarRep carRep;
    @Autowired
    BookingService bookingService;

    @GetMapping(value = {"/index"})
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/list")
    public String listCar(ModelMap modelMap,
                             @Param("fuel") String fuel,
                             @Param("model") String model){
        List<Car> carFilter = carService.filter(fuel, model);
        modelMap.addAttribute("LIST_CAR",carFilter);
        modelMap.addAttribute("fuel",fuel);
        modelMap.addAttribute("model",model);
        return "view_car";
    }

    @RequestMapping(value = "/booking-list")
    public String listBook(ModelMap model){
        model.addAttribute("LIST_BOOK",bookingService.findAll());
        return "view_order";
    }

    @GetMapping("/add")
    public String addOrEdit(ModelMap model){

        CarDto car = new CarDto();

        model.addAttribute("CARDTO",car);

        model.addAttribute("ACTION","/updateOrAdd");

        return "car";

    }

    @PostMapping("/updateOrAdd")
    public String add(ModelMap model,@ModelAttribute("CARDTO") CarDto dto){
        Optional<Car> optionalCar = carService.findById(dto.getId());
        Car car = null;
        String image = "Logo.png";
        Path path = Paths.get("src/main/resources/static/uploads/");
        if (optionalCar.isPresent()){
            if (dto.getPhoto().isEmpty()) {
                image = optionalCar.get().getPhoto();
            }else {
                try {
                    InputStream input = dto.getPhoto().getInputStream();
                    Files.copy(input, path.resolve(dto.getPhoto().getOriginalFilename()),
                            StandardCopyOption.REPLACE_EXISTING);
                    image = dto.getPhoto().getOriginalFilename().toString();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
            car = new Car(dto.getId(),dto.getFuel(),dto.getMfg(),dto.getModel(),image,dto.getSeat(),dto.getPrice(),
                    new Brand(dto.getBrandId(),""));
            carService.save(car);
            return "redirect:/list";
        } else {
            if (!dto.getPhoto().isEmpty()){
                try {
                    InputStream input = dto.getPhoto().getInputStream();
                    Files.copy(input, path.resolve(dto.getPhoto().getOriginalFilename()),
                            StandardCopyOption.REPLACE_EXISTING);
                    image = dto.getPhoto().getOriginalFilename().toString();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        car = new Car(dto.getId(),dto.getFuel(),dto.getMfg(),dto.getModel(),image,dto.getSeat(), dto.getPrice(),
                 new Brand(dto.getBrandId(),""));
        carService.save(car);
        return "redirect:/list";
    }

    @RequestMapping("/edit/{id}")
    public String edit(ModelMap model, @PathVariable(name = "id")String id){
        Optional<Car> carOptional = carService.findById(id);
        CarDto dto = null;
        if (carOptional.isPresent()) {
            Car c = carOptional.get();
            File file = new File("src/main/resources/static/uploads/" + c.getPhoto());
            FileInputStream inputStream;
            try {
                inputStream = new FileInputStream(file);
                MultipartFile multiPhoto =
                        new MockMultipartFile("file", file.getName(), "text/plain",
                                org.apache.commons.io.IOUtils.toByteArray(inputStream));
                dto = new CarDto(c.getId(), c.getFuel(),c.getMfg(), c.getModel(),multiPhoto,
                        c.getSeat(), c.getPrice(), c.getBrand().getId());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            model.addAttribute("CARDTO", dto);
        } else {
            model.addAttribute("CARDTO",new CarDto());
        }
        model.addAttribute("ACTION","/updateOrAdd");
        return "carUpdate";
    }

    @RequestMapping("/delete/{id}")
    public String delete(ModelMap model, @PathVariable(name = "id")String id){
        carService.deleteById(id);
        model.addAttribute("LIST_CAR",carService.findAll());
        return "redirect:/list";
    }

    @RequestMapping("/delete/order/{id}")
    public String deleteOrder(ModelMap model, @PathVariable(name = "id")Long id){
        bookingService.deleteById(id);
        model.addAttribute("LIST_BOOK",bookingService.findAll());
        return "redirect:/booking-list";
    }


    @ModelAttribute(name = "BRAND")
    public List<Brand> getAllBrand(){
        return carService.findAllBrand();
    }

}
