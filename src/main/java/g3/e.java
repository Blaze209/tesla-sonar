package g3;

import b4.k;
import b4.w1;
import b4.x1;
import b4.y1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u001d\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0013R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lg3/e;", "Landroidx/compose/ui/d$c;", "Lb4/x1;", "Lg3/d;", "Lkotlin/Function1;", "Lg3/b;", "Lg3/g;", "onDragAndDropStart", "<init>", "(Lwn0/l;)V", "Ljn0/h0;", "i2", "()V", "startEvent", "", "x2", "(Lg3/b;)Z", "event", "H0", "(Lg3/b;)V", "m0", "P1", "U0", "G1", "u1", "n", "Lwn0/l;", "", "o", "Ljava/lang/Object;", "P0", "()Ljava/lang/Object;", "traverseKey", "p", "Lg3/d;", "lastChildDragAndDropModifierNode", "q", "Lg3/g;", "thisDragAndDropTarget", "r", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends androidx.compose.ui.d.c implements x1, g3.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f67149s = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final l<g3.b, g> onDragAndDropStart;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey = Companion.C1375a.f67154a;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private g3.d lastChildDragAndDropModifierNode;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private g thisDragAndDropTarget;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg3/e;", "currentNode", "Lb4/w1;", "a", "(Lg3/e;)Lb4/w1;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<e, w1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g3.b f67155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f67156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j0 f67157e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g3.b bVar, e eVar, j0 j0Var) {
            super(1);
            this.f67155c = bVar;
            this.f67156d = eVar;
            this.f67157e = j0Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w1 invoke(e eVar) {
            if (!eVar.getIsAttached()) {
                return w1.SkipSubtreeAndContinueTraversal;
            }
            if (!(eVar.thisDragAndDropTarget == null)) {
                y3.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            eVar.thisDragAndDropTarget = (g) eVar.onDragAndDropStart.invoke(this.f67155c);
            boolean z11 = eVar.thisDragAndDropTarget != null;
            if (z11) {
                k.n(this.f67156d).getDragAndDropManager().b(eVar);
            }
            j0 j0Var = this.f67157e;
            j0Var.f86523a = j0Var.f86523a || z11;
            return w1.ContinueTraversal;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg3/e;", "currentNode", "Lb4/w1;", "a", "(Lg3/e;)Lb4/w1;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<e, w1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g3.b f67158c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g3.b bVar) {
            super(1);
            this.f67158c = bVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w1 invoke(e eVar) {
            if (!eVar.getNode().getIsAttached()) {
                return w1.SkipSubtreeAndContinueTraversal;
            }
            g gVar = eVar.thisDragAndDropTarget;
            if (gVar != null) {
                gVar.u1(this.f67158c);
            }
            eVar.thisDragAndDropTarget = null;
            eVar.lastChildDragAndDropModifierNode = null;
            return w1.ContinueTraversal;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb4/x1;", "T", "child", "Lb4/w1;", "a", "(Lb4/x1;)Lb4/w1;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends u implements l<e, w1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0 f67159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f67160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g3.b f67161e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n0 n0Var, e eVar, g3.b bVar) {
            super(1);
            this.f67159c = n0Var;
            this.f67160d = eVar;
            this.f67161e = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w1 invoke(e eVar) {
            e eVar2 = eVar;
            if (!k.n(this.f67160d).getDragAndDropManager().a(eVar2) || !f.d(eVar2, i.a(this.f67161e))) {
                return w1.ContinueTraversal;
            }
            this.f67159c.f86529a = eVar;
            return w1.CancelTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super g3.b, ? extends g> lVar) {
        this.onDragAndDropStart = lVar;
    }

    @Override // g3.g
    public boolean G1(g3.b event) {
        g3.d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            return dVar.G1(event);
        }
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            return gVar.G1(event);
        }
        return false;
    }

    @Override // g3.g
    public void H0(g3.b event) {
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            gVar.H0(event);
            return;
        }
        g3.d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            dVar.H0(event);
        }
    }

    @Override // b4.x1
    /* JADX INFO: renamed from: P0, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // g3.g
    public void P1(g3.b event) {
        x1 x1Var;
        g3.d dVar;
        g3.d dVar2 = this.lastChildDragAndDropModifierNode;
        if (dVar2 == null || !f.d(dVar2, i.a(event))) {
            if (getNode().getIsAttached()) {
                n0 n0Var = new n0();
                y1.f(this, new d(n0Var, this, event));
                x1Var = (x1) n0Var.f86529a;
            } else {
                x1Var = null;
            }
            dVar = (g3.d) x1Var;
        } else {
            dVar = dVar2;
        }
        if (dVar != null && dVar2 == null) {
            f.e(dVar, event);
            g gVar = this.thisDragAndDropTarget;
            if (gVar != null) {
                gVar.U0(event);
            }
        } else if (dVar == null && dVar2 != null) {
            g gVar2 = this.thisDragAndDropTarget;
            if (gVar2 != null) {
                f.e(gVar2, event);
            }
            dVar2.U0(event);
        } else if (!s.f(dVar, dVar2)) {
            if (dVar != null) {
                f.e(dVar, event);
            }
            if (dVar2 != null) {
                dVar2.U0(event);
            }
        } else if (dVar != null) {
            dVar.P1(event);
        } else {
            g gVar3 = this.thisDragAndDropTarget;
            if (gVar3 != null) {
                gVar3.P1(event);
            }
        }
        this.lastChildDragAndDropModifierNode = dVar;
    }

    @Override // g3.g
    public void U0(g3.b event) {
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            gVar.U0(event);
        }
        g3.d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            dVar.U0(event);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // g3.g
    public void m0(g3.b event) {
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            gVar.m0(event);
            return;
        }
        g3.d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            dVar.m0(event);
        }
    }

    @Override // g3.g
    public void u1(g3.b event) {
        f.f(this, new c(event));
    }

    public boolean x2(g3.b startEvent) {
        j0 j0Var = new j0();
        f.f(this, new b(startEvent, this, j0Var));
        return j0Var.f86523a;
    }
}
