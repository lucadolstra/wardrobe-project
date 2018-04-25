package com.capgemini.wardrobe.object;

public class Wardrobe {
    private String name;
    private Boolean isOpen;
    private int strength;
    private Boolean inside;

    public Wardrobe() {
    }

    public Wardrobe(String name, Boolean isOpen, int strength) {
        this.name = name;
        this.isOpen = false;
        this.strength = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setOpen(Boolean isOpen) {
        isOpen = isOpen;
    }


    public Boolean getOpen() {
        return isOpen;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Boolean getInside() {
        return inside;
    }

    public void setInside(Boolean inside) {
        this.inside = inside;
    }
}
