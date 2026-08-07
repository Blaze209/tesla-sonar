package fe0;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lfe0/f;", "", "", CMSAttributeTableGenerator.CONTENT_TYPE, "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", Action.KEY_ATTRIBUTE, "Lorg/json/JSONObject;", "value", "Ljn0/h0;", "c", "(Ljava/lang/String;Lorg/json/JSONObject;)V", DateTokenConverter.CONVERTER_KEY, "g", "()Lorg/json/JSONObject;", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "e", "(Landroid/content/Intent;)V", "Landroid/content/Context;", "applicationContext", "a", "(Landroid/content/Context;Landroid/content/Intent;)V", "b", "", "f", "()Z", "Ljava/lang/String;", "Lorg/json/JSONObject;", "valuesJson", "share_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String contentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String locale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final JSONObject valuesJson;

    public f(String contentType, String locale) {
        s.k(contentType, "contentType");
        s.k(locale, "locale");
        this.contentType = contentType;
        this.locale = locale;
        this.valuesJson = new JSONObject();
    }

    private final void c(String key, JSONObject value) {
        try {
            this.valuesJson.put(key, value);
        } catch (JSONException unused) {
        }
    }

    private final void d(String key, String value) {
        try {
            this.valuesJson.put(key, value);
        } catch (JSONException unused) {
        }
    }

    public final void a(Context applicationContext, Intent intent) {
        i iVar = i.f65799a;
        s.h(applicationContext);
        s.h(intent);
        JSONObject jSONObjectA = iVar.a(applicationContext, intent);
        if (jSONObjectA != null) {
            c("android.intent.extra.STREAM", jSONObjectA);
        }
    }

    public final void b(Intent intent) {
        s.k(intent, "intent");
        String scheme = intent.getScheme();
        String action = intent.getAction();
        String dataString = intent.getDataString();
        String type = intent.getType();
        if (scheme != null) {
            d("android.intent.SCHEME", scheme);
        }
        if (action != null) {
            d("android.intent.ACTION", action);
        }
        if (dataString != null) {
            d("android.intent.DATA", dataString);
        }
        if (type != null) {
            d("android.intent.TYPE", type);
        }
    }

    public final void e(Intent intent) {
        s.k(intent, "intent");
        String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        if (stringExtra != null) {
            d("android.intent.extra.SUBJECT", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra2 != null) {
            d("android.intent.extra.TEXT", stringExtra2);
        }
    }

    public final boolean f() {
        return this.valuesJson.length() > 0;
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.contentType);
            jSONObject.put("value", this.valuesJson);
            jSONObject.put("locale", this.locale);
            jSONObject.put("timestamp_ms", String.valueOf(System.currentTimeMillis()));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
