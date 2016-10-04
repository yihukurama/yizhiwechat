/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月4日 下午7:40:51
 */
package iecheck.yizhiwechat.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iecheck.yizhiwechat.framework.entity.ScanInfo;
import iecheck.yizhiwechat.framework.entity.mapper.ScanInfoMapper;

/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月4日 下午7:40:51
 */
@Service
public class ScanInfoService {
	@Autowired
	ScanInfoMapper mapper;
	
	public void insertScanInfo(){
		ScanInfo info = new ScanInfo();
		info.setOpenid("123");
		info.setType(2);
		mapper.insert(info);
	}
}
