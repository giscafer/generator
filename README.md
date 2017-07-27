# generator
auto coding 

## Feature

- Java Pojo类生成前端TypeScript Vo类

## Usage

- npm install

- 将编译后的Java `.class`文件放到`java-class`文件夹中

eg:

执行`javac -encoding UTF-8 Test.java` 生成的 `Test.class` 文件放到`./java-class`目录下

- 编辑`./java-class/file.json`文件，json的`fileNames`属性数组（数组的意思就是支持批量生成多个文件）

```json
{
    "fileNames":[
        "Test"
    ]
}
```


- 执行`npm run app`

成功后再`dist`文件夹中即可找到对应的`*.vo.ts`文件


eg:

**Test.ts**

```
export class Test { 
	id : string;
	billDepart : string;
	operatDate : string;
	shipperName : string;
	shipperNo : string;
	waybillId : string;
	payType : string;
	serviceType : string;
	goods : string;
	consignee : string;
	consigneeAddress : string;
	totalAmount : string;
	feeDetail : string;
	waybillStatus : string;
}
```