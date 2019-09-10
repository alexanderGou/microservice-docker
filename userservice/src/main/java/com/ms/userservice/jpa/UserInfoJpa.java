package com.ms.userservice.jpa;

import com.ms.userservice.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoJpa extends JpaRepository<UserInfo, String> {
}
