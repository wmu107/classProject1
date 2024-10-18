# 10.18 Spring Security 项目实战
## 介绍
- **历史-> hash 彩虹表加密 -> salt加盐 明文**
    - hash表加密不可逆
    - salt加盐，例： dog12345，但彩虹表中只会记录后面数字的hash表（有意义的、……），dog 明文不可知
- spring-security-study
    - 01<br>
        实现登录界面，密码由系统生成
    - 02<br>
        实现登录界面，密码由用户自定义, 实现自定义用户密码，参照spring官方文档，自定义用户信息:
      [spring security](https://docs.spring.io/spring-security/reference/servlet/authentication/passwords/index.html)