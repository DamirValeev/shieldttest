package lesson27march.ex2;

import java.util.Comparator;

public class Comand implements Comparable<Comand> {
    String name;
    String country;
    String season;
    int goal;

    Comand(String name, String country, String season, int goal) {
        this.name = name;
        this.country = country;
        this.season = season;
        this.goal = goal;
    }

    @Override
    public int compareTo(Comand c) {
        if (this.name.compareTo(c.name) == 0) {
            return 0;
        }
        if (this.name.compareTo(c.name) < 0) {
            return -1;
        }
        if (this.country.compareTo(c.country) == 0) {
            return 0;
        }
        if (this.country.compareTo(c.country) < 0) {
            return -1;
        }
        if (this.goal==c.goal) {
            return 0;
        }
        if (this.goal<c.goal) {
            return -1;
        }
        return 1;


    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getGoal() {
        return goal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Comand)) {
            return false;
        }
        Comand c = (Comand) obj;
        if (!(this.name.equals(c.name))) {
            return false;
        }
        if (this.goal != c.goal) {
            return false;
        }
        if (!this.country.equals(c.country)) {
            return false;
        } else
            return true;
    }


}

