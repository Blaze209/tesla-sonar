package androidx.compose.runtime.snapshots;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Iterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB+\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "", "", "", "upperSet", "lowerSet", "lowerBound", "", "belowBound", "<init>", "(JJI[I)V", "bit", "", "l", "(I)Z", "o", "(I)Landroidx/compose/runtime/snapshots/i;", "k", "bits", "j", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/i;", "n", "", "iterator", "()Ljava/util/Iterator;", "default", "m", "(I)I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "c", "I", DateTokenConverter.CONVERTER_KEY, "[I", "e", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements Iterable<Integer>, xn0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i f5174f = new i(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long upperSet;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long lowerSet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int lowerBound;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int[] belowBound;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/i$a;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/i;", "EMPTY", "Landroidx/compose/runtime/snapshots/i;", "a", "()Landroidx/compose/runtime/snapshots/i;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.f5174f;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lho0/k;", "", "Ljn0/h0;", "<anonymous>", "(Lho0/k;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, 300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    static final class b extends RestrictedSuspendLambda implements wn0.p<ho0.k<? super Integer>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5179n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f5180o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5181p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5182q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f5183r;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = i.this.new b(continuation);
            bVar.f5183r = obj;
            return bVar;
        }

        @Override // wn0.p
        public final Object invoke(ho0.k<? super Integer> kVar, Continuation<? super h0> continuation) {
            return ((b) create(kVar, continuation)).invokeSuspend(h0.f84049a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:43:0x00f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f0 -> B:42:0x00f1). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private i(long j11, long j12, int i11, int[] iArr) {
        this.upperSet = j11;
        this.lowerSet = j12;
        this.lowerBound = i11;
        this.belowBound = iArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return ho0.l.b(new b(null)).iterator();
    }

    public final i j(i bits) {
        i iVarK;
        i iVar = f5174f;
        if (bits == iVar) {
            return this;
        }
        if (this == iVar) {
            return iVar;
        }
        int i11 = bits.lowerBound;
        int i12 = this.lowerBound;
        if (i11 == i12) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new i(this.upperSet & (~bits.upperSet), this.lowerSet & (~bits.lowerSet), i12, iArr2);
            }
        }
        int[] iArr3 = bits.belowBound;
        if (iArr3 != null) {
            iVarK = this;
            for (int i13 : iArr3) {
                iVarK = iVarK.k(i13);
            }
        } else {
            iVarK = this;
        }
        if (bits.lowerSet != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((bits.lowerSet & (1 << i14)) != 0) {
                    iVarK = iVarK.k(bits.lowerBound + i14);
                }
            }
        }
        if (bits.upperSet != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if ((bits.upperSet & (1 << i15)) != 0) {
                    iVarK = iVarK.k(i15 + 64 + bits.lowerBound);
                }
            }
        }
        return iVarK;
    }

    public final i k(int bit) {
        int[] iArr;
        int iA;
        int i11 = this.lowerBound;
        int i12 = bit - i11;
        if (i12 >= 0 && i12 < 64) {
            long j11 = 1 << i12;
            long j12 = this.lowerSet;
            if ((j12 & j11) != 0) {
                return new i(this.upperSet, (~j11) & j12, i11, this.belowBound);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j13 = 1 << (i12 - 64);
            long j14 = this.upperSet;
            if ((j14 & j13) != 0) {
                return new i((~j13) & j14, this.lowerSet, i11, this.belowBound);
            }
        } else if (i12 < 0 && (iArr = this.belowBound) != null && (iA = b3.f.a(iArr, bit)) >= 0) {
            int length = iArr.length;
            int i13 = length - 1;
            if (i13 == 0) {
                return new i(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[i13];
            if (iA > 0) {
                p013kotlin.collections.n.n(iArr, iArr2, 0, 0, iA);
            }
            if (iA < i13) {
                p013kotlin.collections.n.n(iArr, iArr2, iA, iA + 1, length);
            }
            return new i(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final boolean l(int bit) {
        int[] iArr;
        int i11 = bit - this.lowerBound;
        if (i11 >= 0 && i11 < 64) {
            return ((1 << i11) & this.lowerSet) != 0;
        }
        if (i11 < 64 || i11 >= 128) {
            return i11 <= 0 && (iArr = this.belowBound) != null && b3.f.a(iArr, bit) >= 0;
        }
        return ((1 << (i11 - 64)) & this.upperSet) != 0;
    }

    public final int m(int i11) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j11 = this.lowerSet;
        if (j11 != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(j11);
        }
        long j12 = this.upperSet;
        return j12 != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(j12) : i11;
    }

    public final i n(i bits) {
        i iVarO;
        i iVar = f5174f;
        if (bits == iVar) {
            return this;
        }
        if (this == iVar) {
            return bits;
        }
        int i11 = bits.lowerBound;
        int i12 = this.lowerBound;
        if (i11 == i12) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new i(this.upperSet | bits.upperSet, this.lowerSet | bits.lowerSet, i12, iArr2);
            }
        }
        int i13 = 0;
        if (this.belowBound == null) {
            int[] iArr3 = this.belowBound;
            if (iArr3 != null) {
                for (int i14 : iArr3) {
                    bits = bits.o(i14);
                }
            }
            if (this.lowerSet != 0) {
                for (int i15 = 0; i15 < 64; i15++) {
                    if ((this.lowerSet & (1 << i15)) != 0) {
                        bits = bits.o(this.lowerBound + i15);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i13 < 64) {
                    if ((this.upperSet & (1 << i13)) != 0) {
                        bits = bits.o(i13 + 64 + this.lowerBound);
                    }
                    i13++;
                }
            }
            return bits;
        }
        int[] iArr4 = bits.belowBound;
        if (iArr4 != null) {
            iVarO = this;
            for (int i16 : iArr4) {
                iVarO = iVarO.o(i16);
            }
        } else {
            iVarO = this;
        }
        if (bits.lowerSet != 0) {
            for (int i17 = 0; i17 < 64; i17++) {
                if ((bits.lowerSet & (1 << i17)) != 0) {
                    iVarO = iVarO.o(bits.lowerBound + i17);
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i13 < 64) {
                if ((bits.upperSet & (1 << i13)) != 0) {
                    iVarO = iVarO.o(i13 + 64 + bits.lowerBound);
                }
                i13++;
            }
        }
        return iVarO;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[PHI: r9
      0x0084: PHI (r9v5 java.util.ArrayList) = (r9v2 java.util.ArrayList), (r9v7 java.util.ArrayList) binds: [B:24:0x0063, B:26:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    public final i o(int bit) {
        int i11;
        int[] iArrL1;
        long j11;
        int i12 = this.lowerBound;
        int i13 = bit - i12;
        long j12 = 1;
        long j13 = 0;
        if (i13 >= 0 && i13 < 64) {
            long j14 = 1 << i13;
            long j15 = this.lowerSet;
            if ((j15 & j14) == 0) {
                return new i(this.upperSet, j15 | j14, i12, this.belowBound);
            }
        } else if (i13 >= 64 && i13 < 128) {
            long j16 = 1 << (i13 - 64);
            long j17 = this.upperSet;
            if ((j17 & j16) == 0) {
                return new i(j17 | j16, this.lowerSet, i12, this.belowBound);
            }
        } else if (i13 < 128) {
            int[] iArr = this.belowBound;
            if (iArr == null) {
                return new i(this.upperSet, this.lowerSet, i12, new int[]{bit});
            }
            int iA = b3.f.a(iArr, bit);
            if (iA < 0) {
                int i14 = -(iA + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                p013kotlin.collections.n.n(iArr, iArr2, 0, 0, i14);
                p013kotlin.collections.n.n(iArr, iArr2, i14 + 1, i14, length);
                iArr2[i14] = bit;
                return new i(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
            }
        } else if (!l(bit)) {
            long j18 = this.upperSet;
            long j19 = this.lowerSet;
            int i15 = this.lowerBound;
            int i16 = ((bit + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j21 = j19;
            long j22 = j18;
            while (true) {
                if (i15 >= i16) {
                    i11 = i15;
                    break;
                }
                if (j21 != j13) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.belowBound;
                        if (iArr3 != null) {
                            int length2 = iArr3.length;
                            int i17 = 0;
                            while (i17 < length2) {
                                arrayList.add(Integer.valueOf(iArr3[i17]));
                                i17++;
                                j13 = j13;
                            }
                        }
                    }
                    j11 = j13;
                    for (int i18 = 0; i18 < 64; i18++) {
                        if (((j12 << i18) & j21) != j11) {
                            arrayList.add(Integer.valueOf(i18 + i15));
                        }
                    }
                } else {
                    j12 = j12;
                    j11 = j13;
                }
                if (j22 == j11) {
                    i11 = i16;
                    j21 = j11;
                    break;
                }
                i15 += 64;
                j21 = j22;
                j12 = j12;
                j13 = j11;
                j22 = j13;
            }
            if (arrayList == null || (iArrL1 = v.l1(arrayList)) == null) {
                iArrL1 = this.belowBound;
            }
            return new i(j22, j21, i11, iArrL1).o(bit);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(v.y(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb2.append(b3.a.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }
}
