package a5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f330r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f332b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f336f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f340j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f333c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f334d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f335e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f337g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f338h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f339i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b[] f341k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f342l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f343m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f344n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f345o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f346p = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    HashSet<b> f347q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f340j = aVar;
    }

    static void c() {
        f330r++;
    }

    public final void a(b bVar) {
        int i11 = 0;
        while (true) {
            int i12 = this.f342l;
            if (i11 >= i12) {
                b[] bVarArr = this.f341k;
                if (i12 >= bVarArr.length) {
                    this.f341k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f341k;
                int i13 = this.f342l;
                bVarArr2[i13] = bVar;
                this.f342l = i13 + 1;
                return;
            }
            if (this.f341k[i11] == bVar) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f333c - iVar.f333c;
    }

    public final void d(b bVar) {
        int i11 = this.f342l;
        int i12 = 0;
        while (i12 < i11) {
            if (this.f341k[i12] == bVar) {
                while (i12 < i11 - 1) {
                    b[] bVarArr = this.f341k;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.f342l--;
                return;
            }
            i12++;
        }
    }

    public void e() {
        this.f332b = null;
        this.f340j = a.UNKNOWN;
        this.f335e = 0;
        this.f333c = -1;
        this.f334d = -1;
        this.f336f = BitmapDescriptorFactory.HUE_RED;
        this.f337g = false;
        this.f344n = false;
        this.f345o = -1;
        this.f346p = BitmapDescriptorFactory.HUE_RED;
        int i11 = this.f342l;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f341k[i12] = null;
        }
        this.f342l = 0;
        this.f343m = 0;
        this.f331a = false;
        Arrays.fill(this.f339i, BitmapDescriptorFactory.HUE_RED);
    }

    public void f(d dVar, float f11) {
        this.f336f = f11;
        this.f337g = true;
        this.f344n = false;
        this.f345o = -1;
        this.f346p = BitmapDescriptorFactory.HUE_RED;
        int i11 = this.f342l;
        this.f334d = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f341k[i12].A(dVar, this, false);
        }
        this.f342l = 0;
    }

    public void g(a aVar, String str) {
        this.f340j = aVar;
    }

    public final void h(d dVar, b bVar) {
        int i11 = this.f342l;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f341k[i12].B(dVar, bVar, false);
        }
        this.f342l = 0;
    }

    public String toString() {
        if (this.f332b != null) {
            return "" + this.f332b;
        }
        return "" + this.f333c;
    }
}
