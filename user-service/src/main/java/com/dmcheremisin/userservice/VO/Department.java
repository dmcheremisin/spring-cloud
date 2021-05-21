package com.dmcheremisin.userservice.VO;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class Department {

    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
