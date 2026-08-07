package xg;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class d implements i, j {
    @Override // xg.j
    public Object a(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // xg.i
    public Object b(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // xg.i, xg.j
    public boolean a(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
