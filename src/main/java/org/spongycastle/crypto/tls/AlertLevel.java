package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
public class AlertLevel {
    public static final short fatal = 2;
    public static final short warning = 1;

    public static String getName(short s11) {
        if (s11 != 1) {
            return s11 != 2 ? "UNKNOWN" : "fatal";
        }
        return "warning";
    }

    public static String getText(short s11) {
        return getName(s11) + "(" + ((int) s11) + ")";
    }
}
