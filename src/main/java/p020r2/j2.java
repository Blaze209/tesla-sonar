package p020r2;

import androidx.collection.k0;
import androidx.collection.v0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00072\u0018\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001e\u001a\u00020\u00102\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0018J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00102\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0018J#\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0010\u0018\u00010,2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010?R*\u0010B\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010AR$\u0010G\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\u0011\u0010L\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bK\u0010DR\u0011\u0010N\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bM\u0010DR$\u0010Q\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010D\"\u0004\bP\u0010FR$\u0010T\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010D\"\u0004\bS\u0010FR$\u0010W\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR$\u0010Z\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010D\"\u0004\bY\u0010FR$\u0010]\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010D\"\u0004\b\\\u0010FR\u0011\u0010_\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b^\u0010D¨\u0006`"}, d2 = {"Lr2/j2;", "Lr2/w2;", "Lr2/i2;", "Lr2/l2;", "owner", "<init>", "(Lr2/l2;)V", "Lr2/h0;", "Landroidx/collection/k0;", "", "dependencies", "", "f", "(Lr2/h0;Landroidx/collection/k0;)Z", "Lr2/l;", "composer", "Ljn0/h0;", "g", "(Lr2/l;)V", "value", "Lr2/x0;", "s", "(Ljava/lang/Object;)Lr2/x0;", "x", "()V", "e", "invalidate", "Lkotlin/Function2;", "", "block", "a", "(Lwn0/p;)V", "token", "I", "(I)V", "z", "instance", "w", "(Ljava/lang/Object;)Z", "v", "(Lr2/h0;Ljava/lang/Object;)V", "instances", "u", "y", "Lkotlin/Function1;", "Lr2/p;", "h", "(I)Lwn0/l;", "flags", "b", "Lr2/l2;", "Lr2/d;", "c", "Lr2/d;", IntegerTokenConverter.CONVERTER_KEY, "()Lr2/d;", "A", "(Lr2/d;)V", "anchor", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "currentToken", "Landroidx/collection/h0;", "Landroidx/collection/h0;", "trackedInstances", "Landroidx/collection/k0;", "trackedDependencies", "o", "()Z", Gender.FEMALE, "(Z)V", "rereading", "p", "G", "skipped", "r", "valid", "j", "canRecompose", "q", "H", "used", "k", "B", "defaultsInScope", "l", "C", "defaultsInvalid", "n", "E", "requiresRecompose", "m", "D", "forcedRecompose", "t", "isConditional", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j2 implements w2, i2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f106586i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int flags;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private l2 owner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private d anchor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p<? super l, ? super Integer, h0> block;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private androidx.collection.h0<Object> trackedInstances;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private k0<h0<?>, Object> trackedDependencies;

    /* JADX INFO: renamed from: r2.j2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lr2/j2$a;", "", "<init>", "()V", "Lr2/d3;", "slots", "", "Lr2/d;", "anchors", "Lr2/l2;", "newOwner", "Ljn0/h0;", "a", "(Lr2/d3;Ljava/util/List;Lr2/l2;)V", "Lr2/a3;", "", "b", "(Lr2/a3;Ljava/util/List;)Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(SlotWriter slots, List<d> anchors, l2 newOwner) {
            if (anchors.isEmpty()) {
                return;
            }
            int size = anchors.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object objB1 = slots.b1(anchors.get(i11), 0);
                j2 j2Var = objB1 instanceof j2 ? (j2) objB1 : null;
                if (j2Var != null) {
                    j2Var.e(newOwner);
                }
            }
        }

        public final boolean b(a3 slots, List<d> anchors) {
            if (!anchors.isEmpty()) {
                int size = anchors.size();
                for (int i11 = 0; i11 < size; i11++) {
                    d dVar = anchors.get(i11);
                    if (slots.x(dVar) && (slots.z(slots.d(dVar), 0) instanceof j2)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr2/p;", "composition", "Ljn0/h0;", "a", "(Lr2/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<p, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f106595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.collection.h0<Object> f106596e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, androidx.collection.h0<Object> h0Var) {
            super(1);
            this.f106595d = i11;
            this.f106596e = h0Var;
        }

        public final void a(p pVar) {
            int i11;
            if (j2.this.currentToken != this.f106595d || !s.f(this.f106596e, j2.this.trackedInstances) || !(pVar instanceof s)) {
                return;
            }
            androidx.collection.h0<Object> h0Var = this.f106596e;
            int i12 = this.f106595d;
            j2 j2Var = j2.this;
            long[] jArr = h0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j11 = jArr[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j11) < 128) {
                            int i17 = (i13 << 3) + i16;
                            Object obj = h0Var.keys[i17];
                            boolean z11 = h0Var.values[i17] != i12;
                            i11 = i14;
                            if (z11) {
                                s sVar = (s) pVar;
                                sVar.J(obj, j2Var);
                                if (obj instanceof h0) {
                                    sVar.I((h0) obj);
                                    k0 k0Var = j2Var.trackedDependencies;
                                    if (k0Var != null) {
                                        k0Var.p(obj);
                                    }
                                }
                            }
                            if (z11) {
                                h0Var.q(i17);
                            }
                        } else {
                            i11 = i14;
                        }
                        j11 >>= i11;
                        i16++;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        return;
                    }
                }
                if (i13 == length) {
                    return;
                } else {
                    i13++;
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p pVar) {
            a(pVar);
            return h0.f84049a;
        }
    }

    public j2(l2 l2Var) {
        this.owner = l2Var;
    }

    private final void F(boolean z11) {
        if (z11) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void G(boolean z11) {
        if (z11) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    private final boolean f(h0<?> h0Var, k0<h0<?>, Object> k0Var) {
        s.i(h0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        m3<?> m3VarE = h0Var.e();
        if (m3VarE == null) {
            m3VarE = n3.q();
        }
        return !m3VarE.a(h0Var.A().a(), k0Var.c(h0Var));
    }

    private final boolean o() {
        return (this.flags & 32) != 0;
    }

    public final void A(d dVar) {
        this.anchor = dVar;
    }

    public final void B(boolean z11) {
        if (z11) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void C(boolean z11) {
        if (z11) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void D(boolean z11) {
        if (z11) {
            this.flags |= 64;
        } else {
            this.flags &= -65;
        }
    }

    public final void E(boolean z11) {
        if (z11) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void H(boolean z11) {
        if (z11) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void I(int token) {
        this.currentToken = token;
        G(false);
    }

    @Override // p020r2.w2
    public void a(p<? super l, ? super Integer, h0> block) {
        this.block = block;
    }

    public final void e(l2 owner) {
        this.owner = owner;
    }

    public final void g(l composer) {
        h0 h0Var;
        p<? super l, ? super Integer, h0> pVar = this.block;
        if (pVar != null) {
            pVar.invoke(composer, 1);
            h0Var = h0.f84049a;
        } else {
            h0Var = null;
        }
        if (h0Var == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[LOOP:0: B:9:0x001c->B:22:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[SYNTHETIC] */
    public final l<p, h0> h(int token) {
        androidx.collection.h0<Object> h0Var = this.trackedInstances;
        if (h0Var != null && !p()) {
            Object[] objArr = h0Var.keys;
            int[] iArr = h0Var.values;
            long[] jArr = h0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                if (iArr[i14] != token) {
                                    return new b(token, h0Var);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 == 8) {
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    } else if (i11 != length) {
                        i11++;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getAnchor() {
        return this.anchor;
    }

    @Override // p020r2.i2
    public void invalidate() {
        l2 l2Var = this.owner;
        if (l2Var != null) {
            l2Var.g(this, null);
        }
    }

    public final boolean j() {
        return this.block != null;
    }

    public final boolean k() {
        return (this.flags & 2) != 0;
    }

    public final boolean l() {
        return (this.flags & 4) != 0;
    }

    public final boolean m() {
        return (this.flags & 64) != 0;
    }

    public final boolean n() {
        return (this.flags & 8) != 0;
    }

    public final boolean p() {
        return (this.flags & 16) != 0;
    }

    public final boolean q() {
        return (this.flags & 1) != 0;
    }

    public final boolean r() {
        if (this.owner != null) {
            d dVar = this.anchor;
            if (dVar != null ? dVar.b() : false) {
                return true;
            }
        }
        return false;
    }

    public final x0 s(Object value) {
        x0 x0VarG;
        l2 l2Var = this.owner;
        return (l2Var == null || (x0VarG = l2Var.g(this, value)) == null) ? x0.IGNORED : x0VarG;
    }

    public final boolean t() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e A[LOOP:0: B:19:0x002f->B:33:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[EDGE_INSN: B:36:0x0071->B:34:0x0071 BREAK  A[LOOP:0: B:19:0x002f->B:33:0x006e], SYNTHETIC] */
    public final boolean u(Object instances) {
        k0<h0<?>, Object> k0Var;
        if (instances == null || (k0Var = this.trackedDependencies) == null) {
            return true;
        }
        if (instances instanceof h0) {
            return f((h0) instances, k0Var);
        }
        if (!(instances instanceof v0)) {
            return true;
        }
        v0 v0Var = (v0) instances;
        if (v0Var.e()) {
            Object[] objArr = v0Var.elements;
            long[] jArr = v0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
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
                                Object obj = objArr[(i11 << 3) + i13];
                                if (!(obj instanceof h0) || f((h0) obj, k0Var)) {
                                    return true;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                        if (i11 != length) {
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return false;
    }

    public final void v(h0<?> instance, Object value) {
        k0<h0<?>, Object> k0Var = this.trackedDependencies;
        if (k0Var == null) {
            k0Var = new k0<>(0, 1, null);
            this.trackedDependencies = k0Var;
        }
        k0Var.s(instance, value);
    }

    public final boolean w(Object instance) {
        if (o()) {
            return false;
        }
        androidx.collection.h0<Object> h0Var = this.trackedInstances;
        if (h0Var == null) {
            h0Var = new androidx.collection.h0<>(0, 1, null);
            this.trackedInstances = h0Var;
        }
        return h0Var.p(instance, this.currentToken, -1) == this.currentToken;
    }

    public final void x() {
        l2 l2Var = this.owner;
        if (l2Var != null) {
            l2Var.l(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void y() {
        androidx.collection.h0<Object> h0Var;
        l2 l2Var = this.owner;
        if (l2Var == null || (h0Var = this.trackedInstances) == null) {
            return;
        }
        F(true);
        try {
            Object[] objArr = h0Var.keys;
            int[] iArr = h0Var.values;
            long[] jArr = h0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
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
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                int i15 = iArr[i14];
                                l2Var.a(obj);
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
        } finally {
            F(false);
        }
    }

    public final void z() {
        G(true);
    }
}
