package com.google.android.gms.internal.nearby;

import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
class zzqe extends zzqf {
    final zzpz zzb;
    final Character zzc;

    zzqe(zzpz zzpzVar, Character ch2) {
        this.zzb = zzpzVar;
        boolean z11 = true;
        if (ch2 != null && zzpzVar.zzd('=')) {
            z11 = false;
        }
        zzpm.zzg(z11, "Padding character %s was already in alphabet", ch2);
        this.zzc = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzqe) {
            zzqe zzqeVar = (zzqe) obj;
            if (this.zzb.equals(zzqeVar.zzb) && Objects.equals(this.zzc, zzqeVar.zzc)) {
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

    @Override // com.google.android.gms.internal.nearby.zzqf
    int zza(byte[] bArr, CharSequence charSequence) throws zzqc {
        zzpz zzpzVar;
        CharSequence charSequenceZzf = zzf(charSequence);
        if (!this.zzb.zzc(charSequenceZzf.length())) {
            throw new zzqc("Invalid input length " + charSequenceZzf.length());
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceZzf.length()) {
            long jZzb = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                zzpzVar = this.zzb;
                if (i13 >= zzpzVar.zzc) {
                    break;
                }
                jZzb <<= zzpzVar.zzb;
                if (i11 + i13 < charSequenceZzf.length()) {
                    jZzb |= (long) this.zzb.zzb(charSequenceZzf.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = zzpzVar.zzd;
            int i16 = i14 * zzpzVar.zzb;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jZzb >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += this.zzb.zzc;
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    void zzb(Appendable appendable, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        zzpm.zzh(0, i12, bArr.length);
        while (i13 < i12) {
            zzg(appendable, bArr, i13, Math.min(this.zzb.zzd, i12 - i13));
            i13 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    final int zzc(int i11) {
        return (int) (((((long) this.zzb.zzb) * ((long) i11)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    final int zzd(int i11) {
        zzpz zzpzVar = this.zzb;
        return zzpzVar.zzc * zzqh.zza(i11, zzpzVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    public final zzqf zze(String str, int i11) {
        for (int i12 = 0; i12 <= 0; i12++) {
            zzpm.zzg(true ^ this.zzb.zzd(":".charAt(i12)), "Separator (%s) cannot contain alphabet characters", ":");
        }
        if (this.zzc != null) {
            zzpm.zzg(true, "Separator (%s) cannot contain padding character", ":");
        }
        return new zzqd(this, ":", 2);
    }

    @Override // com.google.android.gms.internal.nearby.zzqf
    final CharSequence zzf(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    final void zzg(Appendable appendable, byte[] bArr, int i11, int i12) {
        zzpm.zzh(i11, i11 + i12, bArr.length);
        int i13 = 0;
        zzpm.zzd(i12 <= this.zzb.zzd);
        long j11 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            j11 = (j11 | ((long) (bArr[i11 + i14] & 255))) << 8;
        }
        int i15 = (i12 + 1) * 8;
        zzpz zzpzVar = this.zzb;
        while (i13 < i12 * 8) {
            long j12 = j11 >>> ((i15 - zzpzVar.zzb) - i13);
            zzpz zzpzVar2 = this.zzb;
            appendable.append(zzpzVar2.zza(((int) j12) & zzpzVar2.zza));
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

    zzqe(String str, String str2, Character ch2) {
        this(new zzpz(str, str2.toCharArray()), ch2);
    }
}
