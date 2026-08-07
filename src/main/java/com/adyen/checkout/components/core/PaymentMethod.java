package com.adyen.checkout.components.core;

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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0001IB\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0094\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b.\u0010/R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u00103R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00100\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u00103R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u00109R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00100\u001a\u0004\b:\u0010\u0014\"\u0004\b;\u00103R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00100\u001a\u0004\b<\u0010\u0014\"\u0004\b=\u00103R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u0017\"\u0004\b?\u00109R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010CR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00106\u001a\u0004\bD\u0010\u0017\"\u0004\bE\u00109R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\bF\u0010\u0017\"\u0004\bG\u00109¨\u0006J"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentMethod;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", "type", "name", "", PaymentMethod.BRANDS, PaymentMethod.BRAND, PaymentMethod.FUNDING_SOURCE, "Lcom/adyen/checkout/components/core/Issuer;", PaymentMethod.ISSUERS, "Lcom/adyen/checkout/components/core/Configuration;", "configuration", "Lcom/adyen/checkout/components/core/InputDetail;", "details", "Lcom/adyen/checkout/components/core/AppData;", PaymentMethod.APPS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/adyen/checkout/components/core/Configuration;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "()Lcom/adyen/checkout/components/core/Configuration;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/adyen/checkout/components/core/Configuration;Ljava/util/List;Ljava/util/List;)Lcom/adyen/checkout/components/core/PaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getName", "setName", "Ljava/util/List;", "getBrands", "setBrands", "(Ljava/util/List;)V", "getBrand", "setBrand", "getFundingSource", "setFundingSource", "getIssuers", "setIssuers", "Lcom/adyen/checkout/components/core/Configuration;", "getConfiguration", "setConfiguration", "(Lcom/adyen/checkout/components/core/Configuration;)V", "getDetails", "setDetails", "getApps", "setApps", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentMethod extends b {
    private static final String APPS = "apps";
    private static final String BRAND = "brand";
    private static final String BRANDS = "brands";
    private static final String CONFIGURATION = "configuration";
    private static final String DETAILS = "details";
    private static final String FUNDING_SOURCE = "fundingSource";
    private static final String ISSUERS = "issuers";
    private static final String NAME = "name";
    private static final String TYPE = "type";
    private List<AppData> apps;
    private String brand;
    private List<String> brands;
    private Configuration configuration;
    private List<InputDetail> details;
    private String fundingSource;
    private List<Issuer> issuers;
    private String name;
    private String type;
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new c();
    public static final b.a<PaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/PaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/PaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/PaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/PaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<PaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new PaymentMethod(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "name"), oe.a.b(jsonObject.optJSONArray(PaymentMethod.BRANDS)), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, PaymentMethod.BRAND), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, PaymentMethod.FUNDING_SOURCE), com.adyen.checkout.core.internal.data.model.c.b(jsonObject.optJSONArray(PaymentMethod.ISSUERS), Issuer.SERIALIZER), (Configuration) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject("configuration"), Configuration.SERIALIZER), com.adyen.checkout.core.internal.data.model.c.b(jsonObject.optJSONArray("details"), InputDetail.SERIALIZER), com.adyen.checkout.core.internal.data.model.c.b(jsonObject.optJSONArray(PaymentMethod.APPS), AppData.SERIALIZER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(PaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("name", modelObject.getName());
                jSONObject.putOpt(PaymentMethod.BRANDS, oe.a.d(modelObject.getBrands()));
                jSONObject.putOpt(PaymentMethod.BRAND, modelObject.getBrand());
                jSONObject.putOpt(PaymentMethod.FUNDING_SOURCE, modelObject.getFundingSource());
                jSONObject.putOpt(PaymentMethod.ISSUERS, com.adyen.checkout.core.internal.data.model.c.d(modelObject.getIssuers(), Issuer.SERIALIZER));
                jSONObject.putOpt("configuration", com.adyen.checkout.core.internal.data.model.c.c(modelObject.getConfiguration(), Configuration.SERIALIZER));
                jSONObject.putOpt("details", com.adyen.checkout.core.internal.data.model.c.d(modelObject.getDetails(), InputDetail.SERIALIZER));
                jSONObject.putOpt(PaymentMethod.APPS, com.adyen.checkout.core.internal.data.model.c.d(modelObject.getApps(), AppData.SERIALIZER));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(PaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<PaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentMethod createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(Issuer.CREATOR.createFromParcel(parcel));
                }
            }
            Configuration configurationCreateFromParcel = parcel.readInt() == 0 ? null : Configuration.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList4.add(InputDetail.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList3 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList3.add(AppData.CREATOR.createFromParcel(parcel));
                }
            }
            return new PaymentMethod(string, string2, arrayListCreateStringArrayList, string3, string4, arrayList, configurationCreateFromParcel, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentMethod[] newArray(int i11) {
            return new PaymentMethod[i11];
        }
    }

    public PaymentMethod() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, List list, String str3, String str4, List list2, Configuration configuration, List list3, List list4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = paymentMethod.name;
        }
        if ((i11 & 4) != 0) {
            list = paymentMethod.brands;
        }
        if ((i11 & 8) != 0) {
            str3 = paymentMethod.brand;
        }
        if ((i11 & 16) != 0) {
            str4 = paymentMethod.fundingSource;
        }
        if ((i11 & 32) != 0) {
            list2 = paymentMethod.issuers;
        }
        if ((i11 & 64) != 0) {
            configuration = paymentMethod.configuration;
        }
        if ((i11 & 128) != 0) {
            list3 = paymentMethod.details;
        }
        if ((i11 & 256) != 0) {
            list4 = paymentMethod.apps;
        }
        List list5 = list3;
        List list6 = list4;
        List list7 = list2;
        Configuration configuration2 = configuration;
        String str5 = str4;
        List list8 = list;
        return paymentMethod.copy(str, str2, list8, str3, str5, list7, configuration2, list5, list6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<String> component3() {
        return this.brands;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFundingSource() {
        return this.fundingSource;
    }

    public final List<Issuer> component6() {
        return this.issuers;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final List<InputDetail> component8() {
        return this.details;
    }

    public final List<AppData> component9() {
        return this.apps;
    }

    public final PaymentMethod copy(String type, String name, List<String> brands, String brand, String fundingSource, List<Issuer> issuers, Configuration configuration, List<InputDetail> details, List<AppData> apps) {
        return new PaymentMethod(type, name, brands, brand, fundingSource, issuers, configuration, details, apps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return s.f(this.type, paymentMethod.type) && s.f(this.name, paymentMethod.name) && s.f(this.brands, paymentMethod.brands) && s.f(this.brand, paymentMethod.brand) && s.f(this.fundingSource, paymentMethod.fundingSource) && s.f(this.issuers, paymentMethod.issuers) && s.f(this.configuration, paymentMethod.configuration) && s.f(this.details, paymentMethod.details) && s.f(this.apps, paymentMethod.apps);
    }

    public final List<AppData> getApps() {
        return this.apps;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final List<String> getBrands() {
        return this.brands;
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final List<InputDetail> getDetails() {
        return this.details;
    }

    public final String getFundingSource() {
        return this.fundingSource;
    }

    public final List<Issuer> getIssuers() {
        return this.issuers;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.brands;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.brand;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fundingSource;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Issuer> list2 = this.issuers;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Configuration configuration = this.configuration;
        int iHashCode7 = (iHashCode6 + (configuration == null ? 0 : configuration.hashCode())) * 31;
        List<InputDetail> list3 = this.details;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AppData> list4 = this.apps;
        return iHashCode8 + (list4 != null ? list4.hashCode() : 0);
    }

    public final void setApps(List<AppData> list) {
        this.apps = list;
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    public final void setBrands(List<String> list) {
        this.brands = list;
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public final void setDetails(List<InputDetail> list) {
        this.details = list;
    }

    public final void setFundingSource(String str) {
        this.fundingSource = str;
    }

    public final void setIssuers(List<Issuer> list) {
        this.issuers = list;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "PaymentMethod(type=" + this.type + ", name=" + this.name + ", brands=" + this.brands + ", brand=" + this.brand + ", fundingSource=" + this.fundingSource + ", issuers=" + this.issuers + ", configuration=" + this.configuration + ", details=" + this.details + ", apps=" + this.apps + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.name);
        parcel.writeStringList(this.brands);
        parcel.writeString(this.brand);
        parcel.writeString(this.fundingSource);
        List<Issuer> list = this.issuers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Issuer> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        Configuration configuration = this.configuration;
        if (configuration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            configuration.writeToParcel(parcel, flags);
        }
        List<InputDetail> list2 = this.details;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<InputDetail> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, flags);
            }
        }
        List<AppData> list3 = this.apps;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        Iterator<AppData> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ PaymentMethod(String str, String str2, List list, String str3, String str4, List list2, Configuration configuration, List list3, List list4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : list2, (i11 & 64) != 0 ? null : configuration, (i11 & 128) != 0 ? null : list3, (i11 & 256) != 0 ? null : list4);
    }

    public PaymentMethod(String str, String str2, List<String> list, String str3, String str4, List<Issuer> list2, Configuration configuration, List<InputDetail> list3, List<AppData> list4) {
        this.type = str;
        this.name = str2;
        this.brands = list;
        this.brand = str3;
        this.fundingSource = str4;
        this.issuers = list2;
        this.configuration = configuration;
        this.details = list3;
        this.apps = list4;
    }
}
