package expo.modules.location;

import android.location.Location;
import expo.modules.kotlin.exception.CodedException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lexpo/modules/location/LocationRequestCallbacks;", "", "Landroid/location/Location;", "location", "Ljn0/h0;", "onLocationChanged", "(Landroid/location/Location;)V", "Lexpo/modules/kotlin/exception/CodedException;", "cause", "onLocationError", "(Lexpo/modules/kotlin/exception/CodedException;)V", "onRequestSuccess", "()V", "onRequestFailed", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LocationRequestCallbacks {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onLocationChanged(LocationRequestCallbacks locationRequestCallbacks, Location location) {
            s.k(location, "location");
        }

        public static void onLocationError(LocationRequestCallbacks locationRequestCallbacks, CodedException cause) {
            s.k(cause, "cause");
        }

        public static void onRequestFailed(LocationRequestCallbacks locationRequestCallbacks, CodedException cause) {
            s.k(cause, "cause");
        }

        public static void onRequestSuccess(LocationRequestCallbacks locationRequestCallbacks) {
        }
    }

    void onLocationChanged(Location location);

    void onLocationError(CodedException cause);

    void onRequestFailed(CodedException cause);

    void onRequestSuccess();
}
