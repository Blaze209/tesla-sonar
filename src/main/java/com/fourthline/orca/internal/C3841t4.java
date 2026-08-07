package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: renamed from: com.fourthline.orca.internal.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3841t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3841t4 f35541a = new C3841t4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static wn0.q f35542b = z2.c.c(250024255, false, a.f35544a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static wn0.p f35543c = z2.c.c(1516308335, false, b.f35545a);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t4$a */
    static final class a implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35544a = new a();

        a() {
        }

        public final void a(v1.i OrcaScreen, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScreen, "$this$OrcaScreen");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(250024255, i11, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.version.ComposableSingletons$DocumentVersionScreenKt.lambda-1.<anonymous> (DocumentVersionScreen.kt:63)");
            }
            v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, w4.h.g(8)), lVar, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.i) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }
    }

    public final wn0.q a() {
        return f35542b;
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t4$b */
    static final class b implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35545a = new b();

        b() {
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1516308335, i11, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.version.ComposableSingletons$DocumentVersionScreenKt.lambda-2.<anonymous> (DocumentVersionScreen.kt:90)");
            }
            QA.a aVar = QA.f27433a;
            C3898uc c3898uc = new C3898uc(QA.a.a(aVar, R.string.step_document_version_header, 0, 2, null), QA.a.a(aVar, R.string.step_document_version_label_version, 0, 2, null), QA.a.a(aVar, R.string.shared_button_continue, 0, 2, null), new QA.d(R.string.shared_button_back, R.string.shared_button_back_accessibility), p013kotlin.collections.v.m(), false, 32, null);
            lVar.o(256582647);
            Object objI = lVar.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.kd1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return C3841t4.b.a((InterfaceC3812sc) obj);
                    }
                };
                lVar.B(objI);
            }
            lVar.l();
            AbstractC2838Ac.a(c3898uc, (wn0.l) objI, lVar, 48);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(InterfaceC3812sc it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return jn0.h0.f84049a;
        }
    }
}
