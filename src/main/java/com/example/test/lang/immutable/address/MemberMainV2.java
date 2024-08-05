package com.example.test.lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        //ImmutableAddress address2 = new ImmutableAddress("부산");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.setAddress(new ImmutableAddress("부산"));

        System.out.println("회원B -> 부산");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
