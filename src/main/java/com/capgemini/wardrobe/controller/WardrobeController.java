package com.capgemini.wardrobe.controller;


import com.capgemini.wardrobe.object.Wardrobe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/wardrobe/")  //all mappings have this default prefix.
public class WardrobeController {

    private static ArrayList<Wardrobe> wardrobes = new ArrayList<>();


    @GetMapping("{name}")  //allows you to put variable
    public void createWardrobe(@PathVariable String name) {
        Wardrobe wardrobe = new Wardrobe(name);

        wardrobes.add(wardrobe);
    }


    //localhost:80808/api/wardrobe/
    @GetMapping("/")
    private ArrayList<Wardrobe> getAllWardrobes() {
        return wardrobes;
    }



}
