package o40;

import javax.inject.Provider;
import n40.b0;
import n40.n1;
import n40.p0;
import n40.r1;
import n40.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f96666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<j40.f> f96667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<t50.f> f96668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<n1> f96669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<r1> f96670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<b0> f96671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<o50.f> f96672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<v50.d> f96673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<o30.d> f96674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<u0> f96675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<h50.f> f96676k;

    public e(Provider<p0> provider, Provider<j40.f> provider2, Provider<t50.f> provider3, Provider<n1> provider4, Provider<r1> provider5, Provider<b0> provider6, Provider<o50.f> provider7, Provider<v50.d> provider8, Provider<o30.d> provider9, Provider<u0> provider10, Provider<h50.f> provider11) {
        this.f96666a = provider;
        this.f96667b = provider2;
        this.f96668c = provider3;
        this.f96669d = provider4;
        this.f96670e = provider5;
        this.f96671f = provider6;
        this.f96672g = provider7;
        this.f96673h = provider8;
        this.f96674i = provider9;
        this.f96675j = provider10;
        this.f96676k = provider11;
    }

    public static e a(Provider<p0> provider, Provider<j40.f> provider2, Provider<t50.f> provider3, Provider<n1> provider4, Provider<r1> provider5, Provider<b0> provider6, Provider<o50.f> provider7, Provider<v50.d> provider8, Provider<o30.d> provider9, Provider<u0> provider10, Provider<h50.f> provider11) {
        return new e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static d c(AccountPickerState accountPickerState, p0 p0Var, j40.f fVar, t50.f fVar2, n1 n1Var, r1 r1Var, b0 b0Var, o50.f fVar3, v50.d dVar, o30.d dVar2, u0 u0Var, h50.f fVar4) {
        return new d(accountPickerState, p0Var, fVar, fVar2, n1Var, r1Var, b0Var, fVar3, dVar, dVar2, u0Var, fVar4);
    }

    public d b(AccountPickerState accountPickerState) {
        return c(accountPickerState, this.f96666a.get(), this.f96667b.get(), this.f96668c.get(), this.f96669d.get(), this.f96670e.get(), this.f96671f.get(), this.f96672g.get(), this.f96673h.get(), this.f96674i.get(), this.f96675j.get(), this.f96676k.get());
    }
}
