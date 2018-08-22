package com.jing.account.dao;

import com.jing.account.po.AccountPO;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author codegen 2018-08-21 15:46:26
 */
public interface AccountDao {

    //登陆方法
    AccountPO findByNamePwd(AccountPO accountPO);


    /**
     * 查找单个
     *
     * @param id
     * @return account
     */
    public AccountPO find(Serializable id);

    /**
     * 查找所有
     *
     * @return List<AccountPO>
     */
    public List<AccountPO> findAll();

    /**
     * 创建
     *
     * @param po
     */
    public void create(AccountPO po);

    /**
     * 修改
     *
     * @param po
     */
    public void update(AccountPO po);

    /**
     * 删除
     *
     * @param id
     */
    public void delete(Serializable id);

    /**
     * 查找所有
     * 注此方法后台用
     */
    public List<AccountPO> listForPage(Map<String, Object> conds);

    /**
     * 组删除
     *
     * @param id
     */
    public void deletes(Serializable[] id);

}