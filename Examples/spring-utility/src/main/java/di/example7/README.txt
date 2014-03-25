Access to beans from a context object is granted through getBean() method. If there is only a bean for a type, you can ommit identifier and do getBean(MyBean.class). In this case a cast is not needed.

Beware, if you have several beans for the type MyBean registered in container, an exception is thrown