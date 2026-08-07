package androidx.compose.foundation.layout;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.l0;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.h, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/h;", "Lz3/i0;", "Ld3/c;", "alignment", "", "propagateMinConstraints", "<init>", "(Ld3/c;Z)V", "Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ld3/c;", "b", "Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class BoxMeasurePolicy implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d3.c alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean propagateMinConstraints;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.h$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f4573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z3.h0 f4574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k0 f4575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4576f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f4577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BoxMeasurePolicy f4578h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w0 w0Var, z3.h0 h0Var, k0 k0Var, int i11, int i12, BoxMeasurePolicy boxMeasurePolicy) {
            super(1);
            this.f4573c = w0Var;
            this.f4574d = h0Var;
            this.f4575e = k0Var;
            this.f4576f = i11;
            this.f4577g = i12;
            this.f4578h = boxMeasurePolicy;
        }

        public final void a(w0.a aVar) {
            g.i(aVar, this.f4573c, this.f4574d, this.f4575e.getLayoutDirection(), this.f4576f, this.f4577g, this.f4578h.alignment);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.h$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0[] f4579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<z3.h0> f4580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k0 f4581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l0 f4582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l0 f4583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BoxMeasurePolicy f4584h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(w0[] w0VarArr, List<? extends z3.h0> list, k0 k0Var, l0 l0Var, l0 l0Var2, BoxMeasurePolicy boxMeasurePolicy) {
            super(1);
            this.f4579c = w0VarArr;
            this.f4580d = list;
            this.f4581e = k0Var;
            this.f4582f = l0Var;
            this.f4583g = l0Var2;
            this.f4584h = boxMeasurePolicy;
        }

        public final void a(w0.a aVar) {
            w0[] w0VarArr = this.f4579c;
            List<z3.h0> list = this.f4580d;
            k0 k0Var = this.f4581e;
            l0 l0Var = this.f4582f;
            l0 l0Var2 = this.f4583g;
            BoxMeasurePolicy boxMeasurePolicy = this.f4584h;
            int length = w0VarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                w0 w0Var = w0VarArr[i11];
                p013kotlin.jvm.internal.s.i(w0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                g.i(aVar, w0Var, list.get(i12), k0Var.getLayoutDirection(), l0Var.f86527a, l0Var2.f86527a, boxMeasurePolicy.alignment);
                i11++;
                i12++;
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public BoxMeasurePolicy(d3.c cVar, boolean z11) {
        this.alignment = cVar;
        this.propagateMinConstraints = z11;
    }

    @Override // z3.i0
    public j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
        long j12;
        int iN;
        int iM;
        w0 w0VarX0;
        if (list.isEmpty()) {
            return k0.N1(k0Var, w4.b.n(j11), w4.b.m(j11), null, a.f4572c, 4, null);
        }
        if (this.propagateMinConstraints) {
            j12 = j11;
        } else {
            j12 = j11;
            j11 = w4.b.d(j12, 0, 0, 0, 0, 10, null);
        }
        if (list.size() == 1) {
            z3.h0 h0Var = list.get(0);
            if (g.g(h0Var)) {
                iN = w4.b.n(j12);
                iM = w4.b.m(j12);
                w0VarX0 = h0Var.x0(w4.b.INSTANCE.c(w4.b.n(j12), w4.b.m(j12)));
            } else {
                w0VarX0 = h0Var.x0(j11);
                iN = Math.max(w4.b.n(j12), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String());
                iM = Math.max(w4.b.m(j12), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
            }
            int i11 = iN;
            int i12 = iM;
            return k0.N1(k0Var, i11, i12, null, new b(w0VarX0, h0Var, k0Var, i11, i12, this), 4, null);
        }
        w0[] w0VarArr = new w0[list.size()];
        l0 l0Var = new l0();
        l0Var.f86527a = w4.b.n(j12);
        l0 l0Var2 = new l0();
        l0Var2.f86527a = w4.b.m(j12);
        int size = list.size();
        boolean z11 = false;
        for (int i13 = 0; i13 < size; i13++) {
            z3.h0 h0Var2 = list.get(i13);
            if (g.g(h0Var2)) {
                z11 = true;
            } else {
                w0 w0VarX1 = h0Var2.x0(j11);
                w0VarArr[i13] = w0VarX1;
                l0Var.f86527a = Math.max(l0Var.f86527a, w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String());
                l0Var2.f86527a = Math.max(l0Var2.f86527a, w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
            }
        }
        if (z11) {
            int i14 = l0Var.f86527a;
            int i15 = i14 != Integer.MAX_VALUE ? i14 : 0;
            int i16 = l0Var2.f86527a;
            long jA = w4.c.a(i15, i14, i16 != Integer.MAX_VALUE ? i16 : 0, i16);
            int size2 = list.size();
            for (int i17 = 0; i17 < size2; i17++) {
                z3.h0 h0Var3 = list.get(i17);
                if (g.g(h0Var3)) {
                    w0VarArr[i17] = h0Var3.x0(jA);
                }
            }
        }
        return k0.N1(k0Var, l0Var.f86527a, l0Var2.f86527a, null, new c(w0VarArr, list, k0Var, l0Var, l0Var2, this), 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) other;
        return p013kotlin.jvm.internal.s.f(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.h$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f4572c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }

        public final void a(w0.a aVar) {
        }
    }
}
