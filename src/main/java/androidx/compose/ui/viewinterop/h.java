package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.o;
import b4.b1;
import b4.j1;
import b4.k;
import b4.m;
import com.plaid.internal.EnumC4419g;
import i3.t;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0018\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001eR$\u0010%\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/viewinterop/h;", "Landroidx/compose/ui/d$c;", "Li3/j;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/view/View$OnAttachStateChangeListener;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "x2", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/k;", "focusProperties", "Ljn0/h0;", "y1", "(Landroidx/compose/ui/focus/k;)V", "Landroidx/compose/ui/focus/d;", "focusDirection", "Landroidx/compose/ui/focus/o;", "y2", "(I)Landroidx/compose/ui/focus/o;", "z2", "Landroid/view/View;", "oldFocus", "newFocus", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "h2", "i2", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "n", "Landroid/view/View;", "getFocusedChild", "()Landroid/view/View;", "setFocusedChild", "focusedChild", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h extends androidx.compose.ui.d.c implements i3.j, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private View focusedChild;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends p implements l<androidx.compose.ui.focus.d, o> {
        a(Object obj) {
            super(1, obj, h.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        public final o a(int i11) {
            return ((h) this.receiver).y2(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ o invoke(androidx.compose.ui.focus.d dVar) {
            return a(dVar.getValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class b extends p implements l<androidx.compose.ui.focus.d, o> {
        b(Object obj) {
            super(1, obj, h.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        public final o a(int i11) {
            return ((h) this.receiver).z2(i11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ o invoke(androidx.compose.ui.focus.d dVar) {
            return a(dVar.getValue());
        }
    }

    private final FocusTargetNode x2() {
        int iA = b1.a(1024);
        if (!getNode().getIsAttached()) {
            y3.a.b("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.d.c node = getNode();
        if ((node.getAggregateChildKindSet() & iA) != 0) {
            boolean z11 = false;
            for (androidx.compose.ui.d.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iA) != 0) {
                    androidx.compose.ui.d.c cVarG = child;
                    t2.b bVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarG;
                            if (z11) {
                                return focusTargetNode;
                            }
                            z11 = true;
                        } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof m)) {
                            int i11 = 0;
                            for (androidx.compose.ui.d.c delegate = ((m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iA) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        cVarG = delegate;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                        }
                                        if (cVarG != null) {
                                            bVar.b(cVarG);
                                            cVarG = null;
                                        }
                                        bVar.b(delegate);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        cVarG = k.g(bVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        super.h2();
        g.g(this).addOnAttachStateChangeListener(this);
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        g.g(this).removeOnAttachStateChangeListener(this);
        this.focusedChild = null;
        super.i2();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View oldFocus, View newFocus) {
        if (k.m(this).getOwner() == null) {
            return;
        }
        View viewG = g.g(this);
        i3.i focusOwner = k.n(this).getFocusOwner();
        j1 j1VarN = k.n(this);
        boolean z11 = (oldFocus == null || s.f(oldFocus, j1VarN) || !g.d(viewG, oldFocus)) ? false : true;
        boolean z12 = (newFocus == null || s.f(newFocus, j1VarN) || !g.d(viewG, newFocus)) ? false : true;
        if (z11 && z12) {
            this.focusedChild = newFocus;
            return;
        }
        if (!z12) {
            if (!z11) {
                this.focusedChild = null;
                return;
            }
            this.focusedChild = null;
            if (x2().E2().isFocused()) {
                focusOwner.f(false, true, false, androidx.compose.ui.focus.d.INSTANCE.c());
                return;
            }
            return;
        }
        this.focusedChild = newFocus;
        FocusTargetNode focusTargetNodeX2 = x2();
        if (focusTargetNodeX2.E2().getHasFocus()) {
            return;
        }
        t tVarB = focusOwner.b();
        try {
            if (tVarB.ongoingTransaction) {
                tVarB.g();
            }
            tVarB.f();
            androidx.compose.ui.focus.s.i(focusTargetNodeX2);
        } finally {
            tVarB.h();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v11) {
        v11.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v11) {
        v11.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override // i3.j
    public void y1(androidx.compose.ui.focus.k focusProperties) {
        focusProperties.r(false);
        focusProperties.s(new a(this));
        focusProperties.w(new b(this));
    }

    public final o y2(int focusDirection) {
        View viewG = g.g(this);
        if (viewG.isFocused() || viewG.hasFocus()) {
            return o.INSTANCE.b();
        }
        i3.i focusOwner = k.n(this).getFocusOwner();
        Object objN = k.n(this);
        s.i(objN, "null cannot be cast to non-null type android.view.View");
        return androidx.compose.ui.focus.h.b(viewG, androidx.compose.ui.focus.h.c(focusDirection), g.f(focusOwner, (View) objN, viewG)) ? o.INSTANCE.b() : o.INSTANCE.a();
    }

    public final o z2(int focusDirection) {
        View viewG = g.g(this);
        if (!viewG.hasFocus()) {
            return o.INSTANCE.b();
        }
        i3.i focusOwner = k.n(this).getFocusOwner();
        Object objN = k.n(this);
        s.i(objN, "null cannot be cast to non-null type android.view.View");
        View view = (View) objN;
        if (!(viewG instanceof ViewGroup)) {
            if (view.requestFocus()) {
                return o.INSTANCE.b();
            }
            throw new IllegalStateException("host view did not take focus");
        }
        Rect rectF = g.f(focusOwner, view, viewG);
        Integer numC = androidx.compose.ui.focus.h.c(focusDirection);
        int iIntValue = numC != null ? numC.intValue() : EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View view2 = this.focusedChild;
        View viewFindNextFocus = view2 != null ? focusFinder.findNextFocus((ViewGroup) view, view2, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) view, rectF, iIntValue);
        if (viewFindNextFocus != null && g.d(viewG, viewFindNextFocus)) {
            viewFindNextFocus.requestFocus(iIntValue, rectF);
            return o.INSTANCE.a();
        }
        if (view.requestFocus()) {
            return o.INSTANCE.b();
        }
        throw new IllegalStateException("host view did not take focus");
    }
}
