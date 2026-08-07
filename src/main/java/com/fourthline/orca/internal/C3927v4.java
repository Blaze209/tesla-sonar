package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3927v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3927v4 f36005a = new C3927v4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static wn0.p f36006b = z2.c.c(1447071425, false, a.f36007a);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.v4$a */
    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36007a = new a();

        a() {
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1447071425, i11, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.ComposableSingletons$NfcScannerScreenKt.lambda-1.<anonymous> (NfcScannerScreen.kt:362)");
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }
    }

    public final wn0.p a() {
        return f36006b;
    }
}
