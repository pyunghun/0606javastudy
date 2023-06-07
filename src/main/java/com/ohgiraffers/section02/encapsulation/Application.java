package com.ohgiraffers.section02.encapsulation;

public class Application {

    public static void main(String[] args) {
        
        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해 */
        
        Monster monster1 = new Monster();
        
        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);

        System.out.println();

        Monster monster2 = new Monster();

        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);

        System.out.println();

        // 위에 값들은 필드에 선언 한 값으로 옳지 않은 결과를 넣었을 떄
        // 그 옳지 않는 값들이 검증 없이 변수에 대입되는 것을 알 수 있다.
        
        Monster monster3 = new Monster();
        
        monster3.setName("훈 위");
        monster3.setHp(200);

        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);
        
        // 위에처럼 메소드를 통해서 객체의 hp 값을 변경할 수 있다.
        // 음수의 값을 넣었을 때 어떻게 하는 지 monster4를 통해 확인

        System.out.println();

        Monster monster4 = new Monster();
        
        monster4.setName("몬수타");
        monster4.setHp(-2000);

        System.out.println("monster4.name = " + monster4.name);
        System.out.println("monster4.hp = " + monster4.hp);
    }
}
