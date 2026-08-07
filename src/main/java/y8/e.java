package y8;

import java.util.Arrays;
import s7.q0;
import w8.j0;
import w8.k0;
import w8.o0;
import w8.q;

/* JADX INFO: loaded from: classes3.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f125258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f125259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f125260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f125261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f125262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f125263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f125264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f125265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f125266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f125267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f125268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f125269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f125270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f125271n;

    public e(int i11, d dVar, o0 o0Var) {
        this.f125258a = dVar;
        int iB = dVar.b();
        boolean z11 = true;
        if (iB != 1 && iB != 2) {
            z11 = false;
        }
        s7.a.a(z11);
        this.f125260c = d(i11, iB == 2 ? 1667497984 : 1651965952);
        this.f125262e = dVar.a();
        this.f125259b = o0Var;
        this.f125261d = iB == 2 ? d(i11, 1650720768) : -1;
        this.f125269l = -1L;
        this.f125270m = new long[512];
        this.f125271n = new int[512];
        this.f125263f = dVar.f125255e;
    }

    private static int d(int i11, int i12) {
        return (((i11 % 10) + 48) << 8) | ((i11 / 10) + 48) | i12;
    }

    private long e(int i11) {
        return (this.f125262e * ((long) i11)) / ((long) this.f125263f);
    }

    private k0 h(int i11) {
        return new k0(((long) this.f125271n[i11]) * g(), this.f125270m[i11]);
    }

    public void a() {
        this.f125266i++;
    }

    public void b(long j11, boolean z11) {
        if (this.f125269l == -1) {
            this.f125269l = j11;
        }
        if (z11) {
            if (this.f125268k == this.f125271n.length) {
                long[] jArr = this.f125270m;
                this.f125270m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f125271n;
                this.f125271n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f125270m;
            int i11 = this.f125268k;
            jArr2[i11] = j11;
            this.f125271n[i11] = this.f125267j;
            this.f125268k = i11 + 1;
        }
        this.f125267j++;
    }

    public void c() {
        int i11;
        this.f125270m = Arrays.copyOf(this.f125270m, this.f125268k);
        this.f125271n = Arrays.copyOf(this.f125271n, this.f125268k);
        if (!k() || this.f125258a.f125257g == 0 || (i11 = this.f125268k) <= 0) {
            return;
        }
        this.f125263f = i11;
    }

    public long f() {
        return e(this.f125266i);
    }

    public long g() {
        return e(1);
    }

    public j0.a i(long j11) {
        if (this.f125268k == 0) {
            return new j0.a(new k0(0L, this.f125269l));
        }
        int iG = (int) (j11 / g());
        int iJ = q0.j(this.f125271n, iG, true, true);
        if (this.f125271n[iJ] == iG) {
            return new j0.a(h(iJ));
        }
        k0 k0VarH = h(iJ);
        int i11 = iJ + 1;
        return i11 < this.f125270m.length ? new j0.a(k0VarH, h(i11)) : new j0.a(k0VarH);
    }

    public boolean j(int i11) {
        return this.f125260c == i11 || this.f125261d == i11;
    }

    public boolean k() {
        return (this.f125260c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f125271n, this.f125266i) >= 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean m(q qVar) {
        int i11 = this.f125265h;
        int iE = i11 - this.f125259b.e(qVar, i11, false);
        this.f125265h = iE;
        boolean z11 = iE == 0;
        if (z11) {
            if (this.f125264g > 0) {
                this.f125259b.b(f(), l() ? 1 : 0, this.f125264g, 0, null);
            }
            a();
        }
        return z11;
    }

    public void n(int i11) {
        this.f125264g = i11;
        this.f125265h = i11;
    }

    public void o(long j11) {
        if (this.f125268k == 0) {
            this.f125266i = 0;
        } else {
            this.f125266i = this.f125271n[q0.k(this.f125270m, j11, true, true)];
        }
    }
}
