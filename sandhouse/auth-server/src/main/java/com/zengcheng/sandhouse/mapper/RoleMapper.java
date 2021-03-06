package com.zengcheng.sandhouse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zengcheng.sandhouse.entity.Role;
import com.zengcheng.sandhouse.vo.RoleVO;

import java.util.List;

/**
 * <p>
 * 角色表; InnoDB free: 10240 kB Mapper 接口
 * </p>
 *
 * @author zengcheng
 * @since 2019-04-16
 */
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 通过adminId查询某管理员拥有角色
     * @param adminId
     * @return
     */
    List<RoleVO> selectRolesByAdminId(Integer adminId);

}
