# cloud2020
This is a new Project ,which beigins at 2020 12 10 ,aiming at studying SpringCloud and SpringCloudAlibaba
开始学习springcloud 还有 springcloudalibaba

## git 从零开始使用步骤
### 1.准备工作
+ 1.1 配秘钥
    + ssh-keygen -t rsa -C "your_email"
+ 1.2 查看秘钥
   + cat ~/.ssh/id_rsa.pub

+ 1.3 GitHub设置秘钥完毕后查看秘钥是否生效
     + ssh -T git@github.com
+ 1.4 提示如下内容表示成功
   + “You’ve successfully authenticated, but GitHub does not provide shell access 。”

### 2. 连接GitHub
+ 2.1 clone代码
   + git clone git@github.com:******

+ 2.2 设置用户名跟邮箱 （跟GitHub保持一致）
   + git config --global user.name "your name"

   + git config --global user.email "your_email"
+ 2.3 