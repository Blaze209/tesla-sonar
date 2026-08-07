package k3;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Lk3/b1;", "Landroid/graphics/PorterDuff$Mode;", "c", "(I)Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/BlendMode;", "a", "(I)Landroid/graphics/BlendMode;", "b", "(Landroid/graphics/BlendMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84753a;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f84753a = iArr;
        }
    }

    public static final BlendMode a(int i11) {
        b1.Companion companion = b1.INSTANCE;
        if (b1.E(i11, companion.a())) {
            return BlendMode.CLEAR;
        }
        if (b1.E(i11, companion.x())) {
            return BlendMode.SRC;
        }
        if (b1.E(i11, companion.g())) {
            return BlendMode.DST;
        }
        if (b1.E(i11, companion.B())) {
            return BlendMode.SRC_OVER;
        }
        if (b1.E(i11, companion.k())) {
            return BlendMode.DST_OVER;
        }
        if (b1.E(i11, companion.z())) {
            return BlendMode.SRC_IN;
        }
        if (b1.E(i11, companion.i())) {
            return BlendMode.DST_IN;
        }
        if (b1.E(i11, companion.A())) {
            return BlendMode.SRC_OUT;
        }
        if (b1.E(i11, companion.j())) {
            return BlendMode.DST_OUT;
        }
        if (b1.E(i11, companion.y())) {
            return BlendMode.SRC_ATOP;
        }
        if (b1.E(i11, companion.h())) {
            return BlendMode.DST_ATOP;
        }
        if (b1.E(i11, companion.C())) {
            return BlendMode.XOR;
        }
        if (b1.E(i11, companion.t())) {
            return BlendMode.PLUS;
        }
        if (b1.E(i11, companion.q())) {
            return BlendMode.MODULATE;
        }
        if (b1.E(i11, companion.v())) {
            return BlendMode.SCREEN;
        }
        if (b1.E(i11, companion.s())) {
            return BlendMode.OVERLAY;
        }
        if (b1.E(i11, companion.e())) {
            return BlendMode.DARKEN;
        }
        if (b1.E(i11, companion.o())) {
            return BlendMode.LIGHTEN;
        }
        if (b1.E(i11, companion.d())) {
            return BlendMode.COLOR_DODGE;
        }
        if (b1.E(i11, companion.c())) {
            return BlendMode.COLOR_BURN;
        }
        if (b1.E(i11, companion.m())) {
            return BlendMode.HARD_LIGHT;
        }
        if (b1.E(i11, companion.w())) {
            return BlendMode.SOFT_LIGHT;
        }
        if (b1.E(i11, companion.f())) {
            return BlendMode.DIFFERENCE;
        }
        if (b1.E(i11, companion.l())) {
            return BlendMode.EXCLUSION;
        }
        if (b1.E(i11, companion.r())) {
            return BlendMode.MULTIPLY;
        }
        if (b1.E(i11, companion.n())) {
            return BlendMode.HUE;
        }
        if (b1.E(i11, companion.u())) {
            return BlendMode.SATURATION;
        }
        if (b1.E(i11, companion.b())) {
            return BlendMode.COLOR;
        }
        return b1.E(i11, companion.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final int b(BlendMode blendMode) {
        switch (a.f84753a[blendMode.ordinal()]) {
            case 1:
                return b1.INSTANCE.a();
            case 2:
                return b1.INSTANCE.x();
            case 3:
                return b1.INSTANCE.g();
            case 4:
                return b1.INSTANCE.B();
            case 5:
                return b1.INSTANCE.k();
            case 6:
                return b1.INSTANCE.z();
            case 7:
                return b1.INSTANCE.i();
            case 8:
                return b1.INSTANCE.A();
            case 9:
                return b1.INSTANCE.j();
            case 10:
                return b1.INSTANCE.y();
            case 11:
                return b1.INSTANCE.h();
            case 12:
                return b1.INSTANCE.C();
            case 13:
                return b1.INSTANCE.t();
            case 14:
                return b1.INSTANCE.q();
            case 15:
                return b1.INSTANCE.v();
            case 16:
                return b1.INSTANCE.s();
            case 17:
                return b1.INSTANCE.e();
            case 18:
                return b1.INSTANCE.o();
            case 19:
                return b1.INSTANCE.d();
            case 20:
                return b1.INSTANCE.c();
            case 21:
                return b1.INSTANCE.m();
            case 22:
                return b1.INSTANCE.w();
            case 23:
                return b1.INSTANCE.f();
            case 24:
                return b1.INSTANCE.l();
            case 25:
                return b1.INSTANCE.r();
            case 26:
                return b1.INSTANCE.n();
            case 27:
                return b1.INSTANCE.u();
            case 28:
                return b1.INSTANCE.b();
            case 29:
                return b1.INSTANCE.p();
            default:
                return b1.INSTANCE.B();
        }
    }

    public static final PorterDuff.Mode c(int i11) {
        b1.Companion companion = b1.INSTANCE;
        if (b1.E(i11, companion.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (b1.E(i11, companion.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (b1.E(i11, companion.g())) {
            return PorterDuff.Mode.DST;
        }
        if (b1.E(i11, companion.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (b1.E(i11, companion.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (b1.E(i11, companion.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (b1.E(i11, companion.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (b1.E(i11, companion.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (b1.E(i11, companion.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (b1.E(i11, companion.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (b1.E(i11, companion.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (b1.E(i11, companion.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (b1.E(i11, companion.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (b1.E(i11, companion.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (b1.E(i11, companion.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (b1.E(i11, companion.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (b1.E(i11, companion.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return b1.E(i11, companion.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
