package com.adyen.checkout.components.core.action;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/components/core/action/Action;", "Lcom/adyen/checkout/core/internal/data/model/b;", "<init>", "()V", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "type", "getPaymentData", "setPaymentData", "paymentData", "getPaymentMethodType", "setPaymentMethodType", Action.PAYMENT_METHOD_TYPE, "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Action extends b {
    public static final String PAYMENT_DATA = "paymentData";
    public static final String PAYMENT_METHOD_TYPE = "paymentMethodType";
    public static final String TYPE = "type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final b.a<Action> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/action/Action$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/action/Action;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/action/Action;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/action/Action;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<Action> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Action b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString("type");
            s.h(strOptString);
            if (strOptString.length() != 0) {
                return (Action) Action.INSTANCE.a(strOptString).b(jsonObject);
            }
            throw new CheckoutException("Action type not found", null, 2, null);
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(Action modelObject) {
            s.k(modelObject, "modelObject");
            String type = modelObject.getType();
            if (type == null || type.length() == 0) {
                throw new CheckoutException("Action type not found", null, 2, null);
            }
            return Action.INSTANCE.a(type).a(modelObject);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.action.Action$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/components/core/action/Action$b;", "", "<init>", "()V", "", "actionType", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/action/Action;", "a", "(Ljava/lang/String;)Lcom/adyen/checkout/core/internal/data/model/b$a;", "PAYMENT_DATA", "Ljava/lang/String;", "PAYMENT_METHOD_TYPE", "SERIALIZER", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "TYPE", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        
            if (r4.equals("nativeRedirect") != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        
            if (r4.equals(com.adyen.checkout.components.core.action.RedirectAction.ACTION_TYPE) != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        
            r4 = com.adyen.checkout.components.core.action.RedirectAction.SERIALIZER;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.adyen.checkout.core.internal.data.model.b.a<com.adyen.checkout.components.core.action.Action> a(java.lang.String r4) {
            /*
                r3 = this;
                java.lang.String r0 = "actionType"
                p013kotlin.jvm.internal.s.k(r4, r0)
                int r0 = r4.hashCode()
                switch(r0) {
                    case -952485970: goto L64;
                    case -776144932: goto L59;
                    case -374364909: goto L50;
                    case 113722: goto L45;
                    case 93223254: goto L3a;
                    case 640192174: goto L2f;
                    case 1021099710: goto L24;
                    case 1337458815: goto L19;
                    case 1473713957: goto Le;
                    default: goto Lc;
                }
            Lc:
                goto L74
            Le:
                java.lang.String r0 = "threeDS2"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L74
                com.adyen.checkout.core.internal.data.model.b$a<com.adyen.checkout.components.core.action.Threeds2Action> r4 = com.adyen.checkout.components.core.action.Threeds2Action.SERIALIZER
                goto L6e
            L19:
                java.lang.String r0 = "threeDS2Fingerprint"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L74
                com.adyen.checkout.core.internal.data.model.b$a<com.adyen.checkout.components.core.action.Threeds2FingerprintAction> r4 = com.adyen.checkout.components.core.action.Threeds2FingerprintAction.SERIALIZER
                goto L6e
            L24:
                java.lang.String r0 = "threeDS2Challenge"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L74
                com.adyen.checkout.core.internal.data.model.b$a<com.adyen.checkout.components.core.action.Threeds2ChallengeAction> r4 = com.adyen.checkout.components.core.action.Threeds2ChallengeAction.SERIALIZER
                goto L6e
            L2f:
                java.lang.String r0 = "voucher"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L74
                com.adyen.checkout.core.internal.data.model.b$a<com.adyen.checkout.components.core.action.VoucherAction> r4 = com.adyen.checkout.components.core.action.VoucherAction.SERIALIZER
                goto L6e
            L3a:
                java.lang.String r0 = "await"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L74
                com.adyen.checkout.core.internal.data.model.b$a<com.adyen.checkout.components.core.action.AwaitAction> r4 = com.adyen.checkout.components.core.action.AwaitAction.SERIALIZER
                goto L6e
            L45:
                java.lang.String r0 = "sdk"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L74
                com.adyen.checkout.core.internal.data.model.b$a<com.adyen.checkout.components.core.action.SdkAction<?>> r4 = com.adyen.checkout.components.core.action.SdkAction.SERIALIZER
                goto L6e
            L50:
                java.lang.String r0 = "nativeRedirect"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L74
                goto L61
            L59:
                java.lang.String r0 = "redirect"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L74
            L61:
                com.adyen.checkout.core.internal.data.model.b$a<com.adyen.checkout.components.core.action.RedirectAction> r4 = com.adyen.checkout.components.core.action.RedirectAction.SERIALIZER
                goto L6e
            L64:
                java.lang.String r0 = "qrCode"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L74
                com.adyen.checkout.core.internal.data.model.b$a<com.adyen.checkout.components.core.action.QrCodeAction> r4 = com.adyen.checkout.components.core.action.QrCodeAction.SERIALIZER
            L6e:
                java.lang.String r0 = "null cannot be cast to non-null type com.adyen.checkout.core.internal.data.model.ModelObject.Serializer<com.adyen.checkout.components.core.action.Action>"
                p013kotlin.jvm.internal.s.i(r4, r0)
                return r4
            L74:
                com.adyen.checkout.core.exception.CheckoutException r0 = new com.adyen.checkout.core.exception.CheckoutException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Action type not found - "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r1 = 2
                r2 = 0
                r0.<init>(r4, r2, r1, r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.action.Action.Companion.a(java.lang.String):com.adyen.checkout.core.internal.data.model.b$a");
        }

        private Companion() {
        }
    }

    public abstract String getPaymentData();

    public abstract String getPaymentMethodType();

    public abstract String getType();

    public abstract void setPaymentData(String str);

    public abstract void setPaymentMethodType(String str);

    public abstract void setType(String str);
}
