代理模式给某一个对象提供一个代理对象，并由代理对象控制对原对象的引用。

作用：在不影响客户端使用习惯的基础上，更改类的方法

实例：连接池获取的连接都是经过修改后的代理对象，close方法不会关闭连接，而是将连接放回连接池。