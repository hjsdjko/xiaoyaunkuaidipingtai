package com.entity.vo;

import com.entity.JiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 快递记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jilu")
public class JiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 快递
     */

    @TableField(value = "kuaidi_order")
    private Integer kuaidiOrder;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 快递记录名称
     */

    @TableField(value = "jilu_name")
    private String jiluName;


    /**
     * 快递记录编号
     */

    @TableField(value = "jilu_uuid_number")
    private String jiluUuidNumber;


    /**
     * 发出地
     */

    @TableField(value = "jilu_fachu_address")
    private String jiluFachuAddress;


    /**
     * 接受地
     */

    @TableField(value = "jilu_jieshou_address")
    private String jiluJieshouAddress;


    /**
     * 快递记录类型
     */

    @TableField(value = "jilu_types")
    private Integer jiluTypes;


    /**
     * 快递记录介绍
     */

    @TableField(value = "jilu_content")
    private String jiluContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "jilu_delete")
    private Integer jiluDelete;


    /**
     * 录入时间
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
	 * 设置：快递
	 */
    public Integer getKuaidiOrder() {
        return kuaidiOrder;
    }


    /**
	 * 获取：快递
	 */

    public void setKuaidiOrder(Integer kuaidiOrder) {
        this.kuaidiOrder = kuaidiOrder;
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
	 * 设置：快递记录名称
	 */
    public String getJiluName() {
        return jiluName;
    }


    /**
	 * 获取：快递记录名称
	 */

    public void setJiluName(String jiluName) {
        this.jiluName = jiluName;
    }
    /**
	 * 设置：快递记录编号
	 */
    public String getJiluUuidNumber() {
        return jiluUuidNumber;
    }


    /**
	 * 获取：快递记录编号
	 */

    public void setJiluUuidNumber(String jiluUuidNumber) {
        this.jiluUuidNumber = jiluUuidNumber;
    }
    /**
	 * 设置：发出地
	 */
    public String getJiluFachuAddress() {
        return jiluFachuAddress;
    }


    /**
	 * 获取：发出地
	 */

    public void setJiluFachuAddress(String jiluFachuAddress) {
        this.jiluFachuAddress = jiluFachuAddress;
    }
    /**
	 * 设置：接受地
	 */
    public String getJiluJieshouAddress() {
        return jiluJieshouAddress;
    }


    /**
	 * 获取：接受地
	 */

    public void setJiluJieshouAddress(String jiluJieshouAddress) {
        this.jiluJieshouAddress = jiluJieshouAddress;
    }
    /**
	 * 设置：快递记录类型
	 */
    public Integer getJiluTypes() {
        return jiluTypes;
    }


    /**
	 * 获取：快递记录类型
	 */

    public void setJiluTypes(Integer jiluTypes) {
        this.jiluTypes = jiluTypes;
    }
    /**
	 * 设置：快递记录介绍
	 */
    public String getJiluContent() {
        return jiluContent;
    }


    /**
	 * 获取：快递记录介绍
	 */

    public void setJiluContent(String jiluContent) {
        this.jiluContent = jiluContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getJiluDelete() {
        return jiluDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setJiluDelete(Integer jiluDelete) {
        this.jiluDelete = jiluDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
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
