package fz;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lfz/e;", "Lfz/h;", "", "", "unionValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getUnionValue", "()Ljava/lang/String;", "ULTRA_WIDE_ANGLE", "WIDE_ANGLE", "TELEPHOTO", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum e implements h {
    ULTRA_WIDE_ANGLE("ultra-wide-angle-camera"),
    WIDE_ANGLE("wide-angle-camera"),
    TELEPHOTO("telephoto-camera");

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final String unionValue;

    e(String str) {
        this.unionValue = str;
    }

    public static EnumEntries<e> getEntries() {
        return $ENTRIES;
    }

    @Override // fz.h
    public String getUnionValue() {
        return this.unionValue;
    }
}
