package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends ex.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Writer f44895r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final com.google.gson.p f44896s = new com.google.gson.p("closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<com.google.gson.l> f44897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f44898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.gson.l f44899q;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) {
            throw new AssertionError();
        }
    }

    public h() {
        super(f44895r);
        this.f44897o = new ArrayList();
        this.f44899q = com.google.gson.m.f45010a;
    }

    private com.google.gson.l Y0() {
        List<com.google.gson.l> list = this.f44897o;
        return list.get(list.size() - 1);
    }

    private void c1(com.google.gson.l lVar) {
        if (this.f44898p != null) {
            if (!lVar.h() || I()) {
                ((com.google.gson.n) Y0()).k(this.f44898p, lVar);
            }
            this.f44898p = null;
            return;
        }
        if (this.f44897o.isEmpty()) {
            this.f44899q = lVar;
            return;
        }
        com.google.gson.l lVarY0 = Y0();
        if (!(lVarY0 instanceof com.google.gson.i)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.i) lVarY0).k(lVar);
    }

    @Override // ex.c
    public ex.c C() {
        if (this.f44897o.isEmpty() || this.f44898p != null) {
            throw new IllegalStateException();
        }
        if (!(Y0() instanceof com.google.gson.i)) {
            throw new IllegalStateException();
        }
        List<com.google.gson.l> list = this.f44897o;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // ex.c
    public ex.c G0(double d11) {
        if (b0() || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
            c1(new com.google.gson.p(Double.valueOf(d11)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d11);
    }

    @Override // ex.c
    public ex.c H() {
        if (this.f44897o.isEmpty() || this.f44898p != null) {
            throw new IllegalStateException();
        }
        if (!(Y0() instanceof com.google.gson.n)) {
            throw new IllegalStateException();
        }
        List<com.google.gson.l> list = this.f44897o;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // ex.c
    public ex.c H0(long j11) {
        c1(new com.google.gson.p(Long.valueOf(j11)));
        return this;
    }

    @Override // ex.c
    public ex.c J0(Boolean bool) {
        if (bool == null) {
            return k0();
        }
        c1(new com.google.gson.p(bool));
        return this;
    }

    @Override // ex.c
    public ex.c K0(Number number) {
        if (number == null) {
            return k0();
        }
        if (!b0()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        c1(new com.google.gson.p(number));
        return this;
    }

    @Override // ex.c
    public ex.c O0(String str) {
        if (str == null) {
            return k0();
        }
        c1(new com.google.gson.p(str));
        return this;
    }

    @Override // ex.c
    public ex.c P0(boolean z11) {
        c1(new com.google.gson.p(Boolean.valueOf(z11)));
        return this;
    }

    public com.google.gson.l U0() {
        if (this.f44897o.isEmpty()) {
            return this.f44899q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f44897o);
    }

    @Override // ex.c
    public ex.c c0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f44897o.isEmpty() || this.f44898p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(Y0() instanceof com.google.gson.n)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f44898p = str;
        return this;
    }

    @Override // ex.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f44897o.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f44897o.add(f44896s);
    }

    @Override // ex.c, java.io.Flushable
    public void flush() {
    }

    @Override // ex.c
    public ex.c k0() {
        c1(com.google.gson.m.f45010a);
        return this;
    }

    @Override // ex.c
    public ex.c p() {
        com.google.gson.i iVar = new com.google.gson.i();
        c1(iVar);
        this.f44897o.add(iVar);
        return this;
    }

    @Override // ex.c
    public ex.c t() {
        com.google.gson.n nVar = new com.google.gson.n();
        c1(nVar);
        this.f44897o.add(nVar);
        return this;
    }
}
