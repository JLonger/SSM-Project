# 使用IDEA创建Maven多模块聚合项目

## 1、创建父项目

点击File ——New —— Project，选择Maven项目，直接Next然后添加信息进行创建即可。



## 2、创建子项目

### 1、创建java项目

点击父项目右键New——Module创建，之后和创建父项目一样，创建一个空的项目即可。



### 2、创建Web项目

点击父项目右键New——Module创建，选择Maven项目，然后把对勾打上，然后选择中间的webapp选项，进行创建web项目。





## 3、添加依赖



### 说明

在进行不同子模块项目的依赖添加后，可以对不同子模块项目之间进行访问，比如说：web模块中需要dao模块和service模块中的实体类、dao类、service类的使用，添加依赖后，可以直接在web模块中导入这些类进行使用。





### 1、给子项目创建版本

~~~
刚创建完成的子项目中的pom.xml文件中：找到<artifactId>module_dao</artifactId>
然后在其之后添加如下配置即可：
    <groupId>com.module.demo</groupId>
    <version>${package.env}</version>
    
说明：
无论是java类型的子项目还是web类型的子项目在添加版本时是一样的。
~~~



### 2、添加依赖

~~~
比如说：module_web项目要依赖module_dao项目，那么在module_web项目的pom.xml文件中添加如下配置：

		<dependency><!--依赖module_dao-->
            <groupId>com.module.demo</groupId>
            <artifactId>module_dao</artifactId>
            <version>${package.env}</version>
		</dependency>
		
		————这是web项目依赖java项目
		
如果是web项目中依赖web项目的话，需要如下配置：
		<dependency><!--依赖module_web2-->
            <groupId>com.module.demo</groupId>
            <artifactId>module_web2</artifactId>
            <version>${package.env}</version>
            <type>war</type>
		</dependency>
		
		————需要增加一个type标签，指定依赖的项目是web项目(打包为war包)。
		
说明：
依赖几个项目，就需要在当前项目的pom.xml文件中添加几个依赖(dependency标签)。
~~~



### 3、打包聚合信息运行

~~~
点击右侧的Maven Projects列表，找到父项目Module_Project目录，然后点击打开Lifecycle选项，找到package模块，左键双击即可将不同子模块之间的依赖配置进行整体打包。

如果在配置中出现错误，并进行修改后，需要左键双击package后面的install模块，进行修改后依赖信息的安装(相当于重新打包)，然后配置其父项目的tomcat进行运行。
~~~





## 4、说明

### 1、冲突

~~~
当两个有依赖关系的模块中的内容有重复时，会以当前模块的内容为主。

解释：
当web模块依赖web2模块时，web模块中的pom.xml文件中会有web2模块的引用，web模块中有index.jsp页面，web2中有index.jsp和index2.jsp页面，当这两个模块同时启动后，访问web模块中的index.jsp页面时显示的是web中的index.jsp页面；而访问index2.jsp时本应该报错404(因为web模块中没有index2.jsp页面)，但是这时候显示的是web2中的index2.jsp页面。
~~~

