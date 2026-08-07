package com.swmansion.rnscreens.safearea;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import ca0.SafeAreaViewEdges;
import ca0.SafeAreaViewLocalData;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001=B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001d\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\b018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010:R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010;¨\u0006>"}, d2 = {"Lcom/swmansion/rnscreens/safearea/f;", "Lcom/facebook/react/views/view/e;", "Landroidx/core/view/a0;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Lcom/swmansion/rnscreens/safearea/c;", "findAncestorProvider", "()Lcom/swmansion/rnscreens/safearea/c;", "", "updateInsetsIfNeeded", "()Z", "Ljn0/h0;", "updateInsets", "()V", "waitForReactLayout", "Lk5/e;", "insets", "getConsumedInsetsFromSelectedEdges", "(Lk5/e;)Lk5/e;", "Lcom/facebook/react/uimanager/u0;", "getStateWrapper", "()Lcom/facebook/react/uimanager/u0;", "stateWrapper", "setStateWrapper", "(Lcom/facebook/react/uimanager/u0;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/swmansion/rnscreens/safearea/a;", "newInterfaceInsets", "onInterfaceInsetsChange", "(Lcom/swmansion/rnscreens/safearea/a;)V", "Landroid/view/View;", "view", "Landroidx/core/view/WindowInsetsCompat;", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Lca0/a;", "edges", "setEdges", "(Lca0/a;)V", "Lcom/swmansion/rnscreens/safearea/b;", "insetType", "setInsetType", "(Lcom/swmansion/rnscreens/safearea/b;)V", "onPreDraw", "Lcom/facebook/react/uimanager/v0;", "Ljava/lang/ref/WeakReference;", "provider", "Ljava/lang/ref/WeakReference;", "currentInterfaceInsets", "Lcom/swmansion/rnscreens/safearea/a;", "currentSystemInsets", "needsInsetsUpdate", "Z", "Lcom/facebook/react/uimanager/u0;", "Lca0/a;", "Lcom/swmansion/rnscreens/safearea/b;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class f extends com.facebook.react.views.view.e implements a0, ViewTreeObserver.OnPreDrawListener {
    public static final String TAG = "SafeAreaView";
    private EdgeInsets currentInterfaceInsets;
    private EdgeInsets currentSystemInsets;
    private SafeAreaViewEdges edges;
    private b insetType;
    private boolean needsInsetsUpdate;
    private WeakReference<c> provider;
    private final v0 reactContext;
    private u0 stateWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v0 reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.provider = new WeakReference<>(null);
        EdgeInsets.Companion companion = EdgeInsets.INSTANCE;
        this.currentInterfaceInsets = companion.getZERO();
        this.currentSystemInsets = companion.getZERO();
        this.insetType = b.ALL;
        ViewCompat.E0(this, this);
    }

    private final c findAncestorProvider() {
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof c)) {
            parent = parent.getParent();
        }
        if (parent instanceof c) {
            return (c) parent;
        }
        return null;
    }

    private final k5.e getConsumedInsetsFromSelectedEdges(k5.e insets) {
        SafeAreaViewEdges safeAreaViewEdges = this.edges;
        int i11 = safeAreaViewEdges != null ? safeAreaViewEdges.getLeft() : false ? 0 : insets.f84924a;
        SafeAreaViewEdges safeAreaViewEdges2 = this.edges;
        int i12 = safeAreaViewEdges2 != null ? safeAreaViewEdges2.getTop() : false ? 0 : insets.f84925b;
        SafeAreaViewEdges safeAreaViewEdges3 = this.edges;
        int i13 = safeAreaViewEdges3 != null ? safeAreaViewEdges3.getRight() : false ? 0 : insets.f84926c;
        SafeAreaViewEdges safeAreaViewEdges4 = this.edges;
        k5.e eVarC = k5.e.c(i11, i12, i13, safeAreaViewEdges4 != null ? safeAreaViewEdges4.getBottom() : false ? 0 : insets.f84927d);
        s.j(eVarC, "of(...)");
        return eVarC;
    }

    private final void updateInsets() {
        EdgeInsets.Companion companion = EdgeInsets.INSTANCE;
        EdgeInsets edgeInsetsMax = companion.max(this.insetType.containsInterface() ? this.currentInterfaceInsets : companion.getZERO(), this.insetType.containsSystem() ? this.currentSystemInsets : companion.getZERO());
        getStateWrapper();
        SafeAreaViewEdges zero = this.edges;
        if (zero == null) {
            zero = SafeAreaViewEdges.INSTANCE.getZERO();
        }
        SafeAreaViewLocalData safeAreaViewLocalData = new SafeAreaViewLocalData(edgeInsetsMax, zero);
        ReactContext reactContextD = b1.d(this);
        s.j(reactContextD, "getReactContext(...)");
        final UIManagerModule uIManagerModule = (UIManagerModule) reactContextD.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), safeAreaViewLocalData);
            reactContextD.runOnNativeModulesQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.safearea.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.updateInsets$lambda$1(uIManagerModule);
                }
            });
            waitForReactLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateInsets$lambda$1(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().m(-1);
    }

    private final boolean updateInsetsIfNeeded() {
        if (!this.needsInsetsUpdate) {
            return false;
        }
        this.needsInsetsUpdate = false;
        updateInsets();
        return true;
    }

    private final void waitForReactLayout() {
        final j0 j0Var = new j0();
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        long jNanoTime = System.nanoTime();
        b1.d(this).runOnNativeModulesQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.safearea.d
            @Override // java.lang.Runnable
            public final void run() {
                f.waitForReactLayout$lambda$3(reentrantLock, j0Var, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        long jNanoTime2 = 0;
        while (!j0Var.f86523a && jNanoTime2 < 500000000) {
            try {
                try {
                    conditionNewCondition.awaitNanos(500000000L);
                } catch (InterruptedException unused) {
                    j0Var.f86523a = true;
                }
                jNanoTime2 += System.nanoTime() - jNanoTime;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        h0 h0Var = h0.f84049a;
        reentrantLock.unlock();
        if (jNanoTime2 >= 500000000) {
            Log.w(TAG, "Timed out waiting for layout.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitForReactLayout$lambda$3(ReentrantLock reentrantLock, j0 j0Var, Condition condition) {
        reentrantLock.lock();
        try {
            if (!j0Var.f86523a) {
                j0Var.f86523a = true;
                condition.signal();
            }
            h0 h0Var = h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final u0 getStateWrapper() {
        return this.stateWrapper;
    }

    @Override // androidx.core.view.a0
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        s.k(view, "view");
        s.k(insets, "insets");
        k5.e eVarF = insets.f(WindowInsetsCompat.n.h() | WindowInsetsCompat.n.b());
        s.j(eVarF, "getInsets(...)");
        if (!s.f(eVarF, this.currentSystemInsets)) {
            this.currentSystemInsets = EdgeInsets.INSTANCE.fromInsets(eVarF);
            if (this.insetType.containsSystem()) {
                this.needsInsetsUpdate = true;
            }
        }
        WindowInsetsCompat.a aVar = new WindowInsetsCompat.a(insets);
        if (this.insetType.containsSystem()) {
            int iH = WindowInsetsCompat.n.h();
            k5.e eVarF2 = insets.f(WindowInsetsCompat.n.h());
            s.j(eVarF2, "getInsets(...)");
            aVar.b(iH, getConsumedInsetsFromSelectedEdges(eVarF2));
            int iB = WindowInsetsCompat.n.b();
            k5.e eVarF3 = insets.f(WindowInsetsCompat.n.b());
            s.j(eVarF3, "getInsets(...)");
            aVar.b(iB, getConsumedInsetsFromSelectedEdges(eVarF3));
        }
        WindowInsetsCompat windowInsetsCompatA = aVar.a();
        s.j(windowInsetsCompatA, "build(...)");
        return windowInsetsCompatA;
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        getViewTreeObserver().addOnPreDrawListener(this);
        c cVarFindAncestorProvider = findAncestorProvider();
        if (cVarFindAncestorProvider == null) {
            super.onAttachedToWindow();
            return;
        }
        cVarFindAncestorProvider.setOnInterfaceInsetsChangeListener(this);
        this.provider = new WeakReference<>(cVarFindAncestorProvider);
        this.currentInterfaceInsets = cVarFindAncestorProvider.getInterfaceInsets();
        updateInsets();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        c cVar = this.provider.get();
        if (cVar != null) {
            cVar.removeOnInterfaceInsetsChangeListener(this);
        }
        getViewTreeObserver().removeOnPreDrawListener(this);
        super.onDetachedFromWindow();
    }

    public final void onInterfaceInsetsChange(EdgeInsets newInterfaceInsets) {
        s.k(newInterfaceInsets, "newInterfaceInsets");
        if (s.f(newInterfaceInsets, this.currentInterfaceInsets)) {
            return;
        }
        this.currentInterfaceInsets = newInterfaceInsets;
        if (this.insetType.containsInterface()) {
            this.needsInsetsUpdate = true;
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zUpdateInsetsIfNeeded = updateInsetsIfNeeded();
        if (zUpdateInsetsIfNeeded) {
            requestLayout();
        }
        return !zUpdateInsetsIfNeeded;
    }

    public final void setEdges(SafeAreaViewEdges edges) {
        s.k(edges, "edges");
        this.edges = edges;
        requestApplyInsets();
        this.needsInsetsUpdate = true;
    }

    public final void setInsetType(b insetType) {
        s.k(insetType, "insetType");
        this.insetType = insetType;
        requestApplyInsets();
        this.needsInsetsUpdate = true;
    }

    public final void setStateWrapper(u0 stateWrapper) {
        this.stateWrapper = stateWrapper;
    }
}
