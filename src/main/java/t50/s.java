package t50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import java.util.Map;
import m50.GetFinancialConnectionsAcccountsParams;
import m50.MixedOAuthParams;
import m50.PaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import r30.FraudDetectionData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001b\u0010\u0018J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#¨\u0006$"}, d2 = {"Lt50/s;", "Lt50/r;", "Lr50/a;", "requestExecutor", "Lu50/c;", "provideApiRequestOptions", "Lr30/g;", "fraudDetectionDataRepository", "Lw30/l$b;", "apiRequestFactory", "<init>", "(Lr50/a;Lu50/c;Lr30/g;Lw30/l$b;)V", "Lm50/a;", "getFinancialConnectionsAcccountsParams", "Lcom/stripe/android/financialconnections/model/p;", DateTokenConverter.CONVERTER_KEY, "(Lm50/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clientSecret", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminalError", "c", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionId", "Lm50/b;", "a", "paymentDetailsId", "consumerSessionClientSecret", "Lm50/d;", "e", "Lr50/a;", "Lu50/c;", "Lr30/g;", "Lw30/l$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s implements r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f112655f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r50.a requestExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u50.c provideApiRequestOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r30.g fraudDetectionDataRepository;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w30.l.b apiRequestFactory;

    public s(r50.a requestExecutor, u50.c provideApiRequestOptions, r30.g fraudDetectionDataRepository, w30.l.b apiRequestFactory) {
        p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
        p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
        p013kotlin.jvm.internal.s.k(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
        this.requestExecutor = requestExecutor;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.fraudDetectionDataRepository = fraudDetectionDataRepository;
        this.apiRequestFactory = apiRequestFactory;
    }

    @Override // t50.r
    public Object a(String str, String str2, Continuation<? super MixedOAuthParams> continuation) {
        return this.requestExecutor.d(w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/oauth_results", this.provideApiRequestOptions.a(true), v0.m(jn0.x.a("id", str2), jn0.x.a("client_secret", str)), false, 8, null), MixedOAuthParams.INSTANCE.serializer(), continuation);
    }

    @Override // t50.r
    public Object b(String str, Continuation<? super FinancialConnectionsSession> continuation) {
        return this.requestExecutor.d(w30.l.b.b(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/session_receipt", this.provideApiRequestOptions.a(false), v0.f(jn0.x.a("client_secret", str)), false, 8, null), FinancialConnectionsSession.INSTANCE.serializer(), continuation);
    }

    @Override // t50.r
    public Object c(String str, String str2, Continuation<? super FinancialConnectionsSession> continuation) {
        return this.requestExecutor.d(w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/complete", this.provideApiRequestOptions.a(true), z50.a.a(v0.m(jn0.x.a("client_secret", str), jn0.x.a("terminal_error", str2))), false, 8, null), FinancialConnectionsSession.INSTANCE.serializer(), continuation);
    }

    @Override // t50.r
    public Object d(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, Continuation<? super FinancialConnectionsAccountList> continuation) {
        return this.requestExecutor.d(w30.l.b.b(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/list_accounts", this.provideApiRequestOptions.a(false), getFinancialConnectionsAcccountsParams.c3(), false, 8, null), FinancialConnectionsAccountList.INSTANCE.serializer(), continuation);
    }

    @Override // t50.r
    public Object e(String str, String str2, Continuation<? super PaymentMethod> continuation) {
        Map mapM = v0.m(jn0.x.a("type", "link"), jn0.x.a("link", v0.m(jn0.x.a("credentials", v0.f(jn0.x.a("consumer_session_client_secret", str2))), jn0.x.a("payment_details_id", str))));
        FraudDetectionData fraudDetectionDataA = this.fraudDetectionDataRepository.a();
        Map<String, String> mapC = fraudDetectionDataA != null ? fraudDetectionDataA.c() : null;
        if (mapC == null) {
            mapC = v0.i();
        }
        return this.requestExecutor.d(w30.l.b.d(this.apiRequestFactory, "https://api.stripe.com/v1/payment_methods", this.provideApiRequestOptions.a(false), v0.r(mapM, mapC), false, 8, null), PaymentMethod.INSTANCE.serializer(), continuation);
    }
}
