package org.bouncycastle.pqc.crypto.ntruprime;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes10.dex */
public class SNTRUPrimeParameters implements KEMParameters {
    private final String name;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f99135p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f99136q;
    private final int roundedPolynomialBytes;
    private final int rqPolynomialBytes;
    private final int sharedKeyBytes;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f99137w;
    public static final SNTRUPrimeParameters sntrup653 = new SNTRUPrimeParameters("sntrup653", 653, 4621, EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, 994, 865, 994, 1518, 32);
    public static final SNTRUPrimeParameters sntrup761 = new SNTRUPrimeParameters("sntrup761", 761, 4591, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, 1158, 1007, 1158, 1763, 32);
    public static final SNTRUPrimeParameters sntrup857 = new SNTRUPrimeParameters("sntrup857", 857, 5167, EnumC4419g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, 1322, 1152, 1322, 1999, 32);
    public static final SNTRUPrimeParameters sntrup953 = new SNTRUPrimeParameters("sntrup953", 953, 6343, 396, 1505, 1317, 1505, 2254, 32);
    public static final SNTRUPrimeParameters sntrup1013 = new SNTRUPrimeParameters("sntrup1013", 1013, 7177, 448, 1623, 1423, 1623, 2417, 32);
    public static final SNTRUPrimeParameters sntrup1277 = new SNTRUPrimeParameters("sntrup1277", 1277, 7879, DownloaderService.STATUS_FILE_ERROR, 2067, 1815, 2067, 3059, 32);

    private SNTRUPrimeParameters(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.name = str;
        this.f99135p = i11;
        this.f99136q = i12;
        this.f99137w = i13;
        this.rqPolynomialBytes = i14;
        this.roundedPolynomialBytes = i15;
        this.publicKeyBytes = i16;
        this.privateKeyBytes = i17;
        this.sharedKeyBytes = i18;
    }

    public String getName() {
        return this.name;
    }

    public int getP() {
        return this.f99135p;
    }

    public int getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getQ() {
        return this.f99136q;
    }

    public int getRoundedPolynomialBytes() {
        return this.roundedPolynomialBytes;
    }

    public int getRqPolynomialBytes() {
        return this.rqPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getW() {
        return this.f99137w;
    }
}
