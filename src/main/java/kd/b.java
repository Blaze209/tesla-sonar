package kd;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lkd/b;", "", "", "isAuthenticated", "", StatusResponse.PAYLOAD, "<init>", "(ZLjava/lang/String;)V", "a", "Z", "()Z", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isAuthenticated;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String payload;

    /* JADX INFO: renamed from: kd.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lkd/b$a;", "", "<init>", "()V", "", "transactionStatus", "errorDetails", "authorisationToken", "Lkd/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkd/b;", "KEY_AUTHORISATION_TOKEN", "Ljava/lang/String;", "KEY_SDK_ERROR", "KEY_TRANSACTION_STATUS", "VALUE_TRANSACTION_STATUS", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b b(Companion companion, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            return companion.a(str, str2, str3);
        }

        public final b a(String transactionStatus, String errorDetails, String authorisationToken) throws JSONException {
            s.k(transactionStatus, "transactionStatus");
            boolean zF = s.f("Y", transactionStatus);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transStatus", transactionStatus);
            jSONObject.putOpt("authorisationToken", authorisationToken);
            jSONObject.putOpt("threeDS2SDKError", errorDetails);
            tn0.a.Companion companion = tn0.a.INSTANCE;
            String string = jSONObject.toString();
            s.j(string, "toString(...)");
            byte[] bytes = string.getBytes(d.UTF_8);
            s.j(bytes, "getBytes(...)");
            return new b(zF, tn0.a.m(companion, bytes, 0, 0, 6, null), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ b(boolean z11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    private b(boolean z11, String str) {
        this.isAuthenticated = z11;
        this.payload = str;
    }
}
