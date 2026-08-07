package com.stripe.android.core.exception;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.util.Objects;
import o30.StripeError;
import org.json.JSONException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0011\b&\u0018\u0000 #2\u00060\u0001j\u0002`\u0002:\u0001\u0012BA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u001aR\u001a\u0010%\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/stripe/android/core/exception/StripeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lo30/f;", "stripeError", "", "requestId", "", "statusCode", "", "cause", "message", "<init>", "(Lo30/f;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V", "ex", "", "f", "(Lcom/stripe/android/core/exception/StripeException;)Z", "a", "()Ljava/lang/String;", "toString", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lo30/f;", DateTokenConverter.CONVERTER_KEY, "()Lo30/f;", "b", "Ljava/lang/String;", "c", "I", "Z", "e", "()Z", "isClientError", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class StripeException extends Exception {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StripeError stripeError;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String requestId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int statusCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isClientError;

    /* JADX INFO: renamed from: com.stripe.android.core.exception.StripeException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/core/exception/StripeException$a;", "", "<init>", "()V", "", "throwable", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Lcom/stripe/android/core/exception/StripeException;", "b", "(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;", "", "DEFAULT_STATUS_CODE", "I", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String a(Throwable throwable) {
            Class<?> cls = throwable.getClass();
            String name = cls.getName();
            s.j(name, "getName(...)");
            if (!t.b0(name, "android.", false, 2, null)) {
                String name2 = cls.getName();
                s.j(name2, "getName(...)");
                if (!t.b0(name2, "java.", false, 2, null)) {
                    return null;
                }
            }
            return cls.getName();
        }

        public final StripeException b(Throwable throwable) {
            s.k(throwable, "throwable");
            if (throwable instanceof StripeException) {
                return (StripeException) throwable;
            }
            if (throwable instanceof JSONException) {
                return new APIException(throwable);
            }
            if (throwable instanceof IOException) {
                return APIConnectionException.Companion.b(APIConnectionException.INSTANCE, (IOException) throwable, null, 2, null);
            }
            return throwable instanceof IllegalArgumentException ? new InvalidRequestException(null, null, 0, throwable.getMessage(), throwable, 7, null) : new GenericStripeException(throwable, a(throwable));
        }

        private Companion() {
        }
    }

    public StripeException() {
        this(null, null, 0, null, null, 31, null);
    }

    private final boolean f(StripeException ex2) {
        return s.f(this.stripeError, ex2.stripeError) && s.f(this.requestId, ex2.requestId) && this.statusCode == ex2.statusCode && s.f(getMessage(), ex2.getMessage());
    }

    public String a() {
        return "stripeException";
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final StripeError getStripeError() {
        return this.stripeError;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsClientError() {
        return this.isClientError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof StripeException) {
            return f((StripeException) other);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.stripeError, this.requestId, Integer.valueOf(this.statusCode), getMessage());
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str;
        String str2 = this.requestId;
        if (str2 != null) {
            str = "Request-id: " + str2;
        } else {
            str = null;
        }
        return v.y0(v.r(str, super.toString()), "\n", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StripeException(StripeError stripeError, String str, int i11, Throwable th2, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        stripeError = (i12 & 1) != 0 ? null : stripeError;
        this(stripeError, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : th2, (i12 & 16) != 0 ? stripeError != null ? stripeError.getMessage() : null : str2);
    }

    public StripeException(StripeError stripeError, String str, int i11, Throwable th2, String str2) {
        super(str2, th2);
        this.stripeError = stripeError;
        this.requestId = str;
        this.statusCode = i11;
        boolean z11 = false;
        if (400 <= i11 && i11 < 500) {
            z11 = true;
        }
        this.isClientError = z11;
    }
}
