
import java.lang.reflect.Field;

public class Tool {
    /**
     * 获取类的属性名称
     */
    public Object getFieldName(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];

        for (int i = 0; i < fields.length; i++) {
            // System.out.println(fields[i].getType());
            fieldNames[i] = fields[i].getName();
        }
        System.out.println(fieldNames.toString());
        return fieldNames;
    }

    public String getClassName(Object o) {
        return o.getClass().getName();
    }
}