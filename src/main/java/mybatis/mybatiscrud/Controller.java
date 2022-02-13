package mybatis.mybatiscrud;

import mybatis.mybatiscrud.mapper.PersonMapper;
import mybatis.mybatiscrud.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work")
public class Controller {
    private final PersonMapper personMapper;

    public Controller(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }


    @GetMapping
    public List<Person> getAll(){
      return personMapper.getAll();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable(value = "id") int id){
        return personMapper.getById(id);
    }

    @PostMapping
    public List<Person> create(@RequestBody Person newPerson){
        if (personMapper.getById(newPerson.getId())==null)
            personMapper.insert(newPerson);
        return personMapper.getAll();
    }

    @PutMapping("/{id}")
    public List<Person> update(@PathVariable(value = "id") int id, @RequestBody Person updatePerson) {
        if (personMapper.getById(updatePerson.getId())!=null)
            personMapper.update(updatePerson);
        return personMapper.getAll();
    }

    @DeleteMapping("/{id}")
    public List<Person> delete(@PathVariable(value = "id") int id) {
        if (personMapper.getById(id)!=null)
            personMapper.deleteById(id);
        return personMapper.getAll();
    }
}

