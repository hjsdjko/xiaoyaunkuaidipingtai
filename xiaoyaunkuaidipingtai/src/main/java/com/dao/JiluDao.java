package com.dao;

import com.entity.JiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiluView;

/**
 * 快递记录 Dao 接口
 *
 * @author 
 */
public interface JiluDao extends BaseMapper<JiluEntity> {

   List<JiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
