package com.capgemini.wardrobe.controller;


import com.capgemini.wardrobe.object.Wardrobe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/wardrobe/")  //all mappings have this default prefix
public class WardrobeController {

    private static Wardrobe wardrobe;

    @GetMapping("{name}")  //allows you to put variable
    public void createWardrobe(@PathVariable String name, @PathVariable Boolean isOpen, @PathVariable int strength) {
        this.wardrobe = new Wardrobe(name, isOpen, strength);
    }

    //localhost:80808/api/wardrobe/
    @GetMapping("/")
    public Wardrobe getAllWardrobes() {
        return wardrobe;
    }


    //openCloset
    @GetMapping("/")
    public void openCloset(){
        wardrobe.setOpen(true);
    }

    //closeCloset
    @GetMapping("/")
    public void closeCloset(){
        wardrobe.setOpen(false);
    }


    //go in closet
    @GetMapping("/")
    public void goInCloset(){
        if(wardrobe.getOpen()==true && wardrobe.getInside()==true){
            wardrobe.setInside(true);
        }
    }

    //get out of closet
    @GetMapping("/")
    public void getOutOfCloset(){
        if(wardrobe.getInside() == true){
        wardrobe.setInside(false);
    }}

//    @GetMapping("/")
//    public void kickCloset(){
//        if(wardrobe.getIsOpen()==false){
//            int damage =  (int) (Math.random() * 100);
//            this.wardrobe.getStrength() = wardrobe.getStrength()-damage;
//            if (wardrobe.getStrength() <= 0){
//                createWardrobe(int name, boolean isOpen, strength);
//            }
//        }
//    }
//
//
//


}






