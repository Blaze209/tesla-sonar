package h30;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.AccountRange;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import f30.PaymentConfiguration;
import java.util.List;
import jn0.t;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u0006!"}, d2 = {"Lh30/j;", "Lh30/b$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lw30/c;", "analyticsRequestExecutor", "<init>", "(Landroid/content/Context;Lw30/c;)V", "(Landroid/content/Context;)V", "Lh30/e;", PlaceTypes.STORE, "Lh30/d;", "b", "(Lh30/e;)Lh30/d;", "", "publishableKey", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "event", "Ljn0/h0;", "c", "(Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsEvent;)V", "Lh30/b;", "create", "()Lh30/b;", "a", "Lw30/c;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "appContext", "Lkotlin/Lazy;", "Lh30/i;", "Lkotlin/Lazy;", "cardAccountRangeRepository", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j implements h30.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy<i> cardAccountRangeRepository;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh30/j$a;", "Lh30/d;", "<init>", "()V", "Lh30/f$b;", "cardNumber", "", "Lcom/stripe/android/model/a;", "c", "(Lh30/f$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/StateFlow;", "", "a", "Lkotlinx/coroutines/flow/StateFlow;", "b", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StateFlow<Boolean> loading = r90.g.n(Boolean.FALSE);

        @Override // h30.d
        public StateFlow<Boolean> b() {
            return this.loading;
        }

        @Override // h30.d
        public Object c(f.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh30/i;", "b", "()Lh30/i;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<i> {
        b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            m mVar = new m();
            return new i(new l(mVar), j.this.b(mVar), new o(null, 1, 0 == true ? 1 : 0), mVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f70625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f70625c = str;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f70625c;
        }
    }

    public j(Context context, w30.c analyticsRequestExecutor) {
        s.k(context, "context");
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.appContext = context.getApplicationContext();
        this.cardAccountRangeRepository = jn0.m.b(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d b(e store) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            PaymentConfiguration.Companion companion2 = PaymentConfiguration.INSTANCE;
            Context appContext = this.appContext;
            s.j(appContext, "appContext");
            objB = jn0.s.b(companion2.a(appContext).getPublishableKey());
        } catch (Throwable th2) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.h(objB)) {
            c((String) objB, PaymentAnalyticsEvent.CardMetadataPublishableKeyAvailable);
        }
        if (jn0.s.e(objB) != null) {
            c("pk_undefined", PaymentAnalyticsEvent.CardMetadataPublishableKeyUnavailable);
        }
        if (jn0.s.e(objB) != null) {
            return new a();
        }
        String str = (String) objB;
        Context appContext2 = this.appContext;
        s.j(appContext2, "appContext");
        com.stripe.android.networking.a aVar = new com.stripe.android.networking.a(appContext2, new c(str), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null);
        w30.l.Options options = new w30.l.Options(str, null, null, 6, null);
        w30.o oVar = new w30.o();
        Context appContext3 = this.appContext;
        s.j(appContext3, "appContext");
        return new n(aVar, options, store, oVar, new PaymentAnalyticsRequestFactory(appContext3, str, null, 4, null));
    }

    private final void c(String publishableKey, PaymentAnalyticsEvent event) {
        w30.c cVar = this.analyticsRequestExecutor;
        Context appContext = this.appContext;
        s.j(appContext, "appContext");
        cVar.a(PaymentAnalyticsRequestFactory.w(new PaymentAnalyticsRequestFactory(appContext, publishableKey, null, 4, null), event, null, null, null, null, null, 62, null));
    }

    @Override // h30.b.a
    public h30.b create() {
        return this.cardAccountRangeRepository.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        this(context, new w30.o());
        s.k(context, "context");
    }
}
