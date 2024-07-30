package Lesson15;

import java.util.Objects;

public class Adress {
    public Adress(String country, String city) {
        this.country = country;
        this.city = city;
    }

    protected String country;
    protected String city;


    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object obj) {
        Adress o = (Adress) obj;
        return country.equals(o.country) && city.equals(o.city);
    }
}

