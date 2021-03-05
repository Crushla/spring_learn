##常用依赖
```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.4.RELEASE</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>5.2.4.RELEASE</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
```
##注解说明
@Autowired:自动装配通过类型。名字
    如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx")
@Nullable:字段标记了这个注解，说明这个字段可以为null
@Autowired:自动装配通过名字。类型
@Component:组件，放在类上就被spring管理了，就是bean
@Component有几个衍生注解。mvc三层架构
dao层用@Repository
service层用@Service
controller层用@Controller
这四个注解功能全一样，都是代表某个类注册到spring中,装配Bean
@Scope选择作用域
