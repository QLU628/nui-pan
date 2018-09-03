package com.qul628.niupan.infrastructure.util;

import com.qul628.niupan.domain.User;
import com.qul628.niupan.domain.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author huahua
 * @date create at 下午4:00 2018/9/1
 * description: 登录工具
 */
@Component
public class LoginUserUtil {

  private static final String USER_KEY = "user_id";

  private static final Long NULL_USER_ID = 0L;

  private static UserRepository userRepository;

  @Autowired
  public void setUserDomainService(
      UserRepository userRepository) {
    LoginUserUtil.userRepository = userRepository;
  }

  public static long getLoginUserId() {
    HttpSession session = getHttpSession();
    Object userId = session.getAttribute(USER_KEY);
    return userId == null ? NULL_USER_ID : (Long) userId;
  }


  public static User getLoginUser() {
    long loginUserId = getLoginUserId();
    if (loginUserId != NULL_USER_ID) {
      return userRepository.findById(loginUserId);
    }
    return null;
  }

  public static void login(Long id) {
    HttpSession session = getHttpSession();
    session.setAttribute(USER_KEY,id);
  }

  public static void logout() {
    HttpSession session = getHttpSession();
    session.setAttribute(USER_KEY,null);
  }

  private static HttpSession getHttpSession() {
    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
        .getRequestAttributes()).getRequest();
    return request.getSession();
  }
}
