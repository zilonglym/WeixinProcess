package com.geekxueyuan.servlet;


import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class WechatCallbackApi extends HttpServlet {
    // 自定义 token
    private String TOKEN = "schooler1";
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//    	Map<String,Object> maps = new HashMap<String, Object>();
////    	maps.put("signature", request.getParameter("signature"));
////    	maps.put("echostr", request.getParameter("echostr"));
////    	maps.put("timestamp", request.getParameter("timestamp"));
////    	maps.put("nonce", request.getParameter("nonce"));
//    	
//    	maps.put("signature", "4f446b28f6a878199ac0d4ffd577a5cd5ce58ab1");
//    	maps.put("echostr", "4723467328447839740");
//    	maps.put("timestamp", "1476975084");
//    	maps.put("nonce", "147247463");
//    	
//    	
//    	String digest = null;
//		try {
//			digest = SHA1.GetSHA1(maps);
//		} catch (DigestException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	
        // 微信加密签名
        String signature = request.getParameter("signature");
        // 随机字符串
        String echostr = request.getParameter("echostr");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");

        String[] str = { TOKEN, timestamp, nonce };
        Arrays.sort(str); // 字典序排序
        String bigStr = str[0] + str[1] + str[2];
        // SHA1加密
        String digest = new SHA1().getDigestOfString(bigStr.getBytes()).toLowerCase();

        // 确认请求来至微信
        if (digest.equals(request.getParameter("signature"))) {
        	System.out.println("Token 验证成功");
            response.getWriter().print(request.getParameter("echostr"));
        }else{
        	System.out.println("Token 验证失败");
        }
    }
}