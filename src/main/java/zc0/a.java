package zc0;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.tesla.logging.TeslaLog;
import java.io.IOException;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lzc0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "", "locale", "Lzc0/b;", "callback", "Ljn0/h0;", "c", "(DDLjava/lang/String;Lzc0/b;)V", "a", "Landroid/content/Context;", "Landroid/location/Geocoder;", "b", "Landroid/location/Geocoder;", "geocoder", "location-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f128055d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Geocoder geocoder;

    /* JADX INFO: renamed from: zc0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzc0/a$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzc0/a;", "a", "(Landroid/content/Context;)Lzc0/a;", "", "TAG", "Ljava/lang/String;", "NAME", "CITY_NAME", "STREET_NAME", "REGION_NAME", "COUNTRY_NAME", "POSTAL_CODE", "COUNTRY_CODE", "STREET_PREFIX", "INSTANCE", "Lzc0/a;", "location-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized a a(Context context) {
            a aVar;
            try {
                s.k(context, "context");
                if (a.f128055d == null) {
                    a.f128055d = new a(context, null);
                }
                aVar = a.f128055d;
                s.h(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
            return aVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ a(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public final void c(double latitude, double longitude, String locale, b callback) {
        s.k(callback, "callback");
        WritableArray writableNativeArray = new WritableNativeArray();
        if (!Geocoder.isPresent()) {
            callback.a(new Error("NO_GEOCODER"));
            return;
        }
        try {
            List<Address> fromLocation = this.geocoder.getFromLocation(latitude, longitude, 1);
            if (fromLocation == null) {
                callback.a(new Error("NO_ADDRESSES"));
                return;
            }
            if (fromLocation.isEmpty() || fromLocation.get(0).getMaxAddressLineIndex() < 0) {
                callback.b(writableNativeArray);
                return;
            }
            Address address = fromLocation.get(0);
            StringBuilder sb2 = new StringBuilder();
            try {
                String addressLine = address.getAddressLine(0);
                s.j(addressLine, "getAddressLine(...)");
                String addressLine2 = address.getAddressLine(0);
                s.j(addressLine2, "getAddressLine(...)");
                String strSubstring = addressLine.substring(0, t.u0(addressLine2, CoreConstants.COMMA_CHAR, 0, false, 6, null));
                s.j(strSubstring, "substring(...)");
                sb2.append(strSubstring);
            } catch (Exception unused) {
                if (address.getThoroughfare() != null) {
                    if (address.getSubThoroughfare() != null) {
                        sb2.append(address.getSubThoroughfare());
                    }
                    sb2.append(" ");
                    sb2.append(address.getThoroughfare());
                } else if (address.getFeatureName() != null) {
                    sb2.append(address.getFeatureName());
                } else {
                    sb2.append("");
                }
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("street_prefix", address.getSubThoroughfare());
            writableNativeMap.putString("street", sb2.toString());
            writableNativeMap.putString("name", sb2.toString());
            writableNativeMap.putString("city", address.getLocality() == null ? address.getFeatureName() : address.getLocality());
            writableNativeMap.putString("region", address.getAdminArea());
            writableNativeMap.putString(PlaceTypes.COUNTRY, address.getCountryName());
            writableNativeMap.putString("postalCode", address.getPostalCode());
            writableNativeMap.putString("isoCountryCode", address.getCountryCode());
            writableNativeArray.pushMap(writableNativeMap);
            callback.b(writableNativeArray);
        } catch (Exception e11) {
            if (e11 instanceof IOException) {
                TeslaLog.INSTANCE.i("LocationServicesHelper", "Failed to get address from location: " + e11);
            } else {
                TeslaLog.INSTANCE.e("LocationServicesHelper", "Failed to get address from location", e11);
            }
            callback.a(new Error(e11.getMessage()));
        }
    }

    private a(Context context) {
        this.context = context;
        this.geocoder = new Geocoder(context);
    }
}
