package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzkb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        byte[] bArrCreateByteArray = null;
        byte[] bArrCreateByteArray2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
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
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    f11 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    f12 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 10:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 11:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 14:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzka(i11, i12, i13, i14, i15, j11, j12, f11, f12, j13, j14, i16, bArrCreateByteArray, bArrCreateByteArray2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzka[i11];
    }
}
