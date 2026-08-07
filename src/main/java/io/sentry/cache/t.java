package io.sentry.cache;

import io.sentry.b7;
import io.sentry.g4;
import io.sentry.k8;
import io.sentry.protocol.i0;
import io.sentry.protocol.x;
import io.sentry.q7;
import io.sentry.x0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends g4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f80379c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q7 f80380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.r<io.sentry.cache.tape.c<io.sentry.e>> f80381b = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.cache.k
        @Override // io.sentry.util.r.a
        public final Object a() {
            return t.u(this.f80363a);
        }
    });

    class a implements io.sentry.cache.tape.c.a<io.sentry.e> {
        a() {
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public io.sentry.e b(byte[] bArr) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), t.f80379c));
                try {
                    io.sentry.e eVar = (io.sentry.e) t.this.f80380a.getSerializer().c(bufferedReader, io.sentry.e.class);
                    bufferedReader.close();
                    return eVar;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                t.this.f80380a.getLogger().b(b7.ERROR, th4, "Error reading entity from scope cache", new Object[0]);
                return null;
            }
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(io.sentry.e eVar, OutputStream outputStream) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, t.f80379c));
            try {
                t.this.f80380a.getSerializer().a(eVar, bufferedWriter);
                bufferedWriter.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public t(q7 q7Var) {
        this.f80380a = q7Var;
    }

    private void A(String str) {
        d.a(this.f80380a, ".scope-cache", str);
    }

    private void D(final Runnable runnable) {
        if (this.f80380a.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    this.f80380a.getLogger().a(b7.ERROR, "Serialization task failed", th2);
                    return;
                }
            }
            try {
                this.f80380a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.v(this.f80364a, runnable);
                    }
                });
            } catch (Throwable th3) {
                this.f80380a.getLogger().a(b7.ERROR, "Serialization task could not be scheduled", th3);
            }
        }
    }

    public static <T> void E(q7 q7Var, T t11, String str) {
        d.d(q7Var, t11, ".scope-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void F(T t11, String str) {
        E(this.f80380a, t11, str);
    }

    public static /* synthetic */ void o(t tVar, k8 k8Var, x0 x0Var) {
        if (k8Var != null) {
            tVar.F(k8Var, "trace.json");
        } else {
            tVar.getClass();
            tVar.F(x0Var.K().g(), "trace.json");
        }
    }

    public static /* synthetic */ void p(t tVar, i0 i0Var) {
        if (i0Var == null) {
            tVar.A("user.json");
        } else {
            tVar.F(i0Var, "user.json");
        }
    }

    public static /* synthetic */ void s(t tVar) {
        tVar.getClass();
        try {
            tVar.f80381b.a().clear();
        } catch (IOException e11) {
            tVar.f80380a.getLogger().a(b7.ERROR, "Failed to clear breadcrumbs from file queue", e11);
        }
    }

    public static /* synthetic */ void t(t tVar, String str) {
        if (str == null) {
            tVar.A("transaction.json");
        } else {
            tVar.F(str, "transaction.json");
        }
    }

    public static /* synthetic */ io.sentry.cache.tape.c u(t tVar) {
        io.sentry.cache.tape.d dVarA;
        File fileB = d.b(tVar.f80380a, ".scope-cache");
        if (fileB == null) {
            tVar.f80380a.getLogger().c(b7.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return io.sentry.cache.tape.c.t();
        }
        File file = new File(fileB, "breadcrumbs.json");
        try {
            try {
                dVarA = new io.sentry.cache.tape.d.a(file).b(tVar.f80380a.getMaxBreadcrumbs()).a();
            } catch (IOException e11) {
                tVar.f80380a.getLogger().a(b7.ERROR, "Failed to create breadcrumbs queue", e11);
                return io.sentry.cache.tape.c.t();
            }
        } catch (IOException unused) {
            file.delete();
            dVarA = new io.sentry.cache.tape.d.a(file).b(tVar.f80380a.getMaxBreadcrumbs()).a();
        }
        return io.sentry.cache.tape.c.p(dVarA, tVar.new a());
    }

    public static /* synthetic */ void v(t tVar, Runnable runnable) {
        tVar.getClass();
        try {
            runnable.run();
        } catch (Throwable th2) {
            tVar.f80380a.getLogger().a(b7.ERROR, "Serialization task failed", th2);
        }
    }

    public static /* synthetic */ void x(t tVar, io.sentry.e eVar) {
        tVar.getClass();
        try {
            tVar.f80381b.a().n(eVar);
        } catch (IOException e11) {
            tVar.f80380a.getLogger().a(b7.ERROR, "Failed to add breadcrumb to file queue", e11);
        }
    }

    public <T> T B(q7 q7Var, String str, Class<T> cls) {
        if (!str.equals("breadcrumbs.json")) {
            return (T) d.c(q7Var, ".scope-cache", str, cls, null);
        }
        try {
            return cls.cast(this.f80381b.a().o());
        } catch (IOException unused) {
            q7Var.getLogger().c(b7.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void C() {
        try {
            this.f80381b.a().clear();
        } catch (IOException e11) {
            this.f80380a.getLogger().a(b7.ERROR, "Failed to clear breadcrumbs from file queue", e11);
        }
        A("user.json");
        A("level.json");
        A("request.json");
        A("fingerprint.json");
        A("contexts.json");
        A("extras.json");
        A("tags.json");
        A("trace.json");
        A("transaction.json");
    }

    @Override // io.sentry.y0
    public void c(final io.sentry.e eVar) {
        D(new Runnable() { // from class: io.sentry.cache.n
            @Override // java.lang.Runnable
            public final void run() {
                t.x(this.f80368a, eVar);
            }
        });
    }

    @Override // io.sentry.g4, io.sentry.y0
    public void e(final Map<String, String> map) {
        D(new Runnable() { // from class: io.sentry.cache.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f80366a.F(map, "tags.json");
            }
        });
    }

    @Override // io.sentry.g4, io.sentry.y0
    public void g(Collection<io.sentry.e> collection) {
        if (collection.isEmpty()) {
            D(new Runnable() { // from class: io.sentry.cache.q
                @Override // java.lang.Runnable
                public final void run() {
                    t.s(this.f80374a);
                }
            });
        }
    }

    @Override // io.sentry.g4, io.sentry.y0
    public void h(final io.sentry.protocol.c cVar) {
        D(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f80370a.F(cVar, "contexts.json");
            }
        });
    }

    @Override // io.sentry.g4, io.sentry.y0
    public void i(final Map<String, Object> map) {
        D(new Runnable() { // from class: io.sentry.cache.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f80372a.F(map, "extras.json");
            }
        });
    }

    @Override // io.sentry.y0
    public void j(final i0 i0Var) {
        D(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                t.p(this.f80358a, i0Var);
            }
        });
    }

    @Override // io.sentry.y0
    public void k(final k8 k8Var, final x0 x0Var) {
        D(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                t.o(this.f80360a, k8Var, x0Var);
            }
        });
    }

    @Override // io.sentry.g4, io.sentry.y0
    public void l(final String str) {
        D(new Runnable() { // from class: io.sentry.cache.s
            @Override // java.lang.Runnable
            public final void run() {
                t.t(this.f80377a, str);
            }
        });
    }

    @Override // io.sentry.g4, io.sentry.y0
    public void m(final x xVar) {
        D(new Runnable() { // from class: io.sentry.cache.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f80375a.F(xVar, "replay.json");
            }
        });
    }
}
