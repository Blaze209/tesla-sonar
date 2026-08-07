package com.adyen.checkout.components.core.action;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$%BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018¨\u0006&"}, d2 = {"Lcom/adyen/checkout/components/core/action/Threeds2Action;", "Lcom/adyen/checkout/components/core/action/BaseThreeds2Action;", "", "type", "paymentData", Action.PAYMENT_METHOD_TYPE, Threeds2Action.TOKEN, Threeds2Action.SUBTYPE, Threeds2Action.AUTHORISATION_TOKEN, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getPaymentData", "setPaymentData", "getPaymentMethodType", "setPaymentMethodType", "getToken", "setToken", "getSubtype", "setSubtype", "getAuthorisationToken", "setAuthorisationToken", "Companion", "b", DateTokenConverter.CONVERTER_KEY, "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Threeds2Action extends BaseThreeds2Action {
    public static final String ACTION_TYPE = "threeDS2";
    private static final String AUTHORISATION_TOKEN = "authorisationToken";
    private static final String SUBTYPE = "subtype";
    private static final String TOKEN = "token";
    private String authorisationToken;
    private String paymentData;
    private String paymentMethodType;
    private String subtype;
    private String token;
    private String type;
    public static final Parcelable.Creator<Threeds2Action> CREATOR = new c();
    public static final b.a<Threeds2Action> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/action/Threeds2Action$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/action/Threeds2Action;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/action/Threeds2Action;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/action/Threeds2Action;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<Threeds2Action> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Threeds2Action b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                return new Threeds2Action(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "paymentData"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Action.PAYMENT_METHOD_TYPE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Threeds2Action.TOKEN), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Threeds2Action.SUBTYPE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Threeds2Action.AUTHORISATION_TOKEN));
            } catch (JSONException e11) {
                throw new ModelSerializationException(Threeds2Action.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(Threeds2Action modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt(Threeds2Action.TOKEN, modelObject.getToken());
                jSONObject.putOpt(Threeds2Action.SUBTYPE, modelObject.getSubtype());
                jSONObject.putOpt(Threeds2Action.AUTHORISATION_TOKEN, modelObject.getAuthorisationToken());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Threeds2Action.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<Threeds2Action> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Threeds2Action createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new Threeds2Action(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Threeds2Action[] newArray(int i11) {
            return new Threeds2Action[i11];
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/action/Threeds2Action$d;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "FINGERPRINT", "CHALLENGE", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum d {
        FINGERPRINT("fingerprint"),
        CHALLENGE(ClientData.KEY_CHALLENGE);

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.adyen.checkout.components.core.action.Threeds2Action$d$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/components/core/action/Threeds2Action$d$a;", "", "<init>", "()V", "", "value", "Lcom/adyen/checkout/components/core/action/Threeds2Action$d;", "a", "(Ljava/lang/String;)Lcom/adyen/checkout/components/core/action/Threeds2Action$d;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String value) {
                s.k(value, "value");
                d dVar = d.FINGERPRINT;
                if (s.f(value, dVar.getValue())) {
                    return dVar;
                }
                d dVar2 = d.CHALLENGE;
                if (s.f(value, dVar2.getValue())) {
                    return dVar2;
                }
                throw new IllegalArgumentException("No Subtype matches the value of: " + value);
            }

            private Companion() {
            }
        }

        d(String str) {
            this.value = str;
        }

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }

        public static final d parse(String str) {
            return INSTANCE.a(str);
        }

        public final String getValue() {
            return this.value;
        }
    }

    public Threeds2Action() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAuthorisationToken() {
        return this.authorisationToken;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public String getPaymentData() {
        return this.paymentData;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getToken() {
        return this.token;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public String getType() {
        return this.type;
    }

    public final void setAuthorisationToken(String str) {
        this.authorisationToken = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentData(String str) {
        this.paymentData = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentMethodType(String str) {
        this.paymentMethodType = str;
    }

    public final void setSubtype(String str) {
        this.subtype = str;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setType(String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.paymentData);
        parcel.writeString(this.paymentMethodType);
        parcel.writeString(this.token);
        parcel.writeString(this.subtype);
        parcel.writeString(this.authorisationToken);
    }

    public /* synthetic */ Threeds2Action(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public Threeds2Action(String str, String str2, String str3, String str4, String str5, String str6) {
        this.type = str;
        this.paymentData = str2;
        this.paymentMethodType = str3;
        this.token = str4;
        this.subtype = str5;
        this.authorisationToken = str6;
    }
}
