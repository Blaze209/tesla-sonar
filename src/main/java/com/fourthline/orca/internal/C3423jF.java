package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3423jF {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(C3765rE c3765rE) {
        XE xeA = c3765rE.a();
        if (xeA != null) {
            return xeA.b();
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) "The workflow session config must be present at this moment!")).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(C3765rE c3765rE) {
        XE xeA = c3765rE.a();
        if (xeA != null) {
            return xeA.c();
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) "The workflow session config must be present at this moment!")).toString());
    }

    public final wn0.a a(final C3765rE bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new wn0.a() { // from class: com.fourthline.orca.internal.b51
            @Override // wn0.a
            public final Object invoke() {
                return C3423jF.b(bundle);
            }
        };
    }

    public final wn0.a c(final C3765rE bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new wn0.a() { // from class: com.fourthline.orca.internal.a51
            @Override // wn0.a
            public final Object invoke() {
                return C3423jF.d(bundle);
            }
        };
    }
}
