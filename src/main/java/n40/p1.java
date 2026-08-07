package n40;

import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Ln40/p1;", "", "Lt50/n;", "repository", "<init>", "(Lt50/n;)V", "", "clientSecret", SearchIntents.EXTRA_QUERY, "Lcom/stripe/android/financialconnections/model/s;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/n;", "b", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f93234b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f93235c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.n repository;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln40/p1$a;", "", "<init>", "()V", "", "SEARCH_INSTITUTIONS_LIMIT", "I", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p1(t50.n repository) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.repository = repository;
    }

    public final Object a(String str, String str2, Continuation<? super InstitutionResponse> continuation) {
        return this.repository.b(str, str2, 10, continuation);
    }
}
