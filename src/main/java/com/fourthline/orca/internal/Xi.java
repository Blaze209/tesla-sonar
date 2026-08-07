package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29742a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(C3954vo c3954vo) {
        return c3954vo.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(C4104z8 c4104z8, Kp kp2) {
        MrzInfo mrzInfoE;
        if (c4104z8.j() != null) {
            boolean z11 = (kp2.d() == null || kp2.d() == Gender.UNKNOWN) ? false : true;
            Ql qlE = c4104z8.g().e();
            boolean z12 = (qlE == null || (mrzInfoE = qlE.e()) == null) ? false : !mrzInfoE.getValidationErrors().contains(MrtdMrzInfoValidationError.TRUNCATED_NAMES);
            if (z11 && z12) {
                return true;
            }
        }
        return false;
    }

    public final wn0.a a(final C3954vo ocraConfiguration) {
        p013kotlin.jvm.internal.s.k(ocraConfiguration, "ocraConfiguration");
        return new wn0.a() { // from class: com.fourthline.orca.internal.cw0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(Xi.b(ocraConfiguration));
            }
        };
    }

    public final C3208eD c(final C4104z8 dataBundle, final Kp personBundle) {
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        return new C3208eD(new wn0.a() { // from class: com.fourthline.orca.internal.bw0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(Xi.d(dataBundle, personBundle));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(C4104z8 c4104z8, Kp kp2) {
        return (c4104z8.j() == null || kp2.h() == null || kp2.k() == null) ? false : true;
    }

    public final C3208eD a(final C4104z8 bundle, final Kp personBundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        return new C3208eD(new wn0.a() { // from class: com.fourthline.orca.internal.zv0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(Xi.b(bundle, personBundle));
            }
        });
    }

    public final C3208eD a(final XA bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new C3208eD(new wn0.a() { // from class: com.fourthline.orca.internal.aw0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(Xi.b(bundle));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(XA xa2) {
        return xa2.e();
    }
}
