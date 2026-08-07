package oj0;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public static void a(boolean z11) {
        if (!z11) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static String b() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }
}
