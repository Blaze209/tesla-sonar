package n40;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln40/z1;", "", "Lt50/p;", "repository", "<init>", "(Lt50/p;)V", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "block", "Ljn0/h0;", "a", "(Lwn0/l;)V", "Lt50/p;", "getRepository", "()Lt50/p;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.p repository;

    public z1(t50.p repository) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.repository = repository;
    }

    public final void a(wn0.l<? super FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> block) {
        p013kotlin.jvm.internal.s.k(block, "block");
        this.repository.i(block);
    }
}
