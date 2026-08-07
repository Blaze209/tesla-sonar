package oq;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t {

    public static abstract class a {
        @NonNull
        public abstract t a();

        @NonNull
        public abstract a b(p pVar);

        @NonNull
        public abstract a c(Integer num);

        @NonNull
        public abstract a d(long j11);

        @NonNull
        public abstract a e(long j11);

        @NonNull
        public abstract a f(q qVar);

        @NonNull
        public abstract a g(w wVar);

        @NonNull
        abstract a h(byte[] bArr);

        @NonNull
        abstract a i(String str);

        @NonNull
        public abstract a j(long j11);
    }

    private static a a() {
        return new j.b();
    }

    @NonNull
    public static a k(@NonNull String str) {
        return a().i(str);
    }

    @NonNull
    public static a l(@NonNull byte[] bArr) {
        return a().h(bArr);
    }

    public abstract p b();

    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    public abstract q f();

    public abstract w g();

    public abstract byte[] h();

    public abstract String i();

    public abstract long j();
}
