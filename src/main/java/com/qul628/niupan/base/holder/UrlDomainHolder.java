package com.qul628.niupan.base.holder;

import com.qul628.niupan.base.constant.file.UrlDomainType;
import com.qul628.niupan.base.dto.file.UrlDomainDTO;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author huahua
 * @date create at 下午2:56 2018/9/8
 */
public class UrlDomainHolder {

  private static final ConcurrentMap<UrlDomainType, UrlDomainDTO> HOLER = new ConcurrentHashMap<>();

  public static void regsiter(UrlDomainDTO urlDomainDTO){
    HOLER.putIfAbsent(urlDomainDTO.getDomainType(),urlDomainDTO);
  }

  public static UrlDomainDTO get(UrlDomainType type){
    return HOLER.get(type);
  }
}
