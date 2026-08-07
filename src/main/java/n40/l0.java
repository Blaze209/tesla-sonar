package n40;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ln40/l0;", "", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lt50/p;", "repository", "<init>", "(Lcom/stripe/android/financialconnections/a$b;Lt50/p;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/a$b;", "b", "Lt50/p;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t50.p repository;

    public l0(com.stripe.android.financialconnections.a.Configuration configuration, t50.p repository) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.configuration = configuration;
        this.repository = repository;
    }

    public final Object a(Continuation<? super FinancialConnectionsSessionManifest> continuation) {
        return this.repository.k(this.configuration.getFinancialConnectionsSessionClientSecret(), continuation);
    }
}
