package th0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: th0.r0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lth0/r0;", "Landroid/os/Parcelable;", "", "allowReview", "manualCaptureEnabled", "", "manualCaptureDelayMs", "autoCaptureEnabled", "<init>", "(ZZJZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "e", "c", "J", DateTokenConverter.CONVERTER_KEY, "()J", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PoseConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowReview;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean manualCaptureEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long manualCaptureDelayMs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoCaptureEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PoseConfig> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final PoseConfig f114114f = new PoseConfig(false, false, 0, false, 15, null);

    /* JADX INFO: renamed from: th0.r0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lth0/r0$a;", "", "<init>", "()V", "Lth0/r0;", "Default", "Lth0/r0;", "a", "()Lth0/r0;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PoseConfig a() {
            return PoseConfig.f114114f;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: th0.r0$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PoseConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PoseConfig createFromParcel(Parcel parcel) {
            long j11;
            boolean z11;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            boolean z12 = false;
            boolean z13 = true;
            if (parcel.readInt() != 0) {
                z12 = true;
            }
            if (parcel.readInt() == 0) {
                z13 = z12;
            }
            long j12 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z11 = true;
                j11 = j12;
            } else {
                j11 = j12;
                z11 = false;
            }
            return new PoseConfig(z12, z13, j11, z11);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PoseConfig[] newArray(int i11) {
            return new PoseConfig[i11];
        }
    }

    public PoseConfig() {
        this(false, false, 0L, false, 15, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowReview() {
        return this.allowReview;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAutoCaptureEnabled() {
        return this.autoCaptureEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getManualCaptureDelayMs() {
        return this.manualCaptureDelayMs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getManualCaptureEnabled() {
        return this.manualCaptureEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoseConfig)) {
            return false;
        }
        PoseConfig poseConfig = (PoseConfig) other;
        return this.allowReview == poseConfig.allowReview && this.manualCaptureEnabled == poseConfig.manualCaptureEnabled && this.manualCaptureDelayMs == poseConfig.manualCaptureDelayMs && this.autoCaptureEnabled == poseConfig.autoCaptureEnabled;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.allowReview) * 31) + Boolean.hashCode(this.manualCaptureEnabled)) * 31) + Long.hashCode(this.manualCaptureDelayMs)) * 31) + Boolean.hashCode(this.autoCaptureEnabled);
    }

    public String toString() {
        return "PoseConfig(allowReview=" + this.allowReview + ", manualCaptureEnabled=" + this.manualCaptureEnabled + ", manualCaptureDelayMs=" + this.manualCaptureDelayMs + ", autoCaptureEnabled=" + this.autoCaptureEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeInt(this.allowReview ? 1 : 0);
        dest.writeInt(this.manualCaptureEnabled ? 1 : 0);
        dest.writeLong(this.manualCaptureDelayMs);
        dest.writeInt(this.autoCaptureEnabled ? 1 : 0);
    }

    public PoseConfig(boolean z11, boolean z12, long j11, boolean z13) {
        this.allowReview = z11;
        this.manualCaptureEnabled = z12;
        this.manualCaptureDelayMs = j11;
        this.autoCaptureEnabled = z13;
    }

    public /* synthetic */ PoseConfig(boolean z11, boolean z12, long j11, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? 8000L : j11, (i11 & 8) != 0 ? true : z13);
    }
}
