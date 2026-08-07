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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Lb4/s0;", "Landroidx/compose/foundation/selection/d;", "", "value", "Lu1/l;", "interactionSource", "Lq1/e0;", "indicationNodeFactory", "enabled", "Lg4/i;", "role", "Lkotlin/Function1;", "Ljn0/h0;", "onValueChange", "<init>", "(ZLu1/l;Lq1/e0;ZLg4/i;Lwn0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "o", "()Landroidx/compose/foundation/selection/d;", "node", "p", "(Landroidx/compose/foundation/selection/d;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Z", "c", "Lu1/l;", DateTokenConverter.CONVERTER_KEY, "Lq1/e0;", "e", "f", "Lg4/i;", "g", "Lwn0/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ToggleableElement extends s0<d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l interactionSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e0 indicationNodeFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i role;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Boolean, h0> onValueChange;

    public /* synthetic */ ToggleableElement(boolean z11, l lVar, e0 e0Var, boolean z12, i iVar, wn0.l lVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, lVar, e0Var, z12, iVar, lVar2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ToggleableElement.class != other.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) other;
        return this.value == toggleableElement.value && s.f(this.interactionSource, toggleableElement.interactionSource) && s.f(this.indicationNodeFactory, toggleableElement.indicationNodeFactory) && this.enabled == toggleableElement.enabled && s.f(this.role, toggleableElement.role) && this.onValueChange == toggleableElement.onValueChange;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.value) * 31;
        l lVar = this.interactionSource;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        e0 e0Var = this.indicationNodeFactory;
        int iHashCode3 = (((iHashCode2 + (e0Var != null ? e0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        i iVar = this.role;
        return ((iHashCode3 + (iVar != null ? i.l(iVar.getValue()) : 0)) * 31) + this.onValueChange.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public d i() {
        return new d(this.value, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onValueChange, null);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(d node) {
        node.a3(this.value, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onValueChange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ToggleableElement(boolean z11, l lVar, e0 e0Var, boolean z12, i iVar, wn0.l<? super Boolean, h0> lVar2) {
        this.value = z11;
        this.interactionSource = lVar;
        this.indicationNodeFactory = e0Var;
        this.enabled = z12;
        this.role = iVar;
        this.onValueChange = lVar2;
    }
}
