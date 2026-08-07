package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface RangingSessionCallback {

    public @interface RangingSuspendedReason {
        public static final int FAILED_TO_START = 2;
        public static final int MAX_RANGING_ROUND_RETRY_REACHED = 5;
        public static final int STOPPED_BY_PEER = 3;
        public static final int STOP_RANGING_CALLED = 4;
        public static final int SYSTEM_POLICY = 6;
        public static final int UNKNOWN = 0;
        public static final int WRONG_PARAMETERS = 1;
    }

    void onRangingInitialized(@NonNull UwbDevice uwbDevice);

    void onRangingResult(@NonNull UwbDevice uwbDevice, @NonNull RangingPosition rangingPosition);

    void onRangingSuspended(@NonNull UwbDevice uwbDevice, @RangingSuspendedReason int i11);
}
