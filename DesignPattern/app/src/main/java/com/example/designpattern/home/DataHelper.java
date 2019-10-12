package com.example.designpattern.home;


import java.util.ArrayList;
import java.util.List;

public class DataHelper {
    public static final int ITEM_TYPE_TITLE = 0;
    public static final int ITEM_TYPE_CONTENT = 1;

    private DataHelper() {
    }

    public static List<ItemModel> getData() {
        List<ItemModel> list = new ArrayList<>();
        list.add(createModel("创建型模式", "https://www.runoob.com/design-pattern/design-pattern-intro.html", ITEM_TYPE_TITLE));
        list.add(createModel("工厂模式（Factory Pattern）",
                "https://www.runoob.com/design-pattern/factory-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/factory",
                ITEM_TYPE_CONTENT));
        list.add(createModel("抽象工厂模式（Abstract Factory Pattern）",
                "https://www.runoob.com/design-pattern/abstract-factory-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/abstract_factory",
                ITEM_TYPE_CONTENT));
        list.add(createModel("单例模式（Singleton Pattern）",
                "https://www.runoob.com/design-pattern/singleton-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/singleton",
                ITEM_TYPE_CONTENT));
        list.add(createModel("建造者模式（Builder Pattern）",
                "https://www.runoob.com/design-pattern/builder-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/builder",
                ITEM_TYPE_CONTENT));
        list.add(createModel("原型模式（Prototype Pattern）",
                "https://www.runoob.com/design-pattern/prototype-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/prototype",
                ITEM_TYPE_CONTENT));

        list.add(createModel("结构型模式", "https://www.runoob.com/design-pattern/design-pattern-intro.html", ITEM_TYPE_TITLE));
        list.add(createModel("适配器模式（Adapter Pattern）",
                "https://www.runoob.com/design-pattern/adapter-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/adapter",
                ITEM_TYPE_CONTENT));
        list.add(createModel("桥接模式（Bridge Pattern）",
                "https://www.runoob.com/design-pattern/bridge-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/bridge",
                ITEM_TYPE_CONTENT));
        list.add(createModel("过滤器模式（Filter、Criteria Pattern）",
                "https://www.runoob.com/design-pattern/filter-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/filter",
                ITEM_TYPE_CONTENT));
        list.add(createModel("组合模式（Composite Pattern）",
                "https://www.runoob.com/design-pattern/composite-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/composite",
                ITEM_TYPE_CONTENT));
        list.add(createModel("装饰器模式（Decorator Pattern）",
                "https://www.runoob.com/design-pattern/decorator-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/decorator",
                ITEM_TYPE_CONTENT));
        list.add(createModel("外观模式（Facade Pattern）",
                "https://www.runoob.com/design-pattern/facade-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/facade",
                ITEM_TYPE_CONTENT));
        list.add(createModel("享元模式（Flyweight Pattern）",
                "https://www.runoob.com/design-pattern/flyweight-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/flyweight",
                ITEM_TYPE_CONTENT));
        list.add(createModel("代理模式（Proxy Pattern）",
                "https://www.runoob.com/design-pattern/proxy-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/proxy",
                ITEM_TYPE_CONTENT));

        list.add(createModel("行为型模式", "https://www.runoob.com/design-pattern/design-pattern-intro.html", ITEM_TYPE_TITLE));
        list.add(createModel("责任链模式（Chain of Responsibility Pattern）",
                "https://www.runoob.com/design-pattern/chain-of-responsibility-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/chainofresponsibility",
                ITEM_TYPE_CONTENT));
        list.add(createModel("命令模式（Command Pattern）",
                "https://www.runoob.com/design-pattern/command-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/command",
                ITEM_TYPE_CONTENT));
        list.add(createModel("解释器模式（Interpreter Pattern）",
                "https://www.runoob.com/design-pattern/interpreter-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/interpreter",
                ITEM_TYPE_CONTENT));
        list.add(createModel("迭代器模式（Iterator Pattern）",
                "https://www.runoob.com/design-pattern/iterator-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/iterator",
                ITEM_TYPE_CONTENT));
        list.add(createModel("中介者模式（Mediator Pattern）",
                "https://www.runoob.com/design-pattern/mediator-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/mediator",
                ITEM_TYPE_CONTENT));
        list.add(createModel("备忘录模式（Memento Pattern）",
                "https://www.runoob.com/design-pattern/memento-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/memento",
                ITEM_TYPE_CONTENT));
        list.add(createModel("观察者模式（Observer Pattern）",
                "https://www.runoob.com/design-pattern/observer-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/observer",
                ITEM_TYPE_CONTENT));
        list.add(createModel("状态模式（State Pattern）",
                "https://www.runoob.com/design-pattern/state-pattern.html",
                "https://github.com/ZGaoFei/DesignPattern/tree/master/DesignPattern/app/src/main/java/com/example/designpattern/test_code/state",
                ITEM_TYPE_CONTENT));
        list.add(createModel("空对象模式（Null Object Pattern）", "https://www.runoob.com/design-pattern/null-object-pattern.html", ITEM_TYPE_CONTENT));
        list.add(createModel("策略模式（Strategy Pattern）", "https://www.runoob.com/design-pattern/strategy-pattern.html", ITEM_TYPE_CONTENT));
        list.add(createModel("模板模式（Template Pattern）", "https://www.runoob.com/design-pattern/template-pattern.html", ITEM_TYPE_CONTENT));
        list.add(createModel("访问者模式（Visitor Pattern）", "https://www.runoob.com/design-pattern/visitor-pattern.html", ITEM_TYPE_CONTENT));

        list.add(createModel("J2EE 模式", "https://www.runoob.com/design-pattern/design-pattern-intro.html", ITEM_TYPE_TITLE));
        list.add(createModel("MVC 模式（MVC Pattern）", "https://www.runoob.com/design-pattern/mvc-pattern.html", ITEM_TYPE_CONTENT));
        list.add(createModel("业务代表模式（Business Delegate Pattern）", "https://www.runoob.com/design-pattern/business-delegate-pattern.html", ITEM_TYPE_CONTENT));
        list.add(createModel("组合实体模式（Composite Entity Pattern）", "https://www.runoob.com/design-pattern/composite-entity-pattern.html", ITEM_TYPE_CONTENT));
        list.add(createModel("数据访问对象模式（Data Access Object Pattern）", "https://www.runoob.com/design-pattern/data-access-object-pattern.html", ITEM_TYPE_CONTENT));
        list.add(createModel("前端控制器模式（Front Controller Pattern）", "https://www.runoob.com/design-pattern/front-controller-pattern.html", ITEM_TYPE_CONTENT));
        list.add(createModel("拦截过滤器模式（Intercepting Filter Pattern）", "https://www.runoob.com/design-pattern/intercepting-filter-pattern.html", ITEM_TYPE_CONTENT));
        list.add(createModel("服务定位器模式（Service Locator Pattern）", "https://www.runoob.com/design-pattern/service-locator-pattern.html", ITEM_TYPE_CONTENT));
        list.add(createModel("传输对象模式（Transfer Object Pattern）", "https://www.runoob.com/design-pattern/transfer-object-pattern.html", ITEM_TYPE_CONTENT));
        return list;
    }

    private static ItemModel createModel(String title, String url, int type) {
        return createModel(title, url, "", type);
    }

    private static ItemModel createModel(String title, String url, String gitUrl, int type) {
        return new ItemModel(title, url, gitUrl, type);
    }
}
