package p8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f101925a = new a();

    class a implements n {
        a() {
        }

        @Override // p8.n
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // p8.n
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // p8.n
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
