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

/* JADX INFO: renamed from: v1.f0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J,\u0010\u001c\u001a\u00020\u001b*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%Ji\u0010,\u001a\u00020\u001b2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0&2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-J=\u00104\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J)\u00109\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J)\u0010<\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010:J)\u0010=\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010:J)\u0010>\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010:J\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u0002022\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lv1/f0;", "Lz3/i0;", "Lv1/b0;", "Lv1/b$e;", "horizontalArrangement", "Ld3/c$c;", "verticalAlignment", "<init>", "(Lv1/b$e;Ld3/c$c;)V", "Lz3/w0;", "placeable", "Lv1/d0;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "m", "(Lz3/w0;Lv1/d0;II)I", "e", "(Lz3/w0;)I", "k", "Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "measureScope", "Ljn0/h0;", "f", "(I[I[ILz3/k0;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "h", "([Lz3/w0;Lz3/k0;I[III[IIII)Lz3/j0;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "a", "(IIIIZ)J", "Lz3/r;", "Lz3/q;", Snapshot.HEIGHT, "g", "(Lz3/r;Ljava/util/List;I)I", Snapshot.WIDTH, "j", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lv1/b$e;", "b", "Ld3/c$c;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RowMeasurePolicy implements z3.i0, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b.e horizontalArrangement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d3.c.InterfaceC1212c verticalAlignment;

    /* JADX INFO: renamed from: v1.f0$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0[] f117490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ RowMeasurePolicy f117491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f117492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f117493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int[] f117494g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0[] w0VarArr, RowMeasurePolicy rowMeasurePolicy, int i11, int i12, int[] iArr) {
            super(1);
            this.f117490c = w0VarArr;
            this.f117491d = rowMeasurePolicy;
            this.f117492e = i11;
            this.f117493f = i12;
            this.f117494g = iArr;
        }

        public final void a(w0.a aVar) {
            w0[] w0VarArr = this.f117490c;
            RowMeasurePolicy rowMeasurePolicy = this.f117491d;
            int i11 = this.f117492e;
            int i12 = this.f117493f;
            int[] iArr = this.f117494g;
            int length = w0VarArr.length;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                w0 w0Var = w0VarArr[i13];
                p013kotlin.jvm.internal.s.h(w0Var);
                w0.a.h(aVar, w0Var, iArr[i14], rowMeasurePolicy.m(w0Var, a0.d(w0Var), i11, i12), BitmapDescriptorFactory.HUE_RED, 4, null);
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

    public RowMeasurePolicy(b.e eVar, d3.c.InterfaceC1212c interfaceC1212c) {
        this.horizontalArrangement = eVar;
        this.verticalAlignment = interfaceC1212c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m(w0 placeable, RowColumnParentData parentData, int crossAxisLayoutSize, int beforeCrossAxisAlignmentLine) {
        androidx.compose.foundation.layout.j crossAxisAlignment = parentData != null ? parentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.a(crossAxisLayoutSize - placeable.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), w4.t.Ltr, placeable, beforeCrossAxisAlignmentLine) : this.verticalAlignment.a(0, crossAxisLayoutSize - placeable.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
    }

    @Override // v1.b0
    public long a(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return e0.a(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // z3.i0
    public z3.j0 c(z3.k0 k0Var, List<? extends z3.h0> list, long j11) {
        return c0.a(this, w4.b.n(j11), w4.b.m(j11), w4.b.l(j11), w4.b.k(j11), k0Var.i1(this.horizontalArrangement.getSpacing()), k0Var, list, new w0[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // z3.i0
    public int d(z3.r rVar, List<? extends z3.q> list, int i11) {
        return v.f117585a.b(list, i11, rVar.i1(this.horizontalArrangement.getSpacing()));
    }

    @Override // v1.b0
    public int e(w0 w0Var) {
        return w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) other;
        return p013kotlin.jvm.internal.s.f(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) && p013kotlin.jvm.internal.s.f(this.verticalAlignment, rowMeasurePolicy.verticalAlignment);
    }

    @Override // v1.b0
    public void f(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, z3.k0 measureScope) {
        this.horizontalArrangement.b(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
    }

    @Override // z3.i0
    public int g(z3.r rVar, List<? extends z3.q> list, int i11) {
        return v.f117585a.d(list, i11, rVar.i1(this.horizontalArrangement.getSpacing()));
    }

    @Override // v1.b0
    public z3.j0 h(w0[] placeables, z3.k0 measureScope, int beforeCrossAxisAlignmentLine, int[] mainAxisPositions, int mainAxisLayoutSize, int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        return z3.k0.N1(measureScope, mainAxisLayoutSize, crossAxisLayoutSize, null, new a(placeables, this, crossAxisLayoutSize, beforeCrossAxisAlignmentLine, mainAxisPositions), 4, null);
    }

    public int hashCode() {
        return (this.horizontalArrangement.hashCode() * 31) + this.verticalAlignment.hashCode();
    }

    @Override // z3.i0
    public int i(z3.r rVar, List<? extends z3.q> list, int i11) {
        return v.f117585a.a(list, i11, rVar.i1(this.horizontalArrangement.getSpacing()));
    }

    @Override // z3.i0
    public int j(z3.r rVar, List<? extends z3.q> list, int i11) {
        return v.f117585a.c(list, i11, rVar.i1(this.horizontalArrangement.getSpacing()));
    }

    @Override // v1.b0
    public int k(w0 w0Var) {
        return w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
