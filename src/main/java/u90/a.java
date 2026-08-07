package u90;

import java.io.Serializable;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\nj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lu90/a;", "", "Ljava/io/Serializable;", "", "errorId", "", "message", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "I", "getErrorId", "()I", "Ljava/lang/String;", "getMessage", "Companion", "a", "NETWORK_ERROR", "INVALID_DATA", "CHALLENGE_ERROR", "INTERNAL_ERROR", "SESSION_TIMEOUT", "TOKEN_TIMEOUT", "CHALLENGE_CLOSED", "RATE_LIMITED", "INVALID_CUSTOM_THEME", "INSECURE_HTTP_REQUEST_ERROR", "ERROR", "hcaptcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum a implements Serializable {
    NETWORK_ERROR(7, "No internet connection"),
    INVALID_DATA(8, "Invalid data is not accepted by endpoints"),
    CHALLENGE_ERROR(9, "Challenge encountered error on setup"),
    INTERNAL_ERROR(10, "hCaptcha client encountered an internal error"),
    SESSION_TIMEOUT(15, "Session Timeout"),
    TOKEN_TIMEOUT(16, "Token Timeout"),
    CHALLENGE_CLOSED(30, "Challenge Closed"),
    RATE_LIMITED(31, "Rate Limited"),
    INVALID_CUSTOM_THEME(32, "Invalid custom theme"),
    INSECURE_HTTP_REQUEST_ERROR(33, "Insecure resource requested"),
    ERROR(29, "Unknown error");

    private final int errorId;
    private final String message;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    a(int i11, String str) {
        this.errorId = i11;
        this.message = str;
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.message;
    }
}
