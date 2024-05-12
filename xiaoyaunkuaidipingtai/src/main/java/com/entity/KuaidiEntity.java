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
 * 快递
 *
 * @author 
 * @email
 */
@TableName("kuaidi")
public class KuaidiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KuaidiEntity() {

	}

	public KuaidiEntity(T t) {
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
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 订单
     */
    @ColumnInfo(comment="订单",type="int(11)")
    @TableField(value = "dingdan_id")

    private Integer dingdanId;


    /**
     * 快递名称
     */
    @ColumnInfo(comment="快递名称",type="varchar(200)")
    @TableField(value = "kuaidi_name")

    private String kuaidiName;


    /**
     * 快递编号
     */
    @ColumnInfo(comment="快递编号",type="varchar(200)")
    @TableField(value = "kuaidi_uuid_number")

    private String kuaidiUuidNumber;


    /**
     * 快递照片
     */
    @ColumnInfo(comment="快递照片",type="varchar(200)")
    @TableField(value = "kuaidi_photo")

    private String kuaidiPhoto;


    /**
     * 快递类型
     */
    @ColumnInfo(comment="快递类型",type="int(11)")
    @TableField(value = "kuaidi_types")

    private Integer kuaidiTypes;


    /**
     * 快递介绍
     */
    @ColumnInfo(comment="快递介绍",type="longtext")
    @TableField(value = "kuaidi_content")

    private String kuaidiContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "kuaidi_delete")

    private Integer kuaidiDelete;


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
	 * 获取：订单
	 */
    public Integer getDingdanId() {
        return dingdanId;
    }
    /**
	 * 设置：订单
	 */

    public void setDingdanId(Integer dingdanId) {
        this.dingdanId = dingdanId;
    }
    /**
	 * 获取：快递名称
	 */
    public String getKuaidiName() {
        return kuaidiName;
    }
    /**
	 * 设置：快递名称
	 */

    public void setKuaidiName(String kuaidiName) {
        this.kuaidiName = kuaidiName;
    }
    /**
	 * 获取：快递编号
	 */
    public String getKuaidiUuidNumber() {
        return kuaidiUuidNumber;
    }
    /**
	 * 设置：快递编号
	 */

    public void setKuaidiUuidNumber(String kuaidiUuidNumber) {
        this.kuaidiUuidNumber = kuaidiUuidNumber;
    }
    /**
	 * 获取：快递照片
	 */
    public String getKuaidiPhoto() {
        return kuaidiPhoto;
    }
    /**
	 * 设置：快递照片
	 */

    public void setKuaidiPhoto(String kuaidiPhoto) {
        this.kuaidiPhoto = kuaidiPhoto;
    }
    /**
	 * 获取：快递类型
	 */
    public Integer getKuaidiTypes() {
        return kuaidiTypes;
    }
    /**
	 * 设置：快递类型
	 */

    public void setKuaidiTypes(Integer kuaidiTypes) {
        this.kuaidiTypes = kuaidiTypes;
    }
    /**
	 * 获取：快递介绍
	 */
    public String getKuaidiContent() {
        return kuaidiContent;
    }
    /**
	 * 设置：快递介绍
	 */

    public void setKuaidiContent(String kuaidiContent) {
        this.kuaidiContent = kuaidiContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getKuaidiDelete() {
        return kuaidiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setKuaidiDelete(Integer kuaidiDelete) {
        this.kuaidiDelete = kuaidiDelete;
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
        return "Kuaidi{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", dingdanId=" + dingdanId +
            ", kuaidiName=" + kuaidiName +
            ", kuaidiUuidNumber=" + kuaidiUuidNumber +
            ", kuaidiPhoto=" + kuaidiPhoto +
            ", kuaidiTypes=" + kuaidiTypes +
            ", kuaidiContent=" + kuaidiContent +
            ", kuaidiDelete=" + kuaidiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
