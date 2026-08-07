package x60;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.BankAccount;
import expo.modules.interfaces.permissions.PermissionsResponse;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/d;", "Lu30/a;", "Lcom/stripe/android/model/BankAccount;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/BankAccount;", "a", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements u30.a<BankAccount> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f122829b = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lx60/d$a;", "", "<init>", "()V", "", "FIELD_ACCOUNT_HOLDER_NAME", "Ljava/lang/String;", "FIELD_ACCOUNT_HOLDER_TYPE", "FIELD_BANK_NAME", "FIELD_COUNTRY", "FIELD_CURRENCY", "FIELD_FINGERPRINT", "FIELD_ID", "FIELD_LAST4", "FIELD_ROUTING_NUMBER", "FIELD_STATUS", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BankAccount a(JSONObject json) {
        p013kotlin.jvm.internal.s.k(json, "json");
        return new BankAccount(t30.e.l(json, "id"), t30.e.l(json, "account_holder_name"), BankAccount.Type.INSTANCE.a(t30.e.l(json, "account_holder_type")), t30.e.l(json, "bank_name"), t30.e.f112281a.g(json, PlaceTypes.COUNTRY), t30.e.h(json, "currency"), t30.e.l(json, "fingerprint"), t30.e.l(json, "last4"), t30.e.l(json, "routing_number"), BankAccount.Status.INSTANCE.a(t30.e.l(json, PermissionsResponse.STATUS_KEY)));
    }
}
