package com.capgemini.wardrobe.object;

public class Wardrobe {
    private String name;
    private Boolean isOpen;

    public Wardrobe() {
    }

    public Wardrobe(String name, Boolean isOpen) {
        this.name = name;
        this.isOpen = false;
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
}
