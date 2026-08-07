package org.bouncycastle.pqc.legacy.crypto.qtesla;

/* JADX INFO: loaded from: classes10.dex */
public class QTESLASecurityCategory {
    public static final int PROVABLY_SECURE_I = 5;
    public static final int PROVABLY_SECURE_III = 6;

    private QTESLASecurityCategory() {
    }

    public static String getName(int i11) {
        if (i11 == 5) {
            return "qTESLA-p-I";
        }
        if (i11 == 6) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException("unknown security category: " + i11);
    }

    static int getPrivateSize(int i11) {
        if (i11 == 5) {
            return 5224;
        }
        if (i11 == 6) {
            return 12392;
        }
        throw new IllegalArgumentException("unknown security category: " + i11);
    }

    static int getPublicSize(int i11) {
        if (i11 == 5) {
            return 14880;
        }
        if (i11 == 6) {
            return 38432;
        }
        throw new IllegalArgumentException("unknown security category: " + i11);
    }

    static int getSignatureSize(int i11) {
        if (i11 == 5) {
            return 2592;
        }
        if (i11 == 6) {
            return 5664;
        }
        throw new IllegalArgumentException("unknown security category: " + i11);
    }

    static void validate(int i11) {
        if (i11 == 5 || i11 == 6) {
            return;
        }
        throw new IllegalArgumentException("unknown security category: " + i11);
    }
}
