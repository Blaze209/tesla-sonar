package fe0;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.tesla.logging.TeslaLog;
import com.tesla.oapi.HttpMethodType;
import com.tesla.oapi.OwnerAPIError;
import com.tesla.oapi.OwnerAPIRequestCallback;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import com.tesla.oapi.auth.TeslaNetworkClient;
import fc0.u5;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jn0.m;
import jn0.x;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\r¨\u0006)"}, d2 = {"Lfe0/k;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "h", "()Z", "g", IntegerTokenConverter.CONVERTER_KEY, "", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Ljn0/h0;", "j", "()V", "Lorg/json/JSONObject;", "data", "Lcom/tesla/oapi/OwnerAPIRequestCallback;", "callback", "", "timeoutSeconds", "k", "(Lorg/json/JSONObject;Lcom/tesla/oapi/OwnerAPIRequestCallback;J)Z", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", "appContext", "Lhe0/b;", "b", "Lkotlin/Lazy;", "c", "()Lhe0/b;", "client", "Lhe0/a;", "e", "()Lhe0/a;", "vehicleData", "f", "vehicleId", "share_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy client;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ OwnerAPIRequestCallback f65804a;

        b(OwnerAPIRequestCallback ownerAPIRequestCallback) {
            this.f65804a = ownerAPIRequestCallback;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(OwnerResponse result) {
            s.k(result, "result");
            if (result.isSuccessful()) {
                this.f65804a.onCompletion(result.getResponse());
            } else {
                this.f65804a.onFailure(result.getError());
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ OwnerAPIRequestCallback f65805a;

        c(OwnerAPIRequestCallback ownerAPIRequestCallback) {
            this.f65805a = ownerAPIRequestCallback;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            s.k(it, "it");
            if (it instanceof TimeoutException) {
                this.f65805a.onTimeout();
                return;
            }
            TeslaLog.INSTANCE.e("[ANDROID SHARE]", "Error sending destination", it);
            h.f65798a.a("Exception throw sending destination " + it.getMessage());
            this.f65805a.onFailure(OwnerAPIError.OWNERAPI_ERROR_UNKNOWN_ERROR);
        }
    }

    public k(Context context) {
        s.k(context, "context");
        this.appContext = context.getApplicationContext();
        this.client = m.b(new wn0.a() { // from class: fe0.j
            @Override // wn0.a
            public final Object invoke() {
                return k.b(this.f65800a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he0.b b(k kVar) {
        return he0.b.m(kVar.appContext);
    }

    private final he0.b c() {
        Object value = this.client.getValue();
        s.j(value, "getValue(...)");
        return (he0.b) value;
    }

    private final he0.a e() {
        JSONObject jSONObjectO = c().o();
        if (jSONObjectO != null) {
            return new he0.a(jSONObjectO);
        }
        return null;
    }

    private final String f() {
        he0.a aVarE = e();
        if (aVarE != null) {
            return aVarE.c();
        }
        return null;
    }

    public final String d() {
        he0.a aVarE = e();
        if (aVarE == null) {
            return null;
        }
        String strB = aVarE.b();
        String strD = aVarE.d();
        if (strB != null && !t.y0(strB) && (strD == null || !s.f(strB, t.U1(strD, 6)))) {
            return strB;
        }
        ke0.b bVar = ke0.b.f85979a;
        JSONObject jSONObjectA = aVarE.a();
        s.j(jSONObjectA, "getData(...)");
        u5 u5VarE = bVar.e(jSONObjectA, ke0.i.LOCAL_NON_REDUX_VEHICLE);
        if (strD == null) {
            strD = "";
        }
        return wb0.e.k(new xc0.a(null, null, false, null, u5VarE, null, null, false, strD, null, null, null, 3823, null));
    }

    public final boolean g() {
        return c().a();
    }

    public final boolean h() {
        return c().q() != null;
    }

    public final boolean i() {
        JSONObject jSONObjectO = c().o();
        return (jSONObjectO == null || !s.f("VEHICLE", jSONObjectO.optString("type")) || e() == null) ? false : true;
    }

    public final void j() {
        try {
            he0.a aVarE = e();
            if (aVarE != null) {
                aVarE.e();
            }
        } catch (JSONException unused) {
        }
    }

    @SuppressLint({"CheckResult"})
    public final boolean k(JSONObject data, OwnerAPIRequestCallback callback, long timeoutSeconds) {
        s.k(data, "data");
        s.k(callback, "callback");
        String strF = f();
        if (strF == null) {
            return false;
        }
        SendOwnerRequest.Companion companion = SendOwnerRequest.INSTANCE;
        Context appContext = this.appContext;
        s.j(appContext, "appContext");
        SendOwnerRequest sendOwnerRequestNewInstance = companion.newInstance(appContext);
        h.f65798a.a("Sending destination to vehicle");
        SendOwnerRequest.DefaultImpls.execute$default(sendOwnerRequestNewInstance, HttpMethodType.POST, TeslaNetworkClient.INSTANCE.getOwnerapiBaseURL() + "api/1/vehicles/{vehicle_id}/command/share", v0.f(x.a("vehicle_id", strF)), data, (Map) null, (Map) null, (Integer) null, false, false, DownloaderService.STATUS_HTTP_EXCEPTION, (Object) null).w(timeoutSeconds, TimeUnit.SECONDS).o(zl0.b.b()).t(new b(callback), new c(callback));
        return true;
    }
}
