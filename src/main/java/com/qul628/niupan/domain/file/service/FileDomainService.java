package com.qul628.niupan.domain.file.service;

import com.qul628.niupan.base.dto.PaginationWrapper;
import com.qul628.niupan.domain.file.File;


/**
 * @author huahua
 * @date create at 下午2:20 2018/9/5
 */
public interface FileDomainService {

  /**
   * 根据路径获取文件
   * @param pathId 路径id
   * @param start 起始位
   * @param limit 长度
   * @return 分页
   */
  PaginationWrapper<File> queryFileByPath(Long pathId,Integer start,Integer limit);

  /**
   *  根据文件id获取文件
   * @param id 文件id
   * @return 文件
   */
  File findFileById(Long id);


  File createFile();

}
