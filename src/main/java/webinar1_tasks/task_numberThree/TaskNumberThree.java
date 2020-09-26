package webinar1_tasks.task_numberThree;

/**
 * Task number three
 */
public class TaskNumberThree {
    /**
     * Statement of problem:
     * Как известно, в Java объекты принято сравнивать через object.equals(anotherObject), не полагаясь на
     * равенство ссылок на эти объекты. Ибо сравнение по ссылкам дает «неверный» результат.Вашему вниманию
     * предлагается занимательное математическое исследование.Вопрос: чем же так особенно число 42, помимо
     * ответа на главный вопрос жизни, вселенной и всего
     * такого? Как объясняется результат работы кода, приведенного выше?
     * @param args
     * Answer th question: На самом деле-все просто. Integer-ссылочный тип,который имеет следующее совйство:
     * числа от -128 до 127 он кэширует,а для оставшихся создает каждому числу свой объект. Так как '==' сравнивает
     * ссылки,то в первом случае будет true, а для числа 142 Integer создает два объекта,поэтому сравнение по ссылке
     * даст нам false.
     */
    public static void main(String[] args) {
        Integer i=2;
        Integer j=2;
        boolean b=(i==j);
        System.out.println(i+" = "+j+" : "+ (i==j));

        i=142;//-128 до 127 кэш.а дальше о=созд новые объекты
        j=142;
        boolean bb=(i==j);
        System.out.println(i+" = "+j+" : "+ (i==j));
    }
}
