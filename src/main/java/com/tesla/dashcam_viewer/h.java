package com.tesla.dashcam_viewer;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/tesla/dashcam_viewer/h;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "FRONT", "LEFT_PILLAR", "LEFT_REPEATER", "RIGHT_PILLAR", "RIGHT_REPEATER", "BACK", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum h {
    FRONT("front"),
    LEFT_PILLAR("left_pillar"),
    LEFT_REPEATER("left_repeater"),
    RIGHT_PILLAR("right_pillar"),
    RIGHT_REPEATER("right_repeater"),
    BACK("back");

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final String value;

    h(String str) {
        this.value = str;
    }

    public static EnumEntries<h> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
