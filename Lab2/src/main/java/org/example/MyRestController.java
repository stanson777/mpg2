package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRestController {
    private MyRestService myRestService;

    @Autowired
    public MyRestController(MyRestService myRestService) {
        this.myRestService = myRestService;
    }

    @GetMapping("Cat/all")
    public List<Cat> getAllCats() {
        return this.myRestService.getCatList();
    }
    @PostMapping("Cat")
    public void addCat(@RequestBody Cat cat) {
        this.myRestService.addCat(cat);
    }
    @DeleteMapping("Cat/{name}")
    public void deleteCat(@PathVariable String name) {
        this.myRestService.deleteCat(name);
    }
    @PutMapping("Cat/{id}")
    public void updateCat(@PathVariable int id, @RequestBody Cat cat) {
        this.myRestService.updateCat(id, cat);
    }

}
