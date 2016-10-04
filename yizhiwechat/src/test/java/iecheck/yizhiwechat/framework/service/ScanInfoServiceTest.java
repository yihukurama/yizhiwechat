/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月4日 下午7:43:04
 */
package iecheck.yizhiwechat.framework.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import iecheck.yizhiwechat.App;

/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月4日 下午7:43:04
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = App.class)
public class ScanInfoServiceTest {

	@Autowired
	ScanInfoService service;
	
	@Test
	public void testInsertInfo() {
		service.insertScanInfo();
	}

}
