package com.stripe.android.view;

import android.content.Context;
import android.view.View;
import androidx.p003lifecycle.C2797h1;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Lkotlin/Function2;", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/stripe/android/view/a1;", "Ljn0/h0;", "action", "a", "(Landroid/view/View;Landroidx/lifecycle/f1;Lwn0/p;)V", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b1 {
    public static final void a(View view, androidx.p003lifecycle.f1 f1Var, wn0.p<? super LifecycleOwner, ? super a1, jn0.h0> action) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        p013kotlin.jvm.internal.s.k(action, "action");
        LifecycleOwner lifecycleOwnerA = androidx.p003lifecycle.View.a(view);
        if (f1Var == null) {
            f1Var = C2797h1.a(view);
        }
        if (lifecycleOwnerA == null || f1Var == null) {
            return;
        }
        Context applicationContext = view.getContext().getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        action.invoke(lifecycleOwnerA, (a1) new ViewModelProvider(f1Var, new a1.a(applicationContext)).b(a1.class));
    }
}
