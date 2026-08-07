package th0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: th0.s0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001d¨\u0006\u001e"}, d2 = {"Lth0/s0;", "Landroid/os/Parcelable;", "", "Lth0/a1$b;", "Lth0/r0;", "poseConfigs", "<init>", "(Ljava/util/Map;)V", "pose", "a", "(Lth0/a1$b;)Lth0/r0;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PoseConfigs implements Parcelable {
    public static final Parcelable.Creator<PoseConfigs> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<a1.b, PoseConfig> poseConfigs;

    /* JADX INFO: renamed from: th0.s0$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PoseConfigs> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PoseConfigs createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            int i11 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashMap.put(a1.b.valueOf(parcel.readString()), PoseConfig.CREATOR.createFromParcel(parcel));
            }
            return new PoseConfigs(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PoseConfigs[] newArray(int i11) {
            return new PoseConfigs[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoseConfigs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final PoseConfig a(a1.b pose) {
        p013kotlin.jvm.internal.s.k(pose, "pose");
        PoseConfig poseConfig = this.poseConfigs.get(pose);
        return poseConfig == null ? PoseConfig.INSTANCE.a() : poseConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PoseConfigs) && p013kotlin.jvm.internal.s.f(this.poseConfigs, ((PoseConfigs) other).poseConfigs);
    }

    public int hashCode() {
        return this.poseConfigs.hashCode();
    }

    public String toString() {
        return "PoseConfigs(poseConfigs=" + this.poseConfigs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        Map<a1.b, PoseConfig> map = this.poseConfigs;
        dest.writeInt(map.size());
        for (Map.Entry<a1.b, PoseConfig> entry : map.entrySet()) {
            dest.writeString(entry.getKey().name());
            entry.getValue().writeToParcel(dest, flags);
        }
    }

    public PoseConfigs(Map<a1.b, PoseConfig> poseConfigs) {
        p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
        this.poseConfigs = poseConfigs;
    }

    public /* synthetic */ PoseConfigs(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p013kotlin.collections.v0.i() : map);
    }
}
