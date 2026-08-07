package n40;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln40/d1;", "Ln40/c;", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lt50/j;", "consumerRepository", "<init>", "(Lcom/stripe/android/financialconnections/a$b;Lt50/j;)V", "", "consumerSessionClientSecret", "Ljn0/h0;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/a$b;", "b", "Lt50/j;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d1 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t50.j consumerRepository;

    public d1(com.stripe.android.financialconnections.a.Configuration configuration, t50.j consumerRepository) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(consumerRepository, "consumerRepository");
        this.configuration = configuration;
        this.consumerRepository = consumerRepository;
    }

    @Override // n40.c
    public Object a(String str, Continuation<? super jn0.h0> continuation) {
        Object objF = this.consumerRepository.f(str, this.configuration.getFinancialConnectionsSessionClientSecret(), continuation);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : jn0.h0.f84049a;
    }
}
