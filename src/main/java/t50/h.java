package t50;

import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.NetworkedAccountsList;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.ShareNetworkedAccountsResponse;
import java.util.List;
import java.util.Set;
import jn0.h0;
import n40.CachedPartnerAccount;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 %2\u00020\u0001:\u0001%J\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u0013\u0010\u0010J*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH¦@¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH¦@¢\u0006\u0004\b\"\u0010#J\u001e\u0010%\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH¦@¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lt50/h;", "", "", "Ln40/d;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/model/c0;", "partnerAccountsList", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clientSecret", "sessionId", "Lcom/stripe/android/financialconnections/model/d0;", "g", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSessionClientSecret", "Lcom/stripe/android/financialconnections/model/y;", "c", "Lm50/c;", "paymentAccount", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "f", "(Ljava/lang/String;Lm50/c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAccounts", "", "updateLocalCache", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "selectedAccountIds", "consentAcquired", "Lcom/stripe/android/financialconnections/model/i0;", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "linkedAccounts", "a", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f112511a;

    /* JADX INFO: renamed from: t50.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lt50/h$a;", "", "<init>", "()V", "Lr50/a;", "requestExecutor", "Lu50/c;", "provideApiRequestOptions", "Lw30/l$b;", "apiRequestFactory", "Lo30/d;", "logger", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lt50/h;", "a", "(Lr50/a;Lu50/c;Lw30/l$b;Lo30/d;Landroidx/lifecycle/s0;)Lt50/h;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f112511a = new Companion();

        private Companion() {
        }

        public final h a(r50.a requestExecutor, u50.c provideApiRequestOptions, w30.l.b apiRequestFactory, o30.d logger, s0 savedStateHandle) {
            p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
            p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
            p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
            p013kotlin.jvm.internal.s.k(logger, "logger");
            p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
            return new i(requestExecutor, provideApiRequestOptions, apiRequestFactory, logger, savedStateHandle);
        }
    }

    Object a(Set<String> set, Continuation<? super h0> continuation);

    Object b(String str, String str2, List<String> list, boolean z11, Continuation<? super PartnerAccountsList> continuation);

    Object c(String str, String str2, Continuation<? super NetworkedAccountsList> continuation);

    Object d(List<PartnerAccount> list, Continuation<? super h0> continuation);

    Object e(Continuation<? super List<CachedPartnerAccount>> continuation);

    Object f(String str, m50.c cVar, String str2, Continuation<? super LinkAccountSessionPaymentAccount> continuation);

    Object g(String str, String str2, Continuation<? super PartnerAccountsList> continuation);

    Object h(String str, String str2, Set<String> set, Boolean bool, Continuation<? super ShareNetworkedAccountsResponse> continuation);
}
