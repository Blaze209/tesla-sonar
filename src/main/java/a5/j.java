package a5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f348n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f349a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f350b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f351c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f352d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f353e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f354f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f355g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f356h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f357i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f358j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f359k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f361m;

    j(b bVar, c cVar) {
        this.f360l = bVar;
        this.f361m = cVar;
        clear();
    }

    private void k(i iVar, int i11) {
        int[] iArr;
        int i12 = iVar.f333c % this.f351c;
        int[] iArr2 = this.f352d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            iArr2[i12] = i11;
        } else {
            while (true) {
                iArr = this.f353e;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    break;
                } else {
                    i13 = i14;
                }
            }
            iArr[i13] = i11;
        }
        this.f353e[i11] = -1;
    }

    private void l(int i11, i iVar, float f11) {
        this.f354f[i11] = iVar.f333c;
        this.f355g[i11] = f11;
        this.f356h[i11] = -1;
        this.f357i[i11] = -1;
        iVar.a(this.f360l);
        iVar.f343m++;
        this.f358j++;
    }

    private int m() {
        for (int i11 = 0; i11 < this.f350b; i11++) {
            if (this.f354f[i11] == -1) {
                return i11;
            }
        }
        return -1;
    }

    private void n() {
        int i11 = this.f350b * 2;
        this.f354f = Arrays.copyOf(this.f354f, i11);
        this.f355g = Arrays.copyOf(this.f355g, i11);
        this.f356h = Arrays.copyOf(this.f356h, i11);
        this.f357i = Arrays.copyOf(this.f357i, i11);
        this.f353e = Arrays.copyOf(this.f353e, i11);
        for (int i12 = this.f350b; i12 < i11; i12++) {
            this.f354f[i12] = -1;
            this.f353e[i12] = -1;
        }
        this.f350b = i11;
    }

    private void p(int i11, i iVar, float f11) {
        int iM = m();
        l(iM, iVar, f11);
        if (i11 != -1) {
            this.f356h[iM] = i11;
            int[] iArr = this.f357i;
            iArr[iM] = iArr[i11];
            iArr[i11] = iM;
        } else {
            this.f356h[iM] = -1;
            if (this.f358j > 0) {
                this.f357i[iM] = this.f359k;
                this.f359k = iM;
            } else {
                this.f357i[iM] = -1;
            }
        }
        int i12 = this.f357i[iM];
        if (i12 != -1) {
            this.f356h[i12] = iM;
        }
        k(iVar, iM);
    }

    private void q(i iVar) {
        int[] iArr;
        int i11;
        int i12 = iVar.f333c;
        int i13 = i12 % this.f351c;
        int[] iArr2 = this.f352d;
        int i14 = iArr2[i13];
        if (i14 == -1) {
            return;
        }
        if (this.f354f[i14] == i12) {
            int[] iArr3 = this.f353e;
            iArr2[i13] = iArr3[i14];
            iArr3[i14] = -1;
            return;
        }
        while (true) {
            iArr = this.f353e;
            i11 = iArr[i14];
            if (i11 == -1 || this.f354f[i11] == i12) {
                break;
            } else {
                i14 = i11;
            }
        }
        if (i11 == -1 || this.f354f[i11] != i12) {
            return;
        }
        iArr[i14] = iArr[i11];
        iArr[i11] = -1;
    }

    @Override // a5.b.a
    public i a(int i11) {
        int i12 = this.f358j;
        if (i12 == 0) {
            return null;
        }
        int i13 = this.f359k;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i11 && i13 != -1) {
                return this.f361m.f292d[this.f354f[i13]];
            }
            i13 = this.f357i[i13];
            if (i13 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // a5.b.a
    public float b(i iVar, boolean z11) {
        int iO = o(iVar);
        if (iO == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        q(iVar);
        float f11 = this.f355g[iO];
        if (this.f359k == iO) {
            this.f359k = this.f357i[iO];
        }
        this.f354f[iO] = -1;
        int[] iArr = this.f356h;
        int i11 = iArr[iO];
        if (i11 != -1) {
            int[] iArr2 = this.f357i;
            iArr2[i11] = iArr2[iO];
        }
        int i12 = this.f357i[iO];
        if (i12 != -1) {
            iArr[i12] = iArr[iO];
        }
        this.f358j--;
        iVar.f343m--;
        if (z11) {
            iVar.d(this.f360l);
        }
        return f11;
    }

    @Override // a5.b.a
    public void c(i iVar, float f11) {
        float f12 = f348n;
        if (f11 > (-f12) && f11 < f12) {
            b(iVar, true);
            return;
        }
        if (this.f358j == 0) {
            l(0, iVar, f11);
            k(iVar, 0);
            this.f359k = 0;
            return;
        }
        int iO = o(iVar);
        if (iO != -1) {
            this.f355g[iO] = f11;
            return;
        }
        if (this.f358j + 1 >= this.f350b) {
            n();
        }
        int i11 = this.f358j;
        int i12 = this.f359k;
        int i13 = -1;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = this.f354f[i12];
            int i16 = iVar.f333c;
            if (i15 == i16) {
                this.f355g[i12] = f11;
                return;
            }
            if (i15 < i16) {
                i13 = i12;
            }
            i12 = this.f357i[i12];
            if (i12 == -1) {
                break;
            }
        }
        p(i13, iVar, f11);
    }

    @Override // a5.b.a
    public void clear() {
        int i11 = this.f358j;
        for (int i12 = 0; i12 < i11; i12++) {
            i iVarA = a(i12);
            if (iVarA != null) {
                iVarA.d(this.f360l);
            }
        }
        for (int i13 = 0; i13 < this.f350b; i13++) {
            this.f354f[i13] = -1;
            this.f353e[i13] = -1;
        }
        for (int i14 = 0; i14 < this.f351c; i14++) {
            this.f352d[i14] = -1;
        }
        this.f358j = 0;
        this.f359k = -1;
    }

    @Override // a5.b.a
    public void d(i iVar, float f11, boolean z11) {
        float f12 = f348n;
        if (f11 <= (-f12) || f11 >= f12) {
            int iO = o(iVar);
            if (iO == -1) {
                c(iVar, f11);
                return;
            }
            float[] fArr = this.f355g;
            float f13 = fArr[iO] + f11;
            fArr[iO] = f13;
            float f14 = f348n;
            if (f13 <= (-f14) || f13 >= f14) {
                return;
            }
            fArr[iO] = 0.0f;
            b(iVar, z11);
        }
    }

    @Override // a5.b.a
    public boolean e(i iVar) {
        return o(iVar) != -1;
    }

    @Override // a5.b.a
    public float f(b bVar, boolean z11) {
        float fH = h(bVar.f283a);
        b(bVar.f283a, z11);
        j jVar = (j) bVar.f287e;
        int i11 = jVar.i();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = jVar.f354f[i13];
            if (i14 != -1) {
                d(this.f361m.f292d[i14], jVar.f355g[i13] * fH, z11);
                i12++;
            }
            i13++;
        }
        return fH;
    }

    @Override // a5.b.a
    public void g(float f11) {
        int i11 = this.f358j;
        int i12 = this.f359k;
        for (int i13 = 0; i13 < i11; i13++) {
            float[] fArr = this.f355g;
            fArr[i12] = fArr[i12] / f11;
            i12 = this.f357i[i12];
            if (i12 == -1) {
                return;
            }
        }
    }

    @Override // a5.b.a
    public float h(i iVar) {
        int iO = o(iVar);
        return iO != -1 ? this.f355g[iO] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // a5.b.a
    public int i() {
        return this.f358j;
    }

    @Override // a5.b.a
    public void invert() {
        int i11 = this.f358j;
        int i12 = this.f359k;
        for (int i13 = 0; i13 < i11; i13++) {
            float[] fArr = this.f355g;
            fArr[i12] = fArr[i12] * (-1.0f);
            i12 = this.f357i[i12];
            if (i12 == -1) {
                return;
            }
        }
    }

    @Override // a5.b.a
    public float j(int i11) {
        int i12 = this.f358j;
        int i13 = this.f359k;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i11) {
                return this.f355g[i13];
            }
            i13 = this.f357i[i13];
            if (i13 == -1) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public int o(i iVar) {
        if (this.f358j != 0 && iVar != null) {
            int i11 = iVar.f333c;
            int i12 = this.f352d[i11 % this.f351c];
            if (i12 == -1) {
                return -1;
            }
            if (this.f354f[i12] == i11) {
                return i12;
            }
            do {
                i12 = this.f353e[i12];
                if (i12 == -1) {
                    break;
                }
            } while (this.f354f[i12] != i11);
            if (i12 != -1 && this.f354f[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i11 = this.f358j;
        for (int i12 = 0; i12 < i11; i12++) {
            i iVarA = a(i12);
            if (iVarA != null) {
                String str2 = str + iVarA + " = " + j(i12) + " ";
                int iO = o(iVarA);
                String str3 = str2 + "[p: ";
                String str4 = (this.f356h[iO] != -1 ? str3 + this.f361m.f292d[this.f354f[this.f356h[iO]]] : str3 + "none") + ", n: ";
                str = (this.f357i[iO] != -1 ? str4 + this.f361m.f292d[this.f354f[this.f357i[iO]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
