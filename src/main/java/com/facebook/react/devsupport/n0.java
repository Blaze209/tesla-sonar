package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/devsupport/n0;", "Landroid/app/Dialog;", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", "reactRootView", "<init>", "(Landroid/app/Activity;Landroid/view/View;)V", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "a", "Landroid/view/View;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View reactRootView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Activity context, View view) {
        super(context, com.facebook.react.q.f22912b);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.reactRootView = view;
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat c(int i11, View view, WindowInsetsCompat windowInsets) {
        p013kotlin.jvm.internal.s.k(view, "view");
        p013kotlin.jvm.internal.s.k(windowInsets, "windowInsets");
        k5.e eVarF = windowInsets.f(i11);
        p013kotlin.jvm.internal.s.j(eVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p013kotlin.jvm.internal.s.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(eVarF.f84924a, eVarF.f84925b, eVarF.f84926c, eVarF.f84927d);
        return WindowInsetsCompat.f7692b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat d(wn0.p pVar, View p11, WindowInsetsCompat p12) {
        p013kotlin.jvm.internal.s.k(p11, "p0");
        p013kotlin.jvm.internal.s.k(p12, "p1");
        return (WindowInsetsCompat) pVar.invoke(p11, p12);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        View view = this.reactRootView;
        if (view != null) {
            final int iH = WindowInsetsCompat.n.h() | WindowInsetsCompat.n.b();
            final wn0.p pVar = new wn0.p() { // from class: com.facebook.react.devsupport.l0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return n0.c(iH, (View) obj, (WindowInsetsCompat) obj2);
                }
            };
            ViewCompat.E0(view, new androidx.core.view.a0() { // from class: com.facebook.react.devsupport.m0
                @Override // androidx.core.view.a0
                public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    return n0.d(pVar, view2, windowInsetsCompat);
                }
            });
        }
    }
}
