package je;

import android.app.Activity;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.core.exception.CheckoutException;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lje/a;", "Lje/b;", "Lcom/adyen/checkout/components/core/action/Action;", "action", "Landroid/app/Activity;", "activity", "Ljn0/h0;", "v", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Lcom/adyen/checkout/core/exception/CheckoutException;", "e", "r", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function1;", "Lce/b;", "callback", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", "Lkotlinx/coroutines/flow/Flow;", "j", "()Lkotlinx/coroutines/flow/Flow;", "exceptionFlow", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a extends b {

    /* JADX INFO: renamed from: je.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C1763a {
        public static void a(a aVar, CheckoutException e11) {
            s.k(e11, "e");
        }
    }

    void i(LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope, l<? super ce.b, h0> callback);

    Flow<CheckoutException> j();

    void r(CheckoutException e11);

    void v(Action action, Activity activity);
}
