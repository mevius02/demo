package com.example.demo.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * [検索]Mユーザー
     * 
     * @param userId ユーザーID
     * @return ユーザーデータ
     */
    public User findByUserId(String userId);
}
