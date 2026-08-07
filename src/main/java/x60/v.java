package x60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\f\t\u0007\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lx60/v;", "Lu30/a;", "Lcom/stripe/android/model/v0;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0;", "a", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v implements u30.a<PaymentMethod> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f122886b = new e(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$a;", "Lu30/a;", "Lcom/stripe/android/model/v0$c;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$c;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements u30.a<PaymentMethod.AuBecsDebit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final C2651a f122887b = new C2651a(null);

        /* JADX INFO: renamed from: x60.v$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx60/v$a$a;", "", "<init>", "()V", "", "FIELD_BSB_NUMBER", "Ljava/lang/String;", "FIELD_FINGERPRINT", "FIELD_LAST4", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class C2651a {
            public /* synthetic */ C2651a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2651a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.AuBecsDebit a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new PaymentMethod.AuBecsDebit(t30.e.l(json, "bsb_number"), t30.e.l(json, "fingerprint"), t30.e.l(json, "last4"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$b;", "Lu30/a;", "Lcom/stripe/android/model/v0$d;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$d;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements u30.a<PaymentMethod.BacsDebit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122888b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx60/v$b$a;", "", "<init>", "()V", "", "FIELD_FINGERPRINT", "Ljava/lang/String;", "FIELD_LAST4", "FIELD_SORT_CODE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.BacsDebit a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new PaymentMethod.BacsDebit(t30.e.l(json, "fingerprint"), t30.e.l(json, "last4"), t30.e.l(json, "sort_code"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$c;", "Lu30/a;", "Lcom/stripe/android/model/v0$e;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$e;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements u30.a<PaymentMethod.BillingDetails> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122889b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lx60/v$c$a;", "", "<init>", "()V", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.BillingDetails a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(PlaceTypes.ADDRESS);
            return new PaymentMethod.BillingDetails(jSONObjectOptJSONObject != null ? new x60.b().a(jSONObjectOptJSONObject) : null, t30.e.l(json, Scopes.EMAIL), t30.e.l(json, "name"), t30.e.l(json, "phone"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\t\u0007\n\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lx60/v$d;", "Lu30/a;", "Lcom/stripe/android/model/v0$g;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$g;", "a", "c", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements u30.a<PaymentMethod.Card> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final b f122890b = new b(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$d$a;", "Lu30/a;", "Lcom/stripe/android/model/v0$g$a;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$g$a;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements u30.a<PaymentMethod.Card.Checks> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final C2652a f122891b = new C2652a(null);

            /* JADX INFO: renamed from: x60.v$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx60/v$d$a$a;", "", "<init>", "()V", "", "FIELD_ADDRESS_LINE1_CHECK", "Ljava/lang/String;", "FIELD_ADDRESS_POSTAL_CODE_CHECK", "FIELD_CVC_CHECK", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            private static final class C2652a {
                public /* synthetic */ C2652a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C2652a() {
                }
            }

            @Override // u30.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public PaymentMethod.Card.Checks a(JSONObject json) {
                p013kotlin.jvm.internal.s.k(json, "json");
                return new PaymentMethod.Card.Checks(t30.e.l(json, "address_line1_check"), t30.e.l(json, "address_postal_code_check"), t30.e.l(json, "cvc_check"));
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lx60/v$d$b;", "", "<init>", "()V", "", "FIELD_BRAND", "Ljava/lang/String;", "FIELD_CHECKS", "FIELD_COUNTRY", "FIELD_DISPLAY_BRAND", "FIELD_EXP_MONTH", "FIELD_EXP_YEAR", "FIELD_FINGERPRINT", "FIELD_FUNDING", "FIELD_LAST4", "FIELD_NETWORKS", "FIELD_THREE_D_SECURE_USAGE", "FIELD_WALLET", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$d$c;", "Lu30/a;", "Lcom/stripe/android/model/v0$g$c;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$g$c;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements u30.a<PaymentMethod.Card.Networks> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final a f122892b = new a(null);

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx60/v$d$c$a;", "", "<init>", "()V", "", "FIELD_AVAIABLE", "Ljava/lang/String;", "FIELD_PREFERRED", "FIELD_SELECTION_MANDATORY", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            private static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private a() {
                }
            }

            @Override // u30.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public PaymentMethod.Card.Networks a(JSONObject json) {
                p013kotlin.jvm.internal.s.k(json, "json");
                List listA = t30.e.f112281a.a(json.optJSONArray("available"));
                if (listA == null) {
                    listA = p013kotlin.collections.v.m();
                }
                List list = listA;
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toString());
                }
                return new PaymentMethod.Card.Networks(p013kotlin.collections.v.r1(arrayList), t30.e.f112281a.f(json, "selection_mandatory"), t30.e.l(json, "preferred"));
            }
        }

        /* JADX INFO: renamed from: x60.v$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$d$d;", "Lu30/a;", "Lcom/stripe/android/model/v0$g$d;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$g$d;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C2653d implements u30.a<PaymentMethod.Card.ThreeDSecureUsage> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final a f122893b = new a(null);

            /* JADX INFO: renamed from: x60.v$d$d$a */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx60/v$d$d$a;", "", "<init>", "()V", "", "FIELD_IS_SUPPORTED", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            private static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private a() {
                }
            }

            @Override // u30.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public PaymentMethod.Card.ThreeDSecureUsage a(JSONObject json) {
                p013kotlin.jvm.internal.s.k(json, "json");
                return new PaymentMethod.Card.ThreeDSecureUsage(t30.e.f112281a.f(json, "supported"));
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.Card a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            com.stripe.android.model.h hVarB = com.stripe.android.model.h.INSTANCE.b(t30.e.l(json, "brand"));
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("checks");
            PaymentMethod.Card.Checks checksA = jSONObjectOptJSONObject != null ? new a().a(jSONObjectOptJSONObject) : null;
            String strL = t30.e.l(json, PlaceTypes.COUNTRY);
            t30.e eVar = t30.e.f112281a;
            Integer numI = eVar.i(json, "exp_month");
            Integer numI2 = eVar.i(json, "exp_year");
            String strL2 = t30.e.l(json, "fingerprint");
            String strL3 = t30.e.l(json, "funding");
            String strL4 = t30.e.l(json, "last4");
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("three_d_secure_usage");
            PaymentMethod.Card.ThreeDSecureUsage threeDSecureUsageA = jSONObjectOptJSONObject2 != null ? new C2653d().a(jSONObjectOptJSONObject2) : null;
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("wallet");
            y60.a aVarB = jSONObjectOptJSONObject3 != null ? new g0().a(jSONObjectOptJSONObject3) : null;
            JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("networks");
            return new PaymentMethod.Card(hVarB, checksA, strL, numI, numI2, strL2, strL3, strL4, threeDSecureUsageA, aVarB, jSONObjectOptJSONObject4 != null ? new c().a(jSONObjectOptJSONObject4) : null, t30.e.l(json, "display_brand"));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lx60/v$e;", "", "<init>", "()V", "", "FIELD_ALLOW_REDISPLAY", "Ljava/lang/String;", "FIELD_BILLING_DETAILS", "FIELD_CREATED", "FIELD_CUSTOMER", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$f;", "Lu30/a;", "Lcom/stripe/android/model/v0$k;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$k;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements u30.a<PaymentMethod.Fpx> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122894b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lx60/v$f$a;", "", "<init>", "()V", "", "FIELD_ACCOUNT_HOLDER_TYPE", "Ljava/lang/String;", "FIELD_BANK", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.Fpx a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new PaymentMethod.Fpx(t30.e.l(json, PlaceTypes.BANK), t30.e.l(json, "account_holder_type"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$g;", "Lu30/a;", "Lcom/stripe/android/model/v0$l;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$l;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements u30.a<PaymentMethod.Ideal> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122895b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lx60/v$g$a;", "", "<init>", "()V", "", "FIELD_BANK", "Ljava/lang/String;", "FIELD_BIC", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.Ideal a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new PaymentMethod.Ideal(t30.e.l(json, PlaceTypes.BANK), t30.e.l(json, "bic"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$h;", "Lu30/a;", "Lcom/stripe/android/model/v0$m;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$m;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements u30.a<PaymentMethod.Netbanking> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122896b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx60/v$h$a;", "", "<init>", "()V", "", "FIELD_BANK", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.Netbanking a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new PaymentMethod.Netbanking(t30.e.l(json, PlaceTypes.BANK));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$i;", "Lu30/a;", "Lcom/stripe/android/model/v0$n;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$n;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements u30.a<PaymentMethod.SepaDebit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122897b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lx60/v$i$a;", "", "<init>", "()V", "", "FIELD_BANK_CODE", "Ljava/lang/String;", "FIELD_BRANCH_CODE", "FIELD_COUNTRY", "FIELD_FINGERPRINT", "FIELD_LAST4", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.SepaDebit a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new PaymentMethod.SepaDebit(t30.e.l(json, "bank_code"), t30.e.l(json, "branch_code"), t30.e.l(json, PlaceTypes.COUNTRY), t30.e.l(json, "fingerprint"), t30.e.l(json, "last4"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$j;", "Lu30/a;", "Lcom/stripe/android/model/v0$o;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$o;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements u30.a<PaymentMethod.Sofort> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122898b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx60/v$j$a;", "", "<init>", "()V", "", "FIELD_COUNTRY", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.Sofort a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new PaymentMethod.Sofort(t30.e.l(json, PlaceTypes.COUNTRY));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$k;", "Lu30/a;", "Lcom/stripe/android/model/v0$r;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$r;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements u30.a<PaymentMethod.USBankAccount> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122899b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lx60/v$k$a;", "", "<init>", "()V", "", "FIELD_ACCOUNT_HOLDER_TYPE", "Ljava/lang/String;", "FIELD_ACCOUNT_TYPE", "FIELD_BANK_NAME", "FIELD_FINANCIAL_CONNECTIONS_ACCOUNT", "FIELD_FINGERPRINT", "FIELD_LAST4", "FIELD_NETWORKS", "FIELD_NETWORKS_PREFERRED", "FIELD_NETWORKS_SUPPORTED", "FIELD_ROUTING_NUMBER", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.USBankAccount a(JSONObject json) {
            PaymentMethod.USBankAccount.b next;
            PaymentMethod.USBankAccount.c next2;
            PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks;
            p013kotlin.jvm.internal.s.k(json, "json");
            Iterator<PaymentMethod.USBankAccount.b> it = PaymentMethod.USBankAccount.b.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p013kotlin.jvm.internal.s.f(t30.e.l(json, "account_holder_type"), next.getValue()));
            PaymentMethod.USBankAccount.b bVar = next;
            if (bVar == null) {
                bVar = PaymentMethod.USBankAccount.b.UNKNOWN;
            }
            PaymentMethod.USBankAccount.b bVar2 = bVar;
            Iterator<PaymentMethod.USBankAccount.c> it2 = PaymentMethod.USBankAccount.c.getEntries().iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!p013kotlin.jvm.internal.s.f(t30.e.l(json, "account_type"), next2.getValue()));
            PaymentMethod.USBankAccount.c cVar = next2;
            if (cVar == null) {
                cVar = PaymentMethod.USBankAccount.c.UNKNOWN;
            }
            PaymentMethod.USBankAccount.c cVar2 = cVar;
            String strL = t30.e.l(json, "bank_name");
            String strL2 = t30.e.l(json, "fingerprint");
            String strL3 = t30.e.l(json, "last4");
            String strL4 = t30.e.l(json, "financial_connections_account");
            if (json.has("networks")) {
                String strL5 = t30.e.l(json.optJSONObject("networks"), "preferred");
                t30.e eVar = t30.e.f112281a;
                JSONObject jSONObjectOptJSONObject = json.optJSONObject("networks");
                List listA = eVar.a(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.getJSONArray("supported") : null);
                if (listA == null) {
                    listA = p013kotlin.collections.v.m();
                }
                List list = listA;
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().toString());
                }
                uSBankNetworks = new PaymentMethod.USBankAccount.USBankNetworks(strL5, arrayList);
            } else {
                uSBankNetworks = null;
            }
            return new PaymentMethod.USBankAccount(bVar2, cVar2, strL, strL2, strL3, strL4, uSBankNetworks, t30.e.l(json, "routing_number"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/v$l;", "Lu30/a;", "Lcom/stripe/android/model/v0$s;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/v0$s;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements u30.a<PaymentMethod.Upi> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122900b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx60/v$l$a;", "", "<init>", "()V", "", "FIELD_VPA", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PaymentMethod.Upi a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new PaymentMethod.Upi(t30.e.l(json, "vpa"));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122901a;

        static {
            int[] iArr = new int[PaymentMethod.p.values().length];
            try {
                iArr[PaymentMethod.p.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.p.CardPresent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.p.Ideal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.p.Fpx.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.p.SepaDebit.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentMethod.p.AuBecsDebit.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentMethod.p.BacsDebit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentMethod.p.Sofort.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentMethod.p.Upi.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentMethod.p.Netbanking.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentMethod.p.USBankAccount.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f122901a = iArr;
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentMethod a(JSONObject json) {
        PaymentMethod.b bVar;
        PaymentMethod.b next;
        p013kotlin.jvm.internal.s.k(json, "json");
        String strL = t30.e.l(json, "type");
        PaymentMethod.p pVarA = PaymentMethod.p.INSTANCE.a(strL);
        PaymentMethod.f fVarI = new PaymentMethod.f().l(t30.e.l(json, "id")).r(pVarA).h(strL).i(t30.e.f112281a.j(json, "created"));
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("billing_details");
        PaymentMethod.f fVarE = fVarI.e(jSONObjectOptJSONObject != null ? new c().a(jSONObjectOptJSONObject) : null);
        String strL2 = t30.e.l(json, "allow_redisplay");
        if (strL2 != null) {
            Iterator<PaymentMethod.b> it = PaymentMethod.b.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p013kotlin.jvm.internal.s.f(strL2, next.getValue()));
            bVar = next;
        } else {
            bVar = null;
        }
        PaymentMethod.f fVarN = fVarE.b(bVar).j(t30.e.l(json, "customer")).n(json.optBoolean("livemode"));
        switch (pVarA == null ? -1 : m.f122901a[pVarA.ordinal()]) {
            case 1:
                JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(pVarA.code);
                fVarN.f(jSONObjectOptJSONObject2 != null ? new d().a(jSONObjectOptJSONObject2) : null);
                break;
            case 2:
                fVarN.g(PaymentMethod.CardPresent.INSTANCE.a());
                break;
            case 3:
                JSONObject jSONObjectOptJSONObject3 = json.optJSONObject(pVarA.code);
                fVarN.m(jSONObjectOptJSONObject3 != null ? new g().a(jSONObjectOptJSONObject3) : null);
                break;
            case 4:
                JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(pVarA.code);
                fVarN.k(jSONObjectOptJSONObject4 != null ? new f().a(jSONObjectOptJSONObject4) : null);
                break;
            case 5:
                JSONObject jSONObjectOptJSONObject5 = json.optJSONObject(pVarA.code);
                fVarN.p(jSONObjectOptJSONObject5 != null ? new i().a(jSONObjectOptJSONObject5) : null);
                break;
            case 6:
                JSONObject jSONObjectOptJSONObject6 = json.optJSONObject(pVarA.code);
                fVarN.c(jSONObjectOptJSONObject6 != null ? new a().a(jSONObjectOptJSONObject6) : null);
                break;
            case 7:
                JSONObject jSONObjectOptJSONObject7 = json.optJSONObject(pVarA.code);
                fVarN.d(jSONObjectOptJSONObject7 != null ? new b().a(jSONObjectOptJSONObject7) : null);
                break;
            case 8:
                JSONObject jSONObjectOptJSONObject8 = json.optJSONObject(pVarA.code);
                fVarN.q(jSONObjectOptJSONObject8 != null ? new j().a(jSONObjectOptJSONObject8) : null);
                break;
            case 9:
                JSONObject jSONObjectOptJSONObject9 = json.optJSONObject(pVarA.code);
                fVarN.t(jSONObjectOptJSONObject9 != null ? new l().a(jSONObjectOptJSONObject9) : null);
                break;
            case 10:
                JSONObject jSONObjectOptJSONObject10 = json.optJSONObject(pVarA.code);
                fVarN.o(jSONObjectOptJSONObject10 != null ? new h().a(jSONObjectOptJSONObject10) : null);
                break;
            case 11:
                JSONObject jSONObjectOptJSONObject11 = json.optJSONObject(pVarA.code);
                fVarN.s(jSONObjectOptJSONObject11 != null ? new k().a(jSONObjectOptJSONObject11) : null);
                break;
        }
        return fVarN.a();
    }
}
