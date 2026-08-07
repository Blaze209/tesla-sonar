package io.sentry;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes9.dex */
public final class y1 implements j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.c f81613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1 f81614b;

    public y1(Writer writer, int i11) {
        this.f81613a = new io.sentry.vendor.gson.stream.c(writer);
        this.f81614b = new x1(i11);
    }

    @Override // io.sentry.j3
    public String O() {
        return this.f81613a.H();
    }

    @Override // io.sentry.j3
    public void P(boolean z11) {
        this.f81613a.P(z11);
    }

    @Override // io.sentry.j3
    public j3 S(String str) throws IOException {
        this.f81613a.I(str);
        return this;
    }

    @Override // io.sentry.j3
    public void T(String str) {
        this.f81613a.r0(str);
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y1 f() throws IOException {
        this.f81613a.o();
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y1 h() throws IOException {
        this.f81613a.p();
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public y1 e() {
        this.f81613a.B();
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public y1 j() {
        this.f81613a.C();
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public y1 N(String str) {
        this.f81613a.J(str);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y1 R() throws IOException {
        this.f81613a.b0();
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public y1 E(double d11) throws IOException {
        this.f81613a.t0(d11);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public y1 D(long j11) throws IOException {
        this.f81613a.u0(j11);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public y1 V(ILogger iLogger, Object obj) {
        this.f81614b.a(this, iLogger, obj);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public y1 W(Boolean bool) throws IOException {
        this.f81613a.w0(bool);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public y1 U(Number number) throws IOException {
        this.f81613a.y0(number);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public y1 w(String str) throws IOException {
        this.f81613a.z0(str);
        return this;
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public y1 K(boolean z11) throws IOException {
        this.f81613a.D0(z11);
        return this;
    }
}
