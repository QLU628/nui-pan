package com.qul628.niupan.domain.user.service.impl;

import com.qul628.niupan.domain.user.User;
import com.qul628.niupan.domain.user.cmd.CreateUserCmd;
import com.qul628.niupan.domain.user.cmd.LoginCmd;
import com.qul628.niupan.domain.user.repository.UserRepository;
import com.qul628.niupan.domain.user.service.UserDomainService;
import com.qul628.niupan.infrastructure.util.LoginUserUtil;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author huahua
 * @date create at 下午3:43 2018/9/1
 */
@Service
public class UserDomainServiceImpl implements UserDomainService {

  @Resource
  private UserRepository userRepository;

  @Override
  public User createUser(CreateUserCmd cmd) {
    return null;
  }

  @Override
  public User findById(Long userId) {
    return userRepository.findById(userId);
  }

  @Override
  public User login(LoginCmd cmd) {
    User user = userRepository
        .findByUsernameAndPassword(cmd.getUserName(), cmd.getPassword());
    if (user!=null && user.accessiable()){
      LoginUserUtil.login(user.getId());
    }
    return user;
  }
}
