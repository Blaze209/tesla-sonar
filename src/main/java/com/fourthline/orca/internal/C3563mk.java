package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3563mk implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fs f33602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f33603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3732qh f33605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC3641oc f33606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f33607f;

    public C3563mk(Fs analytics, ND viewNavigator, boolean z11, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f33602a = analytics;
        this.f33603b = viewNavigator;
        this.f33604c = z11;
        this.f33605d = imageServiceLocator;
        this.f33606e = AbstractC3641oc.i.f34202a;
        this.f33607f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.o71
            @Override // wn0.a
            public final Object invoke() {
                return C3563mk.a(this.f34093a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3641oc e() {
        return this.f33606e;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f33607f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3563mk c3563mk) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3563mk.f33605d.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_document_nationality_not_supported_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_change_document, 0, 2, null)), c3563mk.f33604c ? new InterfaceC3807sD.g(null, 1, null) : null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        if (this.f33604c) {
            this.f33602a.track(new Fs.a.c(e()));
            this.f33603b.a(new T6.c(e()));
        }
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f33602a.track(new Fs.a.b(e()));
        this.f33603b.a(new T6.e(e()));
    }

    public /* synthetic */ C3563mk(Fs fs2, ND nd2, boolean z11, InterfaceC3732qh interfaceC3732qh, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fs2, nd2, (i11 & 4) != 0 ? false : z11, interfaceC3732qh);
    }
}
