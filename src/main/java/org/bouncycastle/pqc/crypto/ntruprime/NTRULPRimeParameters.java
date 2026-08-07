package org.bouncycastle.pqc.crypto.ntruprime;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes10.dex */
public class NTRULPRimeParameters implements KEMParameters {
    private final int delta;
    private final String name;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f99131p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f99132q;
    private final int roundedPolynomialBytes;
    private final int sharedKeyBytes;
    private final int tau0;
    private final int tau1;
    private final int tau2;
    private final int tau3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f99133w;
    public static final NTRULPRimeParameters ntrulpr653 = new NTRULPRimeParameters("ntrulpr653", 653, 4621, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, 2175, 113, 2031, EnumC4419g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, 865, 897, 1125, 32);
    public static final NTRULPRimeParameters ntrulpr761 = new NTRULPRimeParameters("ntrulpr761", 761, 4591, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, 2156, 114, 2007, EnumC4419g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, 1007, 1039, 1294, 32);
    public static final NTRULPRimeParameters ntrulpr857 = new NTRULPRimeParameters("ntrulpr857", 857, 5167, EnumC4419g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC4419g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE, 2433, 101, 2265, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, 1152, 1184, 1463, 32);
    public static final NTRULPRimeParameters ntrulpr953 = new NTRULPRimeParameters("ntrulpr953", 953, 6343, 345, 404, 2997, 82, 2798, 400, 1317, 1349, 1652, 32);
    public static final NTRULPRimeParameters ntrulpr1013 = new NTRULPRimeParameters("ntrulpr1013", 1013, 7177, 392, 450, 3367, 73, 3143, 449, 1423, 1455, 1773, 32);
    public static final NTRULPRimeParameters ntrulpr1277 = new NTRULPRimeParameters("ntrulpr1277", 1277, 7879, HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.BAD_GATEWAY_502, 3724, 66, 3469, DownloaderService.STATUS_HTTP_EXCEPTION, 1815, 1847, 2231, 32);

    private NTRULPRimeParameters(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23) {
        this.name = str;
        this.f99131p = i11;
        this.f99132q = i12;
        this.f99133w = i13;
        this.delta = i14;
        this.tau0 = i15;
        this.tau1 = i16;
        this.tau2 = i17;
        this.tau3 = i18;
        this.roundedPolynomialBytes = i19;
        this.publicKeyBytes = i21;
        this.privateKeyBytes = i22;
        this.sharedKeyBytes = i23;
    }

    public int getDelta() {
        return this.delta;
    }

    public String getName() {
        return this.name;
    }

    public int getP() {
        return this.f99131p;
    }

    public int getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getQ() {
        return this.f99132q;
    }

    public int getRoundedPolynomialBytes() {
        return this.roundedPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getTau0() {
        return this.tau0;
    }

    public int getTau1() {
        return this.tau1;
    }

    public int getTau2() {
        return this.tau2;
    }

    public int getTau3() {
        return this.tau3;
    }

    public int getW() {
        return this.f99133w;
    }
}
