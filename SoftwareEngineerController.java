package com.SoftwareApplication.SA;


import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService service;

    public SoftwareEngineerController(SoftwareEngineerService service) {
        this.service = service;
    }

    @GetMapping
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return service.getAllSoftwareEngineers();
    }

    @GetMapping("/{id}")
    public SoftwareEngineer getSoftwareEngineerById(
            @PathVariable Integer id) {
        return service.getSoftwareEngineerById(id);
    }
}
