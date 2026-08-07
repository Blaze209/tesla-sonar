package androidx.compose.ui.draw;

import b4.s0;
import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Lb4/s0;", "Landroidx/compose/ui/draw/c;", "Lkotlin/Function1;", "Lm3/c;", "Ljn0/h0;", "onDraw", "<init>", "(Lwn0/l;)V", "o", "()Landroidx/compose/ui/draw/c;", "node", "p", "(Landroidx/compose/ui/draw/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lwn0/l;", "getOnDraw", "()Lwn0/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class DrawWithContentElement extends s0<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<m3.c, h0> onDraw;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(l<? super m3.c, h0> lVar) {
        this.onDraw = lVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrawWithContentElement) && s.f(this.onDraw, ((DrawWithContentElement) other).onDraw);
    }

    public int hashCode() {
        return this.onDraw.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public c i() {
        return new c(this.onDraw);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(c node) {
        node.x2(this.onDraw);
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.onDraw + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
