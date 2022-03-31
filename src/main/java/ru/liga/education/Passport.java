package ru.liga.education;


import java.util.List;


public class Passport {
    protected List<Integer> series;
    protected List<Integer> number;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Passport)) {
            return false;
        }

        Passport objPassport = (Passport) obj;

        if (this.series == objPassport.series && this.number == objPassport.number) {
            return true;
        }
        return false;
    }
}
