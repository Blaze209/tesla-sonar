package com.swmansion.rnscreens.safearea;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/swmansion/rnscreens/safearea/b;", "", "<init>", "(Ljava/lang/String;I)V", "", "containsSystem", "()Z", "containsInterface", "ALL", "SYSTEM", "INTERFACE", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum b {
    ALL,
    SYSTEM,
    INTERFACE;

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    public final boolean containsInterface() {
        return this == ALL || this == INTERFACE;
    }

    public final boolean containsSystem() {
        return this == ALL || this == SYSTEM;
    }
}
