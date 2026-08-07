package l3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.r1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Ll3/m;", "Ll3/c;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "f", "(I)F", "e", "", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Lk3/p1;", "n", "(FFFFLl3/c;)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float[] f89558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float[] f89559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float[] f89560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float[] f89561i;

    static {
        float[] transform = a.INSTANCE.a().getTransform();
        k kVar = k.f89545a;
        float[] fArrL = d.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.e(transform, kVar.b().c(), kVar.e().c()));
        f89558f = fArrL;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f89559g = fArr;
        f89560h = d.k(fArrL);
        f89561i = d.k(fArr);
    }

    public m(String str, int i11) {
        super(str, b.INSTANCE.a(), i11, null);
    }

    @Override // l3.c
    public float[] b(float[] v11) {
        d.n(f89558f, v11);
        v11[0] = y4.b.a(v11[0]);
        v11[1] = y4.b.a(v11[1]);
        v11[2] = y4.b.a(v11[2]);
        d.n(f89559g, v11);
        return v11;
    }

    @Override // l3.c
    public float e(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // l3.c
    public float f(int component) {
        if (component == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return -0.5f;
    }

    @Override // l3.c
    public long j(float v11, float v12, float v13) {
        if (v11 < BitmapDescriptorFactory.HUE_RED) {
            v11 = 0.0f;
        }
        if (v11 > 1.0f) {
            v11 = 1.0f;
        }
        if (v12 < -0.5f) {
            v12 = -0.5f;
        }
        if (v12 > 0.5f) {
            v12 = 0.5f;
        }
        if (v13 < -0.5f) {
            v13 = -0.5f;
        }
        float f11 = v13 <= 0.5f ? v13 : 0.5f;
        float[] fArr = f89561i;
        float f12 = (fArr[0] * v11) + (fArr[3] * v12) + (fArr[6] * f11);
        float f13 = (fArr[1] * v11) + (fArr[4] * v12) + (fArr[7] * f11);
        float f14 = (fArr[2] * v11) + (fArr[5] * v12) + (fArr[8] * f11);
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float[] fArr2 = f89560h;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f15) + (fArr2[3] * f16)) + (fArr2[6] * f17))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f15) + (fArr2[4] * f16) + (fArr2[7] * f17))) & 4294967295L);
    }

    @Override // l3.c
    public float[] l(float[] v11) {
        float f11 = v11[0];
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        v11[0] = f11;
        float f12 = v11[1];
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 > 0.5f) {
            f12 = 0.5f;
        }
        v11[1] = f12;
        float f13 = v11[2];
        float f14 = f13 >= -0.5f ? f13 : -0.5f;
        v11[2] = f14 <= 0.5f ? f14 : 0.5f;
        d.n(f89561i, v11);
        float f15 = v11[0];
        v11[0] = f15 * f15 * f15;
        float f16 = v11[1];
        v11[1] = f16 * f16 * f16;
        float f17 = v11[2];
        v11[2] = f17 * f17 * f17;
        d.n(f89560h, v11);
        return v11;
    }

    @Override // l3.c
    public float m(float v11, float v12, float v13) {
        if (v11 < BitmapDescriptorFactory.HUE_RED) {
            v11 = 0.0f;
        }
        if (v11 > 1.0f) {
            v11 = 1.0f;
        }
        if (v12 < -0.5f) {
            v12 = -0.5f;
        }
        if (v12 > 0.5f) {
            v12 = 0.5f;
        }
        if (v13 < -0.5f) {
            v13 = -0.5f;
        }
        float f11 = v13 <= 0.5f ? v13 : 0.5f;
        float[] fArr = f89561i;
        float f12 = (fArr[0] * v11) + (fArr[3] * v12) + (fArr[6] * f11);
        float f13 = (fArr[1] * v11) + (fArr[4] * v12) + (fArr[7] * f11);
        float f14 = (fArr[2] * v11) + (fArr[5] * v12) + (fArr[8] * f11);
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = f89560h;
        return (fArr2[2] * f15) + (fArr2[5] * f16) + (fArr2[8] * f14 * f14 * f14);
    }

    @Override // l3.c
    public long n(float x11, float y11, float z11, float a11, c colorSpace) {
        float[] fArr = f89558f;
        float f11 = (fArr[0] * x11) + (fArr[3] * y11) + (fArr[6] * z11);
        float f12 = (fArr[1] * x11) + (fArr[4] * y11) + (fArr[7] * z11);
        float f13 = (fArr[2] * x11) + (fArr[5] * y11) + (fArr[8] * z11);
        float fA = y4.b.a(f11);
        float fA2 = y4.b.a(f12);
        float fA3 = y4.b.a(f13);
        float[] fArr2 = f89559g;
        return r1.a((fArr2[0] * fA) + (fArr2[3] * fA2) + (fArr2[6] * fA3), (fArr2[1] * fA) + (fArr2[4] * fA2) + (fArr2[7] * fA3), (fArr2[2] * fA) + (fArr2[5] * fA2) + (fArr2[8] * fA3), a11, colorSpace);
    }
}
