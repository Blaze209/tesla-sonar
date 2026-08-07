package n40;

import com.stripe.android.model.ConsumerSession;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln40/v1;", "", "Lt50/j;", "consumerSessionRepository", "<init>", "(Lt50/j;)V", "", "consumerSessionClientSecret", "Lcom/stripe/android/model/t;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "businessName", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/j;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.j consumerSessionRepository;

    public v1(t50.j consumerSessionRepository) {
        p013kotlin.jvm.internal.s.k(consumerSessionRepository, "consumerSessionRepository");
        this.consumerSessionRepository = consumerSessionRepository;
    }

    public final Object a(String str, String str2, Continuation<? super ConsumerSession> continuation) {
        return this.consumerSessionRepository.d(str, str2, com.stripe.android.model.t1.EMAIL, com.stripe.android.model.z.NETWORKED_CONNECTIONS_OTP_EMAIL, continuation);
    }

    public final Object b(String str, Continuation<? super ConsumerSession> continuation) {
        return this.consumerSessionRepository.d(str, null, com.stripe.android.model.t1.SMS, null, continuation);
    }
}
