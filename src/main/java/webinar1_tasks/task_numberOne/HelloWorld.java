package webinar1_tasks.task_numberOne;

/**
 * Task number one
 */
public class HelloWorld extends Object {

    /**
     * Statement of problem:
     * Не изменяя текста класса HelloWorld (вообще не редактируя файла HelloWord.java), сделать так,
     * чтобы запуск программы не приводил к этому «ожидаемому» результату.
     * @param args
     * Comment: Задачу можно решить несколькими способами:
     * 1.Переопределяя "System","out","println" и "Object",что и сделано в данной реализации.
     * Замечание: класс "out" написан с маленькой буквы чисто для реализации идеи.
     * 2.Использование потоков Ввода/вывода.
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
