package com.facebook.datasource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import pk.k;
import pk.n;

/* JADX INFO: loaded from: classes3.dex */
public class h<T> implements n<c<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<n<c<T>>> f21554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21555b;

    private class a extends com.facebook.datasource.a<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ArrayList<c<T>> f21556h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f21557i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f21558j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private AtomicInteger f21559k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Throwable f21560l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Map<String, Object> f21561m;

        /* JADX INFO: renamed from: com.facebook.datasource.h$a$a, reason: collision with other inner class name */
        private class C0432a implements e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f21563a;

            public C0432a(int i11) {
                this.f21563a = i11;
            }

            @Override // com.facebook.datasource.e
            public void onCancellation(c<T> cVar) {
            }

            @Override // com.facebook.datasource.e
            public void onFailure(c<T> cVar) {
                a.this.D(this.f21563a, cVar);
            }

            @Override // com.facebook.datasource.e
            public void onNewResult(c<T> cVar) {
                if (cVar.a()) {
                    a.this.E(this.f21563a, cVar);
                } else if (cVar.isFinished()) {
                    a.this.D(this.f21563a, cVar);
                }
            }

            @Override // com.facebook.datasource.e
            public void onProgressUpdate(c<T> cVar) {
                if (this.f21563a == 0) {
                    a.this.p(cVar.getProgress());
                }
            }
        }

        public a() {
            if (h.this.f21555b) {
                return;
            }
            x();
        }

        private synchronized c<T> A() {
            return z(this.f21557i);
        }

        private void B() {
            Throwable th2;
            if (this.f21559k.incrementAndGet() != this.f21558j || (th2 = this.f21560l) == null) {
                return;
            }
            n(th2, this.f21561m);
        }

        private void C(int i11, c<T> cVar, boolean z11) {
            synchronized (this) {
                try {
                    int i12 = this.f21557i;
                    if (cVar == z(i11) && i11 != this.f21557i) {
                        if (A() == null || (z11 && i11 < this.f21557i)) {
                            this.f21557i = i11;
                        } else {
                            i11 = i12;
                        }
                        while (i12 > i11) {
                            w(y(i12));
                            i12--;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D(int i11, c<T> cVar) {
            w(F(i11, cVar));
            if (i11 == 0) {
                this.f21560l = cVar.b();
                this.f21561m = cVar.getExtras();
            }
            B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(int i11, c<T> cVar) {
            C(i11, cVar, cVar.isFinished());
            if (cVar == A()) {
                r(null, i11 == 0 && cVar.isFinished(), cVar.getExtras());
            }
            B();
        }

        private synchronized c<T> F(int i11, c<T> cVar) {
            if (cVar == A()) {
                return null;
            }
            if (cVar != z(i11)) {
                return cVar;
            }
            return y(i11);
        }

        private void w(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private void x() {
            if (this.f21559k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f21559k == null) {
                        this.f21559k = new AtomicInteger(0);
                        int size = h.this.f21554a.size();
                        this.f21558j = size;
                        this.f21557i = size;
                        this.f21556h = new ArrayList<>(size);
                        for (int i11 = 0; i11 < size; i11++) {
                            c<T> cVar = (c) ((n) h.this.f21554a.get(i11)).get();
                            this.f21556h.add(cVar);
                            cVar.c(new C0432a(i11), nk.a.a());
                            if (cVar.a()) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private synchronized c<T> y(int i11) {
            c<T> cVar;
            ArrayList<c<T>> arrayList = this.f21556h;
            cVar = null;
            if (arrayList != null && i11 < arrayList.size()) {
                cVar = this.f21556h.set(i11, null);
            }
            return cVar;
        }

        private synchronized c<T> z(int i11) {
            ArrayList<c<T>> arrayList;
            arrayList = this.f21556h;
            return (arrayList == null || i11 >= arrayList.size()) ? null : this.f21556h.get(i11);
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized boolean a() {
            c<T> cVarA;
            try {
                if (h.this.f21555b) {
                    x();
                }
                cVarA = A();
            } catch (Throwable th2) {
                throw th2;
            }
            return cVarA != null && cVarA.a();
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public boolean close() {
            if (h.this.f21555b) {
                x();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList<c<T>> arrayList = this.f21556h;
                    this.f21556h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        w(arrayList.get(i11));
                    }
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized T getResult() {
            c<T> cVarA;
            try {
                if (h.this.f21555b) {
                    x();
                }
                cVarA = A();
            } catch (Throwable th2) {
                throw th2;
            }
            return cVarA != null ? cVarA.getResult() : null;
        }
    }

    private h(List<n<c<T>>> list, boolean z11) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f21554a = list;
        this.f21555b = z11;
    }

    public static <T> h<T> c(List<n<c<T>>> list, boolean z11) {
        return new h<>(list, z11);
    }

    @Override // pk.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c<T> get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return pk.i.a(this.f21554a, ((h) obj).f21554a);
        }
        return false;
    }

    public int hashCode() {
        return this.f21554a.hashCode();
    }

    public String toString() {
        return pk.i.b(this).b("list", this.f21554a).toString();
    }
}
