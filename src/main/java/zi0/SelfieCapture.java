package zi0;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: zi0.f, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lzi0/f;", "Landroid/os/Parcelable;", "Lzi0/f$a;", "captureMethod", "Ljava/io/File;", "data", "<init>", "(Lzi0/f$a;Ljava/io/File;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzi0/f$a;", "()Lzi0/f$a;", "b", "Ljava/io/File;", "()Ljava/io/File;", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelfieCapture implements Parcelable {
    public static final Parcelable.Creator<SelfieCapture> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a captureMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final File data;

    /* JADX INFO: renamed from: zi0.f$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzi0/f$a;", "", "<init>", "(Ljava/lang/String;I)V", "Manual", "Auto", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        Manual,
        Auto;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: zi0.f$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SelfieCapture> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelfieCapture createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SelfieCapture(a.valueOf(parcel.readString()), (File) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SelfieCapture[] newArray(int i11) {
            return new SelfieCapture[i11];
        }
    }

    public SelfieCapture(a captureMethod, File data) {
        s.k(captureMethod, "captureMethod");
        s.k(data, "data");
        this.captureMethod = captureMethod;
        this.data = data;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCaptureMethod() {
        return this.captureMethod;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final File getData() {
        return this.data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieCapture)) {
            return false;
        }
        SelfieCapture selfieCapture = (SelfieCapture) other;
        return this.captureMethod == selfieCapture.captureMethod && s.f(this.data, selfieCapture.data);
    }

    public int hashCode() {
        return (this.captureMethod.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "SelfieCapture(captureMethod=" + this.captureMethod + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.captureMethod.name());
        dest.writeSerializable(this.data);
    }
}
