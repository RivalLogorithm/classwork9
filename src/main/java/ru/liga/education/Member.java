package ru.liga.education;

import lombok.Getter;

import java.util.List;

@Getter

public class Member {
    private String surname;
    private String name;
    private String patronymic;
    private String eyeColor;
    private String hairColor;
    private Passport passport = new Passport();

    public Member(String surname, String name, String patronymic, String eyeColor, String hairColor, List<Integer> series, List<Integer> number) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.passport.series = series;
        this.passport.number = number;
    }

    @Override
    public String toString() {
        return "Member{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", passport=" + passport.series + " " + passport.number + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Member)) {
            return false;
        }

        final Member objMember = (Member) obj;

        if (this.passport == null ? objMember.passport != null : !this.passport.equals(objMember.passport)) {
            return false;
        }

        if (this.name == objMember.name && this.surname == objMember.surname && this.patronymic == objMember.patronymic) {
            return true;
        }
        return false;
    }
}
