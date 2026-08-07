package xg;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class a implements i, j {
    @Override // xg.j
    public Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(f.b(obj2));
        }
        return arrayList;
    }

    @Override // xg.i
    public Object b(Object obj, Type type) {
        if (!obj.getClass().equals(org.p018json.alipay.a.class)) {
            return null;
        }
        org.p018json.alipay.a aVar = (org.p018json.alipay.a) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int iA = aVar.a();
        Object objNewInstance = Array.newInstance(componentType, iA);
        for (int i11 = 0; i11 < iA; i11++) {
            Array.set(objNewInstance, i11, e.a(aVar.a(i11), componentType));
        }
        return objNewInstance;
    }

    @Override // xg.i, xg.j
    public boolean a(Class<?> cls) {
        return cls.isArray();
    }
}
