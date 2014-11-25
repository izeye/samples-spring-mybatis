package samples.spring.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
    public List<Person> findAll() {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        return mapper.findAll();
    }

}
