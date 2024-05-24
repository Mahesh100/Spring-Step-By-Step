

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;
import com.springcore.ci.Addition;
import com.springcore.ci.Person;
import com.springcore.collections.Emp;
import com.springcore.ref.A;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);

		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);

		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);
		
		Student student4=(Student)context.getBean("student4");
		System.out.println(student4);
		
		Emp emp = (Emp)context.getBean("Emp");
		System.out.println(emp);
		
		A temp = (A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb());
		
		Person p = (Person)context.getBean("person");
		System.out.println(p);
		
		Addition addition = (Addition)context.getBean("addition");
	addition.doSum();
		System.out.println(addition);
		
		
	}
}
