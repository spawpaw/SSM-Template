# 说明

> 尚奔奔 2017-6-30

由于本项目为restful web服务，所以并不需要生成view，而是直接返回json格式的数据(model)  
由此需求，将业务层和controller层整合，直接为service层设置路由，即controller层的注解直接写在业务层的接口上，  
运行时，spring容器会自动将controller的实现注入，比单独分出controller层更加简洁