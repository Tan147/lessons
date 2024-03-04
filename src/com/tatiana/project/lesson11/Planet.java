package com.tatiana.project.lesson11;

public enum Planet {

    EARTH("earth", 15245847, 15478),
    MARS("mars", 5842571, 125469),
    MERCURY("mercury", 12547896, 2658);

    private String title;
    private long mass;
    private long radius;

    Planet(String title, long mass, long radius) {
        this.title = title;
        this.mass = mass;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return title + ", mass " + mass + ", radius " + radius;
    }
}
