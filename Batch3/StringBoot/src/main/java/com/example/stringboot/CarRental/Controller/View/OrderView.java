package com.example.stringboot.CarRental.Controller.View;

import com.example.stringboot.CarRental.Model.*;
import com.example.stringboot.CarRental.Service.BookingService;
import com.example.stringboot.CarRental.Service.CustomerService;
import com.example.stringboot.CarRental.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class OrderView {

    @Autowired
    BookingService bookingService;

    @Autowired
    UserService userService;

    @Autowired
    CustomerService customerService;

    @RequestMapping("/bookingList")
    public String listBooking(ModelMap model){
        model.addAttribute("LIST_CAR",bookingService.findAll());
        return "redirect:/index";
    }
    @GetMapping("/add-info")
    public String addInfo(Model model){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Users users = userService.findByUsername(username);
        Customer customer = customerService.findById(users.getCustomer().getId()).get();
        model.addAttribute("INFO",customer);
        model.addAttribute("CUSTOMER","/info-add");
        return "customer";
    }
    @PostMapping("/info-add")
    public String addCustomer(@Valid Customer customer,
                              BindingResult bindingResult){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Users users = userService.findByUsername(username);
        customer.setId(users.getCustomer().getId());
        customerService.saveCustomer(customer);
        return "redirect:/add-booking";
    }


    @GetMapping("/add-booking")
    public String addBook(ModelMap model){
        Booking booking = new Booking();
        model.addAttribute("BOOK",booking);
        model.addAttribute("BOOKING","/booking-add");
        return "booking";
    }
    @PostMapping("/booking-add")
    public String addBooking(@Valid Booking booking,
                             BindingResult bindingResult){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        Users users = userService.findByUsername(username);
        String status = "In book";
        booking.setCustomer(users.getCustomer());
        booking.setStatus(status);
        bookingService.save(booking);
        return "redirect:/bookingList";
    }

    @ModelAttribute(name = "CAR")
    public List<Car> getAllCar(){
        return bookingService.findAllCar();
    }

    @ModelAttribute(name = "DEPOSIT")
    public List<Deposit> getAllDeposit(){
        return bookingService.findAllDeposit();
    }

    @ModelAttribute(name = "INSURANCE")
    public List<Insurance> getAllInsurance(){
        return bookingService.findAllInsurance();
    }

    @ModelAttribute(name = "LOCATION")
    public List<Location> getAllLocation(){
        return bookingService.findAllLocation();
    }

    @ModelAttribute(name = "PAYMENT")
    public List<Payment> getAllPayment(){
        return bookingService.findAllPayment();
    }

    @ModelAttribute(name = "EQUIPMENT")
    public List<Equipment> getAllEquipment(){
        return bookingService.findAllEquipment();
    }
}
