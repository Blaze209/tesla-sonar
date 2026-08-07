package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes5.dex */
final class zzda extends zzde {
    private final int zzc;
    private final int zzd;

    zzda(byte[] bArr, int i11, int i12) {
        super(bArr);
        zzdf.zzo(i11, i11 + i12, bArr.length);
        this.zzc = i11;
        this.zzd = i12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zza(int i11) {
        zzdf.zzu(i11, this.zzd);
        return ((zzde) this).zza[this.zzc + i11];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    final byte zzb(int i11) {
        return ((zzde) this).zza[this.zzc + i11];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final void zze(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(((zzde) this).zza, this.zzc + i11, bArr, i12, i13);
    }
}
