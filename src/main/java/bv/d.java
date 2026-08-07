package bv;

import androidx.annotation.NonNull;
import gv.f0;
import gv.g0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements bv.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f18113c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yv.a<bv.a> f18114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<bv.a> f18115b = new AtomicReference<>(null);

    private static final class b implements h {
        private b() {
        }

        @Override // bv.h
        public File a() {
            return null;
        }

        @Override // bv.h
        public f0.a b() {
            return null;
        }

        @Override // bv.h
        public File c() {
            return null;
        }

        @Override // bv.h
        public File d() {
            return null;
        }

        @Override // bv.h
        public File e() {
            return null;
        }

        @Override // bv.h
        public File f() {
            return null;
        }

        @Override // bv.h
        public File g() {
            return null;
        }
    }

    public d(yv.a<bv.a> aVar) {
        this.f18114a = aVar;
        aVar.a(new yv.a.InterfaceC2735a() { // from class: bv.b
            @Override // yv.a.InterfaceC2735a
            public final void a(yv.b bVar) {
                d.f(this.f18108a, bVar);
            }
        });
    }

    public static /* synthetic */ void f(d dVar, yv.b bVar) {
        dVar.getClass();
        g.f().b("Crashlytics native component now available.");
        dVar.f18115b.set((bv.a) bVar.get());
    }

    @Override // bv.a
    public void a(@NonNull final String str, @NonNull final String str2, final long j11, @NonNull final g0 g0Var) {
        g.f().i("Deferring native open session: " + str);
        this.f18114a.a(new yv.a.InterfaceC2735a() { // from class: bv.c
            @Override // yv.a.InterfaceC2735a
            public final void a(yv.b bVar) {
                ((a) bVar.get()).a(str, str2, j11, g0Var);
            }
        });
    }

    @Override // bv.a
    @NonNull
    public h b(@NonNull String str) {
        bv.a aVar = this.f18115b.get();
        return aVar == null ? f18113c : aVar.b(str);
    }

    @Override // bv.a
    public boolean c() {
        bv.a aVar = this.f18115b.get();
        return aVar != null && aVar.c();
    }

    @Override // bv.a
    public boolean d(@NonNull String str) {
        bv.a aVar = this.f18115b.get();
        return aVar != null && aVar.d(str);
    }
}
