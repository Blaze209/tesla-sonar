package x60;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.ShippingInformation;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/z;", "Lu30/a;", "Lcom/stripe/android/model/f1;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/f1;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class z implements u30.a<ShippingInformation> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f122907b = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx60/z$a;", "", "<init>", "()V", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_NAME", "FIELD_PHONE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShippingInformation a(JSONObject json) {
        p013kotlin.jvm.internal.s.k(json, "json");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(PlaceTypes.ADDRESS);
        return new ShippingInformation(jSONObjectOptJSONObject != null ? new b().a(jSONObjectOptJSONObject) : null, t30.e.l(json, "name"), t30.e.l(json, "phone"));
    }
}
