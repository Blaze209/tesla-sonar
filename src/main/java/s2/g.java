package s2;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.SlotWriter;
import p020r2.a2;
import p020r2.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u0000 I2\u00020\u0001:\u0003037B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000fJ\u001e\u0010\u0017\u001a\u00020\u00042\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J)\u0010*\u001a\u00020\t2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b-\u0010.R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u001e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00104R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00104R\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00104R\u0011\u0010H\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Ls2/g;", "Ls2/h;", "<init>", "()V", "", "currentSize", "requiredSize", "o", "(II)I", "Ljn0/h0;", "p", "(I)V", "q", "paramCount", "n", "(I)I", "Ls2/d;", "v", "()Ls2/d;", "Ls2/d$q;", "parameter", "z", "Ls2/d$t;", "A", "", "t", "()Z", "u", "m", "operation", "y", "(Ls2/d;)V", "x", "other", "w", "(Ls2/g;)V", "Lr2/f;", "applier", "Lr2/d3;", "slots", "Lr2/q2;", "rememberManager", "r", "(Lr2/f;Lr2/d3;Lr2/q2;)V", "", "toString", "()Ljava/lang/String;", "", "a", "[Ls2/d;", "opCodes", "b", "I", "opCodesSize", "", "c", "[I", "intArgs", DateTokenConverter.CONVERTER_KEY, "intArgsSize", "", "e", "[Ljava/lang/Object;", "objectArgs", "f", "objectArgsSize", "g", "pushedIntMask", "h", "pushedObjectMask", "s", "()I", "size", IntegerTokenConverter.CONVERTER_KEY, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f109743j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int opCodesSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int intArgsSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int objectArgsSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pushedIntMask;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int pushedObjectMask;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d[] opCodes = new d[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int[] intArgs = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Object[] objectArgs = new Object[16];

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Ls2/g$b;", "Ls2/e;", "<init>", "(Ls2/g;)V", "", DateTokenConverter.CONVERTER_KEY, "()Z", "Ls2/d$q;", "parameter", "", "b", "(I)I", "T", "Ls2/d$t;", "a", "(I)Ljava/lang/Object;", "I", "opIdx", "intIdx", "c", "objIdx", "Ls2/d;", "()Ls2/d;", "operation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int opIdx;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int intIdx;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int objIdx;

        public b() {
        }

        @Override // s2.e
        public <T> T a(int parameter) {
            return (T) g.this.objectArgs[this.objIdx + parameter];
        }

        @Override // s2.e
        public int b(int parameter) {
            return g.this.intArgs[this.intIdx + parameter];
        }

        public final d c() {
            d dVar = g.this.opCodes[this.opIdx];
            s.h(dVar);
            return dVar;
        }

        public final boolean d() {
            if (this.opIdx >= g.this.opCodesSize) {
                return false;
            }
            d dVarC = c();
            this.intIdx += dVarC.getInts();
            this.objIdx += dVarC.getObjects();
            int i11 = this.opIdx + 1;
            this.opIdx = i11;
            return i11 < g.this.opCodesSize;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(int parameter) {
        return (this.objectArgsSize - v().getObjects()) + parameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(int paramCount) {
        if (paramCount == 0) {
            return 0;
        }
        return (-1) >>> (32 - paramCount);
    }

    private final int o(int currentSize, int requiredSize) {
        return n.f(currentSize + n.j(currentSize, 1024), requiredSize);
    }

    private final void p(int requiredSize) {
        int[] iArr = this.intArgs;
        int length = iArr.length;
        if (requiredSize > length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, o(length, requiredSize));
            s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.intArgs = iArrCopyOf;
        }
    }

    private final void q(int requiredSize) {
        Object[] objArr = this.objectArgs;
        int length = objArr.length;
        if (requiredSize > length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, o(length, requiredSize));
            s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.objectArgs = objArrCopyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d v() {
        d dVar = this.opCodes[this.opCodesSize - 1];
        s.h(dVar);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(int parameter) {
        return (this.intArgsSize - v().getInts()) + parameter;
    }

    public final void m() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        p013kotlin.collections.n.z(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void r(p020r2.f<?> applier, SlotWriter slots, q2 rememberManager) {
        if (u()) {
            b bVar = new b();
            do {
                bVar.c().a(bVar, applier, slots, rememberManager);
            } while (bVar.d());
        }
        m();
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final boolean t() {
        return getOpCodesSize() == 0;
    }

    @jn0.e
    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        return getOpCodesSize() != 0;
    }

    public final void w(g other) {
        if (t()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        d[] dVarArr = this.opCodes;
        int i11 = this.opCodesSize - 1;
        this.opCodesSize = i11;
        d dVar = dVarArr[i11];
        s.h(dVar);
        this.opCodes[this.opCodesSize] = null;
        other.y(dVar);
        int i12 = this.objectArgsSize;
        int i13 = other.objectArgsSize;
        int iD = dVar.getObjects();
        for (int i14 = 0; i14 < iD; i14++) {
            i13--;
            i12--;
            Object[] objArr = other.objectArgs;
            Object[] objArr2 = this.objectArgs;
            objArr[i13] = objArr2[i12];
            objArr2[i12] = null;
        }
        int i15 = this.intArgsSize;
        int i16 = other.intArgsSize;
        int iB = dVar.getInts();
        for (int i17 = 0; i17 < iB; i17++) {
            i16--;
            i15--;
            int[] iArr = other.intArgs;
            int[] iArr2 = this.intArgs;
            iArr[i16] = iArr2[i15];
            iArr2[i15] = 0;
        }
        this.objectArgsSize -= dVar.getObjects();
        this.intArgsSize -= dVar.getInts();
    }

    public final void x(d operation) {
        if (!(operation.getInts() == 0 && operation.getObjects() == 0)) {
            a2.a("Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.");
        }
        y(operation);
    }

    public final void y(d operation) {
        this.pushedIntMask = 0;
        this.pushedObjectMask = 0;
        int i11 = this.opCodesSize;
        if (i11 == this.opCodes.length) {
            Object[] objArrCopyOf = Arrays.copyOf(this.opCodes, this.opCodesSize + n.j(i11, 1024));
            s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.opCodes = (d[]) objArrCopyOf;
        }
        p(this.intArgsSize + operation.getInts());
        q(this.objectArgsSize + operation.getObjects());
        d[] dVarArr = this.opCodes;
        int i12 = this.opCodesSize;
        this.opCodesSize = i12 + 1;
        dVarArr[i12] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Ls2/g$c;", "", "Ls2/g;", "stack", "a", "(Ls2/g;)Ls2/g;", "Ls2/d$q;", "parameter", "", "value", "Ljn0/h0;", "c", "(Ls2/g;II)V", "T", "Ls2/d$t;", DateTokenConverter.CONVERTER_KEY, "(Ls2/g;ILjava/lang/Object;)V", "Ls2/d;", "b", "(Ls2/g;)Ls2/d;", "operation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @vn0.b
    public static final class c {
        public static final d b(g gVar) {
            return gVar.v();
        }

        public static final void c(g gVar, int i11, int i12) {
            int i13 = 1 << i11;
            if (!((gVar.pushedIntMask & i13) == 0)) {
                a2.b("Already pushed argument " + b(gVar).e(i11));
            }
            gVar.pushedIntMask |= i13;
            gVar.intArgs[gVar.z(i11)] = i12;
        }

        public static final <T> void d(g gVar, int i11, T t11) {
            int i12 = 1 << i11;
            if (!((gVar.pushedObjectMask & i12) == 0)) {
                a2.b("Already pushed argument " + b(gVar).f(i11));
            }
            gVar.pushedObjectMask |= i12;
            gVar.objectArgs[gVar.A(i11)] = t11;
        }

        public static g a(g gVar) {
            return gVar;
        }
    }
}
