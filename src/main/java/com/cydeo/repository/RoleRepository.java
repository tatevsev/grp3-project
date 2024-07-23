package com.cydeo.repository;
import com.cydeo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface RoleRepository extends JpaRepository<Role,Long> {


}
