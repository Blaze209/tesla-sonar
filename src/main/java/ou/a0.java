package ou;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a0 f99992a = new a();

    class a extends a0 {
        a() {
        }

        @Override // ou.a0
        public long a() {
            return System.nanoTime();
        }
    }

    protected a0() {
    }

    public static a0 b() {
        return f99992a;
    }

    public abstract long a();
}
