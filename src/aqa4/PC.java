package aqa4;

public class PC {


    //   Конструктор на 4 параметра
    String processor;
    String ram;
    String hd;
    int limit;

    PC(String processorPC, String ramPC, String hdPC, int limitPC) {
        processor = processorPC;
        ram = ramPC;
        hd = hdPC;
        limit = limitPC;
    }

//    Метод описания

    void displayInfo() {
        System.out.println("Processor " + processor);
        System.out.println("Ram " + ram);
        System.out.println("HD " + hd);
        System.out.println("Limit " + limit);
    }

//    Метод вкл

    boolean killed = false;

    boolean On(int OnParametr) {

        int OnInteger = ((int) (Math.random() * 2));

        if (killed == false) {

            if (OnParametr == OnInteger) {
                System.out.println(OnInteger + " Комп включен");
            } else {
                System.out.println("Комп сгорел");
                killed = true;
            }
        } else System.out.println("Комп сгорел давно");

        return killed;
    }

//    Метод выкл
    
    boolean Off(int OffParametr) {

        int OffInteger = ((int) (Math.random() * 2));

        if (killed == false) {

            if (OffParametr == OffInteger) {
                System.out.println(OffInteger + " Комп выключен");
            } else {
                System.out.println("Комп сгорел");
                killed = true;
            }
        } else System.out.println("Комп сгорел давно");

        return killed;
    }


}
