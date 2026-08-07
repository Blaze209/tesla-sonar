package pr;

import com.google.android.exoplayer2.u0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f103881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f103882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f103883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f103884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u0 f103885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f103886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f103887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f103888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f103889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p[] f103890k;

    public o(int i11, int i12, long j11, long j12, long j13, u0 u0Var, int i13, p[] pVarArr, int i14, long[] jArr, long[] jArr2) {
        this.f103880a = i11;
        this.f103881b = i12;
        this.f103882c = j11;
        this.f103883d = j12;
        this.f103884e = j13;
        this.f103885f = u0Var;
        this.f103886g = i13;
        this.f103890k = pVarArr;
        this.f103889j = i14;
        this.f103887h = jArr;
        this.f103888i = jArr2;
    }

    public p a(int i11) {
        p[] pVarArr = this.f103890k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i11];
    }
}
