package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "ParcelByteArrayCreator", creatorIsFinal = false)
@SafeParcelable.Reserved({1000})
public final class zzhg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhg> CREATOR = new zzhd();
    private byte[] zza;

    @SafeParcelable.Field(getter = "getDataPfd", id = 1)
    private ParcelFileDescriptor zzb;

    private zzhg() {
        this.zza = new byte[0];
    }

    static byte[] zzd(ParcelFileDescriptor parcelFileDescriptor) {
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                zze(dataInputStream);
                return bArr;
            } catch (IOException e11) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e11);
            }
        } catch (Throwable th2) {
            zze(dataInputStream);
            throw th2;
        }
    }

    private static void zze(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e11) {
            Log.w("ParcelByteArray", "Could not close stream", e11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhg) {
            return Arrays.equals(this.zza, ((zzhg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e A[PHI: r5
      0x009e: PHI (r5v4 java.io.DataOutputStream) = (r5v3 java.io.DataOutputStream), (r5v5 java.io.DataOutputStream) binds: [B:42:0x00bc, B:37:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0061: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:98), block:B:20:0x0061 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) throws Throwable {
        Closeable closeable;
        DataOutputStream dataOutputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        byte[] bArr = this.zza;
        Closeable closeable2 = null;
        if (bArr != null) {
            try {
                if (this.zzb == null) {
                    try {
                        try {
                            File fileZzb = zzhm.zzb();
                            if (fileZzb == null) {
                                throw new IllegalStateException("Must set temp dir before writing this object to a parcel");
                            }
                            try {
                                File fileCreateTempFile = File.createTempFile("teleporter" + SystemClock.elapsedRealtime(), ".tmp", fileZzb);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                                    fileCreateTempFile.delete();
                                    Pair pairCreate = Pair.create(fileOutputStream, parcelFileDescriptorOpen);
                                    dataOutputStream = new DataOutputStream(new BufferedOutputStream((OutputStream) pairCreate.first));
                                    try {
                                        dataOutputStream.writeInt(bArr.length);
                                        dataOutputStream.write(bArr);
                                        parcelFileDescriptor = (ParcelFileDescriptor) pairCreate.second;
                                        zze(dataOutputStream);
                                    } catch (IOException e11) {
                                        e = e11;
                                        Log.e("ParcelByteArray", "Could not write into unlinked file. " + e.toString());
                                        if (dataOutputStream != null) {
                                            zze(dataOutputStream);
                                        }
                                        parcelFileDescriptor = null;
                                    } catch (IllegalStateException e12) {
                                        e = e12;
                                        Log.e("ParcelByteArray", "Could not create unlinked file. " + e.toString());
                                        if (dataOutputStream != null) {
                                            zze(dataOutputStream);
                                        }
                                        parcelFileDescriptor = null;
                                    }
                                    this.zzb = parcelFileDescriptor;
                                } catch (FileNotFoundException e13) {
                                    throw new IllegalStateException("Temporary file is somehow already deleted", e13);
                                }
                            } catch (IOException e14) {
                                throw new IllegalStateException("Could not create temporary file", e14);
                            }
                        } catch (IOException e15) {
                            e = e15;
                            dataOutputStream = null;
                        }
                    } catch (IllegalStateException e16) {
                        e = e16;
                        dataOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (closeable2 != null) {
                            zze(closeable2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeable2 = closeable;
            }
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i11 | 1, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        this.zzb = null;
    }

    public final byte[] zzc() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    zzhg(@SafeParcelable.Param(id = 1) ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = new byte[0];
        this.zzb = parcelFileDescriptor;
    }
}
