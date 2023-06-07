package com.ohgiraffers.section02.encapsulation;

public class Application3 {

    /* 수업목표. 접근제한자에 이해, 직접 필드에 접근하지 못하게 함. */
    /*
     * 설명.
     *  Monster 클래스의 필드를 private 접근제한자로 만들고 객체를 생성한 뒤 필드에 직접 접근 시
     *  comfile error 를 발생시킨다.
     *  private로 선언한 필드는 접근을 할 수 없게 만들고
     *  public 으로 선언한 method만 접근을 허용하여 코드의 안정성을 높인다.
     *  이것을 encapsulation(캡슐화) 라고 한다.
     *  */

    public static void main(String[] args) {

        Monster3 monster = new Monster3();
        monster.setKinds("훈 위");
        monster.setHp(100);

        System.out.println("monster.get = " + monster.getInfo());

    }
}