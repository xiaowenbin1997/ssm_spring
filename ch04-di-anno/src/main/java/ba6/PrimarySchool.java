package ba6;

import org.springframework.stereotype.Component;

@Component
public class PrimarySchool extends School{
    public PrimarySchool() {
        System.out.println("小学无参构造");
    }
}
