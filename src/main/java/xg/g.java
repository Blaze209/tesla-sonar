package xg;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class g implements i, j {
    public static Object c(Field field, Object obj) throws IllegalAccessException {
        if (field == null || obj == null || "this$0".equals(field.getName())) {
            return null;
        }
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        if (obj2 == null) {
            return null;
        }
        field.setAccessible(zIsAccessible);
        return f.b(obj2);
    }

    @Override // xg.j
    public Object a(Object obj) throws IllegalAccessException {
        TreeMap treeMap = new TreeMap();
        Class<?> superclass = obj.getClass();
        while (true) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (superclass.equals(Object.class)) {
                return treeMap;
            }
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    Object objC = c(field, obj);
                    if (objC != null) {
                        treeMap.put(field.getName(), objC);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    @Override // xg.i
    public Object b(Object obj, Type type) throws IllegalAccessException, InstantiationException {
        if (!obj.getClass().equals(org.p018json.alipay.b.class)) {
            return null;
        }
        org.p018json.alipay.b bVar = (org.p018json.alipay.b) obj;
        Class superclass = (Class) type;
        Object objNewInstance = superclass.newInstance();
        while (!superclass.equals(Object.class)) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (bVar.b(name)) {
                        field.setAccessible(true);
                        field.set(objNewInstance, e.a(bVar.a(name), genericType));
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        return objNewInstance;
    }

    @Override // xg.i, xg.j
    public boolean a(Class<?> cls) {
        return true;
    }
}
