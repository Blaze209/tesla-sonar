package a5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class h extends a5.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c f325l;

    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f333c - iVar2.f333c;
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f328b;

        b(h hVar) {
            this.f328b = hVar;
        }

        public boolean a(i iVar, float f11) {
            boolean z11 = true;
            if (!this.f327a.f331a) {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f12 = iVar.f339i[i11];
                    if (f12 != BitmapDescriptorFactory.HUE_RED) {
                        float f13 = f12 * f11;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        this.f327a.f339i[i11] = f13;
                    } else {
                        this.f327a.f339i[i11] = 0.0f;
                    }
                }
                return true;
            }
            for (int i12 = 0; i12 < 9; i12++) {
                float[] fArr = this.f327a.f339i;
                float f14 = fArr[i12] + (iVar.f339i[i12] * f11);
                fArr[i12] = f14;
                if (Math.abs(f14) < 1.0E-4f) {
                    this.f327a.f339i[i12] = 0.0f;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                h.this.G(this.f327a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f327a = iVar;
        }

        public final boolean c() {
            for (int i11 = 8; i11 >= 0; i11--) {
                float f11 = this.f327a.f339i[i11];
                if (f11 > BitmapDescriptorFactory.HUE_RED) {
                    return false;
                }
                if (f11 < BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            for (int i11 = 8; i11 >= 0; i11--) {
                float f11 = iVar.f339i[i11];
                float f12 = this.f327a.f339i[i11];
                if (f12 != f11) {
                    if (f12 < f11) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f327a.f339i, BitmapDescriptorFactory.HUE_RED);
        }

        public String toString() {
            String str = "[ ";
            if (this.f327a != null) {
                for (int i11 = 0; i11 < 9; i11++) {
                    str = str + this.f327a.f339i[i11] + " ";
                }
            }
            return str + "] " + this.f327a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f320g = 128;
        this.f321h = new i[128];
        this.f322i = new i[128];
        this.f323j = 0;
        this.f324k = new b(this);
        this.f325l = cVar;
    }

    private void F(i iVar) {
        int i11;
        int i12 = this.f323j + 1;
        i[] iVarArr = this.f321h;
        if (i12 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f321h = iVarArr2;
            this.f322i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f321h;
        int i13 = this.f323j;
        iVarArr3[i13] = iVar;
        int i14 = i13 + 1;
        this.f323j = i14;
        if (i14 > 1 && iVarArr3[i13].f333c > iVar.f333c) {
            int i15 = 0;
            while (true) {
                i11 = this.f323j;
                if (i15 >= i11) {
                    break;
                }
                this.f322i[i15] = this.f321h[i15];
                i15++;
            }
            Arrays.sort(this.f322i, 0, i11, new a());
            for (int i16 = 0; i16 < this.f323j; i16++) {
                this.f321h[i16] = this.f322i[i16];
            }
        }
        iVar.f331a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(i iVar) {
        int i11 = 0;
        while (i11 < this.f323j) {
            if (this.f321h[i11] == iVar) {
                while (true) {
                    int i12 = this.f323j;
                    if (i11 >= i12 - 1) {
                        this.f323j = i12 - 1;
                        iVar.f331a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f321h;
                        int i13 = i11 + 1;
                        iVarArr[i11] = iVarArr[i13];
                        i11 = i13;
                    }
                }
            } else {
                i11++;
            }
        }
    }

    @Override // a5.b
    public void B(d dVar, a5.b bVar, boolean z11) {
        i iVar = bVar.f283a;
        if (iVar == null) {
            return;
        }
        a5.b.a aVar = bVar.f287e;
        int i11 = aVar.i();
        for (int i12 = 0; i12 < i11; i12++) {
            i iVarA = aVar.a(i12);
            float fJ = aVar.j(i12);
            this.f324k.b(iVarA);
            if (this.f324k.a(iVar, fJ)) {
                F(iVarA);
            }
            this.f284b += bVar.f284b * fJ;
        }
        G(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // a5.b, a5.d.a
    public i a(d dVar, boolean[] zArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < this.f323j; i12++) {
            i iVar = this.f321h[i12];
            if (!zArr[iVar.f333c]) {
                this.f324k.b(iVar);
                if (i11 == -1) {
                    if (this.f324k.c()) {
                        i11 = i12;
                    }
                } else if (this.f324k.d(this.f321h[i11])) {
                    i11 = i12;
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        return this.f321h[i11];
    }

    @Override // a5.b, a5.d.a
    public void c(i iVar) {
        this.f324k.b(iVar);
        this.f324k.e();
        iVar.f339i[iVar.f335e] = 1.0f;
        F(iVar);
    }

    @Override // a5.b, a5.d.a
    public void clear() {
        this.f323j = 0;
        this.f284b = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // a5.b, a5.d.a
    public boolean isEmpty() {
        return this.f323j == 0;
    }

    @Override // a5.b
    public String toString() {
        String str = " goal -> (" + this.f284b + ") : ";
        for (int i11 = 0; i11 < this.f323j; i11++) {
            this.f324k.b(this.f321h[i11]);
            str = str + this.f324k + " ";
        }
        return str;
    }
}
