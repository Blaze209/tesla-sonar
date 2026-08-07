package com.google.android.gms.internal.nearby;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class zzpy implements Appendable {
    final /* synthetic */ Appendable zzb;
    final /* synthetic */ String zzc = ":";
    int zza = 2;

    zzpy(int i11, Appendable appendable, String str) {
        this.zzb = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c11) throws IOException {
        if (this.zza == 0) {
            this.zzb.append(this.zzc);
            this.zza = 2;
        }
        this.zzb.append(c11);
        this.zza--;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i11, int i12) {
        throw new UnsupportedOperationException();
    }
}
