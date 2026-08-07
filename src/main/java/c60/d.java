package c60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.PaymentMethodCreateParams;
import jn0.s;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import m60.m;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lc60/d;", "", "Lc60/c;", "configuration", "Lf60/b;", "f", "(Lc60/c;)Lf60/b;", "Lkotlinx/coroutines/flow/Flow;", "Lg60/a;", "c", "(Lc60/c;)Lkotlinx/coroutines/flow/Flow;", "Lm60/m;", "userInput", "Ljn0/s;", "", "a", "(Lc60/c;Lm60/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lc60/e;", "b", "(Lc60/c;Lcom/stripe/android/model/w0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/t;", "e", "(Lc60/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/StateFlow;", "", DateTokenConverter.CONVERTER_KEY, "()Lkotlinx/coroutines/flow/StateFlow;", "emailFlow", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface d {
    Object a(LinkConfiguration linkConfiguration, m mVar, Continuation<? super s<Boolean>> continuation);

    Object b(LinkConfiguration linkConfiguration, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super s<? extends e>> continuation);

    Flow<g60.a> c(LinkConfiguration configuration);

    StateFlow<String> d();

    Object e(LinkConfiguration linkConfiguration, Continuation<? super s<ConsumerSession>> continuation);

    f60.b f(LinkConfiguration configuration);
}
