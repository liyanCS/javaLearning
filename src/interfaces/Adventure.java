package interfaces;

/**
 * @author Li Yan
 * implements多个接口
 * 使用接口的重要原因：能够向上转型为多种基类型
 * 第二个原因：防止客户端程序员创造接口的对象
 */
public class Adventure {
    public static void t(CanFight x) {x.fight();}
    public static void u(CanSwim x) {x.swim();}
    public static void v(CanFly x) {x.fly();}
    public static void w(ActionCharacter x) {x.fight();}

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
    }

}

interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

interface CanClimb{
    void climb();
}

class ActionCharacter{
    public void fight(){

    }
}

//组合ActionCharacter,CanFight,CanSwim,CanFly产生一个新类：Hero
//只能extends一个具体的类，但是可以implements多个接口
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb{
    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void climb() {

    }
}


