package webinar1_tasks.task_numberTwo;

/**
 *  Task number two
 */
public class Change {
    /**
     *Statement of problem:
     * Вася идет в магазин за батоном, который стоит 1р. 10коп. В кармане у Васи есть лишь горстка
     * двухрублевых монет. Сколько он должен получить на сдачу с двух рублей за один батон?
     * Сколько сдачи дадут Васе в результате? Можете ли вы помочь (изменить программу)?
     * @param args
     * Answer the question:
     * Все мы понимаем,что действительный ответ 0.90коп., НО исходный код задачи выдает ответ 0.8(9)коп. Связано это
     * с тем,что 1.10 в двоичном коде представляется в следующем виде: 1.0(011).Следственно,можно предположить,что
     * это обосновывается погрешностью вычисления.
     * Таким образом,исправив код,мы получим всеми известное решение данного вопроса.
     */
    public static void main(String[] args) {
        double value=2.00-1.10;
        System.out.format("%.2f",value);
    }
}
