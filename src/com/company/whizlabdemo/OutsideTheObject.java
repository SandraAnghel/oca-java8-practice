package com.company.whizlabdemo;

public class OutsideTheObject {
    private String myFieldOutside = "I am an object field";

    // read a field - getter
    public String getMyFieldOutside() {
        return myFieldOutside;
    }

    // write a field - setter
    public void setMyFieldOutside(String myFieldOutside) {
        this.myFieldOutside = myFieldOutside;
    }

}
