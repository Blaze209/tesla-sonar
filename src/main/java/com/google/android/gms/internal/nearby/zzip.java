package com.google.android.gms.internal.nearby;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.util.Hex;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class zzip {
    private static final ParcelUuid zza = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    private final int zzb;
    private final List zzc;
    private final SparseArray zzd;
    private final Map zze;
    private final int zzf;
    private final String zzg;
    private final byte[] zzh;

    private zzip(List list, SparseArray sparseArray, Map map, int i11, int i12, String str, byte[] bArr) {
        this.zzc = list;
        this.zzd = sparseArray;
        this.zze = map;
        this.zzg = str;
        this.zzb = i11;
        this.zzf = i12;
        this.zzh = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    public static zzip zza(byte[] bArr) {
        byte[] bArr2;
        ArrayList arrayList;
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        HashMap map = new HashMap();
        int i11 = -1;
        int i12 = 0;
        String str = null;
        byte b11 = -2147483648;
        try {
            while (i12 < bArr.length) {
                try {
                    int i13 = i12 + 1;
                    int i14 = bArr[i12] & 255;
                    if (i14 == 0) {
                        if (true != arrayList2.isEmpty()) {
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        bArr2 = bArr;
                        return new zzip(arrayList, sparseArray, map, i11, b11, str, bArr2);
                    }
                    int i15 = i14 - 1;
                    int i16 = i12 + 2;
                    int i17 = bArr[i13] & 255;
                    if (i17 == 22) {
                        map.put(zzc(zzd(bArr, i16, 2)), zzd(bArr, i12 + 4, i14 - 3));
                    } else if (i17 != 255) {
                        switch (i17) {
                            case 1:
                                i11 = bArr[i16] & 255;
                                break;
                            case 2:
                            case 3:
                                zzb(bArr, i16, i15, 2, arrayList2);
                                break;
                            case 4:
                            case 5:
                                zzb(bArr, i16, i15, 4, arrayList2);
                                break;
                            case 6:
                            case 7:
                                zzb(bArr, i16, i15, 16, arrayList2);
                                break;
                            case 8:
                            case 9:
                                str = new String(zzd(bArr, i16, i15));
                                break;
                            case 10:
                                b11 = bArr[i16];
                                break;
                        }
                    } else {
                        sparseArray.put(((bArr[i12 + 3] & 255) << 8) + (255 & bArr[i16]), zzd(bArr, i12 + 4, i14 - 3));
                    }
                    i12 = i16 + i15;
                } catch (Exception e11) {
                    e = e11;
                    bArr2 = bArr;
                }
            }
            return new zzip(arrayList, sparseArray, map, i11, b11, str, bArr2);
        } catch (Exception e12) {
            e = e12;
            Log.w("BleRecord", "Unable to parse scan record: ".concat(String.valueOf(Arrays.toString(bArr2))), e);
            return null;
        }
        if (true != arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        bArr2 = bArr;
    }

    private static int zzb(byte[] bArr, int i11, int i12, int i13, List list) {
        while (i12 > 0) {
            list.add(zzc(zzd(bArr, i11, i13)));
            i12 -= i13;
            i11 += i13;
        }
        return i11;
    }

    private static ParcelUuid zzc(byte[] bArr) {
        long j11;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        }
        if (length == 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j11 = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
        } else {
            j11 = ((long) ((bArr[3] & 255) << 24)) + ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16));
        }
        ParcelUuid parcelUuid = zza;
        return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j11 << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }

    private static byte[] zzd(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzip) {
            return Arrays.equals(this.zzh, ((zzip) obj).zzh);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String string;
        String strValueOf = String.valueOf(this.zzc);
        StringBuilder sb2 = new StringBuilder();
        SparseArray sparseArray = this.zzd;
        int i11 = 0;
        String string2 = "{}";
        if (sparseArray.size() <= 0) {
            string = "{}";
        } else {
            sb2.append(CoreConstants.CURLY_LEFT);
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                int iKeyAt = sparseArray.keyAt(i12);
                byte[] bArr = (byte[]) sparseArray.valueAt(i12);
                sb2.append(iKeyAt);
                sb2.append('=');
                sb2.append(bArr == null ? null : Hex.bytesToStringUppercase(bArr));
            }
            sb2.append(CoreConstants.CURLY_RIGHT);
            string = sb2.toString();
        }
        Map map = this.zze;
        StringBuilder sb3 = new StringBuilder();
        if (!map.keySet().isEmpty()) {
            sb3.append(CoreConstants.CURLY_LEFT);
            for (Map.Entry entry : map.entrySet()) {
                if (i11 > 0) {
                    sb3.append(", ");
                }
                sb3.append(entry.getKey());
                sb3.append('=');
                byte[] bArr2 = (byte[]) entry.getValue();
                sb3.append(bArr2 == null ? null : Hex.bytesToStringUppercase(bArr2));
                i11++;
            }
            sb3.append(CoreConstants.CURLY_RIGHT);
            string2 = sb3.toString();
        }
        return "BleRecord [mAdvertiseFlags=" + this.zzb + ", mServiceUuids=" + strValueOf + ", mManufacturerSpecificData=" + string + ", mServiceData=" + string2 + ", mTxPowerLevel=" + this.zzf + ", mDeviceName=" + this.zzg + "]";
    }
}
