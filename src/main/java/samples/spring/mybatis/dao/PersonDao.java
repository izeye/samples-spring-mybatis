package samples.spring.mybatis.dao;

import samples.spring.mybatis.domain.Person;

import java.util.List;

/**
 * Created by izeye on 2014. 11. 25..
 */
public interface PersonDao {

    void save(Person person);

    void save(List<Person> persons);

    List<Person> findAll();

}
