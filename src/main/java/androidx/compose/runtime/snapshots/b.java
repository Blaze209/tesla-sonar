package androidx.compose.runtime.snapshots;

import androidx.collection.l0;
import androidx.collection.w0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.x;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p020r2.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u0000 52\u00020\u0001:\u0001dBE\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ?\u0010\u0012\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ%\u0010\u0018\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\bH\u0010¢\u0006\u0004\b \u0010\u000eJ5\u0010&\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00022\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0006\u0010%\u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0000¢\u0006\u0004\b(\u0010\u000eJ\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0010¢\u0006\u0004\b5\u00106R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\"\u0010A\u001a\u00020\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b=\u0010&\u001a\u0004\b>\u0010?\"\u0004\b@\u0010*R:\u0010I\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010B2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010B8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b>\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010P\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010V\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u00102R\"\u0010[\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010/R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\"\u0010b\u001a\u00020\\8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010_¨\u0006e"}, d2 = {"Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/g;", "", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "Lkotlin/Function1;", "", "Ljn0/h0;", "readObserver", "writeObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/i;Lwn0/l;Lwn0/l;)V", "R", "()V", "S", "A", Gender.NONE, "Q", "(Lwn0/l;Lwn0/l;)Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", DateTokenConverter.CONVERTER_KEY, "x", "(Lwn0/l;)Landroidx/compose/runtime/snapshots/g;", "snapshot", "m", "(Landroidx/compose/runtime/snapshots/g;)V", "n", "o", "c", "r", "snapshotId", "", "Landroidx/compose/runtime/snapshots/n;", "optimisticMerges", "invalidSnapshots", "I", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/h;", "B", "J", "(I)V", "L", "", "handles", Gender.MALE, "([I)V", "snapshots", "K", "(Landroidx/compose/runtime/snapshots/i;)V", "Lb3/k;", "state", "p", "(Lb3/k;)V", "g", "Lwn0/l;", "H", "()Lwn0/l;", "h", "k", IntegerTokenConverter.CONVERTER_KEY, "j", "()I", "w", "writeCount", "Landroidx/collection/l0;", "<set-?>", "Landroidx/collection/l0;", "E", "()Landroidx/collection/l0;", "P", "(Landroidx/collection/l0;)V", "modified", "", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "merged", "l", "Landroidx/compose/runtime/snapshots/i;", Gender.FEMALE, "()Landroidx/compose/runtime/snapshots/i;", "setPreviousIds$runtime_release", "previousIds", "[I", "G", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", "", "Z", "D", "()Z", Gender.OTHER, "(Z)V", "applied", "readOnly", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b extends g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f5146p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f5147q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f5148r = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Object, h0> readObserver;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Object, h0> writeObserver;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int writeCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private l0<b3.k> modified;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<? extends b3.k> merged;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private i previousIds;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int[] previousPinnedSnapshots;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean applied;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/b$a;", "", "<init>", "()V", "", "EmptyIntArray", "[I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(int i11, i iVar, wn0.l<Object, h0> lVar, wn0.l<Object, h0> lVar2) {
        super(i11, iVar, null);
        this.readObserver = lVar;
        this.writeObserver = lVar2;
        this.previousIds = i.INSTANCE.a();
        this.previousPinnedSnapshots = f5148r;
        this.snapshots = 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0074 A[LOOP:0: B:7:0x001c->B:24:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[EDGE_INSN: B:28:0x0077->B:25:0x0077 BREAK  A[LOOP:0: B:7:0x001c->B:24:0x0074], SYNTHETIC] */
    private final void A() {
        l0<b3.k> l0VarE = E();
        if (l0VarE != null) {
            R();
            P(null);
            int id2 = getId();
            Object[] objArr = l0VarE.elements;
            long[] jArr = l0VarE.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                for (n firstStateRecord = ((b3.k) objArr[(i11 << 3) + i13]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                                    if (firstStateRecord.getSnapshotId() == id2 || v.g0(this.previousIds, Integer.valueOf(firstStateRecord.getSnapshotId()))) {
                                        firstStateRecord.h(0);
                                    }
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        b();
    }

    private final void N() {
        int length = this.previousPinnedSnapshots.length;
        for (int i11 = 0; i11 < length; i11++) {
            j.Y(this.previousPinnedSnapshots[i11]);
        }
    }

    private final void R() {
        if (this.applied) {
            a2.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void S() {
        if (!this.applied || ((g) this).pinningTrackingHandle >= 0) {
            return;
        }
        a2.b("Unsupported operation on a disposed or applied snapshot");
    }

    public final void B() {
        J(getId());
        h0 h0Var = h0.f84049a;
        if (getApplied() || getDisposed()) {
            return;
        }
        int id2 = getId();
        synchronized (j.I()) {
            int i11 = j.f5189e;
            j.f5189e = i11 + 1;
            u(i11);
            j.f5188d = j.f5188d.o(getId());
        }
        v(j.z(getInvalid(), id2 + 1, getId()));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018b A[EDGE_INSN: B:102:0x018b->B:77:0x018b BREAK  A[LOOP:4: B:66:0x015c->B:76:0x0188], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0149 A[Catch: all -> 0x013e, LOOP:2: B:48:0x0116->B:60:0x0149, LOOP_END, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00fa, B:45:0x010a, B:48:0x0116, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:63:0x0152, B:66:0x015c, B:68:0x0166, B:70:0x0170, B:72:0x0176, B:73:0x0180, B:76:0x0188, B:77:0x018b, B:79:0x018f, B:81:0x0196, B:82:0x01a2, B:60:0x0149), top: B:92:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0188 A[Catch: all -> 0x013e, LOOP:4: B:66:0x015c->B:76:0x0188, LOOP_END, TryCatch #1 {all -> 0x013e, blocks: (B:43:0x00fa, B:45:0x010a, B:48:0x0116, B:50:0x0122, B:52:0x012c, B:54:0x0132, B:57:0x0141, B:63:0x0152, B:66:0x015c, B:68:0x0166, B:70:0x0170, B:72:0x0176, B:73:0x0180, B:76:0x0188, B:77:0x018b, B:79:0x018f, B:81:0x0196, B:82:0x01a2, B:60:0x0149), top: B:92:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0150 A[EDGE_INSN: B:97:0x0150->B:62:0x0150 BREAK  A[LOOP:2: B:48:0x0116->B:60:0x0149], SYNTHETIC] */
    public h C() {
        l0<b3.k> l0VarE;
        long j11;
        long j12;
        l0<b3.k> l0VarE2 = E();
        Map<n, ? extends n> mapR = l0VarE2 != null ? j.R((b) j.f5194j.get(), this, j.f5188d.k(((androidx.compose.runtime.snapshots.a) j.f5194j.get()).getId())) : null;
        List listM = v.m();
        synchronized (j.I()) {
            try {
                j.g0(this);
                if (l0VarE2 == null || l0VarE2.get_size() == 0) {
                    c();
                    androidx.compose.runtime.snapshots.a aVar = (androidx.compose.runtime.snapshots.a) j.f5194j.get();
                    j.a0(aVar, j.f5185a);
                    l0VarE = aVar.E();
                    if (l0VarE == null || !l0VarE.e()) {
                        l0VarE = null;
                    } else {
                        listM = j.f5192h;
                    }
                } else {
                    androidx.compose.runtime.snapshots.a aVar2 = (androidx.compose.runtime.snapshots.a) j.f5194j.get();
                    h hVarI = I(j.f5189e, mapR, j.f5188d.k(aVar2.getId()));
                    if (!s.f(hVarI, h.b.f5172a)) {
                        return hVarI;
                    }
                    c();
                    j.a0(aVar2, j.f5185a);
                    l0VarE = aVar2.E();
                    P(null);
                    aVar2.P(null);
                    listM = j.f5192h;
                }
                h0 h0Var = h0.f84049a;
                this.applied = true;
                if (l0VarE != null) {
                    Set setA = t2.e.a(l0VarE);
                    if (!setA.isEmpty()) {
                        int size = listM.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((wn0.p) listM.get(i11)).invoke(setA, this);
                        }
                    }
                }
                if (l0VarE2 != null && l0VarE2.e()) {
                    Set setA2 = t2.e.a(l0VarE2);
                    int size2 = listM.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ((wn0.p) listM.get(i12)).invoke(setA2, this);
                    }
                }
                synchronized (j.I()) {
                    try {
                        r();
                        j.C();
                        if (l0VarE != null) {
                            Object[] objArr = l0VarE.elements;
                            long[] jArr = l0VarE.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i13 = 0;
                                j11 = 128;
                                while (true) {
                                    long j13 = jArr[i13];
                                    j12 = 255;
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i13 != length) {
                                            break;
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                                        for (int i15 = 0; i15 < i14; i15++) {
                                            if ((j13 & 255) < 128) {
                                                j.U((b3.k) objArr[(i13 << 3) + i15]);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length) {
                                            break;
                                        }
                                        i13++;
                                    }
                                }
                            } else {
                                j11 = 128;
                                j12 = 255;
                            }
                        } else {
                            j11 = 128;
                            j12 = 255;
                        }
                        if (l0VarE2 != null) {
                            Object[] objArr2 = l0VarE2.elements;
                            long[] jArr2 = l0VarE2.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j14 = jArr2[i16];
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i16 != length2) {
                                            break;
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j14 & j12) < j11) {
                                                j.U((b3.k) objArr2[(i16 << 3) + i18]);
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i17 != 8) {
                                            break;
                                        }
                                        if (i16 != length2) {
                                            break;
                                        }
                                        i16++;
                                    }
                                }
                            }
                        }
                        List<? extends b3.k> list = this.merged;
                        if (list != null) {
                            int size3 = list.size();
                            for (int i19 = 0; i19 < size3; i19++) {
                                j.U(list.get(i19));
                            }
                        }
                        this.merged = null;
                        h0 h0Var2 = h0.f84049a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return h.b.f5172a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public l0<b3.k> E() {
        return this.modified;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final i getPreviousIds() {
        return this.previousIds;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: H */
    public wn0.l<Object, h0> h() {
        return this.readObserver;
    }

    public final h I(int snapshotId, Map<n, ? extends n> optimisticMerges, i invalidSnapshots) {
        i iVar;
        Object[] objArr;
        long[] jArr;
        i iVar2;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        n nVarW;
        n nVarQ;
        i iVarN = getInvalid().o(getId()).n(this.previousIds);
        l0<b3.k> l0VarE = E();
        s.h(l0VarE);
        Object[] objArr3 = l0VarE.elements;
        long[] jArr3 = l0VarE.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List<? extends b3.k> listP0 = null;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr3[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j11 & 255) < 128) {
                            b3.k kVar = (b3.k) objArr3[(i12 << 3) + i15];
                            i11 = i13;
                            n firstStateRecord = kVar.getFirstStateRecord();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            ArrayList arrayList2 = arrayList;
                            n nVarW2 = j.W(firstStateRecord, snapshotId, invalidSnapshots);
                            if (nVarW2 == null || (nVarW = j.W(firstStateRecord, getId(), iVarN)) == null) {
                                iVar2 = iVarN;
                            } else {
                                iVar2 = iVarN;
                                if (nVarW.getSnapshotId() != 1 && !s.f(nVarW2, nVarW)) {
                                    n nVarW3 = j.W(firstStateRecord, getId(), getInvalid());
                                    if (nVarW3 == null) {
                                        j.V();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (optimisticMerges == null || (nVarQ = optimisticMerges.get(nVarW2)) == null) {
                                        nVarQ = kVar.q(nVarW, nVarW2, nVarW3);
                                    }
                                    if (nVarQ == null) {
                                        return new h.a(this);
                                    }
                                    if (!s.f(nVarQ, nVarW3)) {
                                        if (s.f(nVarQ, nVarW2)) {
                                            ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                                            arrayList3.add(x.a(kVar, nVarW2.d()));
                                            if (listP0 == null) {
                                                listP0 = new ArrayList<>();
                                            }
                                            listP0.add(kVar);
                                            arrayList = arrayList3;
                                        } else {
                                            arrayList = arrayList2 == null ? new ArrayList() : arrayList2;
                                            arrayList.add(!s.f(nVarQ, nVarW) ? x.a(kVar, nVarQ) : x.a(kVar, nVarW.d()));
                                        }
                                    }
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            iVar2 = iVarN;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i11 = i13;
                        }
                        j11 >>= i11;
                        i15++;
                        i13 = i11;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iVarN = iVar2;
                    }
                    iVar = iVarN;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    iVar = iVarN;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                objArr3 = objArr;
                jArr3 = jArr;
                iVarN = iVar;
            }
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                Pair pair = (Pair) arrayList.get(i16);
                b3.k kVar2 = (b3.k) pair.a();
                n nVar = (n) pair.b();
                nVar.h(getId());
                synchronized (j.I()) {
                    nVar.g(kVar2.getFirstStateRecord());
                    kVar2.k(nVar);
                    h0 h0Var = h0.f84049a;
                }
            }
        }
        if (listP0 != null) {
            int size2 = listP0.size();
            for (int i17 = 0; i17 < size2; i17++) {
                l0VarE.x(listP0.get(i17));
            }
            List<? extends b3.k> list = this.merged;
            if (list != null) {
                listP0 = v.P0(list, listP0);
            }
            this.merged = listP0;
        }
        return h.b.f5172a;
    }

    public final void J(int id2) {
        synchronized (j.I()) {
            this.previousIds = this.previousIds.o(id2);
            h0 h0Var = h0.f84049a;
        }
    }

    public final void K(i snapshots) {
        synchronized (j.I()) {
            this.previousIds = this.previousIds.n(snapshots);
            h0 h0Var = h0.f84049a;
        }
    }

    public final void L(int id2) {
        if (id2 >= 0) {
            this.previousPinnedSnapshots = p013kotlin.collections.n.J(this.previousPinnedSnapshots, id2);
        }
    }

    public final void M(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = p013kotlin.collections.n.K(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    public final void O(boolean z11) {
        this.applied = z11;
    }

    public void P(l0<b3.k> l0Var) {
        this.modified = l0Var;
    }

    public b Q(wn0.l<Object, h0> readObserver, wn0.l<Object, h0> writeObserver) throws Throwable {
        z();
        S();
        J(getId());
        synchronized (j.I()) {
            try {
                int i11 = j.f5189e;
                j.f5189e = i11 + 1;
                j.f5188d = j.f5188d.o(i11);
                i invalid = getInvalid();
                v(invalid.o(i11));
                try {
                    c cVar = new c(i11, j.z(invalid, getId() + 1, i11), j.L(readObserver, h(), false, 4, null), j.M(writeObserver, k()), this);
                    if (getApplied() || getDisposed()) {
                        return cVar;
                    }
                    int id2 = getId();
                    synchronized (j.I()) {
                        int i12 = j.f5189e;
                        j.f5189e = i12 + 1;
                        u(i12);
                        j.f5188d = j.f5188d.o(getId());
                        h0 h0Var = h0.f84049a;
                    }
                    v(j.z(getInvalid(), id2 + 1, getId()));
                    return cVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void c() {
        j.f5188d = j.f5188d.k(getId()).j(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        n(this);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean i() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public wn0.l<Object, h0> k() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void m(g snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void n(g snapshot) {
        if (!(this.snapshots > 0)) {
            a2.a("no pending nested snapshots");
        }
        int i11 = this.snapshots - 1;
        this.snapshots = i11;
        if (i11 != 0 || this.applied) {
            return;
        }
        A();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
        if (this.applied || getDisposed()) {
            return;
        }
        B();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void p(b3.k state) {
        l0<b3.k> l0VarE = E();
        if (l0VarE == null) {
            l0VarE = w0.a();
            P(l0VarE);
        }
        l0VarE.h(state);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void r() {
        N();
        super.r();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void w(int i11) {
        this.writeCount = i11;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g x(wn0.l<Object, h0> readObserver) {
        d dVar;
        z();
        S();
        int id2 = getId();
        J(getId());
        synchronized (j.I()) {
            int i11 = j.f5189e;
            j.f5189e = i11 + 1;
            j.f5188d = j.f5188d.o(i11);
            dVar = new d(i11, j.z(getInvalid(), id2 + 1, i11), j.L(readObserver, h(), false, 4, null), this);
        }
        if (getApplied() || getDisposed()) {
            return dVar;
        }
        int id3 = getId();
        synchronized (j.I()) {
            int i12 = j.f5189e;
            j.f5189e = i12 + 1;
            u(i12);
            j.f5188d = j.f5188d.o(getId());
            h0 h0Var = h0.f84049a;
        }
        v(j.z(getInvalid(), id3 + 1, getId()));
        return dVar;
    }
}
