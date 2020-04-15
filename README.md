环境准备：<br/>
Spring Boot version : 2.2.6.RELEASE<br/>
Elasticsearch Service version : 7.6.2<br/>
(download link:
<a href="https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-7.6.2-windows-x86_64.zip">windows</a> /
<a href="https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-7.6.2-linux-x86_64.tar.gz">linux</a> /
<a href="https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-7.6.2-darwin-x86_64.tar.gz">Mac OS</a>)

关键配置：<br/>
Jvm Option：elasticsearch/config/jvm.options<br/>
(内存指标：-Xms1g -Xmx1g/-Xms4g -Xmx4g)请根据服务器或本地测试环境需求配置初始化使用内存<br/>
Elasticsearch Config: elasticsearch/config/elasticsearch.yml<br/>
支持外网访问:<br/>
1、取消network.host注释<br/>
2、修改 network.host：192.168.0.1 > network.host：0.0.0.0<br/>
3、取消discovery.seed_hosts注释<br/>
4、修改 discovery.seed_hosts: ["host1", "host2"] > discovery.seed_hosts: ["127.0.0.1", "[::1]"]<br/>

服务启动：<br/>
Elasticsearch：elasticsearch/bin/（windows:elasticsearch.bat linux:elasticsearch）

项目配置：<br/>
resources > application.yml > spring.data.elasticsearch.client.reactive.endpoints:127.0.0.1:9200

项目测试：<br/>
新增数据：http://127.0.0.1/simple/save?name=test<br/>
查看数据：http://127.0.0.1/simple/all<br/>