package androidx.p003lifecycle;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/lifecycle/c0;", "", "<init>", "()V", "object", "Landroidx/lifecycle/u;", "f", "(Ljava/lang/Object;)Landroidx/lifecycle/u;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/m;", "constructor", "a", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/m;", "Ljava/lang/Class;", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;)I", "g", "", "e", "(Ljava/lang/Class;)Z", "", "className", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f8765a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<Class<?>, List<Constructor<? extends m>>> classToAdapters = new HashMap();

    private c0() {
    }

    private final m a(Constructor<? extends m> constructor, Object object) {
        try {
            m mVarNewInstance = constructor.newInstance(object);
            s.j(mVarNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return mVarNewInstance;
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    private final Constructor<? extends m> b(Class<?> klass) {
        try {
            Package r11 = klass.getPackage();
            String name = klass.getCanonicalName();
            String fullPackage = r11 != null ? r11.getName() : "";
            s.j(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                s.j(name, "name");
                name = name.substring(fullPackage.length() + 1);
                s.j(name, "this as java.lang.String).substring(startIndex)");
            }
            s.j(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (fullPackage.length() != 0) {
                strC = fullPackage + CoreConstants.DOT + strC;
            }
            Class<?> cls = Class.forName(strC);
            s.i(cls, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls.getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static final String c(String className) {
        s.k(className, "className");
        return t.V(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> klass) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(klass);
        map.put(klass, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class<?> klass) {
        return klass != null && w.class.isAssignableFrom(klass);
    }

    public static final u f(Object object) {
        s.k(object, "object");
        boolean z11 = object instanceof u;
        boolean z12 = object instanceof DefaultLifecycleObserver;
        if (z11 && z12) {
            return new h((DefaultLifecycleObserver) object, (u) object);
        }
        if (z12) {
            return new h((DefaultLifecycleObserver) object, null);
        }
        if (z11) {
            return (u) object;
        }
        Class<?> cls = object.getClass();
        c0 c0Var = f8765a;
        if (c0Var.d(cls) != 2) {
            return new o0(object);
        }
        List<Constructor<? extends m>> list = classToAdapters.get(cls);
        s.h(list);
        List<Constructor<? extends m>> list2 = list;
        if (list2.size() == 1) {
            return new b1(c0Var.a(list2.get(0), object));
        }
        int size = list2.size();
        m[] mVarArr = new m[size];
        for (int i11 = 0; i11 < size; i11++) {
            mVarArr[i11] = f8765a.a(list2.get(i11), object);
        }
        return new e(mVarArr);
    }

    private final int g(Class<?> klass) {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends m> constructorB = b(klass);
        if (constructorB != null) {
            classToAdapters.put(klass, v.e(constructorB));
            return 2;
        }
        if (d.f8768c.d(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (e(superclass)) {
            s.j(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends m>> list = classToAdapters.get(superclass);
            s.h(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = klass.getInterfaces();
        s.j(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                s.j(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends m>> list2 = classToAdapters.get(intrface);
                s.h(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }
}
