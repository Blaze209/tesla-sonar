package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzmj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z11 = false;
        byte[] bArrCreateByteArray = null;
        zznr zznrVar = null;
        zzox[] zzoxVarArr = null;
        byte[] bArrCreateByteArray2 = null;
        zzox zzoxVar = null;
        zzlw zzlwVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 4:
                    zznrVar = (zznr) SafeParcelReader.createParcelable(parcel, header, zznr.CREATOR);
                    break;
                case 5:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    zzoxVarArr = (zzox[]) SafeParcelReader.createTypedArray(parcel, header, zzox.CREATOR);
                    break;
                case 7:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 9:
                    zzoxVar = (zzox) SafeParcelReader.createParcelable(parcel, header, zzox.CREATOR);
                    break;
                case 10:
                    zzlwVar = (zzlw) SafeParcelReader.createParcelable(parcel, header, zzlw.CREATOR);
                    break;
                case 11:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzmi(i11, i12, bArrCreateByteArray, zznrVar, i13, zzoxVarArr, i14, bArrCreateByteArray2, zzoxVar, zzlwVar, i15, i16, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzmi[i11];
    }
}
