出版者 + 订阅者 = 观察者模式
出版者改称为“主题”(subject)，订阅者改称为“观察者”(observer)

意图：定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时, 所有依赖于它的对象都得到通知并被自动更新。

jdk: Observable 和  Observer

实例场景：气象站监控温度，湿度，压力等数据，数据一旦更新就发送给各种布告板，各种布告板显示数据