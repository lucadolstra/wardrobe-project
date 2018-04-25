package com.capgemini.wardrobe.controller;


import com.capgemini.wardrobe.object.Wardrobe;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/wardrobe/")  //all mappings have this default prefix
public class WardrobeController {

   private Wardrobe wardrobe = new Wardrobe("", false, 100, false);

   //, @PathVariable int health, @PathVariable Boolean inside

    @GetMapping("{name}")  //allows you to put variable
    public void createWardrobe(@PathVariable String name, @PathVariable Boolean isOpen) {
        name = wardrobe.getName();
        isOpen = wardrobe.getOpen();
//        health = wardrobe.getHealth();
//        inside = wardrobe.getInside();

          }

    //localhost:80808/api/wardrobe/
    @PostMapping("/add")
    public Wardrobe wardrobe(Wardrobe wardrobe) {
        return wardrobe;
    }


    //openCloset
    @GetMapping("/open")
    public Boolean openCloset(){
        if(wardrobe.getOpen()==false){
        wardrobe.setOpen(true);
        Boolean open = true;
        return open;}
        //return "the wardrobe has been opened";}
        else{Boolean open = false;
        return open;
          //  return "the wardrobe was already open";
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
            int chance = (int) (Math.random() * 50);
            if (chance == 1){
                wardrobe.setInNarnia(true);
                return "you have entered Narnia";
            }
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
            wardrobe.setHealth(wardrobe.getHealth()-damage);
            return "The strength of the closet is now " + wardrobe.getHealth() + " percent";}
            if(wardrobe.getHealth()<= 20){
            return "The closet is broken";
            }
            else{ return"close the closet in order to kick it";

        }
   }

   @GetMapping("/kick2")
   public String kickCloset2() {
       if (wardrobe.getOpen() == false) {
           int change = (int) (Math.random() * 10);
           if (change == 1) {
               return "The housekeeper has caught you! Timeout";
           } else return "You got away with it";
       } else {
           return "close the closet in order to kick it";

       }
   }

   @GetMapping("/delete")
    public String deleteCloset(){

            return "The Closet has been removed";
        }

   }



