package com.capgemini.wardrobe.object;

public class Wardrobe {
    private String name = "";
    private Boolean isOpen;
    private int strength;
    private Boolean inside;
    private String status;

    public Wardrobe() {
    }

    public Wardrobe(String name) {
        this.name = name;
        this.strength = 100;
        this.isOpen = false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
