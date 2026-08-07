package io.sentry;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends t implements q0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z0 f80281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e1 f80282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ILogger f80283g;

    public b0(z0 z0Var, e1 e1Var, ILogger iLogger, long j11, int i11) {
        super(z0Var, iLogger, j11, i11);
        this.f80281e = (z0) io.sentry.util.y.c(z0Var, "Scopes are required.");
        this.f80282f = (e1) io.sentry.util.y.c(e1Var, "Serializer is required.");
        this.f80283g = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(b0 b0Var, io.sentry.hints.i iVar) {
        b0Var.getClass();
        if (iVar.h()) {
            return;
        }
        b0Var.f80283g.c(b7.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    public static /* synthetic */ void g(b0 b0Var, File file, io.sentry.hints.k kVar) {
        b0Var.getClass();
        if (kVar.c()) {
            b0Var.f80283g.c(b7.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            b0Var.i(file, "after trying to capture it");
            b0Var.f80283g.c(b7.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    public static /* synthetic */ void h(b0 b0Var, Throwable th2, File file, io.sentry.hints.k kVar) {
        b0Var.getClass();
        kVar.e(false);
        b0Var.f80283g.b(b7.INFO, th2, "File '%s' won't retry.", file.getAbsolutePath());
    }

    private void i(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f80283g.c(b7.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th2) {
            this.f80283g.b(b7.ERROR, th2, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.q0
    public void a(String str, h0 h0Var) {
        io.sentry.util.y.c(str, "Path is required.");
        e(new File(str), h0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.t
    public boolean c(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.t
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.t
    protected void e(final File file, h0 h0Var) {
        ILogger iLogger;
        io.sentry.util.n.a aVar;
        if (!file.isFile()) {
            this.f80283g.c(b7.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!c(file.getName())) {
            this.f80283g.c(b7.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f80283g.c(b7.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        p5 p5VarE = this.f80282f.e(bufferedInputStream);
                        if (p5VarE == null) {
                            this.f80283g.c(b7.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f80281e.r(p5VarE, h0Var);
                        }
                        io.sentry.util.n.m(h0Var, io.sentry.hints.i.class, this.f80283g, new io.sentry.util.n.a() { // from class: io.sentry.y
                            @Override // io.sentry.util.n.a
                            public final void accept(Object obj) {
                                b0.f(this.f81612a, (io.sentry.hints.i) obj);
                            }
                        });
                        bufferedInputStream.close();
                        io.sentry.util.n.m(h0Var, io.sentry.hints.k.class, this.f80283g, new io.sentry.util.n.a() { // from class: io.sentry.z
                            @Override // io.sentry.util.n.a
                            public final void accept(Object obj) {
                                b0.g(this.f81623a, file, (io.sentry.hints.k) obj);
                            }
                        });
                    } catch (Throwable th2) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException e11) {
                    this.f80283g.b(b7.ERROR, e11, "File '%s' cannot be found.", file.getAbsolutePath());
                    iLogger = this.f80283g;
                    aVar = new io.sentry.util.n.a() { // from class: io.sentry.z
                        @Override // io.sentry.util.n.a
                        public final void accept(Object obj) {
                            b0.g(this.f81623a, file, (io.sentry.hints.k) obj);
                        }
                    };
                    io.sentry.util.n.m(h0Var, io.sentry.hints.k.class, iLogger, aVar);
                }
            } catch (IOException e12) {
                this.f80283g.b(b7.ERROR, e12, "I/O on file '%s' failed.", file.getAbsolutePath());
                iLogger = this.f80283g;
                aVar = new io.sentry.util.n.a() { // from class: io.sentry.z
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        b0.g(this.f81623a, file, (io.sentry.hints.k) obj);
                    }
                };
                io.sentry.util.n.m(h0Var, io.sentry.hints.k.class, iLogger, aVar);
            } catch (Throwable th4) {
                this.f80283g.b(b7.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
                io.sentry.util.n.m(h0Var, io.sentry.hints.k.class, this.f80283g, new io.sentry.util.n.a() { // from class: io.sentry.a0
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        b0.h(this.f79219a, th4, file, (io.sentry.hints.k) obj);
                    }
                });
                iLogger = this.f80283g;
                aVar = new io.sentry.util.n.a() { // from class: io.sentry.z
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        b0.g(this.f81623a, file, (io.sentry.hints.k) obj);
                    }
                };
                io.sentry.util.n.m(h0Var, io.sentry.hints.k.class, iLogger, aVar);
            }
        } catch (Throwable th5) {
            io.sentry.util.n.m(h0Var, io.sentry.hints.k.class, this.f80283g, new io.sentry.util.n.a() { // from class: io.sentry.z
                @Override // io.sentry.util.n.a
                public final void accept(Object obj) {
                    b0.g(this.f81623a, file, (io.sentry.hints.k) obj);
                }
            });
            throw th5;
        }
    }
}
