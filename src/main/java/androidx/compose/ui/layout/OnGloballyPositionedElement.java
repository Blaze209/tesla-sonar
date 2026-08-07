package androidx.compose.ui.layout;

import b4.s0;
import jn0.h0;
import p013kotlin.Metadata;
import wn0.l;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Lb4/s0;", "Landroidx/compose/ui/layout/d;", "Lkotlin/Function1;", "Lz3/v;", "Ljn0/h0;", "onGloballyPositioned", "<init>", "(Lwn0/l;)V", "o", "()Landroidx/compose/ui/layout/d;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "node", "p", "(Landroidx/compose/ui/layout/d;)V", "b", "Lwn0/l;", "getOnGloballyPositioned", "()Lwn0/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OnGloballyPositionedElement extends s0<d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<v, h0> onGloballyPositioned;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(l<? super v, h0> lVar) {
        this.onGloballyPositioned = lVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnGloballyPositionedElement) && this.onGloballyPositioned == ((OnGloballyPositionedElement) other).onGloballyPositioned;
    }

    public int hashCode() {
        return this.onGloballyPositioned.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public d i() {
        return new d(this.onGloballyPositioned);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(d node) {
        node.x2(this.onGloballyPositioned);
    }
}
