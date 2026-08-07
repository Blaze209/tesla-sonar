package d60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.PaymentMethodCreateParams;
import jn0.s;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import m60.m;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J0\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Ld60/c;", "", "", Scopes.EMAIL, "", "startSession", "Ljn0/s;", "Lg60/b;", "b", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm60/m;", "userInput", "e", "(Lm60/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/t;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lc60/e;", "c", "(Lcom/stripe/android/model/w0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/StateFlow;", DateTokenConverter.CONVERTER_KEY, "()Lkotlinx/coroutines/flow/StateFlow;", "linkAccount", "Lkotlinx/coroutines/flow/Flow;", "Lg60/a;", "f", "()Lkotlinx/coroutines/flow/Flow;", "accountStatus", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface c {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(c cVar, String str, boolean z11, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lookupConsumer-0E7RQCE");
            }
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            return cVar.b(str, z11, continuation);
        }
    }

    Object a(Continuation<? super s<ConsumerSession>> continuation);

    Object b(String str, boolean z11, Continuation<? super s<g60.b>> continuation);

    Object c(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super s<? extends c60.e>> continuation);

    StateFlow<g60.b> d();

    Object e(m mVar, Continuation<? super s<g60.b>> continuation);

    Flow<g60.a> f();
}
