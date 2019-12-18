package com.springboot.springboot.Repository;

import com.springboot.springboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author
 * @version 1.0
 * @date 2019/12/18
 */
public interface PersonPepository extends JpaRepository<Person,Long> {
}
