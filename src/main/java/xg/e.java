package xg;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<i> f123494a;

    static {
        ArrayList arrayList = new ArrayList();
        f123494a = arrayList;
        arrayList.add(new l());
        f123494a.add(new d());
        f123494a.add(new c());
        f123494a.add(new h());
        f123494a.add(new k());
        f123494a.add(new b());
        f123494a.add(new a());
        f123494a.add(new g());
    }

    public static final <T> T a(Object obj, Type type) {
        T t11;
        for (i iVar : f123494a) {
            if (iVar.a(zg.a.a(type)) && (t11 = (T) iVar.b(obj, type)) != null) {
                return t11;
            }
        }
        return null;
    }

    public static final Object b(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
            bVar = new org.p018json.alipay.a(strTrim);
        } else {
            if (!strTrim.startsWith("{") || !strTrim.endsWith("}")) {
                return a(strTrim, type);
            }
            bVar = new org.p018json.alipay.b(strTrim);
        }
        return a(bVar, type);
    }
}
