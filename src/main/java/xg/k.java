package xg;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class k implements i {
    @Override // xg.i, xg.j
    public boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }

    @Override // xg.i
    public Object b(Object obj, Type type) {
        if (!obj.getClass().equals(org.p018json.alipay.a.class)) {
            return null;
        }
        org.p018json.alipay.a aVar = (org.p018json.alipay.a) obj;
        HashSet hashSet = new HashSet();
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i11 = 0; i11 < aVar.a(); i11++) {
            hashSet.add(e.a(aVar.a(i11), type2));
        }
        return hashSet;
    }
}
