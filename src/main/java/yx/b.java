package yx;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public static final b f125958o = new a().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f125962d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f125964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f125965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f125966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f125967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f125968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f125969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f125970l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f125972n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f125959a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f125960b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f125961c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f125963e = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f125971m = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f125973a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f125974b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f125975c = {101};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f125976d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f125977e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f125978f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f125979g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f125980h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f125981i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Optional f125982j = Optional.empty();

        @NonNull
        public b a() {
            return new b(this, null);
        }

        @NonNull
        public a b(int i11) {
            Preconditions.checkArgument(i11 > 0, "pageLimit should be be greater than or equal to 1");
            this.f125974b = i11;
            return this;
        }

        @NonNull
        public a c(int i11, @NonNull int... iArr) {
            Preconditions.checkArgument(iArr != null, "moreFormats cannot be null");
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
            this.f125975c = iArrCopyOf;
            iArrCopyOf[length] = i11;
            return this;
        }

        @NonNull
        public a d(int i11) {
            this.f125977e = i11;
            if (i11 == 1) {
                this.f125978f = true;
                this.f125979g = true;
                this.f125980h = true;
                this.f125981i = true;
                return this;
            }
            if (i11 == 2) {
                this.f125978f = false;
                this.f125979g = true;
                this.f125980h = true;
                this.f125981i = false;
                return this;
            }
            if (i11 != 3) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 22);
                sb2.append("Invalid scanner mode: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            this.f125978f = false;
            this.f125979g = false;
            this.f125980h = false;
            this.f125981i = false;
            return this;
        }

        final /* synthetic */ boolean e() {
            return this.f125973a;
        }

        final /* synthetic */ int f() {
            return this.f125974b;
        }

        final /* synthetic */ int[] g() {
            return this.f125975c;
        }

        final /* synthetic */ String h() {
            return this.f125976d;
        }

        final /* synthetic */ int i() {
            return this.f125977e;
        }

        final /* synthetic */ boolean j() {
            return this.f125978f;
        }

        final /* synthetic */ boolean k() {
            return this.f125979g;
        }

        final /* synthetic */ boolean l() {
            return this.f125980h;
        }

        final /* synthetic */ boolean m() {
            return this.f125981i;
        }

        final /* synthetic */ Optional n() {
            return this.f125982j;
        }
    }

    /* synthetic */ b(a aVar, byte[] bArr) {
        this.f125962d = aVar.e();
        this.f125964f = aVar.f();
        this.f125965g = aVar.g();
        this.f125966h = aVar.h();
        this.f125967i = aVar.j();
        this.f125968j = aVar.k();
        this.f125969k = aVar.l();
        this.f125970l = aVar.m();
        aVar.n().isPresent();
        this.f125972n = aVar.i() == 1;
    }

    public final boolean a() {
        return this.f125962d;
    }

    public final int b() {
        return this.f125964f;
    }

    @NonNull
    public final int[] c() {
        return this.f125965g;
    }

    @NonNull
    public final String d() {
        return this.f125966h;
    }

    public final boolean e() {
        return this.f125967i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equal(null, null) && this.f125962d == bVar.f125962d && this.f125964f == bVar.f125964f && Arrays.equals(this.f125965g, bVar.f125965g) && Objects.equal(null, null) && this.f125966h.equals(bVar.f125966h) && this.f125967i == bVar.f125967i && this.f125968j == bVar.f125968j && this.f125969k == bVar.f125969k && this.f125970l == bVar.f125970l && this.f125972n == bVar.f125972n;
    }

    public final boolean f() {
        return this.f125968j;
    }

    public final boolean g() {
        return this.f125969k;
    }

    public final boolean h() {
        return this.f125970l;
    }

    public int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hashCode(null, 1, bool, Boolean.valueOf(this.f125962d), bool, Integer.valueOf(this.f125964f), Integer.valueOf(Arrays.hashCode(this.f125965g)), null, this.f125966h, Boolean.valueOf(this.f125967i), Boolean.valueOf(this.f125968j), Boolean.valueOf(this.f125969k), Boolean.valueOf(this.f125970l), Boolean.FALSE, Boolean.valueOf(this.f125972n));
    }

    public final boolean i() {
        return this.f125972n;
    }
}
