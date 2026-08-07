package androidx.compose.foundation.layout;

import b4.s0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "Lb4/s0;", "Landroidx/compose/foundation/layout/w$a;", "Lz3/a;", "alignmentLine", "<init>", "(Lz3/a;)V", "o", "()Landroidx/compose/foundation/layout/w$a;", "node", "Ljn0/h0;", "p", "(Landroidx/compose/foundation/layout/w$a;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lz3/a;", "getAlignmentLine", "()Lz3/a;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WithAlignmentLineElement extends s0<w.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z3.a alignmentLine;

    public WithAlignmentLineElement(z3.a aVar) {
        this.alignmentLine = aVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = other instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) other : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return p013kotlin.jvm.internal.s.f(this.alignmentLine, withAlignmentLineElement.alignmentLine);
    }

    public int hashCode() {
        return this.alignmentLine.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public w.a i() {
        return new w.a(this.alignmentLine);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(w.a node) {
        node.x2(this.alignmentLine);
    }
}
