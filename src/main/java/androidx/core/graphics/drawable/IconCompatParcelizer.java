package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f7620a = versionedParcel.p(iconCompat.f7620a, 1);
        iconCompat.f7622c = versionedParcel.j(iconCompat.f7622c, 2);
        iconCompat.f7623d = versionedParcel.r(iconCompat.f7623d, 3);
        iconCompat.f7624e = versionedParcel.p(iconCompat.f7624e, 4);
        iconCompat.f7625f = versionedParcel.p(iconCompat.f7625f, 5);
        iconCompat.f7626g = (ColorStateList) versionedParcel.r(iconCompat.f7626g, 6);
        iconCompat.f7628i = versionedParcel.t(iconCompat.f7628i, 7);
        iconCompat.f7629j = versionedParcel.t(iconCompat.f7629j, 8);
        iconCompat.k();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.l(versionedParcel.f());
        int i11 = iconCompat.f7620a;
        if (-1 != i11) {
            versionedParcel.F(i11, 1);
        }
        byte[] bArr = iconCompat.f7622c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f7623d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i12 = iconCompat.f7624e;
        if (i12 != 0) {
            versionedParcel.F(i12, 4);
        }
        int i13 = iconCompat.f7625f;
        if (i13 != 0) {
            versionedParcel.F(i13, 5);
        }
        ColorStateList colorStateList = iconCompat.f7626g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f7628i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f7629j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
