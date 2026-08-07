package v3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: v3.j, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001d\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u000eJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010:¨\u0006>"}, d2 = {"Lv3/j;", "Lv3/k;", "Landroidx/compose/ui/d$c;", "modifierNode", "<init>", "(Landroidx/compose/ui/d$c;)V", "Lv3/m;", "oldEvent", "newEvent", "", "m", "(Lv3/m;Lv3/m;)Z", "Ljn0/h0;", "j", "()V", "", "pointerIdValue", "Landroidx/collection/i0;", "hitNodes", IntegerTokenConverter.CONVERTER_KEY, "(JLandroidx/collection/i0;)V", "Landroidx/collection/v;", "Lv3/x;", "changes", "Lz3/v;", "parentCoordinates", "Lv3/g;", "internalPointerEvent", "isInBounds", "f", "(Landroidx/collection/v;Lz3/v;Lv3/g;Z)Z", "e", "(Lv3/g;)Z", "a", DateTokenConverter.CONVERTER_KEY, "n", "b", "(Lv3/g;)V", "", "toString", "()Ljava/lang/String;", "c", "Landroidx/compose/ui/d$c;", "k", "()Landroidx/compose/ui/d$c;", "Lw3/b;", "Lw3/b;", "l", "()Lw3/b;", "pointerIds", "Landroidx/collection/v;", "relevantChanges", "Lz3/v;", "coordinates", "g", "Lv3/m;", "pointerEvent", "h", "Z", "wasIn", "isIn", "hasExited", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Node extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.compose.ui.d.c pointerInputFilter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private z3.v coordinates;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private m pointerEvent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean wasIn;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final w3.b pointerIds = new w3.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.collection.v<PointerInputChange> relevantChanges = new androidx.collection.v<>(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isIn = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean hasExited = true;

    public Node(androidx.compose.ui.d.c cVar) {
        this.pointerInputFilter = cVar;
    }

    private final void j() {
        this.relevantChanges.a();
        this.coordinates = null;
    }

    private final boolean m(m oldEvent, m newEvent) {
        if (oldEvent == null || oldEvent.c().size() != newEvent.c().size()) {
            return true;
        }
        int size = newEvent.c().size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!j3.g.j(oldEvent.c().get(i11).getPosition(), newEvent.c().get(i11).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0255  */
    /* JADX WARN: Code duplicated, block: B:104:0x0263  */
    /* JADX WARN: Code duplicated, block: B:95:0x0235  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v28 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // v3.k
    public boolean a(androidx.collection.v<v3.PointerInputChange> r38, z3.v r39, v3.g r40, boolean r41) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.Node.a(androidx.collection.v, z3.v, v3.g, boolean):boolean");
    }

    @Override // v3.k
    public void b(g internalPointerEvent) {
        super.b(internalPointerEvent);
        m mVar = this.pointerEvent;
        if (mVar == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> listC = mVar.c();
        int size = listC.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputChange pointerInputChange = listC.get(i11);
            boolean pressed = pointerInputChange.getPressed();
            boolean zA = internalPointerEvent.a(pointerInputChange.getId());
            boolean z11 = this.isIn;
            if ((!pressed && !zA) || (!pressed && !z11)) {
                this.pointerIds.i(pointerInputChange.getId());
            }
        }
        this.isIn = false;
        this.hasExited = p.i(mVar.getType(), p.INSTANCE.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // v3.k
    public void d() {
        /*
            r10 = this;
            t2.b r0 = r10.g()
            int r1 = r0.getSize()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L1b
            java.lang.Object[] r0 = r0.m()
            r4 = r2
        L11:
            r5 = r0[r4]
            v3.j r5 = (v3.Node) r5
            r5.d()
            int r4 = r4 + r3
            if (r4 < r1) goto L11
        L1b:
            androidx.compose.ui.d$c r0 = r10.pointerInputFilter
            r1 = 16
            int r4 = b4.b1.a(r1)
            r5 = 0
            r6 = r5
        L25:
            if (r0 == 0) goto L72
            boolean r7 = r0 instanceof b4.p1
            if (r7 == 0) goto L31
            b4.p1 r0 = (b4.p1) r0
            r0.y0()
            goto L6d
        L31:
            int r7 = r0.getKindSet()
            r7 = r7 & r4
            if (r7 == 0) goto L6d
            boolean r7 = r0 instanceof b4.m
            if (r7 == 0) goto L6d
            r7 = r0
            b4.m r7 = (b4.m) r7
            androidx.compose.ui.d$c r7 = r7.getDelegate()
            r8 = r2
        L44:
            if (r7 == 0) goto L6a
            int r9 = r7.getKindSet()
            r9 = r9 & r4
            if (r9 == 0) goto L65
            int r8 = r8 + 1
            if (r8 != r3) goto L53
            r0 = r7
            goto L65
        L53:
            if (r6 != 0) goto L5c
            t2.b r6 = new t2.b
            androidx.compose.ui.d$c[] r9 = new androidx.compose.ui.d.c[r1]
            r6.<init>(r9, r2)
        L5c:
            if (r0 == 0) goto L62
            r6.b(r0)
            r0 = r5
        L62:
            r6.b(r7)
        L65:
            androidx.compose.ui.d$c r7 = r7.getChild()
            goto L44
        L6a:
            if (r8 != r3) goto L6d
            goto L25
        L6d:
            androidx.compose.ui.d$c r0 = b4.k.b(r6)
            goto L25
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.Node.d():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // v3.k
    public boolean e(v3.g r14) {
        /*
            r13 = this;
            androidx.collection.v<v3.x> r0 = r13.relevantChanges
            boolean r0 = r0.f()
            r1 = 0
            if (r0 == 0) goto Lb
            goto L9e
        Lb:
            androidx.compose.ui.d$c r0 = r13.pointerInputFilter
            boolean r0 = r0.getIsAttached()
            if (r0 != 0) goto L15
            goto L9e
        L15:
            v3.m r0 = r13.pointerEvent
            p013kotlin.jvm.internal.s.h(r0)
            z3.v r2 = r13.coordinates
            p013kotlin.jvm.internal.s.h(r2)
            long r2 = r2.e()
            androidx.compose.ui.d$c r4 = r13.pointerInputFilter
            r5 = 16
            int r6 = b4.b1.a(r5)
            r7 = 0
            r8 = r7
        L2d:
            r9 = 1
            if (r4 == 0) goto L7d
            boolean r10 = r4 instanceof b4.p1
            if (r10 == 0) goto L3c
            b4.p1 r4 = (b4.p1) r4
            v3.o r9 = v3.o.Final
            r4.q0(r0, r9, r2)
            goto L78
        L3c:
            int r10 = r4.getKindSet()
            r10 = r10 & r6
            if (r10 == 0) goto L78
            boolean r10 = r4 instanceof b4.m
            if (r10 == 0) goto L78
            r10 = r4
            b4.m r10 = (b4.m) r10
            androidx.compose.ui.d$c r10 = r10.getDelegate()
            r11 = r1
        L4f:
            if (r10 == 0) goto L75
            int r12 = r10.getKindSet()
            r12 = r12 & r6
            if (r12 == 0) goto L70
            int r11 = r11 + 1
            if (r11 != r9) goto L5e
            r4 = r10
            goto L70
        L5e:
            if (r8 != 0) goto L67
            t2.b r8 = new t2.b
            androidx.compose.ui.d$c[] r12 = new androidx.compose.ui.d.c[r5]
            r8.<init>(r12, r1)
        L67:
            if (r4 == 0) goto L6d
            r8.b(r4)
            r4 = r7
        L6d:
            r8.b(r10)
        L70:
            androidx.compose.ui.d$c r10 = r10.getChild()
            goto L4f
        L75:
            if (r11 != r9) goto L78
            goto L2d
        L78:
            androidx.compose.ui.d$c r4 = b4.k.b(r8)
            goto L2d
        L7d:
            androidx.compose.ui.d$c r0 = r13.pointerInputFilter
            boolean r0 = r0.getIsAttached()
            if (r0 == 0) goto L9d
            t2.b r0 = r13.g()
            int r2 = r0.getSize()
            if (r2 <= 0) goto L9d
            java.lang.Object[] r0 = r0.m()
        L93:
            r3 = r0[r1]
            v3.j r3 = (v3.Node) r3
            r3.e(r14)
            int r1 = r1 + r9
            if (r1 < r2) goto L93
        L9d:
            r1 = r9
        L9e:
            r13.b(r14)
            r13.j()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.Node.e(v3.g):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // v3.k
    public boolean f(androidx.collection.v<v3.PointerInputChange> r12, z3.v r13, v3.g r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.Node.f(androidx.collection.v, z3.v, v3.g, boolean):boolean");
    }

    @Override // v3.k
    public void i(long pointerIdValue, androidx.collection.i0<Node> hitNodes) {
        if (this.pointerIds.d(pointerIdValue) && !hitNodes.a(this)) {
            this.pointerIds.h(pointerIdValue);
            this.relevantChanges.i(pointerIdValue);
        }
        t2.b<Node> bVarG = g();
        int size = bVarG.getSize();
        if (size > 0) {
            Node[] nodeArrM = bVarG.m();
            int i11 = 0;
            do {
                nodeArrM[i11].i(pointerIdValue, hitNodes);
                i11++;
            } while (i11 < size);
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final androidx.compose.ui.d.c getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final w3.b getPointerIds() {
        return this.pointerIds;
    }

    public final void n() {
        this.isIn = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputFilter + ", children=" + g() + ", pointerIds=" + this.pointerIds + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
