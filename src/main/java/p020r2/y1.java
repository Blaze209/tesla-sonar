package p020r2;

import androidx.collection.c0;
import androidx.collection.k0;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.List;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b#\u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\"\u0010.\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010(\u001a\u0004\b$\u0010*\"\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R-\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003048FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b+\u00107R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003098F¢\u0006\u0006\u001a\u0004\b5\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Lr2/y1;", "", "", "Lr2/z0;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", Action.KEY_ATTRIBUTE, "dataKey", DateTokenConverter.CONVERTER_KEY, "(ILjava/lang/Object;)Lr2/z0;", "keyInfo", "", "h", "(Lr2/z0;)Z", "from", "to", "Ljn0/h0;", "k", "(II)V", "count", "j", "(III)V", "insertIndex", IntegerTokenConverter.CONVERTER_KEY, "(Lr2/z0;I)V", Kind.GROUP, "newCount", "n", "(II)Z", "m", "(Lr2/z0;)I", "g", "o", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "e", "()I", "c", "l", "(I)V", "groupIndex", "usedKeys", "Landroidx/collection/c0;", "Lr2/q0;", "Landroidx/collection/c0;", "groupInfos", "Lr2/o1;", "f", "Lkotlin/Lazy;", "()Landroidx/collection/k0;", "keyMap", "", "used", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<z0> keyInfos;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int groupIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<z0> usedKeys;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c0<q0> groupInfos;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy keyMap;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr2/o1;", "", "Lr2/z0;", "b", "()Landroidx/collection/k0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<o1<Object, z0>> {
        a() {
            super(0);
        }

        public final k0 b() {
            k0 k0VarK = o.K(y1.this.b().size());
            y1 y1Var = y1.this;
            int size = y1Var.b().size();
            for (int i11 = 0; i11 < size; i11++) {
                z0 z0Var = y1Var.b().get(i11);
                o1.f(k0VarK, o.C(z0Var), z0Var);
            }
            return k0VarK;
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ o1<Object, z0> invoke() {
            return o1.a(b());
        }
    }

    public y1(List<z0> list, int i11) {
        this.keyInfos = list;
        this.startIndex = i11;
        if (!(i11 >= 0)) {
            a2.a("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        c0<q0> c0Var = new c0<>(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i12 = 0; i12 < size; i12++) {
            z0 z0Var = this.keyInfos.get(i12);
            c0Var.t(z0Var.getLocation(), new q0(i12, nodes, z0Var.getNodes()));
            nodes += z0Var.getNodes();
        }
        this.groupInfos = c0Var;
        this.keyMap = m.b(new a());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<z0> b() {
        return this.keyInfos;
    }

    public final k0 c() {
        return ((o1) this.keyMap.getValue()).getMap();
    }

    public final z0 d(int key, Object dataKey) {
        return (z0) o1.e(c(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<z0> f() {
        return this.usedKeys;
    }

    public final int g(z0 keyInfo) {
        q0 q0VarC = this.groupInfos.c(keyInfo.getLocation());
        if (q0VarC != null) {
            return q0VarC.getNodeIndex();
        }
        return -1;
    }

    public final boolean h(z0 keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void i(z0 keyInfo, int insertIndex) {
        this.groupInfos.t(keyInfo.getLocation(), new q0(-1, insertIndex, 0));
    }

    public final void j(int from, int to2, int count) {
        char c11;
        long j11;
        char c12;
        long j12;
        char c13 = 7;
        long j13 = -9187201950435737472L;
        if (from > to2) {
            c0<q0> c0Var = this.groupInfos;
            Object[] objArr = c0Var.values;
            long[] jArr = c0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j14 = jArr[i11];
                if ((((~j14) << c13) & j14 & j13) != j13) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j14 & 255) < 128) {
                            c12 = c13;
                            q0 q0Var = (q0) objArr[(i11 << 3) + i13];
                            j12 = j13;
                            int nodeIndex = q0Var.getNodeIndex();
                            if (from <= nodeIndex && nodeIndex < from + count) {
                                q0Var.e((nodeIndex - from) + to2);
                            } else if (to2 <= nodeIndex && nodeIndex < from) {
                                q0Var.e(nodeIndex + count);
                            }
                        } else {
                            c12 = c13;
                            j12 = j13;
                        }
                        j14 >>= 8;
                        i13++;
                        c13 = c12;
                        j13 = j12;
                    }
                    c11 = c13;
                    j11 = j13;
                    if (i12 != 8) {
                        return;
                    }
                } else {
                    c11 = c13;
                    j11 = j13;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                c13 = c11;
                j13 = j11;
            }
        } else {
            if (to2 <= from) {
                return;
            }
            c0<q0> c0Var2 = this.groupInfos;
            Object[] objArr2 = c0Var2.values;
            long[] jArr2 = c0Var2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j15 = jArr2[i14];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j15 & 255) < 128) {
                            q0 q0Var2 = (q0) objArr2[(i14 << 3) + i16];
                            int nodeIndex2 = q0Var2.getNodeIndex();
                            if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                                q0Var2.e((nodeIndex2 - from) + to2);
                            } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to2) {
                                q0Var2.e(nodeIndex2 - count);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i15 != 8) {
                        return;
                    }
                }
                if (i14 == length2) {
                    return;
                } else {
                    i14++;
                }
            }
        }
    }

    public final void k(int from, int to2) {
        char c11;
        long j11;
        char c12;
        long j12;
        char c13 = 7;
        long j13 = -9187201950435737472L;
        if (from > to2) {
            c0<q0> c0Var = this.groupInfos;
            Object[] objArr = c0Var.values;
            long[] jArr = c0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j14 = jArr[i11];
                if ((((~j14) << c13) & j14 & j13) != j13) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j14 & 255) < 128) {
                            c12 = c13;
                            q0 q0Var = (q0) objArr[(i11 << 3) + i13];
                            j12 = j13;
                            int slotIndex = q0Var.getSlotIndex();
                            if (slotIndex == from) {
                                q0Var.f(to2);
                            } else if (to2 <= slotIndex && slotIndex < from) {
                                q0Var.f(slotIndex + 1);
                            }
                        } else {
                            c12 = c13;
                            j12 = j13;
                        }
                        j14 >>= 8;
                        i13++;
                        c13 = c12;
                        j13 = j12;
                    }
                    c11 = c13;
                    j11 = j13;
                    if (i12 != 8) {
                        return;
                    }
                } else {
                    c11 = c13;
                    j11 = j13;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                c13 = c11;
                j13 = j11;
            }
        } else {
            if (to2 <= from) {
                return;
            }
            c0<q0> c0Var2 = this.groupInfos;
            Object[] objArr2 = c0Var2.values;
            long[] jArr2 = c0Var2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j15 = jArr2[i14];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j15 & 255) < 128) {
                            q0 q0Var2 = (q0) objArr2[(i14 << 3) + i16];
                            int slotIndex2 = q0Var2.getSlotIndex();
                            if (slotIndex2 == from) {
                                q0Var2.f(to2);
                            } else if (from + 1 <= slotIndex2 && slotIndex2 < to2) {
                                q0Var2.f(slotIndex2 - 1);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i15 != 8) {
                        return;
                    }
                }
                if (i14 == length2) {
                    return;
                } else {
                    i14++;
                }
            }
        }
    }

    public final void l(int i11) {
        this.groupIndex = i11;
    }

    public final int m(z0 keyInfo) {
        q0 q0VarC = this.groupInfos.c(keyInfo.getLocation());
        if (q0VarC != null) {
            return q0VarC.getSlotIndex();
        }
        return -1;
    }

    public final boolean n(int group, int newCount) {
        int nodeIndex;
        q0 q0VarC = this.groupInfos.c(group);
        if (q0VarC == null) {
            return false;
        }
        int nodeIndex2 = q0VarC.getNodeIndex();
        int nodeCount = newCount - q0VarC.getNodeCount();
        q0VarC.d(newCount);
        if (nodeCount == 0) {
            return true;
        }
        c0<q0> c0Var = this.groupInfos;
        Object[] objArr = c0Var.values;
        long[] jArr = c0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        q0 q0Var = (q0) objArr[(i11 << 3) + i13];
                        if (q0Var.getNodeIndex() >= nodeIndex2 && !s.f(q0Var, q0VarC) && (nodeIndex = q0Var.getNodeIndex() + nodeCount) >= 0) {
                            q0Var.e(nodeIndex);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    public final int o(z0 keyInfo) {
        q0 q0VarC = this.groupInfos.c(keyInfo.getLocation());
        return q0VarC != null ? q0VarC.getNodeCount() : keyInfo.getNodes();
    }
}
