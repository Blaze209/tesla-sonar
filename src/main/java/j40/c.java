package j40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0011\u0015B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lj40/c;", "Lj40/k;", "Lw30/c;", "analyticsRequestExecutor", "Lw30/e;", "analyticsRequestFactory", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lw30/c;Lw30/e;Lkotlin/coroutines/CoroutineContext;)V", "Lj40/c$b;", "event", "Ljn0/h0;", "e", "(Lj40/c$b;)V", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "a", "(Lcom/stripe/android/financialconnections/a$b;)V", "Lcom/stripe/android/financialconnections/launcher/b;", "financialConnectionsSheetResult", "b", "(Lcom/stripe/android/financialconnections/a$b;Lcom/stripe/android/financialconnections/launcher/b;)V", "Lw30/c;", "Lw30/e;", "c", "Lkotlin/coroutines/CoroutineContext;", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f82578e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w30.e analyticsRequestFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: j40.c$b, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\n¨\u0006\u001e"}, d2 = {"Lj40/c$b;", "Lw30/a;", "Lj40/c$b$a;", "eventCode", "", "", "additionalParams", "<init>", "(Lj40/c$b$a;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj40/c$b$a;", "getEventCode", "()Lj40/c$b$a;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "getEventName", "eventName", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final /* data */ class Event implements w30.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a eventCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> additionalParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX INFO: renamed from: j40.c$b$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lj40/c$b$a;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode$financial_connections_release", "Companion", "a", "SheetPresented", "SheetClosed", "SheetFailed", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum a {
            SheetPresented("sheet.presented"),
            SheetClosed("sheet.closed"),
            SheetFailed("sheet.failed");

            private static final String PREFIX = "stripe_android.connections";
            private final String code;
            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private static final C1723a Companion = new C1723a(null);

            /* JADX INFO: renamed from: j40.c$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj40/c$b$a$a;", "", "<init>", "()V", "", "PREFIX", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            private static final class C1723a {
                public /* synthetic */ C1723a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C1723a() {
                }
            }

            a(String str) {
                this.code = str;
            }

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }

            /* JADX INFO: renamed from: getCode$financial_connections_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "stripe_android.connections." + this.code;
            }
        }

        public Event(a eventCode, Map<String, String> additionalParams) {
            s.k(eventCode, "eventCode");
            s.k(additionalParams, "additionalParams");
            this.eventCode = eventCode;
            this.additionalParams = additionalParams;
            this.eventName = eventCode.toString();
        }

        public final Map<String, String> a() {
            return this.additionalParams;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return this.eventCode == event.eventCode && s.f(this.additionalParams, event.additionalParams);
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }

        public int hashCode() {
            return (this.eventCode.hashCode() * 31) + this.additionalParams.hashCode();
        }

        public String toString() {
            return "Event(eventCode=" + this.eventCode + ", additionalParams=" + this.additionalParams + ")";
        }
    }

    /* JADX INFO: renamed from: j40.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter$fireEvent$1", f = "DefaultFinancialConnectionsEventReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1724c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f82585n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Event f82587p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1724c(Event event, Continuation<? super C1724c> continuation) {
            super(2, continuation);
            this.f82587p = event;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new C1724c(this.f82587p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f82585n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            w30.c cVar = c.this.analyticsRequestExecutor;
            w30.e eVar = c.this.analyticsRequestFactory;
            Event event = this.f82587p;
            cVar.a(eVar.g(event, event.a()));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1724c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(w30.c analyticsRequestExecutor, w30.e analyticsRequestFactory, CoroutineContext workContext) {
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(analyticsRequestFactory, "analyticsRequestFactory");
        s.k(workContext, "workContext");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
        this.workContext = workContext;
    }

    private final void e(Event event) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new C1724c(event, null), 3, null);
    }

    @Override // j40.k
    public void a(com.stripe.android.financialconnections.a.Configuration configuration) {
        s.k(configuration, "configuration");
        e(new Event(Event.a.SheetPresented, v0.f(x.a("las_client_secret", configuration.getFinancialConnectionsSessionClientSecret()))));
    }

    @Override // j40.k
    public void b(com.stripe.android.financialconnections.a.Configuration configuration, com.stripe.android.financialconnections.launcher.b financialConnectionsSheetResult) {
        Event event;
        s.k(configuration, "configuration");
        s.k(financialConnectionsSheetResult, "financialConnectionsSheetResult");
        if (financialConnectionsSheetResult instanceof com.stripe.android.financialconnections.launcher.b.Completed) {
            event = new Event(Event.a.SheetClosed, v0.m(x.a("las_client_secret", configuration.getFinancialConnectionsSessionClientSecret()), x.a("session_result", "completed")));
        } else if (financialConnectionsSheetResult instanceof com.stripe.android.financialconnections.launcher.b.a) {
            event = new Event(Event.a.SheetClosed, v0.m(x.a("las_client_secret", configuration.getFinancialConnectionsSessionClientSecret()), x.a("session_result", "cancelled")));
        } else {
            if (!(financialConnectionsSheetResult instanceof com.stripe.android.financialconnections.launcher.b.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            event = new Event(Event.a.SheetFailed, v0.r(v0.m(x.a("las_client_secret", configuration.getFinancialConnectionsSessionClientSecret()), x.a("session_result", "failure")), z50.a.a(a.a(((com.stripe.android.financialconnections.launcher.b.Failed) financialConnectionsSheetResult).getError(), null))));
        }
        e(event);
    }
}
