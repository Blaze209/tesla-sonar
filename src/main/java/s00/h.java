package s00;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ls00/h;", "", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "POST", "PUT", "PATCH", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum h {
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH");

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
