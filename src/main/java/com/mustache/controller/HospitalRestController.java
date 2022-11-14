//package com.mustache.controller;
//
//import com.mustache.domain.entity.Hospital;
//import com.mustache.repository.HospitalRepository;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/v1/hospitals")
//public class HospitalRestController {
//    @GetMapping("/{id}")
//    public ResponseEntity<HospitlaResponse> get(@PathVariable Integer id){
//        this.hospitalRepository = HospitalRepository;
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<HospitalRespnse> get(@PathVariable Integer id){
//        Optional<Hospital> hospital = HospitalRepository.findById(id);
//        return ResponseEntity.ok()
//    }
//}
