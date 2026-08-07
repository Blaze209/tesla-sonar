package com.google.common.util.concurrent;

import com.google.common.collect.f0;
import com.google.common.collect.g0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public class CycleDetectingLockFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, c>> f43775a = new g0().h().f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r f43776b = new r(CycleDetectingLockFactory.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<List<c>> f43777c = new a();

    public static final class PotentialDeadlockException extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f43778c;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb2 = new StringBuilder(message);
            for (Throwable cause = this.f43778c; cause != null; cause = cause.getCause()) {
                sb2.append(", ");
                sb2.append(cause.getMessage());
            }
            return sb2.toString();
        }
    }

    class a extends ThreadLocal<List<c>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<c> initialValue() {
            return f0.i(3);
        }
    }

    private static class b extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final StackTraceElement[] f43779a = new StackTraceElement[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final com.google.common.collect.b0<String> f43780b = com.google.common.collect.b0.t(CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
    }

    private static final class c {
    }
}
