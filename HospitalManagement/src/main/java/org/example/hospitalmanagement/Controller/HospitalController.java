package org.example.hospitalmanagement.Controller;

import org.example.hospitalmanagement.DTO.Hospitaldto;
import org.example.hospitalmanagement.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hospitals")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/get")
    public Hospitaldto getHospitalDetails() {
        return hospitalService.getHospitalDetails();
    }

    @GetMapping("/{id}")
    public Hospitaldto getHospitalDetailsByID(@PathVariable Integer id) {
        return hospitalService.getHospitalDetailsByID(id);
    }

    @PostMapping("/add")
    public Hospitaldto addHospital(@RequestBody Hospitaldto hospitaldto) {
        return hospitalService.addHospital(hospitaldto);
    }

    @GetMapping
    public List<Hospitaldto> getAllHospitals() {
        return hospitalService.getAllHospitals();
    }
}
