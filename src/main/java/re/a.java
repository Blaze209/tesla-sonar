package re;

import android.os.Parcel;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lre/a;", "", "Lorg/json/JSONObject;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lorg/json/JSONObject;", "", "flags", "Ljn0/h0;", "b", "(Lorg/json/JSONObject;Landroid/os/Parcel;I)V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f107852a = new a();

    private a() {
    }

    public JSONObject a(Parcel parcel) {
        s.k(parcel, "parcel");
        int i11 = parcel.readInt();
        if (i11 == 0) {
            return null;
        }
        if (i11 != 1) {
            throw new IllegalArgumentException("Invalid flag.");
        }
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        return new JSONObject(string);
    }

    public void b(JSONObject jSONObject, Parcel parcel, int i11) {
        s.k(parcel, "parcel");
        if (jSONObject == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jSONObject.toString());
        }
    }
}
