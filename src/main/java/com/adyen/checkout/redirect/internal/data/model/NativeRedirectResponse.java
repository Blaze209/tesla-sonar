package com.adyen.checkout.redirect.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/adyen/checkout/redirect/internal/data/model/NativeRedirectResponse;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", NativeRedirectResponse.REDIRECT_RESULT, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/adyen/checkout/redirect/internal/data/model/NativeRedirectResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getRedirectResult", "Companion", "b", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NativeRedirectResponse extends b {
    private static final String REDIRECT_RESULT = "redirectResult";
    private final String redirectResult;
    public static final Parcelable.Creator<NativeRedirectResponse> CREATOR = new c();
    public static final b.a<NativeRedirectResponse> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/redirect/internal/data/model/NativeRedirectResponse$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/redirect/internal/data/model/NativeRedirectResponse;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/redirect/internal/data/model/NativeRedirectResponse;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/redirect/internal/data/model/NativeRedirectResponse;", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<NativeRedirectResponse> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public NativeRedirectResponse b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String string = jsonObject.getString(NativeRedirectResponse.REDIRECT_RESULT);
                s.j(string, "getString(...)");
                return new NativeRedirectResponse(string);
            } catch (JSONException e11) {
                throw new ModelSerializationException(NativeRedirectRequest.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(NativeRedirectResponse modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(NativeRedirectResponse.REDIRECT_RESULT, modelObject.getRedirectResult());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(NativeRedirectResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<NativeRedirectResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NativeRedirectResponse createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new NativeRedirectResponse(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NativeRedirectResponse[] newArray(int i11) {
            return new NativeRedirectResponse[i11];
        }
    }

    public NativeRedirectResponse(String redirectResult) {
        s.k(redirectResult, "redirectResult");
        this.redirectResult = redirectResult;
    }

    public static /* synthetic */ NativeRedirectResponse copy$default(NativeRedirectResponse nativeRedirectResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nativeRedirectResponse.redirectResult;
        }
        return nativeRedirectResponse.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRedirectResult() {
        return this.redirectResult;
    }

    public final NativeRedirectResponse copy(String redirectResult) {
        s.k(redirectResult, "redirectResult");
        return new NativeRedirectResponse(redirectResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NativeRedirectResponse) && s.f(this.redirectResult, ((NativeRedirectResponse) other).redirectResult);
    }

    public final String getRedirectResult() {
        return this.redirectResult;
    }

    public int hashCode() {
        return this.redirectResult.hashCode();
    }

    public String toString() {
        return "NativeRedirectResponse(redirectResult=" + this.redirectResult + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.redirectResult);
    }
}
