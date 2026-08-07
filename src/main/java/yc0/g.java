package yc0;

import org.json.JSONObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lyc0/g;", "", "<init>", "()V", "Lorg/json/JSONObject;", "vehicleState", "", "c", "(Lorg/json/JSONObject;)Z", "b", "a", "json2proto_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f125367a = new g();

    private g() {
    }

    public final boolean a(JSONObject vehicleState) {
        if (vehicleState != null) {
            return vehicleState.has("sentry_mode_available");
        }
        return false;
    }

    public final boolean b(JSONObject vehicleState) {
        if (vehicleState != null) {
            return vehicleState.has("sentry_mode");
        }
        return false;
    }

    public final boolean c(JSONObject vehicleState) {
        return vehicleState != null && b(vehicleState) && a(vehicleState);
    }
}
