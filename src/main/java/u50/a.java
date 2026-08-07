package u50;

import com.google.android.gms.common.Scopes;
import com.stripe.android.model.ConsumerSessionLookup;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import w30.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu50/a;", "", "", Scopes.EMAIL, "clientSecret", "requestSurface", "Lcom/stripe/android/model/u;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f115423a;

    /* JADX INFO: renamed from: u50.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lu50/a$a;", "", "<init>", "()V", "Lr50/a;", "requestExecutor", "Lw30/l$c;", "apiOptions", "Lw30/l$b;", "apiRequestFactory", "Lu50/a;", "a", "(Lr50/a;Lw30/l$c;Lw30/l$b;)Lu50/a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f115423a = new Companion();

        private Companion() {
        }

        public final a a(r50.a requestExecutor, l.Options apiOptions, l.b apiRequestFactory) {
            s.k(requestExecutor, "requestExecutor");
            s.k(apiOptions, "apiOptions");
            s.k(apiRequestFactory, "apiRequestFactory");
            return new b(requestExecutor, apiOptions, apiRequestFactory);
        }
    }

    Object a(String str, String str2, String str3, Continuation<? super ConsumerSessionLookup> continuation);
}
