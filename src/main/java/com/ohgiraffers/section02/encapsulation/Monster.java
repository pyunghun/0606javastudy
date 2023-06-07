package com.ohgiraffers.section02.encapsulation;

public class Monster {

    /* 목차. 1. 필드로 목스터의 이름과 체력을 저장할 공간을 선언. */

    String name;
    int hp;

    public void setHp(int hp) {
        if(hp > 0) {

            System.out.println("양수의 값이 입력되어 정상적으로 출력합니다");
            this.hp = hp;
        } else {

            System.out.println("체력은 음수가 될 수 없습니다. 따라서 0으로 설정합니다.");
            this.hp = 0;
        }
    }

    public void setName(String name) {

        if(name == "훈 위") {

            System.out.println("훈위 이름 잘 지었네..");
            this.name = name;
        } else {

            System.out.println("이름 조금 아쉽네...");
            this.name = name;
        }
    }

}
