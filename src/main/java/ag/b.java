package ag;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f1003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f1011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f1012m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f11, a aVar, int i11, float f12, float f13, int i12, int i13, float f14, boolean z11, PointF pointF, PointF pointF2) {
        a(str, str2, f11, aVar, i11, f12, f13, i12, i13, f14, z11, pointF, pointF2);
    }

    public void a(String str, String str2, float f11, a aVar, int i11, float f12, float f13, int i12, int i13, float f14, boolean z11, PointF pointF, PointF pointF2) {
        this.f1000a = str;
        this.f1001b = str2;
        this.f1002c = f11;
        this.f1003d = aVar;
        this.f1004e = i11;
        this.f1005f = f12;
        this.f1006g = f13;
        this.f1007h = i12;
        this.f1008i = i13;
        this.f1009j = f14;
        this.f1010k = z11;
        this.f1011l = pointF;
        this.f1012m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f1000a.hashCode() * 31) + this.f1001b.hashCode()) * 31) + this.f1002c)) * 31) + this.f1003d.ordinal()) * 31) + this.f1004e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f1005f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f1007h;
    }

    public b() {
    }
}
