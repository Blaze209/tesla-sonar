package androidx.p002activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.y;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import xa.c;
import xa.d;
import xa.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001bJ!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0017\u0010\u001eJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0017¢\u0006\u0004\b \u0010\u0013R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\u00020)8\u0006¢\u0006\u0012\n\u0004\b \u0010*\u0012\u0004\b-\u0010\u0013\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/activity/p;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/e0;", "Lxa/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "c", "Landroidx/lifecycle/y;", "a", "Landroidx/lifecycle/y;", "_lifecycleRegistry", "Lxa/c;", "b", "Lxa/c;", "savedStateRegistryController", "Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "()Landroidx/lifecycle/y;", "lifecycleRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class p extends Dialog implements LifecycleOwner, e0, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private y _lifecycleRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c savedStateRegistryController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    public /* synthetic */ p(Context context, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? 0 : i11);
    }

    private final y b() {
        y yVar = this._lifecycleRegistry;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        this._lifecycleRegistry = yVar2;
        return yVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p pVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        s.k(view, "view");
        c();
        super.addContentView(view, params);
    }

    public void c() {
        Window window = getWindow();
        s.h(window);
        View decorView = window.getDecorView();
        s.j(decorView, "window!!.decorView");
        androidx.p003lifecycle.View.b(decorView, this);
        Window window2 = getWindow();
        s.h(window2);
        View decorView2 = window2.getDecorView();
        s.j(decorView2, "window!!.decorView");
        C2796i0.b(decorView2, this);
        Window window3 = getWindow();
        s.h(window3);
        View decorView3 = window3.getDecorView();
        s.j(decorView3, "window!!.decorView");
        e.b(decorView3, this);
    }

    @Override // androidx.p003lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return b();
    }

    @Override // androidx.p002activity.e0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // xa.d
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.m();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            s.j(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.p(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.d(savedInstanceState);
        b().j(Lifecycle.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        s.j(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().j(Lifecycle.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().j(Lifecycle.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        c();
        super.setContentView(layoutResID);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i11) {
        super(context, i11);
        s.k(context, "context");
        this.savedStateRegistryController = c.INSTANCE.a(this);
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.o
            @Override // java.lang.Runnable
            public final void run() {
                p.d(this.f1918a);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        s.k(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        s.k(view, "view");
        c();
        super.setContentView(view, params);
    }
}
