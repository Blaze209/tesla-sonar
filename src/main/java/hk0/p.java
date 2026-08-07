package hk0;

import freemarker.core.BugException;
import freemarker.template.utility.NullArgumentException;
import java.beans.BeanInfo;
import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
class p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final kk0.b f73056o = kk0.b.i("freemarker.beans");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final boolean f73057p = "true".equals(mk0.d.a("freemarker.development", "false"));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final o f73058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f73059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final Object f73060s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Object f73061t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static /* synthetic */ Class f73062u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static /* synthetic */ Class f73063v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f73064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f73065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final t f73066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f73067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f73068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f73069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f73070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f73071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f73072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set f73073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set f73074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f73075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ReferenceQueue f73076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f73077n;

    static {
        o oVar = null;
        try {
            try {
                Class.forName("org.zeroturnaround.javarebel.ClassEventListener");
                try {
                    oVar = (o) r.class.newInstance();
                } catch (Throwable th2) {
                    f73056o.f("Error initializing JRebel integration. JRebel integration disabled.", th2);
                }
            } catch (Throwable th3) {
                if (!(th3 instanceof ClassNotFoundException)) {
                    f73056o.f("Error initializing JRebel integration. JRebel integration disabled.", th3);
                }
            }
        } catch (Throwable unused) {
        }
        f73058q = oVar;
        f73059r = new Object();
        f73060s = new Object();
        f73061t = new Object();
    }

    p(q qVar, Object obj) {
        this(qVar, obj, false, false);
    }

    private void a(Map map, Class cls, Map map2) throws Throwable {
        BeanInfo beanInfo = Introspector.getBeanInfo(cls);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        if (propertyDescriptors != null) {
            for (int length = propertyDescriptors.length - 1; length >= 0; length--) {
                e(map, propertyDescriptors[length], cls, map2);
            }
        }
        if (this.f73064a < 2) {
            i.a aVar = new i.a();
            MethodDescriptor[] methodDescriptorArrY = y(beanInfo.getMethodDescriptors());
            if (methodDescriptorArrY != null) {
                i.b bVar = null;
                for (int length2 = methodDescriptorArrY.length - 1; length2 >= 0; length2--) {
                    Method methodP = p(methodDescriptorArrY[length2].getMethod(), map2);
                    if (methodP != null && r(methodP)) {
                        aVar.d(methodP);
                        if (this.f73066c != null) {
                            if (bVar == null) {
                                bVar = new i.b();
                            }
                            bVar.c(cls);
                            bVar.d(methodP);
                            this.f73066c.a(bVar, aVar);
                        }
                        PropertyDescriptor propertyDescriptorA = aVar.a();
                        if (propertyDescriptorA != null && !(map.get(propertyDescriptorA.getName()) instanceof PropertyDescriptor)) {
                            e(map, propertyDescriptorA, cls, map2);
                        }
                        String strB = aVar.b();
                        if (strB != null) {
                            Object obj = map.get(strB);
                            if (obj instanceof Method) {
                                w wVar = new w(this.f73067d);
                                wVar.c((Method) obj);
                                wVar.c(methodP);
                                map.put(strB, wVar);
                                l(map).remove(obj);
                            } else if (obj instanceof w) {
                                ((w) obj).c(methodP);
                            } else if (aVar.c() || !(obj instanceof PropertyDescriptor)) {
                                map.put(strB, methodP);
                                l(map).put(methodP, methodP.getParameterTypes());
                            }
                        }
                    }
                }
            }
        }
    }

    private void b(Map map, Class cls) throws Throwable {
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            if (constructors.length == 1) {
                Constructor<?> constructor = constructors[0];
                map.put(f73060s, new a0(constructor, constructor.getParameterTypes()));
            } else if (constructors.length > 1) {
                w wVar = new w(this.f73067d);
                for (Constructor<?> constructor2 : constructors) {
                    wVar.b(constructor2);
                }
                map.put(f73060s, wVar);
            }
        } catch (SecurityException e11) {
            kk0.b bVar = f73056o;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't discover constructors for class ");
            stringBuffer.append(cls.getName());
            bVar.v(stringBuffer.toString(), e11);
        }
    }

    private void c(Map map, Class cls) {
        for (Field field : cls.getFields()) {
            if ((field.getModifiers() & 8) == 0) {
                map.put(field.getName(), field);
            }
        }
    }

    private void d(Map map, Map map2) {
        Method methodO = o(a.f73078c, map2);
        if (methodO == null) {
            methodO = o(a.f73079d, map2);
        }
        if (methodO != null) {
            map.put(f73061t, methodO);
        }
    }

    private void e(Map map, PropertyDescriptor propertyDescriptor, Class cls, Map map2) {
        Throwable th2;
        if (propertyDescriptor instanceof IndexedPropertyDescriptor) {
            IndexedPropertyDescriptor indexedPropertyDescriptor = (IndexedPropertyDescriptor) propertyDescriptor;
            Method indexedReadMethod = indexedPropertyDescriptor.getIndexedReadMethod();
            Method methodP = p(indexedReadMethod, map2);
            if (methodP == null || !r(methodP)) {
                return;
            }
            if (indexedReadMethod != methodP) {
                try {
                    indexedPropertyDescriptor = new IndexedPropertyDescriptor(indexedPropertyDescriptor.getName(), indexedPropertyDescriptor.getReadMethod(), (Method) null, methodP, (Method) null);
                } catch (IntrospectionException e11) {
                    kk0.b bVar = f73056o;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Failed creating a publicly-accessible property descriptor for ");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append(" indexed property ");
                    stringBuffer.append(propertyDescriptor.getName());
                    stringBuffer.append(", read method ");
                    stringBuffer.append(methodP);
                    bVar.v(stringBuffer.toString(), e11);
                    return;
                }
            }
            map.put(indexedPropertyDescriptor.getName(), indexedPropertyDescriptor);
            l(map).put(methodP, methodP.getParameterTypes());
            return;
        }
        Method readMethod = propertyDescriptor.getReadMethod();
        Method methodP2 = p(readMethod, map2);
        if (methodP2 == null || !r(methodP2)) {
            return;
        }
        if (readMethod != methodP2) {
            try {
                PropertyDescriptor propertyDescriptor2 = new PropertyDescriptor(propertyDescriptor.getName(), methodP2, (Method) null);
                try {
                    propertyDescriptor2.setReadMethod(methodP2);
                    propertyDescriptor = propertyDescriptor2;
                } catch (IntrospectionException e12) {
                    th2 = e12;
                    propertyDescriptor = propertyDescriptor2;
                    kk0.b bVar2 = f73056o;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Failed creating a publicly-accessible property descriptor for ");
                    stringBuffer2.append(cls.getName());
                    stringBuffer2.append(" property ");
                    stringBuffer2.append(propertyDescriptor.getName());
                    stringBuffer2.append(", read method ");
                    stringBuffer2.append(methodP2);
                    bVar2.v(stringBuffer2.toString(), th2);
                    return;
                }
            } catch (IntrospectionException e13) {
                th2 = e13;
            }
        }
        map.put(propertyDescriptor.getName(), propertyDescriptor);
    }

    static /* synthetic */ Class f(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private Map g(Class cls) throws Throwable {
        HashMap map = new HashMap();
        if (this.f73065b) {
            c(map, cls);
        }
        Map mapH = h(cls);
        d(map, mapH);
        if (this.f73064a != 3) {
            try {
                a(map, cls, mapH);
            } catch (IntrospectionException e11) {
                kk0.b bVar = f73056o;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Couldn't properly perform introspection for class ");
                stringBuffer.append(cls);
                bVar.v(stringBuffer.toString(), e11);
                map.clear();
            }
        }
        b(map, cls);
        if (map.size() > 1) {
            return map;
        }
        if (map.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    private static Map h(Class cls) {
        HashMap map = new HashMap();
        i(cls, map);
        return map;
    }

    private static void i(Class cls, Map map) {
        if (Modifier.isPublic(cls.getModifiers())) {
            try {
                for (Method method : cls.getMethods()) {
                    a aVar = new a(method);
                    List linkedList = (List) map.get(aVar);
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        map.put(aVar, linkedList);
                    }
                    linkedList.add(method);
                }
                return;
            } catch (SecurityException e11) {
                kk0.b bVar = f73056o;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Could not discover accessible methods of class ");
                stringBuffer.append(cls.getName());
                stringBuffer.append(", attemping superclasses/interfaces.");
                bVar.v(stringBuffer.toString(), e11);
            }
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            i(cls2, map);
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            i(superclass, map);
        }
    }

    private void j() {
        synchronized (this.f73070g) {
            try {
                this.f73071h.clear();
                this.f73073j.clear();
                this.f73077n++;
                Iterator it = this.f73075l.iterator();
                while (it.hasNext()) {
                    Object obj = ((WeakReference) it.next()).get();
                    if (obj != null) {
                        if (obj instanceof n) {
                            ((n) obj).a();
                        } else {
                            if (!(obj instanceof jk0.e)) {
                                throw new BugException();
                            }
                            ((jk0.e) obj).a();
                        }
                    }
                }
                x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Map l(Map map) {
        Object obj = f73059r;
        Map map2 = (Map) map.get(obj);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap();
        map.put(obj, map3);
        return map3;
    }

    private static Method o(a aVar, Map map) {
        List list = (List) map.get(aVar);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Method) list.iterator().next();
    }

    private static Method p(Method method, Map map) {
        List<Method> list;
        if (method == null || (list = (List) map.get(new a(method))) == null) {
            return null;
        }
        for (Method method2 : list) {
            if (method2.getReturnType() == method.getReturnType()) {
                return method2;
            }
        }
        return null;
    }

    private void t(String str) {
        kk0.b bVar = f73056o;
        if (bVar.o()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Detected multiple classes with the same name, \"");
            stringBuffer.append(str);
            stringBuffer.append("\". Assuming it was a class-reloading. Clearing class introspection ");
            stringBuffer.append("caches to release old data.");
            bVar.l(stringBuffer.toString());
        }
        j();
    }

    private void v(Object obj) {
        synchronized (this.f73070g) {
            this.f73075l.add(new WeakReference(obj, this.f73076m));
            x();
        }
    }

    private void x() {
        while (true) {
            Reference referencePoll = this.f73076m.poll();
            if (referencePoll == null) {
                return;
            }
            synchronized (this.f73070g) {
                try {
                    Iterator it = this.f73075l.iterator();
                    while (it.hasNext()) {
                        if (it.next() == referencePoll) {
                            it.remove();
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    Map k(Class cls) {
        Map map;
        if (this.f73072i && (map = (Map) this.f73071h.get(cls)) != null) {
            return map;
        }
        synchronized (this.f73070g) {
            try {
                Map map2 = (Map) this.f73071h.get(cls);
                if (map2 != null) {
                    return map2;
                }
                String name = cls.getName();
                if (this.f73073j.contains(name)) {
                    t(name);
                }
                while (map2 == null && this.f73074k.contains(cls)) {
                    try {
                        this.f73070g.wait();
                        map2 = (Map) this.f73071h.get(cls);
                    } catch (InterruptedException e11) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Class inrospection data lookup aborded: ");
                        stringBuffer.append(e11);
                        throw new RuntimeException(stringBuffer.toString());
                    }
                }
                if (map2 != null) {
                    return map2;
                }
                this.f73074k.add(cls);
                try {
                    Map mapG = g(cls);
                    synchronized (this.f73070g) {
                        this.f73071h.put(cls, mapG);
                        this.f73073j.add(name);
                    }
                    synchronized (this.f73070g) {
                        this.f73074k.remove(cls);
                        this.f73070g.notifyAll();
                    }
                    return mapG;
                } catch (Throwable th2) {
                    synchronized (this.f73070g) {
                        this.f73074k.remove(cls);
                        this.f73070g.notifyAll();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    boolean m() {
        return this.f73065b;
    }

    int n() {
        return this.f73064a;
    }

    Object q() {
        return this.f73070g;
    }

    boolean r(Method method) {
        return this.f73064a < 1 || !d0.d(method);
    }

    boolean s() {
        return this.f73069f;
    }

    void u(n nVar) {
        v(nVar);
    }

    void w(jk0.e eVar) {
        v(eVar);
    }

    p(q qVar, Object obj, boolean z11, boolean z12) {
        Map mapD = freemarker.core.n.d(0, 0.75f, 16);
        this.f73071h = mapD;
        this.f73072i = freemarker.core.n.b(mapD);
        this.f73073j = new HashSet(0);
        this.f73074k = new HashSet(0);
        this.f73075l = new LinkedList();
        this.f73076m = new ReferenceQueue();
        NullArgumentException.a("sharedLock", obj);
        this.f73064a = qVar.c();
        this.f73065b = qVar.b();
        this.f73066c = qVar.d();
        qVar.e();
        this.f73067d = qVar.f();
        this.f73070g = obj;
        this.f73068e = z11;
        this.f73069f = z12;
        o oVar = f73058q;
        if (oVar != null) {
            oVar.a(this);
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final a f73078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final a f73079d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f73080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class[] f73081b;

        static {
            Class clsF = p.f73062u;
            if (clsF == null) {
                clsF = p.f("java.lang.String");
                p.f73062u = clsF;
            }
            f73078c = new a("get", new Class[]{clsF});
            Class clsF2 = p.f73063v;
            if (clsF2 == null) {
                clsF2 = p.f("java.lang.Object");
                p.f73063v = clsF2;
            }
            f73079d = new a("get", new Class[]{clsF2});
        }

        private a(String str, Class[] clsArr) {
            this.f73080a = str;
            this.f73081b = clsArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar.f73080a.equals(this.f73080a) && Arrays.equals(this.f73081b, aVar.f73081b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f73080a.hashCode() ^ this.f73081b.length;
        }

        a(Method method) {
            this(method.getName(), method.getParameterTypes());
        }
    }

    private MethodDescriptor[] y(MethodDescriptor[] methodDescriptorArr) {
        return methodDescriptorArr;
    }
}
