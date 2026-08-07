package com.content;

import a60.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.stripe.android.googlepaylauncher.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import s10.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u0001:\u0001 B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/reactnativestripesdk/n0;", "Landroidx/fragment/app/Fragment;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isTestEnv", "paymentMethodRequired", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;ZZLcom/facebook/react/bridge/Promise;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Ljn0/h0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "m", "Lcom/facebook/react/bridge/ReactApplicationContext;", "n", "Z", "o", "p", "Lcom/facebook/react/bridge/Promise;", "q", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext context;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isTestEnv;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean paymentMethodRequired;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Promise promise;

    public n0(ReactApplicationContext context, boolean z11, boolean z12, Promise promise) {
        s.k(context, "context");
        s.k(promise, "promise");
        this.context = context;
        this.isTestEnv = z11;
        this.paymentMethodRequired = z12;
        this.promise = promise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(n0 n0Var, boolean z11) {
        n0Var.promise.resolve(Boolean.valueOf(z11));
        g.d(n0Var, n0Var.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(h.g it) {
        s.k(it, "it");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.k(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.k(view, "view");
        super.onViewCreated(view, savedInstanceState);
        new h(this, new h.Config(this.isTestEnv ? d.Test : d.Production, "", "", false, null, this.paymentMethodRequired, false, 88, null), new h.f() { // from class: com.reactnativestripesdk.l0
            @Override // com.stripe.android.googlepaylauncher.h.f
            public final void a(boolean z11) {
                n0.d(this.f48849a, z11);
            }
        }, new h.InterfaceC0855h() { // from class: com.reactnativestripesdk.m0
            @Override // com.stripe.android.googlepaylauncher.h.InterfaceC0855h
            public final void a(h.g gVar) {
                n0.e(gVar);
            }
        });
    }
}
