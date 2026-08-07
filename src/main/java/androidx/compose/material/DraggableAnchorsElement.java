package androidx.compose.material;

import b4.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p009i2.j0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;
import w4.r;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR8\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "Lb4/s0;", "Landroidx/compose/material/b;", "Li2/c;", "state", "Lkotlin/Function2;", "Lw4/r;", "Lw4/b;", "Lkotlin/Pair;", "Li2/j0;", "anchors", "Ls1/p;", "orientation", "<init>", "(Li2/c;Lwn0/p;Ls1/p;)V", "o", "()Landroidx/compose/material/b;", "node", "Ljn0/h0;", "p", "(Landroidx/compose/material/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Li2/c;", "c", "Lwn0/p;", DateTokenConverter.CONVERTER_KEY, "Ls1/p;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DraggableAnchorsElement<T> extends s0<b<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p009i2.c<T> state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p<r, w4.b, Pair<j0<T>, T>> anchors;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p021s1.p orientation;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableAnchorsElement(p009i2.c<T> cVar, p<? super r, ? super w4.b, ? extends Pair<? extends j0<T>, ? extends T>> pVar, p021s1.p pVar2) {
        this.state = cVar;
        this.anchors = pVar;
        this.orientation = pVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) other;
        return s.f(this.state, draggableAnchorsElement.state) && this.anchors == draggableAnchorsElement.anchors && this.orientation == draggableAnchorsElement.orientation;
    }

    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.anchors.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public b<T> i() {
        return new b<>(this.state, this.anchors, this.orientation);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(b<T> node) {
        node.B2(this.state);
        node.z2(this.anchors);
        node.A2(this.orientation);
    }
}
