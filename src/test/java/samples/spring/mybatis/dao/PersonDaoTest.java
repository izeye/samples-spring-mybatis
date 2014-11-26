package samples.spring.mybatis.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import samples.spring.mybatis.domain.Person;

import java.util.Arrays;

/**
 * Created by izeye on 2014. 11. 25..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PersonDaoTest {

    @Autowired
    PersonDao personDao;

    @Test
//    @Transactional
    @Transactional("primary")
//    @Transactional("secondary")
    @Rollback(false)
    public void test() {
        Person person1 = new Person("Johnny", 34);
        Person person2 = new Person("Alice", 20);
        personDao.save(person1);
        personDao.save(person2);

//        List<Person> persons = personDao.findAll();
//        System.out.println(persons);
    }

    @Test
    public void testWithList() {
        Person person1 = new Person("Johnny", 34);
        Person person2 = new Person("Alice", 20);

        personDao.save(Arrays.asList(person1, person2));
    }

}
