package com.ohgiraffers.section02.encapsulation;

public class Monster3 {

    private String kinds;
    private int hp;

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getInfo() {

        return "몬스터의 종류는 : " + this.kinds + "이고, hp는 : " + this.hp + "입니다.";
    }
}
