package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3767ra implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3354ho f35015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f35016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uj f35017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ds f35018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f35019e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ra$a */
    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Pair f35020a;

        a(Pair pair) {
            this.f35020a = pair;
        }

        public final String a(p020r2.l lVar, int i11) {
            lVar.o(661325365);
            if (p020r2.o.J()) {
                p020r2.o.S(661325365, i11, -1, "com.fourthline.orca.core.internal.capabilities.documentrecognition.screens.scanner.popup.DocumentReadyPopupProvider.state$delegate.<anonymous>.<anonymous>.<anonymous> (DocumentReadyPopupProvider.kt:41)");
            }
            String strC = RA.c(QA.a.a(QA.f27433a, ((Number) this.f35020a.f()).intValue(), 0, 2, null), lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return strC;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p020r2.l) obj, ((Number) obj2).intValue());
        }
    }

    public C3767ra(InterfaceC3354ho analytics, InterfaceC3732qh imageServiceLocator, Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        this.f35015a = analytics;
        this.f35016b = imageServiceLocator;
        this.f35017c = lottieServiceLocator;
        this.f35018d = InterfaceC3004Wa.a.f29494a;
        this.f35019e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.wa1
            @Override // wn0.a
            public final Object invoke() {
                return C3767ra.a(this.f36413a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.b a(C3767ra c3767ra) {
        Yj yjA = c3767ra.f35017c.a(Tj.DocumentReady);
        QA.a aVar = QA.f27433a;
        QA.d dVarA = QA.a.a(aVar, R.string.shared_dialog_action_ready_document_header, 0, 2, null);
        QA.d dVarA2 = QA.a.a(aVar, R.string.shared_dialog_action_ready_document_message, 0, 2, null);
        List<Pair> listP = p013kotlin.collections.v.p(jn0.x.a(EnumC3689ph.R0, Integer.valueOf(R.string.shared_dialog_action_ready_document_hint1)), jn0.x.a(EnumC3689ph.S0, Integer.valueOf(R.string.shared_dialog_action_ready_document_hint2)), jn0.x.a(EnumC3689ph.T0, Integer.valueOf(R.string.shared_dialog_action_ready_document_hint3)));
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listP, 10));
        for (Pair pair : listP) {
            arrayList.add(new InterfaceC4001ws.b.a(c3767ra.f35016b.a((EnumC3689ph) pair.e()), new a(pair)));
        }
        return new InterfaceC4001ws.b(dVarA, yjA, dVarA2, arrayList, new InterfaceC3807sD.d(null, 1, null), new InterfaceC3807sD.a(null, 1, null), false, 64, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f35015a.track(C2932Sa.a.h.f27766a);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        this.f35015a.track(C2932Sa.a.i.f27767a);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f35019e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f35018d;
    }
}
