package n40;

import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ln40/x1;", "", "Lt50/h;", "repository", "<init>", "(Lt50/h;)V", "", "Lcom/stripe/android/financialconnections/model/c0;", "accounts", "Ljn0/h0;", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/h;", "getRepository", "()Lt50/h;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.h repository;

    public x1(t50.h repository) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.repository = repository;
    }

    public final Object a(List<PartnerAccount> list, Continuation<? super jn0.h0> continuation) {
        Object objD = this.repository.d(list, continuation);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : jn0.h0.f84049a;
    }
}
