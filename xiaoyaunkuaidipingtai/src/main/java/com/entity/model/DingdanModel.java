package com.entity.model;

import com.entity.DingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DingdanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单编号
     */
    private String dingdanUuidNumber;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 购买数量
     */
    private Integer buyNumber;


    /**
     * 购买物品
     */
    private String dingdanWupin;


    /**
     * 照片
     */
    private String dingdanPhoto;


    /**
     * 收货地址
     */
    private String dingdanDizhi;


    /**
     * 实付价格
     */
    private Double dingdanTruePrice;


    /**
     * 快递公司
     */
    private String dingdanCourierName;


    /**
     * 快递单号
     */
    private Integer dingdanCourierNumber;


    /**
     * 订单类型
     */
    private Integer dingdanTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
