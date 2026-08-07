package com.adyen.checkout.card.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ:\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\r¨\u0006'"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", "Lcom/adyen/checkout/card/internal/data/model/Brand;", BinLookupResponse.BRANDS, "", BinLookupResponse.ISSUING_COUNTRY_CODE, BinLookupResponse.REQUEST_ID, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getBrands", "Ljava/lang/String;", "getIssuingCountryCode", "getRequestId", "Companion", "b", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BinLookupResponse extends b {
    private static final String BRANDS = "brands";
    private static final String ISSUING_COUNTRY_CODE = "issuingCountryCode";
    private static final String REQUEST_ID = "requestId";
    private final List<Brand> brands;
    private final String issuingCountryCode;
    private final String requestId;
    public static final Parcelable.Creator<BinLookupResponse> CREATOR = new c();
    public static final b.a<BinLookupResponse> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/card/internal/data/model/BinLookupResponse$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/card/internal/data/model/BinLookupResponse;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<BinLookupResponse> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BinLookupResponse b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                return new BinLookupResponse(com.adyen.checkout.core.internal.data.model.c.b(jsonObject.optJSONArray(BinLookupResponse.BRANDS), Brand.SERIALIZER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, BinLookupResponse.ISSUING_COUNTRY_CODE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, BinLookupResponse.REQUEST_ID));
            } catch (JSONException e11) {
                throw new ModelSerializationException(BinLookupResponse.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(BinLookupResponse modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(BinLookupResponse.BRANDS, com.adyen.checkout.core.internal.data.model.c.d(modelObject.getBrands(), Brand.SERIALIZER));
                jSONObject.putOpt(BinLookupResponse.ISSUING_COUNTRY_CODE, modelObject.getIssuingCountryCode());
                jSONObject.putOpt(BinLookupResponse.REQUEST_ID, modelObject.getRequestId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(BinLookupResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<BinLookupResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BinLookupResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.k(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(Brand.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new BinLookupResponse(arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BinLookupResponse[] newArray(int i11) {
            return new BinLookupResponse[i11];
        }
    }

    public BinLookupResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BinLookupResponse copy$default(BinLookupResponse binLookupResponse, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = binLookupResponse.brands;
        }
        if ((i11 & 2) != 0) {
            str = binLookupResponse.issuingCountryCode;
        }
        if ((i11 & 4) != 0) {
            str2 = binLookupResponse.requestId;
        }
        return binLookupResponse.copy(list, str, str2);
    }

    public final List<Brand> component1() {
        return this.brands;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuingCountryCode() {
        return this.issuingCountryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final BinLookupResponse copy(List<Brand> brands, String issuingCountryCode, String requestId) {
        return new BinLookupResponse(brands, issuingCountryCode, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinLookupResponse)) {
            return false;
        }
        BinLookupResponse binLookupResponse = (BinLookupResponse) other;
        return s.f(this.brands, binLookupResponse.brands) && s.f(this.issuingCountryCode, binLookupResponse.issuingCountryCode) && s.f(this.requestId, binLookupResponse.requestId);
    }

    public final List<Brand> getBrands() {
        return this.brands;
    }

    public final String getIssuingCountryCode() {
        return this.issuingCountryCode;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        List<Brand> list = this.brands;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.issuingCountryCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BinLookupResponse(brands=" + this.brands + ", issuingCountryCode=" + this.issuingCountryCode + ", requestId=" + this.requestId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        List<Brand> list = this.brands;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Brand> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.issuingCountryCode);
        parcel.writeString(this.requestId);
    }

    public /* synthetic */ BinLookupResponse(List list, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }

    public BinLookupResponse(List<Brand> list, String str, String str2) {
        this.brands = list;
        this.issuingCountryCode = str;
        this.requestId = str2;
    }
}
