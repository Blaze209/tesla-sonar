package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Gi implements Rh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Hi f25962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ei f25963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Fi f25964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wn0.a f25965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3732qh f25966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P0 f25967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final QA f25968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final QA f25969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final QA f25970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final QA f25971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC3903uh f25972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Kh f25973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InterfaceC3447jx f25974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Uh f25975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private K0 f25976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Uh.a f25977q;

    public Gi(String identifier, Hi initialStateRepository, Ei resultRepository, Fi suggestionProvider, wn0.a resourcesProvider, InterfaceC3732qh imageServiceLocator, P0 validator, QA title, QA placeholder, QA valueRequired, QA valueInvalid, InterfaceC3903uh imageSource, Kh analytics) {
        String str;
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(initialStateRepository, "initialStateRepository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(suggestionProvider, "suggestionProvider");
        p013kotlin.jvm.internal.s.k(resourcesProvider, "resourcesProvider");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(validator, "validator");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
        p013kotlin.jvm.internal.s.k(valueRequired, "valueRequired");
        p013kotlin.jvm.internal.s.k(valueInvalid, "valueInvalid");
        p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f25961a = identifier;
        this.f25962b = initialStateRepository;
        this.f25963c = resultRepository;
        this.f25964d = suggestionProvider;
        this.f25965e = resourcesProvider;
        this.f25966f = imageServiceLocator;
        this.f25967g = validator;
        this.f25968h = title;
        this.f25969i = placeholder;
        this.f25970j = valueRequired;
        this.f25971k = valueInvalid;
        this.f25972l = imageSource;
        this.f25973m = analytics;
        InterfaceC3447jx interfaceC3447jxC = initialStateRepository.c();
        this.f25974n = interfaceC3447jxC;
        if (interfaceC3447jxC != null) {
            this.f25975o = b(interfaceC3447jxC);
            str = (String) interfaceC3447jxC.a().invoke();
        } else {
            str = "";
        }
        K0 k11 = new K0(null, identifier, false, title, placeholder, str, this.f25975o instanceof Uh.a ? Gh.ERROR : Gh.UNFOCUSED, interfaceC3447jxC != null ? QA.a.a(QA.f27433a, R.string.shared_validation_captured_from_scan, 0, 2, null) : QA.b.f27435b, this.f25975o instanceof Uh.a ? imageServiceLocator.a(EnumC3689ph.C0) : null, null, null, imageSource, 1541, null);
        analytics.a(k11);
        this.f25976p = k11;
        this.f25977q = new Uh.a(new Th.d());
    }

    private final Uh c(String str) {
        return str.length() == 0 ? new Uh.a(new Th.c()) : new Uh.a(new Th.d());
    }

    @Override // com.fourthline.orca.internal.Rh
    public boolean a() {
        return this.f25975o instanceof Uh.b;
    }

    public final Uh b() {
        return this.f25975o;
    }

    @Override // com.fourthline.orca.internal.Rh
    public K0 getState() {
        return this.f25976p;
    }

    private final Uh b(InterfaceC3447jx interfaceC3447jx) {
        Uh aVar;
        if (interfaceC3447jx != null) {
            P0.a aVarA = this.f25967g.a(interfaceC3447jx);
            if (aVarA instanceof P0.a.b) {
                aVar = Uh.b.f28796a;
            } else {
                if (!(aVarA instanceof P0.a.C0511a)) {
                    throw new NoWhenBranchMatchedException();
                }
                P0.a.C0511a c0511a = (P0.a.C0511a) aVarA;
                aVar = new Uh.a(c0511a.a() instanceof Th ? (Th) c0511a.a() : new Th.d());
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return this.f25977q;
    }

    public void a(K0 k11) {
        p013kotlin.jvm.internal.s.k(k11, "<set-?>");
        this.f25976p = k11;
    }

    public void a(InterfaceC3447jx item) {
        p013kotlin.jvm.internal.s.k(item, "item");
        Uh uhB = b(item);
        this.f25975o = uhB;
        if (uhB instanceof Uh.b) {
            this.f25963c.a(item);
        }
        K0 k0A = K0.a(getState(), null, null, false, null, null, (String) item.a().invoke(), Gh.UNFOCUSED, null, null, null, p013kotlin.collections.v.m(), null, 2975, null);
        this.f25973m.b(k0A);
        a(k0A);
    }

    public void b(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        a(K0.a(getState(), null, null, false, null, null, value, null, null, null, null, this.f25964d.a(value), null, 3039, null));
    }

    public void a(boolean z11) {
        Gh gh2;
        QA qa2;
        K0 k0A;
        List listM;
        boolean z12 = (z11 && getState().getState() != Gh.FOCUSED) || !(z11 || getState().getState() == Gh.UNFOCUSED);
        Uh uhC = this.f25975o;
        if (uhC == null && z12 && !z11) {
            uhC = c(getState().c());
        }
        Uh.a aVar = uhC instanceof Uh.a ? (Uh.a) uhC : null;
        Th thA = aVar != null ? aVar.a() : null;
        if (z11) {
            String strC = getState().c();
            if ((thA instanceof Th.b.C0521b) || (thA instanceof Th.b.a) || this.f25962b.c() != null) {
                this.f25974n = null;
                this.f25975o = null;
                this.f25963c.a(null);
                strC = "";
            }
            String str = strC;
            if (str.length() > 0) {
                listM = this.f25964d.a(str);
            } else {
                listM = p013kotlin.collections.v.m();
            }
            k0A = K0.a(getState(), null, null, false, null, null, str, Gh.FOCUSED, QA.b.f27435b, null, null, listM, null, 2591, null);
        } else {
            InterfaceC3903uh interfaceC3903uhA = null;
            K0 state = getState();
            if (thA != null) {
                gh2 = Gh.ERROR;
            } else {
                gh2 = Gh.UNFOCUSED;
            }
            Gh gh3 = gh2;
            if (thA instanceof Th.c) {
                qa2 = this.f25970j;
            } else {
                qa2 = thA instanceof Th.d ? this.f25971k : QA.b.f27435b;
            }
            QA qa3 = qa2;
            if (thA != null) {
                interfaceC3903uhA = this.f25966f.a(EnumC3689ph.C0);
            }
            k0A = K0.a(state, null, null, false, null, null, null, gh3, qa3, interfaceC3903uhA, null, p013kotlin.collections.v.m(), null, 2623, null);
        }
        a(k0A);
        if (z11 || !z12) {
            return;
        }
        this.f25973m.b(getState());
        if (thA != null) {
            this.f25973m.a(getState(), thA);
        }
    }

    public final InterfaceC3447jx a(String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        List listA = this.f25964d.a(input);
        if (listA.size() != 1) {
            return null;
        }
        InterfaceC3447jx interfaceC3447jx = (InterfaceC3447jx) p013kotlin.collections.v.o0(listA);
        if (p013kotlin.text.t.M(input, RA.a(interfaceC3447jx.getName(), this.f25965e), true)) {
            return interfaceC3447jx;
        }
        return null;
    }
}
