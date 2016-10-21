package demo.process;  
  
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import demo.entity.CsvUtil;
import demo.entity.ReceiveXmlEntity;  
  
/** 
 * 微信xml消息处理流程逻辑类 
 * @author pamchen-1 
 * 
 */  
public class WechatProcess {  
    /** 
     * 解析处理xml、获取智能回复结果（通过图灵机器人api接口） 
     * @param xml 接收到的微信数据 
     * @return  最终的解析结果（xml格式数据） 
     * 
     * 
     */
	
	 public String processWechatMag(String xml,String projectPath){
		 String result = "";  
	    	String fileName = null;
//		 	fileName = request.getServletPath().substring(1).replace('/', '_');

			fileName = projectPath + "01//2.csv";
	        try {
				/** 解析xml数据 */  
	        	String[] hangtou =CsvUtil.GetChengjihangtou(fileName);
				ReceiveXmlEntity xmlEntity = new ReceiveXmlProcess().getMsgEntity(xml);  
				Map<String, Map<String, String>>  map = CsvUtil.GetChengji(fileName);
				for (Entry<String, Map<String, String>> entry : map.entrySet()) {
					if(xml.contains(entry.getKey())){
						result = result + "学生姓名："+entry.getKey()+" ";
						for (int i = 1; i < hangtou.length; i++) {
							result = result + hangtou[i] +":"+entry.getValue().get(hangtou[i]) +"  ";
						}
					}
				}
	        result = new FormatXmlProcess().formatXmlAnswer(xmlEntity.getFromUserName(), xmlEntity.getToUserName(), result);  
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return result; 
	 }
//    public String processWechatMag(String xml){  
//    	String result = "你是大Pabo吗？";  
//    	
//    	
//        try {
//			/** 解析xml数据 */  
//			ReceiveXmlEntity xmlEntity = new ReceiveXmlProcess().getMsgEntity(xml);  
//			  
//			Map<String, Map<String, String>>  map = CsvUtil.GetChengji("D:\\Nonework\\001\\2.csv");
//			for (Entry<String, Map<String, String>> entry : map.entrySet()) {
//				if(xml.contains(entry.getKey())){
//					result = result + "学生姓名："+entry.getKey()+" ";
//					for (Entry<String, String> entry2 : entry.getValue().entrySet()) {
//						result = result + entry2.getKey() +":"+entry2.getValue()+" ";
//					}
//				}
//			}
//			
//			/** 以文本消息为例，调用图灵机器人api接口，获取回复内容 */  
//			
//			if(xml.contains("Pabo")){
//				result = "Pabo是大傻瓜";
//			}
//			if(xml.contains("成绩")){
//				result = "成绩还没统计好，不给看";
//			}
//			if(xml.contains("傻逼")){
//				result = "你才是大傻逼吧！";
//			}
//
////        if("text".endsWith(xmlEntity.getMsgType())){  
////            result = new TulingApiProcess().getTulingResult(xmlEntity.getContent());  
////        }  
//          
//        /** 此时，如果用户输入的是“你好”，在经过上面的过程之后，result为“你也好”类似的内容  
//         *  因为最终回复给微信的也是xml格式的数据，所有需要将其封装为文本类型返回消息 
//         * */  
//        result = new FormatXmlProcess().formatXmlAnswer(xmlEntity.getFromUserName(), xmlEntity.getToUserName(), result);  
//          
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        return result;  
//    }  
} 