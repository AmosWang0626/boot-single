# boot-single

> Spring Boot 单模块

滴墨，轻浊杯水，难浊条河！

## **姊妹篇 Spring Boot 多模块**

- [Maven架构选型，单模块还是多模块？](https://my.oschina.net/AmosWang/blog/4951326)
- [Spring Boot 多模块入门](https://my.oschina.net/AmosWang/blog/1606165)
- [https://github.com/AmosWang0626/boot](https://github.com/AmosWang0626/boot)

## 化繁为简

> 之前代码比较复杂，有违项目初衷，于 2021-02-09 重构

**项目定位**：Spring Boot 单模块实战

### 技术栈

- Spring Boot 2.4.0
- JPA（自动建表、基础增删改查）
- MyBatis（复杂 SQL 逻辑处理）
- h2database（内存数据库，本项目运行无需准备数据库环境）

### 相关链接

##### 1、h2database

浏览器中就可以连接数据库

[http://127.0.0.1:8080/h2/](http://127.0.0.1:8080/h2/)

##### 2、用户管理主页面

> 可以运行测试方法，初始化数据（boot-web > test > BootApplicationTests）

[http://127.0.0.1:8080/user?page=1&size=10](http://127.0.0.1:8080/user?page=1&size=10)