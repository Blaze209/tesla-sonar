package sx;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f111915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f111916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f111917c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f111918a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f111919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Executor f111920c;

        @NonNull
        public b a() {
            return new b(this.f111918a, this.f111919b, this.f111920c, null, null);
        }

        @NonNull
        public a b(int i11, @NonNull int... iArr) {
            this.f111918a = i11;
            if (iArr != null) {
                for (int i12 : iArr) {
                    this.f111918a = i12 | this.f111918a;
                }
            }
            return this;
        }
    }

    /* synthetic */ b(int i11, boolean z11, Executor executor, d dVar, e eVar) {
        this.f111915a = i11;
        this.f111916b = z11;
        this.f111917c = executor;
    }

    public final int a() {
        return this.f111915a;
    }

    public final d b() {
        return null;
    }

    public final Executor c() {
        return this.f111917c;
    }

    public final boolean d() {
        return this.f111916b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f111915a == bVar.f111915a && this.f111916b == bVar.f111916b && Objects.equal(this.f111917c, bVar.f111917c) && Objects.equal(null, null);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f111915a), Boolean.valueOf(this.f111916b), this.f111917c, null);
    }
}
