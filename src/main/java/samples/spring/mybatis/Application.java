package samples.spring.mybatis;

import org.springframework.context.support.GenericXmlApplicationContext;
import samples.spring.mybatis.dao.PersonDao;
import samples.spring.mybatis.domain.Person;

import java.util.Arrays;

/**
 * Created by izeye on 2014. 11. 25..
 */
public class Application {

    public static void main(String[] args) {
        GenericXmlApplicationContext applicationContext =
                new GenericXmlApplicationContext("classpath:applicationContext.xml");
        PersonDao personDao = applicationContext.getBean(PersonDao.class);

        Person person1 = new Person("Johnny", 34);
        Person person2 = new Person("Alice", 20);
        personDao.save(Arrays.asList(person1, person2));
    }

}
