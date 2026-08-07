package com.google.android.gms.internal.nearby;

/* JADX INFO: loaded from: classes5.dex */
final class zzpn extends zzpl {
    private final Object zza;

    zzpn(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzpn) {
            return this.zza.equals(((zzpn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.nearby.zzpl
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.nearby.zzpl
    public final boolean zzb() {
        return true;
    }
}
