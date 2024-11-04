package com.example.ecommerceapp.model;

public class Category {
    private String name,icon,color,brief;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrief() {
        return brief;
    }

    public Category(String name, String color, String icon,int id, String brief){
        this.brief = brief;
        this.color = color;
        this.icon = icon;
        this.id = id;
        this.name = name;
    }

    public void setBrief(String brief) {this.brief = brief ;}

    public String getColor() {return color;}

    public void setColor(String color) {
        this.color = color;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
