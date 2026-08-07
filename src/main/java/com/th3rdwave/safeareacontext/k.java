package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.u0;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0007H\u0014¢\u0006\u0004\b \u0010\tJ\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\rR\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/th3rdwave/safeareacontext/k;", "Lcom/facebook/react/views/view/e;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", "updateInsets", "()V", "waitForReactLayout", "", "k", "()Z", "Landroid/view/View;", "j", "()Landroid/view/View;", "Lcom/facebook/react/uimanager/u0;", "getStateWrapper", "()Lcom/facebook/react/uimanager/u0;", "stateWrapper", "setStateWrapper", "(Lcom/facebook/react/uimanager/u0;)V", "Lcom/th3rdwave/safeareacontext/o;", "mode", "setMode", "(Lcom/th3rdwave/safeareacontext/o;)V", "Lcom/th3rdwave/safeareacontext/m;", "edges", "setEdges", "(Lcom/th3rdwave/safeareacontext/m;)V", "onAttachedToWindow", "onDetachedFromWindow", "onPreDraw", "a", "Lcom/th3rdwave/safeareacontext/o;", "mMode", "Lcom/th3rdwave/safeareacontext/a;", "b", "Lcom/th3rdwave/safeareacontext/a;", "mInsets", "c", "Lcom/th3rdwave/safeareacontext/m;", "mEdges", DateTokenConverter.CONVERTER_KEY, "Landroid/view/View;", "mProviderView", "e", "Lcom/facebook/react/uimanager/u0;", "mStateWrapper", "react-native-safe-area-context_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends com.facebook.react.views.view.e implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private o mMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private EdgeInsets mInsets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private SafeAreaViewEdges mEdges;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private View mProviderView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private u0 mStateWrapper;

    public k(Context context) {
        super(context);
        this.mMode = o.PADDING;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View j() {
        for (ViewParent parent = getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof f) {
                return (View) parent;
            }
        }
        return this;
    }

    private final boolean k() {
        EdgeInsets edgeInsetsE;
        View view = this.mProviderView;
        if (view == null || (edgeInsetsE = h.e(view)) == null || s.f(this.mInsets, edgeInsetsE)) {
            return false;
        }
        this.mInsets = edgeInsetsE;
        updateInsets();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().m(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ReentrantLock reentrantLock, j0 j0Var, Condition condition) {
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

    private final void updateInsets() {
        EdgeInsets edgeInsets = this.mInsets;
        if (edgeInsets != null) {
            SafeAreaViewEdges safeAreaViewEdges = this.mEdges;
            if (safeAreaViewEdges == null) {
                l lVar = l.ADDITIVE;
                safeAreaViewEdges = new SafeAreaViewEdges(lVar, lVar, lVar, lVar);
            }
            u0 mStateWrapper = getMStateWrapper();
            if (mStateWrapper != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("insets", q.b(edgeInsets));
                s.h(writableMapCreateMap);
                mStateWrapper.updateState(writableMapCreateMap);
                return;
            }
            SafeAreaViewLocalData safeAreaViewLocalData = new SafeAreaViewLocalData(edgeInsets, this.mMode, safeAreaViewEdges);
            ReactContext reactContextA = r.a(this);
            final UIManagerModule uIManagerModule = (UIManagerModule) reactContextA.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), safeAreaViewLocalData);
                reactContextA.runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.l(uIManagerModule);
                    }
                });
                waitForReactLayout();
            }
        }
    }

    private final void waitForReactLayout() {
        final j0 j0Var = new j0();
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        long jNanoTime = System.nanoTime();
        r.a(this).runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.j
            @Override // java.lang.Runnable
            public final void run() {
                k.m(reentrantLock, j0Var, conditionNewCondition);
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
            Log.w(com.swmansion.rnscreens.safearea.f.TAG, "Timed out waiting for layout.");
        }
    }

    /* JADX INFO: renamed from: getStateWrapper, reason: from getter */
    public final u0 getMStateWrapper() {
        return this.mStateWrapper;
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View viewJ = j();
        this.mProviderView = viewJ;
        if (viewJ != null && (viewTreeObserver = viewJ.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.mProviderView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.mProviderView = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zK = k();
        if (zK) {
            requestLayout();
        }
        return !zK;
    }

    public final void setEdges(SafeAreaViewEdges edges) {
        s.k(edges, "edges");
        this.mEdges = edges;
        updateInsets();
    }

    public final void setMode(o mode) {
        s.k(mode, "mode");
        this.mMode = mode;
        updateInsets();
    }

    public final void setStateWrapper(u0 stateWrapper) {
        this.mStateWrapper = stateWrapper;
    }
}
