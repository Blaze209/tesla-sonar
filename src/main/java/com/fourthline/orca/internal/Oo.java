package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Oo implements InterfaceC3692pk, InterfaceC3350hk, InterfaceC3107bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f27204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3350hk f27205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3107bx f27206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f27207d;

    public Oo(C3438jo tracker, InterfaceC3350hk moduleAnalytics, InterfaceC3107bx screenAnalytics) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        p013kotlin.jvm.internal.s.k(moduleAnalytics, "moduleAnalytics");
        p013kotlin.jvm.internal.s.k(screenAnalytics, "screenAnalytics");
        this.f27204a = tracker;
        this.f27205b = moduleAnalytics;
        this.f27206c = screenAnalytics;
    }

    private final boolean e(String str) {
        return p013kotlin.text.t.h0(str, "workflow_", false, 2, null) || a().b(AnalyticsContext.Flow) != null;
    }

    private final void f(String str) {
        AnalyticsContext analyticsContextB = a().b(AnalyticsContext.Flow);
        if (analyticsContextB != null) {
            if (p013kotlin.jvm.internal.s.f(str, AnalyticsAttribute.DocumentCountry)) {
                analyticsContextB.clear(AnalyticsAttribute.DocumentCountry);
                analyticsContextB.clear(AnalyticsAttribute.DocumentType);
            } else if (p013kotlin.jvm.internal.s.f(str, AnalyticsAttribute.DocumentType)) {
                analyticsContextB.clear(AnalyticsAttribute.DocumentType);
            }
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3350hk
    public void a(C3392ik analyticsContext, Bo error) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        p013kotlin.jvm.internal.s.k(error, "error");
        this.f27205b.a(analyticsContext, error);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3350hk
    public void b(C3392ik analyticsContext) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        this.f27205b.b(analyticsContext);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3107bx
    public void c(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f27206c.c(name);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3107bx
    public void d(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        if (!e(name)) {
            this.f27207d = name;
        } else {
            f(name);
            this.f27206c.d(name);
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3107bx
    public void a(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f27206c.a(name);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3107bx
    public void b(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f27206c.b(name);
    }

    private final void b() {
        AnalyticsContext analyticsContextB = a().b(AnalyticsContext.Features);
        C3687pf c3687pf = analyticsContextB instanceof C3687pf ? (C3687pf) analyticsContextB : null;
        if (c3687pf != null) {
            c3687pf.a();
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3692pk
    public boolean a(C3392ik c3392ik, Sf sf2) {
        return InterfaceC3692pk.a.a(this, c3392ik, sf2);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3692pk
    public boolean a(C3392ik c3392ik, Sf sf2, Rf rf2) {
        return InterfaceC3692pk.a.a(this, c3392ik, sf2, rf2);
    }

    public /* synthetic */ Oo(C3438jo c3438jo, InterfaceC3350hk interfaceC3350hk, InterfaceC3107bx interfaceC3107bx, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3438jo, (i11 & 2) != 0 ? new No(c3438jo) : interfaceC3350hk, (i11 & 4) != 0 ? new C3226ep(c3438jo) : interfaceC3107bx);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3692pk
    public boolean a(C3392ik c3392ik) {
        return InterfaceC3692pk.a.a(this, c3392ik);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3692pk
    public boolean a(String str, String str2) {
        return InterfaceC3692pk.a.a(this, str, str2);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3692pk
    public C3438jo a() {
        return this.f27204a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3350hk
    public void a(C3392ik analyticsContext, Rf rf2) {
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        b();
        this.f27205b.a(analyticsContext, rf2);
        String str = this.f27207d;
        if (str != null) {
            this.f27206c.d(str);
            this.f27207d = null;
        }
    }
}
