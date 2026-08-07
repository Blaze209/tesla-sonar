package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzb implements Parcelable.Creator {
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
        boolean z23 = true;
        boolean z24 = true;
        boolean z25 = true;
        boolean z26 = false;
        boolean z27 = false;
        boolean z28 = false;
        boolean z29 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z31 = false;
        boolean z32 = false;
        int i13 = 0;
        int i14 = 0;
        boolean z33 = false;
        Strategy strategy = null;
        byte[] bArrCreateByteArray = null;
        ParcelUuid parcelUuid = null;
        byte[] bArrCreateByteArray2 = null;
        zzac[] zzacVarArr = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        byte[] bArrCreateByteArray3 = null;
        long j11 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel, header, Strategy.CREATOR);
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
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 7:
                    z26 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, header, ParcelUuid.CREATOR);
                    break;
                case 9:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z17 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    z27 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    z28 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 14:
                    z29 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 15:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 17:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 18:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 19:
                    zzacVarArr = (zzac[]) SafeParcelReader.createTypedArray(parcel, header, zzac.CREATOR);
                    break;
                case 20:
                    z31 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 21:
                    z18 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 22:
                    z32 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 23:
                    z19 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 24:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 25:
                    iArrCreateIntArray2 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 26:
                    z21 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 27:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 28:
                    bArrCreateByteArray3 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 29:
                    z22 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 30:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 31:
                    z33 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 32:
                    z23 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 33:
                    z24 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 34:
                    z25 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new AdvertisingOptions(strategy, z11, z12, z13, z14, bArrCreateByteArray, z26, parcelUuid, z15, z16, z17, z27, z28, z29, i11, i12, bArrCreateByteArray2, j11, zzacVarArr, z31, z18, z32, z19, iArrCreateIntArray, iArrCreateIntArray2, z21, i13, bArrCreateByteArray3, z22, i14, z33, z23, z24, z25);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new AdvertisingOptions[i11];
    }
}
