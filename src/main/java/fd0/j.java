package fd0;

import android.content.Context;
import ce0.TeslaCommandRequest;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.tesla.messagebuilder.util.RemoteBuildingRequestBody;
import com.tesla.messagebuilder.util.RemoteBuildingResponse;
import com.tesla.messagebuilder.util.Response;
import com.tesla.oapi.HttpMethodType;
import com.tesla.oapi.OwnerApiEndpoint;
import com.tesla.oapi.OwnerApiEndpoints;
import com.tesla.oapi.OwnerApiStatusCode;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import com.tesla.sessionmanager.VehicleSessionInfo;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.y;
import java.util.Map;
import java.util.concurrent.Callable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u000f\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfd0/j;", "Lfd0/k;", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "Lcom/tesla/oapi/OwnerApiEndpoints;", "endpoints", "<init>", "(Lcom/tesla/oapi/SendOwnerRequest;Lcom/tesla/oapi/OwnerApiEndpoints;)V", "Lfd0/h;", "params", "Lio/reactivex/rxjava3/core/u;", "Lsc0/h;", "a", "(Lfd0/h;)Lio/reactivex/rxjava3/core/u;", "Lcom/tesla/oapi/SendOwnerRequest;", "b", "Lcom/tesla/oapi/OwnerApiEndpoints;", "c", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SendOwnerRequest sendOwnerRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final OwnerApiEndpoints endpoints;

    /* JADX INFO: renamed from: fd0.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfd0/j$a;", "", "<init>", "()V", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "Lcom/tesla/oapi/OwnerApiEndpoints;", "endpoints", "Lfd0/j;", "b", "(Lcom/tesla/oapi/SendOwnerRequest;Lcom/tesla/oapi/OwnerApiEndpoints;)Lfd0/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "a", "(Landroid/content/Context;)Lfd0/j;", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(Context context) {
            s.k(context, "context");
            return b(SendOwnerRequest.INSTANCE.newInstance(context), OwnerApiEndpoints.INSTANCE.getInstance(context));
        }

        public final j b(SendOwnerRequest sendOwnerRequest, OwnerApiEndpoints endpoints) {
            s.k(sendOwnerRequest, "sendOwnerRequest");
            s.k(endpoints, "endpoints");
            return new j(sendOwnerRequest, endpoints, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fd0.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\u0011R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lfd0/j$b;", "", "Lcom/tesla/oapi/HttpMethodType;", "method", "", ImagesContract.URL, "", "urlParams", "queryParams", "data", "<init>", "(Lcom/tesla/oapi/HttpMethodType;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "a", "()Lcom/tesla/oapi/HttpMethodType;", "b", "()Ljava/lang/String;", "c", "()Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "e", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/tesla/oapi/HttpMethodType;", "getMethod", "Ljava/lang/String;", "getUrl", "Ljava/util/Map;", "getUrlParams", "getQueryParams", "setQueryParams", "(Ljava/util/Map;)V", "getData", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class RequestParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final HttpMethodType method;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Object> urlParams;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private Map<String, ? extends Object> queryParams;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        public RequestParams(HttpMethodType method, String url, Map<String, ? extends Object> urlParams, Map<String, ? extends Object> queryParams, String data) {
            s.k(method, "method");
            s.k(url, "url");
            s.k(urlParams, "urlParams");
            s.k(queryParams, "queryParams");
            s.k(data, "data");
            this.method = method;
            this.url = url;
            this.urlParams = urlParams;
            this.queryParams = queryParams;
            this.data = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final HttpMethodType getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Map<String, Object> c() {
            return this.urlParams;
        }

        public final Map<String, Object> d() {
            return this.queryParams;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestParams)) {
                return false;
            }
            RequestParams requestParams = (RequestParams) other;
            return this.method == requestParams.method && s.f(this.url, requestParams.url) && s.f(this.urlParams, requestParams.urlParams) && s.f(this.queryParams, requestParams.queryParams) && s.f(this.data, requestParams.data);
        }

        public int hashCode() {
            return (((((((this.method.hashCode() * 31) + this.url.hashCode()) * 31) + this.urlParams.hashCode()) * 31) + this.queryParams.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "RequestParams(method=" + this.method + ", url=" + this.url + ", urlParams=" + this.urlParams + ", queryParams=" + this.queryParams + ", data=" + this.data + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T, R> implements cm0.h {
        c() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y<? extends OwnerResponse> apply(RequestParams requestParams) {
            HttpMethodType method = requestParams.getMethod();
            String url = requestParams.getUrl();
            Map<String, Object> mapC = requestParams.c();
            Map<String, Object> mapD = requestParams.d();
            return SendOwnerRequest.DefaultImpls.execute$default(j.this.sendOwnerRequest, method, url, (Map) mapC, requestParams.getData(), (Map) mapD, (Map) null, (Integer) null, false, false, 480, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TeslaCommandRequest f65726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProtoRequestBuildParams f65727b;

        d(TeslaCommandRequest teslaCommandRequest, ProtoRequestBuildParams protoRequestBuildParams) {
            this.f65726a = teslaCommandRequest;
            this.f65727b = protoRequestBuildParams;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sc0.h apply(OwnerResponse result) throws SignedCommandsException {
            s.k(result, "result");
            OwnerApiStatusCode statusCode = result.getStatusCode();
            if (statusCode.isLocalError()) {
                throw new SignedCommandsException(null, null, null, statusCode != OwnerApiStatusCode.SOCKET_EXCEPTION ? ic0.h.RESULT_NO_NETWORK : ic0.h.RESULT_SOCKET_EXCEPTION, null, null, 55, null);
            }
            RemoteBuildingResponse remoteBuildingResponseFromJson = hd0.e.f72561a.f().fromJson(String.valueOf(result.getResponse()));
            Response response = remoteBuildingResponseFromJson != null ? remoteBuildingResponseFromJson.getResponse() : null;
            this.f65726a.c("received result status code: " + statusCode);
            if (statusCode.isSuccess()) {
                if ((response != null ? response.getEncodedRoutableMessage() : null) != null) {
                    sc0.h hVarDecode = sc0.h.f111089m.decode(ie0.n.a(response.getEncodedRoutableMessage()));
                    this.f65726a.c("received result message: " + hVarDecode);
                    VehicleSessionInfo vehicleSessionInfo = this.f65727b.getVehicleSessionInfo();
                    if (vehicleSessionInfo != null) {
                        vehicleSessionInfo.incrementCounter();
                    }
                    okio.k kVar = null;
                    return sc0.h.b(hVarDecode, new sc0.a(this.f65726a.s(), kVar, null, 6, null), new sc0.a(null, this.f65726a.H(), kVar, 5, null), null, null, okio.k.Companion.i(okio.k.INSTANCE, new byte[1], 0, 0, 3, null), 0, null, null, null, null, null, null, 4076, null);
                }
            }
            this.f65726a.c("throwing SignedCommandsException");
            throw new SignedCommandsException(null, statusCode, result.getResponse(), ic0.h.RESULT_SERVER_ERROR, null, null, 49, null);
        }
    }

    public /* synthetic */ j(SendOwnerRequest sendOwnerRequest, OwnerApiEndpoints ownerApiEndpoints, DefaultConstructorMarker defaultConstructorMarker) {
        this(sendOwnerRequest, ownerApiEndpoints);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestParams d(j jVar, String str, TeslaCommandRequest teslaCommandRequest, ProtoRequestBuildParams protoRequestBuildParams) {
        OwnerApiEndpoint endpoint = jVar.endpoints.getEndpoint(str);
        if (endpoint == null) {
            throw new IllegalStateException(str + " not found in endpoints");
        }
        HttpMethodType method = endpoint.getMethod();
        String uri = endpoint.getUri();
        String json = hd0.e.f72561a.e().toJson(new RemoteBuildingRequestBody(hd0.a.a(teslaCommandRequest.getRequest()), protoRequestBuildParams.getVehicleSessionInfo(), hd0.a.e(teslaCommandRequest.getRequest()), hd0.a.f(teslaCommandRequest.getRequest())));
        Map<String, String> mapD = hd0.a.d(teslaCommandRequest);
        Map<String, String> mapC = hd0.a.c(teslaCommandRequest);
        s.h(json);
        return new RequestParams(method, uri, mapD, mapC, json);
    }

    public static final j e(Context context) {
        return INSTANCE.a(context);
    }

    @Override // fd0.k
    public u<sc0.h> a(final ProtoRequestBuildParams params) {
        s.k(params, "params");
        final TeslaCommandRequest request = params.getRequest();
        final String strB = hd0.a.b(request.getRequest());
        if (strB != null) {
            request.c("start_build_remotely");
            u<sc0.h> uVarN = u.k(new Callable() { // from class: fd0.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.d(this.f65713a, strB, request, params);
                }
            }).j(new c()).n(new d(request, params));
            s.j(uVarN, "map(...)");
            return uVarN;
        }
        throw new IllegalStateException(request.o() + " does not have remote endpoint");
    }

    private j(SendOwnerRequest sendOwnerRequest, OwnerApiEndpoints ownerApiEndpoints) {
        this.sendOwnerRequest = sendOwnerRequest;
        this.endpoints = ownerApiEndpoints;
    }
}
