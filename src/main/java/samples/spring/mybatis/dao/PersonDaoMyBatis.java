package samples.spring.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import samples.spring.mybatis.domain.Person;

import java.util.List;

/**
 * Created by izeye on 2014. 11. 25..
 */
@Repository
public class PersonDaoMyBatis implements PersonDao {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public void save(Person person) {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        mapper.save(person);
    }

    @Override
    @Transactional
    public void save(List<Person> persons) {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        for (Person person : persons) {
            mapper.save(person);
//            throw new RuntimeException();
        }
    }

    @Override
    public List<Person> findAll() {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        return mapper.findAll();
    }

}
