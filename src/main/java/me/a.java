package me;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lme/a;", "", "", "priority", "<init>", "(Ljava/lang/String;II)V", "I", "getPriority", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "ASSERT", "NONE", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum a {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    ASSERT(7),
    NONE(100);

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final int priority;

    a(int i11) {
        this.priority = i11;
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public final int getPriority() {
        return this.priority;
    }
}
