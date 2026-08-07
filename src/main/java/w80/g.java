package w80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.x0;
import com.stripe.android.model.y0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p010i90.p0;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.u0;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lw80/g;", "", "a", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w80.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u0017\u001a\u00020\u00162\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010!\u001a\u0004\u0018\u00010 2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0007¢\u0006\u0004\b!\u0010\"J1\u0010$\u001a\u0004\u0018\u00010#2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0007¢\u0006\u0004\b$\u0010%J=\u0010*\u001a\u00020\u00162\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0'2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0'2\u0006\u0010,\u001a\u00020\u000eH\u0001¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lw80/g$a;", "", "<init>", "()V", "", "Li90/g0;", "Ln90/a;", "fieldValuePairs", "Lcom/stripe/android/model/v0$e;", "c", "(Ljava/util/Map;)Lcom/stripe/android/model/v0$e;", "Lcom/stripe/android/model/b;", "b", "(Ljava/util/Map;)Lcom/stripe/android/model/b;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "", "f", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "dest", "formFieldKeyValues", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "", "requiresMandate", "Lcom/stripe/android/model/v0$b;", "allowRedisplay", "Lcom/stripe/android/model/w0;", "g", "(Ljava/util/Map;Ljava/lang/String;ZLcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/y0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;Ljava/lang/String;)Lcom/stripe/android/model/y0;", "Lcom/stripe/android/model/x0;", "h", "(Ljava/util/Map;Ljava/lang/String;)Lcom/stripe/android/model/x0;", "map", "", "keys", "value", "a", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", InquiryField.StringField.TYPE, "e", "(Ljava/lang/String;)Ljava/util/List;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: w80.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/text/m;", "it", "", "", "a", "(Lkotlin/text/m;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
        static final class C2602a extends u implements wn0.l<p013kotlin.text.m, List<? extends String>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C2602a f121449c = new C2602a();

            C2602a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<String> invoke(p013kotlin.text.m it) {
                s.k(it, "it");
                return it.c();
            }
        }

        /* JADX INFO: renamed from: w80.g$a$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements wn0.l<String, Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f121450c = new b();

            b() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String it) {
                s.k(it, "it");
                return Boolean.valueOf(it.length() == 0);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Address b(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs) {
            Address.a aVar = new Address.a();
            IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
            FormFieldEntry formFieldEntry = fieldValuePairs.get(companion.p());
            aVar.e(formFieldEntry != null ? formFieldEntry.getValue() : null);
            FormFieldEntry formFieldEntry2 = fieldValuePairs.get(companion.q());
            aVar.f(formFieldEntry2 != null ? formFieldEntry2.getValue() : null);
            FormFieldEntry formFieldEntry3 = fieldValuePairs.get(companion.k());
            aVar.b(formFieldEntry3 != null ? formFieldEntry3.getValue() : null);
            FormFieldEntry formFieldEntry4 = fieldValuePairs.get(companion.z());
            aVar.h(formFieldEntry4 != null ? formFieldEntry4.getValue() : null);
            FormFieldEntry formFieldEntry5 = fieldValuePairs.get(companion.l());
            aVar.c(formFieldEntry5 != null ? formFieldEntry5.getValue() : null);
            FormFieldEntry formFieldEntry6 = fieldValuePairs.get(companion.u());
            aVar.g(formFieldEntry6 != null ? formFieldEntry6.getValue() : null);
            return aVar.a();
        }

        private final PaymentMethod.BillingDetails c(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs) {
            PaymentMethod.BillingDetails.a aVar = new PaymentMethod.BillingDetails.a();
            IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
            FormFieldEntry formFieldEntry = fieldValuePairs.get(companion.r());
            aVar.d(formFieldEntry != null ? formFieldEntry.getValue() : null);
            FormFieldEntry formFieldEntry2 = fieldValuePairs.get(companion.n());
            aVar.c(formFieldEntry2 != null ? formFieldEntry2.getValue() : null);
            FormFieldEntry formFieldEntry3 = fieldValuePairs.get(companion.t());
            aVar.e(formFieldEntry3 != null ? formFieldEntry3.getValue() : null);
            aVar.b(b(fieldValuePairs));
            PaymentMethod.BillingDetails billingDetailsA = aVar.a();
            if (billingDetailsA.a()) {
                return billingDetailsA;
            }
            return null;
        }

        private final void d(String code, Map<String, Object> dest, Map<String, String> formFieldKeyValues) {
            a(dest, v.e("type"), code);
            Iterator<T> it = formFieldKeyValues.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Companion companion = g.INSTANCE;
                companion.a(dest, companion.e((String) entry.getKey()), (String) entry.getValue());
            }
        }

        private final Map<String, Object> f(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, String code) {
            Map<String, Object> linkedHashMap = new LinkedHashMap<>();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : fieldValuePairs.entrySet()) {
                if (!entry.getKey().getIgnoreField()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(v0.e(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), ((FormFieldEntry) entry2.getValue()).getValue());
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(v0.e(linkedHashMap3.size()));
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                linkedHashMap4.put(((IdentifierSpec) entry3.getKey()).getV1(), entry3.getValue());
            }
            d(code, linkedHashMap, linkedHashMap4);
            return linkedHashMap;
        }

        public final void a(Map<String, Object> map, List<String> keys, String value) {
            s.k(map, "map");
            s.k(keys, "keys");
            if (keys.isEmpty()) {
                return;
            }
            String str = keys.get(0);
            if (keys.size() == 1) {
                map.put(str, value);
                return;
            }
            Object obj = map.get(str);
            Map<String, Object> linkedHashMap = u0.q(obj) ? (Map) obj : null;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(str, linkedHashMap);
            }
            a(linkedHashMap, keys.subList(1, keys.size()), value);
        }

        public final List<String> e(String string) {
            s.k(string, "string");
            return ho0.l.c0(ho0.l.I(ho0.l.p(ho0.l.U(q.f(new q("[*([A-Za-z_0-9]+)]*"), string, 0, 2, null), C2602a.f121449c)), b.f121450c));
        }

        public final PaymentMethodCreateParams g(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, String code, boolean requiresMandate, PaymentMethod.b allowRedisplay) {
            s.k(fieldValuePairs, "fieldValuePairs");
            s.k(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : fieldValuePairs.entrySet()) {
                if (entry.getKey().getDestination() == p0.a.Params) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
                if (!s.f(key, companion.x()) && !s.f(entry2.getKey(), companion.f())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            return PaymentMethodCreateParams.INSTANCE.W(code, g.INSTANCE.c(linkedHashMap2), requiresMandate, v0.A(h.b(f(linkedHashMap2, code))), d1.c("PaymentSheet"), allowRedisplay);
        }

        public final x0 h(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, String code) {
            String value;
            s.k(fieldValuePairs, "fieldValuePairs");
            s.k(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : fieldValuePairs.entrySet()) {
                if (entry.getKey().getDestination() == p0.b.Extras) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            boolean zF = s.f(code, PaymentMethod.p.BacsDebit.code);
            Boolean boolValueOf = null;
            if (!zF) {
                return null;
            }
            FormFieldEntry formFieldEntry = (FormFieldEntry) linkedHashMap.get(IdentifierSpec.INSTANCE.c());
            if (formFieldEntry != null && (value = formFieldEntry.getValue()) != null) {
                boolValueOf = Boolean.valueOf(Boolean.parseBoolean(value));
            }
            return new x0.BacsDebit(boolValueOf);
        }

        public final y0 i(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, String code) {
            s.k(fieldValuePairs, "fieldValuePairs");
            s.k(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : fieldValuePairs.entrySet()) {
                if (entry.getKey().getDestination() == p0.a.Options) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (s.f(code, PaymentMethod.p.Blik.code)) {
                FormFieldEntry formFieldEntry = (FormFieldEntry) linkedHashMap.get(IdentifierSpec.INSTANCE.e());
                String value = formFieldEntry != null ? formFieldEntry.getValue() : null;
                if (value != null) {
                    return new y0.Blik(value);
                }
                return null;
            }
            if (!s.f(code, PaymentMethod.p.Konbini.code)) {
                if (s.f(code, PaymentMethod.p.WeChatPay.code)) {
                    return y0.f.f51754c;
                }
                return null;
            }
            FormFieldEntry formFieldEntry2 = (FormFieldEntry) linkedHashMap.get(IdentifierSpec.INSTANCE.o());
            String value2 = formFieldEntry2 != null ? formFieldEntry2.getValue() : null;
            if (value2 != null) {
                return new y0.Konbini(value2);
            }
            return null;
        }

        private Companion() {
        }
    }
}
