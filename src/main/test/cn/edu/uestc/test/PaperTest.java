/**
 * Alipay.com
 * <p>
 * Inc.
 * Copyright (c) 2004-2018 All Rights Reserved
 */

package cn.edu.uestc.test;

import cn.edu.uestc.model.Paper;
import cn.edu.uestc.service.PaperService;
import cn.edu.uestc.template.ServiceResult;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
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
    private PaperService paperService;

    /**
     * 测试插入论文论文
     *
     * @throws Exception
     */
    @Test
    public void testInsertPaper() {
        List<Paper> papers = new ArrayList<>();
        Paper p1 = new Paper();
        p1.setName("测试论文1");
        Paper p2 = new Paper();
        p2.setName("测试论文2");
        Paper p3 = new Paper();
        p3.setName("测试论文3");
        Paper p4 = new Paper();
        p4.setName("测试论文4");
        papers.add(p1);
        papers.add(p2);
        papers.add(p3);
        papers.add(p4);
        ServiceResult res = paperService.addPapers(papers);
        System.out.println(res.isSuccess());
        System.out.println(res.getResultCode().getDescription());
    }
}
