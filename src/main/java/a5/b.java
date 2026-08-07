package a5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f287e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f283a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f284b = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f285c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<i> f286d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f288f = false;

    public interface a {
        i a(int i11);

        float b(i iVar, boolean z11);

        void c(i iVar, float f11);

        void clear();

        void d(i iVar, float f11, boolean z11);

        boolean e(i iVar);

        float f(b bVar, boolean z11);

        void g(float f11);

        float h(i iVar);

        int i();

        void invert();

        float j(int i11);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f343m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int i11 = this.f287e.i();
        i iVar2 = null;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            float fJ = this.f287e.j(i12);
            if (fJ < BitmapDescriptorFactory.HUE_RED) {
                i iVarA = this.f287e.a(i12);
                if ((zArr == null || !zArr[iVarA.f333c]) && iVarA != iVar && (((aVar = iVarA.f340j) == i.a.SLACK || aVar == i.a.ERROR) && fJ < f11)) {
                    f11 = fJ;
                    iVar2 = iVarA;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z11) {
        if (iVar == null || !iVar.f337g) {
            return;
        }
        this.f284b += iVar.f336f * this.f287e.h(iVar);
        this.f287e.b(iVar, z11);
        if (z11) {
            iVar.d(this);
        }
        if (d.f295u && this.f287e.i() == 0) {
            this.f288f = true;
            dVar.f301b = true;
        }
    }

    public void B(d dVar, b bVar, boolean z11) {
        this.f284b += bVar.f284b * this.f287e.f(bVar, z11);
        if (z11) {
            bVar.f283a.d(this);
        }
        if (d.f295u && this.f283a != null && this.f287e.i() == 0) {
            this.f288f = true;
            dVar.f301b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z11) {
        if (iVar == null || !iVar.f344n) {
            return;
        }
        float fH = this.f287e.h(iVar);
        this.f284b += iVar.f346p * fH;
        this.f287e.b(iVar, z11);
        if (z11) {
            iVar.d(this);
        }
        this.f287e.d(dVar.f314o.f292d[iVar.f345o], fH, z11);
        if (d.f295u && this.f287e.i() == 0) {
            this.f288f = true;
            dVar.f301b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f307h.length == 0) {
            return;
        }
        boolean z11 = false;
        while (!z11) {
            int i11 = this.f287e.i();
            for (int i12 = 0; i12 < i11; i12++) {
                i iVarA = this.f287e.a(i12);
                if (iVarA.f334d != -1 || iVarA.f337g || iVarA.f344n) {
                    this.f286d.add(iVarA);
                }
            }
            int size = this.f286d.size();
            if (size > 0) {
                for (int i13 = 0; i13 < size; i13++) {
                    i iVar = this.f286d.get(i13);
                    if (iVar.f337g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f344n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f307h[iVar.f334d], true);
                    }
                }
                this.f286d.clear();
            } else {
                z11 = true;
            }
        }
        if (d.f295u && this.f283a != null && this.f287e.i() == 0) {
            this.f288f = true;
            dVar.f301b = true;
        }
    }

    @Override // a5.d.a
    public i a(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // a5.d.a
    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f283a = null;
            this.f287e.clear();
            for (int i11 = 0; i11 < bVar.f287e.i(); i11++) {
                this.f287e.d(bVar.f287e.a(i11), bVar.f287e.j(i11), true);
            }
        }
    }

    @Override // a5.d.a
    public void c(i iVar) {
        int i11 = iVar.f335e;
        float f11 = 1.0f;
        if (i11 != 1) {
            if (i11 == 2) {
                f11 = 1000.0f;
            } else if (i11 == 3) {
                f11 = 1000000.0f;
            } else if (i11 == 4) {
                f11 = 1.0E9f;
            } else if (i11 == 5) {
                f11 = 1.0E12f;
            }
        }
        this.f287e.c(iVar, f11);
    }

    @Override // a5.d.a
    public void clear() {
        this.f287e.clear();
        this.f283a = null;
        this.f284b = BitmapDescriptorFactory.HUE_RED;
    }

    public b d(d dVar, int i11) {
        this.f287e.c(dVar.o(i11, "ep"), 1.0f);
        this.f287e.c(dVar.o(i11, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i11) {
        this.f287e.c(iVar, i11);
        return this;
    }

    boolean f(d dVar) {
        boolean z11;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z11 = true;
        } else {
            x(iVarG);
            z11 = false;
        }
        if (this.f287e.i() == 0) {
            this.f288f = true;
        }
        return z11;
    }

    i g(d dVar) {
        int i11 = this.f287e.i();
        i iVar = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        i iVar2 = null;
        for (int i12 = 0; i12 < i11; i12++) {
            float fJ = this.f287e.j(i12);
            i iVarA = this.f287e.a(i12);
            if (iVarA.f340j == i.a.UNRESTRICTED) {
                if (iVar == null || f11 > fJ) {
                    boolean zU = u(iVarA, dVar);
                    z11 = zU;
                    f11 = fJ;
                    iVar = iVarA;
                } else if (!z11 && u(iVarA, dVar)) {
                    f11 = fJ;
                    iVar = iVarA;
                    z11 = true;
                }
            } else if (iVar == null && fJ < BitmapDescriptorFactory.HUE_RED) {
                if (iVar2 == null || f12 > fJ) {
                    boolean zU2 = u(iVarA, dVar);
                    z12 = zU2;
                    f12 = fJ;
                    iVar2 = iVarA;
                } else if (!z12 && u(iVarA, dVar)) {
                    f12 = fJ;
                    iVar2 = iVarA;
                    z12 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // a5.d.a
    public i getKey() {
        return this.f283a;
    }

    b h(i iVar, i iVar2, int i11, float f11, i iVar3, i iVar4, int i12) {
        if (iVar2 == iVar3) {
            this.f287e.c(iVar, 1.0f);
            this.f287e.c(iVar4, 1.0f);
            this.f287e.c(iVar2, -2.0f);
            return this;
        }
        if (f11 == 0.5f) {
            this.f287e.c(iVar, 1.0f);
            this.f287e.c(iVar2, -1.0f);
            this.f287e.c(iVar3, -1.0f);
            this.f287e.c(iVar4, 1.0f);
            if (i11 > 0 || i12 > 0) {
                this.f284b = (-i11) + i12;
                return this;
            }
        } else {
            if (f11 <= BitmapDescriptorFactory.HUE_RED) {
                this.f287e.c(iVar, -1.0f);
                this.f287e.c(iVar2, 1.0f);
                this.f284b = i11;
                return this;
            }
            if (f11 >= 1.0f) {
                this.f287e.c(iVar4, -1.0f);
                this.f287e.c(iVar3, 1.0f);
                this.f284b = -i12;
                return this;
            }
            float f12 = 1.0f - f11;
            this.f287e.c(iVar, f12 * 1.0f);
            this.f287e.c(iVar2, f12 * (-1.0f));
            this.f287e.c(iVar3, (-1.0f) * f11);
            this.f287e.c(iVar4, 1.0f * f11);
            if (i11 > 0 || i12 > 0) {
                this.f284b = ((-i11) * f12) + (i12 * f11);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i11) {
        this.f283a = iVar;
        float f11 = i11;
        iVar.f336f = f11;
        this.f284b = f11;
        this.f288f = true;
        return this;
    }

    @Override // a5.d.a
    public boolean isEmpty() {
        return this.f283a == null && this.f284b == BitmapDescriptorFactory.HUE_RED && this.f287e.i() == 0;
    }

    b j(i iVar, i iVar2, float f11) {
        this.f287e.c(iVar, -1.0f);
        this.f287e.c(iVar2, f11);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f11) {
        this.f287e.c(iVar, -1.0f);
        this.f287e.c(iVar2, 1.0f);
        this.f287e.c(iVar3, f11);
        this.f287e.c(iVar4, -f11);
        return this;
    }

    public b l(float f11, float f12, float f13, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f284b = BitmapDescriptorFactory.HUE_RED;
        if (f12 == BitmapDescriptorFactory.HUE_RED || f11 == f13) {
            this.f287e.c(iVar, 1.0f);
            this.f287e.c(iVar2, -1.0f);
            this.f287e.c(iVar4, 1.0f);
            this.f287e.c(iVar3, -1.0f);
            return this;
        }
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            this.f287e.c(iVar, 1.0f);
            this.f287e.c(iVar2, -1.0f);
            return this;
        }
        if (f13 == BitmapDescriptorFactory.HUE_RED) {
            this.f287e.c(iVar3, 1.0f);
            this.f287e.c(iVar4, -1.0f);
            return this;
        }
        float f14 = (f11 / f12) / (f13 / f12);
        this.f287e.c(iVar, 1.0f);
        this.f287e.c(iVar2, -1.0f);
        this.f287e.c(iVar4, f14);
        this.f287e.c(iVar3, -f14);
        return this;
    }

    public b m(i iVar, int i11) {
        if (i11 < 0) {
            this.f284b = i11 * (-1);
            this.f287e.c(iVar, 1.0f);
            return this;
        }
        this.f284b = i11;
        this.f287e.c(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f284b = i11;
        }
        if (z11) {
            this.f287e.c(iVar, 1.0f);
            this.f287e.c(iVar2, -1.0f);
            return this;
        }
        this.f287e.c(iVar, -1.0f);
        this.f287e.c(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f284b = i11;
        }
        if (z11) {
            this.f287e.c(iVar, 1.0f);
            this.f287e.c(iVar2, -1.0f);
            this.f287e.c(iVar3, -1.0f);
            return this;
        }
        this.f287e.c(iVar, -1.0f);
        this.f287e.c(iVar2, 1.0f);
        this.f287e.c(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f284b = i11;
        }
        if (z11) {
            this.f287e.c(iVar, 1.0f);
            this.f287e.c(iVar2, -1.0f);
            this.f287e.c(iVar3, 1.0f);
            return this;
        }
        this.f287e.c(iVar, -1.0f);
        this.f287e.c(iVar2, 1.0f);
        this.f287e.c(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f11) {
        this.f287e.c(iVar3, 0.5f);
        this.f287e.c(iVar4, 0.5f);
        this.f287e.c(iVar, -0.5f);
        this.f287e.c(iVar2, -0.5f);
        this.f284b = -f11;
        return this;
    }

    void r() {
        float f11 = this.f284b;
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            this.f284b = f11 * (-1.0f);
            this.f287e.invert();
        }
    }

    boolean s() {
        i iVar = this.f283a;
        if (iVar != null) {
            return iVar.f340j == i.a.UNRESTRICTED || this.f284b >= BitmapDescriptorFactory.HUE_RED;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f287e.e(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f283a;
        if (iVar2 != null) {
            this.f287e.c(iVar2, -1.0f);
            this.f283a.f334d = -1;
            this.f283a = null;
        }
        float fB = this.f287e.b(iVar, true) * (-1.0f);
        this.f283a = iVar;
        if (fB == 1.0f) {
            return;
        }
        this.f284b /= fB;
        this.f287e.g(fB);
    }

    public void y() {
        this.f283a = null;
        this.f287e.clear();
        this.f284b = BitmapDescriptorFactory.HUE_RED;
        this.f288f = false;
    }

    String z() {
        boolean z11;
        String str = (this.f283a == null ? "" + WebrtcBuildVersion.maint_version : "" + this.f283a) + " = ";
        if (this.f284b != BitmapDescriptorFactory.HUE_RED) {
            str = str + this.f284b;
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.f287e.i();
        for (int i12 = 0; i12 < i11; i12++) {
            i iVarA = this.f287e.a(i12);
            if (iVarA != null) {
                float fJ = this.f287e.j(i12);
                if (fJ != BitmapDescriptorFactory.HUE_RED) {
                    String string = iVarA.toString();
                    if (z11) {
                        if (fJ > BitmapDescriptorFactory.HUE_RED) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fJ *= -1.0f;
                        }
                    } else if (fJ < BitmapDescriptorFactory.HUE_RED) {
                        str = str + "- ";
                        fJ *= -1.0f;
                    }
                    str = fJ == 1.0f ? str + string : str + fJ + " " + string;
                    z11 = true;
                }
            }
        }
        if (z11) {
            return str;
        }
        return str + "0.0";
    }

    public b(c cVar) {
        this.f287e = new a5.a(this, cVar);
    }
}
