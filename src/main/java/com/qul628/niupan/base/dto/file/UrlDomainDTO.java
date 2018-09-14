package com.qul628.niupan.base.dto.file;

import com.qul628.niupan.base.constant.file.UrlDomainType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huahua
 * @date create at 上午10:27 2018/9/8
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UrlDomainDTO {

  private String bucket;

  private UrlDomainType domainType;

  private Integer weight;

  private String domain;

}
