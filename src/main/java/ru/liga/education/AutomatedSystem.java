package ru.liga.education;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutomatedSystem {
    @Getter
    private static List<Member> members = new ArrayList<>();

    public static void register(Member member) {
        System.out.println(member.getEyeColor() + " " + member.getHairColor());
        members.add(member);
    }

    public static void weedOutDeceivers() {
        List<Member> newMembers = new ArrayList<>();
        boolean notUnique;
        for (int i=0; i< members.size()-1; i++) {
            System.out.print(members.get(i));
            notUnique = false;
            for (int j=i+1; j < members.size(); j++) {
                if (i != j) {
                    if(members.get(i).equals(members.get(j))) {
                        notUnique = true;
                        break;
                    }
                }
            }
            if (notUnique) {
                System.out.println(" not added");
            } else {
                newMembers.add(members.get(i));
                System.out.println(" added");
                if (i == members.size() - 2) {
                    System.out.print(members.get(i+1));
                    newMembers.add(members.get(i+1));
                    System.out.println(" added");
                }
            }
        }
        members = newMembers;
    }

    public static void showUniqueMembers() {
        System.out.println(members.size());
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public static void moneyPrize(Member member) {

    }
}
