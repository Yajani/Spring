package com.spring.core.chap01;

public class EasternRestaurant implements Restaurant{

    //쉐프
    private Chef chef = new JannChef();
    //요리코스
    private Course course = new FrenchCourse();

    //요리를 주문하는 기능z
    public void order(){
        System.out.println(" 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();

    }

}