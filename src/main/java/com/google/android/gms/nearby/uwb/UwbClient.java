package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
public interface UwbClient extends HasApiKey<zze> {
    @NonNull
    Task<Void> addControlee(@NonNull UwbAddress uwbAddress);

    @NonNull
    Task<Void> addControleeWithSessionParams(@NonNull RangingControleeParameters rangingControleeParameters);

    @NonNull
    Task<UwbComplexChannel> getComplexChannel();

    @NonNull
    Task<UwbAddress> getLocalAddress();

    @NonNull
    Task<RangingCapabilities> getRangingCapabilities();

    @NonNull
    Task<Boolean> isAvailable();

    @NonNull
    Task<Void> reconfigureRangeDataNtf(@UwbRangeDataNtfConfig.RangeDataNtfConfig int i11, int i12, int i13);

    @NonNull
    Task<Void> reconfigureRangingInterval(int i11);

    @NonNull
    Task<Void> removeControlee(@NonNull UwbAddress uwbAddress);

    @NonNull
    Task<Void> startRanging(@NonNull RangingParameters rangingParameters, @NonNull RangingSessionCallback rangingSessionCallback);

    @NonNull
    Task<Void> stopRanging(@NonNull RangingSessionCallback rangingSessionCallback);

    @NonNull
    Task<Void> subscribeToUwbAvailability(@NonNull UwbAvailabilityObserver uwbAvailabilityObserver);

    @NonNull
    Task<Void> unsubscribeFromUwbAvailability();
}
