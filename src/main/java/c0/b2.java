package c0;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f18268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final List<a2> f18269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final List<j> f18270c;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final List<Integer> f18271d = Arrays.asList(1, 2, 4, 3, 7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c2 f18272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<a2> f18273b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<j> f18274c = new ArrayList();

        private void c() {
            Iterator<j> it = this.f18274c.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                int iG = it.next().g();
                p0.z0.a(f18271d, iG);
                int i12 = i11 & iG;
                if (i12 > 0) {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", p0.z0.b(i12)));
                }
                i11 |= iG;
            }
        }

        @NonNull
        public a a(@NonNull a2 a2Var) {
            this.f18273b.add(a2Var);
            return this;
        }

        @NonNull
        public b2 b() {
            u5.h.b(!this.f18273b.isEmpty(), "UseCase must not be empty.");
            c();
            return new b2(this.f18272a, this.f18273b, this.f18274c);
        }
    }

    b2(c2 c2Var, @NonNull List<a2> list, @NonNull List<j> list2) {
        this.f18268a = c2Var;
        this.f18269b = list;
        this.f18270c = list2;
    }

    @NonNull
    public List<j> a() {
        return this.f18270c;
    }

    @NonNull
    public List<a2> b() {
        return this.f18269b;
    }

    public c2 c() {
        return this.f18268a;
    }
}
