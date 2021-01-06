package JavaRush.Level14;

import java.util.ArrayList;
import java.util.List;


/*
Клининговый центр

В этой задаче тебе нужно:
Реализовать метод cleanAllApartments().
Пройтись по списку объектов apartments:
для однокомнатных квартир (OneRoomApt) вызвать метод clean1Room();
для двухкомнатных квартир (TwoRoomApt) вызвать метод clean2Rooms();
для трехкомнатных квартир (ThreeRoomApt) вызвать метод clean3Rooms().

Требования:
•	Метод cleanAllApartments должен принимать список аппартаметов в качестве параметра.
•	В методе cleanAllApartments для всех однокомнатных аппартаментов (OneRoomApt),
содержащихся в списке, необходимо вызвать метод clean1Room().
•	В методе cleanAllApartments для всех двухкомнатных аппартаментов (TwoRoomApt),
содержащихся в списке, необходимо вызвать метод clean2Rooms().
•	В методе cleanAllApartments для всех трехкомнатных аппартаментов (ThreeRoomApt),
содержащихся в списке, необходимо вызвать метод clean3Rooms().
•	Классы OneRoomApt, TwoRoomApt, ThreeRoomApt должны поддерживать (реализовывать) интерфейс Apartment.
*/

public class Solution8 {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        //написать тут вашу реализацию пунктов 1-4
        for (Apartment apt : apartments){
            if(apt instanceof OneRoomApt){
                ((OneRoomApt) apt).clean1Room();
            }
            if(apt instanceof TwoRoomApt){
                ((TwoRoomApt) apt).clean2Rooms();
            }
            if(apt instanceof ThreeRoomApt){
                ((ThreeRoomApt) apt).clean3Rooms();
            }
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}