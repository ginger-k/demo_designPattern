
类似于克隆
浅克隆：对象中的对象属性引用的是同一个对象
深克隆：对象中的对象属性引用的是不同对象

Cloneable接口的clone()方法是浅克隆

通过先序列化再反序列化实现深克隆，要求对象，属性对象都实现序列化
	public  Object deepClone() throws IOException, ClassNotFoundException{
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }