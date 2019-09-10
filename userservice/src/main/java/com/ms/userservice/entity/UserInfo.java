package com.ms.userservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_user_info")
@Data
@ApiModel
public class UserInfo {
    @Id
    @JsonIgnore
    private Long id;
    private String userName;
    private Long tel;
    private int sex;
    private String email;
}
