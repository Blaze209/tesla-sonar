package p020r2;

import androidx.collection.n0;
import androidx.collection.o0;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.snapshots.j;
import androidx.compose.runtime.snapshots.n;
import b3.k;
import b3.l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import z2.IntRef;

/* JADX INFO: renamed from: r2.g0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001/B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lr2/g0;", "T", "Lb3/l;", "Lr2/h0;", "Lkotlin/Function0;", "calculation", "Lr2/m3;", "policy", "<init>", "(Lwn0/a;Lr2/m3;)V", "Lr2/g0$a;", "readable", "Landroidx/compose/runtime/snapshots/g;", "snapshot", "", "forceDependencyReads", "G", "(Lr2/g0$a;Landroidx/compose/runtime/snapshots/g;ZLwn0/a;)Lr2/g0$a;", "", "K", "()Ljava/lang/String;", "Landroidx/compose/runtime/snapshots/n;", Gender.FEMALE, "(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;", "value", "Ljn0/h0;", "k", "(Landroidx/compose/runtime/snapshots/n;)V", "toString", "b", "Lwn0/a;", "c", "Lr2/m3;", "e", "()Lr2/m3;", DateTokenConverter.CONVERTER_KEY, "Lr2/g0$a;", "first", "u", "()Landroidx/compose/runtime/snapshots/n;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "Lr2/h0$a;", "A", "()Lr2/h0$a;", "currentRecord", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DerivedState<T> extends l implements h0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<T> calculation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m3<T> policy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a<T> first = new a<>();

    /* JADX INFO: renamed from: r2.g0$a */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 6*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00132\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR(\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u0014\u00105\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010,¨\u00067"}, d2 = {"Lr2/g0$a;", "T", "Landroidx/compose/runtime/snapshots/n;", "Lr2/h0$a;", "<init>", "()V", "value", "Ljn0/h0;", "c", "(Landroidx/compose/runtime/snapshots/n;)V", DateTokenConverter.CONVERTER_KEY, "()Landroidx/compose/runtime/snapshots/n;", "Lr2/h0;", "derivedState", "Landroidx/compose/runtime/snapshots/g;", "snapshot", "", "k", "(Lr2/h0;Landroidx/compose/runtime/snapshots/g;)Z", "", "l", "(Lr2/h0;Landroidx/compose/runtime/snapshots/g;)I", "I", "getValidSnapshotId", "()I", "p", "(I)V", "validSnapshotId", "getValidSnapshotWriteCount", "q", "validSnapshotWriteCount", "Landroidx/collection/n0;", "Lb3/k;", "e", "Landroidx/collection/n0;", "b", "()Landroidx/collection/n0;", "m", "(Landroidx/collection/n0;)V", "dependencies", "", "f", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "result", "g", "getResultHash", "o", "resultHash", "a", "currentValue", "h", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> extends n implements h0.a<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f106544i = 8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Object f106545j = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int validSnapshotId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int validSnapshotWriteCount;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private n0<k> dependencies = o0.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Object result = f106545j;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int resultHash;

        /* JADX INFO: renamed from: r2.g0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lr2/g0$a$a;", "", "<init>", "()V", "Unset", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object a() {
                return a.f106545j;
            }

            private Companion() {
            }
        }

        @Override // r2.h0.a
        public T a() {
            return (T) this.result;
        }

        @Override // r2.h0.a
        public n0<k> b() {
            return this.dependencies;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(n value) {
            s.i(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) value;
            m(aVar.b());
            this.result = aVar.result;
            this.resultHash = aVar.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public n d() {
            return new a();
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        public final boolean k(h0<?> derivedState, g snapshot) {
            boolean z11;
            boolean z12;
            synchronized (j.I()) {
                z11 = true;
                z12 = (this.validSnapshotId == snapshot.getId() && this.validSnapshotWriteCount == snapshot.getWriteCount()) ? false : true;
            }
            if (this.result == f106545j || (z12 && this.resultHash != l(derivedState, snapshot))) {
                z11 = false;
            }
            if (!z11 || !z12) {
                return z11;
            }
            synchronized (j.I()) {
                this.validSnapshotId = snapshot.getId();
                this.validSnapshotWriteCount = snapshot.getWriteCount();
                h0 h0Var = h0.f84049a;
            }
            return z11;
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
        public final int l(h0<?> derivedState, g snapshot) {
            n0<k> n0VarB;
            int iC;
            int size;
            i0[] i0VarArrM;
            int i11;
            int i12;
            synchronized (j.I()) {
                n0VarB = b();
            }
            int i13 = 7;
            if (!n0VarB.h()) {
                return 7;
            }
            t2.b<i0> bVarC = n3.c();
            int size2 = bVarC.getSize();
            if (size2 > 0) {
                i0[] i0VarArrM2 = bVarC.m();
                int i14 = 0;
                do {
                    i0VarArrM2[i14].a(derivedState);
                    i14++;
                } while (i14 < size2);
            }
            try {
                Object[] objArr = n0VarB.keys;
                int[] iArr = n0VarB.values;
                long[] jArr = n0VarB.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iC = 7;
                    int i15 = 0;
                    while (true) {
                        long j11 = jArr[i15];
                        if ((((~j11) << i13) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j11 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    Object obj = objArr[i19];
                                    int i21 = iArr[i19];
                                    i12 = i16;
                                    k kVar = (k) obj;
                                    if (i21 == 1) {
                                        n nVarF = kVar instanceof DerivedState ? ((DerivedState) kVar).F(snapshot) : j.G(kVar.getFirstStateRecord(), snapshot);
                                        iC = (((iC * 31) + c.c(nVarF)) * 31) + nVarF.getSnapshotId();
                                    }
                                } else {
                                    i12 = i16;
                                }
                                j11 >>= i12;
                                i18++;
                                i16 = i12;
                            }
                            if (i17 != i16) {
                                break;
                            }
                        }
                        if (i15 != length) {
                            i15++;
                            i13 = i13;
                        } else {
                            i13 = iC;
                        }
                    }
                    h0 h0Var = h0.f84049a;
                    size = bVarC.getSize();
                    if (size > 0) {
                        i0VarArrM = bVarC.m();
                        i11 = 0;
                        do {
                            i0VarArrM[i11].b(derivedState);
                            i11++;
                        } while (i11 < size);
                    }
                    return iC;
                }
                iC = i13;
                h0 h0Var2 = h0.f84049a;
                size = bVarC.getSize();
                if (size > 0) {
                    i0VarArrM = bVarC.m();
                    i11 = 0;
                    do {
                        i0VarArrM[i11].b(derivedState);
                        i11++;
                    } while (i11 < size);
                }
                return iC;
            } catch (Throwable th2) {
                int size3 = bVarC.getSize();
                if (size3 > 0) {
                    i0[] i0VarArrM3 = bVarC.m();
                    int i22 = 0;
                    do {
                        i0VarArrM3[i22].b(derivedState);
                        i22++;
                    } while (i22 < size3);
                }
                throw th2;
            }
        }

        public void m(n0<k> n0Var) {
            this.dependencies = n0Var;
        }

        public final void n(Object obj) {
            this.result = obj;
        }

        public final void o(int i11) {
            this.resultHash = i11;
        }

        public final void p(int i11) {
            this.validSnapshotId = i11;
        }

        public final void q(int i11) {
            this.validSnapshotWriteCount = i11;
        }
    }

    /* JADX INFO: renamed from: r2.g0$b */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<Object, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DerivedState<T> f106551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ IntRef f106552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.collection.h0<k> f106553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f106554f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DerivedState<T> derivedState, IntRef intRef, androidx.collection.h0<k> h0Var, int i11) {
            super(1);
            this.f106551c = derivedState;
            this.f106552d = intRef;
            this.f106553e = h0Var;
            this.f106554f = i11;
        }

        public final void b(Object obj) {
            if (obj == this.f106551c) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof k) {
                int element = this.f106552d.getElement();
                androidx.collection.h0<k> h0Var = this.f106553e;
                h0Var.s(obj, Math.min(element - this.f106554f, h0Var.e(obj, Integer.MAX_VALUE)));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            b(obj);
            return h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedState(wn0.a<? extends T> aVar, m3<T> m3Var) {
        this.calculation = aVar;
        this.policy = m3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a<T> G(a<T> readable, g snapshot, boolean forceDependencyReads, wn0.a<? extends T> calculation) throws Throwable {
        g.Companion companion;
        m3<T> m3VarE;
        int i11;
        a<T> aVar = readable;
        boolean z11 = true;
        if (!aVar.k(this, snapshot)) {
            int i12 = 0;
            androidx.collection.h0 h0Var = new androidx.collection.h0(0, 1, null);
            IntRef intRef = (IntRef) o3.f106743a.a();
            if (intRef == null) {
                intRef = new IntRef(0);
                o3.f106743a.b(intRef);
            }
            int element = intRef.getElement();
            t2.b<i0> bVarC = n3.c();
            int size = bVarC.getSize();
            if (size > 0) {
                i0[] i0VarArrM = bVarC.m();
                int i13 = 0;
                do {
                    i0VarArrM[i13].a(this);
                    i13++;
                } while (i13 < size);
            }
            try {
                intRef.b(element + 1);
                Object objH = g.INSTANCE.h(new b(this, intRef, h0Var, element), null, calculation);
                intRef.b(element);
                int size2 = bVarC.getSize();
                if (size2 > 0) {
                    i0[] i0VarArrM2 = bVarC.m();
                    do {
                        i0VarArrM2[i12].b(this);
                        i12++;
                    } while (i12 < size2);
                }
                synchronized (j.I()) {
                    try {
                        companion = g.INSTANCE;
                        g gVarC = companion.c();
                        if (aVar.getResult() == a.INSTANCE.a() || (m3VarE = e()) == 0 || !m3VarE.a(objH, aVar.getResult())) {
                            aVar = (a) j.O(this.first, this, gVarC);
                            aVar.m(h0Var);
                            aVar.o(aVar.l(this, gVarC));
                            aVar.n(objH);
                        } else {
                            aVar.m(h0Var);
                            aVar.o(aVar.l(this, gVarC));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                IntRef intRef2 = (IntRef) o3.f106743a.a();
                if (intRef2 == null || intRef2.getElement() != 0) {
                    return aVar;
                }
                companion.g();
                synchronized (j.I()) {
                    g gVarC2 = companion.c();
                    aVar.p(gVarC2.getId());
                    aVar.q(gVarC2.getWriteCount());
                    h0 h0Var2 = h0.f84049a;
                }
                return aVar;
            } catch (Throwable th3) {
                int size3 = bVarC.getSize();
                if (size3 > 0) {
                    i0[] i0VarArrM3 = bVarC.m();
                    int i14 = 0;
                    do {
                        i0VarArrM3[i14].b(this);
                        i14++;
                    } while (i14 < size3);
                }
                throw th3;
            }
        }
        if (forceDependencyReads) {
            t2.b<i0> bVarC2 = n3.c();
            int size4 = bVarC2.getSize();
            if (size4 > 0) {
                i0[] i0VarArrM4 = bVarC2.m();
                int i15 = 0;
                do {
                    i0VarArrM4[i15].a(this);
                    i15++;
                } while (i15 < size4);
            }
            try {
                n0<k> n0VarB = aVar.b();
                IntRef intRef3 = (IntRef) o3.f106743a.a();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    o3.f106743a.b(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr = n0VarB.keys;
                int[] iArr = n0VarB.values;
                long[] jArr = n0VarB.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j11 = jArr[i16];
                        boolean z12 = z11;
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j11 & 255) < 128) {
                                    int i21 = (i16 << 3) + i19;
                                    try {
                                        i11 = i17;
                                        k kVar = (k) objArr[i21];
                                        intRef3.b(element2 + iArr[i21]);
                                        wn0.l<Object, h0> lVarH = snapshot.h();
                                        if (lVarH != null) {
                                            lVarH.invoke(kVar);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        int size5 = bVarC2.getSize();
                                        if (size5 > 0) {
                                            i0[] i0VarArrM5 = bVarC2.m();
                                            int i22 = 0;
                                            do {
                                                i0VarArrM5[i22].b(this);
                                                i22++;
                                            } while (i22 < size5);
                                        }
                                        throw th;
                                    }
                                } else {
                                    i11 = i17;
                                }
                                j11 >>= i11;
                                i19++;
                                i17 = i11;
                            }
                            if (i18 != i17) {
                                break;
                            }
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16++;
                        z11 = z12;
                    }
                }
                intRef3.b(element2);
                h0 h0Var3 = h0.f84049a;
                int size6 = bVarC2.getSize();
                if (size6 > 0) {
                    i0[] i0VarArrM6 = bVarC2.m();
                    int i23 = 0;
                    do {
                        i0VarArrM6[i23].b(this);
                        i23++;
                    } while (i23 < size6);
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return aVar;
    }

    private final String K() {
        a aVar = (a) j.F(this.first);
        return aVar.k(this, g.INSTANCE.c()) ? String.valueOf(aVar.getResult()) : "<Not calculated>";
    }

    @Override // p020r2.h0
    public h0.a<T> A() {
        g gVarC = g.INSTANCE.c();
        return G((a) j.G(this.first, gVarC), gVarC, false, this.calculation);
    }

    public final n F(g snapshot) {
        return G((a) j.G(this.first, snapshot), snapshot, false, this.calculation);
    }

    @Override // p020r2.h0
    public m3<T> e() {
        return this.policy;
    }

    @Override // p020r2.y3
    public T getValue() {
        g.Companion companion = g.INSTANCE;
        wn0.l<Object, h0> lVarH = companion.c().h();
        if (lVarH != null) {
            lVarH.invoke(this);
        }
        g gVarC = companion.c();
        return (T) G((a) j.G(this.first, gVarC), gVarC, true, this.calculation).getResult();
    }

    @Override // b3.k
    public void k(n value) {
        s.i(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (a) value;
    }

    public String toString() {
        return "DerivedState(value=" + K() + ")@" + hashCode();
    }

    @Override // b3.k
    /* JADX INFO: renamed from: u */
    public n getFirstStateRecord() {
        return this.first;
    }
}
