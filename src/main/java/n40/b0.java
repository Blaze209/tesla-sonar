package n40;

import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln40/b0;", "", "Lt50/p;", "repository", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "", "applicationId", "<init>", "(Lt50/p;Lcom/stripe/android/financialconnections/a$b;Ljava/lang/String;)V", "Ln40/b0$a;", "refetchCondition", "Lcom/stripe/android/financialconnections/model/k0;", "a", "(Ln40/b0$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/p;", "getRepository", "()Lt50/p;", "b", "Lcom/stripe/android/financialconnections/a$b;", "getConfiguration", "()Lcom/stripe/android/financialconnections/a$b;", "c", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.p repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String applicationId;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0005\u0007\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Ln40/b0$a;", "", "Lcom/stripe/android/financialconnections/model/k0;", "response", "", "a", "(Lcom/stripe/android/financialconnections/model/k0;)Z", "b", "c", "Ln40/b0$a$a;", "Ln40/b0$a$b;", "Ln40/b0$a$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: n40.b0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ln40/b0$a$a;", "Ln40/b0$a;", "<init>", "()V", "Lcom/stripe/android/financialconnections/model/k0;", "response", "", "a", "(Lcom/stripe/android/financialconnections/model/k0;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class C1985a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1985a f93053a = new C1985a();

            private C1985a() {
            }

            @Override // n40.b0.a
            public boolean a(SynchronizeSessionResponse response) {
                p013kotlin.jvm.internal.s.k(response, "response");
                return true;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1985a);
            }

            public int hashCode() {
                return 1484658098;
            }

            public String toString() {
                return "Always";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ln40/b0$a$b;", "Ln40/b0$a;", "<init>", "()V", "Lcom/stripe/android/financialconnections/model/k0;", "response", "", "a", "(Lcom/stripe/android/financialconnections/model/k0;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f93054a = new b();

            private b() {
            }

            @Override // n40.b0.a
            public boolean a(SynchronizeSessionResponse response) {
                p013kotlin.jvm.internal.s.k(response, "response");
                return response.getManifest().getActiveAuthSession() == null;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1982328450;
            }

            public String toString() {
                return "IfMissingActiveAuthSession";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ln40/b0$a$c;", "Ln40/b0$a;", "<init>", "()V", "Lcom/stripe/android/financialconnections/model/k0;", "response", "", "a", "(Lcom/stripe/android/financialconnections/model/k0;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f93055a = new c();

            private c() {
            }

            @Override // n40.b0.a
            public boolean a(SynchronizeSessionResponse response) {
                p013kotlin.jvm.internal.s.k(response, "response");
                return false;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1660633189;
            }

            public String toString() {
                return "None";
            }
        }

        boolean a(SynchronizeSessionResponse response);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<SynchronizeSessionResponse, Boolean> {
        b(Object obj) {
            super(1, obj, a.class, "shouldReFetch", "shouldReFetch(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Z", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SynchronizeSessionResponse p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return Boolean.valueOf(((a) this.receiver).a(p11));
        }
    }

    public b0(t50.p repository, com.stripe.android.financialconnections.a.Configuration configuration, String applicationId) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        p013kotlin.jvm.internal.s.k(applicationId, "applicationId");
        this.repository = repository;
        this.configuration = configuration;
        this.applicationId = applicationId;
    }

    public static /* synthetic */ Object b(b0 b0Var, a aVar, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = a.c.f93055a;
        }
        return b0Var.a(aVar, continuation);
    }

    public final Object a(a aVar, Continuation<? super SynchronizeSessionResponse> continuation) {
        return this.repository.g(this.configuration.getFinancialConnectionsSessionClientSecret(), this.applicationId, new b(aVar), continuation);
    }
}
