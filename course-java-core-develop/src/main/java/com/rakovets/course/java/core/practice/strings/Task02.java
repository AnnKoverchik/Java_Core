package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;

/**
 * Разработать программу для разбора (parsing) банковских отчетов.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task02 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        //String bankReport = "Remaining 10$  12$ essentially 13$ unchanged.";
        String bankReport= "since the 1500s when  of type11$ and remaining 10$  12$ essentially 13$ unchanged. the 1960s with  Lorem";

        double[] moneyFromReport = getArrayMoneyFromReport(bankReport);
        System.out.printf("Money from the report: %s\n", Arrays.toString(moneyFromReport));
        double sumMoneyFromReport = getSumMoneyFromReport(bankReport);
        System.out.printf("Sum money from the report: %s\n", sumMoneyFromReport);
    }

    /**
     * Возвращает список сумм, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return список сумм
     */
    static double[] getArrayMoneyFromReport(String report) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода

        String[] items = report.split(" ");
        double[] results=new double[items.length];
        int i=0;
        for (String item : items) {
          if((item.length()>1)&&(item.charAt(item.length()-1)=='$')&&(isNumeric(item))&&(item!=" ")) {
               results[i]=Double.parseDouble(item.substring(0,item.length()-1));
               i++;
            }
        }
        double[] finishResult=new double[i];
        for (int j=0; j<i; j++){
            finishResult[j]=results[j];
        }
        return finishResult;
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str.substring(0,str.length()-1));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double[] money=getArrayMoneyFromReport(report);
        double sumMoney=0.00;
        for (double m:money){
           sumMoney=sumMoney+m;
        }
        return sumMoney;
    }
}
