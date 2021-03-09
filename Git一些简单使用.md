1. 
创建本地分支,切换分支
假设远程仓库只有main分支

git clone https://github.com/main.git 

2. 
此时会在本地生成一个main分支，用git branch --all 查看全部分支

git checkout -b xxx  //创建并选择分支  相当于  git branch xxx  //创建分支
git checkout xxx //选择分支

然后

git push origin xxx  //这样远程仓库也有一个xxx分支了

3. 
此时如果直接git push 会报错，因为没有创建本地dev和远程origin/dev的关联，
可通过git branch -vv查看本地分支和远程分支的关联关系

git branch -vv

4. 
通过git branch --set-upstream 创建关联关系，就可以直接git push 提交
git branch --set-upstream dev origin/xxx

5. 
假如远程分支已存在，可在创建本地分支时与远程分支关联

git checkout -b dev origin/xxx


6. 
合并分支

git checkout master
git merge dev  //合并本地分支
git push origin master   //推送至远程master即为合并后的分支

7. 
删除分支

git branch -d dev  //删除本地分支
git push origin -d dev  //删除远程分支


本地同步到远程

新建项目中输入

git init 

git add *

git commit -m "提交说明"

使用步骤2中的 git checkout -b xxx 创建并切换分支

然后

git remote add origin 你GitHub仓库的url

组后

git push -u origin xxx

exit