package f4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import g4.p;
import p013kotlin.Metadata;
import z3.v;

/* JADX INFO: renamed from: f4.i, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"Lf4/i;", "", "Lg4/p;", "node", "", "depth", "Lw4/p;", "viewportBoundsInWindow", "Lz3/v;", "coordinates", "<init>", "(Lg4/p;ILw4/p;Lz3/v;)V", "", "toString", "()Ljava/lang/String;", "a", "Lg4/p;", "c", "()Lg4/p;", "b", "I", "()I", "Lw4/p;", DateTokenConverter.CONVERTER_KEY, "()Lw4/p;", "Lz3/v;", "()Lz3/v;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollCaptureCandidate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final p node;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int depth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final w4.p viewportBoundsInWindow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final v coordinates;

    public ScrollCaptureCandidate(p pVar, int i11, w4.p pVar2, v vVar) {
        this.node = pVar;
        this.depth = i11;
        this.viewportBoundsInWindow = pVar2;
        this.coordinates = vVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final p getNode() {
        return this.node;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final w4.p getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
