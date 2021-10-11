package com.company;

public class Singelton {
    private static Singelton fragment;
    private String text;

    private Singelton() {
    }

    public static Singelton newInstance() {
        if (fragment == null)
            fragment = new Singelton();
        return fragment;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
