package ug0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lug0/a;", "Landroid/os/Parcelable;", "", "merchantId", "nonce", "fieldKeyMobileDriversLicense", "", "Lug0/b;", "digitalIdRequests", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "getMerchantId", "()Ljava/lang/String;", "b", "getNonce", "c", "getFieldKeyMobileDriversLicense", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getDigitalIdRequests", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2505a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String merchantId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String nonce;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String fieldKeyMobileDriversLicense;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<b> digitalIdRequests;

    /* JADX INFO: renamed from: ug0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C2505a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(b.CREATOR.createFromParcel(parcel));
            }
            return new a(string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(String merchantId, String nonce, String fieldKeyMobileDriversLicense, List<b> digitalIdRequests) {
        s.k(merchantId, "merchantId");
        s.k(nonce, "nonce");
        s.k(fieldKeyMobileDriversLicense, "fieldKeyMobileDriversLicense");
        s.k(digitalIdRequests, "digitalIdRequests");
        this.merchantId = merchantId;
        this.nonce = nonce;
        this.fieldKeyMobileDriversLicense = fieldKeyMobileDriversLicense;
        this.digitalIdRequests = digitalIdRequests;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.merchantId);
        dest.writeString(this.nonce);
        dest.writeString(this.fieldKeyMobileDriversLicense);
        List<b> list = this.digitalIdRequests;
        dest.writeInt(list.size());
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
