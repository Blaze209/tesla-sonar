package xb;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: xb.e, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lxb/e;", "Landroid/os/Parcelable;", "Landroidx/work/m;", "foregroundInfo", "<init>", "(Landroidx/work/m;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/work/m;", "()Landroidx/work/m;", "b", "work-multiprocess_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final /* data */ class ParcelableForegroundInfo implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.work.m foregroundInfo;
    public static final Parcelable.Creator<ParcelableForegroundInfo> CREATOR = new a();

    /* JADX INFO: renamed from: xb.e$a */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"xb/e$a", "Landroid/os/Parcelable$Creator;", "Lxb/e;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lxb/e;", "", "size", "", "b", "(I)[Lxb/e;", "work-multiprocess_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParcelableForegroundInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableForegroundInfo createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new ParcelableForegroundInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableForegroundInfo[] newArray(int size) {
            return new ParcelableForegroundInfo[size];
        }
    }

    public ParcelableForegroundInfo(androidx.work.m foregroundInfo) {
        s.k(foregroundInfo, "foregroundInfo");
        this.foregroundInfo = foregroundInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final androidx.work.m getForegroundInfo() {
        return this.foregroundInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ParcelableForegroundInfo) && s.f(this.foregroundInfo, ((ParcelableForegroundInfo) other).foregroundInfo);
    }

    public int hashCode() {
        return this.foregroundInfo.hashCode();
    }

    public String toString() {
        return "ParcelableForegroundInfo(foregroundInfo=" + this.foregroundInfo + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "parcel");
        parcel.writeInt(this.foregroundInfo.c());
        parcel.writeParcelable(this.foregroundInfo.b(), flags);
        parcel.writeInt(this.foregroundInfo.a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ParcelableForegroundInfo(Parcel parcel) {
        this(new androidx.work.m(parcel.readInt(), (Notification) b.b(parcel, Notification.class), parcel.readInt()));
        s.k(parcel, "parcel");
    }
}
