package x60;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChat;
import com.stripe.android.model.r0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000e\t\u0007\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lx60/t;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a;", "a", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "n", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t implements u30.a<StripeIntent.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f122872b = new d(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/t$a;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$a;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$a;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements u30.a<StripeIntent.a.AlipayRedirect> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final C2650a f122873b = new C2650a(null);

        /* JADX INFO: renamed from: x60.t$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx60/t$a$a;", "", "<init>", "()V", "", "FIELD_NATIVE_DATA", "Ljava/lang/String;", "FIELD_RETURN_URL", "FIELD_URL", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class C2650a {
            public /* synthetic */ C2650a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2650a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.AlipayRedirect a(JSONObject json) throws JSONException {
            p013kotlin.jvm.internal.s.k(json, "json");
            String string = json.getString("native_data");
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            String string2 = json.getString(ImagesContract.URL);
            p013kotlin.jvm.internal.s.j(string2, "getString(...)");
            return new StripeIntent.a.AlipayRedirect(string, string2, t30.e.l(json, "return_url"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx60/t$b;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$b;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements u30.a<StripeIntent.a.b> {
        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.b a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return StripeIntent.a.b.f51019a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx60/t$c;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$c;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements u30.a<StripeIntent.a.CashAppRedirect> {
        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.CashAppRedirect a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            String strOptString = json.optString("mobile_auth_url");
            p013kotlin.jvm.internal.s.j(strOptString, "optString(...)");
            return new StripeIntent.a.CashAppRedirect(strOptString);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx60/t$d;", "", "<init>", "()V", "", "FIELD_NEXT_ACTION_TYPE", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/t$e;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$d;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$d;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class e implements u30.a<StripeIntent.a.DisplayBoletoDetails> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122874b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx60/t$e$a;", "", "<init>", "()V", "", "FIELD_HOSTED_VOUCHER_URL", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.DisplayBoletoDetails a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new StripeIntent.a.DisplayBoletoDetails(t30.e.l(json, "hosted_voucher_url"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/t$f;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$e;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$e;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class f implements u30.a<StripeIntent.a.DisplayKonbiniDetails> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122875b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx60/t$f$a;", "", "<init>", "()V", "", "FIELD_HOSTED_VOUCHER_URL", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.DisplayKonbiniDetails a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new StripeIntent.a.DisplayKonbiniDetails(t30.e.l(json, "hosted_voucher_url"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/t$g;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$f;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$f;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class g implements u30.a<StripeIntent.a.DisplayMultibancoDetails> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122876b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx60/t$g$a;", "", "<init>", "()V", "", "FIELD_HOSTED_VOUCHER_URL", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.DisplayMultibancoDetails a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new StripeIntent.a.DisplayMultibancoDetails(t30.e.l(json, "hosted_voucher_url"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/t$h;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$g;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$g;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class h implements u30.a<StripeIntent.a.DisplayOxxoDetails> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122877b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx60/t$h$a;", "", "<init>", "()V", "", "FIELD_EXPIRES_AFTER", "Ljava/lang/String;", "FIELD_HOSTED_VOUCHER_URL", "FIELD_NUMBER", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.DisplayOxxoDetails a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new StripeIntent.a.DisplayOxxoDetails(json.optInt("expires_after"), t30.e.l(json, InquiryField.FloatField.TYPE2), t30.e.l(json, "hosted_voucher_url"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/t$i;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$i;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$i;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements u30.a<StripeIntent.a.RedirectToUrl> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122878b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lx60/t$i$a;", "", "<init>", "()V", "", "FIELD_RETURN_URL", "Ljava/lang/String;", "FIELD_URL", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.RedirectToUrl a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            if (!json.has(ImagesContract.URL)) {
                return null;
            }
            Uri uri = Uri.parse(json.getString(ImagesContract.URL));
            p013kotlin.jvm.internal.s.j(uri, "parse(...)");
            return new StripeIntent.a.RedirectToUrl(uri, json.optString("return_url"));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lx60/t$j;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$j;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "Lcom/stripe/android/model/StripeIntent$a$j$b$b;", "c", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$j$b$b;", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$j;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class j implements u30.a<StripeIntent.a.j> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122879b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lx60/t$j$a;", "", "<init>", "()V", "", "FIELD_CERTIFICATE", "Ljava/lang/String;", "FIELD_DIRECTORY_SERVER_ENCRYPTION", "FIELD_DIRECTORY_SERVER_ID", "FIELD_DIRECTORY_SERVER_NAME", "FIELD_KEY_ID", "FIELD_PUBLISHABLE_KEY", "FIELD_ROOT_CAS", "FIELD_SERVER_TRANSACTION_ID", "FIELD_STRIPE_JS", "FIELD_THREE_D_SECURE_2_INTENT", "FIELD_THREE_D_SECURE_2_SOURCE", "FIELD_TYPE", "TYPE_3DS1", "TYPE_3DS2", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0030  */
        private final StripeIntent.a.j.Use3DS2.DirectoryServerEncryption c(JSONObject json) {
            List listM;
            List listA = t30.e.f112281a.a(json.optJSONArray("root_certificate_authorities"));
            if (listA != null) {
                listM = p013kotlin.collections.v.m();
                for (Object obj : listA) {
                    if (obj instanceof String) {
                        listM = p013kotlin.collections.v.Q0(listM, obj);
                    }
                }
                if (listM == null) {
                    listM = p013kotlin.collections.v.m();
                }
            } else {
                listM = p013kotlin.collections.v.m();
            }
            String strOptString = json.optString("directory_server_id");
            p013kotlin.jvm.internal.s.j(strOptString, "optString(...)");
            String strOptString2 = json.optString("certificate");
            p013kotlin.jvm.internal.s.j(strOptString2, "optString(...)");
            return new StripeIntent.a.j.Use3DS2.DirectoryServerEncryption(strOptString, strOptString2, listM, json.optString("key_id"));
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.j a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            String strL = t30.e.l(json, "type");
            if (p013kotlin.jvm.internal.s.f(strL, "three_d_secure_redirect")) {
                String strOptString = json.optString("stripe_js");
                p013kotlin.jvm.internal.s.j(strOptString, "optString(...)");
                return new StripeIntent.a.j.Use3DS1(strOptString);
            }
            if (!p013kotlin.jvm.internal.s.f(strL, "stripe_3ds2_fingerprint")) {
                return null;
            }
            String strOptString2 = json.optString("three_d_secure_2_source");
            p013kotlin.jvm.internal.s.j(strOptString2, "optString(...)");
            String strOptString3 = json.optString("directory_server_name");
            p013kotlin.jvm.internal.s.j(strOptString3, "optString(...)");
            String strOptString4 = json.optString("server_transaction_id");
            p013kotlin.jvm.internal.s.j(strOptString4, "optString(...)");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("directory_server_encryption");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            return new StripeIntent.a.j.Use3DS2(strOptString2, strOptString3, strOptString4, c(jSONObjectOptJSONObject), t30.e.l(json, "three_d_secure_2_intent"), t30.e.l(json, "publishable_key"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx60/t$k;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$k;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$k;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements u30.a<StripeIntent.a.SwishRedirect> {
        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.SwishRedirect a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            String strOptString = json.optString("mobile_auth_url");
            p013kotlin.jvm.internal.s.j(strOptString, "optString(...)");
            return new StripeIntent.a.SwishRedirect(strOptString);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx60/t$l;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$l;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$l;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements u30.a<StripeIntent.a.l> {
        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.l a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return StripeIntent.a.l.f51041a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lx60/t$m;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$m;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "Lcom/stripe/android/model/r0;", "c", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/r0;", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$m;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements u30.a<StripeIntent.a.VerifyWithMicrodeposits> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122880b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx60/t$m$a;", "", "<init>", "()V", "", "ARRIVAL_DATE", "Ljava/lang/String;", "HOSTED_VERIFICATION_URL", "MICRODEPOSIT_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private final r0 c(JSONObject json) {
            r0 next;
            Iterator<r0> it = r0.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p013kotlin.jvm.internal.s.f(next.getValue(), json.optString("microdeposit_type")));
            r0 r0Var = next;
            return r0Var == null ? r0.UNKNOWN : r0Var;
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.VerifyWithMicrodeposits a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            long jOptLong = json.optLong("arrival_date");
            String strOptString = json.optString("hosted_verification_url");
            p013kotlin.jvm.internal.s.j(strOptString, "optString(...)");
            return new StripeIntent.a.VerifyWithMicrodeposits(jOptLong, strOptString, c(json));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/t$n;", "Lu30/a;", "Lcom/stripe/android/model/StripeIntent$a$n;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$a$n;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n implements u30.a<StripeIntent.a.WeChatPayRedirect> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122881b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lx60/t$n$a;", "", "<init>", "()V", "", "APP_ID", "Ljava/lang/String;", "NONCE_STR", "PACKAGE", "PARTNER_ID", "PREPAY_ID", "SIGN", "TIMESTAMP", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StripeIntent.a.WeChatPayRedirect a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new StripeIntent.a.WeChatPayRedirect(new WeChat(null, json.optString("app_id"), json.optString("nonce_str"), json.optString("package"), json.optString("partner_id"), json.optString("prepay_id"), json.optString("sign"), json.optString("timestamp"), null, EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, null));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122882a;

        static {
            int[] iArr = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayBoletoDetails.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayKonbiniDetails.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayMultibancoDetails.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StripeIntent.NextActionType.UpiAwaitNotification.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StripeIntent.NextActionType.CashAppRedirect.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StripeIntent.NextActionType.SwishRedirect.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f122882a = iArr;
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public StripeIntent.a a(JSONObject json) {
        u30.a hVar;
        p013kotlin.jvm.internal.s.k(json, "json");
        StripeIntent.NextActionType nextActionTypeA = StripeIntent.NextActionType.INSTANCE.a(json.optString("type"));
        switch (nextActionTypeA == null ? -1 : o.f122882a[nextActionTypeA.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                hVar = new h();
                break;
            case 2:
                hVar = new e();
                break;
            case 3:
                hVar = new f();
                break;
            case 4:
                hVar = new g();
                break;
            case 5:
                hVar = new i();
                break;
            case 6:
                hVar = new j();
                break;
            case 7:
                hVar = new a();
                break;
            case 8:
                hVar = new b();
                break;
            case 9:
                hVar = new n();
                break;
            case 10:
                hVar = new m();
                break;
            case 11:
                hVar = new l();
                break;
            case 12:
                hVar = new c();
                break;
            case 13:
                hVar = new k();
                break;
        }
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(nextActionTypeA.getCode());
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return (StripeIntent.a) hVar.a(jSONObjectOptJSONObject);
    }
}
