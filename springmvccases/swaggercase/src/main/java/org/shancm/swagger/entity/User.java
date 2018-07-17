package org.shancm.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Component;

/**
 * @author shancm
 * @pachage org.shancm.swagger.entity
 * @description:
 * @date 2018/6/12
 */
@Component
@ApiModel(value = "user实体", description = "用户信息实体")
public class User {
    @ApiParam(name = "姓名name", value = "姓名", required = true)
    private String name;
    @ApiModelProperty
    private Integer age;
    private Long mob;
}
