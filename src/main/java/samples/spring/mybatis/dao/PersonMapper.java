package samples.spring.mybatis.dao;

import samples.spring.mybatis.domain.Person;

import java.util.List;

/**
 * Created by izeye on 2014. 11. 25..
 */
public interface PersonMapper {

    void save(Person person);

    List<Person> findAll();

}
