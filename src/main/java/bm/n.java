package bm;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lbm/n;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "a", "UNKNOWN", "VISIBLE", "INVISIBLE", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum n {
    UNKNOWN(-1),
    VISIBLE(1),
    INVISIBLE(2);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private static final n[] VALUES = values();

    n(int i11) {
        this.value = i11;
    }

    public static EnumEntries<n> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
