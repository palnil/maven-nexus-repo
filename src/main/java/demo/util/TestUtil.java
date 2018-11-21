package demo.util;

import demo.text.modify.Util;

public class TestUtil {

    public static void main(String[] args) {

        Person person = new Person("nilesh");

        System.out.println(Util.makeUpperCase(person.getName()));
    }

}
