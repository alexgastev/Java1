package java_one.homework4;


//    Создать класс "Сотрудник" с полями: ФИО,зарплата, возраст;
public class Sotrudnik {
    String FIO;
    int zarplata;
    int vozrast;

    //    Конструктор класса должен заполнять эти поля при создании объекта;
    Sotrudnik(String FIO, int zarplata, int vozrast) {
        this.FIO = FIO;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
    }

    //    Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    String getFIO() {
        return this.FIO;
    }
    int getZarplata() {
        return this.zarplata;
    }
    int getVozrast() {
        return this.vozrast;
    }

    //* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.

    int getDopZP() {
        if (vozrast > 45) {
            return zarplata + 5000;
        }
        return zarplata;
    }

}
