package io.sentry;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public enum r8 implements a2 {
    OK(0, 399),
    CANCELLED(DownloaderService.STATUS_DEVICE_NOT_FOUND_ERROR),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(DownloaderService.STATUS_FORBIDDEN),
    RESOURCE_EXHAUSTED(HttpStatusCode.TOO_MANY_REQUESTS_429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(HttpStatusCode.UNAUTHORIZED_401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class a implements q1<r8> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r8 a(i3 i3Var, ILogger iLogger) {
            return r8.valueOf(i3Var.O().toUpperCase(Locale.ROOT));
        }
    }

    r8(int i11) {
        this.minHttpStatusCode = i11;
        this.maxHttpStatusCode = i11;
    }

    public static r8 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static r8 fromHttpStatusCode(int i11) {
        for (r8 r8Var : values()) {
            if (r8Var.matches(i11)) {
                return r8Var;
            }
        }
        return null;
    }

    private boolean matches(int i11) {
        return i11 >= this.minHttpStatusCode && i11 <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.w(apiName());
    }

    public static r8 fromHttpStatusCode(Integer num, r8 r8Var) {
        r8 r8VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : r8Var;
        return r8VarFromHttpStatusCode != null ? r8VarFromHttpStatusCode : r8Var;
    }

    r8(int i11, int i12) {
        this.minHttpStatusCode = i11;
        this.maxHttpStatusCode = i12;
    }
}
