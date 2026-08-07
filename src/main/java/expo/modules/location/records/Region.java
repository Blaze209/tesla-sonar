package expo.modules.location.records;

import com.fourthline.adapters.serialization.OrcaKeys;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.io.Serializable;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010403H\u0000¢\u0006\u0002\b5R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR(\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010#\u0012\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010#\u0012\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R(\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010,\u0012\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b-\u0010\u0011\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00066"}, d2 = {"Lexpo/modules/location/records/Region;", "Lexpo/modules/kotlin/records/Record;", "Ljava/io/Serializable;", "identifier", "", OrcaKeys.LATITUDE, "", OrcaKeys.LONGITUDE, "notifyOnEnter", "", "notifyOnExit", "radius", "state", "Lexpo/modules/location/records/GeofencingRegionState;", "<init>", "(Ljava/lang/String;DDLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Lexpo/modules/location/records/GeofencingRegionState;)V", "getIdentifier$annotations", "()V", "getIdentifier", "()Ljava/lang/String;", "setIdentifier", "(Ljava/lang/String;)V", "getLatitude$annotations", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude$annotations", "getLongitude", "setLongitude", "getNotifyOnEnter$annotations", "getNotifyOnEnter", "()Ljava/lang/Boolean;", "setNotifyOnEnter", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNotifyOnExit$annotations", "getNotifyOnExit", "setNotifyOnExit", "getRadius$annotations", "getRadius", "()Ljava/lang/Double;", "setRadius", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getState$annotations", "getState", "()Lexpo/modules/location/records/GeofencingRegionState;", "setState", "(Lexpo/modules/location/records/GeofencingRegionState;)V", "toMap", "", "", "toMap$expo_location_release", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Region implements Record, Serializable {
    private String identifier;
    private double latitude;
    private double longitude;
    private Boolean notifyOnEnter;
    private Boolean notifyOnExit;
    private Double radius;
    private GeofencingRegionState state;

    public Region() {
        this(null, 0.0d, 0.0d, null, null, null, null, 127, null);
    }

    @Field
    public static /* synthetic */ void getIdentifier$annotations() {
    }

    @Field
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @Field
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @Field
    public static /* synthetic */ void getNotifyOnEnter$annotations() {
    }

    @Field
    public static /* synthetic */ void getNotifyOnExit$annotations() {
    }

    @Field
    public static /* synthetic */ void getRadius$annotations() {
    }

    @Field
    public static /* synthetic */ void getState$annotations() {
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final Boolean getNotifyOnEnter() {
        return this.notifyOnEnter;
    }

    public final Boolean getNotifyOnExit() {
        return this.notifyOnExit;
    }

    public final Double getRadius() {
        return this.radius;
    }

    public final GeofencingRegionState getState() {
        return this.state;
    }

    public final void setIdentifier(String str) {
        this.identifier = str;
    }

    public final void setLatitude(double d11) {
        this.latitude = d11;
    }

    public final void setLongitude(double d11) {
        this.longitude = d11;
    }

    public final void setNotifyOnEnter(Boolean bool) {
        this.notifyOnEnter = bool;
    }

    public final void setNotifyOnExit(Boolean bool) {
        this.notifyOnExit = bool;
    }

    public final void setRadius(Double d11) {
        this.radius = d11;
    }

    public final void setState(GeofencingRegionState geofencingRegionState) {
        s.k(geofencingRegionState, "<set-?>");
        this.state = geofencingRegionState;
    }

    public final Map<String, Object> toMap$expo_location_release() {
        return v0.m(x.a("identifier", this.identifier), x.a(OrcaKeys.LATITUDE, Double.valueOf(this.latitude)), x.a(OrcaKeys.LONGITUDE, Double.valueOf(this.longitude)), x.a("notifyOnEnter", this.notifyOnEnter), x.a("notifyOnExit", this.notifyOnExit), x.a("radius", this.radius), x.a("state", this.state));
    }

    public Region(String str, double d11, double d12, Boolean bool, Boolean bool2, Double d13, GeofencingRegionState state) {
        s.k(state, "state");
        this.identifier = str;
        this.latitude = d11;
        this.longitude = d12;
        this.notifyOnEnter = bool;
        this.notifyOnExit = bool2;
        this.radius = d13;
        this.state = state;
    }

    public /* synthetic */ Region(String str, double d11, double d12, Boolean bool, Boolean bool2, Double d13, GeofencingRegionState geofencingRegionState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0.0d : d11, (i11 & 4) != 0 ? 0.0d : d12, (i11 & 8) != 0 ? Boolean.TRUE : bool, (i11 & 16) != 0 ? Boolean.TRUE : bool2, (i11 & 32) != 0 ? Double.valueOf(0.0d) : d13, (i11 & 64) != 0 ? GeofencingRegionState.UNKNOWN : geofencingRegionState);
    }
}
