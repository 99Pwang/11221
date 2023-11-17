package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import cn.hutool.core.annotation.Alias;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 
 */
@Getter
@Setter
@ApiModel(value = "Jobs对象", description = "")
public class Jobs implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @Alias("ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("职位名称")
    @Alias("职位名称")
    private String name;

    @ApiModelProperty("预计招聘人数")
    @Alias("预计招聘人数")
    private Integer nums;

    @ApiModelProperty("职位描述")
    @Alias("职位描述")
    private String content;

    @ApiModelProperty("封面")
    @Alias("封面")
    private String img;

    @ApiModelProperty("添加时间")
    @Alias("添加时间")
    private String time;

    @ApiModelProperty("部门")
    @Alias("部门")
    private String department;

    @TableField(exist = false)
    private Long submitNums;

}
