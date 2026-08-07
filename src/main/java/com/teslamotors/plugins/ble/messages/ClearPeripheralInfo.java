package com.teslamotors.plugins.ble.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/teslamotors/plugins/ble/messages/ClearPeripheralInfo;", "Landroid/os/Parcelable;", "", "vin", AnalyticsAttribute.Reason, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/teslamotors/plugins/ble/messages/ClearPeripheralInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVin", "getReason", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClearPeripheralInfo implements Parcelable {
    public static final Parcelable.Creator<ClearPeripheralInfo> CREATOR = new a();
    private final String reason;
    private final String vin;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClearPeripheralInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClearPeripheralInfo createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new ClearPeripheralInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ClearPeripheralInfo[] newArray(int i11) {
            return new ClearPeripheralInfo[i11];
        }
    }

    public ClearPeripheralInfo(String vin, String reason) {
        s.k(vin, "vin");
        s.k(reason, "reason");
        this.vin = vin;
        this.reason = reason;
    }

    public static /* synthetic */ ClearPeripheralInfo copy$default(ClearPeripheralInfo clearPeripheralInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = clearPeripheralInfo.vin;
        }
        if ((i11 & 2) != 0) {
            str2 = clearPeripheralInfo.reason;
        }
        return clearPeripheralInfo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final ClearPeripheralInfo copy(String vin, String reason) {
        s.k(vin, "vin");
        s.k(reason, "reason");
        return new ClearPeripheralInfo(vin, reason);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClearPeripheralInfo)) {
            return false;
        }
        ClearPeripheralInfo clearPeripheralInfo = (ClearPeripheralInfo) other;
        return s.f(this.vin, clearPeripheralInfo.vin) && s.f(this.reason, clearPeripheralInfo.reason);
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getVin() {
        return this.vin;
    }

    public int hashCode() {
        return (this.vin.hashCode() * 31) + this.reason.hashCode();
    }

    public String toString() {
        return "ClearPeripheralInfo(vin=" + this.vin + ", reason=" + this.reason + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.vin);
        dest.writeString(this.reason);
    }
}
