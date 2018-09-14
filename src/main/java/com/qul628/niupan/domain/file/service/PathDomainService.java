package com.qul628.niupan.domain.file.service;

import com.qul628.niupan.base.dto.PaginationWrapper;
import com.qul628.niupan.domain.file.Path;
import com.qul628.niupan.domain.file.service.cmd.CreatePathCmd;

/**
 * @author huahua
 * @date create at 上午9:52 2018/9/8
 * description: 路径的服务
 */
public interface PathDomainService {

  /**
   * 请求父路径下载所有路径
   * @param parentPathId 父路径id
   * @param start 分页开始位置
   * @param limit 分页长度
   * @return 父路径下的路径
   */
  PaginationWrapper<Path> queryPathByParentPath(Long parentPathId, Integer start, Integer limit);

  /**
   * 获取路径
   * @param id 路径id
   * @return 路径
   */
  PaginationWrapper<Path> findById(Long id);

  /**
   * 创建路径
   * @param cmd 创建路径参数
   * @return 创建成功的路径
   */
  Path createPath(CreatePathCmd cmd);


}
