package l3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010 \u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010#\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0017\u0010%\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010'\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010*\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019R\u0017\u0010,\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u0017\u0010.\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b+\u0010\u0017\u001a\u0004\b-\u0010\u0019R\u0017\u00100\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b/\u0010\u0019R\u0017\u00101\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u00103\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b2\u0010\u0019R\u0017\u00104\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b-\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019R\u0017\u00105\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b&\u00109R\u0017\u0010;\u001a\u0002068\u0006¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\b$\u00109R\u001a\u0010=\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u0017\u001a\u0004\b<\u0010\u0019R\u0017\u0010>\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b7\u00109R \u0010B\u001a\b\u0012\u0004\u0012\u0002060?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\b(\u0010A¨\u0006C"}, d2 = {"Ll3/g;", "", "<init>", "()V", "", "b", "[F", "x", "()[F", "SrgbPrimaries", "c", "s", "Ntsc1953Primaries", "Ll3/y;", DateTokenConverter.CONVERTER_KEY, "Ll3/y;", "getSrgbTransferParameters$ui_graphics_release", "()Ll3/y;", "SrgbTransferParameters", "e", "NoneTransferParameters", "Ll3/x;", "f", "Ll3/x;", "w", "()Ll3/x;", "Srgb", "g", "q", "LinearSrgb", "h", "o", "ExtendedSrgb", IntegerTokenConverter.CONVERTER_KEY, "p", "LinearExtendedSrgb", "j", "Bt709", "k", "Bt2020", "l", "m", "DciP3", "n", "DisplayP3", "r", "Ntsc1953", "v", "SmpteC", "AdobeRgb", "u", "ProPhotoRgb", "Aces", "Acescg", "Ll3/c;", "t", "Ll3/c;", "()Ll3/c;", "CieXyz", "CieLab", "y", "Unspecified", "Oklab", "", "[Ll3/c;", "()[Ll3/c;", "ColorSpacesArray", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f89510a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float[] SrgbPrimaries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float[] Ntsc1953Primaries;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final TransferParameters SrgbTransferParameters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final TransferParameters NoneTransferParameters;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final x Srgb;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final x LinearSrgb;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final x ExtendedSrgb;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final x LinearExtendedSrgb;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final x Bt709;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final x Bt2020;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final x DciP3;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final x DisplayP3;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final x Ntsc1953;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final x SmpteC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final x AdobeRgb;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final x ProPhotoRgb;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final x Aces;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final x Acescg;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final c CieXyz;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final c CieLab;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final x Unspecified;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final c Oklab;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final c[] ColorSpacesArray;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        SrgbTransferParameters = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        NoneTransferParameters = transferParameters2;
        k kVar = k.f89545a;
        x xVar = new x("sRGB IEC61966-2.1", fArr, kVar.e(), transferParameters, 0);
        Srgb = xVar;
        x xVar2 = new x("sRGB IEC61966-2.1 (Linear)", fArr, kVar.e(), 1.0d, BitmapDescriptorFactory.HUE_RED, 1.0f, 1);
        LinearSrgb = xVar2;
        x xVar3 = new x("scRGB-nl IEC 61966-2-2:2003", fArr, kVar.e(), null, new j() { // from class: l3.e
            @Override // l3.j
            public final double a(double d11) {
                return g.c(d11);
            }
        }, new j() { // from class: l3.f
            @Override // l3.j
            public final double a(double d11) {
                return g.d(d11);
            }
        }, -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = xVar3;
        x xVar4 = new x("scRGB IEC 61966-2-2:2003", fArr, kVar.e(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = xVar4;
        x xVar5 = new x("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, kVar.e(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        Bt709 = xVar5;
        x xVar6 = new x("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, kVar.e(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        Bt2020 = xVar6;
        x xVar7 = new x("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, BitmapDescriptorFactory.HUE_RED, 1.0f, 6);
        DciP3 = xVar7;
        x xVar8 = new x("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, kVar.e(), transferParameters, 7);
        DisplayP3 = xVar8;
        x xVar9 = new x("NTSC (1953)", fArr2, kVar.a(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        Ntsc1953 = xVar9;
        x xVar10 = new x("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, kVar.e(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        SmpteC = xVar10;
        x xVar11 = new x("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, kVar.e(), 2.2d, BitmapDescriptorFactory.HUE_RED, 1.0f, 10);
        AdobeRgb = xVar11;
        x xVar12 = new x("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, kVar.b(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        ProPhotoRgb = xVar12;
        x xVar13 = new x("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0E-4f, -0.077f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = xVar13;
        x xVar14 = new x("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = xVar14;
        a0 a0Var = new a0("Generic XYZ", 14);
        CieXyz = a0Var;
        l lVar = new l("Generic L*a*b*", 15);
        CieLab = lVar;
        x xVar15 = new x("None", fArr, kVar.e(), transferParameters2, 16);
        Unspecified = xVar15;
        m mVar = new m("Oklab", 17);
        Oklab = mVar;
        ColorSpacesArray = new c[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10, xVar11, xVar12, xVar13, xVar14, a0Var, lVar, xVar15, mVar};
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double c(double d11) {
        return d.a(d11, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(double d11) {
        return d.b(d11, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final x e() {
        return Aces;
    }

    public final x f() {
        return Acescg;
    }

    public final x g() {
        return AdobeRgb;
    }

    public final x h() {
        return Bt2020;
    }

    public final x i() {
        return Bt709;
    }

    public final c j() {
        return CieLab;
    }

    public final c k() {
        return CieXyz;
    }

    public final c[] l() {
        return ColorSpacesArray;
    }

    public final x m() {
        return DciP3;
    }

    public final x n() {
        return DisplayP3;
    }

    public final x o() {
        return ExtendedSrgb;
    }

    public final x p() {
        return LinearExtendedSrgb;
    }

    public final x q() {
        return LinearSrgb;
    }

    public final x r() {
        return Ntsc1953;
    }

    public final float[] s() {
        return Ntsc1953Primaries;
    }

    public final c t() {
        return Oklab;
    }

    public final x u() {
        return ProPhotoRgb;
    }

    public final x v() {
        return SmpteC;
    }

    public final x w() {
        return Srgb;
    }

    public final float[] x() {
        return SrgbPrimaries;
    }

    public final x y() {
        return Unspecified;
    }
}
