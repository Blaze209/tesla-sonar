package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3674p8 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fs f34458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f34459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3732qh f34461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC3641oc f34462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f34463f;

    public C3674p8(Fs analytics, ND viewNavigator, boolean z11, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f34458a = analytics;
        this.f34459b = viewNavigator;
        this.f34460c = z11;
        this.f34461d = imageServiceLocator;
        this.f34462e = AbstractC3641oc.a.f34194a;
        this.f34463f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.q91
            @Override // wn0.a
            public final Object invoke() {
                return C3674p8.a(this.f34751a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3641oc e() {
        return this.f34462e;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f34463f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3674p8 c3674p8) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3674p8.f34461d.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_expired_document_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_change_document, 0, 2, null)), c3674p8.f34460c ? new InterfaceC3807sD.g(null, 1, null) : null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        if (this.f34460c) {
            this.f34458a.track(new Fs.a.c(e()));
            this.f34459b.a(new T6.c(e()));
        }
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f34458a.track(new Fs.a.b(e()));
        this.f34459b.a(new T6.e(e()));
    }

    public /* synthetic */ C3674p8(Fs fs2, ND nd2, boolean z11, InterfaceC3732qh interfaceC3732qh, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fs2, nd2, (i11 & 4) != 0 ? false : z11, interfaceC3732qh);
    }
}
