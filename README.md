# ryuhi_mybatis-generator-core
The custiomize version of mybatis-generator-core by ryuhi

【CHANGELOG】
2017.11.10
 1. 将判断用的distinct改为小写，XML里如果判断用的distinct是大写将无法识别该属性报错
 
2017.09.21

 1. 增加Lombok插件，生成的Entity添加Lombok的注解，不需要再生成Getter/Setter方法，项目中引入Lombok的Jar包即可。
 2. 修改时间属性的Java类型，在JRE版本为1.8及以上时，直接使用Java8的时间类LocalDateTime、LocalDate、LocalTime等。
 3. 根据类和生成时间，给生成的Entity添加动态计算的serialVersionUID
