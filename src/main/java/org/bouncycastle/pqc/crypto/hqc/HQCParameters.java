package org.bouncycastle.pqc.crypto.hqc;

import com.plaid.internal.EnumC4419g;
import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes10.dex */
public class HQCParameters implements KEMParameters {
    static final int GF_MUL_ORDER = 255;
    static final int PARAM_M = 8;
    public static final HQCParameters hqc128 = new HQCParameters("hqc-128", 17669, 46, KyberEngine.KyberPolyBytes, 16, 31, 15, 66, 75, 75, 16767881, 4, new int[]{89, 69, 153, 116, 176, 117, 111, 75, 73, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 65, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 21, 139, 103, 173, 67, 118, 105, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 174, 110, 74, 69, EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 82, 255, 181, 1});
    public static final HQCParameters hqc192 = new HQCParameters("hqc-192", 35851, 56, 640, 24, 33, 16, 100, 114, 114, 16742417, 5, new int[]{45, EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, 24, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 104, 27, 40, 107, 50, 163, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, 134, 224, 158, 119, 13, 158, 1, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 164, 82, 43, 15, EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 142, 50, 189, 29, EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 1});
    public static final HQCParameters hqc256 = new HQCParameters("hqc-256", 57637, 90, 640, 32, 59, 29, 131, 149, 149, 16772367, 5, new int[]{49, 167, 49, 39, 200, 121, 124, 91, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 63, 148, 71, 150, 123, 87, 101, 32, EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, 159, 71, EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, 115, 97, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 186, 183, 141, EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE, 123, 12, 31, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 180, EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 152, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, 99, 141, 4, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 191, 144, 8, EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 47, 27, 141, 178, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 64, 124, 47, 39, 188, EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 48, EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, 187, 1});
    private int delta;
    private int fft;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f99102g;
    private int[] generatorPoly;
    private HQCEngine hqcEngine;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f99103k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99104n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f99105n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private int f99106n2;
    private final String name;
    private int utilRejectionThreshold;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99107w;

    /* JADX INFO: renamed from: we, reason: collision with root package name */
    private int f99108we;

    /* JADX INFO: renamed from: wr, reason: collision with root package name */
    private int f99109wr;

    private HQCParameters(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int[] iArr) {
        this.name = str;
        this.f99104n = i11;
        this.f99105n1 = i12;
        this.f99106n2 = i13;
        this.f99103k = i14;
        this.delta = i16;
        this.f99107w = i17;
        this.f99109wr = i18;
        this.f99108we = i19;
        this.generatorPoly = iArr;
        this.f99102g = i15;
        this.utilRejectionThreshold = i21;
        this.fft = i22;
        this.hqcEngine = new HQCEngine(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, iArr);
    }

    int getDelta() {
        return this.delta;
    }

    HQCEngine getEngine() {
        return this.hqcEngine;
    }

    int getK() {
        return this.f99103k;
    }

    int getN() {
        return this.f99104n;
    }

    int getN1() {
        return this.f99105n1;
    }

    int getN1N2_BYTES() {
        return ((this.f99105n1 * this.f99106n2) + 7) / 8;
    }

    int getN2() {
        return this.f99106n2;
    }

    int getN_BYTES() {
        return (this.f99104n + 7) / 8;
    }

    public String getName() {
        return this.name;
    }

    int getSALT_SIZE_BYTES() {
        return 16;
    }

    int getSHA512_BYTES() {
        return 64;
    }

    public int getSessionKeySize() {
        return this.f99103k * 8;
    }

    int getW() {
        return this.f99107w;
    }

    int getWe() {
        return this.f99108we;
    }

    int getWr() {
        return this.f99109wr;
    }
}
