package v1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import z3.w0;

/* JADX INFO: renamed from: v1.h, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJi\u0010'\u001a\u00020&2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J=\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J,\u00106\u001a\u00020&*\u00020\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00105\u001a\u00020/H\u0016ø\u0001\u0001¢\u0006\u0004\b6\u00107J)\u0010;\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010<J)\u0010>\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010<J)\u0010?\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b?\u0010<J)\u0010@\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010<J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020-2\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010JR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Lv1/h;", "Lz3/i0;", "Lv1/b0;", "Lv1/b$m;", "verticalArrangement", "Ld3/c$b;", "horizontalAlignment", "<init>", "(Lv1/b$m;Ld3/c$b;)V", "Lz3/w0;", "placeable", "Lv1/d0;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "Lw4/t;", "layoutDirection", "m", "(Lz3/w0;Lv1/d0;IILw4/t;)I", "e", "(Lz3/w0;)I", "k", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "Lz3/k0;", "measureScope", "Ljn0/h0;", "f", "(I[I[ILz3/k0;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Lz3/j0;", "h", "([Lz3/w0;Lz3/k0;I[III[IIII)Lz3/j0;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "Lw4/b;", "a", "(IIIIZ)J", "", "Lz3/h0;", "measurables", CryptoServicesPermission.CONSTRAINTS, "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", Snapshot.HEIGHT, "g", "(Lz3/r;Ljava/util/List;I)I", Snapshot.WIDTH, "j", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lv1/b$m;", "b", "Ld3/c$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ColumnMeasurePolicy implements z3.i0, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b.m verticalArrangement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d3.c.b horizontalAlignment;

    /* JADX INFO: renamed from: v1.h$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0[] f117498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ColumnMeasurePolicy f117499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f117500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f117501f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z3.k0 f117502g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int[] f117503h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0[] w0VarArr, ColumnMeasurePolicy columnMeasurePolicy, int i11, int i12, z3.k0 k0Var, int[] iArr) {
            super(1);
            this.f117498c = w0VarArr;
            this.f117499d = columnMeasurePolicy;
            this.f117500e = i11;
            this.f117501f = i12;
            this.f117502g = k0Var;
            this.f117503h = iArr;
        }

        public final void a(w0.a aVar) {
            w0[] w0VarArr = this.f117498c;
            ColumnMeasurePolicy columnMeasurePolicy = this.f117499d;
            int i11 = this.f117500e;
            int i12 = this.f117501f;
            z3.k0 k0Var = this.f117502g;
            int[] iArr = this.f117503h;
            int length = w0VarArr.length;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                w0 w0Var = w0VarArr[i13];
                p013kotlin.jvm.internal.s.h(w0Var);
                w0.a.h(aVar, w0Var, columnMeasurePolicy.m(w0Var, a0.d(w0Var), i11, i12, k0Var.getLayoutDirection()), iArr[i14], BitmapDescriptorFactory.HUE_RED, 4, null);
                i13++;
                i14++;
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w0.a aVar) {
            a(aVar);
            return jn0.h0.f84049a;
        }
    }

    public ColumnMeasurePolicy(b.m mVar, d3.c.b bVar) {
        this.verticalArrangement = mVar;
        this.horizontalAlignment = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m(w0 placeable, RowColumnParentData parentData, int crossAxisLayoutSize, int beforeCrossAxisAlignmentLine, w4.t layoutDirection) {
        androidx.compose.foundation.layout.j crossAxisAlignment = parentData != null ? parentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.a(crossAxisLayoutSize - placeable.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), layoutDirection, placeable, beforeCrossAxisAlignmentLine) : this.horizontalAlignment.a(0, crossAxisLayoutSize - placeable.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), layoutDirection);
    }

    @Override // v1.b0
    public long a(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return g.b(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // z3.i0
    public z3.j0 c(z3.k0 k0Var, List<? extends z3.h0> list, long j11) {
        return c0.a(this, w4.b.m(j11), w4.b.n(j11), w4.b.k(j11), w4.b.l(j11), k0Var.i1(this.verticalArrangement.getSpacing()), k0Var, list, new w0[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // z3.i0
    public int d(z3.r rVar, List<? extends z3.q> list, int i11) {
        return v.f117585a.f(list, i11, rVar.i1(this.verticalArrangement.getSpacing()));
    }

    @Override // v1.b0
    public int e(w0 w0Var) {
        return w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) other;
        return p013kotlin.jvm.internal.s.f(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && p013kotlin.jvm.internal.s.f(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    @Override // v1.b0
    public void f(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, z3.k0 measureScope) {
        this.verticalArrangement.c(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
    }

    @Override // z3.i0
    public int g(z3.r rVar, List<? extends z3.q> list, int i11) {
        return v.f117585a.h(list, i11, rVar.i1(this.verticalArrangement.getSpacing()));
    }

    @Override // v1.b0
    public z3.j0 h(w0[] placeables, z3.k0 measureScope, int beforeCrossAxisAlignmentLine, int[] mainAxisPositions, int mainAxisLayoutSize, int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        return z3.k0.N1(measureScope, crossAxisLayoutSize, mainAxisLayoutSize, null, new a(placeables, this, crossAxisLayoutSize, beforeCrossAxisAlignmentLine, measureScope, mainAxisPositions), 4, null);
    }

    public int hashCode() {
        return (this.verticalArrangement.hashCode() * 31) + this.horizontalAlignment.hashCode();
    }

    @Override // z3.i0
    public int i(z3.r rVar, List<? extends z3.q> list, int i11) {
        return v.f117585a.e(list, i11, rVar.i1(this.verticalArrangement.getSpacing()));
    }

    @Override // z3.i0
    public int j(z3.r rVar, List<? extends z3.q> list, int i11) {
        return v.f117585a.g(list, i11, rVar.i1(this.verticalArrangement.getSpacing()));
    }

    @Override // v1.b0
    public int k(w0 w0Var) {
        return w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
