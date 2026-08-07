package androidx.compose.foundation.gestures;

import b4.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p021s1.m;
import p021s1.p;
import p021s1.x;
import q1.n0;
import u1.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Lb4/s0;", "Landroidx/compose/foundation/gestures/f;", "Ls1/x;", "state", "Ls1/p;", "orientation", "Lq1/n0;", "overscrollEffect", "", "enabled", "reverseDirection", "Ls1/m;", "flingBehavior", "Lu1/l;", "interactionSource", "Ls1/d;", "bringIntoViewSpec", "<init>", "(Ls1/x;Ls1/p;Lq1/n0;ZZLs1/m;Lu1/l;Ls1/d;)V", "o", "()Landroidx/compose/foundation/gestures/f;", "node", "Ljn0/h0;", "p", "(Landroidx/compose/foundation/gestures/f;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ls1/x;", "getState", "()Ls1/x;", "c", "Ls1/p;", "getOrientation", "()Ls1/p;", DateTokenConverter.CONVERTER_KEY, "Lq1/n0;", "getOverscrollEffect", "()Lq1/n0;", "e", "Z", "getEnabled", "()Z", "f", "getReverseDirection", "g", "Ls1/m;", "getFlingBehavior", "()Ls1/m;", "h", "Lu1/l;", "getInteractionSource", "()Lu1/l;", IntegerTokenConverter.CONVERTER_KEY, "Ls1/d;", "getBringIntoViewSpec", "()Ls1/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollableElement extends s0<f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p orientation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n0 overscrollEffect;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m flingBehavior;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p021s1.d bringIntoViewSpec;

    public ScrollableElement(x xVar, p pVar, n0 n0Var, boolean z11, boolean z12, m mVar, l lVar, p021s1.d dVar) {
        this.state = xVar;
        this.orientation = pVar;
        this.overscrollEffect = n0Var;
        this.enabled = z11;
        this.reverseDirection = z12;
        this.flingBehavior = mVar;
        this.interactionSource = lVar;
        this.bringIntoViewSpec = dVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) other;
        return s.f(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && s.f(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && s.f(this.flingBehavior, scrollableElement.flingBehavior) && s.f(this.interactionSource, scrollableElement.interactionSource) && s.f(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        n0 n0Var = this.overscrollEffect;
        int iHashCode2 = (((((iHashCode + (n0Var != null ? n0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseDirection)) * 31;
        m mVar = this.flingBehavior;
        int iHashCode3 = (iHashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        l lVar = this.interactionSource;
        int iHashCode4 = (iHashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        p021s1.d dVar = this.bringIntoViewSpec;
        return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public f i() {
        return new f(this.state, this.overscrollEffect, this.flingBehavior, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(f node) {
        node.e3(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }
}
