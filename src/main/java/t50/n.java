package t50;

import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lt50/n;", "", "", "clientSecret", "Lcom/stripe/android/financialconnections/model/s;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", SearchIntents.EXTRA_QUERY, "", "limit", "b", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f112584a;

    /* JADX INFO: renamed from: t50.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt50/n$a;", "", "<init>", "()V", "Lr50/a;", "requestExecutor", "Lu50/c;", "provideApiRequestOptions", "Lw30/l$b;", "apiRequestFactory", "Lt50/n;", "a", "(Lr50/a;Lu50/c;Lw30/l$b;)Lt50/n;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f112584a = new Companion();

        private Companion() {
        }

        public final n a(r50.a requestExecutor, u50.c provideApiRequestOptions, w30.l.b apiRequestFactory) {
            p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
            p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
            p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
            return new o(requestExecutor, provideApiRequestOptions, apiRequestFactory);
        }
    }

    Object a(String str, Continuation<? super InstitutionResponse> continuation);

    Object b(String str, String str2, int i11, Continuation<? super InstitutionResponse> continuation);
}
