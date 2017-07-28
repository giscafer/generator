# generator
auto coding 

## Feature

- Java Pojo类生成前端TypeScript Vo类

**TODO**

[ ] 根据Vo类创建前端表单页面

## Usage

- npm install

- 将Java POJO类文件放到`./java-class`文件夹中


- 执行`npm run app`

成功后再`dist`文件夹中即可找到对应的`*.ts` VO 文件


eg:

**Test.ts**

```
export class VResult { 
	code : string;
	message : string;
	id : string;
}
```

**VResult.java**

```java

/**
 * Created by Administrator on 2017-03-30.
 */
public class VResult {
    /**
     * 代码，默认成功1000
     */
    private int code = 1000;
    /**
     * 消息内容
     */
    private String message;
    /**
     * 键值
     */
    private String id;

    public VResult(){
    }

    public VResult(String message){
        this.message = message;
    }

    public VResult(String message, String id){
        this.message = message;
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
```