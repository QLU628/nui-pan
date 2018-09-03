package com.qul628.niupan.port.view.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author huahua
 * @date create at 下午11:09 2018/9/1
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVO implements Serializable{

  private Long id;

  private String name;

  private String email;
}
