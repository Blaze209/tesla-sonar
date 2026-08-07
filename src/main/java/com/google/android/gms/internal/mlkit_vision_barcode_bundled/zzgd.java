package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.plaid.internal.EnumC4419g;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzgd extends zzdf {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzdf zzd;
    private final zzdf zze;
    private final int zzf;
    private final int zzg;

    static int zzc(int i11) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i11 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i11];
    }

    static zzdf zzy(zzdf zzdfVar, zzdf zzdfVar2) {
        if (zzdfVar2.zzd() == 0) {
            return zzdfVar;
        }
        if (zzdfVar.zzd() == 0) {
            return zzdfVar2;
        }
        int iZzd = zzdfVar.zzd() + zzdfVar2.zzd();
        if (iZzd < 128) {
            return zzz(zzdfVar, zzdfVar2);
        }
        if (zzdfVar instanceof zzgd) {
            zzgd zzgdVar = (zzgd) zzdfVar;
            if (zzgdVar.zze.zzd() + zzdfVar2.zzd() < 128) {
                return new zzgd(zzgdVar.zzd, zzz(zzgdVar.zze, zzdfVar2));
            }
            if (zzgdVar.zzd.zzf() > zzgdVar.zze.zzf() && zzgdVar.zzg > zzdfVar2.zzf()) {
                return new zzgd(zzgdVar.zzd, new zzgd(zzgdVar.zze, zzdfVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzdfVar.zzf(), zzdfVar2.zzf()) + 1) ? new zzgd(zzdfVar, zzdfVar2) : zzfz.zza(new zzfz(null), zzdfVar, zzdfVar2);
    }

    private static zzdf zzz(zzdf zzdfVar, zzdf zzdfVar2) {
        int iZzd = zzdfVar.zzd();
        int iZzd2 = zzdfVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzdfVar.zzv(bArr, 0, 0, iZzd);
        zzdfVar2.zzv(bArr, 0, iZzd, iZzd2);
        return new zzde(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        if (this.zzc != zzdfVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzp = zzp();
        int iZzp2 = zzdfVar.zzp();
        if (iZzp != 0 && iZzp2 != 0 && iZzp != iZzp2) {
            return false;
        }
        zzga zzgaVar = null;
        zzgb zzgbVar = new zzgb(this, zzgaVar);
        zzdd zzddVarZza = zzgbVar.next();
        zzgb zzgbVar2 = new zzgb(zzdfVar, zzgaVar);
        zzdd zzddVarZza2 = zzgbVar2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int iZzd = zzddVarZza.zzd() - i11;
            int iZzd2 = zzddVarZza2.zzd() - i12;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i11 == 0 ? zzddVarZza.zzg(zzddVarZza2, i12, iMin) : zzddVarZza2.zzg(zzddVarZza, i11, iMin))) {
                return false;
            }
            i13 += iMin;
            int i14 = this.zzc;
            if (i13 >= i14) {
                if (i13 == i14) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzddVarZza = zzgbVar.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
            if (iMin == iZzd2) {
                zzddVarZza = zzddVarZza;
                zzddVarZza2 = zzgbVar2.next();
                i12 = 0;
            } else {
                zzddVarZza = zzddVarZza;
                i12 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfx(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zza(int i11) {
        zzdf.zzu(i11, this.zzc);
        return zzb(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    final byte zzb(int i11) {
        int i12 = this.zzf;
        return i11 < i12 ? this.zzd.zzb(i11) : this.zze.zzb(i11 - i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final void zze(byte[] bArr, int i11, int i12, int i13) {
        int i14 = i11 + i13;
        int i15 = this.zzf;
        if (i14 <= i15) {
            this.zzd.zze(bArr, i11, i12, i13);
        } else {
            if (i11 >= i15) {
                this.zze.zze(bArr, i11 - i15, i12, i13);
                return;
            }
            int i16 = i15 - i11;
            this.zzd.zze(bArr, i11, i12, i16);
            this.zze.zze(bArr, 0, i12 + i16, i13 - i16);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final int zzi(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        int i15 = this.zzf;
        if (i14 <= i15) {
            return this.zzd.zzi(i11, i12, i13);
        }
        if (i12 >= i15) {
            return this.zze.zzi(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return this.zze.zzi(this.zzd.zzi(i11, i12, i16), 0, i13 - i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final int zzj(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        int i15 = this.zzf;
        if (i14 <= i15) {
            return this.zzd.zzj(i11, i12, i13);
        }
        if (i12 >= i15) {
            return this.zze.zzj(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return this.zze.zzj(this.zzd.zzj(i11, i12, i16), 0, i13 - i16);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i11, int i12) {
        int iZzo = zzdf.zzo(i11, i12, this.zzc);
        if (iZzo == 0) {
            return zzdf.zzb;
        }
        if (iZzo == this.zzc) {
            return this;
        }
        int i13 = this.zzf;
        if (i12 <= i13) {
            return this.zzd.zzk(i11, i12);
        }
        if (i11 >= i13) {
            return this.zze.zzk(i11 - i13, i12 - i13);
        }
        zzdf zzdfVar = this.zzd;
        return new zzgd(zzdfVar.zzk(i11, zzdfVar.zzd()), this.zze.zzk(0, i12 - this.zzf));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    protected final String zzl(Charset charset) {
        return new String(zzw(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    final void zzm(zzcx zzcxVar) {
        this.zzd.zzm(zzcxVar);
        this.zze.zzm(zzcxVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        zzdf zzdfVar = this.zzd;
        zzdf zzdfVar2 = this.zze;
        return zzdfVar2.zzj(zzdfVar.zzj(0, 0, this.zzf), 0, zzdfVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    /* JADX INFO: renamed from: zzq */
    public final zzdb iterator() {
        return new zzfx(this);
    }

    private zzgd(zzdf zzdfVar, zzdf zzdfVar2) {
        this.zzd = zzdfVar;
        this.zze = zzdfVar2;
        int iZzd = zzdfVar.zzd();
        this.zzf = iZzd;
        this.zzc = iZzd + zzdfVar2.zzd();
        this.zzg = Math.max(zzdfVar.zzf(), zzdfVar2.zzf()) + 1;
    }
}
