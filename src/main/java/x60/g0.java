package x60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.stripe.android.model.Address;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lx60/g0;", "Lu30/a;", "Ly60/a;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "Ly60/a$e;", "c", "(Lorg/json/JSONObject;)Ly60/a$e;", "", "dynamicLast4", "Ly60/a$h;", DateTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;Ljava/lang/String;)Ly60/a$h;", "b", "(Lorg/json/JSONObject;)Ly60/a;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g0 implements u30.a<y60.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f122841b = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lx60/g0$a;", "", "<init>", "()V", "", "FIELD_BILLING_ADDRESS", "Ljava/lang/String;", "FIELD_DYNAMIC_LAST4", "FIELD_EMAIL", "FIELD_NAME", "FIELD_SHIPPING_ADDRESS", "FIELD_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122842a;

        static {
            int[] iArr = new int[y60.a.g.values().length];
            try {
                iArr[y60.a.g.AmexExpressCheckout.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y60.a.g.ApplePay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y60.a.g.SamsungPay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y60.a.g.GooglePay.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y60.a.g.Masterpass.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[y60.a.g.VisaCheckout.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[y60.a.g.Link.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f122842a = iArr;
        }
    }

    private final y60.a.MasterpassWallet c(JSONObject json) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("billing_address");
        Address addressA = jSONObjectOptJSONObject != null ? new x60.b().a(jSONObjectOptJSONObject) : null;
        String strL = t30.e.l(json, Scopes.EMAIL);
        String strL2 = t30.e.l(json, "name");
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("shipping_address");
        return new y60.a.MasterpassWallet(addressA, strL, strL2, jSONObjectOptJSONObject2 != null ? new x60.b().a(jSONObjectOptJSONObject2) : null);
    }

    private final y60.a.VisaCheckoutWallet d(JSONObject json, String dynamicLast4) {
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("billing_address");
        Address addressA = jSONObjectOptJSONObject != null ? new x60.b().a(jSONObjectOptJSONObject) : null;
        String strL = t30.e.l(json, Scopes.EMAIL);
        String strL2 = t30.e.l(json, "name");
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("shipping_address");
        return new y60.a.VisaCheckoutWallet(addressA, strL, strL2, jSONObjectOptJSONObject2 != null ? new x60.b().a(jSONObjectOptJSONObject2) : null, dynamicLast4);
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y60.a a(JSONObject json) {
        JSONObject jSONObjectOptJSONObject;
        p013kotlin.jvm.internal.s.k(json, "json");
        y60.a.g gVarA = y60.a.g.INSTANCE.a(t30.e.l(json, "type"));
        if (gVarA == null || (jSONObjectOptJSONObject = json.optJSONObject(gVarA.getCode())) == null) {
            return null;
        }
        String strL = t30.e.l(json, "dynamic_last4");
        switch (b.f122842a[gVarA.ordinal()]) {
            case 1:
                return new y60.a.AmexExpressCheckoutWallet(strL);
            case 2:
                return new y60.a.ApplePayWallet(strL);
            case 3:
                return new y60.a.SamsungPayWallet(strL);
            case 4:
                return new y60.a.GooglePayWallet(strL);
            case 5:
                return c(jSONObjectOptJSONObject);
            case 6:
                return d(jSONObjectOptJSONObject, strL);
            case 7:
                return new y60.a.LinkWallet(strL);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
