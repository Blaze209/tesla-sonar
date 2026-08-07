package gj;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements gj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<a, Object> f68969a = new g<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f68970b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f68971c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, gj.a<?>> f68972d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f68973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f68974f;

    private static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f68975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f68976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class<?> f68977c;

        a(b bVar) {
            this.f68975a = bVar;
        }

        @Override // gj.l
        public void a() {
            this.f68975a.c(this);
        }

        void b(int i11, Class<?> cls) {
            this.f68976b = i11;
            this.f68977c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f68976b == aVar.f68976b && this.f68977c == aVar.f68977c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.f68976b * 31;
            Class<?> cls = this.f68977c;
            return i11 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f68976b + "array=" + this.f68977c + CoreConstants.CURLY_RIGHT;
        }
    }

    private static final class b extends c<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // gj.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i11, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i11, cls);
            return aVarB;
        }
    }

    public i(int i11) {
        this.f68973e = i11;
    }

    private void e(int i11, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapL = l(cls);
        Integer num = navigableMapL.get(Integer.valueOf(i11));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapL.remove(Integer.valueOf(i11));
                return;
            } else {
                navigableMapL.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i11 + ", this: " + this);
    }

    private void f() {
        g(this.f68973e);
    }

    private void g(int i11) {
        while (this.f68974f > i11) {
            Object objF = this.f68969a.f();
            xj.k.d(objF);
            gj.a aVarH = h(objF);
            this.f68974f -= aVarH.a(objF) * aVarH.b();
            e(aVarH.a(objF), objF.getClass());
            if (Log.isLoggable(aVarH.getTag(), 2)) {
                Log.v(aVarH.getTag(), "evicted: " + aVarH.a(objF));
            }
        }
    }

    private <T> gj.a<T> h(T t11) {
        return i(t11.getClass());
    }

    private <T> gj.a<T> i(Class<T> cls) {
        gj.a<T> fVar;
        gj.a<T> aVar = (gj.a) this.f68972d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f68972d.put(cls, fVar);
        return fVar;
    }

    private <T> T j(a aVar) {
        return (T) this.f68969a.a(aVar);
    }

    private <T> T k(a aVar, Class<T> cls) {
        gj.a<T> aVarI = i(cls);
        T t11 = (T) j(aVar);
        if (t11 != null) {
            this.f68974f -= aVarI.a(t11) * aVarI.b();
            e(aVarI.a(t11), cls);
        }
        if (t11 != null) {
            return t11;
        }
        if (Log.isLoggable(aVarI.getTag(), 2)) {
            Log.v(aVarI.getTag(), "Allocated " + aVar.f68976b + " bytes");
        }
        return aVarI.newArray(aVar.f68976b);
    }

    private NavigableMap<Integer, Integer> l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f68971c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f68971c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i11 = this.f68974f;
        return i11 == 0 || this.f68973e / i11 >= 2;
    }

    private boolean n(int i11) {
        return i11 <= this.f68973e / 2;
    }

    private boolean o(int i11, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i11 * 8;
        }
        return false;
    }

    @Override // gj.b
    public synchronized void a(int i11) {
        try {
            if (i11 >= 40) {
                b();
            } else if (i11 >= 20 || i11 == 15) {
                g(this.f68973e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // gj.b
    public synchronized void b() {
        g(0);
    }

    @Override // gj.b
    public synchronized <T> T c(int i11, Class<T> cls) {
        Integer numCeilingKey;
        try {
            numCeilingKey = l(cls).ceilingKey(Integer.valueOf(i11));
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) k(o(i11, numCeilingKey) ? this.f68970b.e(numCeilingKey.intValue(), cls) : this.f68970b.e(i11, cls), cls);
    }

    @Override // gj.b
    public synchronized <T> T d(int i11, Class<T> cls) {
        return (T) k(this.f68970b.e(i11, cls), cls);
    }

    @Override // gj.b
    public synchronized <T> void put(T t11) {
        Class<?> cls = t11.getClass();
        gj.a<T> aVarI = i(cls);
        int iA = aVarI.a(t11);
        int iB = aVarI.b() * iA;
        if (n(iB)) {
            a aVarE = this.f68970b.e(iA, cls);
            this.f68969a.d(aVarE, t11);
            NavigableMap<Integer, Integer> navigableMapL = l(cls);
            Integer num = navigableMapL.get(Integer.valueOf(aVarE.f68976b));
            Integer numValueOf = Integer.valueOf(aVarE.f68976b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapL.put(numValueOf, Integer.valueOf(iIntValue));
            this.f68974f += iB;
            f();
        }
    }
}
