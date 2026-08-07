package expo.modules.location.records;

import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.kotlin.records.Field;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lexpo/modules/location/records/Heading;", "", "trueHeading", "", "magHeading", "accuracy", "", "<init>", "(FFI)V", "getTrueHeading$annotations", "()V", "getTrueHeading", "()F", "setTrueHeading", "(F)V", "getMagHeading$annotations", "getMagHeading", "setMagHeading", "getAccuracy$annotations", "getAccuracy", "()I", "setAccuracy", "(I)V", "toBundle", "Landroid/os/Bundle;", "toBundle$expo_location_release", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Heading {
    private int accuracy;
    private float magHeading;
    private float trueHeading;

    public Heading() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 7, null);
    }

    @Field
    public static /* synthetic */ void getAccuracy$annotations() {
    }

    @Field
    public static /* synthetic */ void getMagHeading$annotations() {
    }

    @Field
    public static /* synthetic */ void getTrueHeading$annotations() {
    }

    public final int getAccuracy() {
        return this.accuracy;
    }

    public final float getMagHeading() {
        return this.magHeading;
    }

    public final float getTrueHeading() {
        return this.trueHeading;
    }

    public final void setAccuracy(int i11) {
        this.accuracy = i11;
    }

    public final void setMagHeading(float f11) {
        this.magHeading = f11;
    }

    public final void setTrueHeading(float f11) {
        this.trueHeading = f11;
    }

    public final Bundle toBundle$expo_location_release() {
        Bundle bundle = new Bundle();
        bundle.putFloat("trueHeading", this.trueHeading);
        bundle.putFloat("magHeading", this.magHeading);
        bundle.putInt("accuracy", this.accuracy);
        return bundle;
    }

    public Heading(float f11, float f12, int i11) {
        this.trueHeading = f11;
        this.magHeading = f12;
        this.accuracy = i11;
    }

    public /* synthetic */ Heading(float f11, float f12, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -1.0f : f11, (i12 & 2) != 0 ? -1.0f : f12, (i12 & 4) != 0 ? 0 : i11);
    }
}
