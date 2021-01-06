package JavaRush.Level13;

public class Solution8 {

    /*
Будущий управленец

Добавь интерфейсы Secretary и Boss к классам Manager и Subordinate.
По одному на каждый. Подумай, кому какой.
Унаследуй интерфейсы Secretary и Boss от интерфейсов Person и
HasManagementPotential так, чтобы все методы у классов Manager и
Subordinate были объявлены в каком-то интерфейсе.

Требования:
Класс Manager должен реализовывать подходящий ему интерфейс (Secretary или Boss).
Класс Subordinate должен реализовывать подходящий ему интерфейс (Secretary или Boss).
Секретарь (Secretary) является человеком (Person).
Начальник (Boss) является человеком (Person), который может заставить
других усердно работать (HasManagementPotential).

*/


        public static void main(String[] args) throws Exception {
        }

        interface Person extends HasManagementPotential{
            void use(Person person);

            void startToWork();

            boolean inspiresOthersToWork();
        }

        interface HasManagementPotential {
            boolean inspiresOthersToWork();
        }

        interface Secretary extends Person{
        }

        interface Boss extends HasManagementPotential, Person{
        }

        class Manager implements Boss{

            public void use(Person person) {
                person.startToWork();
            }

            public void startToWork() {
            }

            public boolean inspiresOthersToWork() {
                return true;
            }
        }

        class Subordinate implements Secretary{
            public void use(Person person) {
            }

            public void startToWork() {
            }

            @Override
            public boolean inspiresOthersToWork() {
                return false;
            }
        }
    }
