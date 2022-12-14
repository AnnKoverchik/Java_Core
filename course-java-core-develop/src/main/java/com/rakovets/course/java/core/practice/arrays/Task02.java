package com.rakovets.course.java.core.practice.arrays;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 */
class Task02 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);
    }

    /**
     * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double averageMark=0.00;
        int countMarks=0;
        int sumMarks=0;
        for (int i=0; i<marks.length; i++) {
            countMarks=countMarks+marks[i].length;
            for (int j=0; j<marks[i].length; j++) {
            sumMarks = sumMarks + marks[i][j];
        }
        }
        averageMark = Math.round(((double) sumMarks / (double)countMarks)*100);
        return averageMark/100;
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int minMarks=marks[0][0];
        for (int i=0; i<marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (minMarks > marks[i][j]) {
                    minMarks = marks[i][j];
                }
            }
        }
        return minMarks;
    }

    /**
     * Возвращает максимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int maxMarks=marks[0][0];
        for (int i=0; i<marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (maxMarks < marks[i][j]) {
                    maxMarks = marks[i][j];
                }
            }
        }
        return maxMarks;
    }
}
