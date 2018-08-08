package access.exercise.local;

/**
 * @author Li Yan
 * 创建一个带有public,private,protected和包访问权限域以及方法成员的类。
 * 创建该类的一个对象，看看在你试图调用所有类成员时，会得到什么类型的编译信息。
 * 请注意，处于同一个目录中的所有类都是默认包的一部分。
 */
public class Exercise5_SamePackage {
    public Exercise5_SamePackage(){
        Exercise5 exercise5 = new Exercise5();
        exercise5.a = 1;
       // exercise5.b =2;
        exercise5.c =3;
        exercise5.d =4;

        exercise5.f1();
        //exercise5.f2();
        exercise5.f3();
        exercise5.f4();
    }
}
