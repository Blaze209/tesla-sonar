package l3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.r1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Ll3/l;", "Ll3/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lk3/p1;", "n", "(FFFFLl3/c;)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends c {
    public l(String str, int i11) {
        super(str, b.INSTANCE.a(), i11, null);
    }

    @Override // l3.c
    public float[] b(float[] v11) {
        float f11 = v11[0];
        k kVar = k.f89545a;
        float f12 = f11 / kVar.c()[0];
        float f13 = v11[1] / kVar.c()[1];
        float f14 = v11[2] / kVar.c()[2];
        float fCbrt = f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
        float f15 = (116.0f * fCbrt2) - 16.0f;
        float f16 = (fCbrt - fCbrt2) * 500.0f;
        float f17 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f15 < BitmapDescriptorFactory.HUE_RED) {
            f15 = 0.0f;
        }
        if (f15 > 100.0f) {
            f15 = 100.0f;
        }
        v11[0] = f15;
        if (f16 < -128.0f) {
            f16 = -128.0f;
        }
        if (f16 > 128.0f) {
            f16 = 128.0f;
        }
        v11[1] = f16;
        if (f17 < -128.0f) {
            f17 = -128.0f;
        }
        v11[2] = f17 <= 128.0f ? f17 : 128.0f;
        return v11;
    }

    @Override // l3.c
    public float e(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // l3.c
    public float f(int component) {
        if (component == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return -128.0f;
    }

    @Override // l3.c
    public long j(float v11, float v12, float v13) {
        if (v11 < BitmapDescriptorFactory.HUE_RED) {
            v11 = 0.0f;
        }
        if (v11 > 100.0f) {
            v11 = 100.0f;
        }
        if (v12 < -128.0f) {
            v12 = -128.0f;
        }
        if (v12 > 128.0f) {
            v12 = 128.0f;
        }
        float f11 = (v11 + 16.0f) / 116.0f;
        float f12 = (v12 * 0.002f) + f11;
        float f13 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
        float f14 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        k kVar = k.f89545a;
        return (((long) Float.floatToRawIntBits(f14 * kVar.c()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f13 * kVar.c()[0])) << 32);
    }

    @Override // l3.c
    public float[] l(float[] v11) {
        float f11 = v11[0];
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            f11 = 0.0f;
        }
        if (f11 > 100.0f) {
            f11 = 100.0f;
        }
        v11[0] = f11;
        float f12 = v11[1];
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        v11[1] = f12;
        float f13 = v11[2];
        float f14 = f13 >= -128.0f ? f13 : -128.0f;
        float f15 = f14 <= 128.0f ? f14 : 128.0f;
        v11[2] = f15;
        float f16 = (f11 + 16.0f) / 116.0f;
        float f17 = (f12 * 0.002f) + f16;
        float f18 = f16 - (f15 * 0.005f);
        float f19 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        float f21 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
        float f22 = f18 > 0.20689656f ? f18 * f18 * f18 : (f18 - 0.13793103f) * 0.12841855f;
        k kVar = k.f89545a;
        v11[0] = f19 * kVar.c()[0];
        v11[1] = f21 * kVar.c()[1];
        v11[2] = f22 * kVar.c()[2];
        return v11;
    }

    @Override // l3.c
    public float m(float v11, float v12, float v13) {
        if (v11 < BitmapDescriptorFactory.HUE_RED) {
            v11 = 0.0f;
        }
        if (v11 > 100.0f) {
            v11 = 100.0f;
        }
        if (v13 < -128.0f) {
            v13 = -128.0f;
        }
        if (v13 > 128.0f) {
            v13 = 128.0f;
        }
        float f11 = ((v11 + 16.0f) / 116.0f) - (v13 * 0.005f);
        return (f11 > 0.20689656f ? f11 * f11 * f11 : 0.12841855f * (f11 - 0.13793103f)) * k.f89545a.c()[2];
    }

    @Override // l3.c
    public long n(float x11, float y11, float z11, float a11, c colorSpace) {
        k kVar = k.f89545a;
        float f11 = x11 / kVar.c()[0];
        float f12 = y11 / kVar.c()[1];
        float f13 = z11 / kVar.c()[2];
        float fCbrt = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f;
        float f14 = (116.0f * fCbrt2) - 16.0f;
        float f15 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f14 < BitmapDescriptorFactory.HUE_RED) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return r1.a(f14, f15, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, a11, colorSpace);
    }
}
