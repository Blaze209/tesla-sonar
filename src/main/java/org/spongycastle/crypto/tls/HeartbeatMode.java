package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
public class HeartbeatMode {
    public static final short peer_allowed_to_send = 1;
    public static final short peer_not_allowed_to_send = 2;

    public static boolean isValid(short s11) {
        return s11 >= 1 && s11 <= 2;
    }
}
