package p016o2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.p1;
import k3.r1;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aø\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u001e\u0010)\u001a\u00020\u0000*\u00020%2\u0006\u0010(\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u001a\u0010+\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a&\u0010/\u001a\u00020\u0000*\u00020%2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-H\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u001e\u00101\u001a\u00020\u0000*\u00020%2\u0006\u0010.\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u001b\u00105\u001a\u00020\u0000*\u00020%2\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b5\u00106\" \u0010;\u001a\b\u0012\u0004\u0012\u00020%078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b9\u0010:\"\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020<078\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b=\u0010:\"\u0018\u00104\u001a\u00020\u0000*\u0002038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Lk3/p1;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", AppStateModule.APP_STATE_BACKGROUND, "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", AnalyticsAttribute.Error, "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "Lo2/i;", "g", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Lo2/i;", "backgroundColor", "b", "(Lo2/i;J)J", "c", "(JLr2/l;I)J", "Lw4/h;", "elevation", "a", "(Lo2/i;JFLr2/l;I)J", IntegerTokenConverter.CONVERTER_KEY, "(Lo2/i;F)J", "Lq2/b;", "value", DateTokenConverter.CONVERTER_KEY, "(Lo2/i;Lq2/b;)J", "Lr2/g2;", "Lr2/g2;", "e", "()Lr2/g2;", "LocalColorScheme", "", "getLocalTonalElevationEnabled", "LocalTonalElevationEnabled", "f", "(Lq2/b;Lr2/l;I)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<ColorScheme> f95941a = w.f(a.f95943c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g2<Boolean> f95942b = w.f(b.f95944c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo2/i;", "b", "()Lo2/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<ColorScheme> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f95943c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ColorScheme invoke() {
            return j.h(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f95944c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95945a;

        static {
            int[] iArr = new int[q2.b.values().length];
            try {
                iArr[q2.b.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q2.b.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q2.b.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q2.b.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q2.b.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q2.b.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q2.b.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q2.b.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q2.b.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[q2.b.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[q2.b.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[q2.b.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[q2.b.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[q2.b.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[q2.b.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[q2.b.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[q2.b.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[q2.b.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[q2.b.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[q2.b.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[q2.b.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[q2.b.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[q2.b.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[q2.b.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[q2.b.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[q2.b.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[q2.b.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[q2.b.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[q2.b.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[q2.b.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[q2.b.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[q2.b.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[q2.b.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[q2.b.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[q2.b.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[q2.b.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            f95945a = iArr;
        }
    }

    public static final long a(ColorScheme colorScheme, long j11, float f11, l lVar, int i11) {
        if (o.J()) {
            o.S(-1610977682, i11, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean zBooleanValue = ((Boolean) lVar.U(f95942b)).booleanValue();
        if (p1.r(j11, colorScheme.getSurface()) && zBooleanValue) {
            j11 = i(colorScheme, f11);
        }
        if (o.J()) {
            o.R();
        }
        return j11;
    }

    public static final long b(ColorScheme colorScheme, long j11) {
        if (p1.r(j11, colorScheme.getPrimary())) {
            return colorScheme.getOnPrimary();
        }
        if (p1.r(j11, colorScheme.getSecondary())) {
            return colorScheme.getOnSecondary();
        }
        if (p1.r(j11, colorScheme.getTertiary())) {
            return colorScheme.getOnTertiary();
        }
        if (p1.r(j11, colorScheme.getBackground())) {
            return colorScheme.getOnBackground();
        }
        if (p1.r(j11, colorScheme.getError())) {
            return colorScheme.getOnError();
        }
        if (p1.r(j11, colorScheme.getPrimaryContainer())) {
            return colorScheme.getOnPrimaryContainer();
        }
        if (p1.r(j11, colorScheme.getSecondaryContainer())) {
            return colorScheme.getOnSecondaryContainer();
        }
        if (p1.r(j11, colorScheme.getTertiaryContainer())) {
            return colorScheme.getOnTertiaryContainer();
        }
        if (p1.r(j11, colorScheme.getErrorContainer())) {
            return colorScheme.getOnErrorContainer();
        }
        if (p1.r(j11, colorScheme.getInverseSurface())) {
            return colorScheme.getInverseOnSurface();
        }
        if (p1.r(j11, colorScheme.getSurface())) {
            return colorScheme.getOnSurface();
        }
        if (p1.r(j11, colorScheme.getSurfaceVariant())) {
            return colorScheme.getOnSurfaceVariant();
        }
        if (p1.r(j11, colorScheme.getSurfaceBright())) {
            return colorScheme.getOnSurface();
        }
        if (p1.r(j11, colorScheme.getSurfaceContainer())) {
            return colorScheme.getOnSurface();
        }
        if (p1.r(j11, colorScheme.getSurfaceContainerHigh())) {
            return colorScheme.getOnSurface();
        }
        if (p1.r(j11, colorScheme.getSurfaceContainerHighest())) {
            return colorScheme.getOnSurface();
        }
        if (p1.r(j11, colorScheme.getSurfaceContainerLow())) {
            return colorScheme.getOnSurface();
        }
        return p1.r(j11, colorScheme.getSurfaceContainerLowest()) ? colorScheme.getOnSurface() : p1.INSTANCE.j();
    }

    public static final long c(long j11, l lVar, int i11) {
        if (o.J()) {
            o.S(509589638, i11, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        lVar.o(-1680936624);
        long jB = b(t.f96158a.a(lVar, 6), j11);
        if (jB == 16) {
            jB = ((p1) lVar.U(m.a())).getValue();
        }
        lVar.l();
        if (o.J()) {
            o.R();
        }
        return jB;
    }

    public static final long d(ColorScheme colorScheme, q2.b bVar) {
        switch (c.f95945a[bVar.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case 6:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case 10:
                return colorScheme.getOnPrimary();
            case 11:
                return colorScheme.getOnPrimaryContainer();
            case 12:
                return colorScheme.getOnSecondary();
            case 13:
                return colorScheme.getOnSecondaryContainer();
            case 14:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case 20:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case 28:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case 30:
                return colorScheme.getSurfaceContainerHigh();
            case 31:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case 33:
                return colorScheme.getSurfaceContainerLowest();
            case 34:
                return colorScheme.getSurfaceDim();
            case 35:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            default:
                return p1.INSTANCE.j();
        }
    }

    public static final g2<ColorScheme> e() {
        return f95941a;
    }

    public static final long f(q2.b bVar, l lVar, int i11) {
        if (o.J()) {
            o.S(-810780884, i11, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long jD = d(t.f96158a.a(lVar, 6), bVar);
        if (o.J()) {
            o.R();
        }
        return jD;
    }

    public static final ColorScheme g(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49) {
        return new ColorScheme(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j26, j27, j28, j29, j31, j32, j33, j34, j35, j36, j37, j38, j39, j41, j42, j43, j49, j44, j45, j46, j47, j48, null);
    }

    public static /* synthetic */ ColorScheme h(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, int i11, int i12, Object obj) {
        long jT = (i11 & 1) != 0 ? q2.a.f104379a.t() : j11;
        long j51 = (i11 & 2) != 0 ? q2.a.f104379a.j() : j12;
        long jU = (i11 & 4) != 0 ? q2.a.f104379a.u() : j13;
        long jK = (i11 & 8) != 0 ? q2.a.f104379a.k() : j14;
        long jE = (i11 & 16) != 0 ? q2.a.f104379a.e() : j15;
        long jW = (i11 & 32) != 0 ? q2.a.f104379a.w() : j16;
        long jL = (i11 & 64) != 0 ? q2.a.f104379a.l() : j17;
        long jX = (i11 & 128) != 0 ? q2.a.f104379a.x() : j18;
        long j52 = jT;
        long jM = (i11 & 256) != 0 ? q2.a.f104379a.m() : j19;
        long jH = (i11 & 512) != 0 ? q2.a.f104379a.H() : j21;
        long jP = (i11 & 1024) != 0 ? q2.a.f104379a.p() : j22;
        long jI = (i11 & 2048) != 0 ? q2.a.f104379a.I() : j23;
        long jQ = (i11 & 4096) != 0 ? q2.a.f104379a.q() : j24;
        long jA = (i11 & PKIFailureInfo.certRevoked) != 0 ? q2.a.f104379a.a() : j25;
        long jG = (i11 & 16384) != 0 ? q2.a.f104379a.g() : j26;
        long jY = (i11 & 32768) != 0 ? q2.a.f104379a.y() : j27;
        long jN = (i11 & 65536) != 0 ? q2.a.f104379a.n() : j28;
        long jG2 = (i11 & 131072) != 0 ? q2.a.f104379a.G() : j29;
        long jO = (i11 & 262144) != 0 ? q2.a.f104379a.o() : j31;
        long j53 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? j52 : j32;
        long jF = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? q2.a.f104379a.f() : j33;
        long jD = (i11 & PKIFailureInfo.badSenderNonce) != 0 ? q2.a.f104379a.d() : j34;
        long jB = (i11 & 4194304) != 0 ? q2.a.f104379a.b() : j35;
        long jH2 = (i11 & 8388608) != 0 ? q2.a.f104379a.h() : j36;
        long jC = (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? q2.a.f104379a.c() : j37;
        long jI2 = (i11 & 33554432) != 0 ? q2.a.f104379a.i() : j38;
        long jR = (i11 & 67108864) != 0 ? q2.a.f104379a.r() : j39;
        long jS = (i11 & 134217728) != 0 ? q2.a.f104379a.s() : j41;
        long jV = (i11 & 268435456) != 0 ? q2.a.f104379a.v() : j42;
        long jZ = (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? q2.a.f104379a.z() : j43;
        long jA2 = (i11 & 1073741824) != 0 ? q2.a.f104379a.A() : j44;
        long jB2 = (i11 & Integer.MIN_VALUE) != 0 ? q2.a.f104379a.B() : j45;
        long jC2 = (i12 & 1) != 0 ? q2.a.f104379a.C() : j46;
        long jD2 = (i12 & 2) != 0 ? q2.a.f104379a.D() : j47;
        long jE2 = (i12 & 4) != 0 ? q2.a.f104379a.E() : j48;
        if ((i12 & 8) != 0) {
            j49 = q2.a.f104379a.F();
        }
        return g(j52, j51, jU, jK, jE, jW, jL, jX, jM, jH, jP, jI, jQ, jA, jG, jY, jN, jG2, jO, j53, jF, jD, jB, jH2, jC, jI2, jR, jS, jV, jZ, jA2, jB2, jC2, jD2, jE2, j49);
    }

    public static final long i(ColorScheme colorScheme, float f11) {
        if (h.i(f11, h.g(0))) {
            return colorScheme.getSurface();
        }
        return r1.h(p1.p(colorScheme.getSurfaceTint(), ((((float) Math.log(f11 + 1)) * 4.5f) + 2.0f) / 100.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), colorScheme.getSurface());
    }
}
