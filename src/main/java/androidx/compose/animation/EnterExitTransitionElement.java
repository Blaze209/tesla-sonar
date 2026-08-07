package androidx.compose.animation;

import b4.s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p015o1.p;
import p019p1.l1;
import w4.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b\u0013\u0010F\"\u0004\bG\u0010HR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006O"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Lb4/s0;", "Landroidx/compose/animation/h;", "Lp1/l1;", "Lo1/k;", "transition", "Lp1/l1$a;", "Lw4/r;", "Lp1/n;", "sizeAnimation", "Lw4/n;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/i;", "enter", "Landroidx/compose/animation/k;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lo1/p;", "graphicsLayerBlock", "<init>", "(Lp1/l1;Lp1/l1$a;Lp1/l1$a;Lp1/l1$a;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lwn0/a;Lo1/p;)V", "o", "()Landroidx/compose/animation/h;", "node", "Ljn0/h0;", "p", "(Landroidx/compose/animation/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lp1/l1;", "getTransition", "()Lp1/l1;", "c", "Lp1/l1$a;", "getSizeAnimation", "()Lp1/l1$a;", "setSizeAnimation", "(Lp1/l1$a;)V", DateTokenConverter.CONVERTER_KEY, "getOffsetAnimation", "setOffsetAnimation", "e", "getSlideAnimation", "setSlideAnimation", "f", "Landroidx/compose/animation/i;", "getEnter", "()Landroidx/compose/animation/i;", "setEnter", "(Landroidx/compose/animation/i;)V", "g", "Landroidx/compose/animation/k;", "getExit", "()Landroidx/compose/animation/k;", "setExit", "(Landroidx/compose/animation/k;)V", "h", "Lwn0/a;", "()Lwn0/a;", "setEnabled", "(Lwn0/a;)V", IntegerTokenConverter.CONVERTER_KEY, "Lo1/p;", "getGraphicsLayerBlock", "()Lo1/p;", "setGraphicsLayerBlock", "(Lo1/p;)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class EnterExitTransitionElement extends s0<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final l1<p015o1.k> transition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private l1<p015o1.k>.a<r, p019p1.n> sizeAnimation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private l1<p015o1.k>.a<w4.n, p019p1.n> offsetAnimation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private l1<p015o1.k>.a<w4.n, p019p1.n> slideAnimation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private i enter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private k exit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private wn0.a<Boolean> isEnabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private p graphicsLayerBlock;

    public EnterExitTransitionElement(l1<p015o1.k> l1Var, l1<p015o1.k>.a<r, p019p1.n> aVar, l1<p015o1.k>.a<w4.n, p019p1.n> aVar2, l1<p015o1.k>.a<w4.n, p019p1.n> aVar3, i iVar, k kVar, wn0.a<Boolean> aVar4, p pVar) {
        this.transition = l1Var;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = iVar;
        this.exit = kVar;
        this.isEnabled = aVar4;
        this.graphicsLayerBlock = pVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) other;
        return s.f(this.transition, enterExitTransitionElement.transition) && s.f(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && s.f(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && s.f(this.slideAnimation, enterExitTransitionElement.slideAnimation) && s.f(this.enter, enterExitTransitionElement.enter) && s.f(this.exit, enterExitTransitionElement.exit) && s.f(this.isEnabled, enterExitTransitionElement.isEnabled) && s.f(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        l1<p015o1.k>.a<r, p019p1.n> aVar = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        l1<p015o1.k>.a<w4.n, p019p1.n> aVar2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        l1<p015o1.k>.a<w4.n, p019p1.n> aVar3 = this.slideAnimation;
        return ((((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public h i() {
        return new h(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(h node) {
        node.I2(this.transition);
        node.G2(this.sizeAnimation);
        node.F2(this.offsetAnimation);
        node.H2(this.slideAnimation);
        node.B2(this.enter);
        node.C2(this.exit);
        node.A2(this.isEnabled);
        node.D2(this.graphicsLayerBlock);
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
