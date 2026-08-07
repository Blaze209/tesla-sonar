package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public final class n3 extends t implements q0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Charset f80788i = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z0 f80789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p0 f80790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e1 f80791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ILogger f80792h;

    public n3(z0 z0Var, p0 p0Var, e1 e1Var, ILogger iLogger, long j11, int i11) {
        super(z0Var, iLogger, j11, i11);
        this.f80789e = (z0) io.sentry.util.y.c(z0Var, "Scopes are required.");
        this.f80790f = (p0) io.sentry.util.y.c(p0Var, "Envelope reader is required.");
        this.f80791g = (e1) io.sentry.util.y.c(e1Var, "Serializer is required.");
        this.f80792h = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void f(n3 n3Var, File file, io.sentry.hints.k kVar) {
        n3Var.getClass();
        if (kVar.c()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            n3Var.f80792h.c(b7.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e11) {
            n3Var.f80792h.b(b7.ERROR, e11, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    private y8 h(w8 w8Var) {
        String strB;
        if (w8Var != null && (strB = w8Var.b()) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(strB));
                if (io.sentry.util.c0.h(dValueOf, false)) {
                    String strA = w8Var.a();
                    if (strA != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(strA));
                        if (io.sentry.util.c0.h(dValueOf2, false)) {
                            return new y8(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return io.sentry.util.c0.a(new y8(Boolean.TRUE, dValueOf));
                }
                this.f80792h.c(b7.ERROR, "Invalid sample rate parsed from TraceContext: %s", strB);
            } catch (Exception unused) {
                this.f80792h.c(b7.ERROR, "Unable to parse sample rate from TraceContext: %s", strB);
            }
        }
        return new y8(Boolean.TRUE);
    }

    private void i(p6 p6Var, int i11) {
        this.f80792h.c(b7.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i11), p6Var.K().b());
    }

    private void j(int i11) {
        this.f80792h.c(b7.DEBUG, "Item %d is being captured.", Integer.valueOf(i11));
    }

    private void k(io.sentry.protocol.x xVar) {
        this.f80792h.c(b7.WARNING, "Timed out waiting for event id submission: %s", xVar);
    }

    private void l(p5 p5Var, io.sentry.protocol.x xVar, int i11) {
        this.f80792h.c(b7.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i11), p5Var.b().a(), xVar);
    }

    private void m(p5 p5Var, h0 h0Var) {
        Object objG;
        this.f80792h.c(b7.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(io.sentry.util.c.e(p5Var.c())));
        int i11 = 0;
        for (p6 p6Var : p5Var.c()) {
            i11++;
            if (p6Var.K() == null) {
                this.f80792h.c(b7.ERROR, "Item %d has no header", Integer.valueOf(i11));
            } else if (a7.Event.equals(p6Var.K().b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p6Var.I()), f80788i));
                    try {
                        r6 r6Var = (r6) this.f80791g.c(bufferedReader, r6.class);
                        if (r6Var == null) {
                            i(p6Var, i11);
                        } else {
                            if (r6Var.L() != null) {
                                io.sentry.util.n.o(h0Var, r6Var.L().f());
                            }
                            if (p5Var.b().a() == null || p5Var.b().a().equals(r6Var.G())) {
                                this.f80789e.D(r6Var, h0Var);
                                j(i11);
                                if (!n(h0Var)) {
                                    k(r6Var.G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                l(p5Var, r6Var.G(), i11);
                                bufferedReader.close();
                            }
                        }
                        bufferedReader.close();
                        objG = io.sentry.util.n.g(h0Var);
                        if (!(objG instanceof io.sentry.hints.p) && !((io.sentry.hints.p) objG).b()) {
                            this.f80792h.c(b7.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i11));
                            return;
                        }
                        io.sentry.util.n.k(h0Var, io.sentry.hints.j.class, new io.sentry.util.n.a() { // from class: io.sentry.m3
                            @Override // io.sentry.util.n.a
                            public final void accept(Object obj) {
                                ((io.sentry.hints.j) obj).reset();
                            }
                        });
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    this.f80792h.a(b7.ERROR, "Item failed to process.", th4);
                }
            } else {
                if (a7.Transaction.equals(p6Var.K().b())) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p6Var.I()), f80788i));
                        try {
                            io.sentry.protocol.e0 e0Var = (io.sentry.protocol.e0) this.f80791g.c(bufferedReader2, io.sentry.protocol.e0.class);
                            if (e0Var == null) {
                                i(p6Var, i11);
                            } else if (p5Var.b().a() == null || p5Var.b().a().equals(e0Var.G())) {
                                w8 w8VarC = p5Var.b().c();
                                if (e0Var.C().j() != null) {
                                    e0Var.C().j().u(h(w8VarC));
                                }
                                this.f80789e.y(e0Var, w8VarC, h0Var);
                                j(i11);
                                if (!n(h0Var)) {
                                    k(e0Var.G());
                                    bufferedReader2.close();
                                    return;
                                }
                            } else {
                                l(p5Var, e0Var.G(), i11);
                                bufferedReader2.close();
                            }
                            bufferedReader2.close();
                        } catch (Throwable th5) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        this.f80792h.a(b7.ERROR, "Item failed to process.", th7);
                    }
                } else {
                    this.f80789e.r(new p5(p5Var.b().a(), p5Var.b().b(), p6Var), h0Var);
                    this.f80792h.c(b7.DEBUG, "%s item %d is being captured.", p6Var.K().b().getItemType(), Integer.valueOf(i11));
                    if (!n(h0Var)) {
                        this.f80792h.c(b7.WARNING, "Timed out waiting for item type submission: %s", p6Var.K().b().getItemType());
                        return;
                    }
                }
                objG = io.sentry.util.n.g(h0Var);
                if (!(objG instanceof io.sentry.hints.p)) {
                }
                io.sentry.util.n.k(h0Var, io.sentry.hints.j.class, new io.sentry.util.n.a() { // from class: io.sentry.m3
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.j) obj).reset();
                    }
                });
            }
        }
    }

    private boolean n(h0 h0Var) {
        Object objG = io.sentry.util.n.g(h0Var);
        if (objG instanceof io.sentry.hints.i) {
            return ((io.sentry.hints.i) objG).h();
        }
        io.sentry.util.v.a(io.sentry.hints.i.class, objG, this.f80792h);
        return true;
    }

    @Override // io.sentry.q0
    public void a(String str, h0 h0Var) {
        io.sentry.util.y.c(str, "Path is required.");
        e(new File(str), h0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.t
    public boolean c(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.t
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.t
    protected void e(final File file, h0 h0Var) {
        io.sentry.util.y.c(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.f80792h.c(b7.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    p5 p5VarA = this.f80790f.a(bufferedInputStream);
                    if (p5VarA == null) {
                        this.f80792h.c(b7.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        m(p5VarA, h0Var);
                        this.f80792h.c(b7.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    io.sentry.util.n.m(h0Var, io.sentry.hints.k.class, this.f80792h, new io.sentry.util.n.a() { // from class: io.sentry.l3
                        @Override // io.sentry.util.n.a
                        public final void accept(Object obj) {
                            n3.f(this.f80736a, file, (io.sentry.hints.k) obj);
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
            } catch (IOException e11) {
                this.f80792h.a(b7.ERROR, "Error processing envelope.", e11);
                io.sentry.util.n.m(h0Var, io.sentry.hints.k.class, this.f80792h, new io.sentry.util.n.a() { // from class: io.sentry.l3
                    @Override // io.sentry.util.n.a
                    public final void accept(Object obj) {
                        n3.f(this.f80736a, file, (io.sentry.hints.k) obj);
                    }
                });
            }
        } catch (Throwable th4) {
            io.sentry.util.n.m(h0Var, io.sentry.hints.k.class, this.f80792h, new io.sentry.util.n.a() { // from class: io.sentry.l3
                @Override // io.sentry.util.n.a
                public final void accept(Object obj) {
                    n3.f(this.f80736a, file, (io.sentry.hints.k) obj);
                }
            });
            throw th4;
        }
    }
}
