package hi0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: hi0.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010$¨\u0006'"}, d2 = {"Lhi0/g;", "Landroid/os/Parcelable;", "Lhi0/a;", "gpsCollectionRequirement", "Lhi0/e;", "gpsPrecisionRequirement", "", "usePlayIntegrity", "<init>", "(Lhi0/a;Lhi0/e;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi0/a;", "b", "()Lhi0/a;", "Lhi0/e;", "c", "()Lhi0/e;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "e", "isGpsRequired", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InquirySessionConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a gpsCollectionRequirement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final e gpsPrecisionRequirement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean usePlayIntegrity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InquirySessionConfig> CREATOR = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final InquirySessionConfig f72905e = new InquirySessionConfig(a.NONE, e.PRECISE, false);

    /* JADX INFO: renamed from: hi0.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhi0/g$a;", "", "<init>", "()V", "Lhi0/g;", "Default", "Lhi0/g;", "a", "()Lhi0/g;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InquirySessionConfig a() {
            return InquirySessionConfig.f72905e;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: hi0.g$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InquirySessionConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InquirySessionConfig createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new InquirySessionConfig(a.CREATOR.createFromParcel(parcel), e.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InquirySessionConfig[] newArray(int i11) {
            return new InquirySessionConfig[i11];
        }
    }

    public InquirySessionConfig(a gpsCollectionRequirement, e gpsPrecisionRequirement, boolean z11) {
        s.k(gpsCollectionRequirement, "gpsCollectionRequirement");
        s.k(gpsPrecisionRequirement, "gpsPrecisionRequirement");
        this.gpsCollectionRequirement = gpsCollectionRequirement;
        this.gpsPrecisionRequirement = gpsPrecisionRequirement;
        this.usePlayIntegrity = z11;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getGpsCollectionRequirement() {
        return this.gpsCollectionRequirement;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getGpsPrecisionRequirement() {
        return this.gpsPrecisionRequirement;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getUsePlayIntegrity() {
        return this.usePlayIntegrity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.gpsCollectionRequirement == a.REQUIRED;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquirySessionConfig)) {
            return false;
        }
        InquirySessionConfig inquirySessionConfig = (InquirySessionConfig) other;
        return this.gpsCollectionRequirement == inquirySessionConfig.gpsCollectionRequirement && this.gpsPrecisionRequirement == inquirySessionConfig.gpsPrecisionRequirement && this.usePlayIntegrity == inquirySessionConfig.usePlayIntegrity;
    }

    public int hashCode() {
        return (((this.gpsCollectionRequirement.hashCode() * 31) + this.gpsPrecisionRequirement.hashCode()) * 31) + Boolean.hashCode(this.usePlayIntegrity);
    }

    public String toString() {
        return "InquirySessionConfig(gpsCollectionRequirement=" + this.gpsCollectionRequirement + ", gpsPrecisionRequirement=" + this.gpsPrecisionRequirement + ", usePlayIntegrity=" + this.usePlayIntegrity + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        this.gpsCollectionRequirement.writeToParcel(dest, flags);
        this.gpsPrecisionRequirement.writeToParcel(dest, flags);
        dest.writeInt(this.usePlayIntegrity ? 1 : 0);
    }
}
