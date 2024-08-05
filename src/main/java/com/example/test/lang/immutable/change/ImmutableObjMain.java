package com.example.test.lang.immutable.change;

public class ImmutableObjMain {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        //계산 후에도 기존값과 신규값 모두 확인 가능 *반환 값 꼭 받기!
        System.out.println("obj2 = " + obj2.getValue());
        System.out.println("obj1 = " + obj1.getValue());
    }
}
