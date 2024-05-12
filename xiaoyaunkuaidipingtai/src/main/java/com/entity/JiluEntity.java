package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 快递记录
 *
 * @author 
 * @email
 */
@TableName("jilu")
public class JiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiluEntity() {

	}

	public JiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 快递
     */
    @ColumnInfo(comment="快递",type="int(11)")
    @TableField(value = "kuaidi_id")

    private Integer kuaidiId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 快递记录名称
     */
    @ColumnInfo(comment="快递记录名称",type="varchar(200)")
    @TableField(value = "jilu_name")

    private String jiluName;


    /**
     * 快递记录编号
     */
    @ColumnInfo(comment="快递记录编号",type="varchar(200)")
    @TableField(value = "jilu_uuid_number")

    private String jiluUuidNumber;


    /**
     * 发出地
     */
    @ColumnInfo(comment="发出地",type="varchar(200)")
    @TableField(value = "jilu_fachu_address")

    private String jiluFachuAddress;


    /**
     * 接受地
     */
    @ColumnInfo(comment="接受地",type="varchar(200)")
    @TableField(value = "jilu_jieshou_address")

    private String jiluJieshouAddress;


    /**
     * 快递记录类型
     */
    @ColumnInfo(comment="快递记录类型",type="int(11)")
    @TableField(value = "jilu_types")

    private Integer jiluTypes;


    /**
     * 快递记录介绍
     */
    @ColumnInfo(comment="快递记录介绍",type="longtext")
    @TableField(value = "jilu_content")

    private String jiluContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "jilu_delete")

    private Integer jiluDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：快递
	 */
    public Integer getKuaidiId() {
        return kuaidiId;
    }
    /**
	 * 设置：快递
	 */

    public void setKuaidiId(Integer kuaidiId) {
        this.kuaidiId = kuaidiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：快递记录名称
	 */
    public String getJiluName() {
        return jiluName;
    }
    /**
	 * 设置：快递记录名称
	 */

    public void setJiluName(String jiluName) {
        this.jiluName = jiluName;
    }
    /**
	 * 获取：快递记录编号
	 */
    public String getJiluUuidNumber() {
        return jiluUuidNumber;
    }
    /**
	 * 设置：快递记录编号
	 */

    public void setJiluUuidNumber(String jiluUuidNumber) {
        this.jiluUuidNumber = jiluUuidNumber;
    }
    /**
	 * 获取：发出地
	 */
    public String getJiluFachuAddress() {
        return jiluFachuAddress;
    }
    /**
	 * 设置：发出地
	 */

    public void setJiluFachuAddress(String jiluFachuAddress) {
        this.jiluFachuAddress = jiluFachuAddress;
    }
    /**
	 * 获取：接受地
	 */
    public String getJiluJieshouAddress() {
        return jiluJieshouAddress;
    }
    /**
	 * 设置：接受地
	 */

    public void setJiluJieshouAddress(String jiluJieshouAddress) {
        this.jiluJieshouAddress = jiluJieshouAddress;
    }
    /**
	 * 获取：快递记录类型
	 */
    public Integer getJiluTypes() {
        return jiluTypes;
    }
    /**
	 * 设置：快递记录类型
	 */

    public void setJiluTypes(Integer jiluTypes) {
        this.jiluTypes = jiluTypes;
    }
    /**
	 * 获取：快递记录介绍
	 */
    public String getJiluContent() {
        return jiluContent;
    }
    /**
	 * 设置：快递记录介绍
	 */

    public void setJiluContent(String jiluContent) {
        this.jiluContent = jiluContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getJiluDelete() {
        return jiluDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setJiluDelete(Integer jiluDelete) {
        this.jiluDelete = jiluDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jilu{" +
            ", id=" + id +
            ", kuaidiId=" + kuaidiId +
            ", yonghuId=" + yonghuId +
            ", jiluName=" + jiluName +
            ", jiluUuidNumber=" + jiluUuidNumber +
            ", jiluFachuAddress=" + jiluFachuAddress +
            ", jiluJieshouAddress=" + jiluJieshouAddress +
            ", jiluTypes=" + jiluTypes +
            ", jiluContent=" + jiluContent +
            ", jiluDelete=" + jiluDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
