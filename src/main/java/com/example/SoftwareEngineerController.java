package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

        private final SoftwareEngineerService softwareEngineerService;

        public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getAllSoftwareEngineers();
    }
    @GetMapping(value = "{id}")
    public SoftwareEngineer getEngineersById( @PathVariable Integer id){
        return softwareEngineerService.getSoftwareEngineersById(id);
    }
    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer){
            softwareEngineerService.insertSoftwareEngineer(softwareEngineer);;
    }
    @DeleteMapping(value = "{id}")
    public void deleteSoftwareEngineerById(@PathVariable Integer id){
        softwareEngineerService.deleteSoftwareEngineerById(id);;
    }
    @PutMapping(value = "{id}")
    public void updateSoftwareEngineerById(@RequestBody SoftwareEngineer softwareEngineer, @PathVariable Integer id){
        softwareEngineerService.updateSoftwareEngineerById(softwareEngineer, id);;
    }
}
