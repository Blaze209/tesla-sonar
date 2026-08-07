package ce0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ic0.q;
import java.util.Collection;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u0000 \u001b2\u00020\u0001:\u0002/\u001bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010 J!\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010\u0006J-\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040(2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lce0/h;", "", "", "commandId", "Lce0/j;", "g", "(Ljava/lang/String;)Lce0/j;", "requestId", DateTokenConverter.CONVERTER_KEY, "Lkc0/c;", "commandMessage", "Lcom/tesla/logging/g;", "logger", "Lce0/h$b;", "e", "(Lkc0/c;Lcom/tesla/logging/g;)Lce0/h$b;", "Lsc0/h;", "routable", "l", "(Lsc0/h;Lcom/tesla/logging/g;)Lce0/h$b;", "", "j", "(Ljava/lang/String;)Z", "Lsc0/b;", "domain", "", "Lce0/a;", "a", "(Lsc0/b;)Ljava/util/List;", "request", "Ljn0/h0;", "n", "(Lce0/j;)V", "m", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)Lce0/j;", "k", "vin", "", "sourcePublicKey", "", "c", "(Lsc0/b;Ljava/lang/String;[B)Ljava/util/Collection;", "", "counter", "f", "(Lce0/j;J)V", "b", "(Ljava/lang/String;J)Lce0/h$b;", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f19110a;

    /* JADX INFO: renamed from: ce0.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lce0/h$a;", "", "<init>", "()V", "Lee0/a;", "sessionInfoManager", "Lic0/q;", "transport", "Lce0/h;", "a", "(Lee0/a;Lic0/q;)Lce0/h;", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f19110a = new Companion();

        private Companion() {
        }

        public final h a(ee0.a sessionInfoManager, q transport) {
            s.k(sessionInfoManager, "sessionInfoManager");
            s.k(transport, "transport");
            return new l(sessionInfoManager, transport);
        }
    }

    /* JADX INFO: renamed from: ce0.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\tJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lce0/h$b;", "", "", "requestId", "Lce0/j;", "request", "<init>", "(Ljava/lang/String;Lce0/j;)V", "a", "()Ljava/lang/String;", "b", "()Lce0/j;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "Lce0/j;", "c", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Request {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TeslaCommandRequest request;

        public Request(String str, TeslaCommandRequest teslaCommandRequest) {
            this.requestId = str;
            this.request = teslaCommandRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TeslaCommandRequest getRequest() {
            return this.request;
        }

        public final TeslaCommandRequest c() {
            return this.request;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return s.f(this.requestId, request.requestId) && s.f(this.request, request.request);
        }

        public int hashCode() {
            String str = this.requestId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            TeslaCommandRequest teslaCommandRequest = this.request;
            return iHashCode + (teslaCommandRequest != null ? teslaCommandRequest.hashCode() : 0);
        }

        public String toString() {
            return "Request(requestId=" + this.requestId + ", request=" + this.request + ")";
        }
    }

    static h h(ee0.a aVar, q qVar) {
        return INSTANCE.a(aVar, qVar);
    }

    List<a> a(sc0.b domain);

    Request b(String vin, long counter);

    Collection<TeslaCommandRequest> c(sc0.b domain, String vin, byte[] sourcePublicKey);

    TeslaCommandRequest d(String requestId);

    Request e(kc0.c commandMessage, com.tesla.logging.g logger);

    void f(TeslaCommandRequest request, long counter);

    TeslaCommandRequest g(String commandId);

    TeslaCommandRequest i(String requestId, String commandId);

    boolean j(String requestId);

    TeslaCommandRequest k(String commandId);

    Request l(sc0.h routable, com.tesla.logging.g logger);

    void m(TeslaCommandRequest request);

    void n(TeslaCommandRequest request);
}
