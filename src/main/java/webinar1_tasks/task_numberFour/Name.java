package webinar1_tasks.task_numberFour;

import java.util.HashSet;
import java.util.Set;

/**
 * Task number four
 * Statement of problem:
 * Помогите голливудской звезде найти себя в списке приглашенных на церемонию вручения «Оскара»
 * (измените программу так, чтобы выдавала true).
 */
public class Name {
    private String first,last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof  Name)) return false;
        Name n = (Name) o;
        return n.first.equals(first) && n.last.equals(last);
    }

    public static void main(String[] args) {
        Set s=new HashSet();
        //Set<Name> s=new HashSet<>();
        Name name=new Name("Brad","Pitt");//<---
        s.add(name);
        System.out.println(s.contains(name));//<---
    }
}
