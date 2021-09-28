/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinecalendar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ChineCalendar {
    public static enum ANIMALS {
        Крысы, Быка, Тигра, Кролика, Дракона, Змеи, Лошади, Козы, Обезьяны, Петуха, Собаки, Свиньи
    }
    
    public static enum ELEMENT{
        Воздух_метал, Вода, Дерево_эфир, Огонь, Земля
    }
    public static enum COLOR {
        Синий, Черный, Зеленый, Красный, Желтый
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do{
            System.out.print("Введите год: ");
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            scanner.nextLine();
            String quit="";
            System.out.println("Год: "+ANIMALS.values()[((year - 1900) % 12)]);
            int numElement = year % 10;
            switch (numElement) {
                case 0:
                case 1:System.out.printf("Стихия: %s%nЦвет: %s", ELEMENT.values()[0], COLOR.values()[0]); break;
                case 2:
                case 3:System.out.printf("Стихия: %s%nЦвет: %s", ELEMENT.values()[1], COLOR.values()[1]); break;
                case 4:
                case 5:System.out.printf("Стихия: %s%nЦвет: %s", ELEMENT.values()[2], COLOR.values()[2]); break;
                case 6:
                case 7:System.out.printf("Стихия: %s%nЦвет: %s", ELEMENT.values()[3], COLOR.values()[3]); break;
                case 8:
                case 9:System.out.printf("Стихия: %s%nЦвет: %s", ELEMENT.values()[4], COLOR.values()[4]); break;
            }
            System.out.println();
            System.out.println("Чтобы выйти введите \"q\", продолжить введите любой другой символ");
            quit=scanner.nextLine();
            if(quit.equals("q")) break;
        }while(true);
    }
    
}
