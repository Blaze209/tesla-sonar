package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
public class ECBasisType {
    public static final short ec_basis_pentanomial = 2;
    public static final short ec_basis_trinomial = 1;

    public static boolean isValid(short s11) {
        return s11 >= 1 && s11 <= 2;
    }
}
