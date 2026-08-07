package ml;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f92317a = a.BITMAP_ONLY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f92318b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f92319c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92320d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f92321e = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f92322f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f92323g = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f92324h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f92325i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f92326j = false;

    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static e a(float f11) {
        return new e().p(f11);
    }

    private float[] e() {
        if (this.f92319c == null) {
            this.f92319c = new float[8];
        }
        return this.f92319c;
    }

    public int b() {
        return this.f92322f;
    }

    public float c() {
        return this.f92321e;
    }

    public float[] d() {
        return this.f92319c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f92318b == eVar.f92318b && this.f92320d == eVar.f92320d && Float.compare(eVar.f92321e, this.f92321e) == 0 && this.f92322f == eVar.f92322f && Float.compare(eVar.f92323g, this.f92323g) == 0 && this.f92317a == eVar.f92317a && this.f92324h == eVar.f92324h && this.f92325i == eVar.f92325i) {
            return Arrays.equals(this.f92319c, eVar.f92319c);
        }
        return false;
    }

    public int f() {
        return this.f92320d;
    }

    public float g() {
        return this.f92323g;
    }

    public boolean h() {
        return this.f92325i;
    }

    public int hashCode() {
        a aVar = this.f92317a;
        int iHashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f92318b ? 1 : 0)) * 31;
        float[] fArr = this.f92319c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f92320d) * 31;
        float f11 = this.f92321e;
        int iFloatToIntBits = (((iHashCode2 + (f11 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f11) : 0)) * 31) + this.f92322f) * 31;
        float f12 = this.f92323g;
        return ((((iFloatToIntBits + (f12 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f12) : 0)) * 31) + (this.f92324h ? 1 : 0)) * 31) + (this.f92325i ? 1 : 0);
    }

    public boolean i() {
        return this.f92326j;
    }

    public boolean j() {
        return this.f92318b;
    }

    public a k() {
        return this.f92317a;
    }

    public boolean l() {
        return this.f92324h;
    }

    public e m(int i11) {
        this.f92322f = i11;
        return this;
    }

    public e n(float f11) {
        k.c(f11 >= BitmapDescriptorFactory.HUE_RED, "the border width cannot be < 0");
        this.f92321e = f11;
        return this;
    }

    public e o(float f11, float f12, float f13, float f14) {
        float[] fArrE = e();
        fArrE[1] = f11;
        fArrE[0] = f11;
        fArrE[3] = f12;
        fArrE[2] = f12;
        fArrE[5] = f13;
        fArrE[4] = f13;
        fArrE[7] = f14;
        fArrE[6] = f14;
        return this;
    }

    public e p(float f11) {
        Arrays.fill(e(), f11);
        return this;
    }

    public e q(int i11) {
        this.f92320d = i11;
        this.f92317a = a.OVERLAY_COLOR;
        return this;
    }

    public e r(float f11) {
        k.c(f11 >= BitmapDescriptorFactory.HUE_RED, "the padding cannot be < 0");
        this.f92323g = f11;
        return this;
    }

    public e s(boolean z11) {
        this.f92325i = z11;
        return this;
    }

    public e t(boolean z11) {
        this.f92318b = z11;
        return this;
    }

    public e u(a aVar) {
        this.f92317a = aVar;
        return this;
    }
}
