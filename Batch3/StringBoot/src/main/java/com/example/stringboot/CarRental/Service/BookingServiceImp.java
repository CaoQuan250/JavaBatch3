package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Model.*;
import com.example.stringboot.CarRental.Rep.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImp implements BookingService{

    @Autowired
    BooingRep bookingRep;

    @Autowired
    CarRep carRep;

    @Autowired
    DepositRep depositRep;

    @Autowired
    EquipmentRep equipmentRep;

    @Autowired
    InsuranceRep insuranceRep;

    @Autowired
    LocationRep locationRep;

    @Autowired
    PaymentRep paymentRep;

    @Override
    public List<Car> findAllCar() {
        return (List<Car>) carRep.findAll();
    }

    @Override
    public List<Deposit> findAllDeposit() {
        return (List<Deposit>) depositRep.findAll();
    }

    @Override
    public List<Equipment> findAllEquipment() {
        return (List<Equipment>) equipmentRep.findAll();
    }

    @Override
    public List<Insurance> findAllInsurance() {
        return (List<Insurance>) insuranceRep.findAll();
    }

    @Override
    public List<Location> findAllLocation() {
        return (List<Location>) locationRep.findAll();
    }

    @Override
    public List<Payment> findAllPayment() {
        return (List<Payment>) paymentRep.findAll();
    }

    @Override
    public void save(Booking booking) {
        bookingRep.save(booking);
    }

    @Override
    public List<Booking> saveAll(List<Booking> entities) {
        return (List<Booking>) bookingRep.saveAll(entities);
    }

    @Override
    public Optional<Booking> findById(Long id) {
        return bookingRep.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return bookingRep.existsById(id);
    }

    @Override
    public List<Booking> findAll() {
        return (List<Booking>) bookingRep.findAll();
    }

    @Override
    public List<Booking> findAllById(List<Long> ids) {
        return (List<Booking>) bookingRep.findAllById(ids);
    }

    @Override
    public long count() {
        return bookingRep.count();
    }

    @Override
    public void deleteById(Long id) {
        bookingRep.deleteById(id);

    }

    @Override
    public void delete(Booking entity) {
        bookingRep.delete(entity);
    }

    @Override
    public void deleteAll(List<Booking> entities) {
        bookingRep.deleteAll(entities);

    }

    @Override
    public void deleteAll() {
        bookingRep.deleteAll();
    }
}
