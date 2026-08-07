package expo.modules.location.records;

import android.location.Location;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.fourthline.adapters.serialization.OrcaKeys;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.io.Serializable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ'\u0010)\u001a\u0002H*\"\b\b\u0000\u0010**\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H*0-H\u0000¢\u0006\u0004\b.\u0010/R(\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0016\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0016\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R(\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0016\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R(\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0016\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R(\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0016\u0012\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R(\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0016\u0012\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R(\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0016\u0012\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015¨\u00060"}, d2 = {"Lexpo/modules/location/records/LocationObjectCoords;", "Lexpo/modules/kotlin/records/Record;", "Ljava/io/Serializable;", OrcaKeys.LATITUDE, "", OrcaKeys.LONGITUDE, "altitude", "accuracy", "altitudeAccuracy", "heading", "speed", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "location", "Landroid/location/Location;", "(Landroid/location/Location;)V", "getLatitude$annotations", "()V", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLongitude$annotations", "getLongitude", "setLongitude", "getAltitude$annotations", "getAltitude", "setAltitude", "getAccuracy$annotations", "getAccuracy", "setAccuracy", "getAltitudeAccuracy$annotations", "getAltitudeAccuracy", "setAltitudeAccuracy", "getHeading$annotations", "getHeading", "setHeading", "getSpeed$annotations", "getSpeed", "setSpeed", "toBundle", "BundleType", "Landroid/os/BaseBundle;", "bundleTypeClass", "Ljava/lang/Class;", "toBundle$expo_location_release", "(Ljava/lang/Class;)Landroid/os/BaseBundle;", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationObjectCoords implements Record, Serializable {
    private Double accuracy;
    private Double altitude;
    private Double altitudeAccuracy;
    private Double heading;
    private Double latitude;
    private Double longitude;
    private Double speed;

    public LocationObjectCoords() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Field
    public static /* synthetic */ void getAccuracy$annotations() {
    }

    @Field
    public static /* synthetic */ void getAltitude$annotations() {
    }

    @Field
    public static /* synthetic */ void getAltitudeAccuracy$annotations() {
    }

    @Field
    public static /* synthetic */ void getHeading$annotations() {
    }

    @Field
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @Field
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @Field
    public static /* synthetic */ void getSpeed$annotations() {
    }

    public final Double getAccuracy() {
        return this.accuracy;
    }

    public final Double getAltitude() {
        return this.altitude;
    }

    public final Double getAltitudeAccuracy() {
        return this.altitudeAccuracy;
    }

    public final Double getHeading() {
        return this.heading;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Double getSpeed() {
        return this.speed;
    }

    public final void setAccuracy(Double d11) {
        this.accuracy = d11;
    }

    public final void setAltitude(Double d11) {
        this.altitude = d11;
    }

    public final void setAltitudeAccuracy(Double d11) {
        this.altitudeAccuracy = d11;
    }

    public final void setHeading(Double d11) {
        this.heading = d11;
    }

    public final void setLatitude(Double d11) {
        this.latitude = d11;
    }

    public final void setLongitude(Double d11) {
        this.longitude = d11;
    }

    public final void setSpeed(Double d11) {
        this.speed = d11;
    }

    public final <BundleType extends BaseBundle> BundleType toBundle$expo_location_release(Class<BundleType> bundleTypeClass) {
        s.k(bundleTypeClass, "bundleTypeClass");
        BundleType persistableBundle = s.f(bundleTypeClass, PersistableBundle.class) ? new PersistableBundle() : new Bundle();
        Double d11 = this.latitude;
        if (d11 != null) {
            persistableBundle.putDouble(OrcaKeys.LATITUDE, d11.doubleValue());
        }
        Double d12 = this.longitude;
        if (d12 != null) {
            persistableBundle.putDouble(OrcaKeys.LONGITUDE, d12.doubleValue());
        }
        Double d13 = this.altitude;
        if (d13 != null) {
            persistableBundle.putDouble("altitude", d13.doubleValue());
        }
        Double d14 = this.accuracy;
        if (d14 != null) {
            persistableBundle.putDouble("accuracy", d14.doubleValue());
        }
        Double d15 = this.altitudeAccuracy;
        if (d15 != null) {
            persistableBundle.putDouble("altitudeAccuracy", d15.doubleValue());
        }
        Double d16 = this.heading;
        if (d16 != null) {
            persistableBundle.putDouble("heading", d16.doubleValue());
        }
        Double d17 = this.speed;
        if (d17 != null) {
            persistableBundle.putDouble("speed", d17.doubleValue());
        }
        return persistableBundle;
    }

    public LocationObjectCoords(Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17) {
        this.latitude = d11;
        this.longitude = d12;
        this.altitude = d13;
        this.accuracy = d14;
        this.altitudeAccuracy = d15;
        this.heading = d16;
        this.speed = d17;
    }

    public /* synthetic */ LocationObjectCoords(Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : d12, (i11 & 4) != 0 ? null : d13, (i11 & 8) != 0 ? null : d14, (i11 & 16) != 0 ? null : d15, (i11 & 32) != 0 ? null : d16, (i11 & 64) != 0 ? null : d17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocationObjectCoords(Location location) {
        this(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), Double.valueOf(location.getAltitude()), Double.valueOf(location.getAccuracy()), Build.VERSION.SDK_INT >= 26 ? Double.valueOf(location.getVerticalAccuracyMeters()) : null, Double.valueOf(location.getBearing()), Double.valueOf(location.getSpeed()));
        s.k(location, "location");
    }
}
