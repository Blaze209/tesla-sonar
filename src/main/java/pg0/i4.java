package pg0;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lpg0/i4;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "Lpg0/i4$a;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class i4 implements Parcelable {

    /* JADX INFO: renamed from: pg0.i4$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lpg0/i4$a;", "Lpg0/i4;", "Lpg0/d4$e;", "side", "<init>", "(Lpg0/d4$e;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpg0/d4$e;", "()Lpg0/d4$e;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SideIdPart extends i4 {
        public static final Parcelable.Creator<SideIdPart> CREATOR = new C2179a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdConfig.e side;

        /* JADX INFO: renamed from: pg0.i4$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C2179a implements Parcelable.Creator<SideIdPart> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SideIdPart createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new SideIdPart(IdConfig.e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SideIdPart[] newArray(int i11) {
                return new SideIdPart[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SideIdPart(IdConfig.e side) {
            super(null);
            p013kotlin.jvm.internal.s.k(side, "side");
            this.side = side;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IdConfig.e getSide() {
            return this.side;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SideIdPart) && this.side == ((SideIdPart) other).side;
        }

        public int hashCode() {
            return this.side.hashCode();
        }

        public String toString() {
            return "SideIdPart(side=" + this.side + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.side.name());
        }
    }

    public /* synthetic */ i4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private i4() {
    }
}
