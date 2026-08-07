package com.facebook.imagepipeline.producers;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class x0 implements z0<tk.a<um.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0<tk.a<um.e>> f22025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mm.d f22026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f22027c;

    private class a extends u<tk.a<um.e>, tk.a<um.e>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c1 f22028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a1 f22029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final an.b f22030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f22031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private tk.a<um.e> f22032g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f22033h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f22034i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f22035j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.x0$a$a, reason: collision with other inner class name */
        class C0441a extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x0 f22037a;

            C0441a(x0 x0Var) {
                this.f22037a = x0Var;
            }

            @Override // com.facebook.imagepipeline.producers.b1
            public void b() {
                a.this.B();
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                tk.a aVar;
                int i11;
                synchronized (a.this) {
                    aVar = a.this.f22032g;
                    i11 = a.this.f22033h;
                    a.this.f22032g = null;
                    a.this.f22034i = false;
                }
                if (tk.a.b0(aVar)) {
                    try {
                        a.this.y(aVar, i11);
                        tk.a.C(aVar);
                    } catch (Throwable th2) {
                        tk.a.C(aVar);
                        throw th2;
                    }
                }
                a.this.w();
            }
        }

        public a(n<tk.a<um.e>> nVar, c1 c1Var, an.b bVar, a1 a1Var) {
            super(nVar);
            this.f22032g = null;
            this.f22033h = 0;
            this.f22034i = false;
            this.f22035j = false;
            this.f22028c = c1Var;
            this.f22030e = bVar;
            this.f22029d = a1Var;
            a1Var.H(new C0441a(x0.this));
        }

        private synchronized boolean A() {
            return this.f22031f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B() {
            if (x()) {
                o().a();
            }
        }

        private void C(Throwable th2) {
            if (x()) {
                o().onFailure(th2);
            }
        }

        private void D(tk.a<um.e> aVar, int i11) {
            boolean zD = com.facebook.imagepipeline.producers.c.d(i11);
            if ((zD || A()) && !(zD && x())) {
                return;
            }
            o().b(aVar, i11);
        }

        private tk.a<um.e> F(um.e eVar) {
            um.f fVar = (um.f) eVar;
            tk.a<Bitmap> aVarB = this.f22030e.b(fVar.t3(), x0.this.f22026b);
            try {
                um.f fVarP3 = um.f.p3(aVarB, eVar.o3(), fVar.U2(), fVar.L0());
                fVarP3.C(fVar.getExtras());
                return tk.a.c0(fVarP3);
            } finally {
                tk.a.C(aVarB);
            }
        }

        private synchronized boolean G() {
            if (this.f22031f || !this.f22034i || this.f22035j || !tk.a.b0(this.f22032g)) {
                return false;
            }
            this.f22035j = true;
            return true;
        }

        private boolean H(um.e eVar) {
            return eVar instanceof um.f;
        }

        private void I() {
            x0.this.f22027c.execute(new b());
        }

        private void J(tk.a<um.e> aVar, int i11) {
            synchronized (this) {
                try {
                    if (this.f22031f) {
                        return;
                    }
                    tk.a<um.e> aVar2 = this.f22032g;
                    this.f22032g = tk.a.t(aVar);
                    this.f22033h = i11;
                    this.f22034i = true;
                    boolean zG = G();
                    tk.a.C(aVar2);
                    if (zG) {
                        I();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w() {
            boolean zG;
            synchronized (this) {
                this.f22035j = false;
                zG = G();
            }
            if (zG) {
                I();
            }
        }

        private boolean x() {
            synchronized (this) {
                try {
                    if (this.f22031f) {
                        return false;
                    }
                    tk.a<um.e> aVar = this.f22032g;
                    this.f22032g = null;
                    this.f22031f = true;
                    tk.a.C(aVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(tk.a<um.e> aVar, int i11) {
            pk.k.b(Boolean.valueOf(tk.a.b0(aVar)));
            if (!H(aVar.H())) {
                D(aVar, i11);
                return;
            }
            this.f22028c.b(this.f22029d, "PostprocessorProducer");
            try {
                try {
                    tk.a<um.e> aVarF = F(aVar.H());
                    c1 c1Var = this.f22028c;
                    a1 a1Var = this.f22029d;
                    c1Var.j(a1Var, "PostprocessorProducer", z(c1Var, a1Var, this.f22030e));
                    D(aVarF, i11);
                    tk.a.C(aVarF);
                } catch (Exception e11) {
                    c1 c1Var2 = this.f22028c;
                    a1 a1Var2 = this.f22029d;
                    c1Var2.k(a1Var2, "PostprocessorProducer", e11, z(c1Var2, a1Var2, this.f22030e));
                    C(e11);
                    tk.a.C(null);
                }
            } catch (Throwable th2) {
                tk.a.C(null);
                throw th2;
            }
        }

        private Map<String, String> z(c1 c1Var, a1 a1Var, an.b bVar) {
            if (c1Var.f(a1Var, "PostprocessorProducer")) {
                return pk.g.of("Postprocessor", bVar.getName());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void h(tk.a<um.e> aVar, int i11) {
            if (tk.a.b0(aVar)) {
                J(aVar, i11);
            } else if (com.facebook.imagepipeline.producers.c.d(i11)) {
                D(null, i11);
            }
        }

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        protected void f() {
            B();
        }

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        protected void g(Throwable th2) {
            C(th2);
        }
    }

    class b extends u<tk.a<um.e>, tk.a<um.e>> implements an.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private tk.a<um.e> f22041d;

        class a extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ x0 f22043a;

            a(x0 x0Var) {
                this.f22043a = x0Var;
            }

            @Override // com.facebook.imagepipeline.producers.b1
            public void b() {
                if (b.this.q()) {
                    b.this.o().a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean q() {
            synchronized (this) {
                try {
                    if (this.f22040c) {
                        return false;
                    }
                    tk.a<um.e> aVar = this.f22041d;
                    this.f22041d = null;
                    this.f22040c = true;
                    tk.a.C(aVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private void s(tk.a<um.e> aVar) {
            synchronized (this) {
                try {
                    if (this.f22040c) {
                        return;
                    }
                    tk.a<um.e> aVar2 = this.f22041d;
                    this.f22041d = tk.a.t(aVar);
                    tk.a.C(aVar2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @SuppressLint({"WrongConstant"})
        private void t() {
            synchronized (this) {
                try {
                    if (this.f22040c) {
                        return;
                    }
                    tk.a<um.e> aVarT = tk.a.t(this.f22041d);
                    try {
                        o().b(aVarT, 0);
                    } finally {
                        tk.a.C(aVarT);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        protected void f() {
            if (q()) {
                o().a();
            }
        }

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        protected void g(Throwable th2) {
            if (q()) {
                o().onFailure(th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void h(tk.a<um.e> aVar, int i11) {
            if (com.facebook.imagepipeline.producers.c.e(i11)) {
                return;
            }
            s(aVar);
            t();
        }

        private b(a aVar, an.c cVar, a1 a1Var) {
            super(aVar);
            this.f22040c = false;
            this.f22041d = null;
            cVar.c(this);
            a1Var.H(new a(x0.this));
        }
    }

    class c extends u<tk.a<um.e>, tk.a<um.e>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(tk.a<um.e> aVar, int i11) {
            if (com.facebook.imagepipeline.producers.c.e(i11)) {
                return;
            }
            o().b(aVar, i11);
        }

        private c(a aVar) {
            super(aVar);
        }
    }

    public x0(z0<tk.a<um.e>> z0Var, mm.d dVar, Executor executor) {
        this.f22025a = (z0) pk.k.g(z0Var);
        this.f22026b = dVar;
        this.f22027c = (Executor) pk.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<tk.a<um.e>> nVar, a1 a1Var) {
        x0 x0Var;
        a1 a1Var2;
        n<tk.a<um.e>> cVar;
        c1 c1VarP = a1Var.p();
        an.b bVarL = a1Var.B().l();
        pk.k.g(bVarL);
        a aVar = new a(nVar, c1VarP, bVarL, a1Var);
        if (bVarL instanceof an.c) {
            a1Var2 = a1Var;
            cVar = new b(aVar, (an.c) bVarL, a1Var2);
            x0Var = this;
        } else {
            x0Var = this;
            a1Var2 = a1Var;
            cVar = new c(aVar);
        }
        x0Var.f22025a.a(cVar, a1Var2);
    }
}
