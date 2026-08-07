package me0;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lme0/a;", "", "", "backgroundRes", "<init>", "(Ljava/lang/String;II)V", "I", "getBackgroundRes", "()I", "NORMAL", "LEFT", "RIGHT", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
enum a {
    NORMAL(h.f91904a),
    LEFT(h.f91905b),
    RIGHT(h.f91906c);

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final int backgroundRes;

    a(int i11) {
        this.backgroundRes = i11;
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public final int getBackgroundRes() {
        return this.backgroundRes;
    }
}
