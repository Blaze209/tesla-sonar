package x60;

import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.SourceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u0007\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lx60/c0;", "Lu30/a;", "Lcom/stripe/android/model/h1;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/h1;", "Lx60/c0$b;", "Lx60/c0$b;", "itemJsonParser", "c", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c0 implements u30.a<SourceOrder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f122825c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b itemJsonParser = new b();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lx60/c0$a;", "", "<init>", "()V", "", "FIELD_AMOUNT", "Ljava/lang/String;", "FIELD_CURRENCY", "FIELD_EMAIL", "FIELD_ITEMS", "FIELD_SHIPPING", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/c0$b;", "Lu30/a;", "Lcom/stripe/android/model/h1$b;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/h1$b;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements u30.a<SourceOrder.Item> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122827b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lx60/c0$b$a;", "", "<init>", "()V", "", "FIELD_AMOUNT", "Ljava/lang/String;", "FIELD_CURRENCY", "FIELD_DESCRIPTION", "FIELD_QUANTITY", "FIELD_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SourceOrder.Item a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            SourceOrder.Item.EnumC0899b enumC0899bA = SourceOrder.Item.EnumC0899b.INSTANCE.a(t30.e.l(json, "type"));
            if (enumC0899bA == null) {
                return null;
            }
            t30.e eVar = t30.e.f112281a;
            return new SourceOrder.Item(enumC0899bA, eVar.i(json, "amount"), t30.e.l(json, "currency"), t30.e.l(json, "description"), eVar.i(json, "quantity"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/c0$c;", "Lu30/a;", "Lcom/stripe/android/model/h1$c;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/h1$c;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements u30.a<SourceOrder.Shipping> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122828b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lx60/c0$c$a;", "", "<init>", "()V", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_CARRIER", "FIELD_NAME", "FIELD_PHONE", "FIELD_TRACKING_NUMBER", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SourceOrder.Shipping a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(PlaceTypes.ADDRESS);
            return new SourceOrder.Shipping(jSONObjectOptJSONObject != null ? new x60.b().a(jSONObjectOptJSONObject) : null, t30.e.l(json, "carrier"), t30.e.l(json, "name"), t30.e.l(json, "phone"), t30.e.l(json, "tracking_number"));
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SourceOrder a(JSONObject json) {
        p013kotlin.jvm.internal.s.k(json, "json");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("items");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        bo0.j jVarW = bo0.n.w(0, jSONArrayOptJSONArray.length());
        ArrayList<JSONObject> arrayList = new ArrayList(p013kotlin.collections.v.y(jVarW, 10));
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArrayOptJSONArray.optJSONObject(((s0) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject : arrayList) {
            b bVar = this.itemJsonParser;
            p013kotlin.jvm.internal.s.h(jSONObject);
            SourceOrder.Item itemA = bVar.a(jSONObject);
            if (itemA != null) {
                arrayList2.add(itemA);
            }
        }
        Integer numI = t30.e.f112281a.i(json, "amount");
        String strL = t30.e.l(json, "currency");
        String strL2 = t30.e.l(json, Scopes.EMAIL);
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("shipping");
        return new SourceOrder(numI, strL, strL2, arrayList2, jSONObjectOptJSONObject != null ? new c().a(jSONObjectOptJSONObject) : null);
    }
}
