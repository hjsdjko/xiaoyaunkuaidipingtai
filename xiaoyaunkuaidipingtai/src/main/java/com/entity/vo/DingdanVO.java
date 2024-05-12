package com.entity.vo;

import com.entity.DingdanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dingdan")
public class DingdanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单编号
     */

    @TableField(value = "dingdan_uuid_number")
    private String dingdanUuidNumber;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 购买数量
     */

    @TableField(value = "buy_number")
    private Integer buyNumber;


    /**
     * 购买物品
     */

    @TableField(value = "dingdan_wupin")
    private String dingdanWupin;


    /**
     * 照片
     */

    @TableField(value = "dingdan_photo")
    private String dingdanPhoto;


    /**
     * 收货地址
     */

    @TableField(value = "dingdan_dizhi")
    private String dingdanDizhi;


    /**
     * 实付价格
     */

    @TableField(value = "dingdan_true_price")
    private Double dingdanTruePrice;


    /**
     * 快递公司
     */

    @TableField(value = "dingdan_courier_name")
    private String dingdanCourierName;


    /**
     * 快递单号
     */

    @TableField(value = "dingdan_courier_number")
    private Integer dingdanCourierNumber;


    /**
     * 订单类型
     */

    @TableField(value = "dingdan_types")
    private Integer dingdanTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单编号
	 */
    public String getDingdanUuidNumber() {
        return dingdanUuidNumber;
    }


    /**
	 * 获取：订单编号
	 */

    public void setDingdanUuidNumber(String dingdanUuidNumber) {
        this.dingdanUuidNumber = dingdanUuidNumber;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：购买物品
	 */
    public String getDingdanWupin() {
        return dingdanWupin;
    }


    /**
	 * 获取：购买物品
	 */

    public void setDingdanWupin(String dingdanWupin) {
        this.dingdanWupin = dingdanWupin;
    }
    /**
	 * 设置：照片
	 */
    public String getDingdanPhoto() {
        return dingdanPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setDingdanPhoto(String dingdanPhoto) {
        this.dingdanPhoto = dingdanPhoto;
    }
    /**
	 * 设置：收货地址
	 */
    public String getDingdanDizhi() {
        return dingdanDizhi;
    }


    /**
	 * 获取：收货地址
	 */

    public void setDingdanDizhi(String dingdanDizhi) {
        this.dingdanDizhi = dingdanDizhi;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getDingdanTruePrice() {
        return dingdanTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setDingdanTruePrice(Double dingdanTruePrice) {
        this.dingdanTruePrice = dingdanTruePrice;
    }
    /**
	 * 设置：快递公司
	 */
    public String getDingdanCourierName() {
        return dingdanCourierName;
    }


    /**
	 * 获取：快递公司
	 */

    public void setDingdanCourierName(String dingdanCourierName) {
        this.dingdanCourierName = dingdanCourierName;
    }
    /**
	 * 设置：快递单号
	 */
    public Integer getDingdanCourierNumber() {
        return dingdanCourierNumber;
    }


    /**
	 * 获取：快递单号
	 */

    public void setDingdanCourierNumber(Integer dingdanCourierNumber) {
        this.dingdanCourierNumber = dingdanCourierNumber;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getDingdanTypes() {
        return dingdanTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setDingdanTypes(Integer dingdanTypes) {
        this.dingdanTypes = dingdanTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
