package pg0;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pg0.c0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lpg0/c0;", "Landroid/os/Parcelable;", "", "absoluteFilePath", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Frame implements Parcelable {
    public static final Parcelable.Creator<Frame> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String absoluteFilePath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mimeType;

    /* JADX INFO: renamed from: pg0.c0$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Frame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Frame createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new Frame(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Frame[] newArray(int i11) {
            return new Frame[i11];
        }
    }

    public Frame(String absoluteFilePath, String mimeType) {
        p013kotlin.jvm.internal.s.k(absoluteFilePath, "absoluteFilePath");
        p013kotlin.jvm.internal.s.k(mimeType, "mimeType");
        this.absoluteFilePath = absoluteFilePath;
        this.mimeType = mimeType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAbsoluteFilePath() {
        return this.absoluteFilePath;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) other;
        return p013kotlin.jvm.internal.s.f(this.absoluteFilePath, frame.absoluteFilePath) && p013kotlin.jvm.internal.s.f(this.mimeType, frame.mimeType);
    }

    public int hashCode() {
        return (this.absoluteFilePath.hashCode() * 31) + this.mimeType.hashCode();
    }

    public String toString() {
        return "Frame(absoluteFilePath=" + this.absoluteFilePath + ", mimeType=" + this.mimeType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeString(this.absoluteFilePath);
        dest.writeString(this.mimeType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Frame(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String fileExtensionFromUrl;
        if ((i11 & 2) != 0 && ((fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str)) == null || (str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null)) {
            str2 = "image/*";
        }
        this(str, str2);
    }
}
