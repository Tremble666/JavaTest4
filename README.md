# JavaTest4
Spring + Mybatis

## 运行
运行指令 'bash build.sh'

#### 说明几点问题
1. 第四题的Context Start/stop的代码在config包下
2. 第五，六题的代码在util包下，配置在applicationContext-mybatis.xml文件最下方
3. applicationContext-mybatisbak.xml和dbbakproperties是我的测试文件，与项目最终结果无关
4. FilmService中有两个插入方法，一个对应异常回滚，一个对应正确插入