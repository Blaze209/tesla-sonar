package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzlz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z14 = false;
        boolean z15 = false;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        int[] iArrCreateIntArray3 = null;
        int[] iArrCreateIntArray4 = null;
        int[] iArrCreateIntArray5 = null;
        float f11 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 2:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 7:
                    iArrCreateIntArray2 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 8:
                    f11 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    iArrCreateIntArray3 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 10:
                    iArrCreateIntArray4 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 11:
                    iArrCreateIntArray5 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 12:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzly(z11, z12, z13, i11, i12, iArrCreateIntArray, iArrCreateIntArray2, f11, iArrCreateIntArray3, iArrCreateIntArray4, iArrCreateIntArray5, z14, z15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzly[i11];
    }
}
