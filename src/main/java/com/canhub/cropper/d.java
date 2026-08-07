package com.canhub.cropper;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB[\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0014\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/canhub/cropper/d;", "Lcom/canhub/cropper/CropImageView$c;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "originalUri", "uriContent", "Ljava/lang/Exception;", "Lkotlin/Exception;", AnalyticsAttribute.Error, "", "cropPoints", "Landroid/graphics/Rect;", "cropRect", "", "rotation", "wholeImageRect", "sampleSize", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;ILandroid/graphics/Rect;I)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "k", "b", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class d extends CropImageView.c implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/canhub/cropper/d$a", "Landroid/os/Parcelable$Creator;", "Lcom/canhub/cropper/d;", "Landroid/os/Parcel;", "in", "a", "(Landroid/os/Parcel;)Lcom/canhub/cropper/d;", "", "size", "", "b", "(I)[Lcom/canhub/cropper/d;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel in2) {
            p013kotlin.jvm.internal.s.k(in2, "in");
            return new d(in2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int size) {
            return new d[size];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i11, Rect rect2, int i12) {
        super(null, uri, null, uri2, exc, fArr, rect, rect2, i11, i12);
        p013kotlin.jvm.internal.s.h(fArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeParcelable(getOriginalUri(), flags);
        dest.writeParcelable(getUriContent(), flags);
        dest.writeSerializable(getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String());
        dest.writeFloatArray(getCropPoints());
        dest.writeParcelable(getCropRect(), flags);
        dest.writeParcelable(getWholeImageRect(), flags);
        dest.writeInt(getRotation());
        dest.writeInt(getSampleSize());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected d(Parcel in2) {
        p013kotlin.jvm.internal.s.k(in2, "in");
        Uri uri = (Uri) in2.readParcelable(Uri.class.getClassLoader());
        Uri uri2 = (Uri) in2.readParcelable(Uri.class.getClassLoader());
        Exception exc = (Exception) in2.readSerializable();
        float[] fArrCreateFloatArray = in2.createFloatArray();
        p013kotlin.jvm.internal.s.h(fArrCreateFloatArray);
        super(null, uri, null, uri2, exc, fArrCreateFloatArray, (Rect) in2.readParcelable(Rect.class.getClassLoader()), (Rect) in2.readParcelable(Rect.class.getClassLoader()), in2.readInt(), in2.readInt());
    }
}
