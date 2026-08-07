package com.p005reactnativeavoidsoftinput;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.t0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.w;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import jn0.h0;
import k5.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: renamed from: com.reactnativeavoidsoftinput.o, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0015\u001a+\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b \u0010!\u001a\u0015\u0010#\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\"¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroid/view/View;", "view", "rootView", "Landroid/widget/ScrollView;", "h", "(Landroid/view/View;Landroid/view/View;)Landroid/widget/ScrollView;", "Lcom/facebook/react/uimanager/q0;", "", "b", "(Landroid/view/View;Lcom/facebook/react/uimanager/q0;)Z", "", "to", "c", "(I)I", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "f", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/q0;", "e", "(Landroid/view/View;)Lcom/facebook/react/uimanager/q0;", "g", "(Landroid/view/View;)I", "j", "scrollView", "Lkotlin/Function1;", "Ljn0/h0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "k", "(Landroid/widget/ScrollView;Lwn0/l;)V", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/uimanager/events/EventDispatcher;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReactContext;Landroid/view/View;)Lcom/facebook/react/uimanager/events/EventDispatcher;", "Landroid/content/Context;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)I", "react-native-avoid-softinput_reactnative77Release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class View {
    public static final boolean b(android.view.View view, q0 q0Var) {
        s.k(view, "view");
        if (view.getParent() == null || s.f(view.getParent(), q0Var) || !(view.getParent() instanceof android.view.View)) {
            return false;
        }
        if (view.getParent() instanceof q) {
            return true;
        }
        Object parent = view.getParent();
        s.i(parent, "null cannot be cast to non-null type android.view.View");
        return b((android.view.View) parent, q0Var);
    }

    public static final int c(int i11) {
        return (int) w.f(i11);
    }

    public static final EventDispatcher d(ReactContext context, android.view.View view) {
        s.k(context, "context");
        s.k(view, "view");
        return b1.c(context, view.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final q0 e(android.view.View view) {
        android.view.View view2 = view;
        while (view2 != 0) {
            if (view2 instanceof q0) {
                return (q0) view2;
            }
            Object parent = view2.getParent();
            if (!(parent instanceof android.view.View)) {
                return null;
            }
            view2 = (android.view.View) parent;
        }
        return null;
    }

    public static final q0 f(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        Activity currentActivity = reactContext.getCurrentActivity();
        Object obj = null;
        if (currentActivity == null) {
            return null;
        }
        android.view.View decorView = currentActivity.getWindow().getDecorView();
        s.j(decorView, "getDecorView(...)");
        for (android.view.View view : t0.b(decorView)) {
            if (view instanceof q0) {
                obj = view;
                break;
            }
        }
        return (q0) obj;
    }

    public static final int g(android.view.View view) {
        s.k(view, "view");
        WindowInsetsCompat windowInsetsCompatH = ViewCompat.H(view);
        e eVarF = windowInsetsCompatH != null ? windowInsetsCompatH.f(WindowInsetsCompat.n.h()) : null;
        if (eVarF != null) {
            return eVarF.f84927d;
        }
        return 0;
    }

    public static final ScrollView h(android.view.View view, android.view.View rootView) {
        s.k(rootView, "rootView");
        if (view == null || s.f(view.getParent(), rootView) || !(view.getParent() instanceof android.view.View)) {
            return null;
        }
        if (view.getParent() instanceof ScrollView) {
            ViewParent parent = view.getParent();
            s.i(parent, "null cannot be cast to non-null type android.widget.ScrollView");
            return (ScrollView) parent;
        }
        Object parent2 = view.getParent();
        s.i(parent2, "null cannot be cast to non-null type android.view.View");
        return h((android.view.View) parent2, rootView);
    }

    public static final int i(Context context) {
        s.k(context, "context");
        return b1.e(context);
    }

    public static final int j(android.view.View view) {
        s.k(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return (d.c().heightPixels - (iArr[1] + view.getHeight())) - g(view);
    }

    public static final void k(ScrollView scrollView, final l<? super Integer, h0> lVar) {
        s.k(scrollView, "scrollView");
        scrollView.setOnScrollChangeListener(new android.view.View.OnScrollChangeListener() { // from class: com.reactnativeavoidsoftinput.n
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                View.l(lVar, view, i11, i12, i13, i14);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(l lVar, android.view.View view, int i11, int i12, int i13, int i14) {
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i12));
        }
    }
}
