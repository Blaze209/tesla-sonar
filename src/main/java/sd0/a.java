package sd0;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cm0.f;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.tesla.logging.g;
import com.tesla.oapi.HttpMethodType;
import com.tesla.oapi.OwnerApiEndpoint;
import com.tesla.oapi.OwnerApiEndpoints;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import ie0.n;
import io.reactivex.rxjava3.core.u;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.Map;
import javax.crypto.NoSuchPaddingException;
import jn0.h0;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lsd0/a;", "", "Lcom/tesla/oapi/OwnerApiEndpoints;", "endpoints", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "Ltd0/m;", "realmHelper", "Landroid/content/Context;", "applicationContext", "<init>", "(Lcom/tesla/oapi/OwnerApiEndpoints;Lcom/tesla/oapi/SendOwnerRequest;Ltd0/m;Landroid/content/Context;)V", "Lio/reactivex/rxjava3/core/u;", "Lcom/tesla/oapi/OwnerResponse;", "e", "()Lio/reactivex/rxjava3/core/u;", "Ltc0/g;", "vault", "Ljn0/h0;", "g", "(Ltc0/g;)V", "f", "()V", "a", "Lcom/tesla/oapi/OwnerApiEndpoints;", "b", "Lcom/tesla/oapi/SendOwnerRequest;", "c", "Ltd0/m;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "profilebackup_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f111110f = g.INSTANCE.a("ProfileBackupService");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OwnerApiEndpoints endpoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SendOwnerRequest sendOwnerRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m realmHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: sd0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lsd0/a$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd0/a;", "a", "(Landroid/content/Context;)Lsd0/a;", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "DOWNLOAD_VAULT_ENDPOINT", "JSON_KEY_VAULT", "UPLOAD_VAULT_ENDPOINT", "profilebackup_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context) {
            s.k(context, "context");
            Context applicationContext = context.getApplicationContext();
            OwnerApiEndpoints.Companion companion = OwnerApiEndpoints.INSTANCE;
            s.h(applicationContext);
            OwnerApiEndpoints companion2 = companion.getInstance(applicationContext);
            SendOwnerRequest sendOwnerRequestNewInstance = SendOwnerRequest.INSTANCE.newInstance(applicationContext);
            m mVarJ = m.j();
            s.h(mVarJ);
            return new a(companion2, sendOwnerRequestNewInstance, mVarJ, applicationContext);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T> implements f {
        b() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(OwnerResponse it) throws JSONException, NoSuchPaddingException, InvalidKeySpecException, NoSuchAlgorithmException, CertificateException {
            JSONObject response;
            JSONObject jSONObjectOptJSONObject;
            String string;
            s.k(it, "it");
            if (!it.isSuccessful() || it.getResponse() == null || (response = it.getResponse()) == null || (jSONObjectOptJSONObject = response.optJSONObject("response")) == null || (string = jSONObjectOptJSONObject.getString("vault")) == null) {
                return;
            }
            tc0.g gVarF = sd0.b.INSTANCE.f(tc0.g.f113160h.decode(n.a(string)), a.this.realmHelper, a.this.applicationContext);
            if (gVarF != null) {
                a.this.g(gVarF);
            }
            a.f111110f.j("Download Successful!");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f111116a = new c<>();

        c() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            s.k(it, "it");
            a.f111110f.j("Download Failed!");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d<T> f111117a = new d<>();

        d() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(OwnerResponse it) {
            s.k(it, "it");
            if (it.isSuccessful()) {
                a.f111110f.j("Upload Successful!");
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e<T> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e<T> f111118a = new e<>();

        e() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            s.k(it, "it");
            a.f111110f.j("Upload Failed!");
        }
    }

    public a(OwnerApiEndpoints endpoints, SendOwnerRequest sendOwnerRequest, m realmHelper, Context applicationContext) {
        s.k(endpoints, "endpoints");
        s.k(sendOwnerRequest, "sendOwnerRequest");
        s.k(realmHelper, "realmHelper");
        s.k(applicationContext, "applicationContext");
        this.endpoints = endpoints;
        this.sendOwnerRequest = sendOwnerRequest;
        this.realmHelper = realmHelper;
        this.applicationContext = applicationContext;
    }

    private final u<OwnerResponse> e() {
        OwnerApiEndpoint endpoint = this.endpoints.getEndpoint("VEHICLE_DOWNLOAD_VAULT");
        if (endpoint == null) {
            throw new IllegalStateException("VEHICLE_DOWNLOAD_VAULT not found in endpoints");
        }
        return SendOwnerRequest.DefaultImpls.execute$default(this.sendOwnerRequest, endpoint.getMethod(), endpoint.getUri(), null, null, false, false, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final void g(tc0.g vault) throws JSONException {
        OwnerApiEndpoint endpoint = this.endpoints.getEndpoint("VEHICLE_UPLOAD_VAULT");
        if (endpoint == null) {
            throw new IllegalStateException("VEHICLE_UPLOAD_VAULT not found in endpoints");
        }
        HttpMethodType method = endpoint.getMethod();
        String uri = endpoint.getUri();
        SendOwnerRequest sendOwnerRequest = this.sendOwnerRequest;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vault", vault.encodeByteString().a());
        h0 h0Var = h0.f84049a;
        SendOwnerRequest.DefaultImpls.execute$default(sendOwnerRequest, method, uri, (Map) null, jSONObject, (Map) null, (Map) null, (Integer) null, false, false, DownloaderService.STATUS_HTTP_EXCEPTION, (Object) null).t(d.f111117a, e.f111118a);
    }

    @SuppressLint({"CheckResult"})
    public final void f() {
        e().t(new b(), c.f111116a);
    }
}
