package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        boolean z16 = true;
        boolean z17 = true;
        boolean z18 = true;
        boolean z19 = true;
        boolean z21 = true;
        boolean z22 = true;
        boolean z23 = false;
        boolean z24 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z25 = false;
        long j11 = 0;
        byte[] bArrCreateByteArray = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        byte[] bArrCreateByteArray2 = null;
        Strategy strategy = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    z23 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 2:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    z17 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 10:
                    z24 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z18 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    z19 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 15:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 16:
                    iArrCreateIntArray2 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 17:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 18:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel, header, Strategy.CREATOR);
                    break;
                case 19:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 21:
                    z25 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 22:
                    z21 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 23:
                    z22 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ConnectionOptions(z23, z11, z12, z13, z14, z15, z16, z17, bArrCreateByteArray, z24, z18, z19, i11, i12, iArrCreateIntArray, iArrCreateIntArray2, bArrCreateByteArray2, strategy, i13, j11, z25, z21, z22);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new ConnectionOptions[i11];
    }
}
