package wq0;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static volatile c f122254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final d f122255t = new d();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f122256u = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<p>> f122257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f122258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Object> f122259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<C2625c> f122260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f122261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f122262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wq0.b f122263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wq0.a f122264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o f122265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ExecutorService f122266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f122267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f122268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f122269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f122270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f122271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f122272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f122273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f f122274r;

    class a extends ThreadLocal<C2625c> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2625c initialValue() {
            return new C2625c();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f122276a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f122276a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122276a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122276a[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122276a[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: wq0.c$c, reason: collision with other inner class name */
    static final class C2625c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<Object> f122277a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f122278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f122279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        p f122280d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f122282f;

        C2625c() {
        }
    }

    public c() {
        this(f122255t);
    }

    static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    private void b(p pVar, Object obj) {
        if (obj != null) {
            o(pVar, obj, i());
        }
    }

    public static c c() {
        if (f122254s == null) {
            synchronized (c.class) {
                try {
                    if (f122254s == null) {
                        f122254s = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f122254s;
    }

    private void f(p pVar, Object obj, Throwable th2) {
        if (!(obj instanceof m)) {
            if (this.f122267k) {
                throw new EventBusException("Invoking subscriber failed", th2);
            }
            if (this.f122268l) {
                this.f122274r.b(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.f122333a.getClass(), th2);
            }
            if (this.f122270n) {
                l(new m(this, th2, obj, pVar.f122333a));
                return;
            }
            return;
        }
        if (this.f122268l) {
            f fVar = this.f122274r;
            Level level = Level.SEVERE;
            fVar.b(level, "SubscriberExceptionEvent subscriber " + pVar.f122333a.getClass() + " threw an exception", th2);
            m mVar = (m) obj;
            this.f122274r.b(level, "Initial event " + mVar.f122313c + " caused exception in " + mVar.f122314d, mVar.f122312b);
        }
    }

    private boolean i() {
        g gVar = this.f122261e;
        if (gVar != null) {
            return gVar.a();
        }
        return true;
    }

    private static List<Class<?>> k(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f122256u;
        synchronized (map) {
            try {
                arrayList = map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f122256u.put(cls, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    private void m(Object obj, C2625c c2625c) {
        boolean zN;
        Class<?> cls = obj.getClass();
        if (this.f122272p) {
            List<Class<?>> listK = k(cls);
            int size = listK.size();
            zN = false;
            for (int i11 = 0; i11 < size; i11++) {
                zN |= n(obj, c2625c, listK.get(i11));
            }
        } else {
            zN = n(obj, c2625c, cls);
        }
        if (zN) {
            return;
        }
        if (this.f122269m) {
            this.f122274r.a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f122271o || cls == h.class || cls == m.class) {
            return;
        }
        l(new h(this, obj));
    }

    private boolean n(Object obj, C2625c c2625c, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f122257a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (p pVar : copyOnWriteArrayList) {
            c2625c.f122281e = obj;
            c2625c.f122280d = pVar;
            try {
                o(pVar, obj, c2625c.f122279c);
                boolean z11 = c2625c.f122282f;
                c2625c.f122281e = null;
                c2625c.f122280d = null;
                c2625c.f122282f = false;
                if (z11) {
                    return true;
                }
            } catch (Throwable th2) {
                c2625c.f122281e = null;
                c2625c.f122280d = null;
                c2625c.f122282f = false;
                throw th2;
            }
        }
        return true;
    }

    private void o(p pVar, Object obj, boolean z11) {
        int i11 = b.f122276a[pVar.f122334b.f122316b.ordinal()];
        if (i11 == 1) {
            h(pVar, obj);
            return;
        }
        if (i11 == 2) {
            if (z11) {
                h(pVar, obj);
                return;
            } else {
                this.f122262f.a(pVar, obj);
                return;
            }
        }
        if (i11 == 3) {
            if (z11) {
                this.f122263g.a(pVar, obj);
                return;
            } else {
                h(pVar, obj);
                return;
            }
        }
        if (i11 == 4) {
            this.f122264h.a(pVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + pVar.f122334b.f122316b);
    }

    private void q(Object obj, n nVar) {
        Class<?> cls = nVar.f122317c;
        p pVar = new p(obj, nVar);
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.f122257a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f122257a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i11 = 0; i11 <= size; i11++) {
            if (i11 == size || nVar.f122318d > copyOnWriteArrayList.get(i11).f122334b.f122318d) {
                copyOnWriteArrayList.add(i11, pVar);
                break;
            }
        }
        List<Class<?>> arrayList = this.f122258b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f122258b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (nVar.f122319e) {
            if (!this.f122272p) {
                b(pVar, this.f122259c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f122259c.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    b(pVar, entry.getValue());
                }
            }
        }
    }

    private void s(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.f122257a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i11 = 0;
            while (i11 < size) {
                p pVar = copyOnWriteArrayList.get(i11);
                if (pVar.f122333a == obj) {
                    pVar.f122335c = false;
                    copyOnWriteArrayList.remove(i11);
                    i11--;
                    size--;
                }
                i11++;
            }
        }
    }

    ExecutorService d() {
        return this.f122266j;
    }

    public f e() {
        return this.f122274r;
    }

    void g(i iVar) {
        Object obj = iVar.f122306a;
        p pVar = iVar.f122307b;
        i.b(iVar);
        if (pVar.f122335c) {
            h(pVar, obj);
        }
    }

    void h(p pVar, Object obj) {
        try {
            pVar.f122334b.f122315a.invoke(pVar.f122333a, obj);
        } catch (IllegalAccessException e11) {
            throw new IllegalStateException("Unexpected exception", e11);
        } catch (InvocationTargetException e12) {
            f(pVar, obj, e12.getCause());
        }
    }

    public synchronized boolean j(Object obj) {
        return this.f122258b.containsKey(obj);
    }

    public void l(Object obj) {
        C2625c c2625c = this.f122260d.get();
        List<Object> list = c2625c.f122277a;
        list.add(obj);
        if (c2625c.f122278b) {
            return;
        }
        c2625c.f122279c = i();
        c2625c.f122278b = true;
        if (c2625c.f122282f) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                m(list.remove(0), c2625c);
            } catch (Throwable th2) {
                c2625c.f122278b = false;
                c2625c.f122279c = false;
                throw th2;
            }
        }
        c2625c.f122278b = false;
        c2625c.f122279c = false;
    }

    public void p(Object obj) {
        List<n> listA = this.f122265i.a(obj.getClass());
        synchronized (this) {
            try {
                Iterator<n> it = listA.iterator();
                while (it.hasNext()) {
                    q(obj, it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void r(Object obj) {
        try {
            List<Class<?>> list = this.f122258b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    s(obj, it.next());
                }
                this.f122258b.remove(obj);
            } else {
                this.f122274r.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f122273q + ", eventInheritance=" + this.f122272p + "]";
    }

    c(d dVar) {
        this.f122260d = new a();
        this.f122274r = dVar.b();
        this.f122257a = new HashMap();
        this.f122258b = new HashMap();
        this.f122259c = new ConcurrentHashMap();
        g gVarC = dVar.c();
        this.f122261e = gVarC;
        this.f122262f = gVarC != null ? gVarC.b(this) : null;
        this.f122263g = new wq0.b(this);
        this.f122264h = new wq0.a(this);
        List<xq0.b> list = dVar.f122293j;
        this.f122273q = list != null ? list.size() : 0;
        this.f122265i = new o(dVar.f122293j, dVar.f122291h, dVar.f122290g);
        this.f122268l = dVar.f122284a;
        this.f122269m = dVar.f122285b;
        this.f122270n = dVar.f122286c;
        this.f122271o = dVar.f122287d;
        this.f122267k = dVar.f122288e;
        this.f122272p = dVar.f122289f;
        this.f122266j = dVar.f122292i;
    }
}
