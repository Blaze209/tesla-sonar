package zi0;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lzi0/d;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "NetworkError", "CameraPermissionError", "SdkConfigurationError", "CameraCompatibilityError", "IntegrationError", "SessionTokenError", "RateLimitExceeded", "UnexpectedError", "NoDiskSpaceError", "WebRtcIntegrationError", "InvalidOneTimeLinkCode", "ExceptionError", "inquiry-types_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum d implements Parcelable {
    NetworkError,
    CameraPermissionError,
    SdkConfigurationError,
    CameraCompatibilityError,
    IntegrationError,
    SessionTokenError,
    RateLimitExceeded,
    UnexpectedError,
    NoDiskSpaceError,
    WebRtcIntegrationError,
    InvalidOneTimeLinkCode,
    ExceptionError;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: zi0.d.a
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return d.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i11) {
            return new d[i11];
        }
    };

    public static EnumEntries<d> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(name());
    }
}
