package com.google.android.gms.nearby.uwb;

/* JADX INFO: loaded from: classes5.dex */
public interface UwbAvailabilityObserver {

    public @interface UwbStateChangeReason {
        public static final int REASON_COUNTRY_CODE_ERROR = 2;
        public static final int REASON_SYSTEM_POLICY = 1;
        public static final int REASON_UNKNOWN = 0;
    }

    void onUwbStateChanged(boolean z11, @UwbStateChangeReason int i11);
}
