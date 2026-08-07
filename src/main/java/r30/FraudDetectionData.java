package r30;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jn0.x;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: r30.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0001!B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b#\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020)8F¢\u0006\u0006\u001a\u0004\b$\u0010*¨\u0006,"}, d2 = {"Lr30/d;", "Lt30/f;", "", "guid", "muid", "sid", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Lorg/json/JSONObject;", "f", "()Lorg/json/JSONObject;", "currentTime", "", "e", "(J)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "J", "getTimestamp", "()J", "", "()Ljava/util/Map;", "params", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FraudDetectionData implements t30.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String guid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String muid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;
    public static final Parcelable.Creator<FraudDetectionData> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f106940f = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: r30.d$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FraudDetectionData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FraudDetectionData createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new FraudDetectionData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FraudDetectionData[] newArray(int i11) {
            return new FraudDetectionData[i11];
        }
    }

    public FraudDetectionData(String guid, String muid, String sid, long j11) {
        s.k(guid, "guid");
        s.k(muid, "muid");
        s.k(sid, "sid");
        this.guid = guid;
        this.muid = muid;
        this.sid = sid;
        this.timestamp = j11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMuid() {
        return this.muid;
    }

    public final Map<String, String> c() {
        return v0.m(x.a("guid", this.guid), x.a("muid", this.muid), x.a("sid", this.sid));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e(long currentTime) {
        return currentTime - this.timestamp > f106940f;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FraudDetectionData)) {
            return false;
        }
        FraudDetectionData fraudDetectionData = (FraudDetectionData) other;
        return s.f(this.guid, fraudDetectionData.guid) && s.f(this.muid, fraudDetectionData.muid) && s.f(this.sid, fraudDetectionData.sid) && this.timestamp == fraudDetectionData.timestamp;
    }

    public final JSONObject f() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("guid", this.guid).put("muid", this.muid).put("sid", this.sid).put("timestamp", this.timestamp);
        s.j(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public int hashCode() {
        return (((((this.guid.hashCode() * 31) + this.muid.hashCode()) * 31) + this.sid.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "FraudDetectionData(guid=" + this.guid + ", muid=" + this.muid + ", sid=" + this.sid + ", timestamp=" + this.timestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.guid);
        parcel.writeString(this.muid);
        parcel.writeString(this.sid);
        parcel.writeLong(this.timestamp);
    }
}
