package k3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.MutableRect;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001-B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0012\u0010\u001eJ+\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b#\u0010$J+\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b%\u0010$J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Lk3/n3;", "", "", "values", "b", "([F)[F", "Lj3/g;", "point", "g", "([FJ)J", "Lj3/i;", "rect", "h", "([FLj3/i;)Lj3/i;", "Lj3/e;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "([FLj3/e;)V", "m", "p", "([F[F)V", "", "q", "([F)Ljava/lang/String;", "f", "([F)V", "j", "", "degrees", "k", "([FF)V", "l", "x", "y", "z", "n", "([FFFF)V", "r", "", "e", "([F)I", "other", "", DateTokenConverter.CONVERTER_KEY, "([FLjava/lang/Object;)Z", "a", "[F", "getValues", "()[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float[] values;

    private /* synthetic */ n3(float[] fArr) {
        this.values = fArr;
    }

    public static final /* synthetic */ n3 a(float[] fArr) {
        return new n3(fArr);
    }

    public static /* synthetic */ float[] c(float[] fArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            fArr = new float[]{1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof n3) && p013kotlin.jvm.internal.s.f(fArr, ((n3) obj).getValues());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void f(float[] fArr) {
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        float f19 = fArr[8];
        float f21 = fArr[9];
        float f22 = fArr[10];
        float f23 = fArr[11];
        float f24 = fArr[12];
        float f25 = fArr[13];
        float f26 = fArr[14];
        float f27 = fArr[15];
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f11 * f17) - (f13 * f15);
        float f31 = (f11 * f18) - (f14 * f15);
        float f32 = (f12 * f17) - (f13 * f16);
        float f33 = (f12 * f18) - (f14 * f16);
        float f34 = (f13 * f18) - (f14 * f17);
        float f35 = (f19 * f25) - (f21 * f24);
        float f36 = (f19 * f26) - (f22 * f24);
        float f37 = (f19 * f27) - (f23 * f24);
        float f38 = (f21 * f26) - (f22 * f25);
        float f39 = (f21 * f27) - (f23 * f25);
        float f41 = (f22 * f27) - (f23 * f26);
        float f42 = (((((f28 * f41) - (f29 * f39)) + (f31 * f38)) + (f32 * f37)) - (f33 * f36)) + (f34 * f35);
        if (f42 == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f43 = 1.0f / f42;
        fArr[0] = (((f16 * f41) - (f17 * f39)) + (f18 * f38)) * f43;
        fArr[1] = ((((-f12) * f41) + (f13 * f39)) - (f14 * f38)) * f43;
        fArr[2] = (((f25 * f34) - (f26 * f33)) + (f27 * f32)) * f43;
        fArr[3] = ((((-f21) * f34) + (f22 * f33)) - (f23 * f32)) * f43;
        float f44 = -f15;
        fArr[4] = (((f44 * f41) + (f17 * f37)) - (f18 * f36)) * f43;
        fArr[5] = (((f41 * f11) - (f13 * f37)) + (f14 * f36)) * f43;
        float f45 = -f24;
        fArr[6] = (((f45 * f34) + (f26 * f31)) - (f27 * f29)) * f43;
        fArr[7] = (((f34 * f19) - (f22 * f31)) + (f23 * f29)) * f43;
        fArr[8] = (((f15 * f39) - (f16 * f37)) + (f18 * f35)) * f43;
        fArr[9] = ((((-f11) * f39) + (f37 * f12)) - (f14 * f35)) * f43;
        fArr[10] = (((f24 * f33) - (f25 * f31)) + (f27 * f28)) * f43;
        fArr[11] = ((((-f19) * f33) + (f31 * f21)) - (f23 * f28)) * f43;
        fArr[12] = (((f44 * f38) + (f16 * f36)) - (f17 * f35)) * f43;
        fArr[13] = (((f11 * f38) - (f12 * f36)) + (f13 * f35)) * f43;
        fArr[14] = (((f45 * f32) + (f25 * f29)) - (f26 * f28)) * f43;
        fArr[15] = (((f19 * f32) - (f21 * f29)) + (f22 * f28)) * f43;
    }

    public static final long g(float[] fArr, long j11) {
        float fM = j3.g.m(j11);
        float fN = j3.g.n(j11);
        float f11 = 1 / (((fArr[3] * fM) + (fArr[7] * fN)) + fArr[15]);
        if (Float.isInfinite(f11) || Float.isNaN(f11)) {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        return j3.h.a(((fArr[0] * fM) + (fArr[4] * fN) + fArr[12]) * f11, f11 * ((fArr[1] * fM) + (fArr[5] * fN) + fArr[13]));
    }

    public static final j3.i h(float[] fArr, j3.i iVar) {
        long jG = g(fArr, j3.h.a(iVar.getLeft(), iVar.getTop()));
        long jG2 = g(fArr, j3.h.a(iVar.getLeft(), iVar.getBottom()));
        long jG3 = g(fArr, j3.h.a(iVar.getRight(), iVar.getTop()));
        long jG4 = g(fArr, j3.h.a(iVar.getRight(), iVar.getBottom()));
        return new j3.i(Math.min(Math.min(j3.g.m(jG), j3.g.m(jG2)), Math.min(j3.g.m(jG3), j3.g.m(jG4))), Math.min(Math.min(j3.g.n(jG), j3.g.n(jG2)), Math.min(j3.g.n(jG3), j3.g.n(jG4))), Math.max(Math.max(j3.g.m(jG), j3.g.m(jG2)), Math.max(j3.g.m(jG3), j3.g.m(jG4))), Math.max(Math.max(j3.g.n(jG), j3.g.n(jG2)), Math.max(j3.g.n(jG3), j3.g.n(jG4))));
    }

    public static final void i(float[] fArr, MutableRect mutableRect) {
        long jG = g(fArr, j3.h.a(mutableRect.getLeft(), mutableRect.getTop()));
        long jG2 = g(fArr, j3.h.a(mutableRect.getLeft(), mutableRect.getBottom()));
        long jG3 = g(fArr, j3.h.a(mutableRect.getRight(), mutableRect.getTop()));
        long jG4 = g(fArr, j3.h.a(mutableRect.getRight(), mutableRect.getBottom()));
        mutableRect.i(Math.min(Math.min(j3.g.m(jG), j3.g.m(jG2)), Math.min(j3.g.m(jG3), j3.g.m(jG4))));
        mutableRect.k(Math.min(Math.min(j3.g.n(jG), j3.g.n(jG2)), Math.min(j3.g.n(jG3), j3.g.n(jG4))));
        mutableRect.j(Math.max(Math.max(j3.g.m(jG), j3.g.m(jG2)), Math.max(j3.g.m(jG3), j3.g.m(jG4))));
        mutableRect.h(Math.max(Math.max(j3.g.n(jG), j3.g.n(jG2)), Math.max(j3.g.n(jG3), j3.g.n(jG4))));
    }

    public static final void j(float[] fArr) {
        int i11 = 0;
        while (i11 < 4) {
            int i12 = 0;
            while (i12 < 4) {
                fArr[(i12 * 4) + i11] = i11 == i12 ? 1.0f : BitmapDescriptorFactory.HUE_RED;
                i12++;
            }
            i11++;
        }
    }

    public static final void k(float[] fArr, float f11) {
        double d11 = (((double) f11) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d11);
        float fSin = (float) Math.sin(d11);
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[9];
        float f17 = fArr[10];
        float f18 = fArr[13];
        float f19 = fArr[14];
        fArr[1] = (f12 * fCos) - (f13 * fSin);
        fArr[2] = (f12 * fSin) + (f13 * fCos);
        fArr[5] = (f14 * fCos) - (f15 * fSin);
        fArr[6] = (f14 * fSin) + (f15 * fCos);
        fArr[9] = (f16 * fCos) - (f17 * fSin);
        fArr[10] = (f16 * fSin) + (f17 * fCos);
        fArr[13] = (f18 * fCos) - (f19 * fSin);
        fArr[14] = (f18 * fSin) + (f19 * fCos);
    }

    public static final void l(float[] fArr, float f11) {
        double d11 = (((double) f11) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d11);
        float fSin = (float) Math.sin(d11);
        float f12 = fArr[0];
        float f13 = fArr[2];
        float f14 = fArr[4];
        float f15 = fArr[6];
        float f16 = fArr[8];
        float f17 = fArr[10];
        float f18 = fArr[12];
        float f19 = fArr[14];
        fArr[0] = (f12 * fCos) + (f13 * fSin);
        fArr[2] = ((-f12) * fSin) + (f13 * fCos);
        fArr[4] = (f14 * fCos) + (f15 * fSin);
        fArr[6] = ((-f14) * fSin) + (f15 * fCos);
        fArr[8] = (f16 * fCos) + (f17 * fSin);
        fArr[10] = ((-f16) * fSin) + (f17 * fCos);
        fArr[12] = (f18 * fCos) + (f19 * fSin);
        fArr[14] = ((-f18) * fSin) + (f19 * fCos);
    }

    public static final void m(float[] fArr, float f11) {
        double d11 = (((double) f11) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d11);
        float fSin = (float) Math.sin(d11);
        float f12 = fArr[0];
        float f13 = fArr[4];
        float f14 = (fCos * f12) + (fSin * f13);
        float f15 = -fSin;
        float f16 = fArr[1];
        float f17 = fArr[5];
        float f18 = (fCos * f16) + (fSin * f17);
        float f19 = fArr[2];
        float f21 = fArr[6];
        float f22 = (fCos * f19) + (fSin * f21);
        float f23 = fArr[3];
        float f24 = fArr[7];
        fArr[0] = f14;
        fArr[1] = f18;
        fArr[2] = f22;
        fArr[3] = (fCos * f23) + (fSin * f24);
        fArr[4] = (f12 * f15) + (f13 * fCos);
        fArr[5] = (f16 * f15) + (f17 * fCos);
        fArr[6] = (f19 * f15) + (f21 * fCos);
        fArr[7] = (f15 * f23) + (fCos * f24);
    }

    public static final void n(float[] fArr, float f11, float f12, float f13) {
        fArr[0] = fArr[0] * f11;
        fArr[1] = fArr[1] * f11;
        fArr[2] = fArr[2] * f11;
        fArr[3] = fArr[3] * f11;
        fArr[4] = fArr[4] * f12;
        fArr[5] = fArr[5] * f12;
        fArr[6] = fArr[6] * f12;
        fArr[7] = fArr[7] * f12;
        fArr[8] = fArr[8] * f13;
        fArr[9] = fArr[9] * f13;
        fArr[10] = fArr[10] * f13;
        fArr[11] = fArr[11] * f13;
    }

    public static /* synthetic */ void o(float[] fArr, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 1.0f;
        }
        n(fArr, f11, f12, f13);
    }

    public static final void p(float[] fArr, float[] fArr2) {
        float fB = o3.b(fArr, 0, fArr2, 0);
        float fB2 = o3.b(fArr, 0, fArr2, 1);
        float fB3 = o3.b(fArr, 0, fArr2, 2);
        float fB4 = o3.b(fArr, 0, fArr2, 3);
        float fB5 = o3.b(fArr, 1, fArr2, 0);
        float fB6 = o3.b(fArr, 1, fArr2, 1);
        float fB7 = o3.b(fArr, 1, fArr2, 2);
        float fB8 = o3.b(fArr, 1, fArr2, 3);
        float fB9 = o3.b(fArr, 2, fArr2, 0);
        float fB10 = o3.b(fArr, 2, fArr2, 1);
        float fB11 = o3.b(fArr, 2, fArr2, 2);
        float fB12 = o3.b(fArr, 2, fArr2, 3);
        float fB13 = o3.b(fArr, 3, fArr2, 0);
        float fB14 = o3.b(fArr, 3, fArr2, 1);
        float fB15 = o3.b(fArr, 3, fArr2, 2);
        float fB16 = o3.b(fArr, 3, fArr2, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }

    public static String q(float[] fArr) {
        return p013kotlin.text.t.n("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void r(float[] fArr, float f11, float f12, float f13) {
        float f14 = (fArr[0] * f11) + (fArr[4] * f12) + (fArr[8] * f13) + fArr[12];
        float f15 = (fArr[1] * f11) + (fArr[5] * f12) + (fArr[9] * f13) + fArr[13];
        float f16 = (fArr[2] * f11) + (fArr[6] * f12) + (fArr[10] * f13) + fArr[14];
        float f17 = (fArr[3] * f11) + (fArr[7] * f12) + (fArr[11] * f13) + fArr[15];
        fArr[12] = f14;
        fArr[13] = f15;
        fArr[14] = f16;
        fArr[15] = f17;
    }

    public static /* synthetic */ void s(float[] fArr, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        r(fArr, f11, f12, f13);
    }

    public boolean equals(Object obj) {
        return d(this.values, obj);
    }

    public int hashCode() {
        return e(this.values);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final /* synthetic */ float[] getValues() {
        return this.values;
    }

    public String toString() {
        return q(this.values);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }
}
