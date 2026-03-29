//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        // Создаем входной массив с выплатами авторам контента
        int[] inputArray1 = {15000, 20000, 12000, 18000, 25000};

        // Определяем переменные для суммы, максимума и минимума
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];

        // Проходим по массиву для расчета суммы, максимума и минимума
        for (int value : inputArray1) {
            sum += value;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        // Рассчитываем среднее значение
        double average = (double) sum / inputArray1.length;

        // Создаем выходной массив с результатами: [сумма, максимум, минимум, среднее]
        double[] outputArray1 = {sum, max, min, average};

        // Выводим входной и выходной массивы
        System.out.println("inputArray1: " + java.util.Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + java.util.Arrays.toString(outputArray1));

        // Задача 2
        // Создаем входной массив с выплатами сотрудникам по ТК РФ
        int[] inputArray2 = {60000, 75000, 50000, 80000, 65000};

        // Определяем выходной массив для налога 13%
        double[] outputArray2 = new double[inputArray2.length];

        // Рассчитываем налог 13% для каждой выплаты
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * 0.13;
        }

        // Выводим входной и выходной массивы
        System.out.println("inputArray2: " + java.util.Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + java.util.Arrays.toString(outputArray2));

        // Задача 3
        // Создаем входной массив с бонусами сотрудников отдела продаж за январь
        int[] inputArray3 = {4500, 6000, 5500, 3000, 7000};

        // Определяем выходной массив флагов (true — бонус > 5000, false — иначе)
        boolean[] outputArray3 = new boolean[inputArray3.length];

        // Проверяем каждый бонус: если больше 5000, ставим true, иначе false
        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 5000;
        }

        // Выводим входной и выходной массивы
        System.out.println("inputArray3: " + java.util.Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + java.util.Arrays.toString(outputArray3));

        // Создаем входной массив с остатками на кредитном счете клиента
        int[] inputArray4 = {10000, -2000, 5000, 8000, 3000}; // Пример с просрочкой (отрицательный баланс)


        //Задача 4
        // Определяем переменную для результата проверки
        boolean outputArray4 = true; // Предполагаем, что нет просрочек

        // Проверяем каждый элемент: если встречается отрицательный — сразу ставим false и выходим
        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4 = false;
                break; // Прерываем цикл при первой же просрочке — оптимизация
            }
        }

        // Выводим входной массив и результат
        System.out.println("inputArray4: " + java.util.Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + outputArray4);

        // Задача 5
        // Создаем входной массив с чистой прибылью компании за месяц
        int[] inputArray5 = {15000, -5000, 20000, -3000, 10000};

        // Считаем количество рентабельных месяцев (прибыль > 0)
        int countProfitable = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                countProfitable++;
            }
        }

        // Результат сохраняем в переменную outputArray5 (по аналогии с предыдущими задачами — как массив из одного элемента)
        int[] outputArray5 = {countProfitable};

        // Выводим входной и выходной массивы
        System.out.println("inputArray5: " + java.util.Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + java.util.Arrays.toString(outputArray5));

    }
}

