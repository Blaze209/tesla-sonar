package com.adyen.checkout.adyen3ds2.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0001%B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\f¨\u0006&"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResponse;", "Lcom/adyen/checkout/core/internal/data/model/b;", "Lcom/adyen/checkout/components/core/action/Action;", SubmitFingerprintResponse.ACTION, "", "type", "details", "<init>", "(Lcom/adyen/checkout/components/core/action/Action;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/adyen/checkout/components/core/action/Action;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/adyen/checkout/components/core/action/Action;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/adyen/checkout/components/core/action/Action;", "getAction", "Ljava/lang/String;", "getType", "getDetails", "Companion", "b", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SubmitFingerprintResponse extends b {
    private static final String ACTION = "action";
    private static final String DETAILS = "details";
    private static final String TYPE = "type";
    private final Action action;
    private final String details;
    private final String type;
    public static final Parcelable.Creator<SubmitFingerprintResponse> CREATOR = new c();
    public static final b.a<SubmitFingerprintResponse> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResponse$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResponse;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResponse;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintResponse;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SubmitFingerprintResponse> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SubmitFingerprintResponse b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                return new SubmitFingerprintResponse((Action) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SubmitFingerprintResponse.ACTION), Action.SERIALIZER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "details"));
            } catch (JSONException e11) {
                throw new ModelSerializationException(SubmitFingerprintResponse.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SubmitFingerprintResponse modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SubmitFingerprintResponse.ACTION, modelObject.getAction());
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("details", modelObject.getDetails());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SubmitFingerprintResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SubmitFingerprintResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SubmitFingerprintResponse createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SubmitFingerprintResponse((Action) parcel.readParcelable(SubmitFingerprintResponse.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SubmitFingerprintResponse[] newArray(int i11) {
            return new SubmitFingerprintResponse[i11];
        }
    }

    public SubmitFingerprintResponse(Action action, String str, String str2) {
        this.action = action;
        this.type = str;
        this.details = str2;
    }

    public static /* synthetic */ SubmitFingerprintResponse copy$default(SubmitFingerprintResponse submitFingerprintResponse, Action action, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = submitFingerprintResponse.action;
        }
        if ((i11 & 2) != 0) {
            str = submitFingerprintResponse.type;
        }
        if ((i11 & 4) != 0) {
            str2 = submitFingerprintResponse.details;
        }
        return submitFingerprintResponse.copy(action, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    public final SubmitFingerprintResponse copy(Action action, String type, String details) {
        return new SubmitFingerprintResponse(action, type, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitFingerprintResponse)) {
            return false;
        }
        SubmitFingerprintResponse submitFingerprintResponse = (SubmitFingerprintResponse) other;
        return s.f(this.action, submitFingerprintResponse.action) && s.f(this.type, submitFingerprintResponse.type) && s.f(this.details, submitFingerprintResponse.details);
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Action action = this.action;
        int iHashCode = (action == null ? 0 : action.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.details;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SubmitFingerprintResponse(action=" + this.action + ", type=" + this.type + ", details=" + this.details + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeParcelable(this.action, flags);
        parcel.writeString(this.type);
        parcel.writeString(this.details);
    }
}
