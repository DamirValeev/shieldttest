package lesson27march.ex2;

import java.util.Comparator;

public class Comand implements Comparable{
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
    public int compareTo(Object o) {
        if (this.equals(o)){
            return 0;
        }
        else return 1;
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
        if (this==obj) {
            return true;
        }
        if (!(obj instanceof Comand)) {
            return false;
        }
        Comand c = (Comand)obj;
        if (!(this.name.equals(c.name))) {
            return false;
        }
        if (this.goal!=c.goal) {
            return false;
        }
        if (!this.country.equals(c.country)){
            return false;
        }else
            return true;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 17 + this.name.hashCode();
        hash = hash * 31 + this.country.hashCode();
        return hash;
    }
}
class ComComp implements Comparator<Comand> {
    @Override
    public int compare(Comand o1, Comand o2) {
        if (o1.goal==o2.goal) {
            return 0;
        }
        if (o1.goal>o2.goal) {
            return 1;
        }
        else return -1;
    }
}
