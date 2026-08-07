package a5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f271l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f274c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f272a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f275d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f276e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f277f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f278g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f279h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f280i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f281j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f282k = false;

    a(b bVar, c cVar) {
        this.f273b = bVar;
        this.f274c = cVar;
    }

    @Override // a5.b.a
    public i a(int i11) {
        int i12 = this.f280i;
        for (int i13 = 0; i12 != -1 && i13 < this.f272a; i13++) {
            if (i13 == i11) {
                return this.f274c.f292d[this.f277f[i12]];
            }
            i12 = this.f278g[i12];
        }
        return null;
    }

    @Override // a5.b.a
    public final float b(i iVar, boolean z11) {
        if (this.f276e == iVar) {
            this.f276e = null;
        }
        int i11 = this.f280i;
        if (i11 == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i12 = 0;
        int i13 = -1;
        while (i11 != -1 && i12 < this.f272a) {
            if (this.f277f[i11] == iVar.f333c) {
                if (i11 == this.f280i) {
                    this.f280i = this.f278g[i11];
                } else {
                    int[] iArr = this.f278g;
                    iArr[i13] = iArr[i11];
                }
                if (z11) {
                    iVar.d(this.f273b);
                }
                iVar.f343m--;
                this.f272a--;
                this.f277f[i11] = -1;
                if (this.f282k) {
                    this.f281j = i11;
                }
                return this.f279h[i11];
            }
            i12++;
            i13 = i11;
            i11 = this.f278g[i11];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // a5.b.a
    public final void c(i iVar, float f11) {
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            b(iVar, true);
            return;
        }
        int i11 = this.f280i;
        if (i11 == -1) {
            this.f280i = 0;
            this.f279h[0] = f11;
            this.f277f[0] = iVar.f333c;
            this.f278g[0] = -1;
            iVar.f343m++;
            iVar.a(this.f273b);
            this.f272a++;
            if (this.f282k) {
                return;
            }
            int i12 = this.f281j + 1;
            this.f281j = i12;
            int[] iArr = this.f277f;
            if (i12 >= iArr.length) {
                this.f282k = true;
                this.f281j = iArr.length - 1;
                return;
            }
            return;
        }
        int i13 = -1;
        for (int i14 = 0; i11 != -1 && i14 < this.f272a; i14++) {
            int i15 = this.f277f[i11];
            int i16 = iVar.f333c;
            if (i15 == i16) {
                this.f279h[i11] = f11;
                return;
            }
            if (i15 < i16) {
                i13 = i11;
            }
            i11 = this.f278g[i11];
        }
        int length = this.f281j;
        int i17 = length + 1;
        if (this.f282k) {
            int[] iArr2 = this.f277f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i17;
        }
        int[] iArr3 = this.f277f;
        if (length >= iArr3.length && this.f272a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f277f;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    length = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f277f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i19 = this.f275d * 2;
            this.f275d = i19;
            this.f282k = false;
            this.f281j = length - 1;
            this.f279h = Arrays.copyOf(this.f279h, i19);
            this.f277f = Arrays.copyOf(this.f277f, this.f275d);
            this.f278g = Arrays.copyOf(this.f278g, this.f275d);
        }
        this.f277f[length] = iVar.f333c;
        this.f279h[length] = f11;
        if (i13 != -1) {
            int[] iArr6 = this.f278g;
            iArr6[length] = iArr6[i13];
            iArr6[i13] = length;
        } else {
            this.f278g[length] = this.f280i;
            this.f280i = length;
        }
        iVar.f343m++;
        iVar.a(this.f273b);
        int i21 = this.f272a + 1;
        this.f272a = i21;
        if (!this.f282k) {
            this.f281j++;
        }
        int[] iArr7 = this.f277f;
        if (i21 >= iArr7.length) {
            this.f282k = true;
        }
        if (this.f281j >= iArr7.length) {
            this.f282k = true;
            this.f281j = iArr7.length - 1;
        }
    }

    @Override // a5.b.a
    public final void clear() {
        int i11 = this.f280i;
        for (int i12 = 0; i11 != -1 && i12 < this.f272a; i12++) {
            i iVar = this.f274c.f292d[this.f277f[i11]];
            if (iVar != null) {
                iVar.d(this.f273b);
            }
            i11 = this.f278g[i11];
        }
        this.f280i = -1;
        this.f281j = -1;
        this.f282k = false;
        this.f272a = 0;
    }

    @Override // a5.b.a
    public void d(i iVar, float f11, boolean z11) {
        float f12 = f271l;
        if (f11 <= (-f12) || f11 >= f12) {
            int i11 = this.f280i;
            if (i11 == -1) {
                this.f280i = 0;
                this.f279h[0] = f11;
                this.f277f[0] = iVar.f333c;
                this.f278g[0] = -1;
                iVar.f343m++;
                iVar.a(this.f273b);
                this.f272a++;
                if (this.f282k) {
                    return;
                }
                int i12 = this.f281j + 1;
                this.f281j = i12;
                int[] iArr = this.f277f;
                if (i12 >= iArr.length) {
                    this.f282k = true;
                    this.f281j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i13 = -1;
            for (int i14 = 0; i11 != -1 && i14 < this.f272a; i14++) {
                int i15 = this.f277f[i11];
                int i16 = iVar.f333c;
                if (i15 == i16) {
                    float[] fArr = this.f279h;
                    float f13 = fArr[i11] + f11;
                    float f14 = f271l;
                    if (f13 > (-f14) && f13 < f14) {
                        f13 = 0.0f;
                    }
                    fArr[i11] = f13;
                    if (f13 == BitmapDescriptorFactory.HUE_RED) {
                        if (i11 == this.f280i) {
                            this.f280i = this.f278g[i11];
                        } else {
                            int[] iArr2 = this.f278g;
                            iArr2[i13] = iArr2[i11];
                        }
                        if (z11) {
                            iVar.d(this.f273b);
                        }
                        if (this.f282k) {
                            this.f281j = i11;
                        }
                        iVar.f343m--;
                        this.f272a--;
                        return;
                    }
                    return;
                }
                if (i15 < i16) {
                    i13 = i11;
                }
                i11 = this.f278g[i11];
            }
            int length = this.f281j;
            int i17 = length + 1;
            if (this.f282k) {
                int[] iArr3 = this.f277f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i17;
            }
            int[] iArr4 = this.f277f;
            if (length >= iArr4.length && this.f272a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f277f;
                    if (i18 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i18] == -1) {
                        length = i18;
                        break;
                    }
                    i18++;
                }
            }
            int[] iArr6 = this.f277f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i19 = this.f275d * 2;
                this.f275d = i19;
                this.f282k = false;
                this.f281j = length - 1;
                this.f279h = Arrays.copyOf(this.f279h, i19);
                this.f277f = Arrays.copyOf(this.f277f, this.f275d);
                this.f278g = Arrays.copyOf(this.f278g, this.f275d);
            }
            this.f277f[length] = iVar.f333c;
            this.f279h[length] = f11;
            if (i13 != -1) {
                int[] iArr7 = this.f278g;
                iArr7[length] = iArr7[i13];
                iArr7[i13] = length;
            } else {
                this.f278g[length] = this.f280i;
                this.f280i = length;
            }
            iVar.f343m++;
            iVar.a(this.f273b);
            this.f272a++;
            if (!this.f282k) {
                this.f281j++;
            }
            int i21 = this.f281j;
            int[] iArr8 = this.f277f;
            if (i21 >= iArr8.length) {
                this.f282k = true;
                this.f281j = iArr8.length - 1;
            }
        }
    }

    @Override // a5.b.a
    public boolean e(i iVar) {
        int i11 = this.f280i;
        if (i11 == -1) {
            return false;
        }
        for (int i12 = 0; i11 != -1 && i12 < this.f272a; i12++) {
            if (this.f277f[i11] == iVar.f333c) {
                return true;
            }
            i11 = this.f278g[i11];
        }
        return false;
    }

    @Override // a5.b.a
    public float f(b bVar, boolean z11) {
        float fH = h(bVar.f283a);
        b(bVar.f283a, z11);
        b.a aVar = bVar.f287e;
        int i11 = aVar.i();
        for (int i12 = 0; i12 < i11; i12++) {
            i iVarA = aVar.a(i12);
            d(iVarA, aVar.h(iVarA) * fH, z11);
        }
        return fH;
    }

    @Override // a5.b.a
    public void g(float f11) {
        int i11 = this.f280i;
        for (int i12 = 0; i11 != -1 && i12 < this.f272a; i12++) {
            float[] fArr = this.f279h;
            fArr[i11] = fArr[i11] / f11;
            i11 = this.f278g[i11];
        }
    }

    @Override // a5.b.a
    public final float h(i iVar) {
        int i11 = this.f280i;
        for (int i12 = 0; i11 != -1 && i12 < this.f272a; i12++) {
            if (this.f277f[i11] == iVar.f333c) {
                return this.f279h[i11];
            }
            i11 = this.f278g[i11];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // a5.b.a
    public int i() {
        return this.f272a;
    }

    @Override // a5.b.a
    public void invert() {
        int i11 = this.f280i;
        for (int i12 = 0; i11 != -1 && i12 < this.f272a; i12++) {
            float[] fArr = this.f279h;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f278g[i11];
        }
    }

    @Override // a5.b.a
    public float j(int i11) {
        int i12 = this.f280i;
        for (int i13 = 0; i12 != -1 && i13 < this.f272a; i13++) {
            if (i13 == i11) {
                return this.f279h[i12];
            }
            i12 = this.f278g[i12];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public String toString() {
        int i11 = this.f280i;
        String str = "";
        for (int i12 = 0; i11 != -1 && i12 < this.f272a; i12++) {
            str = ((str + " -> ") + this.f279h[i11] + " : ") + this.f274c.f292d[this.f277f[i11]];
            i11 = this.f278g[i11];
        }
        return str;
    }
}
