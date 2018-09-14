package com.qul628.niupan.domain.file.service.cmd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author huahua
 * @date create at 上午10:01 2018/9/8
 * description: 创建路径的参数
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreatePathCmd implements Serializable{

  private static final long serialVersionUID = 4142873882867590833L;

  /**
   * 路径的名字
   */
  private String name;

  /**
   * 用户id
   */
  private String userId;

  /**
   * 父路径id
   */
  private Long parentPathId;
}
