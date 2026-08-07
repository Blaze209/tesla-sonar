package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        int i12 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = Float.MAX_VALUE;
        float f19 = Float.MAX_VALUE;
        float f21 = Float.MAX_VALUE;
        zzn[] zznVarArr = null;
        zzd[] zzdVarArr = null;
        float f22 = -1.0f;
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
                    f11 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 4:
                    f12 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 5:
                    f13 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 6:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f18 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    f19 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    zznVarArr = (zzn[]) SafeParcelReader.createTypedArray(parcel, header, zzn.CREATOR);
                    break;
                case 10:
                    f15 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 11:
                    f16 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f17 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    zzdVarArr = (zzd[]) SafeParcelReader.createTypedArray(parcel, header, zzd.CREATOR);
                    break;
                case 14:
                    f21 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 15:
                    f22 = SafeParcelReader.readFloat(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzf(i11, i12, f11, f12, f13, f14, f18, f19, f21, zznVarArr, f15, f16, f17, zzdVarArr, f22);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzf[i11];
    }
}
