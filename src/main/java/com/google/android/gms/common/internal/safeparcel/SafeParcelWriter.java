package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.NonNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(@NonNull Parcel parcel) {
        return zzb(parcel, 20293);
    }

    public static void finishObjectHeader(@NonNull Parcel parcel, int i11) {
        zzc(parcel, i11);
    }

    public static void writeBigDecimal(@NonNull Parcel parcel, int i11, @NonNull BigDecimal bigDecimal, boolean z11) {
        if (bigDecimal == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzc(parcel, iZzb);
        }
    }

    public static void writeBigDecimalArray(@NonNull Parcel parcel, int i11, @NonNull BigDecimal[] bigDecimalArr, boolean z11) {
        if (bigDecimalArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i12 = 0; i12 < length; i12++) {
            parcel.writeByteArray(bigDecimalArr[i12].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i12].scale());
        }
        zzc(parcel, iZzb);
    }

    public static void writeBigInteger(@NonNull Parcel parcel, int i11, @NonNull BigInteger bigInteger, boolean z11) {
        if (bigInteger == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzc(parcel, iZzb);
        }
    }

    public static void writeBigIntegerArray(@NonNull Parcel parcel, int i11, @NonNull BigInteger[] bigIntegerArr, boolean z11) {
        if (bigIntegerArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzc(parcel, iZzb);
    }

    public static void writeBoolean(@NonNull Parcel parcel, int i11, boolean z11) {
        zza(parcel, i11, 4);
        parcel.writeInt(z11 ? 1 : 0);
    }

    public static void writeBooleanArray(@NonNull Parcel parcel, int i11, @NonNull boolean[] zArr, boolean z11) {
        if (zArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeBooleanArray(zArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeBooleanList(@NonNull Parcel parcel, int i11, @NonNull List<Boolean> list, boolean z11) {
        if (list == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(list.get(i12).booleanValue() ? 1 : 0);
        }
        zzc(parcel, iZzb);
    }

    public static void writeBooleanObject(@NonNull Parcel parcel, int i11, @NonNull Boolean bool, boolean z11) {
        if (bool != null) {
            zza(parcel, i11, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z11) {
            zza(parcel, i11, 0);
        }
    }

    public static void writeBundle(@NonNull Parcel parcel, int i11, @NonNull Bundle bundle, boolean z11) {
        if (bundle == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeBundle(bundle);
            zzc(parcel, iZzb);
        }
    }

    public static void writeByte(@NonNull Parcel parcel, int i11, byte b11) {
        zza(parcel, i11, 4);
        parcel.writeInt(b11);
    }

    public static void writeByteArray(@NonNull Parcel parcel, int i11, @NonNull byte[] bArr, boolean z11) {
        if (bArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeByteArray(bArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeByteArrayArray(@NonNull Parcel parcel, int i11, @NonNull byte[][] bArr, boolean z11) {
        if (bArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzc(parcel, iZzb);
    }

    public static void writeByteArraySparseArray(@NonNull Parcel parcel, int i11, @NonNull SparseArray<byte[]> sparseArray, boolean z11) {
        if (sparseArray == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(sparseArray.keyAt(i12));
            parcel.writeByteArray(sparseArray.valueAt(i12));
        }
        zzc(parcel, iZzb);
    }

    public static void writeChar(@NonNull Parcel parcel, int i11, char c11) {
        zza(parcel, i11, 4);
        parcel.writeInt(c11);
    }

    public static void writeCharArray(@NonNull Parcel parcel, int i11, @NonNull char[] cArr, boolean z11) {
        if (cArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeCharArray(cArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeDouble(@NonNull Parcel parcel, int i11, double d11) {
        zza(parcel, i11, 8);
        parcel.writeDouble(d11);
    }

    public static void writeDoubleArray(@NonNull Parcel parcel, int i11, @NonNull double[] dArr, boolean z11) {
        if (dArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeDoubleArray(dArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeDoubleList(@NonNull Parcel parcel, int i11, @NonNull List<Double> list, boolean z11) {
        if (list == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeDouble(list.get(i12).doubleValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeDoubleObject(@NonNull Parcel parcel, int i11, @NonNull Double d11, boolean z11) {
        if (d11 != null) {
            zza(parcel, i11, 8);
            parcel.writeDouble(d11.doubleValue());
        } else if (z11) {
            zza(parcel, i11, 0);
        }
    }

    public static void writeDoubleSparseArray(@NonNull Parcel parcel, int i11, @NonNull SparseArray<Double> sparseArray, boolean z11) {
        if (sparseArray == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(sparseArray.keyAt(i12));
            parcel.writeDouble(sparseArray.valueAt(i12).doubleValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeFloat(@NonNull Parcel parcel, int i11, float f11) {
        zza(parcel, i11, 4);
        parcel.writeFloat(f11);
    }

    public static void writeFloatArray(@NonNull Parcel parcel, int i11, @NonNull float[] fArr, boolean z11) {
        if (fArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeFloatArray(fArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeFloatList(@NonNull Parcel parcel, int i11, @NonNull List<Float> list, boolean z11) {
        if (list == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeFloat(list.get(i12).floatValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeFloatObject(@NonNull Parcel parcel, int i11, @NonNull Float f11, boolean z11) {
        if (f11 != null) {
            zza(parcel, i11, 4);
            parcel.writeFloat(f11.floatValue());
        } else if (z11) {
            zza(parcel, i11, 0);
        }
    }

    public static void writeFloatSparseArray(@NonNull Parcel parcel, int i11, @NonNull SparseArray<Float> sparseArray, boolean z11) {
        if (sparseArray == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(sparseArray.keyAt(i12));
            parcel.writeFloat(sparseArray.valueAt(i12).floatValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeIBinder(@NonNull Parcel parcel, int i11, @NonNull IBinder iBinder, boolean z11) {
        if (iBinder == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeStrongBinder(iBinder);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIBinderArray(@NonNull Parcel parcel, int i11, @NonNull IBinder[] iBinderArr, boolean z11) {
        if (iBinderArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeBinderArray(iBinderArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIBinderList(@NonNull Parcel parcel, int i11, @NonNull List<IBinder> list, boolean z11) {
        if (list == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeBinderList(list);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIBinderSparseArray(@NonNull Parcel parcel, int i11, @NonNull SparseArray<IBinder> sparseArray, boolean z11) {
        if (sparseArray == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(sparseArray.keyAt(i12));
            parcel.writeStrongBinder(sparseArray.valueAt(i12));
        }
        zzc(parcel, iZzb);
    }

    public static void writeInt(@NonNull Parcel parcel, int i11, int i12) {
        zza(parcel, i11, 4);
        parcel.writeInt(i12);
    }

    public static void writeIntArray(@NonNull Parcel parcel, int i11, @NonNull int[] iArr, boolean z11) {
        if (iArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeIntArray(iArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeIntegerList(@NonNull Parcel parcel, int i11, @NonNull List<Integer> list, boolean z11) {
        if (list == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(list.get(i12).intValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeIntegerObject(@NonNull Parcel parcel, int i11, @NonNull Integer num, boolean z11) {
        if (num != null) {
            zza(parcel, i11, 4);
            parcel.writeInt(num.intValue());
        } else if (z11) {
            zza(parcel, i11, 0);
        }
    }

    public static void writeList(@NonNull Parcel parcel, int i11, @NonNull List list, boolean z11) {
        if (list == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeList(list);
            zzc(parcel, iZzb);
        }
    }

    public static void writeLong(@NonNull Parcel parcel, int i11, long j11) {
        zza(parcel, i11, 8);
        parcel.writeLong(j11);
    }

    public static void writeLongArray(@NonNull Parcel parcel, int i11, @NonNull long[] jArr, boolean z11) {
        if (jArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeLongArray(jArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeLongList(@NonNull Parcel parcel, int i11, @NonNull List<Long> list, boolean z11) {
        if (list == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeLong(list.get(i12).longValue());
        }
        zzc(parcel, iZzb);
    }

    public static void writeLongObject(@NonNull Parcel parcel, int i11, @NonNull Long l11, boolean z11) {
        if (l11 != null) {
            zza(parcel, i11, 8);
            parcel.writeLong(l11.longValue());
        } else if (z11) {
            zza(parcel, i11, 0);
        }
    }

    public static void writeParcel(@NonNull Parcel parcel, int i11, @NonNull Parcel parcel2, boolean z11) {
        if (parcel2 == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzc(parcel, iZzb);
        }
    }

    public static void writeParcelArray(@NonNull Parcel parcel, int i11, @NonNull Parcel[] parcelArr, boolean z11) {
        if (parcelArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static void writeParcelList(@NonNull Parcel parcel, int i11, @NonNull List<Parcel> list, boolean z11) {
        if (list == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            Parcel parcel2 = list.get(i12);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static void writeParcelSparseArray(@NonNull Parcel parcel, int i11, @NonNull SparseArray<Parcel> sparseArray, boolean z11) {
        if (sparseArray == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(sparseArray.keyAt(i12));
            Parcel parcelValueAt = sparseArray.valueAt(i12);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static void writeParcelable(@NonNull Parcel parcel, int i11, @NonNull Parcelable parcelable, int i12, boolean z11) {
        if (parcelable == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcelable.writeToParcel(parcel, i12);
            zzc(parcel, iZzb);
        }
    }

    public static void writePendingIntent(@NonNull Parcel parcel, int i11, @NonNull PendingIntent pendingIntent, boolean z11) {
        if (pendingIntent == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzc(parcel, iZzb);
        }
    }

    public static void writeShort(@NonNull Parcel parcel, int i11, short s11) {
        zza(parcel, i11, 4);
        parcel.writeInt(s11);
    }

    public static void writeSparseBooleanArray(@NonNull Parcel parcel, int i11, @NonNull SparseBooleanArray sparseBooleanArray, boolean z11) {
        if (sparseBooleanArray == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzc(parcel, iZzb);
        }
    }

    public static void writeSparseIntArray(@NonNull Parcel parcel, int i11, @NonNull SparseIntArray sparseIntArray, boolean z11) {
        if (sparseIntArray == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(sparseIntArray.keyAt(i12));
            parcel.writeInt(sparseIntArray.valueAt(i12));
        }
        zzc(parcel, iZzb);
    }

    public static void writeSparseLongArray(@NonNull Parcel parcel, int i11, @NonNull SparseLongArray sparseLongArray, boolean z11) {
        if (sparseLongArray == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(sparseLongArray.keyAt(i12));
            parcel.writeLong(sparseLongArray.valueAt(i12));
        }
        zzc(parcel, iZzb);
    }

    public static void writeString(@NonNull Parcel parcel, int i11, @NonNull String str, boolean z11) {
        if (str == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeString(str);
            zzc(parcel, iZzb);
        }
    }

    public static void writeStringArray(@NonNull Parcel parcel, int i11, @NonNull String[] strArr, boolean z11) {
        if (strArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeStringArray(strArr);
            zzc(parcel, iZzb);
        }
    }

    public static void writeStringList(@NonNull Parcel parcel, int i11, @NonNull List<String> list, boolean z11) {
        if (list == null) {
            if (z11) {
                zza(parcel, i11, 0);
            }
        } else {
            int iZzb = zzb(parcel, i11);
            parcel.writeStringList(list);
            zzc(parcel, iZzb);
        }
    }

    public static void writeStringSparseArray(@NonNull Parcel parcel, int i11, @NonNull SparseArray<String> sparseArray, boolean z11) {
        if (sparseArray == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(sparseArray.keyAt(i12));
            parcel.writeString(sparseArray.valueAt(i12));
        }
        zzc(parcel, iZzb);
    }

    public static <T extends Parcelable> void writeTypedArray(@NonNull Parcel parcel, int i11, @NonNull T[] tArr, int i12, boolean z11) {
        if (tArr == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        parcel.writeInt(tArr.length);
        for (T t11 : tArr) {
            if (t11 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t11, i12);
            }
        }
        zzc(parcel, iZzb);
    }

    public static <T extends Parcelable> void writeTypedList(@NonNull Parcel parcel, int i11, @NonNull List<T> list, boolean z11) {
        if (list == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            T t11 = list.get(i12);
            if (t11 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t11, 0);
            }
        }
        zzc(parcel, iZzb);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(@NonNull Parcel parcel, int i11, @NonNull SparseArray<T> sparseArray, boolean z11) {
        if (sparseArray == null) {
            if (z11) {
                zza(parcel, i11, 0);
                return;
            }
            return;
        }
        int iZzb = zzb(parcel, i11);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(sparseArray.keyAt(i12));
            T tValueAt = sparseArray.valueAt(i12);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, tValueAt, 0);
            }
        }
        zzc(parcel, iZzb);
    }

    private static void zza(Parcel parcel, int i11, int i12) {
        parcel.writeInt(i11 | (i12 << 16));
    }

    private static int zzb(Parcel parcel, int i11) {
        parcel.writeInt(i11 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzc(Parcel parcel, int i11) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i11 - 4);
        parcel.writeInt(iDataPosition - i11);
        parcel.setDataPosition(iDataPosition);
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i11) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i11);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
