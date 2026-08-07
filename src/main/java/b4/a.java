package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u001e\u0010\u001b\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H$ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u00102\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\"\u00105\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\"\u00108\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0014\u0010>\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0014\u0010@\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%R$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011*\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u0010A\u0082\u0001\u0002CD\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Lb4/a;", "", "Lb4/b;", "alignmentLinesOwner", "<init>", "(Lb4/b;)V", "Lz3/a;", "alignmentLine", "", "initialPosition", "Lb4/z0;", "initialCoordinator", "Ljn0/h0;", "c", "(Lz3/a;ILb4/z0;)V", "o", "()V", "", "h", "()Ljava/util/Map;", IntegerTokenConverter.CONVERTER_KEY, "(Lb4/z0;Lz3/a;)I", "n", "p", "m", "Lj3/g;", "position", DateTokenConverter.CONVERTER_KEY, "(Lb4/z0;J)J", "a", "Lb4/b;", "f", "()Lb4/b;", "", "b", "Z", "g", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui_release", "u", "usedDuringParentMeasurement", "l", "t", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui_release", "q", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui_release", "s", "usedByModifierMeasurement", "getUsedByModifierLayout$ui_release", "r", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "j", "queried", "k", "required", "(Lb4/z0;)Ljava/util/Map;", "alignmentLinesMap", "Lb4/h0;", "Lb4/o0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b alignmentLinesOwner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean dirty;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentMeasurement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentLayout;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean previousUsedDuringParentLayout;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierMeasurement;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private b queryOwner;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<z3.a, Integer> alignmentLineMap;

    /* JADX INFO: renamed from: b4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/b;", "childOwner", "Ljn0/h0;", "a", "(Lb4/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class C0304a extends p013kotlin.jvm.internal.u implements wn0.l<b, jn0.h0> {
        C0304a() {
            super(1);
        }

        public final void a(b bVar) {
            if (bVar.getIsPlaced()) {
                if (bVar.getAlignmentLines().getDirty()) {
                    bVar.i0();
                }
                Map map = bVar.getAlignmentLines().alignmentLineMap;
                a aVar = a.this;
                for (Map.Entry entry : map.entrySet()) {
                    aVar.c((z3.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.n0());
                }
                z0 wrappedBy = bVar.n0().getWrappedBy();
                p013kotlin.jvm.internal.s.h(wrappedBy);
                while (!p013kotlin.jvm.internal.s.f(wrappedBy, a.this.getAlignmentLinesOwner().n0())) {
                    Set<z3.a> setKeySet = a.this.e(wrappedBy).keySet();
                    a aVar2 = a.this;
                    for (z3.a aVar3 : setKeySet) {
                        aVar2.c(aVar3, aVar2.i(wrappedBy, aVar3), wrappedBy);
                    }
                    wrappedBy = wrappedBy.getWrappedBy();
                    p013kotlin.jvm.internal.s.h(wrappedBy);
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(b bVar) {
            a(bVar);
            return jn0.h0.f84049a;
        }
    }

    public /* synthetic */ a(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(z3.a alignmentLine, int initialPosition, z0 initialCoordinator) {
        float f11 = initialPosition;
        long jA = j3.h.a(f11, f11);
        while (true) {
            jA = d(initialCoordinator, jA);
            initialCoordinator = initialCoordinator.getWrappedBy();
            p013kotlin.jvm.internal.s.h(initialCoordinator);
            if (p013kotlin.jvm.internal.s.f(initialCoordinator, this.alignmentLinesOwner.n0())) {
                break;
            } else if (e(initialCoordinator).containsKey(alignmentLine)) {
                float fI = i(initialCoordinator, alignmentLine);
                jA = j3.h.a(fI, fI);
            }
        }
        int iRound = Math.round(alignmentLine instanceof z3.p ? j3.g.n(jA) : j3.g.m(jA));
        Map<z3.a, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            iRound = z3.b.c(alignmentLine, ((Number) p013kotlin.collections.v0.j(this.alignmentLineMap, alignmentLine)).intValue(), iRound);
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    protected abstract long d(z0 z0Var, long j11);

    protected abstract Map<z3.a, Integer> e(z0 z0Var);

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    public final Map<z3.a, Integer> h() {
        return this.alignmentLineMap;
    }

    protected abstract int i(z0 z0Var, z3.a aVar);

    public final boolean j() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean k() {
        o();
        return this.queryOwner != null;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    public final void m() {
        this.dirty = true;
        b bVarA0 = this.alignmentLinesOwner.a0();
        if (bVarA0 == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            bVarA0.U();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            bVarA0.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.U();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        bVarA0.getAlignmentLines().m();
    }

    public final void n() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.I(new C0304a());
        this.alignmentLineMap.putAll(e(this.alignmentLinesOwner.n0()));
        this.dirty = false;
    }

    public final void o() {
        b bVar;
        a aVarQ;
        a aVarQ2;
        if (j()) {
            bVar = this.alignmentLinesOwner;
        } else {
            b bVarA0 = this.alignmentLinesOwner.a0();
            if (bVarA0 == null) {
                return;
            }
            bVar = bVarA0.getAlignmentLines().queryOwner;
            if (bVar == null || !bVar.getAlignmentLines().j()) {
                b bVar2 = this.queryOwner;
                if (bVar2 == null || bVar2.getAlignmentLines().j()) {
                    return;
                }
                b bVarA1 = bVar2.a0();
                if (bVarA1 != null && (aVarQ2 = bVarA1.getAlignmentLines()) != null) {
                    aVarQ2.o();
                }
                b bVarA2 = bVar2.a0();
                bVar = (bVarA2 == null || (aVarQ = bVarA2.getAlignmentLines()) == null) ? null : aVarQ.queryOwner;
            }
        }
        this.queryOwner = bVar;
    }

    public final void p() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void q(boolean z11) {
        this.previousUsedDuringParentLayout = z11;
    }

    public final void r(boolean z11) {
        this.usedByModifierLayout = z11;
    }

    public final void s(boolean z11) {
        this.usedByModifierMeasurement = z11;
    }

    public final void t(boolean z11) {
        this.usedDuringParentLayout = z11;
    }

    public final void u(boolean z11) {
        this.usedDuringParentMeasurement = z11;
    }

    private a(b bVar) {
        this.alignmentLinesOwner = bVar;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }
}
