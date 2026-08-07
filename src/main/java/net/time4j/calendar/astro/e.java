package net.time4j.calendar.astro;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.io.Serializable;
import okhttp3.internal.http.StatusLine;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes9.dex */
public class e implements Serializable {
    private static final long serialVersionUID = 5736859564589473324L;
    private final double azimuth;
    private final double declination;
    private final double distance;
    private final double elevation;
    private final double rightAscension;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f94004a = {0, 2, 2, 0, 0, 0, 2, 2, 2, 2, 0, 1, 0, 2, 0, 0, 4, 0, 4, 2, 2, 1, 1, 2, 2, 4, 2, 0, 2, 2, 1, 2, 0, 0, 2, 2, 2, 4, 0, 3, 2, 4, 0, 2, 2, 2, 4, 0, 4, 1, 2, 0, 1, 3, 4, 2, 0, 1, 2, 2};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f94005b = {0, 0, 0, 0, 1, 0, 0, -1, 0, -1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, -1, 0, 0, 0, 1, 0, -1, 0, -2, 1, 2, -2, 0, 0, -1, 0, 0, 1, -1, 2, 2, 1, -1, 0, 0, -1, 0, 1, 0, 1, 0, 0, -1, 2, 1, 0, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f94006c = {1, -1, 0, 2, 0, 0, -2, -1, 1, 0, -1, 0, 1, 0, 1, 1, -1, 3, -2, -1, 0, -1, 0, 1, 2, 0, -3, -2, -1, -2, 1, 0, 2, 0, -1, 1, 0, -1, 2, -1, 1, -2, -1, -1, -2, 0, 1, 4, 0, -2, 0, 2, 1, -2, -3, 2, 1, -1, 3, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f94007d = {0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, -2, 2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, -2, 2, 0, 2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -2, -2, 0, 0, 0, 0, 0, 0, 0, -2};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f94008e = {6288774, 1274027, 658314, 213618, -185116, -114332, 58793, 57066, 53322, 45758, -40923, -34720, -30383, 15327, -12528, 10980, 10675, 10034, 8548, -7888, -6766, -5163, 4987, 4036, 3994, 3861, 3665, -2689, -2602, 2390, -2348, 2236, -2120, -2069, 2048, -1773, -1595, 1215, -1110, -892, -810, 759, -713, -700, 691, 596, 549, 537, 520, -487, -399, -381, 351, -340, 330, EnumC4419g.SDK_ASSET_ICON_UPLOAD_VALUE, -323, EnumC4419g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f94009f = {-20905355, -3699111, -2955968, -569925, 48888, -3149, 246158, -152138, -170733, -204586, -129620, 108743, 104755, 10321, 0, 79661, -34782, -23210, -21636, 24208, 30824, -8379, -16675, -12831, -10445, -11650, 14403, -7003, 0, 10056, 6322, -9884, 5751, 0, -4950, 4130, 0, -3958, 0, 3258, 2616, -1897, -2117, 2354, 0, 0, -1423, -1117, -1571, -1739, 0, -4421, 0, 0, 0, 0, 1165, 0, 0, 8752};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f94010g = {0, 0, 0, 2, 2, 2, 2, 0, 2, 0, 2, 2, 2, 2, 2, 2, 2, 0, 4, 0, 0, 0, 1, 0, 0, 0, 1, 0, 4, 4, 0, 4, 2, 2, 2, 2, 0, 2, 2, 2, 2, 4, 2, 2, 0, 2, 1, 1, 0, 2, 1, 2, 0, 4, 4, 1, 4, 1, 4, 2};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f94011h = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, -1, -1, -1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 1, 1, 0, -1, -2, 0, 1, 1, 1, 1, 1, 0, -1, 1, 0, -1, 0, 0, 0, -1, -2};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f94012i = {0, 1, 1, 0, -1, -1, 0, 2, 1, 2, 0, -2, 1, 0, -1, 0, -1, -1, -1, 0, 0, -1, 0, 1, 1, 0, 0, 3, 0, -1, 1, -2, 0, 2, 1, -2, 3, 2, -3, -1, 0, 0, 1, 0, 1, 1, 0, 0, -2, -1, 1, -2, 2, -2, -1, 1, 1, -1, 0, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f94013j = {1, 1, -1, -1, 1, -1, 1, 1, -1, -1, -1, -1, 1, -1, 1, 1, -1, -1, -1, 1, 3, 1, 1, 1, -1, -1, -1, 1, -1, 1, -3, 1, -3, -1, -1, 1, -1, 1, -1, 1, 1, 1, 1, -1, 3, -1, -1, 1, -1, -1, 1, -1, 1, -1, -1, -1, -1, -1, -1, 1};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f94014k = {5128122, 280602, 277693, 173237, 55413, 46271, EACTags.DIGITAL_SIGNATURE_BLOCK, 17198, 9266, 8822, 8216, 4324, 4200, -3359, 2463, 2211, 2065, -1870, 1828, -1794, -1749, -1565, -1491, -1475, -1410, -1344, -1335, 1107, 1021, 833, 777, 671, 607, 596, DownloaderService.STATUS_UNKNOWN_ERROR, -451, 439, HttpStatusCode.UNPROCESSABLE_ENTITY_422, StatusLine.HTTP_MISDIRECTED_REQUEST, -366, -351, 331, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE, -283, -229, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, -220, -220, -185, 181, -177, 176, 166, -164, 132, -119, 115, 107};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f94015l = {2, 4, 6, 8, 2, 0, 10, 4, 6, 12, 1, 8, 14, 0, 3, 10, 16, 12, 5, 2, 18, 14, 7, 2, 20, 1, 16, 4, 9, 4, 2, 4, 6, 22, 18, 6, 11, 8, 4, 6, 3, 5, 13, 20, 3, 4, 1, 22, 0, 6, 2, 0, 0, 2, 0, 2, 24, 4, 2, 1};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f94016m = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, 2, 0, 0, 4, -2, -2, 0, 2, 4, 2, -2, 0, -4, 0, 0};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f94017n = {0, 0, 0, 0, -1, 1, 0, -1, -1, 0, 0, -1, 0, 0, 0, -1, 0, -1, 0, 0, 0, -1, 0, 1, 0, 1, -1, 1, 0, 0, -2, -2, -2, 0, -1, 1, 0, 1, 0, 0, 1, 1, 0, -1, 2, -2, 2, -1, 0, 0, 1, 2, -1, 0, -2, 2, 0, 0, 2, -1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final double[] f94018o = {-1.6769d, 0.4589d, -0.1856d, 0.0883d, -0.0773d, 0.0502d, -0.046d, 0.0422d, -0.0256d, 0.0253d, 0.0237d, 0.0162d, -0.0145d, 0.0129d, -0.0112d, -0.0104d, 0.0086d, 0.0069d, 0.0066d, -0.0053d, -0.0052d, -0.0046d, -0.0041d, 0.004d, 0.0032d, -0.0032d, 0.0031d, -0.0029d, 0.0027d, 0.0027d, -0.0027d, 0.0024d, -0.0021d, -0.0021d, -0.0021d, 0.0019d, -0.0018d, -0.0014d, -0.0014d, -0.0014d, 0.0014d, -0.0014d, 0.0013d, 0.0013d, 0.0011d, -0.0011d, -0.001d, -9.0E-4d, -8.0E-4d, 8.0E-4d, 8.0E-4d, 7.0E-4d, 7.0E-4d, 7.0E-4d, -6.0E-4d, -6.0E-4d, 6.0E-4d, 5.0E-4d, 5.0E-4d, -4.0E-4d};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final double[] f94019p = {0.0d, 0.0d, 0.0d, 0.0d, 1.9E-4d, -1.3E-4d, 0.0d, -1.1E-4d};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f94020q = {2, 4, 0, 2, 0, 1, 6, 4, 2, 1, 8, 6, 2, 2, 3, 4, 8, 4, 10, 3, 0, 2, 2, 6, 6, 10, 5, 4, 0, 12, 2, 1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f94021r = {0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, -2, 2, 0, 2, 0};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f94022s = {0, 0, 1, -1, 0, 0, 0, -1, 0, 1, 0, -1, 0, -2, 0, 0, -1, -2, 0, 1, 2, 1, 2, 0, -2, -1, 0, 0, 1, 0, -1, -1};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final double[] f94023t = {0.4392d, 0.0684d, 0.0456d, 0.0426d, 0.0212d, -0.0189d, 0.0144d, 0.0113d, 0.0047d, 0.0036d, 0.0035d, 0.0034d, -0.0034d, 0.0022d, -0.0017d, 0.0013d, 0.0011d, 0.001d, 9.0E-4d, 7.0E-4d, 6.0E-4d, 5.0E-4d, 5.0E-4d, 4.0E-4d, 4.0E-4d, 4.0E-4d, -4.0E-4d, -4.0E-4d, 3.0E-4d, 3.0E-4d, 3.0E-4d, -3.0E-4d};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final double[] f94024u = {0.0d, 0.0d, -1.1E-4d, -1.1E-4d};

    static double a(double d11) {
        return e(((((((1.4347408140719379E-5d - (6.797172376291463E-8d * d11)) * d11) + 0.0087414d) * d11) + 477198.8675055d) * d11) + 134.9633964d);
    }

    static double b(double d11) {
        return e((((((4.083299305839118E-8d * d11) - 1.536E-4d) * d11) + 35999.0502909d) * d11) + 357.5291092d);
    }

    static double c(double d11) {
        return e(((((((1.8319447192361523E-6d - (8.844469995135542E-9d * d11)) * d11) - 0.0018819d) * d11) + 445267.1114034d) * d11) + 297.8501921d);
    }

    private static int d(double d11) {
        long jDoubleToLongBits = Double.doubleToLongBits(d11);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    private static double e(double d11) {
        return d11 - (Math.floor(d11 / 360.0d) * 360.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.rightAscension == eVar.rightAscension && this.declination == eVar.declination && this.azimuth == eVar.azimuth && this.elevation == eVar.elevation && this.distance == eVar.distance) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return d(this.rightAscension) + (d(this.declination) * 31) + (d(this.distance) * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("moon-position[ra=");
        sb2.append(this.rightAscension);
        sb2.append(",decl=");
        sb2.append(this.declination);
        sb2.append(",azimuth=");
        sb2.append(this.azimuth);
        sb2.append(",elevation=");
        sb2.append(this.elevation);
        sb2.append(",distance=");
        sb2.append(this.distance);
        sb2.append(']');
        return sb2.toString();
    }
}
