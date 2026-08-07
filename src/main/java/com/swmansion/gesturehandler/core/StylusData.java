package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.swmansion.gesturehandler.core.k, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\u0017B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\""}, d2 = {"Lcom/swmansion/gesturehandler/core/k;", "", "", "tiltX", "tiltY", "altitudeAngle", "azimuthAngle", "pressure", "<init>", "(DDDDD)V", "Lcom/facebook/react/bridge/ReadableMap;", "b", "()Lcom/facebook/react/bridge/ReadableMap;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "getTiltX", "()D", "getTiltY", "c", "getAltitudeAngle", DateTokenConverter.CONVERTER_KEY, "getAzimuthAngle", "e", "f", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StylusData {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double tiltX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double tiltY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double altitudeAngle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double azimuthAngle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double pressure;

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/swmansion/gesturehandler/core/k$a;", "", "<init>", "()V", "", "altitudeAngle", "azimuthAngle", "Lkotlin/Pair;", "b", "(DD)Lkotlin/Pair;", "Landroid/view/MotionEvent;", "event", "Lcom/swmansion/gesturehandler/core/k;", "a", "(Landroid/view/MotionEvent;)Lcom/swmansion/gesturehandler/core/k;", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pair<Double, Double> b(double altitudeAngle, double azimuthAngle) {
            double dAtan;
            double dAtan2;
            if (altitudeAngle < 1.0E-9d) {
                dAtan = 1.5707963267948966d;
                double d11 = (azimuthAngle < 1.0E-9d || Math.abs(azimuthAngle - 6.283185307179586d) < 1.0E-9d) ? 1.5707963267948966d : 0.0d;
                double d12 = azimuthAngle - 1.5707963267948966d;
                double d13 = Math.abs(d12) < 1.0E-9d ? 1.5707963267948966d : 0.0d;
                double d14 = azimuthAngle - 3.141592653589793d;
                dAtan2 = -1.5707963267948966d;
                if (Math.abs(d14) < 1.0E-9d) {
                    d11 = -1.5707963267948966d;
                }
                double d15 = azimuthAngle - 4.71238898038469d;
                if (Math.abs(d15) < 1.0E-9d) {
                    d13 = -1.5707963267948966d;
                }
                if (azimuthAngle > 1.0E-9d && Math.abs(d12) < 1.0E-9d) {
                    d13 = 1.5707963267948966d;
                    d11 = 1.5707963267948966d;
                }
                if (Math.abs(d12) > 1.0E-9d && Math.abs(d14) < 1.0E-9d) {
                    d13 = 1.5707963267948966d;
                    d11 = -1.5707963267948966d;
                }
                if (Math.abs(d14) > 1.0E-9d && Math.abs(d15) < 1.0E-9d) {
                    d13 = -1.5707963267948966d;
                    d11 = -1.5707963267948966d;
                }
                if (Math.abs(d15) <= 1.0E-9d || Math.abs(azimuthAngle - 6.283185307179586d) >= 1.0E-9d) {
                    dAtan2 = d13;
                    dAtan = d11;
                }
            } else {
                double dTan = Math.tan(altitudeAngle);
                dAtan = Math.atan(Math.cos(azimuthAngle) / dTan);
                dAtan2 = Math.atan(Math.sin(azimuthAngle) / dTan);
            }
            return new Pair<>(Double.valueOf(Math.rint(dAtan * 57.29577951308232d)), Double.valueOf(Math.rint(dAtan2 * 57.29577951308232d)));
        }

        public final StylusData a(MotionEvent event) {
            s.k(event, "event");
            double axisValue = 1.5707963267948966d - ((double) event.getAxisValue(25));
            double pressure = event.getPressure(0);
            double orientation = (((double) event.getOrientation(0)) + 1.5707963267948966d) % 6.283185307179586d;
            if (orientation != 0.0d && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
                orientation += 6.283185307179586d;
            }
            double d11 = orientation;
            Pair<Double, Double> pairB = b(axisValue, d11);
            return new StylusData(pairB.e().doubleValue(), pairB.f().doubleValue(), axisValue, d11, pressure);
        }

        private Companion() {
        }
    }

    public StylusData(double d11, double d12, double d13, double d14, double d15) {
        this.tiltX = d11;
        this.tiltY = d12;
        this.altitudeAngle = d13;
        this.azimuthAngle = d14;
        this.pressure = d15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getPressure() {
        return this.pressure;
    }

    public final ReadableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("tiltX", this.tiltX);
        writableMapCreateMap.putDouble("tiltY", this.tiltY);
        writableMapCreateMap.putDouble("altitudeAngle", this.altitudeAngle);
        writableMapCreateMap.putDouble("azimuthAngle", this.azimuthAngle);
        writableMapCreateMap.putDouble("pressure", this.pressure);
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StylusData)) {
            return false;
        }
        StylusData stylusData = (StylusData) other;
        return Double.compare(this.tiltX, stylusData.tiltX) == 0 && Double.compare(this.tiltY, stylusData.tiltY) == 0 && Double.compare(this.altitudeAngle, stylusData.altitudeAngle) == 0 && Double.compare(this.azimuthAngle, stylusData.azimuthAngle) == 0 && Double.compare(this.pressure, stylusData.pressure) == 0;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.tiltX) * 31) + Double.hashCode(this.tiltY)) * 31) + Double.hashCode(this.altitudeAngle)) * 31) + Double.hashCode(this.azimuthAngle)) * 31) + Double.hashCode(this.pressure);
    }

    public String toString() {
        return "StylusData(tiltX=" + this.tiltX + ", tiltY=" + this.tiltY + ", altitudeAngle=" + this.altitudeAngle + ", azimuthAngle=" + this.azimuthAngle + ", pressure=" + this.pressure + ")";
    }

    public /* synthetic */ StylusData(double d11, double d12, double d13, double d14, double d15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? 0.0d : d12, (i11 & 4) != 0 ? 0.0d : d13, (i11 & 8) != 0 ? 0.0d : d14, (i11 & 16) != 0 ? -1.0d : d15);
    }
}
