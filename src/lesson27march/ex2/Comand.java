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
    public int compareTo(Comand o) {
        int len = this.name.compareTo(o.name);
        if (len == 0) {
                return 0;
        }
        if (len > 0) {
            return 1;
        } else return -1;
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
    public String toString() {
        System.out.println(getName() + " " + getCountry() + " " + getGoal());
        return getName() + " " + getCountry() + " " + getGoal();
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

    static class sortName implements Comparator<Comand> {
        @Override
        public int compare(Comand o1, Comand o2) {
            int len = o1.name.compareTo(o2.name);
            if (len == 0) {
                return 0;
            }
            if (len > 0) {
                return 1;
            }
            return -1;
        }
    }

    static class sortGoal implements Comparator<Comand> {
        @Override
        public int compare(Comand o1, Comand o2) {
            int len = o1.goal - o2.goal;
            if (len == 0) {
                return 0;
            }
            if (len > 0) {
                return 1;
            }
            return -1;
        }
    }
    static class sortCount implements Comparator<Comand> {
        @Override
        public int compare(Comand o1, Comand o2) {
            int len = o1.country.compareTo(o2.country);
            if (len == 0) {
                return 0;
            }
            if (len > 0) {
                return 1;
            }
            return -1;
        }
    }
}

