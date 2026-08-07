package a30;

import android.content.Context;
import android.view.View;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004*\u0001\u001b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R!\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006\u001e"}, d2 = {"La30/j;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/view/View;", "view", "Lkotlin/Function0;", "Ljn0/h0;", "Lcom/squareup/workflow1/ui/BackPressHandler;", "handler", "<init>", "(Landroid/view/View;Lwn0/a;)V", "b", "()V", "c", "attachedView", "onViewAttachedToWindow", "(Landroid/view/View;)V", "detachedView", "onViewDetachedFromWindow", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "a", "Landroid/view/View;", "Lwn0/a;", "()Lwn0/a;", "a30/j$a", "La30/j$a;", "onBackPressedCallback", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class j implements View.OnAttachStateChangeListener, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a onBackPressedCallback;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"a30/j$a", "Landroidx/activity/b0;", "Ljn0/h0;", "handleOnBackPressed", "()V", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a extends androidx.p002activity.b0 {
        a() {
            super(false);
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackPressed() {
            j.this.a().invoke();
        }
    }

    public j(View view, wn0.a<jn0.h0> handler) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(handler, "handler");
        this.view = view;
        this.handler = handler;
        this.onBackPressedCallback = new a();
    }

    public final wn0.a<jn0.h0> a() {
        return this.handler;
    }

    public final void b() {
        Lifecycle lifecycle;
        Context context = this.view.getContext();
        p013kotlin.jvm.internal.s.j(context, "view.context");
        androidx.p002activity.e0 e0VarB = e.b(context);
        if (e0VarB == null) {
            return;
        }
        e0VarB.getOnBackPressedDispatcher().i(e0VarB, this.onBackPressedCallback);
        this.view.addOnAttachStateChangeListener(this);
        if (this.view.isAttachedToWindow()) {
            onViewAttachedToWindow(this.view);
        }
        LifecycleOwner lifecycleOwnerA = androidx.p003lifecycle.View.a(this.view);
        if (lifecycleOwnerA == null || (lifecycle = lifecycleOwnerA.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(this);
    }

    public final void c() {
        Lifecycle lifecycle;
        this.onBackPressedCallback.remove();
        this.view.removeOnAttachStateChangeListener(this);
        LifecycleOwner lifecycleOwnerA = androidx.p003lifecycle.View.a(this.view);
        if (lifecycleOwnerA == null || (lifecycle = lifecycleOwnerA.getLifecycle()) == null) {
            return;
        }
        lifecycle.d(this);
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        p013kotlin.jvm.internal.s.k(owner, "owner");
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View attachedView) {
        p013kotlin.jvm.internal.s.k(attachedView, "attachedView");
        if (this.view != attachedView) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.onBackPressedCallback.setEnabled(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View detachedView) {
        p013kotlin.jvm.internal.s.k(detachedView, "detachedView");
        if (this.view != detachedView) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.onBackPressedCallback.setEnabled(false);
    }
}
