package com.tesla.dashcam_viewer;

import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/tesla/dashcam_viewer/n;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "CONNECTING", "CONNECTED_LOADING", "CONNECTED_LOADED", "DATA_LIMIT_REACHED", "NO_FLASH_DRIVE", "OTHER_PHONE_CONNECTED", "UNKNOWN_ERROR", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum n {
    CONNECTING("connecting"),
    CONNECTED_LOADING("connected_loading"),
    CONNECTED_LOADED("connected_loaded"),
    DATA_LIMIT_REACHED("data_limit_reached"),
    NO_FLASH_DRIVE("no_flash_drive"),
    OTHER_PHONE_CONNECTED("other_phone_connected"),
    UNKNOWN_ERROR("unknown_error");

    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/dashcam_viewer/n$a;", "", "<init>", "()V", "", "value", "Lcom/tesla/dashcam_viewer/n;", "a", "(Ljava/lang/String;)Lcom/tesla/dashcam_viewer/n;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(String value) {
            n next;
            p013kotlin.jvm.internal.s.k(value, "value");
            Iterator<n> it = n.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (p013kotlin.jvm.internal.s.f(next.getValue(), value)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    n(String str) {
        this.value = str;
    }

    public static EnumEntries<n> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
