package androidx.compose.foundation.lazy.layout;

import b4.s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p019p1.g0;
import w4.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Lb4/s0;", "Lx1/i;", "Lp1/g0;", "", "fadeInSpec", "Lw4/n;", "placementSpec", "fadeOutSpec", "<init>", "(Lp1/g0;Lp1/g0;Lp1/g0;)V", "o", "()Lx1/i;", "node", "Ljn0/h0;", "p", "(Lx1/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lp1/g0;", "c", DateTokenConverter.CONVERTER_KEY, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LazyLayoutAnimateItemElement extends s0<p024x1.i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final g0<Float> fadeInSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final g0<n> placementSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final g0<Float> fadeOutSpec;

    public LazyLayoutAnimateItemElement(g0<Float> g0Var, g0<n> g0Var2, g0<Float> g0Var3) {
        this.fadeInSpec = g0Var;
        this.placementSpec = g0Var2;
        this.fadeOutSpec = g0Var3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) other;
        return s.f(this.fadeInSpec, lazyLayoutAnimateItemElement.fadeInSpec) && s.f(this.placementSpec, lazyLayoutAnimateItemElement.placementSpec) && s.f(this.fadeOutSpec, lazyLayoutAnimateItemElement.fadeOutSpec);
    }

    public int hashCode() {
        g0<Float> g0Var = this.fadeInSpec;
        int iHashCode = (g0Var == null ? 0 : g0Var.hashCode()) * 31;
        g0<n> g0Var2 = this.placementSpec;
        int iHashCode2 = (iHashCode + (g0Var2 == null ? 0 : g0Var2.hashCode())) * 31;
        g0<Float> g0Var3 = this.fadeOutSpec;
        return iHashCode2 + (g0Var3 != null ? g0Var3.hashCode() : 0);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public p024x1.i i() {
        return new p024x1.i(this.fadeInSpec, this.placementSpec, this.fadeOutSpec);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(p024x1.i node) {
        node.A2(this.fadeInSpec);
        node.C2(this.placementSpec);
        node.B2(this.fadeOutSpec);
    }

    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.fadeInSpec + ", placementSpec=" + this.placementSpec + ", fadeOutSpec=" + this.fadeOutSpec + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
