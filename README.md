# CSTheory
Lvsi's Blog：计算机科学理论（Lvsi's Blog：The Theories of Computer Science ）. [前往博客](https://lvsi-china.github.io/CSTheory/)

<br>

## ♨ 介绍

没错，这个仓库就是我唯一使用且永久更新的技术博客。个人觉得用github仓库更方便一些，于是就使用它作为自己的技术沉淀和不定时的总结了。

[博客地址](https://lvsi-china.github.io/CSTheory/)<br/>
[博客 github 仓库地址](https://github.com/Lvsi-China/CSTheory)

```
由于我以前习惯使用某云存储笔记作为技术知识存储( 简单方便 )，
但后期发现云笔记这种产品不太可靠，还是自己管理更放心。
所以某段时间可能会大量的把之前笔记中的技术文章搬运到这个博客中，请不要见怪。
```

能力有限，难免写错，有错误的地方，大家可以在 Issues 里回复，我虚心接受一切正确的批评并及时更正。谢谢！

> 另外推荐：我的 [Akama](https://github.com/Lvsi-China/Akama) 项目组织, 专门翻译国外计算机领域相关文章资料，欢迎有意者加入！<br>
> 仓库地址 : [Akama](https://github.com/Lvsi-China/Akama)<br>
> 官方网站 : [lvsi-china.github.io](https://lvsi-china.github.io/)

<br>

## ✍ 博客文章分类

### (1) 数据结构与算法

请查看 [深入于心的数据结构和算法( Deep in the Heart of Data Structures And Algorithms )](https://lvsi-china.github.io/AlgorithmRise/)


### (2) 计算机组成原理

- #### 1. 数制系统

- #### 2. 存储系统
    - [虚拟存储器的基础理论](https://github.com/Lvsi-China/VirtualMemory)


- #### 3. 指令系统
    - [重点掌握指令的格式]()
    - [理解指令的寻址和数据的寻址]()
    - [了解 CISC 和 RISC]()

- #### 4. 中央处理器
    - [了解CPU的功能和结构]()
    - [了解数据通路]()
    - [深入理解指令执行的过程]()
    - [理解控制器]()
    - [流水线CPU]()

- #### 5. 总线
    - [总线的重要认识和理解]()
    - [关于总线的仲裁]()
    - [总线操作和定时]()
    - [总线标准]()

- #### 6. 输入/输出系统
    - [I/O系统的重要认识和理解]()
    - [关于I/O接口（I/O控制器）]()
    - [I/O方式的介绍 - 程序查询、程序中断、DMA、通道]()

- #### 问题总结

    - [编程语言/计算机中的 Timer 和 Tick 是指什么？]()


### (3) 计算机网络

### (4) 数据库系统
- [关系型数据库系统的基础理论](https://github.com/Lvsi-China/Sherk/blob/master/docs/README.chapter3.md)
- [SQL的执行原理和优化原理](https://github.com/Lvsi-China/SmaugSQL)
- [非关系型数据库系统的基础理论](https://github.com/Lvsi-China/CSTheory/blob/master/docs/nosql.md)
- [数据库系统集群的基础理论和架构](https://github.com/Lvsi-China/Sherk/blob/master/docs/README.chapter3.md)

### (5) 操作系统

### (6) Linux

### (7) 并发探究

- [竞争]()
- [原子操作]()
- [信号量]()
- [锁机制]()

- ##### 并发模型
    - [多进程]()
    - [多线程]()
    - [协程]()
    - [CSP 模型]()
    - [Actor 模型]()
    - [生产者消费者模型（Producer-Consumer）]()


### (8) IO处理

	
- #### 介绍
	
	
	<!--  https://www.cnblogs.com/lixiang1013/p/7105404.html
	（1）每收到一个请求，创建一个新的进程，来处理该请求；
	（2）每收到一个请求，创建一个新的线程，来处理该请求；
	（3）每收到一个请求，放入一个事件列表，让主进程通过非阻塞I/O方式来处理请求
	上面的几种方式，各有千秋，
	第（1）中方法，由于创建新的进程的开销比较大，所以，会导致服务器性能比较差,但实现比较简单。
	第（2）种方式，由于要涉及到线程的同步，有可能会面临死锁等问题。
	第（3）种方式，在写应用程序代码时，逻辑比前面两种都复杂。
	综合考虑各方面因素，一般普遍认为第（3）种方式是大多数网络服务器采用的方式 -->
	

	<!--之所以先经过内存IO，是因为先从缓存中查找数据，缓存中没数据时才从磁盘中获取-->
	- [客户端向服务器请求数据，会按顺序经过这3个IO：网络IO -> 内存IO ->磁盘IO ]()
	- [Redis为什么一般比Mysql速度块]() <!-- 因为内存IO是远大于磁盘IO的 -->
	- [(转)网络IO和磁盘IO效率问题？](https://www.zhihu.com/question/47589908)
    - [IO处理中的同步和异步]() <!--同步和异步是属于消息通讯部分的技术,显然IO肯定需要用到这种技术-->
    - [IO处理中的阻塞和非阻塞]()
    - [服务器常用的IO模型]() <!--一个请求一个进程(PHP)，一个请求一个线程(Java)，一个请求一个进程一个线程，使用事件循环方式(NodeJS)-->


- #### 网络IO

    <!-- 见PHP的 reactphp/event-loop , reactphp/event-loop 使用到了 libevent -->
	- [关于 libevent 的介绍讲解]()<!--连PHP都有 libevent https://pecl.php.net/package/libevent -->
	- [(转) 知乎：libevent的异步怎么理解？](https://www.zhihu.com/question/23429855)<!-- 这个要放到上面文章中的参考中，我现在写这只是为了防止忘记 -->
	- [几种网络IO模型]()
	- [(转) Unix 网络 IO 模型: 同步异步, 傻傻分不清楚?](https://segmentfault.com/a/1190000007355931)

- #### 磁盘IO


- #### 内存IO


### (9) 工程开发问题

#### 设计模式

#### 程序设计模型

- ##### 依赖处理
    - [依赖注入（DI）]()
    - [面向切面编程（AOP）]()
    - [对象关系映射（ORM）]()
    - [鸭子类型（Duck Typing）]()
    - [控制反转 & 控制反转容器 （IOC & IOC Container）]()

- ##### 流程控制

    - [异常捕获（Catch Exception）]()
    - [钩子编程（Hooking）]()
    - [管道模型（Pipeline）]()

- ##### 消息通讯

	- [同步和异步]()<!--同步和异步是属于消息通讯部分的技术-->
    - [异步的实现方法]()
    - [(转)阮一峰：Javascript异步编程的4种方法](http://www.ruanyifeng.com/blog/2012/12/asynchronous%EF%BC%BFjavascript.html)
    - [(转)JS 异步的实现](https://segmentfault.com/a/1190000012362556)
    - [事件驱动模型（Event-driven）]()
    - [事件循环与异步处理]()
    - [队列系统与异步处理]()
    - [消息广播（Broadcasting）]()
    - [发布/订阅]()

#### 网络编程


#### 程序的编译安装

- [关于 GCC & G++ ]()
- [GNU平台下的编译和安装]()

#### Web技术

- [谈谈 Comet 技术]()

#### 爬虫技术

- [关于爬虫的原理]() 
- [(转) 知乎：PHP, Python, Node.js 哪个比较适合写爬虫？]()


#### 问题总结

- [编程语言/计算机中的 Timer 和 Tick 是指什么？]()
- [github修改密码后，SourceTree无法推送？如何在推送时不用每次都输入密码？](https://github.com/Lvsi-China/CSTheory/blob/master/(9)%E5%B7%A5%E7%A8%8B%E5%BC%80%E5%8F%91/%E9%97%AE%E9%A2%98%E6%80%BB%E7%BB%93/2018/github%E4%BF%AE%E6%94%B9%E5%AF%86%E7%A0%81%E5%90%8E%EF%BC%8CSourceTree%E6%97%A0%E6%B3%95%E6%8E%A8%E9%80%81%EF%BC%9F%E5%A6%82%E4%BD%95%E5%9C%A8%E6%8E%A8%E9%80%81%E6%97%B6%E4%B8%8D%E7%94%A8%E6%AF%8F%E6%AC%A1%E9%83%BD%E8%BE%93%E5%85%A5%E5%AF%86%E7%A0%81.md)

### (10) 编程语言

- #### Assembly

- #### C Language

	- [关于内存池技术]()
	- [(转)知乎：如何设计内存池？](https://www.zhihu.com/question/25527491)

- #### Java

- #### Go
        
    - [关于 Goroutine]()
    - [了解 Goroutine调度器]()
    - [深入理解 Channel 的原理]()
    - [到底有没有锁？]()

- #### PHP
      
    - [Composer构建项目的基本步骤]()
    - [ReactPHP 让PHP变得像NodeJS一样]() <!--https://github.com/reactphp-->
	- [讲解 ReactPHP 的3大特性：事件驱动+异步执行+非阻塞 IO]() <!--可以查看我写的源码阅读-->
    - [yield 关键 ? 协程 ?]() 
    - [从CGI到Fast-CGI]() <!-- PHP-FPM 是 PHP 针对 FastCGI 协议的具体实现 -->
    - [反射及其重要应用]()
    - [PHP 中的闭包]()
    - [守护进程及PHP如何使用守护进程]()
    - [PHP 使用 while(1) 和 crontab 的区别？]()
    - [(转)定时任务使用php自循环和crontab的区别？](https://www.zhihu.com/question/270451253/answer/354959863)
    - [phpDaemon开源项目介绍]()
    - [PHP 扩展开发]()
    - [使用Zephir做PHP扩展开发]()
    - [此React非彼React，React的使用心得 (Event-driven, non-blocking I/O with PHP)]()

- #### NodeJS


- #### JavaScript

    - [深刻认识 JS 的自执行函数环境]()

    - [理解 js 闭包]()

    - [JavaScript引擎](https://segmentfault.com/a/1190000012362556#articleHeader4)

    - [关于setTimeout()和异步]()

    - [单线程 ? 永不阻塞 ? 事件循环 ? 异步处理 ?]()

    - [关于 MVVM 的介绍讲解]()

    - [理解前端路由的原理]()

    - [了解 Flux 架构（单向数据流）]()

    - [关于高效操作DOM]()

    - [虚拟 DOM 技术]()

    - [关于 Typescript 和 CoffeeScript]()

    - #### React框架
     
        - [React的使用]()
        - [使用并理解 Reacte-Router]()
        - [使用并理解 Reacte-Redux]()

- #### Scala



### (11) 服务器技术
    
- [CDN技术的原理介绍]()


### (12) 分布式

- [谈到分布式，我们在想什么？]()
- [分布式文件存储系统的基础理论](https://github.com/Lvsi-China/SauronDFS/blob/master/docs/README.chapter2.md)


### (13) 搜索引擎

### (14) 大数据


### 杂感


