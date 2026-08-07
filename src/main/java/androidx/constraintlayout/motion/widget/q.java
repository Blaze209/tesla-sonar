package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
class q implements Comparable<q> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static String[] f6712t = {"position", "x", "y", Snapshot.WIDTH, Snapshot.HEIGHT, "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b5.c f6713a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f6715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f6716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f6717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f6718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f6719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f6720h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f6723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f6724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f6725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    m f6726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f6727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f6728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f6729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    double[] f6730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    double[] f6731s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6714b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f6721i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f6722j = Float.NaN;

    q() {
        int i11 = d.f6477f;
        this.f6723k = i11;
        this.f6724l = i11;
        this.f6725m = Float.NaN;
        this.f6726n = null;
        this.f6727o = new LinkedHashMap<>();
        this.f6728p = 0;
        this.f6730r = new double[18];
        this.f6731s = new double[18];
    }

    private boolean c(float f11, float f12) {
        if (Float.isNaN(f11) || Float.isNaN(f12)) {
            return Float.isNaN(f11) != Float.isNaN(f12);
        }
        return Math.abs(f11 - f12) > 1.0E-6f;
    }

    public void a(androidx.constraintlayout.widget.d.a aVar) {
        this.f6713a = b5.c.c(aVar.f6990d.f7055d);
        androidx.constraintlayout.widget.d.c cVar = aVar.f6990d;
        this.f6723k = cVar.f7056e;
        this.f6724l = cVar.f7053b;
        this.f6721i = cVar.f7060i;
        this.f6714b = cVar.f7057f;
        this.f6729q = cVar.f7054c;
        this.f6722j = aVar.f6989c.f7070e;
        this.f6725m = aVar.f6991e.D;
        for (String str : aVar.f6993g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f6993g.get(str);
            if (aVar2 != null && aVar2.g()) {
                this.f6727o.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull q qVar) {
        return Float.compare(this.f6716d, qVar.f6716d);
    }

    void d(q qVar, boolean[] zArr, String[] strArr, boolean z11) {
        boolean zC = c(this.f6717e, qVar.f6717e);
        boolean zC2 = c(this.f6718f, qVar.f6718f);
        zArr[0] = zArr[0] | c(this.f6716d, qVar.f6716d);
        boolean z12 = zC | zC2 | z11;
        zArr[1] = zArr[1] | z12;
        zArr[2] = z12 | zArr[2];
        zArr[3] = zArr[3] | c(this.f6719g, qVar.f6719g);
        zArr[4] = c(this.f6720h, qVar.f6720h) | zArr[4];
    }

    void e(double[] dArr, int[] iArr) {
        float[] fArr = {this.f6716d, this.f6717e, this.f6718f, this.f6719g, this.f6720h, this.f6721i};
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 < 6) {
                dArr[i11] = fArr[i12];
                i11++;
            }
        }
    }

    void f(double d11, int[] iArr, double[] dArr, float[] fArr, int i11) {
        float fSin = this.f6717e;
        float fCos = this.f6718f;
        float f11 = this.f6719g;
        float f12 = this.f6720h;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f13 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                fSin = f13;
            } else if (i13 == 2) {
                fCos = f13;
            } else if (i13 == 3) {
                f11 = f13;
            } else if (i13 == 4) {
                f12 = f13;
            }
        }
        m mVar = this.f6726n;
        if (mVar != null) {
            float[] fArr2 = new float[2];
            mVar.i(d11, fArr2, new float[2]);
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d12 = f14;
            double d13 = fSin;
            double d14 = fCos;
            fSin = (float) ((d12 + (Math.sin(d14) * d13)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f15) - (d13 * Math.cos(d14))) - ((double) (f12 / 2.0f)));
        }
        fArr[i11] = fSin + (f11 / 2.0f) + BitmapDescriptorFactory.HUE_RED;
        fArr[i11 + 1] = fCos + (f12 / 2.0f) + BitmapDescriptorFactory.HUE_RED;
    }

    void g(double d11, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f11;
        float fSin = this.f6717e;
        float fCos = this.f6718f;
        float f12 = this.f6719g;
        float f13 = this.f6720h;
        float f14 = BitmapDescriptorFactory.HUE_RED;
        float f15 = BitmapDescriptorFactory.HUE_RED;
        float f16 = BitmapDescriptorFactory.HUE_RED;
        float f17 = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f18 = (float) dArr[i11];
            float f19 = (float) dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f18;
                f14 = f19;
            } else if (i12 == 2) {
                fCos = f18;
                f16 = f19;
            } else if (i12 == 3) {
                f12 = f18;
                f15 = f19;
            } else if (i12 == 4) {
                f13 = f18;
                f17 = f19;
            }
        }
        float f21 = (f15 / 2.0f) + f14;
        float fCos2 = (f17 / 2.0f) + f16;
        m mVar = this.f6726n;
        if (mVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            mVar.i(d11, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            f11 = 2.0f;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((((double) f22) + (Math.sin(d13) * d12)) - ((double) (f12 / 2.0f)));
            fCos = (float) ((((double) f23) - (Math.cos(d13) * d12)) - ((double) (f13 / 2.0f)));
            double d14 = f14;
            double dSin = ((double) f24) + (Math.sin(d13) * d14);
            double d15 = f16;
            float fCos3 = (float) (dSin + (Math.cos(d13) * d15));
            fCos2 = (float) ((((double) f25) - (d14 * Math.cos(d13))) + (Math.sin(d13) * d15));
            f21 = fCos3;
        } else {
            f11 = 2.0f;
        }
        fArr[0] = fSin + (f12 / f11) + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = fCos + (f13 / f11) + BitmapDescriptorFactory.HUE_RED;
        fArr2[0] = f21;
        fArr2[1] = fCos2;
    }

    int h(String str, double[] dArr, int i11) {
        androidx.constraintlayout.widget.a aVar = this.f6727o.get(str);
        int i12 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.h() == 1) {
            dArr[i11] = aVar.e();
            return 1;
        }
        int iH = aVar.h();
        float[] fArr = new float[iH];
        aVar.f(fArr);
        while (i12 < iH) {
            dArr[i11] = fArr[i12];
            i12++;
            i11++;
        }
        return iH;
    }

    int i(String str) {
        androidx.constraintlayout.widget.a aVar = this.f6727o.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.h();
    }

    void j(int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.f6717e;
        float fCos = this.f6718f;
        float f12 = this.f6719g;
        float f13 = this.f6720h;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f14 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f11 = f14;
            } else if (i13 == 2) {
                fCos = f14;
            } else if (i13 == 3) {
                f12 = f14;
            } else if (i13 == 4) {
                f13 = f14;
            }
        }
        m mVar = this.f6726n;
        if (mVar != null) {
            float fJ = mVar.j();
            float fK = this.f6726n.k();
            double d11 = f11;
            double d12 = fCos;
            float fSin = (float) ((((double) fJ) + (Math.sin(d12) * d11)) - ((double) (f12 / 2.0f)));
            fCos = (float) ((((double) fK) - (d11 * Math.cos(d12))) - ((double) (f13 / 2.0f)));
            f11 = fSin;
        }
        float f15 = f12 + f11;
        float f16 = f13 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f17 = f11 + BitmapDescriptorFactory.HUE_RED;
        float f18 = fCos + BitmapDescriptorFactory.HUE_RED;
        float f19 = f15 + BitmapDescriptorFactory.HUE_RED;
        float f21 = fCos + BitmapDescriptorFactory.HUE_RED;
        float f22 = f15 + BitmapDescriptorFactory.HUE_RED;
        float f23 = f16 + BitmapDescriptorFactory.HUE_RED;
        float f24 = f11 + BitmapDescriptorFactory.HUE_RED;
        float f25 = f16 + BitmapDescriptorFactory.HUE_RED;
        fArr[i11] = f17;
        fArr[i11 + 1] = f18;
        fArr[i11 + 2] = f19;
        fArr[i11 + 3] = f21;
        fArr[i11 + 4] = f22;
        fArr[i11 + 5] = f23;
        fArr[i11 + 6] = f24;
        fArr[i11 + 7] = f25;
    }

    boolean k(String str) {
        return this.f6727o.containsKey(str);
    }

    void l(h hVar, q qVar, q qVar2) {
        float f11 = hVar.f6478a / 100.0f;
        this.f6715c = f11;
        this.f6714b = hVar.f6526j;
        float f12 = Float.isNaN(hVar.f6527k) ? f11 : hVar.f6527k;
        float f13 = Float.isNaN(hVar.f6528l) ? f11 : hVar.f6528l;
        float f14 = qVar2.f6719g;
        float f15 = qVar.f6719g;
        float f16 = f14 - f15;
        float f17 = qVar2.f6720h;
        float f18 = qVar.f6720h;
        float f19 = f17 - f18;
        this.f6716d = this.f6715c;
        float f21 = qVar.f6717e;
        float f22 = (f15 / 2.0f) + f21;
        float f23 = qVar.f6718f;
        float f24 = f23 + (f18 / 2.0f);
        float f25 = f11;
        float f26 = qVar2.f6717e + (f14 / 2.0f);
        float f27 = qVar2.f6718f + (f17 / 2.0f);
        if (f22 > f26) {
            f22 = f26;
            f26 = f22;
        }
        if (f24 <= f27) {
            f24 = f27;
            f27 = f24;
        }
        float f28 = f26 - f22;
        float f29 = f24 - f27;
        float f31 = f16 * f12;
        float f32 = f31 / 2.0f;
        this.f6717e = (int) ((f21 + (f28 * f25)) - f32);
        float f33 = f19 * f13;
        float f34 = f33 / 2.0f;
        this.f6718f = (int) ((f23 + (f29 * f25)) - f34);
        this.f6719g = (int) (f15 + f31);
        this.f6720h = (int) (f18 + f33);
        float f35 = Float.isNaN(hVar.f6529m) ? f25 : hVar.f6529m;
        boolean zIsNaN = Float.isNaN(hVar.f6532p);
        float f36 = BitmapDescriptorFactory.HUE_RED;
        float f37 = zIsNaN ? 0.0f : hVar.f6532p;
        if (!Float.isNaN(hVar.f6530n)) {
            f25 = hVar.f6530n;
        }
        if (!Float.isNaN(hVar.f6531o)) {
            f36 = hVar.f6531o;
        }
        this.f6728p = 0;
        this.f6717e = (int) (((qVar.f6717e + (f35 * f28)) + (f36 * f29)) - f32);
        this.f6718f = (int) (((qVar.f6718f + (f28 * f37)) + (f29 * f25)) - f34);
        this.f6713a = b5.c.c(hVar.f6524h);
        this.f6723k = hVar.f6525i;
    }

    void m(h hVar, q qVar, q qVar2) {
        float f11 = hVar.f6478a / 100.0f;
        this.f6715c = f11;
        this.f6714b = hVar.f6526j;
        float f12 = Float.isNaN(hVar.f6527k) ? f11 : hVar.f6527k;
        float f13 = Float.isNaN(hVar.f6528l) ? f11 : hVar.f6528l;
        float f14 = qVar2.f6719g;
        float f15 = qVar.f6719g;
        float f16 = qVar2.f6720h;
        float f17 = qVar.f6720h;
        this.f6716d = this.f6715c;
        float f18 = qVar.f6717e;
        float f19 = qVar.f6718f;
        float f21 = f11;
        float f22 = (qVar2.f6717e + (f14 / 2.0f)) - ((f15 / 2.0f) + f18);
        float f23 = (qVar2.f6718f + (f16 / 2.0f)) - (f19 + (f17 / 2.0f));
        float f24 = (f14 - f15) * f12;
        float f25 = f24 / 2.0f;
        this.f6717e = (int) ((f18 + (f22 * f21)) - f25);
        float f26 = (f16 - f17) * f13;
        float f27 = f26 / 2.0f;
        this.f6718f = (int) ((f19 + (f23 * f21)) - f27);
        this.f6719g = (int) (f15 + f24);
        this.f6720h = (int) (f17 + f26);
        float f28 = Float.isNaN(hVar.f6529m) ? f21 : hVar.f6529m;
        boolean zIsNaN = Float.isNaN(hVar.f6532p);
        float f29 = BitmapDescriptorFactory.HUE_RED;
        float f31 = zIsNaN ? 0.0f : hVar.f6532p;
        if (!Float.isNaN(hVar.f6530n)) {
            f21 = hVar.f6530n;
        }
        if (!Float.isNaN(hVar.f6531o)) {
            f29 = hVar.f6531o;
        }
        this.f6728p = 0;
        this.f6717e = (int) (((qVar.f6717e + (f28 * f22)) + (f29 * f23)) - f25);
        this.f6718f = (int) (((qVar.f6718f + (f22 * f31)) + (f23 * f21)) - f27);
        this.f6713a = b5.c.c(hVar.f6524h);
        this.f6723k = hVar.f6525i;
    }

    void n(h hVar, q qVar, q qVar2) {
        float f11 = hVar.f6478a / 100.0f;
        this.f6715c = f11;
        this.f6714b = hVar.f6526j;
        float f12 = Float.isNaN(hVar.f6527k) ? f11 : hVar.f6527k;
        float f13 = Float.isNaN(hVar.f6528l) ? f11 : hVar.f6528l;
        float f14 = qVar2.f6719g - qVar.f6719g;
        float f15 = qVar2.f6720h - qVar.f6720h;
        this.f6716d = this.f6715c;
        if (!Float.isNaN(hVar.f6529m)) {
            f11 = hVar.f6529m;
        }
        float f16 = qVar.f6717e;
        float f17 = qVar.f6719g;
        float f18 = qVar.f6718f;
        float f19 = qVar.f6720h;
        float f21 = f11;
        float f22 = (qVar2.f6717e + (qVar2.f6719g / 2.0f)) - ((f17 / 2.0f) + f16);
        float f23 = (qVar2.f6718f + (qVar2.f6720h / 2.0f)) - ((f19 / 2.0f) + f18);
        float f24 = f22 * f21;
        float f25 = f14 * f12;
        float f26 = f25 / 2.0f;
        this.f6717e = (int) ((f16 + f24) - f26);
        float f27 = f23 * f21;
        float f28 = f15 * f13;
        float f29 = f28 / 2.0f;
        this.f6718f = (int) ((f18 + f27) - f29);
        this.f6719g = (int) (f17 + f25);
        this.f6720h = (int) (f19 + f28);
        float f31 = Float.isNaN(hVar.f6530n) ? BitmapDescriptorFactory.HUE_RED : hVar.f6530n;
        this.f6728p = 1;
        float f32 = (int) ((qVar.f6717e + f24) - f26);
        float f33 = (int) ((qVar.f6718f + f27) - f29);
        this.f6717e = f32 + ((-f23) * f31);
        this.f6718f = f33 + (f22 * f31);
        this.f6724l = this.f6724l;
        this.f6713a = b5.c.c(hVar.f6524h);
        this.f6723k = hVar.f6525i;
    }

    void o(int i11, int i12, h hVar, q qVar, q qVar2) {
        float fMin;
        float f11;
        float f12 = hVar.f6478a / 100.0f;
        this.f6715c = f12;
        this.f6714b = hVar.f6526j;
        this.f6728p = hVar.f6533q;
        float f13 = Float.isNaN(hVar.f6527k) ? f12 : hVar.f6527k;
        float f14 = Float.isNaN(hVar.f6528l) ? f12 : hVar.f6528l;
        float f15 = qVar2.f6719g;
        float f16 = qVar.f6719g;
        float f17 = qVar2.f6720h;
        float f18 = qVar.f6720h;
        this.f6716d = this.f6715c;
        this.f6719g = (int) (f16 + ((f15 - f16) * f13));
        this.f6720h = (int) (f18 + ((f17 - f18) * f14));
        if (hVar.f6533q != 2) {
            float f19 = Float.isNaN(hVar.f6529m) ? f12 : hVar.f6529m;
            float f21 = qVar2.f6717e;
            float f22 = qVar.f6717e;
            this.f6717e = (f19 * (f21 - f22)) + f22;
            if (!Float.isNaN(hVar.f6530n)) {
                f12 = hVar.f6530n;
            }
            float f23 = qVar2.f6718f;
            float f24 = qVar.f6718f;
            this.f6718f = (f12 * (f23 - f24)) + f24;
        } else {
            if (Float.isNaN(hVar.f6529m)) {
                float f25 = qVar2.f6717e;
                float f26 = qVar.f6717e;
                fMin = ((f25 - f26) * f12) + f26;
            } else {
                fMin = Math.min(f14, f13) * hVar.f6529m;
            }
            this.f6717e = fMin;
            if (Float.isNaN(hVar.f6530n)) {
                float f27 = qVar2.f6718f;
                float f28 = qVar.f6718f;
                f11 = (f12 * (f27 - f28)) + f28;
            } else {
                f11 = hVar.f6530n;
            }
            this.f6718f = f11;
        }
        this.f6724l = qVar.f6724l;
        this.f6713a = b5.c.c(hVar.f6524h);
        this.f6723k = hVar.f6525i;
    }

    void p(int i11, int i12, h hVar, q qVar, q qVar2) {
        float f11 = hVar.f6478a / 100.0f;
        this.f6715c = f11;
        this.f6714b = hVar.f6526j;
        float f12 = Float.isNaN(hVar.f6527k) ? f11 : hVar.f6527k;
        float f13 = Float.isNaN(hVar.f6528l) ? f11 : hVar.f6528l;
        float f14 = qVar2.f6719g;
        float f15 = qVar.f6719g;
        float f16 = qVar2.f6720h;
        float f17 = qVar.f6720h;
        this.f6716d = this.f6715c;
        float f18 = qVar.f6717e;
        float f19 = qVar.f6718f;
        float f21 = qVar2.f6717e + (f14 / 2.0f);
        float f22 = qVar2.f6718f + (f16 / 2.0f);
        float f23 = (f14 - f15) * f12;
        this.f6717e = (int) ((f18 + ((f21 - ((f15 / 2.0f) + f18)) * f11)) - (f23 / 2.0f));
        float f24 = (f16 - f17) * f13;
        this.f6718f = (int) ((f19 + ((f22 - (f19 + (f17 / 2.0f))) * f11)) - (f24 / 2.0f));
        this.f6719g = (int) (f15 + f23);
        this.f6720h = (int) (f17 + f24);
        this.f6728p = 2;
        if (!Float.isNaN(hVar.f6529m)) {
            this.f6717e = (int) (hVar.f6529m * (i11 - ((int) this.f6719g)));
        }
        if (!Float.isNaN(hVar.f6530n)) {
            this.f6718f = (int) (hVar.f6530n * (i12 - ((int) this.f6720h)));
        }
        this.f6724l = this.f6724l;
        this.f6713a = b5.c.c(hVar.f6524h);
        this.f6723k = hVar.f6525i;
    }

    void q(float f11, float f12, float f13, float f14) {
        this.f6717e = f11;
        this.f6718f = f12;
        this.f6719g = f13;
        this.f6720h = f14;
    }

    void r(float f11, float f12, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f17 = (float) dArr[i11];
            double d11 = dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f13 = f17;
            } else if (i12 == 2) {
                f15 = f17;
            } else if (i12 == 3) {
                f14 = f17;
            } else if (i12 == 4) {
                f16 = f17;
            }
        }
        float f18 = f13 - ((BitmapDescriptorFactory.HUE_RED * f14) / 2.0f);
        float f19 = f15 - ((BitmapDescriptorFactory.HUE_RED * f16) / 2.0f);
        fArr[0] = (f18 * (1.0f - f11)) + (((f14 * 1.0f) + f18) * f11) + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = (f19 * (1.0f - f12)) + (((f16 * 1.0f) + f19) * f12) + BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void s(float f11, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z11) {
        float f12;
        float fSin = this.f6717e;
        float fCos = this.f6718f;
        float f13 = this.f6719g;
        float f14 = this.f6720h;
        if (iArr.length != 0 && this.f6730r.length <= iArr[iArr.length - 1]) {
            int i11 = iArr[iArr.length - 1] + 1;
            this.f6730r = new double[i11];
            this.f6731s = new double[i11];
        }
        Arrays.fill(this.f6730r, Double.NaN);
        for (int i12 = 0; i12 < iArr.length; i12++) {
            double[] dArr4 = this.f6730r;
            int i13 = iArr[i12];
            dArr4[i13] = dArr[i12];
            this.f6731s[i13] = dArr2[i12];
        }
        float f15 = Float.NaN;
        int i14 = 0;
        float f16 = BitmapDescriptorFactory.HUE_RED;
        float f17 = BitmapDescriptorFactory.HUE_RED;
        float f18 = BitmapDescriptorFactory.HUE_RED;
        float f19 = BitmapDescriptorFactory.HUE_RED;
        while (true) {
            double[] dArr5 = this.f6730r;
            if (i14 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i14]) && (dArr3 == null || dArr3[i14] == 0.0d)) {
                f12 = f15;
            } else {
                double d11 = dArr3 != null ? dArr3[i14] : 0.0d;
                if (!Double.isNaN(this.f6730r[i14])) {
                    d11 = this.f6730r[i14] + d11;
                }
                f12 = f15;
                float f21 = (float) d11;
                float f22 = (float) this.f6731s[i14];
                if (i14 == 1) {
                    f15 = f12;
                    f16 = f22;
                    fSin = f21;
                } else if (i14 == 2) {
                    f15 = f12;
                    f17 = f22;
                    fCos = f21;
                } else if (i14 == 3) {
                    f15 = f12;
                    f18 = f22;
                    f13 = f21;
                } else if (i14 == 4) {
                    f15 = f12;
                    f19 = f22;
                    f14 = f21;
                } else if (i14 == 5) {
                    f15 = f21;
                }
                i14++;
            }
            f15 = f12;
            i14++;
        }
        float f23 = f15;
        m mVar = this.f6726n;
        if (mVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            mVar.i(f11, fArr, fArr2);
            float f24 = fArr[0];
            float f25 = fArr[1];
            float f26 = fArr2[0];
            float f27 = fArr2[1];
            double d12 = f24;
            double d13 = fSin;
            double d14 = fCos;
            fSin = (float) ((d12 + (Math.sin(d14) * d13)) - ((double) (f13 / 2.0f)));
            fCos = (float) ((((double) f25) - (Math.cos(d14) * d13)) - ((double) (f14 / 2.0f)));
            double d15 = f26;
            double d16 = f16;
            double dSin = d15 + (Math.sin(d14) * d16);
            double dCos = Math.cos(d14) * d13;
            double d17 = f17;
            float f28 = (float) (dSin + (dCos * d17));
            float fCos2 = (float) ((((double) f27) - (d16 * Math.cos(d14))) + (Math.sin(d14) * d13 * d17));
            if (dArr2.length >= 2) {
                dArr2[0] = f28;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f23)) {
                view.setRotation((float) (((double) f23) + Math.toDegrees(Math.atan2(fCos2, f28))));
            }
        } else if (!Float.isNaN(f23)) {
            view.setRotation(f23 + ((float) Math.toDegrees(Math.atan2(f17 + (f19 / 2.0f), f16 + (f18 / 2.0f)))) + BitmapDescriptorFactory.HUE_RED);
        }
        if (view instanceof c) {
            ((c) view).a(fSin, fCos, f13 + fSin, f14 + fCos);
            return;
        }
        float f29 = fSin + 0.5f;
        int i15 = (int) f29;
        float f31 = fCos + 0.5f;
        int i16 = (int) f31;
        int i17 = (int) (f29 + f13);
        int i18 = (int) (f31 + f14);
        int i19 = i17 - i15;
        int i21 = i18 - i16;
        if (i19 != view.getMeasuredWidth() || i21 != view.getMeasuredHeight() || z11) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i21, 1073741824));
        }
        view.layout(i15, i16, i17, i18);
    }

    public void t(m mVar, q qVar) {
        double d11 = ((this.f6717e + (this.f6719g / 2.0f)) - qVar.f6717e) - (qVar.f6719g / 2.0f);
        double d12 = ((this.f6718f + (this.f6720h / 2.0f)) - qVar.f6718f) - (qVar.f6720h / 2.0f);
        this.f6726n = mVar;
        this.f6717e = (float) Math.hypot(d12, d11);
        if (Float.isNaN(this.f6725m)) {
            this.f6718f = (float) (Math.atan2(d12, d11) + 1.5707963267948966d);
        } else {
            this.f6718f = (float) Math.toRadians(this.f6725m);
        }
    }

    q(int i11, int i12, h hVar, q qVar, q qVar2) {
        int i13 = d.f6477f;
        this.f6723k = i13;
        this.f6724l = i13;
        this.f6725m = Float.NaN;
        this.f6726n = null;
        this.f6727o = new LinkedHashMap<>();
        this.f6728p = 0;
        this.f6730r = new double[18];
        this.f6731s = new double[18];
        if (qVar.f6724l != d.f6477f) {
            o(i11, i12, hVar, qVar, qVar2);
            return;
        }
        int i14 = hVar.f6533q;
        if (i14 == 1) {
            n(hVar, qVar, qVar2);
            return;
        }
        if (i14 == 2) {
            p(i11, i12, hVar, qVar, qVar2);
        } else if (i14 != 3) {
            m(hVar, qVar, qVar2);
        } else {
            l(hVar, qVar, qVar2);
        }
    }
}
