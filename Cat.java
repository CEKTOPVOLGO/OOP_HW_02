public class Cat extends Animal{
    private final String name;
    private final int age;
    /*
    Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции, упомянутые на семинаре. включающих:
    - интерфейсы,
    - константы,
    - default методы,
    - перегрузки и переопределения методов.Вы можете выбрать любой класс из ДЗ 1 и добавить к нему интерфейсы.
    Вам также предоставляется возможность добавить новые методы или использовать уже существующие методы в классе.
     */

    private int NUMOFLEGS = 4;
    private int SP = 15;
    private int EYE = 2;

    @Override
    public int numLegs() {
        return NUMOFLEGS;
    }
    @Override
    public int speed() {
        return SP;
    }
    @Override
    public String says() {
        return "Meow";
    }

    @Override
    public int eye() {
        return EYE;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void About(){
        System.out.println("Котика зовут: " + name + ". Возраст: " + age + ". Глаз: " + eye() + ". Лапок: " + numLegs() + ". Бегает со скоростью: " + speed() + " км/ч . Умеет говорить: " + says() + ".");
    }
}
