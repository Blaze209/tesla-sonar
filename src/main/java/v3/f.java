package v3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u001a\u0010$\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lv3/f;", "", "Lz3/v;", "rootCoordinates", "<init>", "(Lz3/v;)V", "", "pointerId", "Landroidx/collection/i0;", "Lv3/j;", "hitNodes", "Ljn0/h0;", "f", "(JLandroidx/collection/i0;)V", "Lv3/w;", "", "Landroidx/compose/ui/d$c;", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "a", "(JLjava/util/List;Z)V", "Lv3/g;", "internalPointerEvent", "isInBounds", "c", "(Lv3/g;Z)Z", "b", "()V", DateTokenConverter.CONVERTER_KEY, "e", "Lz3/v;", "Lv3/k;", "Lv3/k;", "getRoot$ui_release", "()Lv3/k;", "root", "Landroidx/collection/e0;", "Landroidx/collection/e0;", "hitPointerIdsAndNodes", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z3.v rootCoordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k root = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.collection.e0<androidx.collection.i0<Node>> hitPointerIdsAndNodes = new androidx.collection.e0<>(10);

    public f(z3.v vVar) {
        this.rootCoordinates = vVar;
    }

    private final void f(long pointerId, androidx.collection.i0<Node> hitNodes) {
        this.root.i(pointerId, hitNodes);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    public final void a(long pointerId, List<? extends androidx.compose.ui.d.c> pointerInputNodes, boolean prunePointerIdsAndChangesNotInNodesList) {
        androidx.collection.e0<androidx.collection.i0<Node>> e0Var;
        androidx.collection.i0<Node> i0VarB;
        Node node;
        k kVar = this.root;
        this.hitPointerIdsAndNodes.g();
        int size = pointerInputNodes.size();
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.d.c cVar = pointerInputNodes.get(i11);
            if (z11) {
                t2.b<Node> bVarG = kVar.g();
                int size2 = bVarG.getSize();
                if (size2 <= 0) {
                    node = null;
                    break;
                }
                Node[] nodeArrM = bVarG.m();
                int i12 = 0;
                while (true) {
                    node = nodeArrM[i12];
                    if (p013kotlin.jvm.internal.s.f(node.getPointerInputFilter(), cVar)) {
                        break;
                    }
                    i12++;
                    if (i12 >= size2) {
                        node = null;
                        break;
                    }
                }
                Node node2 = node;
                if (node2 != null) {
                    node2.n();
                    node2.getPointerIds().b(pointerId);
                    androidx.collection.e0<androidx.collection.i0<Node>> e0Var2 = this.hitPointerIdsAndNodes;
                    androidx.collection.i0<Node> i0VarB2 = e0Var2.b(pointerId);
                    if (i0VarB2 == null) {
                        i0VarB2 = new androidx.collection.i0<>(0, 1, null);
                        e0Var2.o(pointerId, i0VarB2);
                    }
                    i0VarB2.g(node2);
                    kVar = node2;
                } else {
                    z11 = false;
                    Node node3 = new Node(cVar);
                    node3.getPointerIds().b(pointerId);
                    e0Var = this.hitPointerIdsAndNodes;
                    i0VarB = e0Var.b(pointerId);
                    if (i0VarB == null) {
                        i0VarB = new androidx.collection.i0<>(0, 1, null);
                        e0Var.o(pointerId, i0VarB);
                    }
                    i0VarB.g(node3);
                    kVar.g().b(node3);
                    kVar = node3;
                }
            } else {
                Node node4 = new Node(cVar);
                node4.getPointerIds().b(pointerId);
                e0Var = this.hitPointerIdsAndNodes;
                i0VarB = e0Var.b(pointerId);
                if (i0VarB == null) {
                    i0VarB = new androidx.collection.i0<>(0, 1, null);
                    e0Var.o(pointerId, i0VarB);
                }
                i0VarB.g(node4);
                kVar.g().b(node4);
                kVar = node4;
            }
        }
        if (!prunePointerIdsAndChangesNotInNodesList) {
            return;
        }
        androidx.collection.e0<androidx.collection.i0<Node>> e0Var3 = this.hitPointerIdsAndNodes;
        long[] jArr = e0Var3.keys;
        Object[] objArr = e0Var3.values;
        long[] jArr2 = e0Var3.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j11 = jArr2[i13];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j11) < 128) {
                        int i16 = (i13 << 3) + i15;
                        f(jArr[i16], (androidx.collection.i0) objArr[i16]);
                    }
                    j11 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void b() {
        this.root.c();
    }

    public final boolean c(g internalPointerEvent, boolean isInBounds) {
        if (this.root.a(internalPointerEvent.b(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return this.root.e(internalPointerEvent) || this.root.f(internalPointerEvent.b(), this.rootCoordinates, internalPointerEvent, isInBounds);
        }
        return false;
    }

    public final void d() {
        this.root.d();
        b();
    }

    public final void e() {
        this.root.h();
    }
}
