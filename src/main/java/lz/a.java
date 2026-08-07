package lz;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static BouncyCastleProvider f90890a;

    public static BouncyCastleProvider a() {
        if (f90890a == null) {
            f90890a = new BouncyCastleProvider();
        }
        return f90890a;
    }
}
