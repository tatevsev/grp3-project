package com.cydeo.entity;

import com.cydeo.entity.common.BaseEntity;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@EqualsAndHashCode(callSuper = false)    //to use our classes in DS, we have to override this method
@Table(name = "categories")
public class Category extends BaseEntity {

    private String description;
    private Company Company;
    private Long companyId;


}