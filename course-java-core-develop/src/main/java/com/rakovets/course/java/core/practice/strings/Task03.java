package com.rakovets.course.java.core.practice.strings;

import com.rakovets.course.java.core.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для разбора (parsing) информации о персонале компании.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task03 extends StandardInputTask {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        String informationAboutStuff = INPUT_SCANNER.nextLine();

        String[] names = parseToArrayName(informationAboutStuff);
        System.out.printf("Names: %s\n", Arrays.toString(names));
        String[] surnames = parseToArraySurname(informationAboutStuff);
        System.out.printf("Surnames: %s\n", Arrays.toString(surnames));
        int[] salaries = parseToArraySalary(informationAboutStuff);
        System.out.printf("Salaries: %s\n", Arrays.toString(salaries));
    }

    /**
     * Возвращает массив имен персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив имен персонала, где каждый элемент является именем одного сотрудника
     */
    static String[][] parseInfoPeople (String informationAboutStuff) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String [] infoPeople=informationAboutStuff.trim().replaceAll("( )\\1+", "$1").split(";");
        String [] [] parseInfoPeople=new String[infoPeople.length][3];
        for (int i=0; i<infoPeople.length;i++){
            parseInfoPeople[i]=infoPeople[i].split(" ");
        }
        return parseInfoPeople;
    }

    static String[] parseToArrayName(String informationAboutStuff) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String [] [] parseInfoPeople=parseInfoPeople(informationAboutStuff);
        String[] arrayName = new String[parseInfoPeople.length];
        for (int i=0; i<parseInfoPeople.length;i++) {
            arrayName[i] = parseInfoPeople[i][0];
        }
        return arrayName;
    }

    /**
     * Возвращает массив фамилий персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив фамилий персонала, где каждый элемент является фамилией одного сотрудника
     */
    static String[] parseToArraySurname(String informationAboutStuff) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String [] [] parseInfoPeople=parseInfoPeople(informationAboutStuff);
        String[] arraySurname = new String[parseInfoPeople.length];
        for (int i=0; i<parseInfoPeople.length;i++) {
            arraySurname[i] = parseInfoPeople[i][1];
        }
        return arraySurname;

    }

    /**
     * Возвращает массив зарплат персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив зарплат персонала, где каждый элемент является зарплатой одного сотрудника
     */
    static int[] parseToArraySalary(String informationAboutStuff) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String [] [] parseInfoPeople=parseInfoPeople(informationAboutStuff);
        int[] arraySalary = new int[parseInfoPeople.length];
        for (int i=0; i<parseInfoPeople.length;i++) {
            arraySalary[i] = Integer.parseInt(parseInfoPeople[i][2]);
        }
        return arraySalary;
    }
}
