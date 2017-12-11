package com.lhh.crmsystem.dao;

import com.lhh.crmsystem.entity.Custom;

public interface ICustomDao {

	/**
	 * 插入一个新的客户
	 * 
	 * @param custom
	 * @return
	 */
	public int insert(Custom custom);

	/**
	 * 通过一个ID删除员工
	 * 
	 * @param id
	 * @return
	 */
	public int deleteById(Integer id);

	/**
	 * 修改客户信息
	 * 
	 * @param custom
	 * @return
	 */
	public int updateByObj(Custom custom);

	/**
	 * 通过ID来查找一个客户信息
	 * 
	 * @param id
	 * @return
	 */
	public Custom queryById(Integer id);

	/**
	 * 动态查询（条件查询）
	 * 
	 * @param custom
	 * @return
	 */
	public Custom queryByObj(Custom custom);

}
