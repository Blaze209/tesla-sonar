package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: com.stripe.android.model.a0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bm\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010*R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b8\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010$\u001a\u0004\b:\u0010\u0015R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u00102¨\u0006>"}, d2 = {"Lcom/stripe/android/model/a0;", "Lt30/f;", "", "id", "defaultSource", "Lcom/stripe/android/model/f1;", "shippingInformation", "", "Lcom/stripe/android/model/d0;", "sources", "", "hasMore", "", "totalCount", ImagesContract.URL, "description", Scopes.EMAIL, "liveMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/f1;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "b", "getDefaultSource", "c", "Lcom/stripe/android/model/f1;", "()Lcom/stripe/android/model/f1;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getSources", "()Ljava/util/List;", "e", "Z", "getHasMore", "()Z", "f", "Ljava/lang/Integer;", "getTotalCount", "()Ljava/lang/Integer;", "g", "getUrl", "h", "getDescription", IntegerTokenConverter.CONVERTER_KEY, "j", "getLiveMode", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Customer implements t30.f {
    public static final Parcelable.Creator<Customer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String defaultSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShippingInformation shippingInformation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<d0> sources;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasMore;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer totalCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean liveMode;

    /* JADX INFO: renamed from: com.stripe.android.model.a0$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Customer> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Customer createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ShippingInformation shippingInformationCreateFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            boolean z11 = false;
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(Customer.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            return new Customer(string, string2, shippingInformationCreateFromParcel, arrayList, z11, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Customer[] newArray(int i11) {
            return new Customer[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Customer(String str, String str2, ShippingInformation shippingInformation, List<? extends d0> sources, boolean z11, Integer num, String str3, String str4, String str5, boolean z12) {
        p013kotlin.jvm.internal.s.k(sources, "sources");
        this.id = str;
        this.defaultSource = str2;
        this.shippingInformation = shippingInformation;
        this.sources = sources;
        this.hasMore = z11;
        this.totalCount = num;
        this.url = str3;
        this.description = str4;
        this.email = str5;
        this.liveMode = z12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) other;
        return p013kotlin.jvm.internal.s.f(this.id, customer.id) && p013kotlin.jvm.internal.s.f(this.defaultSource, customer.defaultSource) && p013kotlin.jvm.internal.s.f(this.shippingInformation, customer.shippingInformation) && p013kotlin.jvm.internal.s.f(this.sources, customer.sources) && this.hasMore == customer.hasMore && p013kotlin.jvm.internal.s.f(this.totalCount, customer.totalCount) && p013kotlin.jvm.internal.s.f(this.url, customer.url) && p013kotlin.jvm.internal.s.f(this.description, customer.description) && p013kotlin.jvm.internal.s.f(this.email, customer.email) && this.liveMode == customer.liveMode;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultSource;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        int iHashCode3 = (((((iHashCode2 + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31) + this.sources.hashCode()) * 31) + Boolean.hashCode(this.hasMore)) * 31;
        Integer num = this.totalCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        return ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.liveMode);
    }

    public String toString() {
        return "Customer(id=" + this.id + ", defaultSource=" + this.defaultSource + ", shippingInformation=" + this.shippingInformation + ", sources=" + this.sources + ", hasMore=" + this.hasMore + ", totalCount=" + this.totalCount + ", url=" + this.url + ", description=" + this.description + ", email=" + this.email + ", liveMode=" + this.liveMode + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.defaultSource);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingInformation.writeToParcel(parcel, flags);
        }
        List<d0> list = this.sources;
        parcel.writeInt(list.size());
        Iterator<d0> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
        parcel.writeInt(this.hasMore ? 1 : 0);
        Integer num = this.totalCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.url);
        parcel.writeString(this.description);
        parcel.writeString(this.email);
        parcel.writeInt(this.liveMode ? 1 : 0);
    }
}
