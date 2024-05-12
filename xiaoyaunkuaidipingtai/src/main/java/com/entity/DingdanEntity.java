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
 * 订单
 *
 * @author 
 * @email
 */
@TableName("dingdan")
public class DingdanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DingdanEntity() {

	}

	public DingdanEntity(T t) {
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
     * 订单编号
     */
    @ColumnInfo(comment="订单编号",type="varchar(200)")
    @TableField(value = "dingdan_uuid_number")

    private String dingdanUuidNumber;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 购买数量
     */
    @ColumnInfo(comment="购买数量",type="int(11)")
    @TableField(value = "buy_number")

    private Integer buyNumber;


    /**
     * 购买物品
     */
    @ColumnInfo(comment="购买物品",type="varchar(200)")
    @TableField(value = "dingdan_wupin")

    private String dingdanWupin;


    /**
     * 照片
     */
    @ColumnInfo(comment="照片",type="varchar(200)")
    @TableField(value = "dingdan_photo")

    private String dingdanPhoto;


    /**
     * 收货地址
     */
    @ColumnInfo(comment="收货地址",type="varchar(200)")
    @TableField(value = "dingdan_dizhi")

    private String dingdanDizhi;


    /**
     * 实付价格
     */
    @ColumnInfo(comment="实付价格",type="decimal(10,2)")
    @TableField(value = "dingdan_true_price")

    private Double dingdanTruePrice;


    /**
     * 快递公司
     */
    @ColumnInfo(comment="快递公司",type="varchar(200)")
    @TableField(value = "dingdan_courier_name")

    private String dingdanCourierName;


    /**
     * 快递单号
     */
    @ColumnInfo(comment="快递单号",type="int(11)")
    @TableField(value = "dingdan_courier_number")

    private Integer dingdanCourierNumber;


    /**
     * 订单类型
     */
    @ColumnInfo(comment="订单类型",type="int(11)")
    @TableField(value = "dingdan_types")

    private Integer dingdanTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="订单创建时间",type="timestamp")
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
	 * 获取：订单编号
	 */
    public String getDingdanUuidNumber() {
        return dingdanUuidNumber;
    }
    /**
	 * 设置：订单编号
	 */

    public void setDingdanUuidNumber(String dingdanUuidNumber) {
        this.dingdanUuidNumber = dingdanUuidNumber;
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
	 * 获取：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }
    /**
	 * 设置：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 获取：购买物品
	 */
    public String getDingdanWupin() {
        return dingdanWupin;
    }
    /**
	 * 设置：购买物品
	 */

    public void setDingdanWupin(String dingdanWupin) {
        this.dingdanWupin = dingdanWupin;
    }
    /**
	 * 获取：照片
	 */
    public String getDingdanPhoto() {
        return dingdanPhoto;
    }
    /**
	 * 设置：照片
	 */

    public void setDingdanPhoto(String dingdanPhoto) {
        this.dingdanPhoto = dingdanPhoto;
    }
    /**
	 * 获取：收货地址
	 */
    public String getDingdanDizhi() {
        return dingdanDizhi;
    }
    /**
	 * 设置：收货地址
	 */

    public void setDingdanDizhi(String dingdanDizhi) {
        this.dingdanDizhi = dingdanDizhi;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getDingdanTruePrice() {
        return dingdanTruePrice;
    }
    /**
	 * 设置：实付价格
	 */

    public void setDingdanTruePrice(Double dingdanTruePrice) {
        this.dingdanTruePrice = dingdanTruePrice;
    }
    /**
	 * 获取：快递公司
	 */
    public String getDingdanCourierName() {
        return dingdanCourierName;
    }
    /**
	 * 设置：快递公司
	 */

    public void setDingdanCourierName(String dingdanCourierName) {
        this.dingdanCourierName = dingdanCourierName;
    }
    /**
	 * 获取：快递单号
	 */
    public Integer getDingdanCourierNumber() {
        return dingdanCourierNumber;
    }
    /**
	 * 设置：快递单号
	 */

    public void setDingdanCourierNumber(Integer dingdanCourierNumber) {
        this.dingdanCourierNumber = dingdanCourierNumber;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getDingdanTypes() {
        return dingdanTypes;
    }
    /**
	 * 设置：订单类型
	 */

    public void setDingdanTypes(Integer dingdanTypes) {
        this.dingdanTypes = dingdanTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：订单创建时间
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
        return "Dingdan{" +
            ", id=" + id +
            ", dingdanUuidNumber=" + dingdanUuidNumber +
            ", yonghuId=" + yonghuId +
            ", buyNumber=" + buyNumber +
            ", dingdanWupin=" + dingdanWupin +
            ", dingdanPhoto=" + dingdanPhoto +
            ", dingdanDizhi=" + dingdanDizhi +
            ", dingdanTruePrice=" + dingdanTruePrice +
            ", dingdanCourierName=" + dingdanCourierName +
            ", dingdanCourierNumber=" + dingdanCourierNumber +
            ", dingdanTypes=" + dingdanTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
