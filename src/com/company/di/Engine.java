package com.company.di;

public class Engine {
    private Slindr slindr;
    private Sveca sveca;

    public Engine(Slindr slindr, Sveca sveca) {
        this.slindr = slindr;
        this.sveca = sveca;
    }
}
