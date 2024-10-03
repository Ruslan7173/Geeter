import javax.xml.catalog.Catalog;
//Создать абстрактный класс Animal с абстрактным методом run.
// Создать классы-наследники белка и крот.
//У каждого класса-наследника должна быть своя реализация метода run,
// а также свои поля, сеттеры, геттеры.
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Homyak", 3, "Withe");
//        hom1.setName("Homa");
//        hom1.setVes(-1);
//        System.out.println(hom1.getName());
//        System.out.println(hom1.getVes());
//        System.out.println(hom1.getColor());
//        hom1.begin();
    }
}

class Animal {
    private String name;
    private int ves;
    private String color;
    private String begin;
    private String begin1;
    private String begin2;
    private String begin3;

    public Animal (String name, int ves, String color ) {
        this.name = name;
        this.ves = ves;
        this.color = color;

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        if (ves >= 0) {
            this.ves = ves;
        } else {
            System.out.println(" нельзя задать отрицательный возраст");
        }

    }

    public String getColor() {
        return color;
    }

    void begin() {
        System.out.println("homa is begin");
    }

}

