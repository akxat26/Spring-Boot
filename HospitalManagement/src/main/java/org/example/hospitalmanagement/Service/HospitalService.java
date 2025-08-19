package org.example.hospitalmanagement.Service;

import org.example.hospitalmanagement.DTO.Hospitaldto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalService {

    private final List<Hospitaldto> hospitaldtoList = new ArrayList<>();

    public HospitalService() {

        hospitaldtoList.add(new Hospitaldto(101, "Akshat", "Bareilly", "260902", 22));
        hospitaldtoList.add(new Hospitaldto(102, "Shreshtha", "Pilibhit", "121103", 21));
    }


    public Hospitaldto getHospitalDetails() {
        if (!hospitaldtoList.isEmpty()) {
            return hospitaldtoList.get(0);
        }
        return null;
    }


    public Hospitaldto getHospitalDetailsByID(Integer id) {
        for (Hospitaldto hs : hospitaldtoList) {
            if (hs.getId()==id) {
                return hs;
            }
        }
        return null;
    }


    public Hospitaldto addHospital(Hospitaldto hospitaldto) {
        hospitaldtoList.add(hospitaldto);
        return hospitaldto;
    }


    public List<Hospitaldto> getAllHospitals() {
        return hospitaldtoList;
    }
}
