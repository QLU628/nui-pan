package com.qul628.niupan.domain.file;


import java.util.List;

/**
 * @author huahua
 * @date create at 下午1:34 2018/9/5
 */
public class Path {

  private Long id;

  private String name;

  private PathValueObject perentPath;

  private List<PathValueObject> subPath;

  private List<File> files;


}
