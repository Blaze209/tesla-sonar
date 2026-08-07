package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes4.dex */
public class DA implements Cloneable {
    String A;
    Boolean B;
    Boolean C;
    Vw.O D;
    Float E;
    String F;
    c G;
    String H;
    Vw.O I;
    Float J;
    Vw.O K;
    Float L;
    o M;
    j N;
    g O;
    b P;
    d Q;
    F3 R;
    F3 S;
    F3 T;
    F3 U;
    F3 V;
    F3 W;
    G3 X;
    p Y;
    f Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f25322a = 0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    n f25323a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Vw.O f25324b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    Vw.C2994q f25325b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f25326c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    Vw.C2994q f25327c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Float f25328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Vw.O f25329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Float f25330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Vw.C2994q f25331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    h f25332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    i f25333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Float f25334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Vw.C2994q[] f25335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Vw.C2994q f25336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Float f25337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Vw.C2984g f25338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    List f25339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Vw.C2994q f25340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Float f25341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    e f25342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Float f25343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    l f25344t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    m f25345u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    k f25346v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Boolean f25347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Vw.C2981d f25348x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    String f25349y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    String f25350z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25351a;

        static {
            int[] iArr = new int[Zw.g.values().length];
            f25351a = iArr;
            try {
                iArr[Zw.g.fill.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25351a[Zw.g.fill_rule.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25351a[Zw.g.fill_opacity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25351a[Zw.g.stroke.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25351a[Zw.g.stroke_opacity.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25351a[Zw.g.stroke_width.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25351a[Zw.g.stroke_linecap.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25351a[Zw.g.stroke_linejoin.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25351a[Zw.g.stroke_miterlimit.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25351a[Zw.g.stroke_dasharray.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25351a[Zw.g.stroke_dashoffset.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f25351a[Zw.g.opacity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f25351a[Zw.g.color.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f25351a[Zw.g.font.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f25351a[Zw.g.font_family.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f25351a[Zw.g.font_size.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f25351a[Zw.g.font_weight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f25351a[Zw.g.font_style.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f25351a[Zw.g.font_stretch.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f25351a[Zw.g.text_decoration.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f25351a[Zw.g.direction.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f25351a[Zw.g.text_anchor.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f25351a[Zw.g.overflow.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f25351a[Zw.g.marker.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f25351a[Zw.g.marker_start.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f25351a[Zw.g.marker_mid.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f25351a[Zw.g.marker_end.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f25351a[Zw.g.display.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f25351a[Zw.g.visibility.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f25351a[Zw.g.stop_color.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f25351a[Zw.g.stop_opacity.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f25351a[Zw.g.clip.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f25351a[Zw.g.clip_path.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f25351a[Zw.g.clip_rule.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f25351a[Zw.g.mask.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f25351a[Zw.g.solid_color.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f25351a[Zw.g.solid_opacity.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f25351a[Zw.g.viewport_fill.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f25351a[Zw.g.viewport_fill_opacity.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f25351a[Zw.g.vector_effect.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f25351a[Zw.g.image_rendering.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f25351a[Zw.g.isolation.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f25351a[Zw.g.mix_blend_mode.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f25351a[Zw.g.font_kerning.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f25351a[Zw.g.font_variant.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f25351a[Zw.g.font_variant_ligatures.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f25351a[Zw.g.font_variant_position.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f25351a[Zw.g.font_variant_caps.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f25351a[Zw.g.font_variant_numeric.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f25351a[Zw.g.font_variant_east_asian.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f25351a[Zw.g.font_feature_settings.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f25351a[Zw.g.font_variation_settings.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f25351a[Zw.g.letter_spacing.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f25351a[Zw.g.word_spacing.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
        }
    }

    public enum b {
        normal,
        multiply,
        screen,
        overlay,
        darken,
        lighten,
        color_dodge,
        color_burn,
        hard_light,
        soft_light,
        difference,
        exclusion,
        hue,
        saturation,
        color,
        luminosity,
        UNSUPPORTED;


        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Map f25369r = new HashMap();

        static {
            for (b bVar : values()) {
                if (bVar != UNSUPPORTED) {
                    f25369r.put(bVar.name().replace('_', CoreConstants.DASH_CHAR), bVar);
                }
            }
        }

        public static b a(String str) {
            b bVar = (b) f25369r.get(str);
            return bVar != null ? bVar : UNSUPPORTED;
        }
    }

    public enum c {
        NonZero,
        EvenOdd
    }

    public enum d {
        auto,
        normal,
        none
    }

    public enum e {
        normal,
        italic,
        oblique
    }

    public enum f {
        auto,
        angle0,
        angle90,
        angle180,
        angle270
    }

    public enum g {
        auto,
        isolate
    }

    public enum h {
        Butt,
        Round,
        Square
    }

    public enum i {
        Miter,
        Round,
        Bevel
    }

    public enum j {
        auto,
        optimizeQuality,
        optimizeSpeed
    }

    public enum k {
        Start,
        Middle,
        End
    }

    public enum l {
        None,
        Underline,
        Overline,
        LineThrough,
        Blink
    }

    public enum m {
        LTR,
        RTL
    }

    public enum n {
        mixed,
        upright,
        sideways
    }

    public enum o {
        None,
        NonScalingStroke
    }

    public enum p {
        lr_tb,
        rl_tb,
        tb_rl,
        lr,
        rl,
        tb,
        horizontal_tb,
        vertical_rl,
        vertical_lr
    }

    static DA a() {
        DA da2 = new DA();
        Vw.C2984g c2984g = Vw.C2984g.f29313b;
        da2.f25324b = c2984g;
        c cVar = c.NonZero;
        da2.f25326c = cVar;
        Float fValueOf = Float.valueOf(1.0f);
        da2.f25328d = fValueOf;
        da2.f25329e = null;
        da2.f25330f = fValueOf;
        da2.f25331g = new Vw.C2994q(1.0f);
        da2.f25332h = h.Butt;
        da2.f25333i = i.Miter;
        da2.f25334j = Float.valueOf(4.0f);
        da2.f25335k = null;
        Vw.C2994q c2994q = Vw.C2994q.f29338c;
        da2.f25336l = c2994q;
        da2.f25337m = fValueOf;
        da2.f25338n = c2984g;
        da2.f25339o = null;
        da2.f25340p = new Vw.C2994q(12.0f, Vw.d0.pt);
        da2.f25341q = Float.valueOf(400.0f);
        da2.f25342r = e.normal;
        da2.f25343s = Float.valueOf(100.0f);
        da2.f25344t = l.None;
        da2.f25345u = m.LTR;
        da2.f25346v = k.Start;
        Boolean bool = Boolean.TRUE;
        da2.f25347w = bool;
        da2.f25348x = null;
        da2.f25349y = null;
        da2.f25350z = null;
        da2.A = null;
        da2.B = bool;
        da2.C = bool;
        da2.D = c2984g;
        da2.E = fValueOf;
        da2.F = null;
        da2.G = cVar;
        da2.H = null;
        da2.I = null;
        da2.J = fValueOf;
        da2.K = null;
        da2.L = fValueOf;
        da2.M = o.None;
        da2.N = j.auto;
        da2.O = g.auto;
        da2.P = b.normal;
        da2.Q = d.auto;
        da2.R = F3.f25721d;
        da2.S = F3.f25723f;
        da2.T = F3.f25724g;
        da2.U = F3.f25726i;
        da2.V = F3.f25727j;
        da2.W = F3.f25719b;
        da2.X = null;
        da2.f25325b0 = c2994q;
        da2.f25327c0 = c2994q;
        da2.Y = p.horizontal_tb;
        da2.Z = f.auto;
        da2.f25323a0 = n.mixed;
        da2.f25322a = -1159984767303681L;
        return da2;
    }

    protected Object clone() {
        DA da2 = (DA) super.clone();
        Vw.C2994q[] c2994qArr = this.f25335k;
        if (c2994qArr != null) {
            da2.f25335k = (Vw.C2994q[]) c2994qArr.clone();
        }
        return da2;
    }

    void a(boolean z11) {
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        this.B = bool;
        if (!z11) {
            bool = Boolean.FALSE;
        }
        this.f25347w = bool;
        this.f25348x = null;
        this.F = null;
        this.f25337m = fValueOf;
        this.D = Vw.C2984g.f29313b;
        this.E = fValueOf;
        this.H = null;
        this.I = null;
        this.J = fValueOf;
        this.K = null;
        this.L = fValueOf;
        this.M = o.None;
        this.O = g.auto;
        this.P = b.normal;
    }

    static void a(DA da2, String str, String str2, boolean z11) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f25351a[Zw.g.a(str).ordinal()]) {
                case 1:
                    Vw.O oU = Zw.u(str2);
                    da2.f25324b = oU;
                    if (oU != null) {
                        da2.f25322a |= 1;
                    }
                    break;
                case 2:
                    c cVarG = Zw.g(str2);
                    da2.f25326c = cVarG;
                    if (cVarG != null) {
                        da2.f25322a |= 2;
                    }
                    break;
                case 3:
                    Float fS = Zw.s(str2);
                    da2.f25328d = fS;
                    if (fS != null) {
                        da2.f25322a |= 4;
                    }
                    break;
                case 4:
                    Vw.O oU2 = Zw.u(str2);
                    da2.f25329e = oU2;
                    if (oU2 != null) {
                        da2.f25322a |= 8;
                    }
                    break;
                case 5:
                    Float fS2 = Zw.s(str2);
                    da2.f25330f = fS2;
                    if (fS2 != null) {
                        da2.f25322a |= 16;
                    }
                    break;
                case 6:
                    da2.f25331g = Zw.p(str2);
                    da2.f25322a |= 32;
                    break;
                case 7:
                    h hVarA = Zw.A(str2);
                    da2.f25332h = hVarA;
                    if (hVarA != null) {
                        da2.f25322a |= 64;
                    }
                    break;
                case 8:
                    i iVarB = Zw.B(str2);
                    da2.f25333i = iVarB;
                    if (iVarB != null) {
                        da2.f25322a |= 128;
                    }
                    break;
                case 9:
                    da2.f25334j = Float.valueOf(Zw.h(str2));
                    da2.f25322a |= 256;
                    break;
                case 10:
                    if ("none".equals(str2)) {
                        da2.f25335k = null;
                        da2.f25322a |= 512;
                    } else {
                        Vw.C2994q[] c2994qArrZ = Zw.z(str2);
                        da2.f25335k = c2994qArrZ;
                        if (c2994qArrZ != null) {
                            da2.f25322a |= 512;
                        }
                    }
                    break;
                case 11:
                    da2.f25336l = Zw.p(str2);
                    da2.f25322a |= 1024;
                    break;
                case 12:
                    da2.f25337m = Zw.s(str2);
                    da2.f25322a |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                    break;
                case 13:
                    da2.f25338n = Zw.d(str2);
                    da2.f25322a |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                    break;
                case 14:
                    if (!z11) {
                        Zw.a(da2, str2);
                        break;
                    }
                    break;
                case 15:
                    List listI = Zw.i(str2);
                    da2.f25339o = listI;
                    if (listI != null) {
                        da2.f25322a |= FileAppender.DEFAULT_BUFFER_SIZE;
                    }
                    break;
                case 16:
                    Vw.C2994q c2994qJ = Zw.j(str2);
                    da2.f25340p = c2994qJ;
                    if (c2994qJ != null) {
                        da2.f25322a |= Http2Stream.EMIT_BUFFER_SIZE;
                    }
                    break;
                case 17:
                    Float fM = Zw.m(str2);
                    da2.f25341q = fM;
                    if (fM != null) {
                        da2.f25322a |= 32768;
                    }
                    break;
                case 18:
                    e eVarL = Zw.l(str2);
                    da2.f25342r = eVarL;
                    if (eVarL != null) {
                        da2.f25322a |= 65536;
                    }
                    break;
                case 19:
                    Float fK = Zw.k(str2);
                    da2.f25343s = fK;
                    if (fK != null) {
                        da2.f25322a |= 2251799813685248L;
                    }
                    break;
                case 20:
                    l lVarE = Zw.E(str2);
                    da2.f25344t = lVarE;
                    if (lVarE != null) {
                        da2.f25322a |= 131072;
                    }
                    break;
                case 21:
                    m mVarF = Zw.F(str2);
                    da2.f25345u = mVarF;
                    if (mVarF != null) {
                        da2.f25322a |= 68719476736L;
                    }
                    break;
                case 22:
                    k kVarD = Zw.D(str2);
                    da2.f25346v = kVarD;
                    if (kVarD != null) {
                        da2.f25322a |= 262144;
                    }
                    break;
                case 23:
                    Boolean boolT = Zw.t(str2);
                    da2.f25347w = boolT;
                    if (boolT != null) {
                        da2.f25322a |= 524288;
                    }
                    break;
                case 24:
                    String strA = Zw.a(str2, str);
                    da2.f25349y = strA;
                    da2.f25350z = strA;
                    da2.A = strA;
                    da2.f25322a |= 14680064;
                    break;
                case 25:
                    da2.f25349y = Zw.a(str2, str);
                    da2.f25322a |= 2097152;
                    break;
                case 26:
                    da2.f25350z = Zw.a(str2, str);
                    da2.f25322a |= 4194304;
                    break;
                case 27:
                    da2.A = Zw.a(str2, str);
                    da2.f25322a |= 8388608;
                    break;
                case 28:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            da2.B = Boolean.valueOf(!str2.equals("none"));
                            da2.f25322a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 29:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            da2.C = Boolean.valueOf(str2.equals("visible"));
                            da2.f25322a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 30:
                    if (str2.equals("currentColor")) {
                        da2.D = Vw.C2985h.a();
                    } else {
                        da2.D = Zw.d(str2);
                    }
                    da2.f25322a |= 67108864;
                    break;
                case 31:
                    da2.E = Zw.s(str2);
                    da2.f25322a |= 134217728;
                    break;
                case 32:
                    Vw.C2981d c2981dC = Zw.c(str2);
                    da2.f25348x = c2981dC;
                    if (c2981dC != null) {
                        da2.f25322a |= 1048576;
                    }
                    break;
                case 33:
                    da2.F = Zw.a(str2, str);
                    da2.f25322a |= 268435456;
                    break;
                case 34:
                    da2.G = Zw.g(str2);
                    da2.f25322a |= 536870912;
                    break;
                case 35:
                    da2.H = Zw.a(str2, str);
                    da2.f25322a |= FileSize.GB_COEFFICIENT;
                    break;
                case 36:
                    if (z11) {
                        if (str2.equals("currentColor")) {
                            da2.I = Vw.C2985h.a();
                        } else {
                            da2.I = Zw.d(str2);
                        }
                        da2.f25322a |= 2147483648L;
                        break;
                    }
                    break;
                case 37:
                    if (z11) {
                        da2.J = Zw.s(str2);
                        da2.f25322a |= 4294967296L;
                        break;
                    }
                    break;
                case 38:
                    if (str2.equals("currentColor")) {
                        da2.K = Vw.C2985h.a();
                    } else {
                        da2.K = Zw.d(str2);
                    }
                    da2.f25322a |= 8589934592L;
                    break;
                case 39:
                    da2.L = Zw.s(str2);
                    da2.f25322a |= 17179869184L;
                    break;
                case 40:
                    o oVarH = Zw.H(str2);
                    da2.M = oVarH;
                    if (oVarH != null) {
                        da2.f25322a |= 34359738368L;
                    }
                    break;
                case 41:
                    j jVarW = Zw.w(str2);
                    da2.N = jVarW;
                    if (jVarW != null) {
                        da2.f25322a |= 137438953472L;
                    }
                    break;
                case 42:
                    if (!z11) {
                        g gVarO = Zw.o(str2);
                        da2.O = gVarO;
                        if (gVarO != null) {
                            da2.f25322a |= 274877906944L;
                        }
                        break;
                    }
                    break;
                case 43:
                    if (!z11) {
                        b bVarA = b.a(str2);
                        da2.P = bVarA;
                        if (bVarA != null) {
                            da2.f25322a |= 549755813888L;
                        }
                        break;
                    }
                    break;
                case 44:
                    if (!z11) {
                        d dVarD = F3.d(str2);
                        da2.Q = dVarD;
                        if (dVarD != null) {
                            da2.f25322a |= 562949953421312L;
                        }
                        break;
                    }
                    break;
                case 45:
                    if (!z11) {
                        F3.a(da2, str2);
                        break;
                    }
                    break;
                case 46:
                    if (!z11) {
                        F3 f3F = F3.f(str2);
                        da2.R = f3F;
                        if (f3F != null) {
                            da2.f25322a |= 1099511627776L;
                        }
                        break;
                    }
                    break;
                case 47:
                    if (!z11) {
                        F3 f3H = F3.h(str2);
                        da2.S = f3H;
                        if (f3H != null) {
                            da2.f25322a |= 2199023255552L;
                        }
                        break;
                    }
                    break;
                case 48:
                    if (!z11) {
                        F3 f3E = F3.e(str2);
                        da2.T = f3E;
                        if (f3E != null) {
                            da2.f25322a |= 4398046511104L;
                        }
                        break;
                    }
                    break;
                case 49:
                    if (!z11) {
                        F3 f3G = F3.g(str2);
                        da2.U = f3G;
                        if (f3G != null) {
                            da2.f25322a |= 8796093022208L;
                        }
                        break;
                    }
                    break;
                case 50:
                    if (!z11) {
                        F3 f3B = F3.b(str2);
                        da2.V = f3B;
                        if (f3B != null) {
                            da2.f25322a |= 17592186044416L;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (!z11) {
                        F3 f3C = F3.c(str2);
                        da2.W = f3C;
                        if (f3C != null) {
                            da2.f25322a |= 35184372088832L;
                        }
                        break;
                    }
                    break;
                case 52:
                    if (!z11) {
                        G3 g3A = G3.a(str2);
                        da2.X = g3A;
                        if (g3A != null) {
                            da2.f25322a |= 1125899906842624L;
                        }
                        break;
                    }
                    break;
                case 53:
                    Vw.C2994q c2994qR = Zw.r(str2);
                    da2.f25325b0 = c2994qR;
                    if (c2994qR != null) {
                        da2.f25322a |= 4503599627370496L;
                    }
                    break;
                case 54:
                    Vw.C2994q c2994qR2 = Zw.r(str2);
                    da2.f25327c0 = c2994qR2;
                    if (c2994qR2 != null) {
                        da2.f25322a |= 9007199254740992L;
                    }
                    break;
            }
        } catch (Xw unused) {
        }
    }
}
