package com.rakovets.course.java.core.practice.arrays;

import java.util.Arrays;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[] averageMark = getAverageMarks(marks);
        System.out.printf("Average mark: %s\n", Arrays.toString(averageMark));
        int[] minMark = getMinMarks(marks);
        System.out.printf("Min mark: %s\n", Arrays.toString(minMark));
        int[] maxMark = getMaxMarks(marks);
        System.out.printf("Max mark: %s\n", Arrays.toString(maxMark));
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMarks(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double[] averageMark=new double[marks.length];
        for (int i=0; i<marks.length; i++){
            int sumMarks=0;
            for (int j=0; j<marks[i].length; j++) {
                sumMarks = sumMarks + marks[i][j];
            }
            double averageMarkHelp = Math.round(((double) sumMarks / (double)marks[i].length)*100);
            averageMark[i]=averageMarkHelp/100;
        }
        return averageMark;
    }


    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int[] minMark=  new int[marks.length];
        for (int i=0; i<marks.length; i++) {
            int minMarks = marks[i][0];
            for (int j=1; j<marks[i].length; j++) {
                if (minMarks > marks[i][j]) {
                    minMarks = marks[i][j];
                }
            }
        minMark[i]=minMarks;
        }
        return minMark;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int[] maxMark=new int[marks.length];;
        for (int i=0; i<marks.length; i++) {
            int maxMarks = marks[i][0];
            for (int j=1; j<marks[i].length; j++) {
                if (maxMarks < marks[i][j]) {
                    maxMarks = marks[i][j];
                }
            }
            maxMark[i]=maxMarks;
        }
        return maxMark;
    }
}
