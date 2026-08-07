package com.plaid.internal.core.crashreporting.internal.models;

import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceInterface;", "", "stackTrace", "", "Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "([Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;)V", "frames", "[Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceElement;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StackTraceInterface {
    public static final String STACKTRACE_INTERFACE = "sentry.interfaces.Stacktrace";
    private final StackTraceElement[] frames;

    public StackTraceInterface(StackTraceElement[] stackTrace) {
        s.k(stackTrace, "stackTrace");
        Object[] objArrCopyOf = Arrays.copyOf(stackTrace, stackTrace.length);
        s.j(objArrCopyOf, "copyOf(...)");
        this.frames = (StackTraceElement[]) objArrCopyOf;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !s.f(StackTraceInterface.class, other.getClass())) {
            return false;
        }
        return Arrays.equals(this.frames, ((StackTraceInterface) other).frames);
    }

    public int hashCode() {
        return Arrays.hashCode(this.frames);
    }

    public String toString() {
        return "StackTraceInterface{frames=" + Arrays.toString(this.frames) + "}";
    }
}
