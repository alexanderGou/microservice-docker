package com.ms.userservice.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_user_info")
@Data
public class UserInfo {
    @Id
    private Long id;
    private String userName;
    private Long tel;
    private int sex;
    private String email;
}
