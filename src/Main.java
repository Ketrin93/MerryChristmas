public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний ");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать еще немного");
        }
        System.out.println("Task 2");
        int temperature = 7;
        if (temperature <= 5) {
            System.out.println("На улице холодно,нужно одеть шапку");
        } else {
            System.out.println("Сегодня тепло , можно идти без шапки");
        }
        System.out.println("Task 3");
        int speed = 80;
        if (speed >= 60) {
            System.out.println("Если скорость превышена,то придется заплатить штраф");
        } else {
            System.out.println("Если превышения скорости нет,то можно ездить спокойно");
        }
        System.out.println("Task 4");

        int institutionAge = 15;
        if (institutionAge > 2 && institutionAge <= 6) {
            System.out.println(" Если возраст человека равен 5, то ему нужно ходить в детский сад");
        }
        if (institutionAge > 7 && institutionAge <= 17) {
            System.out.println(" Если возраст человека равен 7 , то ему нужно ходить в школу");
        }
        if (institutionAge >= 18 && institutionAge <= 24) {
            System.out.println("  Если возраст человека равен 18 , то ему нужно ходить в университет");
        }
        if (institutionAge > 24) {
            System.out.println("  Если возраст человек равен 24, то ему пора ходить на работу");
        }
        System.out.println("Task 5");
        int childAge = 10;
        if (childAge < 5) {
            System.out.println(" Если возраст ребенка равен 5, то он не может кататься на аттракционе");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен 14, то он может кататься в сопровождении врзрослого");
        }
        if (childAge > 14) {
            System.out.println(" Если возраст ребенка больше 14 лет , то он может кататься без сопровождения взрослых");
        }
        System.out.println("Task 6");
        int occupiedSeats = 18;
        if (occupiedSeats < 60) {
            System.out.println("Есть сидячие места");
        }
        if (occupiedSeats > 60 && occupiedSeats <= 102) {
            System.out.println("Есть стоячие места ");
        } else {
            System.out.println("Вагон заполнен полностью");
        }

                System.out.println("Task 7");
                int one = 25;
                int two = 26;
                int three = 10;
                if (one > two && one < three) {
                    System.out.println("Число one больше числа two");
                } else {
                    System.out.println(" число one ,больше всех ");
                }

            }
        }




















