package com.stripe.android.paymentsheet.flowcontroller;

import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import n70.o;
import n70.q;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/b;", "", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "a", "()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "flowController", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/b$a;", "", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "a", "(Landroidx/lifecycle/LifecycleOwner;)Lcom/stripe/android/paymentsheet/flowcontroller/b$a;", "Lh/b;", "activityResultCaller", DateTokenConverter.CONVERTER_KEY, "(Lh/b;)Lcom/stripe/android/paymentsheet/flowcontroller/b$a;", "Lkotlin/Function0;", "", "statusBarColor", "c", "(Lwn0/a;)Lcom/stripe/android/paymentsheet/flowcontroller/b$a;", "Ln70/o;", "paymentOptionCallback", "f", "(Ln70/o;)Lcom/stripe/android/paymentsheet/flowcontroller/b$a;", "Ln70/q;", "paymentResultCallback", "b", "(Ln70/q;)Lcom/stripe/android/paymentsheet/flowcontroller/b$a;", "", "initializedViaCompose", "e", "(Z)Lcom/stripe/android/paymentsheet/flowcontroller/b$a;", "Lcom/stripe/android/paymentsheet/flowcontroller/b;", "build", "()Lcom/stripe/android/paymentsheet/flowcontroller/b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        a a(LifecycleOwner lifecycleOwner);

        a b(q paymentResultCallback);

        b build();

        a c(wn0.a<Integer> statusBarColor);

        a d(h.b activityResultCaller);

        a e(boolean initializedViaCompose);

        a f(o paymentOptionCallback);
    }

    DefaultFlowController a();
}
