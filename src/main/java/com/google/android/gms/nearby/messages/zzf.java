package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1000) {
                switch (fieldId) {
                    case 1:
                        i12 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 2:
                        i13 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 3:
                        i14 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 4:
                        z11 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 5:
                        i15 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 6:
                        i16 = SafeParcelReader.readInt(parcel, header);
                        break;
                    case 7:
                        i17 = SafeParcelReader.readInt(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                i11 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Strategy(i11, i12, i13, i14, z11, i15, i16, i17);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new Strategy[i11];
    }
}
