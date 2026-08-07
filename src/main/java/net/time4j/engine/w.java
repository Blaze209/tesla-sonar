package net.time4j.engine;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class w<T> implements t<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<b> f94151f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ReferenceQueue<w<?>> f94152g = new ReferenceQueue<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f94153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t<T> f94154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<p<?>, y<T, ?>> f94155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<r> f94156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<p<?>, b0<T>> f94157e;

    public static class a<T extends q<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<T> f94158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f94159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final t<T> f94160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Map<p<?>, y<T, ?>> f94161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final List<r> f94162e;

        a(Class<T> cls, t<T> tVar) {
            if (tVar == null) {
                throw new NullPointerException("Missing chronological merger.");
            }
            this.f94158a = cls;
            this.f94159b = cls.getName().startsWith("net.time4j.");
            this.f94160c = tVar;
            this.f94161d = new HashMap();
            this.f94162e = new ArrayList();
        }

        private void c(p<?> pVar) {
            if (this.f94159b) {
                return;
            }
            if (pVar == null) {
                throw new NullPointerException("Static initialization problem: Check if given element statically refer to any chronology causing premature class loading.");
            }
            String strName = pVar.name();
            for (p<?> pVar2 : this.f94161d.keySet()) {
                if (pVar2.equals(pVar) || pVar2.name().equals(strName)) {
                    throw new IllegalArgumentException("Element duplicate found: " + strName);
                }
            }
        }

        public <V> a<T> a(p<V> pVar, y<T, V> yVar) {
            c(pVar);
            this.f94161d.put(pVar, yVar);
            return this;
        }

        public a<T> b(r rVar) {
            if (rVar == null) {
                throw new NullPointerException("Missing chronological extension.");
            }
            if (!this.f94162e.contains(rVar)) {
                this.f94162e.add(rVar);
            }
            return this;
        }
    }

    private static class b extends WeakReference<w<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f94163a;

        b(w<?> wVar, ReferenceQueue<w<?>> referenceQueue) {
            super(wVar, referenceQueue);
            this.f94163a = ((w) wVar).f94153a.getName();
        }
    }

    w(Class<T> cls, t<T> tVar, Map<p<?>, y<T, ?>> map, List<r> list) {
        if (cls == null) {
            throw new NullPointerException("Missing chronological type.");
        }
        if (tVar == null) {
            throw new NullPointerException("Missing chronological merger.");
        }
        this.f94153a = cls;
        this.f94154b = tVar;
        Map<p<?>, y<T, ?>> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        this.f94155c = mapUnmodifiableMap;
        this.f94156d = Collections.unmodifiableList(list);
        HashMap map2 = new HashMap();
        for (p<?> pVar : mapUnmodifiableMap.keySet()) {
            if (pVar.getType() == Integer.class) {
                y<T, ?> yVar = this.f94155c.get(pVar);
                if (yVar instanceof b0) {
                    map2.put(pVar, (b0) yVar);
                }
            }
        }
        this.f94157e = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T m(Object obj) {
        return obj;
    }

    private y<T, ?> q(p<?> pVar, boolean z11) {
        if (!(pVar instanceof e) || !q.class.isAssignableFrom(p())) {
            return null;
        }
        e eVar = (e) e.class.cast(pVar);
        String strL = z11 ? eVar.l(this) : null;
        if (strL == null) {
            return (y) m(eVar.f((w) m(this)));
        }
        throw new RuleNotFoundException(strL);
    }

    public static <T> w<T> x(Class<T> cls) {
        w<?> wVar;
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            Iterator<b> it = f94151f.iterator();
            boolean z11 = false;
            while (true) {
                if (!it.hasNext()) {
                    wVar = null;
                    break;
                }
                wVar = it.next().get();
                if (wVar == null) {
                    z11 = true;
                } else if (wVar.p() == cls) {
                    break;
                }
            }
            if (z11) {
                y();
            }
            return (w) m(wVar);
        } catch (ClassNotFoundException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static void y() {
        while (true) {
            b bVar = (b) f94152g.poll();
            if (bVar == null) {
                return;
            }
            for (b bVar2 : f94151f) {
                if (bVar2.f94163a.equals(bVar.f94163a)) {
                    f94151f.remove(bVar2);
                    break;
                }
            }
        }
    }

    static void z(w<?> wVar) {
        f94151f.add(new b(wVar, f94152g));
    }

    @Override // net.time4j.engine.t
    public w<?> a() {
        return this.f94154b.a();
    }

    @Override // net.time4j.engine.t
    public T b(q<?> qVar, d dVar, boolean z11, boolean z12) {
        return this.f94154b.b(qVar, dVar, z11, z12);
    }

    @Override // net.time4j.engine.t
    public int c() {
        return this.f94154b.c();
    }

    @Override // net.time4j.engine.t
    public o f(T t11, d dVar) {
        return this.f94154b.f(t11, dVar);
    }

    @Override // net.time4j.engine.t
    public d0 h() {
        return this.f94154b.h();
    }

    @Override // net.time4j.engine.t
    public String j(x xVar, Locale locale) {
        return this.f94154b.j(xVar, locale);
    }

    public k<T> n() {
        throw new ChronoException("Calendar system is not available.");
    }

    public k<T> o(String str) {
        throw new ChronoException("Calendar variant is not available: " + str);
    }

    public Class<T> p() {
        return this.f94153a;
    }

    public List<r> r() {
        return this.f94156d;
    }

    b0<T> s(p<Integer> pVar) {
        return this.f94157e.get(pVar);
    }

    public Set<p<?>> t() {
        return this.f94155c.keySet();
    }

    <V> y<T, V> u(p<V> pVar) {
        if (pVar == null) {
            throw new NullPointerException("Missing chronological element.");
        }
        y<T, ?> yVarQ = this.f94155c.get(pVar);
        if (yVarQ == null && (yVarQ = q(pVar, true)) == null) {
            throw new RuleNotFoundException((w<?>) this, (p<?>) pVar);
        }
        return (y) m(yVarQ);
    }

    public boolean v(p<?> pVar) {
        return pVar != null && this.f94155c.containsKey(pVar);
    }

    public boolean w(p<?> pVar) {
        if (pVar == null) {
            return false;
        }
        return v(pVar) || q(pVar, false) != null;
    }
}
