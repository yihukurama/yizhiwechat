/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月4日 下午7:00:01
 */
package iecheck.yizhiwechat.framework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iecheck.yizhiwechat.framework.entity.WechatUserInfoYizhi;
import iecheck.yizhiwechat.framework.entity.mapper.WechatUserInfoYizhiMapper;

/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月4日 下午7:00:01
 */
@Service
public class WechatUserService {
	@Autowired
	WechatUserInfoYizhiMapper mapper;
	
	public void insertWechatUser(){
		WechatUserInfoYizhi user = new WechatUserInfoYizhi();
		user.setNickname("dengshuai");
		user.setOpenid("123");
		user.setHeadicon("1243");
		mapper.insert(user);
	}
}
