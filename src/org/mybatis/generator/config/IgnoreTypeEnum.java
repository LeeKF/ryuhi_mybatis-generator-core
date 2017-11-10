package org.mybatis.generator.config;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 如果一个被忽略的字段，只是在某些SQL操作场合被忽略
 * 按照已有的代码，是做不到区分这些场合的，因此定义本
 * 枚举类，用以区分
 * @author 张晖
 *
 */
@AllArgsConstructor
public enum IgnoreTypeEnum {
	
	NONE("none"),
	
	SELECT("select"),
	
	INSERT("insert"),
	
	UPDATE("update"),
	
	DELETE("delete");
	
	@Getter
	private String value;
	
	public static List<String> getIgnoreTypeList() {
		List<String> list = new CopyOnWriteArrayList<>();
		for (IgnoreTypeEnum ite : IgnoreTypeEnum.values()) {
			list.add(ite.getValue());
		}
		return list;
	}

	public static String getEnumName(String value) {
		if (value == null || value.length() == 0) {
			return null;
		}
		String name = null;
		for (IgnoreTypeEnum ite : IgnoreTypeEnum.values()) {
			if (ite.getValue().equalsIgnoreCase(value)) {
				name = ite.name();
				break;
			}
		}
		return name;
	}
}
