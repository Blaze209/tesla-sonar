package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
class zzge extends zzgf {
    private volatile zzgf zza;
    final zzgb zzb;
    final Character zzc;

    zzge(zzgb zzgbVar, Character ch2) {
        this.zzb = zzgbVar;
        if (ch2 != null && zzgbVar.zzc('=')) {
            throw new IllegalArgumentException(zzbo.zza("Padding character %s was already in alphabet", ch2));
        }
        this.zzc = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzge) {
            zzge zzgeVar = (zzge) obj;
            if (this.zzb.equals(zzgeVar.zzb) && Objects.equals(this.zzc, zzgeVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzc;
        return Objects.hashCode(ch2) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    zzgf zza(zzgb zzgbVar, Character ch2) {
        return new zzge(zzgbVar, ch2);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    void zzb(Appendable appendable, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        zzbm.zze(0, i12, bArr.length);
        while (i13 < i12) {
            zze(appendable, bArr, i13, Math.min(this.zzb.zzd, i12 - i13));
            i13 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    final int zzc(int i11) {
        zzgb zzgbVar = this.zzb;
        return zzgbVar.zzc * zzgh.zza(i11, zzgbVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public final zzgf zzd() {
        zzgf zzgfVarZza = this.zza;
        if (zzgfVarZza == null) {
            zzgb zzgbVar = this.zzb;
            zzgb zzgbVarZzb = zzgbVar.zzb();
            zzgfVarZza = zzgbVarZzb == zzgbVar ? this : zza(zzgbVarZzb, this.zzc);
            this.zza = zzgfVarZza;
        }
        return zzgfVarZza;
    }

    final void zze(Appendable appendable, byte[] bArr, int i11, int i12) {
        zzbm.zze(i11, i11 + i12, bArr.length);
        int i13 = 0;
        zzbm.zzc(i12 <= this.zzb.zzd);
        long j11 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            j11 = (j11 | ((long) (bArr[i11 + i14] & 255))) << 8;
        }
        int i15 = (i12 + 1) * 8;
        zzgb zzgbVar = this.zzb;
        while (i13 < i12 * 8) {
            long j12 = j11 >>> ((i15 - zzgbVar.zzb) - i13);
            zzgb zzgbVar2 = this.zzb;
            appendable.append(zzgbVar2.zza(((int) j12) & zzgbVar2.zza));
            i13 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i13 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i13 += this.zzb.zzb;
            }
        }
    }

    zzge(String str, String str2, Character ch2) {
        this(new zzgb(str, str2.toCharArray()), ch2);
    }
}
