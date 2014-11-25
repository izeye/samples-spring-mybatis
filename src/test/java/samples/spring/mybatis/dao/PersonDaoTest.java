package samples.spring.mybatis.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import samples.spring.mybatis.domain.Person;

import java.util.List;

/**
 * Created by izeye on 2014. 11. 25..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PersonDaoTest {

    @Autowired
    PersonDao personDao;

    @Test
    @Transactional
    public void test() {
        Person person = new Person("Johnny", 34);
        personDao.save(person);

        List<Person> persons = personDao.findAll();
        System.out.println(persons);
    }

}
