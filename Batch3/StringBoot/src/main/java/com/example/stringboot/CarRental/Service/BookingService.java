package com.example.stringboot.CarRental.Service;

import com.example.stringboot.CarRental.Model.*;

import java.util.List;
import java.util.Optional;

public interface BookingService {

    List<Car> findAllCar();

    List<Deposit> findAllDeposit();

    List<Equipment> findAllEquipment();

    List<Insurance> findAllInsurance();

    List<Location> findAllLocation();

    List<Payment> findAllPayment();

    void save(Booking booking);

    List<Booking> saveAll(List<Booking> entities);

    Optional<Booking> findById(Long id);

    boolean existsById(Long id);

    List<Booking> findAll();

    List<Booking> findAllById(List<Long> ids);

    long count();

    void deleteById(Long id);

    void delete(Booking entity);

    void deleteAll(List<Booking> entities);

    void deleteAll();
}
