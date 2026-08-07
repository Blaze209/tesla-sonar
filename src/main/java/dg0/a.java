package dg0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001c"}, d2 = {"Ldg0/a;", "Landroid/os/Parcelable;", "", "", "averageBrightness3x3", "<init>", "([Ljava/lang/Float;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "[Ljava/lang/Float;", "getAverageBrightness3x3", "()[Ljava/lang/Float;", DateTokenConverter.CONVERTER_KEY, "()F", "topBrightness", "bottomBrightness", "b", "leftBrightness", "c", "rightBrightness", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1236a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Float[] averageBrightness3x3;

    /* JADX INFO: renamed from: dg0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C1236a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            int i11 = parcel.readInt();
            Float[] fArr = new Float[i11];
            for (int i12 = 0; i12 != i11; i12++) {
                fArr[i12] = Float.valueOf(parcel.readFloat());
            }
            return new a(fArr);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final float a() {
        return ((this.averageBrightness3x3[7].floatValue() * 2.0f) + ((this.averageBrightness3x3[6].floatValue() + this.averageBrightness3x3[8].floatValue()) * 0.5f)) / 3;
    }

    public final float b() {
        return ((this.averageBrightness3x3[3].floatValue() * 2.0f) + ((this.averageBrightness3x3[0].floatValue() + this.averageBrightness3x3[6].floatValue()) * 0.5f)) / 3;
    }

    public final float c() {
        return ((this.averageBrightness3x3[5].floatValue() * 2.0f) + ((this.averageBrightness3x3[2].floatValue() + this.averageBrightness3x3[8].floatValue()) * 0.5f)) / 3;
    }

    public final float d() {
        return ((this.averageBrightness3x3[1].floatValue() * 2.0f) + ((this.averageBrightness3x3[0].floatValue() + this.averageBrightness3x3[2].floatValue()) * 0.5f)) / 3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        Float[] fArr = this.averageBrightness3x3;
        int length = fArr.length;
        dest.writeInt(length);
        for (int i11 = 0; i11 != length; i11++) {
            dest.writeFloat(fArr[i11].floatValue());
        }
    }

    public a(Float[] averageBrightness3x3) {
        s.k(averageBrightness3x3, "averageBrightness3x3");
        this.averageBrightness3x3 = averageBrightness3x3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(Float[] fArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            Float[] fArr2 = new Float[9];
            for (int i12 = 0; i12 < 9; i12++) {
                fArr2[i12] = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            }
            fArr = fArr2;
        }
        this(fArr);
    }
}
