package com.facebook.imagepipeline.producers;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<um.k> f21755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1 f21756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21757c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private om.b f21759e;

    public c0(n<um.k> nVar, a1 a1Var) {
        this.f21755a = nVar;
        this.f21756b = a1Var;
    }

    public n<um.k> a() {
        return this.f21755a;
    }

    public a1 b() {
        return this.f21756b;
    }

    public long c() {
        return this.f21757c;
    }

    public c1 d() {
        return this.f21756b.p();
    }

    public int e() {
        return this.f21758d;
    }

    public om.b f() {
        return this.f21759e;
    }

    public Uri g() {
        return this.f21756b.B().v();
    }

    public void h(long j11) {
        this.f21757c = j11;
    }

    public void i(int i11) {
        this.f21758d = i11;
    }

    public void j(om.b bVar) {
        this.f21759e = bVar;
    }
}
