package com.entity.model;

import com.entity.KuaidiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 快递
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KuaidiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单
     */
    private Integer dingdan;


    /**
     * 快递名称
     */
    private String kuaidiName;


    /**
     * 快递编号
     */
    private String kuaidiUuidNumber;


    /**
     * 快递照片
     */
    private String kuaidiPhoto;


    /**
     * 快递类型
     */
    private Integer kuaidiTypes;


    /**
     * 快递介绍
     */
    private String kuaidiContent;


    /**
     * 逻辑删除
     */
    private Integer kuaidiDelete;


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
	 * 获取：订单
	 */
    public Integer getDingdan() {
        return dingdan;
    }


    /**
	 * 设置：订单
	 */
    public void setDingdan(Integer dingdan) {
        this.dingdan = dingdan;
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
