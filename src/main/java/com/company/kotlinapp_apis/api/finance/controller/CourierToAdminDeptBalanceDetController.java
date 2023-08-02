package com.company.kotlinapp_apis.api.finance.controller;

import com.company.kotlinapp_apis.dto.finance.CourierToAdminDeptBalanceDetDto;
import com.company.kotlinapp_apis.service.impl.finance.CourierToAdminDeptBalanceDetImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courierToAdminDeptBalanceDet")

public class CourierToAdminDeptBalanceDetController {
    private final CourierToAdminDeptBalanceDetImpl service;

    public CourierToAdminDeptBalanceDetController(CourierToAdminDeptBalanceDetImpl service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<CourierToAdminDeptBalanceDetDto>> getAllCourierToAdminDeptBalance() {
        return ResponseEntity.ok(service.getAllCourierToAdminDeptBalanceDet());
    }

    @GetMapping("/{detId}")
    public ResponseEntity<CourierToAdminDeptBalanceDetDto> getCourierCurrentBalanceDetById(@PathVariable("detId") Long id) {
        CourierToAdminDeptBalanceDetDto det = service.getCourierToAdminDeptBalanceDetById(id);
        if (det != null) {
            return ResponseEntity.ok(det);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<CourierToAdminDeptBalanceDetDto> saveCourierCurrentBalanceDet(@RequestBody CourierToAdminDeptBalanceDetDto dto) {
        return ResponseEntity.ok(service.saveCourierToAdminDeptBalanceDet(dto));
    }

    @DeleteMapping("/{detId}")
    public ResponseEntity<String> deleteCourierCurrentBalanceDet(@PathVariable("detId") Long id) {
        Boolean deleted = service.deleteCourierToAdminDeptBalanceDetById(id);
        if (deleted) {
            return ResponseEntity.ok("CourierToAdminDeptBalanceDe deleted successfully");
        }
        return ResponseEntity.notFound().build();
    }
}
