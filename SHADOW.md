#文档简介
>这个文档的作用是记录一下，实验室服务器开发环境的一些配置参数

##服务器系统
>CentOS 7

### / 目录
>50 GB

### /home 目录
>20 GB

### /var 目录
>200 GB
>在```/var/local/```下面放置了很多资料，包括学长留下来的资料。

###Root 密码
>记住谨慎使用，服务器崩了，谁弄蹦的谁重装！
```java
dbroom1411DB
```

##数据库管理系统
>MySQL 5.7

###MySQL Root 密码
> 不要轻易使用这个,dbworker 用户已经有databird数据库的所有操作权限了，mysql数据库整崩了自己重装。

```shell
dbroom1411DB+
```

###MySQL dbworker 密码
```shell
dbroom1411DB-
```

###启动MySQL
```shell
service mysqld start
```

###关闭MySQL
```shell
service mysqld stop
```

##JAVA WEB 容器
>APACHE TOMCAT 9

###启动 TOMCAT
```shell
startup.sh
```

### 关闭 TOMCAT
```shell
shutdown.sh
```

##WEB
>NGINX 1.10

###启动nginx
```shell
service nginx start
```

###关闭Nginx
```shell
service nginx stop
```
