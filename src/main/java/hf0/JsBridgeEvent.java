package hf0;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: hf0.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001e"}, d2 = {"Lhf0/e;", "Landroid/os/Parcelable;", "Lcom/tesla/logging/a$a;", "event", "", "jsonObjectString", "<init>", "(Lcom/tesla/logging/a$a;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/tesla/logging/a$a;", "()Lcom/tesla/logging/a$a;", "b", "Ljava/lang/String;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JsBridgeEvent implements Parcelable {
    public static final Parcelable.Creator<JsBridgeEvent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.tesla.logging.a.EnumC1131a event;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String jsonObjectString;

    /* JADX INFO: renamed from: hf0.e$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JsBridgeEvent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JsBridgeEvent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new JsBridgeEvent(com.tesla.logging.a.EnumC1131a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JsBridgeEvent[] newArray(int i11) {
            return new JsBridgeEvent[i11];
        }
    }

    public JsBridgeEvent(com.tesla.logging.a.EnumC1131a event, String jsonObjectString) {
        s.k(event, "event");
        s.k(jsonObjectString, "jsonObjectString");
        this.event = event;
        this.jsonObjectString = jsonObjectString;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.tesla.logging.a.EnumC1131a getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getJsonObjectString() {
        return this.jsonObjectString;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsBridgeEvent)) {
            return false;
        }
        JsBridgeEvent jsBridgeEvent = (JsBridgeEvent) other;
        return this.event == jsBridgeEvent.event && s.f(this.jsonObjectString, jsBridgeEvent.jsonObjectString);
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.jsonObjectString.hashCode();
    }

    public String toString() {
        return "JsBridgeEvent(event=" + this.event + ", jsonObjectString=" + this.jsonObjectString + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.event.name());
        dest.writeString(this.jsonObjectString);
    }
}
