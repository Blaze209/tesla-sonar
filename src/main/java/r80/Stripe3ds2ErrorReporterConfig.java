package r80;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import t80.q;

/* JADX INFO: renamed from: r80.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001e"}, d2 = {"Lr80/e;", "Lr80/a$b;", "Landroid/os/Parcelable;", "Lt80/q;", "sdkTransactionId", "<init>", "(Lt80/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lt80/q;", "", "()Ljava/util/Map;", "customTags", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Stripe3ds2ErrorReporterConfig implements r80.a.b, Parcelable {
    public static final Parcelable.Creator<Stripe3ds2ErrorReporterConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q sdkTransactionId;

    /* JADX INFO: renamed from: r80.e$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Stripe3ds2ErrorReporterConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2ErrorReporterConfig createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new Stripe3ds2ErrorReporterConfig(parcel.readInt() == 0 ? null : q.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2ErrorReporterConfig[] newArray(int i11) {
            return new Stripe3ds2ErrorReporterConfig[i11];
        }
    }

    public Stripe3ds2ErrorReporterConfig(q qVar) {
        this.sdkTransactionId = qVar;
    }

    @Override // r80.a.b
    public Map<String, String> a() {
        q qVar = this.sdkTransactionId;
        Map<String, String> mapF = qVar != null ? v0.f(x.a("sdk_transaction_id", qVar.getValue())) : null;
        return mapF == null ? v0.i() : mapF;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Stripe3ds2ErrorReporterConfig) && s.f(this.sdkTransactionId, ((Stripe3ds2ErrorReporterConfig) other).sdkTransactionId);
    }

    public int hashCode() {
        q qVar = this.sdkTransactionId;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public String toString() {
        return "Stripe3ds2ErrorReporterConfig(sdkTransactionId=" + this.sdkTransactionId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        q qVar = this.sdkTransactionId;
        if (qVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qVar.writeToParcel(parcel, flags);
        }
    }
}
