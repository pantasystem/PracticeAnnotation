import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

public class MapParser<T> {

    public T parse(Map<String, Object> map, Class<T> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        T object = (T) clazz.getConstructor().newInstance();
        Arrays.stream(clazz.getDeclaredFields()).forEach((field -> {
            Arrays.stream(field.getAnnotations()).forEach((annotation -> {
                if(annotation instanceof Field) {
                    final String fieldName = ((Field) annotation).name();
                    final Object value = map.get(fieldName);
                    try {
                        field.set(object, value);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }

                }
            }));
        }));
        return object;
    }
}
