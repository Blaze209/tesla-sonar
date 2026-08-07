package androidx.compose.animation;

import b4.s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p019p1.g0;
import w4.r;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Lb4/s0;", "Landroidx/compose/animation/m;", "Lp1/g0;", "Lw4/r;", "animationSpec", "Ld3/c;", "alignment", "Lkotlin/Function2;", "Ljn0/h0;", "finishedListener", "<init>", "(Lp1/g0;Ld3/c;Lwn0/p;)V", "o", "()Landroidx/compose/animation/m;", "node", "p", "(Landroidx/compose/animation/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lp1/g0;", "getAnimationSpec", "()Lp1/g0;", "c", "Ld3/c;", "getAlignment", "()Ld3/c;", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "getFinishedListener", "()Lwn0/p;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class SizeAnimationModifierElement extends s0<m> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final g0<r> animationSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d3.c alignment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final p<r, r, h0> finishedListener;

    /* JADX WARN: Multi-variable type inference failed */
    public SizeAnimationModifierElement(g0<r> g0Var, d3.c cVar, p<? super r, ? super r, h0> pVar) {
        this.animationSpec = g0Var;
        this.alignment = cVar;
        this.finishedListener = pVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) other;
        return s.f(this.animationSpec, sizeAnimationModifierElement.animationSpec) && s.f(this.alignment, sizeAnimationModifierElement.alignment) && s.f(this.finishedListener, sizeAnimationModifierElement.finishedListener);
    }

    public int hashCode() {
        int iHashCode = ((this.animationSpec.hashCode() * 31) + this.alignment.hashCode()) * 31;
        p<r, r, h0> pVar = this.finishedListener;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public m i() {
        return new m(this.animationSpec, this.alignment, this.finishedListener);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(m node) {
        node.E2(this.animationSpec);
        node.F2(this.finishedListener);
        node.C2(this.alignment);
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", alignment=" + this.alignment + ", finishedListener=" + this.finishedListener + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
