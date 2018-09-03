package com.qul628.niupan.domain.service;

import com.qul628.niupan.domain.User;
import com.qul628.niupan.domain.cmd.CreateUserCmd;
import com.qul628.niupan.domain.cmd.LoginCmd;

/**
 * @author huahua
 * @date create at 下午3:43 2018/9/1
 * 用户领域服务
 */
public interface UserDomainService {

  /**
   * 创建用户
   * @param cmd 创建参数
   * @return 创建结果
   */
  User createUser(CreateUserCmd cmd);

  /**
   * 根据用户id查询用户
   * @param userId  用户id
   * @return 查询结果
   */
  User findById(Long userId);

  /**
   * 根据用户名id查询用户
   *
   * @param cmd@return 查询结果
   */
  User login(LoginCmd cmd);




}
