package v3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0003J%\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lv3/k;", "", "<init>", "()V", "Landroidx/collection/v;", "Lv3/x;", "changes", "Lz3/v;", "parentCoordinates", "Lv3/g;", "internalPointerEvent", "", "isInBounds", "a", "(Landroidx/collection/v;Lz3/v;Lv3/g;Z)Z", "f", "e", "(Lv3/g;)Z", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "c", "", "pointerIdValue", "Landroidx/collection/i0;", "Lv3/j;", "hitNodes", IntegerTokenConverter.CONVERTER_KEY, "(JLandroidx/collection/i0;)V", "h", "b", "(Lv3/g;)V", "Lt2/b;", "Lt2/b;", "g", "()Lt2/b;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f117708b = t2.b.f112081d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t2.b<Node> children = new t2.b<>(new Node[16], 0);

    public boolean a(androidx.collection.v<PointerInputChange> changes, z3.v parentCoordinates, g internalPointerEvent, boolean isInBounds) {
        t2.b<Node> bVar = this.children;
        int size = bVar.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] jVarArrM = bVar.m();
        int i11 = 0;
        boolean z11 = false;
        do {
            z11 = jVarArrM[i11].a(changes, parentCoordinates, internalPointerEvent, isInBounds) || z11;
            i11++;
        } while (i11 < size);
        return z11;
    }

    public void b(g internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.m()[size].getPointerIds().g()) {
                this.children.v(size);
            }
        }
    }

    public final void c() {
        this.children.h();
    }

    public void d() {
        t2.b<Node> bVar = this.children;
        int size = bVar.getSize();
        if (size > 0) {
            Node[] jVarArrM = bVar.m();
            int i11 = 0;
            do {
                jVarArrM[i11].d();
                i11++;
            } while (i11 < size);
        }
    }

    public boolean e(g internalPointerEvent) {
        t2.b<Node> bVar = this.children;
        int size = bVar.getSize();
        boolean z11 = false;
        if (size > 0) {
            Node[] jVarArrM = bVar.m();
            int i11 = 0;
            boolean z12 = false;
            do {
                z12 = jVarArrM[i11].e(internalPointerEvent) || z12;
                i11++;
            } while (i11 < size);
            z11 = z12;
        }
        b(internalPointerEvent);
        return z11;
    }

    public boolean f(androidx.collection.v<PointerInputChange> changes, z3.v parentCoordinates, g internalPointerEvent, boolean isInBounds) {
        t2.b<Node> bVar = this.children;
        int size = bVar.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] jVarArrM = bVar.m();
        int i11 = 0;
        boolean z11 = false;
        do {
            z11 = jVarArrM[i11].f(changes, parentCoordinates, internalPointerEvent, isInBounds) || z11;
            i11++;
        } while (i11 < size);
        return z11;
    }

    public final t2.b<Node> g() {
        return this.children;
    }

    public final void h() {
        int i11 = 0;
        while (i11 < this.children.getSize()) {
            Node jVar = this.children.m()[i11];
            if (jVar.getPointerInputFilter().getIsAttached()) {
                i11++;
                jVar.h();
            } else {
                jVar.d();
                this.children.v(i11);
            }
        }
    }

    public void i(long pointerIdValue, androidx.collection.i0<Node> hitNodes) {
        t2.b<Node> bVar = this.children;
        int size = bVar.getSize();
        if (size > 0) {
            Node[] jVarArrM = bVar.m();
            int i11 = 0;
            do {
                jVarArrM[i11].i(pointerIdValue, hitNodes);
                i11++;
            } while (i11 < size);
        }
    }
}
