package com.perfree.common;

import java.util.UUID;

/**
 * String类型操作工具类
 * @author Perfree
 *
 */
public class StringUtil {

	/**
	 * 获取UUID
	 */
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-", ""); 
	}
}
