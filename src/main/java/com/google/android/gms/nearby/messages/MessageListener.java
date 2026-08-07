package com.google.android.gms.nearby.messages;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MessageListener {
    public void onBleSignalChanged(@NonNull Message message, @NonNull BleSignal bleSignal) {
    }

    public void onDistanceChanged(@NonNull Message message, @NonNull Distance distance) {
    }

    public void onFound(@NonNull Message message) {
    }

    public void onLost(@NonNull Message message) {
    }
}
