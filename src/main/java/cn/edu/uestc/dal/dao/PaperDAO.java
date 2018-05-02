/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.dal.dao;

import cn.edu.uestc.model.Paper;

import java.util.List;

/**
 * 论文 DAO
 *
 * @author feixuan.fx
 * @version $Id: PaperDAO.java, v 0.1 2018-05-02 18:05 feixuan.fx Exp $
 */
public interface PaperDAO {

    /**
     * 查询所有论文
     *
     * @return 结果集
     */
    List<Paper> queryAll();

}