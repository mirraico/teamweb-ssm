/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.test;

import cn.edu.uestc.dal.dao.PaperDAO;
import cn.edu.uestc.model.Paper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 论文测试类
 *
 * @author feixuan.fx
 * @version $Id: PaperTest.java, v 0.1 2018-05-02 18:07 feixuan.fx Exp $
 */
public class PaperTest extends BaseTest {

    /**
     * 论文 DAO
     */
    @Autowired
    private PaperDAO paperDAO;

    /**
     * 测试查询所有论文
     *
     * @throws Exception
     */
    @Test
    public void testQueryAll() throws Exception {
        List<Paper> papers = paperDAO.queryAll();
        for (Paper p : papers) {
            System.out.println(p.getId() + " " + p.getName());
        }
    }
}
