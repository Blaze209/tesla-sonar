package wq0;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes10.dex */
class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<Class<?>, List<n>> f122321d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a[] f122322e = new a[4];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<xq0.b> f122323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f122324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f122325c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<n> f122326a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<Class, Object> f122327b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map<String, Class> f122328c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final StringBuilder f122329d = new StringBuilder(128);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Class<?> f122330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Class<?> f122331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f122332g;

        a() {
        }

        private boolean b(Method method, Class<?> cls) {
            this.f122329d.setLength(0);
            this.f122329d.append(method.getName());
            StringBuilder sb2 = this.f122329d;
            sb2.append('>');
            sb2.append(cls.getName());
            String string = this.f122329d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class clsPut = this.f122328c.put(string, declaringClass);
            if (clsPut == null || clsPut.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f122328c.put(string, clsPut);
            return false;
        }

        boolean a(Method method, Class<?> cls) {
            Object objPut = this.f122327b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.f122327b.put(cls, this);
            }
            return b(method, cls);
        }

        void c(Class<?> cls) {
            this.f122331f = cls;
            this.f122330e = cls;
            this.f122332g = false;
        }

        void d() {
            if (this.f122332g) {
                this.f122331f = null;
                return;
            }
            Class<? super Object> superclass = this.f122331f.getSuperclass();
            this.f122331f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f122331f = null;
            }
        }

        void e() {
            this.f122326a.clear();
            this.f122327b.clear();
            this.f122328c.clear();
            this.f122329d.setLength(0);
            this.f122330e = null;
            this.f122331f = null;
            this.f122332g = false;
        }
    }

    o(List<xq0.b> list, boolean z11, boolean z12) {
        this.f122323a = list;
        this.f122324b = z11;
        this.f122325c = z12;
    }

    private List<n> b(Class<?> cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f122331f != null) {
            f(aVarG);
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private List<n> c(Class<?> cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f122331f != null) {
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private void d(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f122331f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f122331f.getMethods();
            aVar.f122332g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    l lVar = (l) method.getAnnotation(l.class);
                    if (lVar != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f122326a.add(new n(method, cls, lVar.threadMode(), lVar.priority(), lVar.sticky()));
                        }
                    }
                } else if (this.f122324b && method.isAnnotationPresent(l.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f122324b && method.isAnnotationPresent(l.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    private List<n> e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f122326a);
        aVar.e();
        synchronized (f122322e) {
            for (int i11 = 0; i11 < 4; i11++) {
                try {
                    a[] aVarArr = f122322e;
                    if (aVarArr[i11] == null) {
                        aVarArr[i11] = aVar;
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    private xq0.a f(a aVar) {
        aVar.getClass();
        List<xq0.b> list = this.f122323a;
        if (list == null) {
            return null;
        }
        Iterator<xq0.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(aVar.f122331f);
        }
        return null;
    }

    private a g() {
        synchronized (f122322e) {
            for (int i11 = 0; i11 < 4; i11++) {
                try {
                    a[] aVarArr = f122322e;
                    a aVar = aVarArr[i11];
                    if (aVar != null) {
                        aVarArr[i11] = null;
                        return aVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new a();
        }
    }

    List<n> a(Class<?> cls) {
        Map<Class<?>, List<n>> map = f122321d;
        List<n> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<n> listC = this.f122325c ? c(cls) : b(cls);
        if (!listC.isEmpty()) {
            map.put(cls, listC);
            return listC;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
