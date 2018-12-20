# CSTheory
Lvsi's Blog：计算机科学理论（Lvsi's Blog：The Theories of Computer Science ）. [前往博客](https://lvsi-china.github.io/CSTheory/)

<br>

## ♨ 介绍

没错，这个仓库就是我唯一使用且永久更新的技术博客。个人觉得用github仓库更方便一些，于是就使用它作为自己的技术沉淀和不定时的总结了。

[博客地址](https://lvsi-china.github.io/CSTheory/)<br/>
[博客 github 仓库地址](https://github.com/Lvsi-China/CSTheory)


> 由于我以前习惯使用某云存储笔记作为技术知识存储( 简单方便 )，
> 但后期发现云笔记这种产品不太可靠，还是自己管理更放心。
> 所以某段时间可能会大量的把之前笔记中的技术文章搬运到这个博客中，请不要见怪。

能力有限，难免写错，有错误的地方，大家可以在 Issues 里回复，我虚心接受一切正确的批评并及时更正。谢谢！

> 另外推荐：我的 [Akama](https://github.com/Lvsi-China/Akama) 项目组织, 专门翻译国外计算机领域相关文章资料，欢迎有意者加入！<br>
> 仓库地址 : [Akama](https://github.com/Lvsi-China/Akama)<br>
> 官方网站 : [lvsi-china.github.io](https://lvsi-china.github.io/)

<br>

## ✍ 博客文章分类

1. ### 数据结构与算法

    请查看 [深入于心的数据结构和算法( Deep in the Heart of Data Structures And Algorithms )](https://lvsi-china.github.io/AlgorithmRise/)


2. ### 计算机组成原理

    - #### 数制系统

    - #### 存储系统
        - [虚拟存储器的基础理论](https://github.com/Lvsi-China/VirtualMemory)


    - #### 指令系统
        - [重点掌握指令的格式]()
        - [理解指令的寻址和数据的寻址]()
        - [了解 CISC 和 RISC]()

    - #### 中央处理器
        - [了解CPU的功能和结构]()
        - [了解数据通路]()
        - [深入理解指令执行的过程]()
        - [理解控制器]()
        - [流水线CPU]()

    - #### 总线
        - [总线的重要认识和理解]()
        - [关于总线的仲裁]()
        - [总线操作和定时]()
        - [总线标准]()

    - #### 输入/输出系统
        - [I/O系统的重要认识和理解]()
        - [关于I/O接口（I/O控制器）]()
        - [I/O方式的介绍 - 程序查询、程序中断、DMA、通道]()

    - #### 问题总结
        - [编程语言/计算机中的 Timer 和 Tick 是指什么？]()


3. ### 计算机网络

4. ### 数据库系统
    - [关系型数据库系统的基础理论](https://github.com/Lvsi-China/Sherk/blob/master/docs/README.chapter3.md)
    - [SQL的执行原理和优化原理](https://github.com/Lvsi-China/SmaugSQL)
    - [非关系型数据库系统的基础理论](https://github.com/Lvsi-China/CSTheory/blob/master/docs/nosql.md)
    - [数据库系统集群的基础理论和架构](https://github.com/Lvsi-China/Sherk/blob/master/docs/README.chapter3.md)

5. ### 操作系统

6. ### Linux
 
7. ### 并发探究
    
    - ##### 并发基础
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


8. ### IO处理

    - #### 介绍
    - [客户端向服务器请求数据，会按顺序经过这3个IO：网络IO -> 内存IO ->磁盘IO ]()
    - [Redis为什么一般比Mysql速度块]()
    - [(转)网络IO和磁盘IO效率问题？](https://www.zhihu.com/question/47589908)
    - [IO处理中的同步和异步]()
    - [IO处理中的阻塞和非阻塞]()
    - [服务器常用的IO模型]() 


    - #### 网络IO
    - [关于 libevent 的介绍讲解]()
    - [(转) 知乎：libevent的异步怎么理解？](https://www.zhihu.com/question/23429855)
	- [几种网络IO模型]()
	- [(转) Unix 网络 IO 模型: 同步异步, 傻傻分不清楚?](https://segmentfault.com/a/1190000007355931)

    - #### 磁盘IO


    - #### 内存IO


9. ### 工程开发

    - #### 设计模式

    - #### 程序设计模型

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
        - [同步和异步]()
        - [异步的实现方法]()
        - [(转)阮一峰：Javascript异步编程的4种方法](http://www.ruanyifeng.com/blog/2012/12/asynchronous%EF%BC%BFjavascript.html)
        - [(转)JS 异步的实现](https://segmentfault.com/a/1190000012362556)
        - [事件驱动模型（Event-driven）]()
        - [事件循环与异步处理]()
        - [队列系统与异步处理]()
        - [消息广播（Broadcasting）]()
        - [发布/订阅]()

    - #### 网络编程


    - #### 程序的编译安装
    - [关于 GCC & G++ ]()
    - [GNU平台下的编译和安装]()

    - #### Web技术
    - [谈谈 Comet 技术]()

    - #### 爬虫技术
    - [关于爬虫的原理]() 
    - [(转) 知乎：PHP, Python, Node.js 哪个比较适合写爬虫？]()


    - #### 问题总结

    - [(知乎)YAML，JSON，ini，XML 用来做配置文件，优缺点分别是什么？](https://www.zhihu.com/question/41253282/answer/119857880)
    - [编程语言/计算机中的 Timer 和 Tick 是指什么？]()
    - 12月13日：[github修改密码后，SourceTree无法推送？如何在推送时不用每次都输入密码？](./工程开发/问题总结/2018/12-13.md)
    - [(知乎)为什么都反对 XML 而支持使用 JSON？](https://www.zhihu.com/question/25636060)
    - 12月14日：[收集可用的关于英语单词api](./工程开发/问题总结/2018/12-14.md)
    - 12月16日：[NodeJS模块中的exports与module.exports的区别？](./工程开发/问题总结/2018/12-16.md)

10. ### 编程语言

    - #### Assembly

    - #### C Language
    	- [关于内存池技术]()
    	- [(转)知乎：如何设计内存池？](https://www.zhihu.com/question/25527491)

    - #### Java

        - [12-17：一道坑](./编程语言/Java/2018/12-17.md)

    - #### Go
        - [关于 Goroutine]()
        - [了解 Goroutine调度器]()
        - [深入理解 Channel 的原理]()
        - [到底有没有锁？]()

    - #### PHP

        - [04-11：在 Homestead 中怎么配置 Redis？](./编程语言/PHP/Laravel/2018/04-11.md)
        - [02-28：Laravel实现 用户名或邮箱等 任意一个字段均可登录](./编程语言/PHP/Laravel/2018/02-28.md)
        - [04-05：Laravel 的表单验证 , 如何做到验证并改变 ( 转换 ) 数据 ？( 使用中间件 )](./编程语言/PHP/Laravel/2018/04-05.md)

        - [Composer构建项目的基本步骤]()
        - [ReactPHP 让PHP变得像NodeJS一样]()
        - [讲解 ReactPHP 的3大特性：事件驱动+异步执行+非阻塞 IO]()
        - [yield 关键 ? 协程 ?]() 
        - [从CGI到Fast-CGI]()
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
        - [NodeJS是编程语言吗？]()
        - [NodeJS目录结构参考-1](https://gist.github.com/Lvsi-China/6844decae4fbc3915506298be0d4dd15)
        - [NodeJS目录结构参考-2](https://github.com/focusaurus/express_code_structure)
        - [NodeJS目录结构参考-3](https://github.com/jifeng/node-app)

        
    - #### JavaScript
        - [12-17：理解webview](./编程语言/JavaScript/2018/12-17.md)
        - [深刻认识 JS 的自执行函数环境]()
        - [理解 js 闭包]()
        - [JavaScript引擎](https://segmentfault.com/a/1190000012362556#articleHeader4)
        - [关于setTimeout()和异步]()
        - [单线程 ? 永不阻塞 ? 事件循环 ? 异步处理 ?]()
        - [关于 MVVM 的介绍讲解]()
        - [理解前端路由的原理]()
        - [了解 Flux 架构（单向数据流）]()
        - [关于高效操作DOM]()
        - [强大的Canvas]()
        - [虚拟 DOM 技术]()
        - [Hybrid混合开发]()
        - [关于 Typescript 和 CoffeeScript]()
        - [React的使用]()
        - [使用并理解 Reacte-Router]()
        - [使用并理解 Reacte-Redux]()

    - #### Scala

11. ### 服务器技术
    - [CDN技术的原理介绍]()


12. ### 分布式
    - [谈到分布式，我们在想什么？]()
    - [分布式文件存储系统的基础理论](https://github.com/Lvsi-China/SauronDFS/blob/master/docs/README.chapter2.md)


13. ### 搜索引擎

14. ### 大数据


15. ### 杂感


