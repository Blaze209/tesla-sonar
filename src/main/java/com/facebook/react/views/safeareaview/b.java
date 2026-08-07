package com.facebook.react.views.safeareaview;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import k5.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/facebook/react/views/safeareaview/b;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Lk5/e;", "insets", "Ljn0/h0;", "c", "(Lk5/e;)V", "onAttachedToWindow", "()V", "", "p0", "", "p1", "p2", "p3", "p4", "onLayout", "(ZIIII)V", "a", "Lcom/facebook/react/uimanager/v0;", "getReactContext", "()Lcom/facebook/react/uimanager/v0;", "Lcom/facebook/react/uimanager/u0;", "b", "Lcom/facebook/react/uimanager/u0;", "getStateWrapper$ReactAndroid_release", "()Lcom/facebook/react/uimanager/u0;", "setStateWrapper$ReactAndroid_release", "(Lcom/facebook/react/uimanager/u0;)V", "stateWrapper", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private u0 stateWrapper;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/facebook/react/views/safeareaview/b$a", "Lcom/facebook/react/bridge/GuardedRunnable;", "Ljn0/h0;", "runGuarded", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends GuardedRunnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f23531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, v0 v0Var) {
            super(v0Var);
            this.f23531b = eVar;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) b.this.getReactContext().b().getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                int id2 = b.this.getId();
                e eVar = this.f23531b;
                uIManagerModule.updateInsetsPadding(id2, eVar.f84925b, eVar.f84924a, eVar.f84927d, eVar.f84926c);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v0 reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat b(b bVar, View view, WindowInsetsCompat windowInsets) {
        s.k(view, "<unused var>");
        s.k(windowInsets, "windowInsets");
        e eVarF = windowInsets.f(WindowInsetsCompat.n.h() | WindowInsetsCompat.n.b());
        s.j(eVarF, "getInsets(...)");
        bVar.c(eVarF);
        return WindowInsetsCompat.f7692b;
    }

    private final void c(e insets) {
        u0 u0Var = this.stateWrapper;
        if (u0Var == null) {
            v0 v0Var = this.reactContext;
            v0Var.runOnNativeModulesQueueThread(new a(insets, v0Var));
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        w wVar = w.f23413a;
        writableNativeMap.putDouble("left", wVar.d(insets.f84924a));
        writableNativeMap.putDouble("top", wVar.d(insets.f84925b));
        writableNativeMap.putDouble("bottom", wVar.d(insets.f84927d));
        writableNativeMap.putDouble("right", wVar.d(insets.f84926c));
        u0Var.updateState(writableNativeMap);
    }

    public final v0 getReactContext() {
        return this.reactContext;
    }

    /* JADX INFO: renamed from: getStateWrapper$ReactAndroid_release, reason: from getter */
    public final u0 getStateWrapper() {
        return this.stateWrapper;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewCompat.E0(this, new a0() { // from class: com.facebook.react.views.safeareaview.a
            @Override // androidx.core.view.a0
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return b.b(this.f23527a, view, windowInsetsCompat);
            }
        });
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean p11, int p12, int p13, int p14, int p15) {
    }

    public final void setStateWrapper$ReactAndroid_release(u0 u0Var) {
        this.stateWrapper = u0Var;
    }
}
