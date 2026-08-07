package zf0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: zf0.h0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lzf0/h0;", "Landroid/os/Parcelable;", "", "luminosity", "rmsContrast", "lowHighContrast", "", "sampleSize", "<init>", "(DDDI)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "c", DateTokenConverter.CONVERTER_KEY, "I", "getSampleSize", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageLightCondition implements Parcelable {
    public static final Parcelable.Creator<ImageLightCondition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double luminosity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double rmsContrast;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double lowHighContrast;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int sampleSize;

    /* JADX INFO: renamed from: zf0.h0$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageLightCondition> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageLightCondition createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ImageLightCondition(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ImageLightCondition[] newArray(int i11) {
            return new ImageLightCondition[i11];
        }
    }

    public ImageLightCondition(double d11, double d12, double d13, int i11) {
        this.luminosity = d11;
        this.rmsContrast = d12;
        this.lowHighContrast = d13;
        this.sampleSize = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getLowHighContrast() {
        return this.lowHighContrast;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getLuminosity() {
        return this.luminosity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getRmsContrast() {
        return this.rmsContrast;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageLightCondition)) {
            return false;
        }
        ImageLightCondition imageLightCondition = (ImageLightCondition) other;
        return Double.compare(this.luminosity, imageLightCondition.luminosity) == 0 && Double.compare(this.rmsContrast, imageLightCondition.rmsContrast) == 0 && Double.compare(this.lowHighContrast, imageLightCondition.lowHighContrast) == 0 && this.sampleSize == imageLightCondition.sampleSize;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.luminosity) * 31) + Double.hashCode(this.rmsContrast)) * 31) + Double.hashCode(this.lowHighContrast)) * 31) + Integer.hashCode(this.sampleSize);
    }

    public String toString() {
        return "ImageLightCondition(luminosity=" + this.luminosity + ", rmsContrast=" + this.rmsContrast + ", lowHighContrast=" + this.lowHighContrast + ", sampleSize=" + this.sampleSize + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeDouble(this.luminosity);
        dest.writeDouble(this.rmsContrast);
        dest.writeDouble(this.lowHighContrast);
        dest.writeInt(this.sampleSize);
    }
}
