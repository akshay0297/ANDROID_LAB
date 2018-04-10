package com.example.akshay.storingindatabase;

class customData {

    int image;
    String name, date;

    public customData(int image, String name, String date) {
        this.image = image;
        this.name = name;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }


}