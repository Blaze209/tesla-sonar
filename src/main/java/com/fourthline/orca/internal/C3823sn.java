package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3823sn implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f35348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3354ho f35349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f35350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ds f35351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f35352e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sn$a */
    static final class a implements wn0.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3135cj f35353a;

        a(C3135cj c3135cj) {
            this.f35353a = c3135cj;
        }

        public final void a(v1.i Page, p025y1.c0 it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(Page, "$this$Page");
            p013kotlin.jvm.internal.s.k(it, "it");
            if ((i11 & 6) == 0) {
                i11 |= lVar.n(Page) ? 4 : 2;
            }
            if ((i11 & 131) == 130 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-2110649027, i11, -1, "com.fourthline.orca.kyc.internal.flow.nfc.screens.nfc_intro.NfcIntroLearnHowToScanPopupProvider.buildPages.<anonymous>.<anonymous> (NfcIntroLearnHowToScanPopupProvider.kt:98)");
            }
            AbstractC3866tn.a(Page, this.f35353a, lVar, i11 & 14);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((v1.i) obj, (p025y1.c0) obj2, (p020r2.l) obj3, ((Number) obj4).intValue());
            return jn0.h0.f84049a;
        }
    }

    public C3823sn(InterfaceC3732qh imageServiceLocator, InterfaceC3354ho analytics, wn0.a isPassportUseCase) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(isPassportUseCase, "isPassportUseCase");
        this.f35348a = imageServiceLocator;
        this.f35349b = analytics;
        this.f35350c = isPassportUseCase;
        this.f35351d = C3652on.f34330a;
        this.f35352e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.kc1
            @Override // wn0.a
            public final Object invoke() {
                return C3823sn.a(this.f32961a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.f a(final C3823sn c3823sn) {
        return new InterfaceC4001ws.f(c3823sn.a(), new wn0.p() { // from class: com.fourthline.orca.internal.lc1
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return C3823sn.a(this.f33292a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, false, InterfaceC3807sD.m.f35259a, InterfaceC3807sD.b.f35235a, c3823sn.f35348a.a(EnumC3689ph.K0), false, 68, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f35352e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f35351d;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        Cs.b.a.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3823sn c3823sn, int i11, int i12) {
        c3823sn.f35349b.track(new C3523ln.a.d(i11, i12));
        return jn0.h0.f84049a;
    }

    private final List a() {
        QA.a aVar = QA.f27433a;
        List listP = p013kotlin.collections.v.p(new C3135cj(QA.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_header_ready, 0, 2, null), QA.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_message_ready, 0, 2, null), this.f35348a.a(((Boolean) this.f35350c.invoke()).booleanValue() ? EnumC3689ph.f34538e : EnumC3689ph.f34540f)), new C3135cj(QA.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_header_start, 0, 2, null), QA.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_message_start_center, 0, 2, null), this.f35348a.a(((Boolean) this.f35350c.invoke()).booleanValue() ? EnumC3689ph.f34542g : EnumC3689ph.f34544h)), new C3135cj(QA.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_header_hold, 0, 2, null), QA.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_message_hold, 0, 2, null), this.f35348a.a(((Boolean) this.f35350c.invoke()).booleanValue() ? EnumC3689ph.f34546i : EnumC3689ph.f34548j)), new C3135cj(QA.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_header_no_connection, 0, 2, null), QA.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_message_no_connection, 0, 2, null), this.f35348a.a(((Boolean) this.f35350c.invoke()).booleanValue() ? EnumC3689ph.f34550k : EnumC3689ph.f34552l)), new C3135cj(QA.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_header_complete, 0, 2, null), QA.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_message_complete, 0, 2, null), this.f35348a.a(((Boolean) this.f35350c.invoke()).booleanValue() ? EnumC3689ph.f34554m : EnumC3689ph.f34556n)));
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(new InterfaceC4001ws.f.a(z2.c.c(-2110649027, true, new a((C3135cj) it.next()))));
        }
        return arrayList;
    }
}
