/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.dal.dao;

import cn.edu.uestc.model.Paper;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * 论文 DAO
 *
 * @author feixuan.fx
 * @version $Id: PaperDAO.java, v 0.1 2018-05-02 18:05 feixuan.fx Exp $
 */
public interface PaperDAO {

    /**
     * selectAllPaper
     *
     * @return result
     */
    List<Paper> selectAllPaper() throws DataAccessException;

    /**
     * insertPaper
     *
     * @param paper paper
     * @return result
     */
    long insertPaper(Paper paper) throws DataAccessException;

}