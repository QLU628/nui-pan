package com.qul628.niupan.port.persistence.dao;


import com.qul628.niupan.port.persistence.dataobject.UserDO;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huahua
 * @date create at 下午2:53 2018/9/1
 * description:用户数据库操作
 */

public interface UserDAO extends JpaRepository<UserDO,Long> {
  UserDO findByUserNameAndPassword(String userName, String password);

}
