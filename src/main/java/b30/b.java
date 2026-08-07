package b30;

import android.view.View;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.u;
import androidx.p003lifecycle.y;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'¨\u0006."}, d2 = {"Lb30/b;", "Lb30/d;", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/u;", "Lkotlin/Function1;", "Landroid/view/View;", "Landroidx/lifecycle/Lifecycle;", "findParentLifecycle", "", "enforceMainThread", "<init>", "(Lwn0/l;Z)V", "v", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "o", "()V", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "isAttached", "a", "(Z)V", "Lwn0/l;", "b", "Landroid/view/View;", "view", "Landroidx/lifecycle/y;", "c", "Landroidx/lifecycle/y;", "localLifecycle", DateTokenConverter.CONVERTER_KEY, "Z", "hasBeenDestroyed", "e", "Landroidx/lifecycle/Lifecycle;", "parentLifecycle", "f", "destroyOnDetach", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class b implements d, LifecycleOwner, View.OnAttachStateChangeListener, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<View, Lifecycle> findParentLifecycle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y localLifecycle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasBeenDestroyed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Lifecycle parentLifecycle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean destroyOnDetach;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super View, ? extends Lifecycle> findParentLifecycle, boolean z11) {
        y yVarG;
        s.k(findParentLifecycle, "findParentLifecycle");
        this.findParentLifecycle = findParentLifecycle;
        if (z11) {
            yVarG = new y(this);
        } else {
            yVarG = y.g(this);
            s.j(yVarG, "createUnsafe(this)");
        }
        this.localLifecycle = yVarG;
    }

    public static /* synthetic */ void b(b bVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            View view = bVar.view;
            z11 = view == null ? false : view.isAttachedToWindow();
        }
        bVar.a(z11);
    }

    public final void a(boolean isAttached) {
        Lifecycle lifecycle = this.parentLifecycle;
        Lifecycle.State state = lifecycle == null ? null : lifecycle.getState();
        Lifecycle.State state2 = this.localLifecycle.getState();
        s.j(state2, "localLifecycle.currentState");
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state2 == state3 || this.hasBeenDestroyed) {
            this.view = null;
            return;
        }
        y yVar = this.localLifecycle;
        if (this.destroyOnDetach && !isAttached) {
            state = state3;
        } else if (state == null && state2 != (state = Lifecycle.State.INITIALIZED)) {
            throw new AssertionError("Must have a parent lifecycle after attaching and until being destroyed.");
        }
        if (state == state3) {
            this.hasBeenDestroyed = true;
            Lifecycle lifecycle2 = this.parentLifecycle;
            if (lifecycle2 != null) {
                lifecycle2.d(this);
            }
            this.parentLifecycle = null;
            View view = this.view;
            if (view != null) {
                this.view = null;
                view.removeOnAttachStateChangeListener(this);
            }
            Lifecycle.State state4 = Lifecycle.State.INITIALIZED;
            if (state2 == state4) {
                state3 = state4;
            }
        } else {
            state3 = state;
        }
        yVar.o(state3);
    }

    @Override // androidx.p003lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.localLifecycle;
    }

    @Override // b30.d
    public void o() {
        if (this.destroyOnDetach) {
            return;
        }
        this.destroyOnDetach = true;
        b(this, false, 1, null);
    }

    @Override // androidx.p003lifecycle.u
    public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
        s.k(source, "source");
        s.k(event, "event");
        b(this, false, 1, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v11) {
        s.k(v11, "v");
        if (this.localLifecycle.getState() == Lifecycle.State.DESTROYED || this.hasBeenDestroyed) {
            return;
        }
        this.view = v11;
        Lifecycle lifecycle = this.parentLifecycle;
        Lifecycle lifecycleInvoke = this.findParentLifecycle.invoke(v11);
        this.parentLifecycle = lifecycleInvoke;
        if (lifecycleInvoke != lifecycle) {
            if (lifecycle != null) {
                lifecycle.d(this);
            }
            Lifecycle lifecycle2 = this.parentLifecycle;
            if (lifecycle2 != null) {
                lifecycle2.a(this);
            }
        }
        a(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v11) {
        s.k(v11, "v");
        a(false);
    }

    public /* synthetic */ b(l lVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i11 & 2) != 0 ? true : z11);
    }
}
