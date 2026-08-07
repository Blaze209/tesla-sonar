package um;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends a {
    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        qk.a.K("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
