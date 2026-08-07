package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.plaid.internal.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4501p0 implements X4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f48008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4501p0 f48009b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qj0.e f48010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<H5> f48011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<wo0.b> f48012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider<C4582y1> f48013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider<AbstractC4394d1> f48014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Provider<W4> f48015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Provider<WorkflowDatabase> f48016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Provider<A2> f48017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Provider<I5> f48018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Provider<E5> f48019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Provider<C4479m5> f48020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Provider<C4364c5> f48021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Provider<N5> f48022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Provider<C4351b1> f48023p;

    public C4501p0(C4515q5 c4515q5, Application application) {
        this.f48008a = application;
        qj0.d.d(new C4568w5(c4515q5));
        qj0.e eVarA = qj0.f.a(application);
        this.f48010c = eVarA;
        Provider<H5> providerD = qj0.d.d(new C5(c4515q5, eVarA));
        this.f48011d = providerD;
        Provider<wo0.b> providerD2 = qj0.d.d(new C4577x5(c4515q5));
        this.f48012e = providerD2;
        this.f48013f = qj0.d.d(new C4591z1(providerD, providerD2));
        Provider<AbstractC4394d1> providerD3 = qj0.d.d(new C4559v5(c4515q5, eVarA));
        this.f48014g = providerD3;
        this.f48015h = qj0.d.d(new C4595z5(c4515q5, providerD));
        this.f48016i = qj0.d.d(new C4541t5(c4515q5, eVarA));
        this.f48017j = qj0.d.d(new C4586y5(c4515q5));
        Provider<I5> providerD4 = qj0.d.d(new D5(c4515q5, eVarA));
        this.f48018k = providerD4;
        Provider<E5> providerD5 = qj0.d.d(new B5(c4515q5, providerD4));
        this.f48019l = providerD5;
        Provider<C4479m5> providerD6 = qj0.d.d(new A5(c4515q5, eVarA));
        this.f48020m = providerD6;
        this.f48021n = qj0.d.d(new C4532s5(c4515q5, eVarA, providerD5, providerD6));
        this.f48022o = qj0.d.d(new O5(eVarA));
        this.f48023p = qj0.d.d(new C4550u5(c4515q5, providerD3));
    }
}
