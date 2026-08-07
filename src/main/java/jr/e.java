package jr;

import hr.a0;
import hr.b0;
import hr.l;
import hr.z;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b0 f84267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f84268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f84269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f84270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f84271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f84272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f84273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f84274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f84275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f84276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f84277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f84278l;

    public e(int i11, int i12, long j11, int i13, b0 b0Var) {
        boolean z11 = true;
        if (i12 != 1 && i12 != 2) {
            z11 = false;
        }
        ts.a.a(z11);
        this.f84270d = j11;
        this.f84271e = i13;
        this.f84267a = b0Var;
        this.f84268b = d(i11, i12 == 2 ? 1667497984 : 1651965952);
        this.f84269c = i12 == 2 ? d(i11, 1650720768) : -1;
        this.f84277k = new long[512];
        this.f84278l = new int[512];
    }

    private static int d(int i11, int i12) {
        return (((i11 % 10) + 48) << 8) | ((i11 / 10) + 48) | i12;
    }

    private long e(int i11) {
        return (this.f84270d * ((long) i11)) / ((long) this.f84271e);
    }

    private a0 h(int i11) {
        return new a0(((long) this.f84278l[i11]) * g(), this.f84277k[i11]);
    }

    public void a() {
        this.f84274h++;
    }

    public void b(long j11) {
        if (this.f84276j == this.f84278l.length) {
            long[] jArr = this.f84277k;
            this.f84277k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f84278l;
            this.f84278l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f84277k;
        int i11 = this.f84276j;
        jArr2[i11] = j11;
        this.f84278l[i11] = this.f84275i;
        this.f84276j = i11 + 1;
    }

    public void c() {
        this.f84277k = Arrays.copyOf(this.f84277k, this.f84276j);
        this.f84278l = Arrays.copyOf(this.f84278l, this.f84276j);
    }

    public long f() {
        return e(this.f84274h);
    }

    public long g() {
        return e(1);
    }

    public z.a i(long j11) {
        int iG = (int) (j11 / g());
        int iH = p0.h(this.f84278l, iG, true, true);
        if (this.f84278l[iH] == iG) {
            return new z.a(h(iH));
        }
        a0 a0VarH = h(iH);
        int i11 = iH + 1;
        return i11 < this.f84277k.length ? new z.a(a0VarH, h(i11)) : new z.a(a0VarH);
    }

    public boolean j(int i11) {
        return this.f84268b == i11 || this.f84269c == i11;
    }

    public void k() {
        this.f84275i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f84278l, this.f84274h) >= 0;
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
    public boolean m(l lVar) {
        int i11 = this.f84273g;
        int iA = i11 - this.f84267a.a(lVar, i11, false);
        this.f84273g = iA;
        boolean z11 = iA == 0;
        if (z11) {
            if (this.f84272f > 0) {
                this.f84267a.e(f(), l() ? 1 : 0, this.f84272f, 0, null);
            }
            a();
        }
        return z11;
    }

    public void n(int i11) {
        this.f84272f = i11;
        this.f84273g = i11;
    }

    public void o(long j11) {
        if (this.f84276j == 0) {
            this.f84274h = 0;
        } else {
            this.f84274h = this.f84278l[p0.i(this.f84277k, j11, true, true)];
        }
    }
}
