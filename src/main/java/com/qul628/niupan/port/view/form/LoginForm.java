package com.qul628.niupan.port.view.form;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

import java.io.Serializable;

/**
 * @author huahua
 * @date create at 下午1:29 2018/9/3
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginForm implements Serializable{

  private static final long serialVersionUID = -4265458681933503065L;
  @NotNull
  private String username;
  @NotNull
  private String password;
}
