package com.facebook.datasource;

import java.util.List;
import pk.k;
import pk.n;

/* JADX INFO: loaded from: classes3.dex */
public class f<T> implements n<c<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<n<c<T>>> f21548a;

    private class a extends com.facebook.datasource.a<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f21549h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c<T> f21550i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private c<T> f21551j = null;

        /* JADX INFO: renamed from: com.facebook.datasource.f$a$a, reason: collision with other inner class name */
        private class C0431a implements e<T> {
            @Override // com.facebook.datasource.e
            public void onCancellation(c<T> cVar) {
            }

            @Override // com.facebook.datasource.e
            public void onFailure(c<T> cVar) {
                a.this.B(cVar);
            }

            @Override // com.facebook.datasource.e
            public void onNewResult(c<T> cVar) {
                if (cVar.a()) {
                    a.this.C(cVar);
                } else if (cVar.isFinished()) {
                    a.this.B(cVar);
                }
            }

            @Override // com.facebook.datasource.e
            public void onProgressUpdate(c<T> cVar) {
                a.this.p(Math.max(a.this.getProgress(), cVar.getProgress()));
            }

            private C0431a() {
            }
        }

        public a() {
            if (E()) {
                return;
            }
            m(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private void A(c<T> cVar, boolean z11) {
            c<T> cVar2;
            synchronized (this) {
                if (cVar == this.f21550i && cVar != (cVar2 = this.f21551j)) {
                    if (cVar2 == null || z11) {
                        this.f21551j = cVar;
                    } else {
                        cVar2 = null;
                    }
                    x(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B(c<T> cVar) {
            if (w(cVar)) {
                if (cVar != y()) {
                    x(cVar);
                }
                if (E()) {
                    return;
                }
                n(cVar.b(), cVar.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(c<T> cVar) {
            A(cVar, cVar.isFinished());
            if (cVar == y()) {
                r(null, cVar.isFinished(), cVar.getExtras());
            }
        }

        private synchronized boolean D(c<T> cVar) {
            if (h()) {
                return false;
            }
            this.f21550i = cVar;
            return true;
        }

        private boolean E() {
            n<c<T>> nVarZ = z();
            c<T> cVar = nVarZ != null ? nVarZ.get() : null;
            if (!D(cVar) || cVar == null) {
                x(cVar);
                return false;
            }
            cVar.c(new C0431a(), nk.a.a());
            return true;
        }

        private synchronized boolean w(c<T> cVar) {
            if (!h() && cVar == this.f21550i) {
                this.f21550i = null;
                return true;
            }
            return false;
        }

        private void x(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private synchronized c<T> y() {
            return this.f21551j;
        }

        private synchronized n<c<T>> z() {
            if (h() || this.f21549h >= f.this.f21548a.size()) {
                return null;
            }
            List list = f.this.f21548a;
            int i11 = this.f21549h;
            this.f21549h = i11 + 1;
            return (n) list.get(i11);
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized boolean a() {
            c<T> cVarY;
            cVarY = y();
            return cVarY != null && cVarY.a();
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    c<T> cVar = this.f21550i;
                    this.f21550i = null;
                    c<T> cVar2 = this.f21551j;
                    this.f21551j = null;
                    x(cVar2);
                    x(cVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public synchronized T getResult() {
            c<T> cVarY;
            cVarY = y();
            return cVarY != null ? cVarY.getResult() : null;
        }
    }

    private f(List<n<c<T>>> list) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f21548a = list;
    }

    public static <T> f<T> b(List<n<c<T>>> list) {
        return new f<>(list);
    }

    @Override // pk.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c<T> get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return pk.i.a(this.f21548a, ((f) obj).f21548a);
        }
        return false;
    }

    public int hashCode() {
        return this.f21548a.hashCode();
    }

    public String toString() {
        return pk.i.b(this).b("list", this.f21548a).toString();
    }
}
