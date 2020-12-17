# cloud2020
## 前言

This is a new Project ,which beigins at 2020 12 10 ,aiming at studying SpringCloud and SpringCloudAlibaba

Before we get started , we should make some preparation works.

So! los'geht!

# 准备工作1.0
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

### 2. 同步代码
+ 2.1 clone代码
   + git clone git@github.com:******

+ 2.2 设置用户名跟邮箱 （跟GitHub保持一致）
   + git config --global user.name "your name"

   + git config --global user.email "your_email"
+ 2.3 修改内容后将修改后的内容从工作区加载到暂存区
   + git add可以添加文件或者目录，也可以使用通配符。比如：

   +  git add Readme.md    # add file only

   +  git add *.cpp        # add all cpp files

   +  git add /home/code/  # add all files in /home/code
+ 2.4  git diff 查看当前目录的所有修改
    + 可以使用git diff --staged或git diff --cached查看staged与上次提交快照之间的区别。

      
+ 2.5 git commit 将暂存区的文件提交到本地仓库

   + 提交前需慎重。直接调用git commit会弹出编辑器，输入提交日志（如果是多行日志，建议使用）。
   + 针对单行日志提交的情况，可以使用如下命令：git commit -m "add readme"。
   + 还有一种快捷的提交方式，直接跳过stage缓存区，直接提交当前目录下的所有修改git commit -a（使用这个命令前建议确认下当前目录的修改是否正确、必须）。

+ 2.6 git push -u origin master 第一次将代码同步到远程仓库

   + -u指定了默认的远程主机及其分支追踪关系，之后只需执行 
   git push 即可
   + 完整语句为 git push <远程主机> <远程主机的分支>

+ 2.7 git fetch 和 git pull可将远程分支代码下载到本地

   + 完整语句如下 
      + git fetch <远程主机名> <分支名> //注意之间有空格
      +  git pull <远程主机名> <远程分支名>:<本地分支名>
   
   + 两者区别
      + git pull 等同于 git fetch + git merge
      git fetch 只把代码同步到本地并没有跟本地代码进行合并 

<center><h2>----------------至此git基本使用说明完毕---------------</h2></center>
<br>


# 准备工作2.0


## 数据库安装使用(请根据自身情况自行学习：略)

# 准备工作3.0
idea添加实体类和方法的注释
live templates 模板<br>
方法注释：

\*

&nbsp; \* @author: $author$<br>
&nbsp; \* @description: TODO<br>
&nbsp; \* @date: $date$ $time$<br>
&nbsp; $params$<br>
&nbsp; $return$<br>
 */

 使用时输入/* （再按tab）<br>
 实体类注释：<br>

 /**<br>
 \* @description：<br>
 \* @author     ：${USER}<br>
 \* @date       ：${DATE} ${TIME}<br>
 */


<center><h2>----------------至此准备工作完毕---------------</h2></center>
<br>



