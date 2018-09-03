package com.qul628.niupan.port.view;

import com.qul628.niupan.base.dto.HttpWrapper;
import com.qul628.niupan.domain.User;
import com.qul628.niupan.domain.cmd.LoginCmd;
import com.qul628.niupan.domain.service.UserDomainService;
import com.qul628.niupan.infrastructure.util.LoginUserUtil;
import com.qul628.niupan.port.view.assembler.UserAssembler;
import com.qul628.niupan.port.view.form.LoginForm;
import com.qul628.niupan.port.view.vo.UserVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huahua
 * @date create at 下午10:55 2018/9/1
 */
@RestController
@RequestMapping("api/user/")
public class UserApi {

  @Resource
  private UserDomainService userDomainService;

  @GetMapping("detail/")
  public HttpWrapper<UserVO> detail(
      @RequestParam Long id
  ){
    User user = userDomainService.findById(id);
    return new HttpWrapper<>(UserAssembler.toUserVO(user));
  }

  @PostMapping("login/")
  public HttpWrapper<UserVO> login(
      @RequestBody LoginForm form
  ){
    User user = userDomainService.login(new LoginCmd(form.getUsername(), form.getPassword()));
    return  new HttpWrapper<>(UserAssembler.toUserVO(user));
  }

  @GetMapping("my/")
  public HttpWrapper<UserVO> my(){
    User user = LoginUserUtil.getLoginUser();
    return new HttpWrapper<>(UserAssembler.toUserVO(user));
  }

}
