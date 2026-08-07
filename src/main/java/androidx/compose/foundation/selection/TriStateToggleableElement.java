package androidx.compose.foundation.selection;

import b4.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import g4.i;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import q1.e0;
import u1.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Lb4/s0;", "Landroidx/compose/foundation/selection/e;", "Lh4/a;", "state", "Lu1/l;", "interactionSource", "Lq1/e0;", "indicationNodeFactory", "", "enabled", "Lg4/i;", "role", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "<init>", "(Lh4/a;Lu1/l;Lq1/e0;ZLg4/i;Lwn0/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "o", "()Landroidx/compose/foundation/selection/e;", "node", "p", "(Landroidx/compose/foundation/selection/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lh4/a;", "c", "Lu1/l;", DateTokenConverter.CONVERTER_KEY, "Lq1/e0;", "e", "Z", "f", "Lg4/i;", "g", "Lwn0/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TriStateToggleableElement extends s0<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h4.a state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e0 indicationNodeFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i role;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onClick;

    public /* synthetic */ TriStateToggleableElement(h4.a aVar, l lVar, e0 e0Var, boolean z11, i iVar, wn0.a aVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, lVar, e0Var, z11, iVar, aVar2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || TriStateToggleableElement.class != other.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) other;
        return this.state == triStateToggleableElement.state && s.f(this.interactionSource, triStateToggleableElement.interactionSource) && s.f(this.indicationNodeFactory, triStateToggleableElement.indicationNodeFactory) && this.enabled == triStateToggleableElement.enabled && s.f(this.role, triStateToggleableElement.role) && this.onClick == triStateToggleableElement.onClick;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        l lVar = this.interactionSource;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        e0 e0Var = this.indicationNodeFactory;
        int iHashCode3 = (((iHashCode2 + (e0Var != null ? e0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        i iVar = this.role;
        return ((iHashCode3 + (iVar != null ? i.l(iVar.getValue()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e i() {
        return new e(this.state, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick, null);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(e node) {
        node.Y2(this.state, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick);
    }

    private TriStateToggleableElement(h4.a aVar, l lVar, e0 e0Var, boolean z11, i iVar, wn0.a<h0> aVar2) {
        this.state = aVar;
        this.interactionSource = lVar;
        this.indicationNodeFactory = e0Var;
        this.enabled = z11;
        this.role = iVar;
        this.onClick = aVar2;
    }
}
