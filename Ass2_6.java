class Person{

    public void talk()
    {
        System.out.println("He can talk.");
    }
    public void walk()
    {
        System.out.println("He can walk.");
    }
    public void eat(){
        System.out.println("He can eat.");
    }
}

class MathTeacher extends Person{

    public void tachMath()
        {
            System.out.println("He can teach maths.");
        }
    
}
class FootBaller extends Person{
    public void playFootBall(){
        System.out.println("He can play football.");
    }
}

class Buisnessman extends Person{
    public void doBuisness()
    {
        System.out.println("He can do buisness.");
    }
}

class Ass2_6{
    public static void main(String[] args) {

        MathTeacher teacher=new MathTeacher();
        teacher.eat();
        teacher.walk();
        teacher.talk();
        teacher.tachMath();

        Buisnessman man=new Buisnessman();
        man.eat();
        man.walk();
        man.talk();
        man.doBuisness();

        FootBaller footBaller=new FootBaller();
        footBaller.eat();
        footBaller.walk();
        footBaller.talk();
        footBaller.playFootBall();
    }
}
