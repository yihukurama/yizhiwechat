package iecheck.yizhiwechat.framework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * 功能描述: 基础通用接口
 * @Author:dengshuai
 * @Date:2016年10月4日 下午1:50:17
 */
@RestController
public class CommonCtrl {

	@ApiOperation(value="获取短信验证码", notes="")
    @RequestMapping(value = "/getcode", method = RequestMethod.GET)
    public String getCode(@RequestParam String phone) {
		//1.生成验证码
		//2.把该验证码和手机号存入数据库
		//3.调用聚合数据发送短信接口
        return "Hello World";
    }
	
	@ApiOperation(value="验证短信验证码", notes="")
    @RequestMapping(value = "/validatecode", method = RequestMethod.GET)
    public String validateCode(@RequestParam String phone,@RequestParam String code) {
		//1.比较数据库中验证码和手机号
		//2.正确验证通过，否则失败
        return "Hello World";
    }

}