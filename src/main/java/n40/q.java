package n40;

import com.stripe.android.financialconnections.model.InstitutionResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Ln40/q;", "", "Lt50/n;", "repository", "<init>", "(Lt50/n;)V", "", "clientSecret", "Lcom/stripe/android/financialconnections/model/s;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/n;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.n repository;

    public q(t50.n repository) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.repository = repository;
    }

    public final Object a(String str, Continuation<? super InstitutionResponse> continuation) {
        return this.repository.a(str, continuation);
    }
}
