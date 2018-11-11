# SpringData-Demo
SpringData-Demo
1、搭建了SpringData-HelloWorld 模块，完成了表的自动创建，数据的初始化，注意这里
 spring配置文件中，<prop key="hibernate.hbm2ddl.auto">udpate</prop>，当表不存在时可以将update修改为create
 实现自动创建表。
 
2、搭建了SpringData-RepositoryDefinition模块，这个模块主要演示了@RepositoryDefinition注解，如果不继承Repository
接口，可以使用@RepositoryDefinition注解代替。

3、搭建了SpringData-QueryRule模块，演示查询方法的编写规则，演示前需要借助SpringData-HelloWorld模块做一些初始化数据

 