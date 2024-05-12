package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 快递记录
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jilu")
public class JiluView extends JiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 快递记录类型的值
	*/
	@ColumnInfo(comment="快递记录类型的字典表值",type="varchar(200)")
	private String jiluValue;

	//级联表 快递
					 
		/**
		* 快递 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer kuaidiYonghuId;
							/**
		* 快递名称
		*/

		@ColumnInfo(comment="快递名称",type="varchar(200)")
		private String kuaidiName;
		/**
		* 快递编号
		*/

		@ColumnInfo(comment="快递编号",type="varchar(200)")
		private String kuaidiUuidNumber;
		/**
		* 快递照片
		*/

		@ColumnInfo(comment="快递照片",type="varchar(200)")
		private String kuaidiPhoto;
		/**
		* 快递类型
		*/
		@ColumnInfo(comment="快递类型",type="int(11)")
		private Integer kuaidiTypes;
			/**
			* 快递类型的值
			*/
			@ColumnInfo(comment="快递类型的字典表值",type="varchar(200)")
			private String kuaidiValue;
		/**
		* 快递介绍
		*/

		@ColumnInfo(comment="快递介绍",type="longtext")
		private String kuaidiContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer kuaidiDelete;
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



	public JiluView() {

	}

	public JiluView(JiluEntity jiluEntity) {
		try {
			BeanUtils.copyProperties(this, jiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 快递记录类型的值
	*/
	public String getJiluValue() {
		return jiluValue;
	}
	/**
	* 设置： 快递记录类型的值
	*/
	public void setJiluValue(String jiluValue) {
		this.jiluValue = jiluValue;
	}


	//级联表的get和set 快递
		/**
		* 获取：快递 的 用户
		*/
		public Integer getKuaidiYonghuId() {
			return kuaidiYonghuId;
		}
		/**
		* 设置：快递 的 用户
		*/
		public void setKuaidiYonghuId(Integer kuaidiYonghuId) {
			this.kuaidiYonghuId = kuaidiYonghuId;
		}

		/**
		* 获取： 快递名称
		*/
		public String getKuaidiName() {
			return kuaidiName;
		}
		/**
		* 设置： 快递名称
		*/
		public void setKuaidiName(String kuaidiName) {
			this.kuaidiName = kuaidiName;
		}

		/**
		* 获取： 快递编号
		*/
		public String getKuaidiUuidNumber() {
			return kuaidiUuidNumber;
		}
		/**
		* 设置： 快递编号
		*/
		public void setKuaidiUuidNumber(String kuaidiUuidNumber) {
			this.kuaidiUuidNumber = kuaidiUuidNumber;
		}

		/**
		* 获取： 快递照片
		*/
		public String getKuaidiPhoto() {
			return kuaidiPhoto;
		}
		/**
		* 设置： 快递照片
		*/
		public void setKuaidiPhoto(String kuaidiPhoto) {
			this.kuaidiPhoto = kuaidiPhoto;
		}
		/**
		* 获取： 快递类型
		*/
		public Integer getKuaidiTypes() {
			return kuaidiTypes;
		}
		/**
		* 设置： 快递类型
		*/
		public void setKuaidiTypes(Integer kuaidiTypes) {
			this.kuaidiTypes = kuaidiTypes;
		}


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

		/**
		* 获取： 快递介绍
		*/
		public String getKuaidiContent() {
			return kuaidiContent;
		}
		/**
		* 设置： 快递介绍
		*/
		public void setKuaidiContent(String kuaidiContent) {
			this.kuaidiContent = kuaidiContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getKuaidiDelete() {
			return kuaidiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setKuaidiDelete(Integer kuaidiDelete) {
			this.kuaidiDelete = kuaidiDelete;
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
		return "JiluView{" +
			", jiluValue=" + jiluValue +
			", kuaidiName=" + kuaidiName +
			", kuaidiUuidNumber=" + kuaidiUuidNumber +
			", kuaidiPhoto=" + kuaidiPhoto +
			", kuaidiContent=" + kuaidiContent +
			", kuaidiDelete=" + kuaidiDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
