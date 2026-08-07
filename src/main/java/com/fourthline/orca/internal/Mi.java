package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Mi implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4052y f26930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f26931b;

    public Mi(C4052y addressBundle, List countries) {
        p013kotlin.jvm.internal.s.k(addressBundle, "addressBundle");
        p013kotlin.jvm.internal.s.k(countries, "countries");
        this.f26930a = addressBundle;
        this.f26931b = countries;
    }

    @Override // com.fourthline.orca.internal.G
    public void a(Integer num) {
        this.f26930a.a(num);
    }

    public List b() {
        return this.f26931b;
    }

    @Override // com.fourthline.orca.internal.G
    public void c(String str) {
        this.f26930a.e(str);
    }

    @Override // com.fourthline.orca.internal.G
    public void d(String str) {
        this.f26930a.d(str);
    }

    @Override // com.fourthline.orca.internal.G
    public void e(String str) {
        this.f26930a.b(str);
    }

    @Override // com.fourthline.orca.internal.G
    public Integer f() {
        return this.f26930a.i();
    }

    @Override // com.fourthline.orca.internal.G
    public boolean g() {
        return this.f26930a.f();
    }

    @Override // com.fourthline.orca.internal.G
    public boolean h() {
        return this.f26930a.k();
    }

    @Override // com.fourthline.orca.internal.G
    public String i() {
        return this.f26930a.e();
    }

    @Override // com.fourthline.orca.internal.G
    public boolean j() {
        return this.f26930a.l();
    }

    @Override // com.fourthline.orca.internal.G
    public boolean k() {
        return true;
    }

    @Override // com.fourthline.orca.internal.G
    public String l() {
        return this.f26930a.h();
    }

    @Override // com.fourthline.orca.internal.G
    public String m() {
        return this.f26930a.a();
    }

    @Override // com.fourthline.orca.internal.G
    public boolean n() {
        return this.f26930a.b();
    }

    @Override // com.fourthline.orca.internal.G
    public String o() {
        return this.f26930a.j();
    }

    @Override // com.fourthline.orca.internal.G
    public void a(String str) {
        this.f26930a.f(str);
    }

    @Override // com.fourthline.orca.internal.Hi
    public InterfaceC3447jx c() {
        Object next;
        Iterator it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p013kotlin.jvm.internal.s.f(((G5) next).c(), this.f26930a.c())) {
                return (InterfaceC3447jx) next;
            }
        }
        next = null;
        return (InterfaceC3447jx) next;
    }

    @Override // com.fourthline.orca.internal.G
    public boolean a() {
        return g() && h() && k() && j() && n();
    }

    @Override // com.fourthline.orca.internal.Ei
    public void a(InterfaceC3447jx interfaceC3447jx) {
        Object next;
        C4052y c4052y = this.f26930a;
        Iterator it = b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f((G5) next, interfaceC3447jx));
        G5 g11 = (G5) next;
        c4052y.c(g11 != null ? g11.c() : null);
    }
}
