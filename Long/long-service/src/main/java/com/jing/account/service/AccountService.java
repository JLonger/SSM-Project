package com.jing.account.service;

import com.jing.account.po.AccountPO;

import java.io.Serializable;
import java.util.List;

public interface AccountService {


    //验证用户名密码
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
    public void create(AccountPO po) throws Exception;

    /**
     * 修改
     *
     * @param po
     */
    public void update(AccountPO po) throws Exception;

    /**
     * 删除
     *
     * @param id
     */
    public void delete(Serializable id) throws Exception;

    /**
     * 删除
     *
     * @param ids
     */
    public void deletes(Serializable[] ids) throws Exception;
}