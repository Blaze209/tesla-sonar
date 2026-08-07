package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.q0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0017B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/swmansion/gesturehandler/react/m;", "Lcom/facebook/react/views/view/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", "onAttachedToWindow", "()V", IntegerTokenConverter.CONVERTER_KEY, "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "dispatchGenericMotionEvent", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "Landroid/view/View;", "view", "h", "(Landroid/view/View;)V", "a", "Z", "rootViewEnabled", "Lcom/swmansion/gesturehandler/react/l;", "b", "Lcom/swmansion/gesturehandler/react/l;", "rootHelper", "c", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends com.facebook.react.views.view.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean rootViewEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private l rootHelper;

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/swmansion/gesturehandler/react/m$a;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "viewGroup", "", "b", "(Landroid/view/ViewGroup;)Z", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof c) || (parent instanceof m)) {
                    return true;
                }
                if (parent instanceof q0) {
                    return false;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public m(Context context) {
        super(context);
    }

    @Override // com.facebook.react.views.view.e, android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        s.k(event, "event");
        if (this.rootViewEnabled) {
            l lVar = this.rootHelper;
            s.h(lVar);
            if (lVar.e(event)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        s.k(event, "event");
        if (this.rootViewEnabled) {
            l lVar = this.rootHelper;
            s.h(lVar);
            if (lVar.e(event)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(event);
    }

    public final void h(View view) {
        s.k(view, "view");
        l lVar = this.rootHelper;
        if (lVar != null) {
            lVar.d(view);
        }
    }

    public final void i() {
        l lVar = this.rootHelper;
        if (lVar != null) {
            lVar.j();
        }
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean zB = INSTANCE.b(this);
        this.rootViewEnabled = !zB;
        if (zB) {
            Log.i("ReactNative", "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this.rootViewEnabled && this.rootHelper == null) {
            Context context = getContext();
            s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.rootHelper = new l((ReactContext) context, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (this.rootViewEnabled) {
            l lVar = this.rootHelper;
            s.h(lVar);
            lVar.i();
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }
}
