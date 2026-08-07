package rm0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static void a() {
        if (tm0.a.j()) {
            if ((Thread.currentThread() instanceof om0.i) || tm0.a.p()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
