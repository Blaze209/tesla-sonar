package t50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lt50/o;", "Lt50/n;", "Lr50/a;", "requestExecutor", "Lu50/c;", "provideApiRequestOptions", "Lw30/l$b;", "apiRequestFactory", "<init>", "(Lr50/a;Lu50/c;Lw30/l$b;)V", "", "clientSecret", "Lcom/stripe/android/financialconnections/model/s;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", SearchIntents.EXTRA_QUERY, "", "limit", "b", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr50/a;", "c", "Lu50/c;", DateTokenConverter.CONVERTER_KEY, "Lw30/l$b;", "e", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class o implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r50.a requestExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u50.c provideApiRequestOptions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w30.l.b apiRequestFactory;

    public o(r50.a requestExecutor, u50.c provideApiRequestOptions, w30.l.b apiRequestFactory) {
        p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
        p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
        p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
        this.requestExecutor = requestExecutor;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.apiRequestFactory = apiRequestFactory;
    }

    @Override // t50.n
    public Object a(String str, Continuation<? super InstitutionResponse> continuation) {
        return this.requestExecutor.d(w30.l.b.b(this.apiRequestFactory, "https://api.stripe.com/v1/connections/featured_institutions", this.provideApiRequestOptions.a(true), v0.f(jn0.x.a("client_secret", str)), false, 8, null), InstitutionResponse.INSTANCE.serializer(), continuation);
    }

    @Override // t50.n
    public Object b(String str, String str2, int i11, Continuation<? super InstitutionResponse> continuation) {
        return this.requestExecutor.d(w30.l.b.b(this.apiRequestFactory, "https://api.stripe.com/v1/connections/institutions", this.provideApiRequestOptions.a(true), v0.m(jn0.x.a("client_secret", str), jn0.x.a(SearchIntents.EXTRA_QUERY, str2), jn0.x.a("limit", Boxing.boxInt(i11))), false, 8, null), InstitutionResponse.INSTANCE.serializer(), continuation);
    }
}
