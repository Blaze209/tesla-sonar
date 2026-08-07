package nd0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import hj0.NotificationData;
import java.util.Map;
import jn0.x;
import okhttp3.Headers;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnd0/j;", "Ljj0/a;", "Lnd0/d;", "parameters", "<init>", "(Lnd0/d;)V", "Lhj0/f;", "notification", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lhj0/a;", "type", "Ljn0/h0;", "e", "(Lhj0/f;Landroid/content/Context;Lhj0/a;)V", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "token", "c", "(Landroid/content/Context;Ljava/lang/String;)V", "a", "(Landroid/content/Context;)Ljava/lang/String;", "", "b", "()I", "Lnd0/d;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements jj0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.tesla.logging.g f93865c = com.tesla.logging.g.INSTANCE.a("TeslaNotificationDependencies");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d parameters;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f93867a = new b<>();

        b() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(OwnerResponse it) {
            s.k(it, "it");
            com.tesla.logging.g gVar = j.f93865c;
            JSONObject response = it.getResponse();
            Headers headers = it.getHeaders();
            gVar.j("sendNotificationConfirmation: " + response + " message id : " + (headers != null ? headers.get("x-txid") : null));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f93868a = new c<>();

        c() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            s.k(error, "error");
            com.tesla.logging.g gVar = j.f93865c;
            String str = "sendNotificationConfirmation: " + error.getMessage() + " ";
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
    }

    public j(d parameters) {
        s.k(parameters, "parameters");
        this.parameters = parameters;
    }

    @Override // jj0.a
    public String a(Context context) {
        s.k(context, "context");
        return qb0.a.INSTANCE.b().Q();
    }

    @Override // jj0.a
    public int b() {
        return this.parameters.getIcon();
    }

    @Override // jj0.a
    public void c(Context context, String token) {
        s.k(context, "context");
        qb0.a.INSTANCE.b().s(token);
    }

    @Override // jj0.a
    public String d() {
        return "e7ff260489cb4f38b5a36ee5";
    }

    @Override // jj0.a
    public void e(NotificationData notification, Context context, hj0.a type) throws JSONException {
        s.k(notification, "notification");
        s.k(context, "context");
        s.k(type, "type");
        JSONObject jSONObjectC = notification.c();
        if (jSONObjectC == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        jSONObjectC.put("time_received", System.currentTimeMillis() / ((long) 1000));
        jSONObjectC.put("device_type", this.parameters.a());
        jSONObjectC.put("device_token", this.parameters.getToken());
        jSONObjectC.put("delivery_type", type.getParam());
        SendOwnerRequest.Companion companion = SendOwnerRequest.INSTANCE;
        s.h(applicationContext);
        SendOwnerRequest.DefaultImpls.execute$default(companion.newInstance(applicationContext), "POST", "api/1/notification_confirmations", (Map) null, jSONObjectC, (Map) null, (Map) null, (Integer) null, false, false, DownloaderService.STATUS_HTTP_EXCEPTION, (Object) null).v(vm0.a.c()).t(b.f93867a, c.f93868a);
    }
}
