package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KuaidiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 快递
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("kuaidi")
public class KuaidiView extends KuaidiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 快递类型的值
	*/
	@ColumnInfo(comment="快递类型的字典表值",type="varchar(200)")
	private String kuaidiValue;

	//级联表 订单
		/**
		* 订单编号
		*/

		@ColumnInfo(comment="订单编号",type="varchar(200)")
		private String dingdanUuidNumber;
					 
		/**
		* 订单 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer dingdanYonghuId;
		/**
		* 购买数量
		*/

		@ColumnInfo(comment="购买数量",type="int(11)")
		private Integer buyNumber;
		/**
		* 购买物品
		*/

		@ColumnInfo(comment="购买物品",type="varchar(200)")
		private String dingdanWupin;
		/**
		* 照片
		*/

		@ColumnInfo(comment="照片",type="varchar(200)")
		private String dingdanPhoto;
		/**
		* 收货地址
		*/

		@ColumnInfo(comment="收货地址",type="varchar(200)")
		private String dingdanDizhi;
		/**
		* 实付价格
		*/
		@ColumnInfo(comment="实付价格",type="decimal(10,2)")
		private Double dingdanTruePrice;
		/**
		* 快递公司
		*/

		@ColumnInfo(comment="快递公司",type="varchar(200)")
		private String dingdanCourierName;
		/**
		* 快递单号
		*/

		@ColumnInfo(comment="快递单号",type="int(11)")
		private Integer dingdanCourierNumber;
		/**
		* 订单类型
		*/
		@ColumnInfo(comment="订单类型",type="int(11)")
		private Integer dingdanTypes;
			/**
			* 订单类型的值
			*/
			@ColumnInfo(comment="订单类型的字典表值",type="varchar(200)")
			private String dingdanValue;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;



	public KuaidiView() {

	}

	public KuaidiView(KuaidiEntity kuaidiEntity) {
		try {
			BeanUtils.copyProperties(this, kuaidiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 快递类型的值
	*/
	public String getKuaidiValue() {
		return kuaidiValue;
	}
	/**
	* 设置： 快递类型的值
	*/
	public void setKuaidiValue(String kuaidiValue) {
		this.kuaidiValue = kuaidiValue;
	}


	//级联表的get和set 订单

		/**
		* 获取： 订单编号
		*/
		public String getDingdanUuidNumber() {
			return dingdanUuidNumber;
		}
		/**
		* 设置： 订单编号
		*/
		public void setDingdanUuidNumber(String dingdanUuidNumber) {
			this.dingdanUuidNumber = dingdanUuidNumber;
		}
		/**
		* 获取：订单 的 用户
		*/
		public Integer getDingdanYonghuId() {
			return dingdanYonghuId;
		}
		/**
		* 设置：订单 的 用户
		*/
		public void setDingdanYonghuId(Integer dingdanYonghuId) {
			this.dingdanYonghuId = dingdanYonghuId;
		}

		/**
		* 获取： 购买数量
		*/
		public Integer getBuyNumber() {
			return buyNumber;
		}
		/**
		* 设置： 购买数量
		*/
		public void setBuyNumber(Integer buyNumber) {
			this.buyNumber = buyNumber;
		}

		/**
		* 获取： 购买物品
		*/
		public String getDingdanWupin() {
			return dingdanWupin;
		}
		/**
		* 设置： 购买物品
		*/
		public void setDingdanWupin(String dingdanWupin) {
			this.dingdanWupin = dingdanWupin;
		}

		/**
		* 获取： 照片
		*/
		public String getDingdanPhoto() {
			return dingdanPhoto;
		}
		/**
		* 设置： 照片
		*/
		public void setDingdanPhoto(String dingdanPhoto) {
			this.dingdanPhoto = dingdanPhoto;
		}

		/**
		* 获取： 收货地址
		*/
		public String getDingdanDizhi() {
			return dingdanDizhi;
		}
		/**
		* 设置： 收货地址
		*/
		public void setDingdanDizhi(String dingdanDizhi) {
			this.dingdanDizhi = dingdanDizhi;
		}

		/**
		* 获取： 实付价格
		*/
		public Double getDingdanTruePrice() {
			return dingdanTruePrice;
		}
		/**
		* 设置： 实付价格
		*/
		public void setDingdanTruePrice(Double dingdanTruePrice) {
			this.dingdanTruePrice = dingdanTruePrice;
		}

		/**
		* 获取： 快递公司
		*/
		public String getDingdanCourierName() {
			return dingdanCourierName;
		}
		/**
		* 设置： 快递公司
		*/
		public void setDingdanCourierName(String dingdanCourierName) {
			this.dingdanCourierName = dingdanCourierName;
		}

		/**
		* 获取： 快递单号
		*/
		public Integer getDingdanCourierNumber() {
			return dingdanCourierNumber;
		}
		/**
		* 设置： 快递单号
		*/
		public void setDingdanCourierNumber(Integer dingdanCourierNumber) {
			this.dingdanCourierNumber = dingdanCourierNumber;
		}
		/**
		* 获取： 订单类型
		*/
		public Integer getDingdanTypes() {
			return dingdanTypes;
		}
		/**
		* 设置： 订单类型
		*/
		public void setDingdanTypes(Integer dingdanTypes) {
			this.dingdanTypes = dingdanTypes;
		}


			/**
			* 获取： 订单类型的值
			*/
			public String getDingdanValue() {
				return dingdanValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setDingdanValue(String dingdanValue) {
				this.dingdanValue = dingdanValue;
			}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "KuaidiView{" +
			", kuaidiValue=" + kuaidiValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", dingdanUuidNumber=" + dingdanUuidNumber +
			", buyNumber=" + buyNumber +
			", dingdanWupin=" + dingdanWupin +
			", dingdanPhoto=" + dingdanPhoto +
			", dingdanDizhi=" + dingdanDizhi +
			", dingdanTruePrice=" + dingdanTruePrice +
			", dingdanCourierName=" + dingdanCourierName +
			", dingdanCourierNumber=" + dingdanCourierNumber +
			"} " + super.toString();
	}
}
