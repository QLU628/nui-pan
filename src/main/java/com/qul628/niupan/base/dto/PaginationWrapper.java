package com.qul628.niupan.base.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @author huahua
 * @date create at 下午2:26 2018/9/5
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaginationWrapper<T> implements Serializable {

  private static final long serialVersionUID = -2429786192092463204L;

  private List<T> data;

  private Integer start;

  private Integer limit;

  private Boolean hasMore;

  private Integer nextStart;

  public PaginationWrapper(List<T> data, Integer start, Integer limit) {
    this.start = start;
    this.limit = limit;
    if (CollectionUtils.isEmpty(data)) {
      return;
    }
    if (data.size() > limit) {
      this.data = data.subList(0, data.size() - 1);
      this.hasMore = Boolean.TRUE;
    } else {
      this.data = data;
      this.hasMore = Boolean.FALSE;
    }
    nextStart = start + limit;
  }
}
