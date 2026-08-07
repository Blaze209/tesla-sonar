package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4128zq implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fs f37325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f37326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f37327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC3641oc f37328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f37329e;

    public C4128zq(final wn0.a minPersonAgeFactory, Fs analytics, ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(minPersonAgeFactory, "minPersonAgeFactory");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f37325a = analytics;
        this.f37326b = viewNavigator;
        this.f37327c = imageServiceLocator;
        this.f37328d = AbstractC3641oc.j.f34203a;
        this.f37329e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ij1
            @Override // wn0.a
            public final Object invoke() {
                return C4128zq.a(minPersonAgeFactory, this);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3641oc e() {
        return this.f37328d;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f37329e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(wn0.a aVar, C4128zq c4128zq) {
        return new InterfaceC4001ws.e(c4128zq.f37327c.a(EnumC3689ph.B0), QA.f27433a.a(R.string.shared_dialog_error_underage_title, String.valueOf(((Number) aVar.invoke()).intValue())), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f37325a.track(new Fs.a.b(e()));
        this.f37326b.a(new T6.c(e()));
    }
}
