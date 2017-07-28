# generator
auto coding 

## Feature

- Java Pojo类生成前端TypeScript Vo类

**TODO**

[ ] 根据Vo类创建前端表单页面

## Usage

- （1）npm install

- （2）将Java POJO类文件放到`./java-class`文件夹中

_文件目录可多级，无需关系Java类中的package包名，以及类中import了外部类或外部jar包，工程会自动去掉保证编译成功。_

- （3）执行`npm run app`

执行成功后在`./dist`文件夹中即可找到生成的`*.ts` VO 文件


eg:

**VResult.ts**

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