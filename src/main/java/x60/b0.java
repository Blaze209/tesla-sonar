package x60;

import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.paymentmethod.EPSPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.IdealPaymentMethod;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.Address;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceOrder;
import com.stripe.android.model.SourceTypeModel;
import com.stripe.android.model.WeChat;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\n\t\u0007\u000b\f\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lx60/b0;", "Lu30/a;", "Lcom/stripe/android/model/Source;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "c", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;", "b", "a", DateTokenConverter.CONVERTER_KEY, "e", "f", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b0 implements u30.a<Source> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f122817b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f122818c = d1.i("card", "sepa_debit");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/b0$a;", "Lu30/a;", "Lcom/stripe/android/model/Source$CodeVerification;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$CodeVerification;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements u30.a<Source.CodeVerification> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final C2648a f122819b = new C2648a(null);

        /* JADX INFO: renamed from: x60.b0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx60/b0$a$a;", "", "<init>", "()V", "", "FIELD_ATTEMPTS_REMAINING", "Ljava/lang/String;", "FIELD_STATUS", "", "INVALID_ATTEMPTS_REMAINING", "I", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class C2648a {
            public /* synthetic */ C2648a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2648a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Source.CodeVerification a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new Source.CodeVerification(json.optInt("attempts_remaining", -1), Source.CodeVerification.Status.INSTANCE.a(t30.e.l(json, PermissionsResponse.STATUS_KEY)));
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u000fR\u0014\u0010!\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u000fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u000fR\u0014\u0010&\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lx60/b0$b;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Lcom/stripe/android/model/Source;", DateTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;", "e", "", "sourceType", "c", "(Ljava/lang/String;)Ljava/lang/String;", "FIELD_AMOUNT", "Ljava/lang/String;", "FIELD_CLIENT_SECRET", "FIELD_CODE_VERIFICATION", "FIELD_CREATED", "FIELD_CURRENCY", "FIELD_FLOW", "FIELD_ID", "FIELD_KLARNA", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_OWNER", "FIELD_RECEIVER", "FIELD_REDIRECT", "FIELD_SOURCE_ORDER", "FIELD_STATEMENT_DESCRIPTOR", "FIELD_STATUS", "FIELD_TYPE", "FIELD_USAGE", "FIELD_WECHAT", "", "MODELED_TYPES", "Ljava/util/Set;", "VALUE_CARD", "VALUE_SOURCE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private final String c(String sourceType) {
            if (sourceType != null) {
                switch (sourceType.hashCode()) {
                    case -1920743119:
                        if (sourceType.equals("bancontact")) {
                            return "bancontact";
                        }
                        break;
                    case -1414960566:
                        if (sourceType.equals("alipay")) {
                            return "alipay";
                        }
                        break;
                    case -1128905083:
                        if (sourceType.equals("klarna")) {
                            return "klarna";
                        }
                        break;
                    case -896955097:
                        if (sourceType.equals("sofort")) {
                            return "sofort";
                        }
                        break;
                    case -825238221:
                        if (sourceType.equals("three_d_secure")) {
                            return "three_d_secure";
                        }
                        break;
                    case -791770330:
                        if (sourceType.equals(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE)) {
                            return ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE;
                        }
                        break;
                    case -284840886:
                        sourceType.equals("unknown");
                        break;
                    case 100648:
                        if (sourceType.equals(EPSPaymentMethod.PAYMENT_METHOD_TYPE)) {
                            return EPSPaymentMethod.PAYMENT_METHOD_TYPE;
                        }
                        break;
                    case 109234:
                        if (sourceType.equals("p24")) {
                            return "p24";
                        }
                        break;
                    case 3046160:
                        if (sourceType.equals("card")) {
                            return "card";
                        }
                        break;
                    case 38358441:
                        if (sourceType.equals("giropay")) {
                            return "giropay";
                        }
                        break;
                    case 100048981:
                        if (sourceType.equals(IdealPaymentMethod.PAYMENT_METHOD_TYPE)) {
                            return IdealPaymentMethod.PAYMENT_METHOD_TYPE;
                        }
                        break;
                    case 1251821346:
                        if (sourceType.equals("multibanco")) {
                            return "multibanco";
                        }
                        break;
                    case 1636477296:
                        if (sourceType.equals("sepa_debit")) {
                            return "sepa_debit";
                        }
                        break;
                }
            }
            return "unknown";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Source d(JSONObject jsonObject) {
            return new Source(t30.e.l(jsonObject, "id"), null, null, null, null, null, null, null, null, null, null, null, null, new a0().a(jsonObject), "card", "card", null, null, null, null, null, 2039806, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:102:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:104:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:106:0x0201  */
        /* JADX WARN: Code duplicated, block: B:109:0x020c  */
        /* JADX WARN: Code duplicated, block: B:111:0x0219  */
        /* JADX WARN: Code duplicated, block: B:113:0x0223  */
        /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:57:0x0108  */
        /* JADX WARN: Code duplicated, block: B:78:0x016e  */
        /* JADX WARN: Code duplicated, block: B:79:0x0170  */
        /* JADX WARN: Code duplicated, block: B:81:0x0176  */
        /* JADX WARN: Code duplicated, block: B:82:0x0183  */
        /* JADX WARN: Code duplicated, block: B:88:0x018f  */
        /* JADX WARN: Code duplicated, block: B:89:0x0191  */
        /* JADX WARN: Code duplicated, block: B:91:0x0197  */
        /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:98:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:99:0x01c0  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final Source e(JSONObject jsonObject) {
            SourceTypeModel sourceTypeModel;
            Source.CodeVerification codeVerificationA;
            Source.Owner ownerA;
            JSONObject jSONObjectOptJSONObject;
            Source.Receiver receiverA;
            JSONObject jSONObjectOptJSONObject2;
            Source.Redirect redirectA;
            JSONObject jSONObjectOptJSONObject3;
            SourceOrder sourceOrderA;
            WeChat weChatA;
            Source.Klarna klarnaA;
            JSONObject jSONObjectOptJSONObject4;
            JSONObject jSONObjectOptJSONObject5;
            Parcelable parcelableA;
            JSONObject jSONObjectOptJSONObject6;
            JSONObject jSONObjectOptJSONObject7;
            JSONObject jSONObjectOptJSONObject8;
            JSONObject jSONObjectOptJSONObject9;
            JSONObject jSONObjectOptJSONObject10;
            SourceTypeModel sourceTypeModel2;
            JSONObject jSONObjectOptJSONObject11;
            String strL = t30.e.l(jsonObject, "type");
            if (strL == null) {
                strL = "unknown";
            }
            String strC = c(strL);
            t30.e eVar = t30.e.f112281a;
            Map mapB = eVar.b(jsonObject.optJSONObject(strL));
            if (b0.f122818c.contains(strL)) {
                if (jsonObject.has(strL)) {
                    switch (strL.hashCode()) {
                        case -808719889:
                            if (!strL.equals("receiver") || (jSONObjectOptJSONObject6 = jsonObject.optJSONObject("receiver")) == null) {
                                parcelableA = null;
                            } else {
                                p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject6);
                                parcelableA = new e().a(jSONObjectOptJSONObject6);
                            }
                            break;
                        case -776144932:
                            if (!strL.equals(RedirectAction.ACTION_TYPE) || (jSONObjectOptJSONObject7 = jsonObject.optJSONObject(RedirectAction.ACTION_TYPE)) == null) {
                                parcelableA = null;
                            } else {
                                p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject7);
                                parcelableA = new f().a(jSONObjectOptJSONObject7);
                            }
                            break;
                        case 3046160:
                            if (!strL.equals("card") || (jSONObjectOptJSONObject8 = jsonObject.optJSONObject("card")) == null) {
                                parcelableA = null;
                            } else {
                                p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject8);
                                parcelableA = new a0().a(jSONObjectOptJSONObject8);
                            }
                            break;
                        case 106164915:
                            if (!strL.equals("owner") || (jSONObjectOptJSONObject9 = jsonObject.optJSONObject("owner")) == null) {
                                parcelableA = null;
                            } else {
                                p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject9);
                                parcelableA = new d().a(jSONObjectOptJSONObject9);
                            }
                            break;
                        case 1615551277:
                            if (!strL.equals("code_verification") || (jSONObjectOptJSONObject10 = jsonObject.optJSONObject("code_verification")) == null) {
                                parcelableA = null;
                            } else {
                                p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject10);
                                parcelableA = new a().a(jSONObjectOptJSONObject10);
                            }
                            break;
                        case 1636477296:
                            if (!strL.equals("sepa_debit") || (jSONObjectOptJSONObject11 = jsonObject.optJSONObject("sepa_debit")) == null) {
                                parcelableA = null;
                            } else {
                                p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject11);
                                parcelableA = new d0().a(jSONObjectOptJSONObject11);
                            }
                            break;
                        default:
                            parcelableA = null;
                            break;
                    }
                    if (!(parcelableA instanceof SourceTypeModel)) {
                        parcelableA = null;
                    }
                    sourceTypeModel2 = (SourceTypeModel) parcelableA;
                } else {
                    sourceTypeModel2 = null;
                }
                sourceTypeModel = sourceTypeModel2;
            } else {
                sourceTypeModel = null;
            }
            String strL2 = t30.e.l(jsonObject, "id");
            Long lJ = eVar.j(jsonObject, "amount");
            String strL3 = t30.e.l(jsonObject, "client_secret");
            if (jsonObject.has("code_verification")) {
                JSONObject jSONObjectOptJSONObject12 = jsonObject.optJSONObject("code_verification");
                if (jSONObjectOptJSONObject12 != null) {
                    p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject12);
                    codeVerificationA = new a().a(jSONObjectOptJSONObject12);
                } else {
                    codeVerificationA = null;
                }
                if (!(codeVerificationA instanceof Source.CodeVerification)) {
                    codeVerificationA = null;
                }
            } else {
                codeVerificationA = null;
            }
            Long lJ2 = eVar.j(jsonObject, "created");
            String strL4 = t30.e.l(jsonObject, "currency");
            Source.Flow flowA = Source.Flow.INSTANCE.a(t30.e.l(jsonObject, AnalyticsContext.Flow));
            boolean zOptBoolean = jsonObject.optBoolean("livemode");
            if (jsonObject.has("owner")) {
                JSONObject jSONObjectOptJSONObject13 = jsonObject.optJSONObject("owner");
                if (jSONObjectOptJSONObject13 != null) {
                    p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject13);
                    ownerA = new d().a(jSONObjectOptJSONObject13);
                } else {
                    ownerA = null;
                }
                if (!(ownerA instanceof Source.Owner)) {
                }
                if (jsonObject.has("receiver")) {
                    jSONObjectOptJSONObject = jsonObject.optJSONObject("receiver");
                    if (jSONObjectOptJSONObject != null) {
                        p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject);
                        receiverA = new e().a(jSONObjectOptJSONObject);
                    } else {
                        receiverA = null;
                    }
                    if (!(receiverA instanceof Source.Receiver)) {
                        receiverA = null;
                    }
                } else {
                    receiverA = null;
                }
                if (jsonObject.has(RedirectAction.ACTION_TYPE)) {
                    jSONObjectOptJSONObject2 = jsonObject.optJSONObject(RedirectAction.ACTION_TYPE);
                    if (jSONObjectOptJSONObject2 != null) {
                        p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject2);
                        redirectA = new f().a(jSONObjectOptJSONObject2);
                    } else {
                        redirectA = null;
                    }
                    if (!(redirectA instanceof Source.Redirect)) {
                        redirectA = null;
                    }
                } else {
                    redirectA = null;
                }
                jSONObjectOptJSONObject3 = jsonObject.optJSONObject("source_order");
                Source.Owner owner = ownerA;
                if (jSONObjectOptJSONObject3 != null) {
                    sourceOrderA = new c0().a(jSONObjectOptJSONObject3);
                } else {
                    sourceOrderA = null;
                }
                String strL5 = t30.e.l(jsonObject, "statement_descriptor");
                Source.Status statusA = Source.Status.INSTANCE.a(t30.e.l(jsonObject, PermissionsResponse.STATUS_KEY));
                Source.Usage usageA = Source.Usage.INSTANCE.a(t30.e.l(jsonObject, "usage"));
                if (p013kotlin.jvm.internal.s.f(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE, strC)) {
                    h0 h0Var = new h0();
                    jSONObjectOptJSONObject5 = jsonObject.optJSONObject(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE);
                    if (jSONObjectOptJSONObject5 == null) {
                        jSONObjectOptJSONObject5 = new JSONObject();
                    }
                    weChatA = h0Var.a(jSONObjectOptJSONObject5);
                } else {
                    weChatA = null;
                }
                if (p013kotlin.jvm.internal.s.f("klarna", strC)) {
                    c cVar = new c();
                    jSONObjectOptJSONObject4 = jsonObject.optJSONObject("klarna");
                    if (jSONObjectOptJSONObject4 == null) {
                        jSONObjectOptJSONObject4 = new JSONObject();
                    }
                    klarnaA = cVar.a(jSONObjectOptJSONObject4);
                } else {
                    klarnaA = null;
                }
                return new Source(strL2, lJ, strL3, codeVerificationA, lJ2, strL4, flowA, Boolean.valueOf(zOptBoolean), owner, receiverA, redirectA, statusA, mapB, sourceTypeModel, strC, strL, usageA, weChatA, klarnaA, sourceOrderA, strL5);
            }
            strL = strL;
            ownerA = null;
            if (jsonObject.has("receiver")) {
                jSONObjectOptJSONObject = jsonObject.optJSONObject("receiver");
                if (jSONObjectOptJSONObject != null) {
                    p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject);
                    receiverA = new e().a(jSONObjectOptJSONObject);
                } else {
                    receiverA = null;
                }
                if (!(receiverA instanceof Source.Receiver)) {
                    receiverA = null;
                }
            } else {
                receiverA = null;
            }
            if (jsonObject.has(RedirectAction.ACTION_TYPE)) {
                jSONObjectOptJSONObject2 = jsonObject.optJSONObject(RedirectAction.ACTION_TYPE);
                if (jSONObjectOptJSONObject2 != null) {
                    p013kotlin.jvm.internal.s.h(jSONObjectOptJSONObject2);
                    redirectA = new f().a(jSONObjectOptJSONObject2);
                } else {
                    redirectA = null;
                }
                if (!(redirectA instanceof Source.Redirect)) {
                    redirectA = null;
                }
            } else {
                redirectA = null;
            }
            jSONObjectOptJSONObject3 = jsonObject.optJSONObject("source_order");
            Source.Owner owner2 = ownerA;
            if (jSONObjectOptJSONObject3 != null) {
                sourceOrderA = new c0().a(jSONObjectOptJSONObject3);
            } else {
                sourceOrderA = null;
            }
            String strL6 = t30.e.l(jsonObject, "statement_descriptor");
            Source.Status statusA2 = Source.Status.INSTANCE.a(t30.e.l(jsonObject, PermissionsResponse.STATUS_KEY));
            Source.Usage usageA2 = Source.Usage.INSTANCE.a(t30.e.l(jsonObject, "usage"));
            if (p013kotlin.jvm.internal.s.f(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE, strC)) {
                h0 h0Var2 = new h0();
                jSONObjectOptJSONObject5 = jsonObject.optJSONObject(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE);
                if (jSONObjectOptJSONObject5 == null) {
                    jSONObjectOptJSONObject5 = new JSONObject();
                }
                weChatA = h0Var2.a(jSONObjectOptJSONObject5);
            } else {
                weChatA = null;
            }
            if (p013kotlin.jvm.internal.s.f("klarna", strC)) {
                c cVar2 = new c();
                jSONObjectOptJSONObject4 = jsonObject.optJSONObject("klarna");
                if (jSONObjectOptJSONObject4 == null) {
                    jSONObjectOptJSONObject4 = new JSONObject();
                }
                klarnaA = cVar2.a(jSONObjectOptJSONObject4);
            } else {
                klarnaA = null;
            }
            return new Source(strL2, lJ, strL3, codeVerificationA, lJ2, strL4, flowA, Boolean.valueOf(zOptBoolean), owner2, receiverA, redirectA, statusA2, mapB, sourceTypeModel, strC, strL, usageA2, weChatA, klarnaA, sourceOrderA, strL6);
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lx60/b0$c;", "Lu30/a;", "Lcom/stripe/android/model/Source$c;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "", Action.KEY_ATTRIBUTE, "", "c", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Set;", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$c;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements u30.a<Source.Klarna> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122820b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Lx60/b0$c$a;", "", "<init>", "()V", "", "FIELD_CLIENT_TOKEN", "Ljava/lang/String;", "FIELD_CUSTOM_PAYMENT_METHODS", "FIELD_FIRST_NAME", "FIELD_LAST_NAME", "FIELD_PAYMENT_METHOD_CATEGORIES", "FIELD_PAY_LATER_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_LATER_ASSET_URLS_STANDARD", "FIELD_PAY_LATER_NAME", "FIELD_PAY_LATER_REDIRECT_URL", "FIELD_PAY_NOW_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_NOW_ASSET_URLS_STANDARD", "FIELD_PAY_NOW_NAME", "FIELD_PAY_NOW_REDIRECT_URL", "FIELD_PAY_OVER_TIME_ASSET_URLS_DESCRIPTIVE", "FIELD_PAY_OVER_TIME_ASSET_URLS_STANDARD", "FIELD_PAY_OVER_TIME_NAME", "FIELD_PAY_OVER_TIME_REDIRECT_URL", "FIELD_PURCHASE_COUNTRY", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private final Set<String> c(JSONObject json, String key) {
            List listF1;
            String strL = t30.e.l(json, key);
            Set<String> setR1 = (strL == null || (listF1 = p013kotlin.text.t.f1(strL, new String[]{","}, false, 0, 6, null)) == null) ? null : p013kotlin.collections.v.r1(listF1);
            return setR1 == null ? d1.d() : setR1;
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Source.Klarna a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new Source.Klarna(t30.e.l(json, "first_name"), t30.e.l(json, "last_name"), t30.e.l(json, "purchase_country"), t30.e.l(json, "client_token"), t30.e.l(json, "pay_now_asset_urls_descriptive"), t30.e.l(json, "pay_now_asset_urls_standard"), t30.e.l(json, "pay_now_name"), t30.e.l(json, "pay_now_redirect_url"), t30.e.l(json, "pay_later_asset_urls_descriptive"), t30.e.l(json, "pay_later_asset_urls_standard"), t30.e.l(json, "pay_later_name"), t30.e.l(json, "pay_later_redirect_url"), t30.e.l(json, "pay_over_time_asset_urls_descriptive"), t30.e.l(json, "pay_over_time_asset_urls_standard"), t30.e.l(json, "pay_over_time_name"), t30.e.l(json, "pay_over_time_redirect_url"), c(json, "payment_method_categories"), c(json, "custom_payment_methods"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/b0$d;", "Lu30/a;", "Lcom/stripe/android/model/Source$d;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$d;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements u30.a<Source.Owner> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122821b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lx60/b0$d$a;", "", "<init>", "()V", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PHONE", "FIELD_VERIFIED_ADDRESS", "FIELD_VERIFIED_EMAIL", "FIELD_VERIFIED_NAME", "FIELD_VERIFIED_PHONE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Source.Owner a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(PlaceTypes.ADDRESS);
            Address addressA = jSONObjectOptJSONObject != null ? new x60.b().a(jSONObjectOptJSONObject) : null;
            String strL = t30.e.l(json, Scopes.EMAIL);
            String strL2 = t30.e.l(json, "name");
            String strL3 = t30.e.l(json, "phone");
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("verified_address");
            return new Source.Owner(addressA, strL, strL2, strL3, jSONObjectOptJSONObject2 != null ? new x60.b().a(jSONObjectOptJSONObject2) : null, t30.e.l(json, "verified_email"), t30.e.l(json, "verified_name"), t30.e.l(json, "verified_phone"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/b0$e;", "Lu30/a;", "Lcom/stripe/android/model/Source$e;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$e;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements u30.a<Source.Receiver> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122822b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lx60/b0$e$a;", "", "<init>", "()V", "", "FIELD_ADDRESS", "Ljava/lang/String;", "FIELD_AMOUNT_CHARGED", "FIELD_AMOUNT_RECEIVED", "FIELD_AMOUNT_RETURNED", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Source.Receiver a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new Source.Receiver(t30.e.l(json, PlaceTypes.ADDRESS), json.optLong("amount_charged"), json.optLong("amount_received"), json.optLong("amount_returned"));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/b0$f;", "Lu30/a;", "Lcom/stripe/android/model/Source$Redirect;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Redirect;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements u30.a<Source.Redirect> {
        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Source.Redirect a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new Source.Redirect(t30.e.l(json, "return_url"), Source.Redirect.Status.INSTANCE.a(t30.e.l(json, PermissionsResponse.STATUS_KEY)), t30.e.l(json, ImagesContract.URL));
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Source a(JSONObject json) {
        p013kotlin.jvm.internal.s.k(json, "json");
        String strOptString = json.optString("object");
        if (p013kotlin.jvm.internal.s.f(strOptString, "card")) {
            return f122817b.d(json);
        }
        if (p013kotlin.jvm.internal.s.f(strOptString, "source")) {
            return f122817b.e(json);
        }
        return null;
    }
}
