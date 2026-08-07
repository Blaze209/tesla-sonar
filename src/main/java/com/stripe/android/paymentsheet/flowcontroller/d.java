package com.stripe.android.paymentsheet.flowcontroller;

import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.f1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.paymentsheet.y;
import n70.o;
import n70.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/d;", "", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lh/d;", "activityResultRegistryOwner", "Lkotlin/Function0;", "", "statusBarColor", "Ln70/o;", "paymentOptionCallback", "Ln70/q;", "paymentResultCallback", "", "initializedViaCompose", "<init>", "(Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Lh/d;Lwn0/a;Ln70/o;Ln70/q;Z)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Ln70/o;Ln70/q;)V", "Lcom/stripe/android/paymentsheet/y$k;", "a", "()Lcom/stripe/android/paymentsheet/y$k;", "Landroidx/lifecycle/f1;", "b", "Landroidx/lifecycle/LifecycleOwner;", "c", "Lh/d;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "e", "Ln70/o;", "f", "Ln70/q;", "g", "Z", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f1 viewModelStoreOwner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h.d activityResultRegistryOwner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Integer> statusBarColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o paymentOptionCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q paymentResultCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean initializedViaCompose;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f53038c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.f53038c = fragment;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            Window window;
            androidx.fragment.app.u activity = this.f53038c.getActivity();
            if (activity == null || (window = activity.getWindow()) == null) {
                return null;
            }
            return Integer.valueOf(window.getStatusBarColor());
        }
    }

    public d(f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, h.d activityResultRegistryOwner, wn0.a<Integer> statusBarColor, o paymentOptionCallback, q paymentResultCallback, boolean z11) {
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(activityResultRegistryOwner, "activityResultRegistryOwner");
        s.k(statusBarColor, "statusBarColor");
        s.k(paymentOptionCallback, "paymentOptionCallback");
        s.k(paymentResultCallback, "paymentResultCallback");
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.lifecycleOwner = lifecycleOwner;
        this.activityResultRegistryOwner = activityResultRegistryOwner;
        this.statusBarColor = statusBarColor;
        this.paymentOptionCallback = paymentOptionCallback;
        this.paymentResultCallback = paymentResultCallback;
        this.initializedViaCompose = z11;
    }

    public final y.k a() {
        return DefaultFlowController.INSTANCE.a(this.viewModelStoreOwner, this.lifecycleOwner, new t70.e(this.activityResultRegistryOwner), this.statusBarColor, this.paymentOptionCallback, this.paymentResultCallback, this.initializedViaCompose);
    }

    public /* synthetic */ d(f1 f1Var, LifecycleOwner lifecycleOwner, h.d dVar, wn0.a aVar, o oVar, q qVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f1Var, lifecycleOwner, dVar, aVar, oVar, qVar, (i11 & 64) != 0 ? false : z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Fragment fragment, o paymentOptionCallback, q paymentResultCallback) {
        s.k(fragment, "fragment");
        s.k(paymentOptionCallback, "paymentOptionCallback");
        s.k(paymentResultCallback, "paymentResultCallback");
        Object host = fragment.getHost();
        h.d dVarRequireActivity = host instanceof h.d ? (h.d) host : null;
        if (dVarRequireActivity == null) {
            dVarRequireActivity = fragment.requireActivity();
            s.j(dVarRequireActivity, "requireActivity(...)");
        }
        this(fragment, fragment, dVarRequireActivity, new a(fragment), paymentOptionCallback, paymentResultCallback, false, 64, null);
    }
}
