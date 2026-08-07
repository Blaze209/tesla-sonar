package com.adyen.checkout.card.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001(B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJF\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u000b¨\u0006)"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/BinLookupRequest;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", BinLookupRequest.ENCRYPTED_BIN, BinLookupRequest.REQUEST_ID, "", BinLookupRequest.SUPPORTED_BRANDS, "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/adyen/checkout/card/internal/data/model/BinLookupRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getEncryptedBin", "getRequestId", "Ljava/util/List;", "getSupportedBrands", "getType", "Companion", "b", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BinLookupRequest extends b {
    private static final String ENCRYPTED_BIN = "encryptedBin";
    private static final String REQUEST_ID = "requestId";
    private static final String SUPPORTED_BRANDS = "supportedBrands";
    private static final String TYPE = "type";
    private final String encryptedBin;
    private final String requestId;
    private final List<String> supportedBrands;
    private final String type;
    public static final Parcelable.Creator<BinLookupRequest> CREATOR = new c();
    public static final b.a<BinLookupRequest> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/card/internal/data/model/BinLookupRequest$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/card/internal/data/model/BinLookupRequest;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/card/internal/data/model/BinLookupRequest;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/card/internal/data/model/BinLookupRequest;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<BinLookupRequest> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BinLookupRequest b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                return new BinLookupRequest(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, BinLookupRequest.ENCRYPTED_BIN), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, BinLookupRequest.REQUEST_ID), com.adyen.checkout.core.internal.data.model.a.g(jsonObject, BinLookupRequest.SUPPORTED_BRANDS), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"));
            } catch (JSONException e11) {
                throw new ModelSerializationException(BinLookupRequest.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(BinLookupRequest modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(BinLookupRequest.ENCRYPTED_BIN, modelObject.getEncryptedBin());
                jSONObject.putOpt(BinLookupRequest.REQUEST_ID, modelObject.getRequestId());
                jSONObject.putOpt(BinLookupRequest.SUPPORTED_BRANDS, oe.a.d(modelObject.getSupportedBrands()));
                jSONObject.putOpt("type", modelObject.getType());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(BinLookupRequest.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<BinLookupRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BinLookupRequest createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new BinLookupRequest(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BinLookupRequest[] newArray(int i11) {
            return new BinLookupRequest[i11];
        }
    }

    public BinLookupRequest() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BinLookupRequest copy$default(BinLookupRequest binLookupRequest, String str, String str2, List list, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = binLookupRequest.encryptedBin;
        }
        if ((i11 & 2) != 0) {
            str2 = binLookupRequest.requestId;
        }
        if ((i11 & 4) != 0) {
            list = binLookupRequest.supportedBrands;
        }
        if ((i11 & 8) != 0) {
            str3 = binLookupRequest.type;
        }
        return binLookupRequest.copy(str, str2, list, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncryptedBin() {
        return this.encryptedBin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final List<String> component3() {
        return this.supportedBrands;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final BinLookupRequest copy(String encryptedBin, String requestId, List<String> supportedBrands, String type) {
        return new BinLookupRequest(encryptedBin, requestId, supportedBrands, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinLookupRequest)) {
            return false;
        }
        BinLookupRequest binLookupRequest = (BinLookupRequest) other;
        return s.f(this.encryptedBin, binLookupRequest.encryptedBin) && s.f(this.requestId, binLookupRequest.requestId) && s.f(this.supportedBrands, binLookupRequest.supportedBrands) && s.f(this.type, binLookupRequest.type);
    }

    public final String getEncryptedBin() {
        return this.encryptedBin;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final List<String> getSupportedBrands() {
        return this.supportedBrands;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.encryptedBin;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.requestId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.supportedBrands;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.type;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "BinLookupRequest(encryptedBin=" + this.encryptedBin + ", requestId=" + this.requestId + ", supportedBrands=" + this.supportedBrands + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.encryptedBin);
        parcel.writeString(this.requestId);
        parcel.writeStringList(this.supportedBrands);
        parcel.writeString(this.type);
    }

    public /* synthetic */ BinLookupRequest(String str, String str2, List list, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : str3);
    }

    public BinLookupRequest(String str, String str2, List<String> list, String str3) {
        this.encryptedBin = str;
        this.requestId = str2;
        this.supportedBrands = list;
        this.type = str3;
    }
}
