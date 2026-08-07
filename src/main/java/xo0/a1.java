package xo0;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lxo0/a1;", "", "", "begin", "end", "<init>", "(Ljava/lang/String;ICC)V", "C", "OBJ", "LIST", "MAP", "POLY_OBJ", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum a1 {
    OBJ(CoreConstants.CURLY_LEFT, CoreConstants.CURLY_RIGHT),
    LIST('[', ']'),
    MAP(CoreConstants.CURLY_LEFT, CoreConstants.CURLY_RIGHT),
    POLY_OBJ('[', ']');

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    public final char begin;
    public final char end;

    a1(char c11, char c12) {
        this.begin = c11;
        this.end = c12;
    }

    public static EnumEntries<a1> getEntries() {
        return $ENTRIES;
    }
}
