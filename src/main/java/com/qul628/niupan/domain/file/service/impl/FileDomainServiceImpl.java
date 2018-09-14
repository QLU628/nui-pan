package com.qul628.niupan.domain.file.service.impl;

import com.qul628.niupan.base.dto.PaginationWrapper;
import com.qul628.niupan.domain.file.File;
import com.qul628.niupan.domain.file.service.FileDomainService;

import org.springframework.stereotype.Service;

/**
 * @author huahua
 * @date create at 下午2:20 2018/9/5
 */
@Service
public class FileDomainServiceImpl implements FileDomainService {

  @Override
  public PaginationWrapper<File> queryFileByPath(Long pathId, Integer start, Integer limit) {
    return null;
  }
}
