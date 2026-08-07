package xg;

import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class c implements i, j {
    @Override // xg.j
    public Object a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    @Override // xg.i
    public Object b(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    @Override // xg.i, xg.j
    public boolean a(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }
}
