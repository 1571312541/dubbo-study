项目结构
``` lua
dubbo-study
├── day1 -- dubbo初步学习
|    ├── zchao-api -- api接口
|    ├── zchao-dao -- 实体类、dao层接口
|    ├── zchao-service -- service层，服务提供者，假设zchao-service和zchao-web不再一个服务器下
|    ├── zchao-web -- web层，服务消费者，假设zchao-service和zchao-web不再一个服务器下
├── day2 -- dubbo在springboot中使用
|    ├── day2-zchao-api -- api接口
|    ├── day2-zchao-dao -- 实体类、dao层接口
|    ├── day2-zchao-service -- springboot模块，service层，服务提供者，假设zchao-service和zchao-web不再一个服务器下
|    ├── day2-zchao-web -- springboot模块，web层，服务消费者，假设zchao-service和zchao-web不再一个服务器下


service层、web层共用api、dao模块，没有具体分

```