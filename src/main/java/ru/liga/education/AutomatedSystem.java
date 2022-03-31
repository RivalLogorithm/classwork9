package ru.liga.education;

import java.util.ArrayList;
import java.util.List;

public class AutomatedSystem {
    private static List<Member> members = new ArrayList<>();

    public static void register(Member member) {
        System.out.println(member.getEyeColor() + " " + member.getHairColor());
        members.add(member);
    }

    public static List<Member> weedOutDeceivers() {
        List<Member> newMembers = new ArrayList<>();
        boolean notUnique;

//        for (int i=0; i<members.size() - 1; i++) {
//            System.out.print(members.get(i));
//            notUnique = false;
//            for (int j=i+1; j<members.size(); j++){
//                if(members.get(i).equals(members.get(j))) {
//                    notUnique = true;
//                    break;
//                }
//            }
//            if (notUnique) {
//                System.out.println(" не добавлен");
//            } else {
//                newMembers.add(members.get(i));
//                System.out.println(" добавлен");
//            }
//            System.out.println();
//        }
        return newMembers;
    }

    public static void showUniqueMembers(List<Member> members) {
        System.out.println(members.size());
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
