package com.google.android.libraries.places.internal;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes5.dex */
final class zzis extends zzit {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzis(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // com.google.android.libraries.places.internal.zzit
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "\\" + this.zza + "/";
    }

    @Override // com.google.android.libraries.places.internal.zzit
    final void zzc(StringBuilder sb2) {
        sb2.append('[');
        sb2.append(this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzit
    final void zzd(StringBuilder sb2) {
        sb2.append(this.zza);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // com.google.android.libraries.places.internal.zzit
    final boolean zze(Comparable comparable) {
        return zzjk.zza(this.zza, comparable) <= 0;
    }
}
