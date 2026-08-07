package t50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ4\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001e\u0010\rJ \u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H¦@¢\u0006\u0004\b!\u0010 JZ\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010\u00022\b\u0010&\u001a\u0004\u0018\u00010\u00022\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'H¦@¢\u0006\u0004\b)\u0010*J,\u0010-\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b-\u0010\u001dJ\u0018\u0010.\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b.\u0010\rJ\u0018\u0010/\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b/\u0010\rJ#\u00102\u001a\u0002012\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0005H&¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lt50/p;", "", "", "clientSecret", "applicationId", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/model/k0;", "", "reFetchCondition", "g", "(Ljava/lang/String;Ljava/lang/String;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "h", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/model/q;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "f", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/Date;", "clientTimestamp", "sessionId", "", "Lj40/b;", "authSessionEvents", "j", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "publicToken", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "m", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", Scopes.EMAIL, PlaceTypes.COUNTRY, "locale", "phoneNumber", "consumerSessionClientSecret", "", "selectedAccounts", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disabledReason", "clientSuggestedNextPaneOnDisableNetworking", "b", "e", "k", "block", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lwn0/l;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f112590a;

    /* JADX INFO: renamed from: t50.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lt50/p$a;", "", "<init>", "()V", "Lr50/a;", "requestExecutor", "Lw30/l$b;", "apiRequestFactory", "Lu50/c;", "provideApiRequestOptions", "Lo30/d;", "logger", "Ljava/util/Locale;", "locale", "Lcom/stripe/android/financialconnections/model/k0;", "initialSync", "Lt50/p;", "a", "(Lr50/a;Lw30/l$b;Lu50/c;Lo30/d;Ljava/util/Locale;Lcom/stripe/android/financialconnections/model/k0;)Lt50/p;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f112590a = new Companion();

        private Companion() {
        }

        public final p a(r50.a requestExecutor, w30.l.b apiRequestFactory, u50.c provideApiRequestOptions, o30.d logger, Locale locale, SynchronizeSessionResponse initialSync) {
            p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
            p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
            p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
            p013kotlin.jvm.internal.s.k(logger, "logger");
            p013kotlin.jvm.internal.s.k(locale, "locale");
            return new q(requestExecutor, apiRequestFactory, provideApiRequestOptions, locale, logger, initialSync);
        }
    }

    Object a(String str, String str2, String str3, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);

    Object b(String str, String str2, String str3, Continuation<? super FinancialConnectionsSessionManifest> continuation);

    Object c(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);

    Object d(String str, String str2, String str3, String str4, String str5, String str6, Set<String> set, Continuation<? super FinancialConnectionsSessionManifest> continuation);

    Object e(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation);

    Object f(String str, String str2, FinancialConnectionsInstitution qVar, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);

    Object g(String str, String str2, wn0.l<? super SynchronizeSessionResponse, Boolean> lVar, Continuation<? super SynchronizeSessionResponse> continuation);

    Object h(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation);

    void i(wn0.l<? super FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> block);

    Object j(String str, Date date, String str2, List<? extends j40.b> list, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);

    Object k(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation);

    Object l(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation);

    Object m(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);
}
