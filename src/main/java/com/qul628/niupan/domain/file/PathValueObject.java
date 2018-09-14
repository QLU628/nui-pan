package com.qul628.niupan.domain.file;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huahua
 * @date create at 下午1:36 2018/9/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PathValueObject {

  private Long id;

  private String name;
}
