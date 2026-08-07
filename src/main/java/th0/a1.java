package th0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\u0005\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lth0/a1;", "Landroid/os/Parcelable;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "absoluteFilePath", "Lth0/a1$a;", "b", "()Lth0/a1$a;", "captureMethod", "c", DateTokenConverter.CONVERTER_KEY, "Lth0/a1$c;", "Lth0/a1$d;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a1 implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lth0/a1$a;", "", "", "method", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "AUTO", "MANUAL", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        AUTO(DebugKt.DEBUG_PROPERTY_VALUE_AUTO),
        MANUAL("manual");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String method;

        a(String str) {
            this.method = str;
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public final String getMethod() {
            return this.method;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lth0/a1$b;", "", "<init>", "(Ljava/lang/String;I)V", "Center", "Left", "Right", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        Center,
        Left,
        Right;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: th0.a1$c, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\"\u0010'¨\u0006("}, d2 = {"Lth0/a1$c;", "Lth0/a1;", "", "absoluteFilePath", "Lth0/a1$a;", "captureMethod", "Lth0/a1$b;", "pose", "", "capturedTimestamp", "<init>", "(Ljava/lang/String;Lth0/a1$a;Lth0/a1$b;J)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lth0/a1$a;", "()Lth0/a1$a;", "c", "Lth0/a1$b;", DateTokenConverter.CONVERTER_KEY, "()Lth0/a1$b;", "J", "()J", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelfieImage extends a1 {
        public static final Parcelable.Creator<SelfieImage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a captureMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b pose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long capturedTimestamp;

        /* JADX INFO: renamed from: th0.a1$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieImage> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieImage createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new SelfieImage(parcel.readString(), a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieImage[] newArray(int i11) {
                return new SelfieImage[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfieImage(String absoluteFilePath, a captureMethod, b pose, long j11) {
            super(null);
            p013kotlin.jvm.internal.s.k(absoluteFilePath, "absoluteFilePath");
            p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
            p013kotlin.jvm.internal.s.k(pose, "pose");
            this.absoluteFilePath = absoluteFilePath;
            this.captureMethod = captureMethod;
            this.pose = pose;
            this.capturedTimestamp = j11;
        }

        @Override // th0.a1
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @Override // th0.a1
        /* JADX INFO: renamed from: b, reason: from getter */
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getCapturedTimestamp() {
            return this.capturedTimestamp;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getPose() {
            return this.pose;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfieImage)) {
                return false;
            }
            SelfieImage selfieImage = (SelfieImage) other;
            return p013kotlin.jvm.internal.s.f(this.absoluteFilePath, selfieImage.absoluteFilePath) && this.captureMethod == selfieImage.captureMethod && this.pose == selfieImage.pose && this.capturedTimestamp == selfieImage.capturedTimestamp;
        }

        public int hashCode() {
            return (((((this.absoluteFilePath.hashCode() * 31) + this.captureMethod.hashCode()) * 31) + this.pose.hashCode()) * 31) + Long.hashCode(this.capturedTimestamp);
        }

        public String toString() {
            return "SelfieImage(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ", pose=" + this.pose + ", capturedTimestamp=" + this.capturedTimestamp + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            dest.writeString(this.captureMethod.name());
            dest.writeString(this.pose.name());
            dest.writeLong(this.capturedTimestamp);
        }
    }

    /* JADX INFO: renamed from: th0.a1$d, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lth0/a1$d;", "Lth0/a1;", "", "absoluteFilePath", "Lth0/a1$a;", "captureMethod", "<init>", "(Ljava/lang/String;Lth0/a1$a;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lth0/a1$a;", "()Lth0/a1$a;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelfieVideo extends a1 {
        public static final Parcelable.Creator<SelfieVideo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a captureMethod;

        /* JADX INFO: renamed from: th0.a1$d$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieVideo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieVideo createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new SelfieVideo(parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieVideo[] newArray(int i11) {
                return new SelfieVideo[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfieVideo(String absoluteFilePath, a captureMethod) {
            super(null);
            p013kotlin.jvm.internal.s.k(absoluteFilePath, "absoluteFilePath");
            p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
            this.absoluteFilePath = absoluteFilePath;
            this.captureMethod = captureMethod;
        }

        @Override // th0.a1
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @Override // th0.a1
        /* JADX INFO: renamed from: b, reason: from getter */
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfieVideo)) {
                return false;
            }
            SelfieVideo selfieVideo = (SelfieVideo) other;
            return p013kotlin.jvm.internal.s.f(this.absoluteFilePath, selfieVideo.absoluteFilePath) && this.captureMethod == selfieVideo.captureMethod;
        }

        public int hashCode() {
            return (this.absoluteFilePath.hashCode() * 31) + this.captureMethod.hashCode();
        }

        public String toString() {
            return "SelfieVideo(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            dest.writeString(this.captureMethod.name());
        }
    }

    public /* synthetic */ a1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getAbsoluteFilePath();

    /* JADX INFO: renamed from: b */
    public abstract a getCaptureMethod();

    private a1() {
    }
}
