package pi0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: pi0.h, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#¨\u0006$"}, d2 = {"Lpi0/h;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "dg1Uri", "dg2Uri", "sodUri", "Lnh0/a;", "chipAuthenticationStatus", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lnh0/a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "c", DateTokenConverter.CONVERTER_KEY, "Lnh0/a;", "()Lnh0/a;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GovernmentIdNfcData implements Parcelable {
    public static final Parcelable.Creator<GovernmentIdNfcData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Uri dg1Uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Uri dg2Uri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Uri sodUri;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final nh0.a chipAuthenticationStatus;

    /* JADX INFO: renamed from: pi0.h$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GovernmentIdNfcData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdNfcData createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new GovernmentIdNfcData((Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), (Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), (Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), nh0.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdNfcData[] newArray(int i11) {
            return new GovernmentIdNfcData[i11];
        }
    }

    public GovernmentIdNfcData(Uri dg1Uri, Uri dg2Uri, Uri sodUri, nh0.a chipAuthenticationStatus) {
        s.k(dg1Uri, "dg1Uri");
        s.k(dg2Uri, "dg2Uri");
        s.k(sodUri, "sodUri");
        s.k(chipAuthenticationStatus, "chipAuthenticationStatus");
        this.dg1Uri = dg1Uri;
        this.dg2Uri = dg2Uri;
        this.sodUri = sodUri;
        this.chipAuthenticationStatus = chipAuthenticationStatus;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final nh0.a getChipAuthenticationStatus() {
        return this.chipAuthenticationStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Uri getDg1Uri() {
        return this.dg1Uri;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Uri getDg2Uri() {
        return this.dg2Uri;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Uri getSodUri() {
        return this.sodUri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdNfcData)) {
            return false;
        }
        GovernmentIdNfcData governmentIdNfcData = (GovernmentIdNfcData) other;
        return s.f(this.dg1Uri, governmentIdNfcData.dg1Uri) && s.f(this.dg2Uri, governmentIdNfcData.dg2Uri) && s.f(this.sodUri, governmentIdNfcData.sodUri) && this.chipAuthenticationStatus == governmentIdNfcData.chipAuthenticationStatus;
    }

    public int hashCode() {
        return (((((this.dg1Uri.hashCode() * 31) + this.dg2Uri.hashCode()) * 31) + this.sodUri.hashCode()) * 31) + this.chipAuthenticationStatus.hashCode();
    }

    public String toString() {
        return "GovernmentIdNfcData(dg1Uri=" + this.dg1Uri + ", dg2Uri=" + this.dg2Uri + ", sodUri=" + this.sodUri + ", chipAuthenticationStatus=" + this.chipAuthenticationStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeParcelable(this.dg1Uri, flags);
        dest.writeParcelable(this.dg2Uri, flags);
        dest.writeParcelable(this.sodUri, flags);
        dest.writeString(this.chipAuthenticationStatus.name());
    }
}
