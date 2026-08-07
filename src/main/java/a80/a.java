package a80;

import android.app.Application;
import android.content.Context;
import androidx.p003lifecycle.s0;
import f30.PaymentConfiguration;
import javax.inject.Provider;
import qj0.h;
import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a80.a$a, reason: collision with other inner class name */
    private static final class C0025a implements a80.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Application f832a;

        @Override // a80.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0025a a(Application application) {
            this.f832a = (Application) h.b(application);
            return this;
        }

        @Override // a80.c.a
        public a80.c build() {
            h.a(this.f832a, Application.class);
            return new b(new a80.d(), this.f832a);
        }

        private C0025a() {
        }
    }

    private static final class b implements a80.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Application f833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i<g.a> f835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i<Application> f836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i<Context> f837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private i<PaymentConfiguration> f838f;

        /* JADX INFO: renamed from: a80.a$b$a, reason: collision with other inner class name */
        class C0026a implements i<g.a> {
            C0026a() {
            }

            @Override // javax.inject.Provider
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g.a get() {
                return new c(b.this.f834b);
            }
        }

        private void e(a80.d dVar, Application application) {
            this.f835c = new C0026a();
            qj0.e eVarA = qj0.f.a(application);
            this.f836d = eVarA;
            f fVarA = f.a(dVar, eVarA);
            this.f837e = fVarA;
            this.f838f = e.a(dVar, fVarA);
        }

        @Override // a80.c
        public Provider<g.a> a() {
            return this.f835c;
        }

        private b(a80.d dVar, Application application) {
            this.f834b = this;
            this.f833a = application;
            e(dVar, application);
        }
    }

    private static final class c implements g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private s0 f841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p027z70.h.Args f842c;

        @Override // a80.g.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c c(p027z70.h.Args args) {
            this.f842c = (p027z70.h.Args) h.b(args);
            return this;
        }

        @Override // a80.g.a
        public g build() {
            h.a(this.f841b, s0.class);
            h.a(this.f842c, p027z70.h.Args.class);
            return new d(this.f840a, this.f841b, this.f842c);
        }

        @Override // a80.g.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c b(s0 s0Var) {
            this.f841b = (s0) h.b(s0Var);
            return this;
        }

        private c(b bVar) {
            this.f840a = bVar;
        }
    }

    private static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p027z70.h.Args f843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f846d;

        @Override // a80.g
        public p027z70.h a() {
            return new p027z70.h(this.f843a, this.f845c.f833a, this.f845c.f838f, this.f844b);
        }

        private d(b bVar, s0 s0Var, p027z70.h.Args args) {
            this.f846d = this;
            this.f845c = bVar;
            this.f843a = args;
            this.f844b = s0Var;
        }
    }

    public static a80.c.a a() {
        return new C0025a();
    }
}
