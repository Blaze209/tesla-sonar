package z0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f126107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h1 f126108b;

    public static final class a extends d2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v f126109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f126110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Throwable f126111e;

        a(@NonNull u uVar, @NonNull h1 h1Var, @NonNull v vVar, int i11, Throwable th2) {
            super(uVar, h1Var);
            this.f126109c = vVar;
            this.f126110d = i11;
            this.f126111e = th2;
        }

        @NonNull
        static String i(int i11) {
            switch (i11) {
                case 0:
                    return "ERROR_NONE";
                case 1:
                    return "ERROR_UNKNOWN";
                case 2:
                    return "ERROR_FILE_SIZE_LIMIT_REACHED";
                case 3:
                    return "ERROR_INSUFFICIENT_STORAGE";
                case 4:
                    return "ERROR_SOURCE_INACTIVE";
                case 5:
                    return "ERROR_INVALID_OUTPUT_OPTIONS";
                case 6:
                    return "ERROR_ENCODING_FAILED";
                case 7:
                    return "ERROR_RECORDER_ERROR";
                case 8:
                    return "ERROR_NO_VALID_DATA";
                case 9:
                    return "ERROR_DURATION_LIMIT_REACHED";
                case 10:
                    return "ERROR_RECORDING_GARBAGE_COLLECTED";
                default:
                    return "Unknown(" + i11 + ")";
            }
        }

        public Throwable j() {
            return this.f126111e;
        }

        public int k() {
            return this.f126110d;
        }

        @NonNull
        public v l() {
            return this.f126109c;
        }

        public boolean m() {
            return this.f126110d != 0;
        }
    }

    public static final class b extends d2 {
        b(@NonNull u uVar, @NonNull h1 h1Var) {
            super(uVar, h1Var);
        }
    }

    public static final class c extends d2 {
        c(@NonNull u uVar, @NonNull h1 h1Var) {
            super(uVar, h1Var);
        }
    }

    public static final class d extends d2 {
        d(@NonNull u uVar, @NonNull h1 h1Var) {
            super(uVar, h1Var);
        }
    }

    public static final class e extends d2 {
        e(@NonNull u uVar, @NonNull h1 h1Var) {
            super(uVar, h1Var);
        }
    }

    d2(@NonNull u uVar, @NonNull h1 h1Var) {
        this.f126107a = (u) u5.h.g(uVar);
        this.f126108b = (h1) u5.h.g(h1Var);
    }

    @NonNull
    static a a(@NonNull u uVar, @NonNull h1 h1Var, @NonNull v vVar) {
        return new a(uVar, h1Var, vVar, 0, null);
    }

    @NonNull
    static a b(@NonNull u uVar, @NonNull h1 h1Var, @NonNull v vVar, int i11, Throwable th2) {
        u5.h.b(i11 != 0, "An error type is required.");
        return new a(uVar, h1Var, vVar, i11, th2);
    }

    @NonNull
    static b e(@NonNull u uVar, @NonNull h1 h1Var) {
        return new b(uVar, h1Var);
    }

    @NonNull
    static c f(@NonNull u uVar, @NonNull h1 h1Var) {
        return new c(uVar, h1Var);
    }

    @NonNull
    static d g(@NonNull u uVar, @NonNull h1 h1Var) {
        return new d(uVar, h1Var);
    }

    @NonNull
    static e h(@NonNull u uVar, @NonNull h1 h1Var) {
        return new e(uVar, h1Var);
    }

    @NonNull
    public u c() {
        return this.f126107a;
    }

    @NonNull
    public h1 d() {
        return this.f126108b;
    }
}
