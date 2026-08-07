package mk0;

import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static /* synthetic */ Class f92272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static /* synthetic */ Class f92273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static /* synthetic */ Class f92274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static /* synthetic */ Class f92275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static /* synthetic */ Class f92276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static /* synthetic */ Class f92277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static /* synthetic */ Class f92278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static /* synthetic */ Class f92279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static /* synthetic */ Class f92280i;

    static /* synthetic */ Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    public static Class b(String str) {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return Class.forName(str, true, contextClassLoader);
            }
        } catch (ClassNotFoundException | SecurityException unused) {
        }
        return Class.forName(str);
    }

    public static String c(Class cls) {
        return d(cls, false);
    }

    public static String d(Class cls, boolean z11) {
        if (cls == null) {
            return null;
        }
        if (cls.isArray()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(c(cls.getComponentType()));
            stringBuffer.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return stringBuffer.toString();
        }
        String name = cls.getName();
        if (name.startsWith("java.lang.") || name.startsWith("java.util.")) {
            return name.substring(10);
        }
        if (!z11) {
            return name;
        }
        if (name.startsWith("freemarker.template.")) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("f.t");
            stringBuffer2.append(name.substring(19));
            return stringBuffer2.toString();
        }
        if (name.startsWith("freemarker.ext.beans.")) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("f.e.b");
            stringBuffer3.append(name.substring(20));
            return stringBuffer3.toString();
        }
        if (name.startsWith("freemarker.core.")) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("f.c");
            stringBuffer4.append(name.substring(15));
            return stringBuffer4.toString();
        }
        if (name.startsWith("freemarker.ext.")) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("f.e");
            stringBuffer5.append(name.substring(14));
            return stringBuffer5.toString();
        }
        if (!name.startsWith("freemarker.")) {
            return name;
        }
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("f");
        stringBuffer6.append(name.substring(10));
        return stringBuffer6.toString();
    }

    public static String e(Object obj) {
        return f(obj, false);
    }

    public static String f(Object obj, boolean z11) {
        return obj == null ? "Null" : d(obj.getClass(), z11);
    }

    public static Class g(Class cls) throws Throwable {
        if (cls == Integer.TYPE) {
            Class cls2 = f92272a;
            if (cls2 != null) {
                return cls2;
            }
            Class clsA = a("java.lang.Integer");
            f92272a = clsA;
            return clsA;
        }
        if (cls == Boolean.TYPE) {
            Class cls3 = f92273b;
            if (cls3 != null) {
                return cls3;
            }
            Class clsA2 = a("java.lang.Boolean");
            f92273b = clsA2;
            return clsA2;
        }
        if (cls == Long.TYPE) {
            Class cls4 = f92274c;
            if (cls4 != null) {
                return cls4;
            }
            Class clsA3 = a("java.lang.Long");
            f92274c = clsA3;
            return clsA3;
        }
        if (cls == Double.TYPE) {
            Class cls5 = f92275d;
            if (cls5 != null) {
                return cls5;
            }
            Class clsA4 = a("java.lang.Double");
            f92275d = clsA4;
            return clsA4;
        }
        if (cls == Character.TYPE) {
            Class cls6 = f92276e;
            if (cls6 != null) {
                return cls6;
            }
            Class clsA5 = a("java.lang.Character");
            f92276e = clsA5;
            return clsA5;
        }
        if (cls == Float.TYPE) {
            Class cls7 = f92277f;
            if (cls7 != null) {
                return cls7;
            }
            Class clsA6 = a("java.lang.Float");
            f92277f = clsA6;
            return clsA6;
        }
        if (cls == Byte.TYPE) {
            Class cls8 = f92278g;
            if (cls8 != null) {
                return cls8;
            }
            Class clsA7 = a("java.lang.Byte");
            f92278g = clsA7;
            return clsA7;
        }
        if (cls == Short.TYPE) {
            Class cls9 = f92279h;
            if (cls9 != null) {
                return cls9;
            }
            Class clsA8 = a("java.lang.Short");
            f92279h = clsA8;
            return clsA8;
        }
        if (cls != Void.TYPE) {
            return cls;
        }
        Class cls10 = f92280i;
        if (cls10 != null) {
            return cls10;
        }
        Class clsA9 = a("java.lang.Void");
        f92280i = clsA9;
        return clsA9;
    }
}
