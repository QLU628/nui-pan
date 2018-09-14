package com.qul628.niupan.domain.file.service.cmd;

import com.qul628.niupan.base.constant.file.UrlDomainType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author huahua
 * @date create at 上午10:07 2018/9/8
 * description: 创建文件夹
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateFileCmd implements Serializable{

  /**
   * 文件名称
   */
  private String name;

  /**
   * 用户id
   */
  private Long userId;

  /**
   * 路径id
   */
  private Long pathId;

  /**
   * 文件的资源定位符
   */
  private String url;

  /**
   * 文件的位置种类
   */
  private UrlDomainType locationType;

}
