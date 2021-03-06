package com.example.asynctaskrestjson.data;


public class DataObject {
    public Image image;
    public String name;
    public String premiered;

    DataObject(Image image, String name, String premiered){
        this.image = image;
        this.name = name;
        this.premiered = premiered;
    }

    @Override
    public String toString(){

        return String.format("\nImage: " + image +
                "\nName: " +  name +
                "\nPremiered: " + premiered);
    }
}

