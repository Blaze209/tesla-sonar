package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0004R$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00010\u001ej\b\u0012\u0004\u0012\u00020\u0001`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010+\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/swmansion/rnscreens/j;", "Landroidx/core/view/a0;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "<init>", "()V", "Landroid/view/View;", "getObservedView", "()Landroid/view/View;", "v", "Landroidx/core/view/WindowInsetsCompat;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "registerWithContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "onHostResume", "onHostPause", "onHostDestroy", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnApplyWindowInsetsListener", "(Landroidx/core/view/a0;)V", "removeOnApplyWindowInsetsListener", "view", "", "registerOnView", "(Landroid/view/View;)Z", "unregister", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "listeners", "Ljava/util/HashSet;", "Ljava/lang/ref/WeakReference;", "eventSourceView", "Ljava/lang/ref/WeakReference;", "hasBeenRegistered", "Z", "isObservingContextLifetime", "shouldForwardInsetsToView", "getAllowRegistration", "()Z", "allowRegistration", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements androidx.core.view.a0, LifecycleEventListener {
    private static boolean hasBeenRegistered;
    private static boolean isObservingContextLifetime;
    public static final j INSTANCE = new j();
    private static final HashSet<androidx.core.view.a0> listeners = new HashSet<>();
    private static WeakReference<View> eventSourceView = new WeakReference<>(null);
    private static boolean shouldForwardInsetsToView = true;

    private j() {
    }

    private final boolean getAllowRegistration() {
        return !hasBeenRegistered || eventSourceView.get() == null;
    }

    private final View getObservedView() {
        return eventSourceView.get();
    }

    public final void addOnApplyWindowInsetsListener(androidx.core.view.a0 listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        listeners.add(listener);
    }

    @Override // androidx.core.view.a0
    public WindowInsetsCompat onApplyWindowInsets(View v11, WindowInsetsCompat insets) {
        p013kotlin.jvm.internal.s.k(v11, "v");
        p013kotlin.jvm.internal.s.k(insets, "insets");
        WindowInsetsCompat windowInsetsCompatB0 = shouldForwardInsetsToView ? ViewCompat.b0(v11, insets) : insets;
        p013kotlin.jvm.internal.s.h(windowInsetsCompatB0);
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            windowInsetsCompatB0 = ((androidx.core.view.a0) it.next()).onApplyWindowInsets(v11, insets);
        }
        return windowInsetsCompatB0;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        View observedView = getObservedView();
        if (hasBeenRegistered && observedView != null) {
            ViewCompat.E0(observedView, null);
            hasBeenRegistered = false;
            eventSourceView.clear();
        }
        isObservingContextLifetime = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public final boolean registerOnView(View view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        if (!getAllowRegistration()) {
            return false;
        }
        ViewCompat.E0(view, this);
        eventSourceView = new WeakReference<>(view);
        hasBeenRegistered = true;
        return true;
    }

    public final void registerWithContext(ReactApplicationContext context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        if (isObservingContextLifetime) {
            Log.w("[RNScreens]", "InsetObserverProxy registers on new context while it has not been invalidated on the old one. Please report this as issue at https://github.com/software-mansion/react-native-screens/issues");
        }
        isObservingContextLifetime = true;
        context.addLifecycleEventListener(this);
    }

    public final void removeOnApplyWindowInsetsListener(androidx.core.view.a0 listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        listeners.remove(listener);
    }

    public final void unregister() {
        View observedView = getObservedView();
        if (observedView != null) {
            if (!hasBeenRegistered) {
                observedView = null;
            }
            if (observedView != null) {
                ViewCompat.E0(observedView, null);
            }
        }
    }
}
