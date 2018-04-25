package com.capgemini.wardrobe.controller;


import com.capgemini.wardrobe.object.Wardrobe;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/wardrobe/")  //all mappings have this default prefix
public class WardrobeController {

   private Wardrobe wardrobe = new Wardrobe("");

    @GetMapping("{name}")  //allows you to put variable
    public String createWardrobe(@PathVariable String name) {
        name = wardrobe.getName();
        return name;
          }

    //localhost:80808/api/wardrobe/
    @PostMapping("/add")
    public Wardrobe wardrobe(Wardrobe wardrobe) {
        return wardrobe;
    }


    //openCloset
    @GetMapping("/open")
    public String openCloset(){
        if(wardrobe.getOpen()==false){
        wardrobe.setOpen(true);
        return "the wardrobe has been opened";}
        else{
            return "the wardrobe was already open";
        }
    }

    //closeCloset
    @GetMapping("/close")
    public String closeCloset(){
        if(wardrobe.getOpen() == true){
        wardrobe.setOpen(false);
        return "the wardrobe is closed";}
        else{
            return "The wardrobe was already closed";
        }

    }


    //go in closet
    @GetMapping("/enter")
    public String enter(){
        if(wardrobe.getOpen()==true){
            wardrobe.setInside(true);
            return "You have entered the closet";
        }
        else {
            return "You must open the closet in order to enter";
        }
    }

    //get out of closet
    @GetMapping("/exit")
    public String getOutOfCloset(){
        if(wardrobe.getInside() == true){
            wardrobe.setInside(false);
            return "you have left the closet";}
            else{return "you are not in the closet";}
        }

    @GetMapping("/kick")
    public String kickCloset(){
        if(wardrobe.getOpen()==false){
            int damage =  (int) (Math.random() * 100);
            wardrobe.setStrength(wardrobe.getStrength()-damage);
            return "The strength of the closet is now " + wardrobe.getStrength() + " percent";}
            else{ return"close the closet in order to kick it";

        }
   }


}
