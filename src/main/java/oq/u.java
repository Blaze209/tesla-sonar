package oq;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u {

    public static abstract class a {
        @NonNull
        public abstract u a();

        @NonNull
        public abstract a b(o oVar);

        @NonNull
        public abstract a c(List<t> list);

        @NonNull
        abstract a d(Integer num);

        @NonNull
        abstract a e(String str);

        @NonNull
        public abstract a f(x xVar);

        @NonNull
        public abstract a g(long j11);

        @NonNull
        public abstract a h(long j11);

        @NonNull
        public a i(int i11) {
            return d(Integer.valueOf(i11));
        }

        @NonNull
        public a j(@NonNull String str) {
            return e(str);
        }
    }

    @NonNull
    public static a a() {
        return new k.b();
    }

    public abstract o b();

    public abstract List<t> c();

    public abstract Integer d();

    public abstract String e();

    public abstract x f();

    public abstract long g();

    public abstract long h();
}
