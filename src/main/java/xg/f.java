package xg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<j> f123495a;

    static {
        ArrayList arrayList = new ArrayList();
        f123495a = arrayList;
        arrayList.add(new l());
        f123495a.add(new d());
        f123495a.add(new c());
        f123495a.add(new h());
        f123495a.add(new b());
        f123495a.add(new a());
        f123495a.add(new g());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objB = b(obj);
        if (zg.a.b(objB.getClass())) {
            return org.p018json.alipay.b.d(objB.toString());
        }
        if (Collection.class.isAssignableFrom(objB.getClass())) {
            return new org.p018json.alipay.a((Collection) objB).toString();
        }
        if (Map.class.isAssignableFrom(objB.getClass())) {
            return new org.p018json.alipay.b((Map) objB).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + objB.getClass());
    }

    public static Object b(Object obj) {
        Object objA;
        if (obj == null) {
            return null;
        }
        for (j jVar : f123495a) {
            if (jVar.a(obj.getClass()) && (objA = jVar.a(obj)) != null) {
                return objA;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
