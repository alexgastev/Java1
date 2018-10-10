package java_one.homework4;

public class MainClass {
    public static void main(String[] args) {
        Sotrudnik s1 = new Sotrudnik ("A.A.Gastev", 15000, 93);

        //    Вывести в консоль при помощи методов из пункта 3 ФИО и возраст.

        System.out.println("FIO: " + s1.getFIO() + ", vozrast: " + s1.getVozrast());

        //    Создать массив из 5 сотрудников. С помощью цикла вывести информацию
        // только о сотрудниках старше 40 лет;

        Sotrudnik[] ponabraliSotrudnikov = new Sotrudnik[5];
        ponabraliSotrudnikov[0] = new Sotrudnik("A.B.Chitov", 11000, 48);
        ponabraliSotrudnikov[1] = new Sotrudnik("C.D.Dritov", 19000, 41);
        ponabraliSotrudnikov[2] = new Sotrudnik("E.F.Cheetoff", 9000, 35);
        ponabraliSotrudnikov[3] = new Sotrudnik("G.J.Margaritov", 38000, 21);
        ponabraliSotrudnikov[4] = new Sotrudnik("K.L.Vah", 24000, 64);

        for (int i = 0; i < ponabraliSotrudnikov.length; i++) {
            if (ponabraliSotrudnikov[i].getVozrast() > 40) {
                System.out.println(ponabraliSotrudnikov[i].getFIO()
                        + " zp: " + ponabraliSotrudnikov[i].getZarplata()
                        + " let: " + ponabraliSotrudnikov[i].getVozrast());
            }
        }

        // proverka po 6-y zadache:
        System.out.println("novaya ZP Chitova: " + ponabraliSotrudnikov[0].getDopZP());
        System.out.println("novaya ZP Dritova: " + ponabraliSotrudnikov[1].getDopZP());

        //            ** Написать методы (принимающие на вход массив сотрудников),
        // вычисляющие средний возраст и среднюю зарплату сотрудников, вывести результаты работы в консоль.

        // не разобрался, как в метод массив из сотрудников запихнуть

    }
}
