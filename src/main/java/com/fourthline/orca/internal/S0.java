package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class S0 implements InterfaceC3302gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Is f27694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q0 f27695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N0 f27696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O0 f27697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2874Gc f27698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P0 f27699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final D5 f27700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3988wf f27701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q5 f27702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC2931Re f27703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f27704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f27705l;

    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, S0.class, "onItemSelected", "onItemSelected(Lcom/fourthline/orca/core/internal/composable/base_selector/SelectableItem;)V", 0);
        }

        public final void a(InterfaceC3447jx p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((S0) this.receiver).a(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3447jx) obj);
            return jn0.h0.f84049a;
        }
    }

    public S0(Is presenter, Q0 stateProvider, N0 repository, O0 resultRepository, C2874Gc effectHandler, P0 selectionValidator, D5 countriesFilter, InterfaceC3988wf filterCountriesUseCase, Q5 errorValidator, InterfaceC2931Re errorHandler, String analyticsSource) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(selectionValidator, "selectionValidator");
        p013kotlin.jvm.internal.s.k(countriesFilter, "countriesFilter");
        p013kotlin.jvm.internal.s.k(filterCountriesUseCase, "filterCountriesUseCase");
        p013kotlin.jvm.internal.s.k(errorValidator, "errorValidator");
        p013kotlin.jvm.internal.s.k(errorHandler, "errorHandler");
        p013kotlin.jvm.internal.s.k(analyticsSource, "analyticsSource");
        this.f27694a = presenter;
        this.f27695b = stateProvider;
        this.f27696c = repository;
        this.f27697d = resultRepository;
        this.f27698e = effectHandler;
        this.f27699f = selectionValidator;
        this.f27700g = countriesFilter;
        this.f27701h = filterCountriesUseCase;
        this.f27702i = errorValidator;
        this.f27703j = errorHandler;
        this.f27704k = analyticsSource;
        this.f27705l = p013kotlin.collections.v.m();
    }

    private final void b(String str) {
        this.f27694a.a(this.f27695b.a(str));
        this.f27705l = this.f27696c.d();
        this.f27701h.a(p013kotlin.text.t.F1(str).toString(), this.f27705l, new a(this), new wn0.l() { // from class: com.fourthline.orca.internal.xn0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return S0.a(this.f36775a, (List) obj);
            }
        });
    }

    private final void c() {
        L0 l11 = (L0) this.f27694a.a();
        if (l11.p().getState() != Gh.FOCUSED) {
            return;
        }
        Fh fhA = a(l11.p().c());
        this.f27694a.a(this.f27695b.a(fhA));
        if (fhA != null) {
            this.f27697d.a();
        }
        this.f27698e.a(new wn0.a() { // from class: com.fourthline.orca.internal.bo0
            @Override // wn0.a
            public final Object invoke() {
                return S0.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I0 d() {
        return I0.b.f26175a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I0 e() {
        return I0.b.f26175a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I0 f() {
        return I0.a.f26174a;
    }

    private final void g() {
        this.f27698e.a(new wn0.a() { // from class: com.fourthline.orca.internal.yn0
            @Override // wn0.a
            public final Object invoke() {
                return S0.h();
            }
        });
        InterfaceC3447jx interfaceC3447jxC = this.f27696c.c();
        this.f27694a.a(this.f27695b.a(interfaceC3447jxC, p013kotlin.jvm.internal.s.f(interfaceC3447jxC != null ? this.f27699f.a(interfaceC3447jxC) : null, P0.a.b.f27265a)));
        if (interfaceC3447jxC != null) {
            a(interfaceC3447jxC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I0 h() {
        return I0.b.f26175a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3302gf
    public void a(J0 event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event instanceof J0.h) {
            g();
            return;
        }
        if (event instanceof J0.c) {
            b(((J0.c) event).a());
            return;
        }
        if (event instanceof J0.d) {
            a();
            return;
        }
        if (!(event instanceof J0.e) && !p013kotlin.jvm.internal.s.f(event, J0.b.f26407a)) {
            if (event instanceof J0.f) {
                a(((J0.f) event).a());
                return;
            } else {
                if (!(event instanceof J0.a) && !(event instanceof J0.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        c();
    }

    private final void b(InterfaceC3447jx interfaceC3447jx) {
        this.f27694a.a(this.f27695b.b(interfaceC3447jx));
        this.f27697d.a(interfaceC3447jx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I0 b() {
        return I0.c.f26176a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(S0 s11, List suggestions) {
        p013kotlin.jvm.internal.s.k(suggestions, "suggestions");
        s11.f27694a.a(s11.f27695b.a(suggestions));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InterfaceC3447jx interfaceC3447jx) {
        P0.a aVarA = this.f27699f.a(interfaceC3447jx);
        if (aVarA instanceof P0.a.b) {
            b(interfaceC3447jx);
        } else {
            if (!(aVarA instanceof P0.a.C0511a)) {
                throw new NoWhenBranchMatchedException();
            }
            a(interfaceC3447jx, ((P0.a.C0511a) aVarA).a());
        }
        this.f27698e.a(new wn0.a() { // from class: com.fourthline.orca.internal.zn0
            @Override // wn0.a
            public final Object invoke() {
                return S0.e();
            }
        });
        this.f27698e.a(new wn0.a() { // from class: com.fourthline.orca.internal.ao0
            @Override // wn0.a
            public final Object invoke() {
                return S0.f();
            }
        });
    }

    private final void a(InterfaceC3447jx interfaceC3447jx, Bo bo2) {
        this.f27694a.a(this.f27695b.a(interfaceC3447jx));
        this.f27703j.handleError(new M0.a(bo2), this.f27704k);
        this.f27697d.a(interfaceC3447jx);
    }

    private final void a() {
        String strC;
        L0 l11 = (L0) this.f27694a.a();
        if (l11.p().getState() == Gh.FOCUSED) {
            return;
        }
        boolean z11 = l11.p().getState() == Gh.ERROR;
        boolean z12 = this.f27696c.c() != null;
        if (z11 && !z12) {
            b(l11.p().c());
            strC = l11.p().c();
        } else {
            this.f27697d.a();
            strC = "";
        }
        this.f27694a.a(this.f27695b.d(strC));
        this.f27698e.a(new wn0.a() { // from class: com.fourthline.orca.internal.co0
            @Override // wn0.a
            public final Object invoke() {
                return S0.b();
            }
        });
    }

    private final Fh a(String str) {
        List listA = this.f27700g.a(str, this.f27705l);
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((D5.a) it.next()).a());
        }
        return this.f27702i.a(str, arrayList);
    }
}
