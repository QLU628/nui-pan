package com.qul628.niupan.domain.file.holder;

import com.qul628.niupan.base.constant.file.UrlDomainType;
import com.qul628.niupan.base.dto.file.UrlDomainDTO;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author huahua
 * @date create at 上午10:30 2018/9/8
 */
public class UrlDomianHolder {

  public static ConcurrentMap<UrlDomainType,UrlDomainDTO> holder= new ConcurrentHashMap<>();


}
