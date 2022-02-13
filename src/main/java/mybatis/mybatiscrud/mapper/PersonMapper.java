package mybatis.mybatiscrud.mapper;

import mybatis.mybatiscrud.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    List<Person> getAll();

    //@Select("SELECT * FROM TESTTABLE WHERE ID = #{id}")
    Person getById(int id);

    void insert(Person newPerson);

    void update(Person updatePerson);

    void deleteById(int id);


}

