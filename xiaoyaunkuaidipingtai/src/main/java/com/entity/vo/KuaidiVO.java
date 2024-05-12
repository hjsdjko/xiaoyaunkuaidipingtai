package com.entity.vo;

import com.entity.KuaidiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 快递
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kuaidi")
public class KuaidiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单
     */

    @TableField(value = "dingdan")
    private Integer dingdan;


    /**
     * 快递名称
     */

    @TableField(value = "kuaidi_name")
    private String kuaidiName;


    /**
     * 快递编号
     */

    @TableField(value = "kuaidi_uuid_number")
    private String kuaidiUuidNumber;


    /**
     * 快递照片
     */

    @TableField(value = "kuaidi_photo")
    private String kuaidiPhoto;


    /**
     * 快递类型
     */

    @TableField(value = "kuaidi_types")
    private Integer kuaidiTypes;


    /**
     * 快递介绍
     */

    @TableField(value = "kuaidi_content")
    private String kuaidiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "kuaidi_delete")
    private Integer kuaidiDelete;


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
	 * 设置：订单
	 */
    public Integer getDingdan() {
        return dingdan;
    }


    /**
	 * 获取：订单
	 */

    public void setDingdan(Integer dingdan) {
        this.dingdan = dingdan;
    }
    /**
	 * 设置：快递名称
	 */
    public String getKuaidiName() {
        return kuaidiName;
    }


    /**
	 * 获取：快递名称
	 */

    public void setKuaidiName(String kuaidiName) {
        this.kuaidiName = kuaidiName;
    }
    /**
	 * 设置：快递编号
	 */
    public String getKuaidiUuidNumber() {
        return kuaidiUuidNumber;
    }


    /**
	 * 获取：快递编号
	 */

    public void setKuaidiUuidNumber(String kuaidiUuidNumber) {
        this.kuaidiUuidNumber = kuaidiUuidNumber;
    }
    /**
	 * 设置：快递照片
	 */
    public String getKuaidiPhoto() {
        return kuaidiPhoto;
    }


    /**
	 * 获取：快递照片
	 */

    public void setKuaidiPhoto(String kuaidiPhoto) {
        this.kuaidiPhoto = kuaidiPhoto;
    }
    /**
	 * 设置：快递类型
	 */
    public Integer getKuaidiTypes() {
        return kuaidiTypes;
    }


    /**
	 * 获取：快递类型
	 */

    public void setKuaidiTypes(Integer kuaidiTypes) {
        this.kuaidiTypes = kuaidiTypes;
    }
    /**
	 * 设置：快递介绍
	 */
    public String getKuaidiContent() {
        return kuaidiContent;
    }


    /**
	 * 获取：快递介绍
	 */

    public void setKuaidiContent(String kuaidiContent) {
        this.kuaidiContent = kuaidiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getKuaidiDelete() {
        return kuaidiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setKuaidiDelete(Integer kuaidiDelete) {
        this.kuaidiDelete = kuaidiDelete;
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
