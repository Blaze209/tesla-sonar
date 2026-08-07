package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes5.dex */
final class zzlc extends zzlg {
    private final int zzc;

    zzlc(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzlh.zzj(0, i12, bArr.length);
        this.zzc = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zza(int i11) {
        int i12 = this.zzc;
        if (((i12 - (i11 + 1)) | i11) >= 0) {
            return ((zzlg) this).zza[i11];
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 11);
            sb2.append("Index < 0: ");
            sb2.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 18 + String.valueOf(i12).length());
        sb3.append("Index > length: ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(i12);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    final byte zzb(int i11) {
        return ((zzlg) this).zza[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    protected final int zzd() {
        return 0;
    }
}
