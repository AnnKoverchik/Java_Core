package com.rakovets.course.java.core.practice.looping_statements;

/**
 * Разработать программу для бухгалтерии.
 * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом.
 * <p>
 * Например:
 * 1234567890 -> "1 234 567 890"
 *
 * @author Dmitry Rakovets
 */
class Task09 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        long amount = 1500L;

        String amountWithAccountingFormat = convertToAccountingFormat(amount);
        System.out.printf("Result: %s", amountWithAccountingFormat);
    }

    /**
     * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
     * пробелом.
     *
     * @param amount сумма
     * @return сумма в бухгалтерском формате
     */
    static String convertToAccountingFormat(long amount) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода

        String amountString = Long.toString(amount);
        char[] charArray = amountString.toCharArray();
        String amountWithAccountingFormat="";

        if ( charArray[0] == '-' ) {
            amountWithAccountingFormat=amountWithAccountingFormat+charArray[0];
            int numberPart=((charArray.length-1)%3);
            if (numberPart==0) {
                amountWithAccountingFormat=amountWithAccountingFormat+charArray[1] + charArray[2] + charArray[3];
                for (int i = 4; i < charArray.length; i=i+3) {
                    amountWithAccountingFormat = amountWithAccountingFormat+ " "+ charArray[i] + charArray[i + 1] + charArray[i + 2];
                }
            }else{ if (numberPart==1){
                     amountWithAccountingFormat = amountWithAccountingFormat + charArray[1];
                  }else{
                     amountWithAccountingFormat = amountWithAccountingFormat + charArray[1]+charArray[2];
            }
                for (int i = numberPart+1; i < charArray.length; i=i+3) {
                    amountWithAccountingFormat = amountWithAccountingFormat +" "+  charArray[i] + charArray[i + 1] + charArray[i + 2];

                }
            }
        }
        else {
            int numberPart=((charArray.length)%3);
            if (numberPart==0) {
                amountWithAccountingFormat=""+charArray[0] + charArray[1] + charArray[2];
                for (int i = 3; i < charArray.length; i=i+3) {
                    amountWithAccountingFormat = amountWithAccountingFormat +" "+ charArray[i] + charArray[i + 1] + charArray[i + 2];
                }
            }else{ if (numberPart==1){
                amountWithAccountingFormat = amountWithAccountingFormat + charArray[0];
            }else{
                amountWithAccountingFormat = amountWithAccountingFormat + charArray[0]+charArray[1];
            }
                for (int i = numberPart; i < charArray.length; i=i+3) {
                    amountWithAccountingFormat = amountWithAccountingFormat +" "+ charArray[i] + charArray[i + 1] + charArray[i + 2];

                }
            }
        }
        return amountWithAccountingFormat;
    }
}
