package com.laid.pojo.dto;

import javax.validation.constraints.NotNull;

/**
 * @author laid
 * @title: Flag
 * @projectName test
 * @description: TODO
 * @date 2019/6/1621:41
 */
public class Flag {
  @NotNull(message = "hahahahaahah!!!")
   private String flag;

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }
}
