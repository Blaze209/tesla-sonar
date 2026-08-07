package u50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.stripe.android.model.ConsumerSessionLookup;
import java.util.Locale;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w30.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lu50/b;", "Lu50/a;", "Lr50/a;", "requestExecutor", "Lw30/l$c;", "apiOptions", "Lw30/l$b;", "apiRequestFactory", "<init>", "(Lr50/a;Lw30/l$c;Lw30/l$b;)V", "", Scopes.EMAIL, "clientSecret", "requestSurface", "Lcom/stripe/android/model/u;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lr50/a;", "c", "Lw30/l$c;", DateTokenConverter.CONVERTER_KEY, "Lw30/l$b;", "e", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class b implements u50.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f115424e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r50.a requestExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l.Options apiOptions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l.b apiRequestFactory;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu50/b$a;", "", "<init>", "()V", "", "consumerSessionsUrl", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(r50.a requestExecutor, l.Options apiOptions, l.b apiRequestFactory) {
        s.k(requestExecutor, "requestExecutor");
        s.k(apiOptions, "apiOptions");
        s.k(apiRequestFactory, "apiRequestFactory");
        this.requestExecutor = requestExecutor;
        this.apiOptions = apiOptions;
        this.apiRequestFactory = apiRequestFactory;
    }

    @Override // u50.a
    public Object a(String str, String str2, String str3, Continuation<? super ConsumerSessionLookup> continuation) {
        l.b bVar = this.apiRequestFactory;
        l.Options options = this.apiOptions;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return this.requestExecutor.d(l.b.d(bVar, "https://api.stripe.com/v1/connections/link_account_sessions/consumer_sessions", options, z50.a.a(v0.m(x.a("email_address", lowerCase), x.a("client_secret", str2), x.a("request_surface", str3))), false, 8, null), ConsumerSessionLookup.INSTANCE.serializer(), continuation);
    }
}
