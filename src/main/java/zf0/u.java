package zf0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\"\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010!¨\u0006#"}, d2 = {"Lzf0/u;", "Landroid/os/Parcelable;", "", AnnotatedPrivateKey.LABEL, "Lzf0/u$b;", "facingMode", "Landroid/util/Size;", "size", "", "frameRate", "<init>", "(Ljava/lang/String;Lzf0/u$b;Landroid/util/Size;I)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "Lzf0/u$b;", "()Lzf0/u$b;", "c", "Landroid/util/Size;", "e", "()Landroid/util/Size;", "I", "", "()D", "aspectRatio", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b facingMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Size size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int frameRate;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new u(parcel.readString(), b.valueOf(parcel.readString()), parcel.readSize(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u[] newArray(int i11) {
            return new u[i11];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzf0/u$b;", "", "<init>", "(Ljava/lang/String;I)V", "User", "Environment", "Unknown", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        User,
        Environment,
        Unknown;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    public u() {
        this(null, null, null, 0, 15, null);
    }

    public final double a() {
        if (this.size.getHeight() == 0) {
            return 0.0d;
        }
        return ((double) this.size.getWidth()) / ((double) this.size.getHeight());
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getFacingMode() {
        return this.facingMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeString(this.label);
        dest.writeString(this.facingMode.name());
        dest.writeSize(this.size);
        dest.writeInt(this.frameRate);
    }

    public u(String label, b facingMode, Size size, int i11) {
        p013kotlin.jvm.internal.s.k(label, "label");
        p013kotlin.jvm.internal.s.k(facingMode, "facingMode");
        p013kotlin.jvm.internal.s.k(size, "size");
        this.label = label;
        this.facingMode = facingMode;
        this.size = size;
        this.frameRate = i11;
    }

    public /* synthetic */ u(String str, b bVar, Size size, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? b.Unknown : bVar, (i12 & 4) != 0 ? new Size(0, 0) : size, (i12 & 8) != 0 ? 0 : i11);
    }
}
