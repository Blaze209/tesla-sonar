package com.google.android.gms.measurement.internal;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes5.dex */
final class zzog {
    private final Clock zza;
    private long zzb;

    public zzog(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }

    public final void zza() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final void zzb() {
        this.zzb = 0L;
    }

    public final boolean zzc(long j11) {
        return this.zzb == 0 || this.zza.elapsedRealtime() - this.zzb >= CoreConstants.MILLIS_IN_ONE_HOUR;
    }
}
