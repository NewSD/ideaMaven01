package cn.niu.maven;

import cn.niu.bean.Student;
import cn.niu.bean.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student student = Student.builder().age(11).gender(1).name("张三").build();
        System.out.println(student);

        User user = new User();
        user.setId(1111111111);
        user.setName("admin");
        System.out.println(user);



    }
}
