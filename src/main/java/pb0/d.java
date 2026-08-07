package pb0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cm0.f;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.tesla.logging.g;
import com.tesla.oapi.CommandActionExtensionsKt;
import com.tesla.oapi.HttpMethodType;
import com.tesla.oapi.OwnerApiEndpoint;
import com.tesla.oapi.OwnerApiEndpoints;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import ic0.e;
import java.util.Map;
import jn0.h0;
import jn0.x;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JU\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JK\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lpb0/d;", "Lpb0/c;", "Lcom/tesla/oapi/OwnerApiEndpoints;", "endpoints", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "<init>", "(Lcom/tesla/oapi/OwnerApiEndpoints;Lcom/tesla/oapi/SendOwnerRequest;)V", "", "vin", "Lle0/b;", AnalyticsAttribute.Reason, "Lic0/e;", "command", "Lkotlin/Function0;", "Ljn0/h0;", "onSuccess", "Lkotlin/Function1;", "", "onFailure", "retryCount", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lle0/b;Lic0/e;Lwn0/a;Lwn0/l;I)V", "a", "(Ljava/lang/String;Lle0/b;Lic0/e;Lwn0/a;Lwn0/l;)V", "Lcom/tesla/oapi/OwnerApiEndpoints;", "b", "Lcom/tesla/oapi/SendOwnerRequest;", "Lcom/tesla/logging/g;", "c", "Lcom/tesla/logging/g;", "logger", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements pb0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OwnerApiEndpoints endpoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SendOwnerRequest sendOwnerRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g logger;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f102085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f102086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f102087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f102088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ le0.b f102089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f102090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l<Integer, h0> f102091g;

        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.a<h0> aVar, int i11, d dVar, String str, le0.b bVar, e eVar, l<? super Integer, h0> lVar) {
            this.f102085a = aVar;
            this.f102086b = i11;
            this.f102087c = dVar;
            this.f102088d = str;
            this.f102089e = bVar;
            this.f102090f = eVar;
            this.f102091g = lVar;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(OwnerResponse result) throws JSONException {
            s.k(result, "result");
            if (result.isSuccessful()) {
                this.f102085a.invoke();
            } else {
                d.f(this.f102086b, this.f102087c, this.f102088d, this.f102089e, this.f102090f, this.f102085a, this.f102091g, result.getStatusCode().getCode());
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T> implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f102093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f102094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ le0.b f102095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f102096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f102097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l<Integer, h0> f102098g;

        /* JADX WARN: Multi-variable type inference failed */
        c(int i11, String str, le0.b bVar, e eVar, wn0.a<h0> aVar, l<? super Integer, h0> lVar) {
            this.f102093b = i11;
            this.f102094c = str;
            this.f102095d = bVar;
            this.f102096e = eVar;
            this.f102097f = aVar;
            this.f102098g = lVar;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) throws JSONException {
            s.k(it, "it");
            d.this.logger.d("wake vehicle failure", it);
            d.g(this.f102093b, d.this, this.f102094c, this.f102095d, this.f102096e, this.f102097f, this.f102098g, 0, 128, null);
        }
    }

    public d(OwnerApiEndpoints endpoints, SendOwnerRequest sendOwnerRequest) {
        s.k(endpoints, "endpoints");
        s.k(sendOwnerRequest, "sendOwnerRequest");
        this.endpoints = endpoints;
        this.sendOwnerRequest = sendOwnerRequest;
        this.logger = g.INSTANCE.a("WakeVehicle");
    }

    private final void d(String vin, le0.b reason, e command, wn0.a<h0> onSuccess, l<? super Integer, h0> onFailure, int retryCount) throws JSONException {
        String analyticsName;
        OwnerApiEndpoint endpoint = this.endpoints.getEndpoint("WAKE_UP");
        if (endpoint == null) {
            return;
        }
        HttpMethodType method = endpoint.getMethod();
        String uri = endpoint.getUri();
        boolean isAuthenticated = endpoint.getIsAuthenticated();
        this.logger.j("waking " + vin + " with reason `" + reason.getValue() + "`");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsAttribute.Reason, reason.getValue());
        if (command != null) {
            ic0.c action = command.getAction();
            if (action == null || (analyticsName = CommandActionExtensionsKt.getAnalyticsName(action)) == null) {
                analyticsName = "MISSING_PAYLOAD";
            }
            jSONObject.put("command", analyticsName);
            jSONObject.put("command_source", lb0.a.a(command.getSource()));
        }
        SendOwnerRequest.DefaultImpls.execute$default(this.sendOwnerRequest, method, uri, v0.f(x.a("vin", vin)), jSONObject, (Map) null, (Map) null, (Integer) 10, isAuthenticated, false, EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, (Object) null).t(new b(onSuccess, retryCount, this, vin, reason, command, onFailure), new c(retryCount, vin, reason, command, onSuccess, onFailure));
    }

    static /* synthetic */ void e(d dVar, String str, le0.b bVar, e eVar, wn0.a aVar, l lVar, int i11, int i12, Object obj) throws JSONException {
        if ((i12 & 32) != 0) {
            i11 = 0;
        }
        dVar.d(str, bVar, eVar, aVar, lVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(int i11, d dVar, String str, le0.b bVar, e eVar, wn0.a<h0> aVar, l<? super Integer, h0> lVar, int i12) throws JSONException {
        if (i11 >= 3) {
            lVar.invoke(Integer.valueOf(i12));
            return;
        }
        dVar.logger.j("retrying wake for " + str + " status code was " + i12);
        dVar.d(str, bVar, eVar, aVar, lVar, i11 + 1);
    }

    static /* synthetic */ void g(int i11, d dVar, String str, le0.b bVar, e eVar, wn0.a aVar, l lVar, int i12, int i13, Object obj) throws JSONException {
        f(i11, dVar, str, bVar, eVar, aVar, lVar, (i13 & 128) != 0 ? -1 : i12);
    }

    @Override // pb0.c
    public void a(String vin, le0.b reason, e command, wn0.a<h0> onSuccess, l<? super Integer, h0> onFailure) throws JSONException {
        s.k(vin, "vin");
        s.k(reason, "reason");
        s.k(onSuccess, "onSuccess");
        s.k(onFailure, "onFailure");
        e(this, vin, reason, command, onSuccess, onFailure, 0, 32, null);
    }
}
