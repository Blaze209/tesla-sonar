package io.sentry.util;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f81456a = new b();

    private static class b extends ThreadLocal<b0> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 initialValue() {
            return new b0();
        }
    }

    public static b0 a() {
        return f81456a.get();
    }
}
