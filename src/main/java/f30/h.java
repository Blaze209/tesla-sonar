package f30;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\rB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u0019"}, d2 = {"Lf30/h;", "", "", "publishableKey", "connectedAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "Lf30/o;", "paymentConfiguration", "(Lf30/o;)V", "a", "Ljava/lang/String;", "b", "validPublishableKey", "c", "sdkVersion", "()Ljava/lang/String;", Action.KEY_ATTRIBUTE, "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "tokenizationSpecification", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f64029d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String connectedAccountId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String validPublishableKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sdkVersion;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf30/h$a;", "", "<init>", "()V", "", "USER_AGENT", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public h(String publishableKey, String str) {
        p013kotlin.jvm.internal.s.k(publishableKey, "publishableKey");
        this.connectedAccountId = str;
        this.validPublishableKey = o30.a.INSTANCE.a().b(publishableKey);
        this.sdkVersion = "20.52.3";
    }

    private final String a() {
        String str = this.connectedAccountId;
        if (str != null) {
            String str2 = this.validPublishableKey + "/" + str;
            if (str2 != null) {
                return str2;
            }
        }
        return this.validPublishableKey;
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("type", "PAYMENT_GATEWAY").put("parameters", new JSONObject().put("gateway", "stripe").put("stripe:version", "StripeAndroid/" + this.sdkVersion).put("stripe:publishableKey", a()));
        p013kotlin.jvm.internal.s.j(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        this(PaymentConfiguration.INSTANCE.a(context));
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private h(PaymentConfiguration paymentConfiguration) {
        this(paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId());
    }
}
