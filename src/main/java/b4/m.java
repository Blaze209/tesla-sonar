package b4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0010¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0007H\u0010¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\"\u0010\u0003R \u0010(\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0015¨\u0006/"}, d2 = {"Lb4/m;", "Landroidx/compose/ui/d$c;", "<init>", "()V", "", "delegateKindSet", "delegateNode", "Ljn0/h0;", "C2", "(ILandroidx/compose/ui/d$c;)V", "newKindSet", "", "recalculateOwner", "B2", "(IZ)V", "Lb4/z0;", "coordinator", "w2", "(Lb4/z0;)V", "owner", "o2", "(Landroidx/compose/ui/d$c;)V", "Lb4/j;", "T", "delegatableNode", "x2", "(Lb4/j;)Lb4/j;", "instance", "A2", "(Lb4/j;)V", "f2", "l2", "m2", "g2", "k2", "n", "I", "z2", "()I", "getSelfKindSet$ui_release$annotations", "selfKindSet", "o", "Landroidx/compose/ui/d$c;", "y2", "()Landroidx/compose/ui/d$c;", "setDelegate$ui_release", "delegate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class m extends androidx.compose.ui.d.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int selfKindSet = c1.g(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.d.c delegate;

    private final void B2(int newKindSet, boolean recalculateOwner) {
        androidx.compose.ui.d.c child;
        int kindSet = getKindSet();
        r2(newKindSet);
        if (kindSet != newKindSet) {
            if (k.f(this)) {
                n2(newKindSet);
            }
            if (getIsAttached()) {
                androidx.compose.ui.d.c node = getNode();
                androidx.compose.ui.d.c parent = this;
                while (parent != null) {
                    newKindSet |= parent.getKindSet();
                    parent.r2(newKindSet);
                    if (parent == node) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (recalculateOwner && parent == node) {
                    newKindSet = c1.h(node);
                    node.r2(newKindSet);
                }
                int aggregateChildKindSet = newKindSet | ((parent == null || (child = parent.getChild()) == null) ? 0 : child.getAggregateChildKindSet());
                while (parent != null) {
                    aggregateChildKindSet |= parent.getKindSet();
                    parent.n2(aggregateChildKindSet);
                    parent = parent.getParent();
                }
            }
        }
    }

    private final void C2(int delegateKindSet, androidx.compose.ui.d.c delegateNode) {
        int kindSet = getKindSet();
        if ((delegateKindSet & b1.a(2)) == 0 || (b1.a(2) & kindSet) == 0 || (this instanceof b0)) {
            return;
        }
        y3.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + delegateNode);
    }

    protected final void A2(j instance) {
        androidx.compose.ui.d.c cVar = null;
        for (androidx.compose.ui.d.c child = this.delegate; child != null; child = child.getChild()) {
            if (child == instance) {
                if (child.getIsAttached()) {
                    c1.d(child);
                    child.m2();
                    child.g2();
                }
                child.o2(child);
                child.n2(0);
                if (cVar == null) {
                    this.delegate = child.getChild();
                } else {
                    cVar.p2(child.getChild());
                }
                child.p2(null);
                child.t2(null);
                int kindSet = getKindSet();
                int iH = c1.h(this);
                B2(iH, true);
                if (getIsAttached() && (kindSet & b1.a(2)) != 0 && (b1.a(2) & iH) == 0) {
                    x0 nodes = k.m(this).getNodes();
                    getNode().w2(null);
                    nodes.D();
                    return;
                }
                return;
            }
            cVar = child;
        }
        throw new IllegalStateException(("Could not find delegate: " + instance).toString());
    }

    @Override // androidx.compose.ui.d.c
    public void f2() {
        super.f2();
        for (androidx.compose.ui.d.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.w2(getCoordinator());
            if (!delegate.getIsAttached()) {
                delegate.f2();
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public void g2() {
        for (androidx.compose.ui.d.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.g2();
        }
        super.g2();
    }

    @Override // androidx.compose.ui.d.c
    public void k2() {
        super.k2();
        for (androidx.compose.ui.d.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.k2();
        }
    }

    @Override // androidx.compose.ui.d.c
    public void l2() {
        for (androidx.compose.ui.d.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.l2();
        }
        super.l2();
    }

    @Override // androidx.compose.ui.d.c
    public void m2() {
        super.m2();
        for (androidx.compose.ui.d.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.m2();
        }
    }

    @Override // androidx.compose.ui.d.c
    public void o2(androidx.compose.ui.d.c owner) {
        super.o2(owner);
        for (androidx.compose.ui.d.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.o2(owner);
        }
    }

    @Override // androidx.compose.ui.d.c
    public void w2(z0 coordinator) {
        super.w2(coordinator);
        for (androidx.compose.ui.d.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.w2(coordinator);
        }
    }

    protected final <T extends j> T x2(T delegatableNode) {
        androidx.compose.ui.d.c node = delegatableNode.getNode();
        if (node != delegatableNode) {
            androidx.compose.ui.d.c cVar = delegatableNode instanceof androidx.compose.ui.d.c ? (androidx.compose.ui.d.c) delegatableNode : null;
            androidx.compose.ui.d.c parent = cVar != null ? cVar.getParent() : null;
            if (node == getNode() && p013kotlin.jvm.internal.s.f(parent, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.getIsAttached()) {
            y3.a.b("Cannot delegate to an already attached node");
        }
        node.o2(getNode());
        int kindSet = getKindSet();
        int iH = c1.h(node);
        node.r2(iH);
        C2(iH, node);
        node.p2(this.delegate);
        this.delegate = node;
        node.t2(this);
        B2(getKindSet() | iH, false);
        if (getIsAttached()) {
            if ((iH & b1.a(2)) == 0 || (kindSet & b1.a(2)) != 0) {
                w2(getCoordinator());
            } else {
                x0 nodes = k.m(this).getNodes();
                getNode().w2(null);
                nodes.D();
            }
            node.f2();
            node.l2();
            c1.a(node);
        }
        return delegatableNode;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final androidx.compose.ui.d.c getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final int getSelfKindSet() {
        return this.selfKindSet;
    }
}
