package abdul_bari_java.annodemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Target({ElementType.LOCAL_VARIABLE,ElementType.METHOD})
//@Repeatable(Myanno.class)
@interface Myanno{
    String name();
    String project() default "Annotations";
    String date();
    String version() default "13";
}


public class user_annotations {
    @Myanno(name="Rohith",date="today")
    public static void main(String[] args) {

    }
}
