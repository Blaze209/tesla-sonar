package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q0<K, T extends Closeable> implements z0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<K, q0<K, T>.a> f21954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0<T> f21955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21958e;

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f21959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CopyOnWriteArraySet<Pair<n<T>, a1>> f21960b = pk.m.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f21961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f21962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private e f21964f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private q0<K, T>.a.b f21965g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.q0$a$a, reason: collision with other inner class name */
        class C0440a extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f21967a;

            C0440a(Pair pair) {
                this.f21967a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.f, com.facebook.imagepipeline.producers.b1
            public void a() {
                e.b(a.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.b1
            public void b() {
                boolean zRemove;
                List list;
                e eVar;
                List listT;
                List listR;
                synchronized (a.this) {
                    try {
                        zRemove = a.this.f21960b.remove(this.f21967a);
                        list = null;
                        if (!zRemove) {
                            eVar = null;
                            listT = null;
                        } else if (a.this.f21960b.isEmpty()) {
                            eVar = a.this.f21964f;
                            listT = null;
                        } else {
                            List listS = a.this.s();
                            listT = a.this.t();
                            listR = a.this.r();
                            eVar = null;
                            list = listS;
                        }
                        listR = listT;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                e.d(list);
                e.e(listT);
                e.b(listR);
                if (eVar != null) {
                    if (!q0.this.f21956c || eVar.c0()) {
                        eVar.f();
                    } else {
                        e.e(eVar.j(om.e.LOW));
                    }
                }
                if (zRemove) {
                    ((n) this.f21967a.first).a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.f, com.facebook.imagepipeline.producers.b1
            public void c() {
                e.d(a.this.s());
            }

            @Override // com.facebook.imagepipeline.producers.f, com.facebook.imagepipeline.producers.b1
            public void d() {
                e.e(a.this.t());
            }
        }

        private class b extends c<T> {
            @Override // com.facebook.imagepipeline.producers.c
            protected void f() {
                try {
                    if (bn.b.d()) {
                        bn.b.a("MultiplexProducer#onCancellation");
                    }
                    a.this.m(this);
                } finally {
                    if (bn.b.d()) {
                        bn.b.b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.c
            protected void g(Throwable th2) {
                try {
                    if (bn.b.d()) {
                        bn.b.a("MultiplexProducer#onFailure");
                    }
                    a.this.n(this, th2);
                } finally {
                    if (bn.b.d()) {
                        bn.b.b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.c
            protected void i(float f11) {
                try {
                    if (bn.b.d()) {
                        bn.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.p(this, f11);
                } finally {
                    if (bn.b.d()) {
                        bn.b.b();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.c
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public void h(T t11, int i11) {
                try {
                    if (bn.b.d()) {
                        bn.b.a("MultiplexProducer#onNewResult");
                    }
                    a.this.o(this, t11, i11);
                } finally {
                    if (bn.b.d()) {
                        bn.b.b();
                    }
                }
            }

            private b() {
            }
        }

        public a(K k11) {
            this.f21959a = k11;
        }

        private void g(Pair<n<T>, a1> pair, a1 a1Var) {
            a1Var.H(new C0440a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }

        private synchronized boolean j() {
            Iterator<Pair<n<T>, a1>> it = this.f21960b.iterator();
            while (it.hasNext()) {
                if (((a1) it.next().second).b0()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator<Pair<n<T>, a1>> it = this.f21960b.iterator();
            while (it.hasNext()) {
                if (!((a1) it.next().second).c0()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized om.e l() {
            om.e higherPriority;
            higherPriority = om.e.LOW;
            Iterator<Pair<n<T>, a1>> it = this.f21960b.iterator();
            while (it.hasNext()) {
                higherPriority = om.e.getHigherPriority(higherPriority, ((a1) it.next().second).t());
            }
            return higherPriority;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(xk.d dVar) {
            synchronized (this) {
                try {
                    pk.k.b(Boolean.valueOf(this.f21964f == null));
                    pk.k.b(Boolean.valueOf(this.f21965g == null));
                    if (this.f21960b.isEmpty()) {
                        q0.this.k(this.f21959a, this);
                        return;
                    }
                    a1 a1Var = (a1) this.f21960b.iterator().next().second;
                    e eVar = new e(a1Var.B(), a1Var.getId(), a1Var.p(), a1Var.c(), a1Var.k0(), k(), j(), l(), a1Var.n());
                    this.f21964f = eVar;
                    eVar.C(a1Var.getExtras());
                    if (dVar.isSet()) {
                        this.f21964f.o("started_as_prefetch", Boolean.valueOf(dVar.asBoolean()));
                    }
                    q0<K, T>.a.b bVar = new b();
                    this.f21965g = bVar;
                    q0.this.f21955b.a(bVar, this.f21964f);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<b1> r() {
            e eVar = this.f21964f;
            if (eVar == null) {
                return null;
            }
            return eVar.h(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<b1> s() {
            e eVar = this.f21964f;
            if (eVar == null) {
                return null;
            }
            return eVar.i(k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<b1> t() {
            e eVar = this.f21964f;
            if (eVar == null) {
                return null;
            }
            return eVar.j(l());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean h(n<T> nVar, a1 a1Var) {
            Pair<n<T>, a1> pairCreate = Pair.create(nVar, a1Var);
            synchronized (this) {
                try {
                    if (q0.this.i(this.f21959a) != this) {
                        return false;
                    }
                    this.f21960b.add(pairCreate);
                    List<b1> listS = s();
                    List<b1> listT = t();
                    List<b1> listR = r();
                    Closeable closeableG = this.f21961c;
                    float f11 = this.f21962d;
                    int i11 = this.f21963e;
                    e.d(listS);
                    e.e(listT);
                    e.b(listR);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                try {
                                    if (closeableG != this.f21961c) {
                                        closeableG = null;
                                    } else if (closeableG != null) {
                                        closeableG = q0.this.g(closeableG);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (closeableG != null) {
                                if (f11 > BitmapDescriptorFactory.HUE_RED) {
                                    nVar.c(f11);
                                }
                                nVar.b(closeableG, i11);
                                i(closeableG);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    g(pairCreate, a1Var);
                    return true;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public void m(q0<K, T>.a.b bVar) {
            synchronized (this) {
                try {
                    if (this.f21965g != bVar) {
                        return;
                    }
                    this.f21965g = null;
                    this.f21964f = null;
                    i(this.f21961c);
                    this.f21961c = null;
                    q(xk.d.UNSET);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void n(q0<K, T>.a.b bVar, Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f21965g != bVar) {
                        return;
                    }
                    this.f21960b.clear();
                    q0.this.k(this.f21959a, this);
                    i(this.f21961c);
                    this.f21961c = null;
                    for (Pair<n<T>, a1> pair : this.f21960b) {
                        synchronized (pair) {
                            try {
                                ((a1) pair.second).p().k((a1) pair.second, q0.this.f21957d, th2, null);
                                e eVar = this.f21964f;
                                if (eVar != null) {
                                    ((a1) pair.second).C(eVar.getExtras());
                                }
                                ((n) pair.first).onFailure(th2);
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public void o(q0<K, T>.a.b bVar, T t11, int i11) {
            synchronized (this) {
                try {
                    if (this.f21965g != bVar) {
                        return;
                    }
                    i(this.f21961c);
                    this.f21961c = null;
                    int size = this.f21960b.size();
                    if (c.e(i11)) {
                        this.f21961c = (T) q0.this.g(t11);
                        this.f21963e = i11;
                    } else {
                        this.f21960b.clear();
                        q0.this.k(this.f21959a, this);
                    }
                    for (Pair<n<T>, a1> pair : this.f21960b) {
                        synchronized (pair) {
                            try {
                                if (c.d(i11)) {
                                    ((a1) pair.second).p().j((a1) pair.second, q0.this.f21957d, null);
                                    e eVar = this.f21964f;
                                    if (eVar != null) {
                                        ((a1) pair.second).C(eVar.getExtras());
                                    }
                                    ((a1) pair.second).o(q0.this.f21958e, Integer.valueOf(size));
                                }
                                ((n) pair.first).b(t11, i11);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public void p(q0<K, T>.a.b bVar, float f11) {
            synchronized (this) {
                try {
                    if (this.f21965g != bVar) {
                        return;
                    }
                    this.f21962d = f11;
                    for (Pair<n<T>, a1> pair : this.f21960b) {
                        synchronized (pair) {
                            ((n) pair.first).c(f11);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected q0(z0<T> z0Var, String str, String str2) {
        this(z0Var, str, str2, false);
    }

    private synchronized q0<K, T>.a h(K k11) {
        q0<K, T>.a aVar;
        aVar = new a(k11);
        this.f21954a.put(k11, aVar);
        return aVar;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<T> nVar, a1 a1Var) {
        q0<K, T>.a aVarI;
        boolean z11;
        try {
            if (bn.b.d()) {
                bn.b.a("MultiplexProducer#produceResults");
            }
            a1Var.p().b(a1Var, this.f21957d);
            K kJ = j(a1Var);
            do {
                synchronized (this) {
                    try {
                        aVarI = i(kJ);
                        if (aVarI == null) {
                            aVarI = h(kJ);
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (!aVarI.h(nVar, a1Var));
            if (z11) {
                aVarI.q(xk.d.valueOf(a1Var.c0()));
            }
            if (bn.b.d()) {
                bn.b.b();
            }
        } catch (Throwable th3) {
            if (bn.b.d()) {
                bn.b.b();
            }
            throw th3;
        }
    }

    protected abstract T g(T t11);

    protected synchronized q0<K, T>.a i(K k11) {
        return this.f21954a.get(k11);
    }

    protected abstract K j(a1 a1Var);

    protected synchronized void k(K k11, q0<K, T>.a aVar) {
        if (this.f21954a.get(k11) == aVar) {
            this.f21954a.remove(k11);
        }
    }

    protected q0(z0<T> z0Var, String str, String str2, boolean z11) {
        this.f21955b = z0Var;
        this.f21954a = new HashMap();
        this.f21956c = z11;
        this.f21957d = str;
        this.f21958e = str2;
    }
}
