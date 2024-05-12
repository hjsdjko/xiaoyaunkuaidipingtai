package com.entity.model;

import com.entity.JiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 快递记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 快递
     */
    private Integer kuaidiOrder;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 快递记录名称
     */
    private String jiluName;


    /**
     * 快递记录编号
     */
    private String jiluUuidNumber;


    /**
     * 发出地
     */
    private String jiluFachuAddress;


    /**
     * 接受地
     */
    private String jiluJieshouAddress;


    /**
     * 快递记录类型
     */
    private Integer jiluTypes;


    /**
     * 快递记录介绍
     */
    private String jiluContent;


    /**
     * 逻辑删除
     */
    private Integer jiluDelete;


    /**
     * 录入时间
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
	 * 获取：快递
	 */
    public Integer getKuaidiOrder() {
        return kuaidiOrder;
    }


    /**
	 * 设置：快递
	 */
    public void setKuaidiOrder(Integer kuaidiOrder) {
        this.kuaidiOrder = kuaidiOrder;
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
