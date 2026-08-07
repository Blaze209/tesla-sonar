package com.plaid.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class T6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static J5 f46721a;

    public static final class a {
        public static void a(String message) {
            p013kotlin.jvm.internal.s.k(message, "message");
            X5.a.b(X5.f46812a, message);
            J5 j11 = T6.f46721a;
            if (j11 != null) {
                j11.a(message);
            }
        }

        public static void a(Exception exc, String message) {
            p013kotlin.jvm.internal.s.k(message, "message");
            X5.a.a(X5.f46812a, exc, message);
            J5 j11 = T6.f46721a;
            if (j11 != null) {
                j11.a(message + " - " + exc.getMessage());
            }
        }
    }
}
