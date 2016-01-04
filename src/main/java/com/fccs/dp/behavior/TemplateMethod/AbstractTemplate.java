package com.fccs.dp.behavior.TemplateMethod;

public abstract class AbstractTemplate {

	/**
     * 模板方法
     */
    public void templateMethod(){
        //调用基本方法
        abstractMethod();
        hookMethod();
        concreteMethod();
    }
    /**
     * 强制子类实现的剩余逻辑
     */
    protected abstract void abstractMethod();
    /**
     * 可选择实现的逻辑，不是必须实现的
     */
    protected void hookMethod(){}
    /**
     * 基本方法（已经实现）
     */
    private final void concreteMethod(){
        //业务相关的代码
    }
}
