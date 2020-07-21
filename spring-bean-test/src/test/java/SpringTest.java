import com.baoyong.test.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;

/**
 * @author JiangBaoyong
 * @date 2020/07/19
 **/
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("my-beans.xml");
//        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
//        System.out.println(helloWorld.getName());
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student.toString());
        System.out.println(Objects.isNull(student.getWife()));
    }
}
