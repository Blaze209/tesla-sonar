package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzv implements Parcelable.Creator {
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
        boolean z19 = false;
        boolean z21 = false;
        boolean z22 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z23 = false;
        Strategy strategy = null;
        ParcelUuid parcelUuid = null;
        byte[] bArrCreateByteArray = null;
        int[] iArrCreateIntArray = null;
        long j11 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel, header, Strategy.CREATOR);
                    break;
                case 2:
                    z19 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z21 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, header, ParcelUuid.CREATOR);
                    break;
                case 7:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 8:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z22 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 15:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 16:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 17:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 18:
                    z23 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 19:
                    z17 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 20:
                    z18 = SafeParcelReader.readBoolean(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new DiscoveryOptions(strategy, z19, z11, z12, z21, parcelUuid, z13, z14, z15, z22, i11, i12, bArrCreateByteArray, j11, iArrCreateIntArray, z16, z23, z17, z18);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new DiscoveryOptions[i11];
    }
}
