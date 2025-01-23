package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ChongwuyongpinCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 商品评价
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("chongwuyongpin_commentback")
public class ChongwuyongpinCommentbackView extends ChongwuyongpinCommentbackEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 商品
		/**
		* 商品名称
		*/

		@ColumnInfo(comment="商品名称",type="varchar(200)")
		private String chongwuyongpinName;
		/**
		* 商品编号
		*/

		@ColumnInfo(comment="商品编号",type="varchar(200)")
		private String chongwuyongpinUuidNumber;
		/**
		* 商品照片
		*/

		@ColumnInfo(comment="商品照片",type="varchar(200)")
		private String chongwuyongpinPhoto;
		/**
		* 是否秒杀
		*/
		@ColumnInfo(comment="是否秒杀",type="int(11)")
		private Integer miaoshaTypes;
			/**
			* 是否秒杀的值
			*/
			@ColumnInfo(comment="是否秒杀的字典表值",type="varchar(200)")
			private String miaoshaValue;
		/**
		* 秒杀到期时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="秒杀到期时间",type="timestamp")
		private Date miaoshaTime;
		/**
		* 商品类型
		*/
		@ColumnInfo(comment="商品类型",type="int(11)")
		private Integer chongwuyongpinTypes;
			/**
			* 商品类型的值
			*/
			@ColumnInfo(comment="商品类型的字典表值",type="varchar(200)")
			private String chongwuyongpinValue;
		/**
		* 二级类型
		*/
		@ColumnInfo(comment="二级类型",type="int(11)")
		private Integer chongwuyongpinErjiTypes;
			/**
			* 二级类型的值
			*/
			@ColumnInfo(comment="二级类型的字典表值",type="varchar(200)")
			private String chongwuyongpinErjiValue;
		/**
		* 商品库存
		*/

		@ColumnInfo(comment="商品库存",type="int(11)")
		private Integer chongwuyongpinKucunNumber;
		/**
		* 购买获得积分
		*/

		@ColumnInfo(comment="购买获得积分",type="int(11)")
		private Integer chongwuyongpinPrice;
		/**
		* 商品原价
		*/
		@ColumnInfo(comment="商品原价",type="decimal(10,2)")
		private Double chongwuyongpinOldMoney;
		/**
		* 现价/积分
		*/
		@ColumnInfo(comment="现价/积分",type="decimal(10,2)")
		private Double chongwuyongpinNewMoney;
		/**
		* 商品热度
		*/

		@ColumnInfo(comment="商品热度",type="int(11)")
		private Integer chongwuyongpinClicknum;
		/**
		* 商品介绍
		*/

		@ColumnInfo(comment="商品介绍",type="text")
		private String chongwuyongpinContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer chongwuyongpinDelete;
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
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 总积分
		*/
		@ColumnInfo(comment="总积分",type="decimal(10,2)")
		private Double yonghuSumJifen;
		/**
		* 现积分
		*/
		@ColumnInfo(comment="现积分",type="decimal(10,2)")
		private Double yonghuNewJifen;
		/**
		* 会员等级
		*/
		@ColumnInfo(comment="会员等级",type="int(11)")
		private Integer huiyuandengjiTypes;
			/**
			* 会员等级的值
			*/
			@ColumnInfo(comment="会员等级的字典表值",type="varchar(200)")
			private String huiyuandengjiValue;



	public ChongwuyongpinCommentbackView() {

	}

	public ChongwuyongpinCommentbackView(ChongwuyongpinCommentbackEntity chongwuyongpinCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuyongpinCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 商品

		/**
		* 获取： 商品名称
		*/
		public String getChongwuyongpinName() {
			return chongwuyongpinName;
		}
		/**
		* 设置： 商品名称
		*/
		public void setChongwuyongpinName(String chongwuyongpinName) {
			this.chongwuyongpinName = chongwuyongpinName;
		}

		/**
		* 获取： 商品编号
		*/
		public String getChongwuyongpinUuidNumber() {
			return chongwuyongpinUuidNumber;
		}
		/**
		* 设置： 商品编号
		*/
		public void setChongwuyongpinUuidNumber(String chongwuyongpinUuidNumber) {
			this.chongwuyongpinUuidNumber = chongwuyongpinUuidNumber;
		}

		/**
		* 获取： 商品照片
		*/
		public String getChongwuyongpinPhoto() {
			return chongwuyongpinPhoto;
		}
		/**
		* 设置： 商品照片
		*/
		public void setChongwuyongpinPhoto(String chongwuyongpinPhoto) {
			this.chongwuyongpinPhoto = chongwuyongpinPhoto;
		}
		/**
		* 获取： 是否秒杀
		*/
		public Integer getMiaoshaTypes() {
			return miaoshaTypes;
		}
		/**
		* 设置： 是否秒杀
		*/
		public void setMiaoshaTypes(Integer miaoshaTypes) {
			this.miaoshaTypes = miaoshaTypes;
		}


			/**
			* 获取： 是否秒杀的值
			*/
			public String getMiaoshaValue() {
				return miaoshaValue;
			}
			/**
			* 设置： 是否秒杀的值
			*/
			public void setMiaoshaValue(String miaoshaValue) {
				this.miaoshaValue = miaoshaValue;
			}

		/**
		* 获取： 秒杀到期时间
		*/
		public Date getMiaoshaTime() {
			return miaoshaTime;
		}
		/**
		* 设置： 秒杀到期时间
		*/
		public void setMiaoshaTime(Date miaoshaTime) {
			this.miaoshaTime = miaoshaTime;
		}
		/**
		* 获取： 商品类型
		*/
		public Integer getChongwuyongpinTypes() {
			return chongwuyongpinTypes;
		}
		/**
		* 设置： 商品类型
		*/
		public void setChongwuyongpinTypes(Integer chongwuyongpinTypes) {
			this.chongwuyongpinTypes = chongwuyongpinTypes;
		}


			/**
			* 获取： 商品类型的值
			*/
			public String getChongwuyongpinValue() {
				return chongwuyongpinValue;
			}
			/**
			* 设置： 商品类型的值
			*/
			public void setChongwuyongpinValue(String chongwuyongpinValue) {
				this.chongwuyongpinValue = chongwuyongpinValue;
			}
		/**
		* 获取： 二级类型
		*/
		public Integer getChongwuyongpinErjiTypes() {
			return chongwuyongpinErjiTypes;
		}
		/**
		* 设置： 二级类型
		*/
		public void setChongwuyongpinErjiTypes(Integer chongwuyongpinErjiTypes) {
			this.chongwuyongpinErjiTypes = chongwuyongpinErjiTypes;
		}


			/**
			* 获取： 二级类型的值
			*/
			public String getChongwuyongpinErjiValue() {
				return chongwuyongpinErjiValue;
			}
			/**
			* 设置： 二级类型的值
			*/
			public void setChongwuyongpinErjiValue(String chongwuyongpinErjiValue) {
				this.chongwuyongpinErjiValue = chongwuyongpinErjiValue;
			}

		/**
		* 获取： 商品库存
		*/
		public Integer getChongwuyongpinKucunNumber() {
			return chongwuyongpinKucunNumber;
		}
		/**
		* 设置： 商品库存
		*/
		public void setChongwuyongpinKucunNumber(Integer chongwuyongpinKucunNumber) {
			this.chongwuyongpinKucunNumber = chongwuyongpinKucunNumber;
		}

		/**
		* 获取： 购买获得积分
		*/
		public Integer getChongwuyongpinPrice() {
			return chongwuyongpinPrice;
		}
		/**
		* 设置： 购买获得积分
		*/
		public void setChongwuyongpinPrice(Integer chongwuyongpinPrice) {
			this.chongwuyongpinPrice = chongwuyongpinPrice;
		}

		/**
		* 获取： 商品原价
		*/
		public Double getChongwuyongpinOldMoney() {
			return chongwuyongpinOldMoney;
		}
		/**
		* 设置： 商品原价
		*/
		public void setChongwuyongpinOldMoney(Double chongwuyongpinOldMoney) {
			this.chongwuyongpinOldMoney = chongwuyongpinOldMoney;
		}

		/**
		* 获取： 现价/积分
		*/
		public Double getChongwuyongpinNewMoney() {
			return chongwuyongpinNewMoney;
		}
		/**
		* 设置： 现价/积分
		*/
		public void setChongwuyongpinNewMoney(Double chongwuyongpinNewMoney) {
			this.chongwuyongpinNewMoney = chongwuyongpinNewMoney;
		}

		/**
		* 获取： 商品热度
		*/
		public Integer getChongwuyongpinClicknum() {
			return chongwuyongpinClicknum;
		}
		/**
		* 设置： 商品热度
		*/
		public void setChongwuyongpinClicknum(Integer chongwuyongpinClicknum) {
			this.chongwuyongpinClicknum = chongwuyongpinClicknum;
		}

		/**
		* 获取： 商品介绍
		*/
		public String getChongwuyongpinContent() {
			return chongwuyongpinContent;
		}
		/**
		* 设置： 商品介绍
		*/
		public void setChongwuyongpinContent(String chongwuyongpinContent) {
			this.chongwuyongpinContent = chongwuyongpinContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getChongwuyongpinDelete() {
			return chongwuyongpinDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setChongwuyongpinDelete(Integer chongwuyongpinDelete) {
			this.chongwuyongpinDelete = chongwuyongpinDelete;
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
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 总积分
		*/
		public Double getYonghuSumJifen() {
			return yonghuSumJifen;
		}
		/**
		* 设置： 总积分
		*/
		public void setYonghuSumJifen(Double yonghuSumJifen) {
			this.yonghuSumJifen = yonghuSumJifen;
		}

		/**
		* 获取： 现积分
		*/
		public Double getYonghuNewJifen() {
			return yonghuNewJifen;
		}
		/**
		* 设置： 现积分
		*/
		public void setYonghuNewJifen(Double yonghuNewJifen) {
			this.yonghuNewJifen = yonghuNewJifen;
		}
		/**
		* 获取： 会员等级
		*/
		public Integer getHuiyuandengjiTypes() {
			return huiyuandengjiTypes;
		}
		/**
		* 设置： 会员等级
		*/
		public void setHuiyuandengjiTypes(Integer huiyuandengjiTypes) {
			this.huiyuandengjiTypes = huiyuandengjiTypes;
		}


			/**
			* 获取： 会员等级的值
			*/
			public String getHuiyuandengjiValue() {
				return huiyuandengjiValue;
			}
			/**
			* 设置： 会员等级的值
			*/
			public void setHuiyuandengjiValue(String huiyuandengjiValue) {
				this.huiyuandengjiValue = huiyuandengjiValue;
			}


	@Override
	public String toString() {
		return "ChongwuyongpinCommentbackView{" +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			", yonghuSumJifen=" + yonghuSumJifen +
			", yonghuNewJifen=" + yonghuNewJifen +
			", chongwuyongpinName=" + chongwuyongpinName +
			", chongwuyongpinUuidNumber=" + chongwuyongpinUuidNumber +
			", chongwuyongpinPhoto=" + chongwuyongpinPhoto +
			", miaoshaTime=" + DateUtil.convertString(miaoshaTime,"yyyy-MM-dd") +
			", chongwuyongpinKucunNumber=" + chongwuyongpinKucunNumber +
			", chongwuyongpinPrice=" + chongwuyongpinPrice +
			", chongwuyongpinOldMoney=" + chongwuyongpinOldMoney +
			", chongwuyongpinNewMoney=" + chongwuyongpinNewMoney +
			", chongwuyongpinClicknum=" + chongwuyongpinClicknum +
			", chongwuyongpinContent=" + chongwuyongpinContent +
			", chongwuyongpinDelete=" + chongwuyongpinDelete +
			"} " + super.toString();
	}
}
