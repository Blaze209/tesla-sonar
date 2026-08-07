package com.teslamotors.plugins.ble;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/teslamotors/plugins/ble/i0;", "", "<init>", "(Ljava/lang/String;I)V", "UNINITIALIZED", "IDLE", "LOAD_PUBLIC_KEY", "CONNECT_TO_PERIPHERAL", "WAITING_FOR_PERIPHERAL", "CONNECTION_ESTABLISHED", "CONNECTED_IDLE", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum i0 {
    UNINITIALIZED,
    IDLE,
    LOAD_PUBLIC_KEY,
    CONNECT_TO_PERIPHERAL,
    WAITING_FOR_PERIPHERAL,
    CONNECTION_ESTABLISHED,
    CONNECTED_IDLE;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    public static EnumEntries<i0> getEntries() {
        return $ENTRIES;
    }
}
