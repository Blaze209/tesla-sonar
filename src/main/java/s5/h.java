package s5;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f110182a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f110183b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f110184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f110185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f110186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f110187f;

    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f110188b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f110189a;

        private a(boolean z11) {
            this.f110189a = z11;
        }

        @Override // s5.h.c
        public int a(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            boolean z11 = false;
            while (i11 < i13) {
                int iA = h.a(Character.getDirectionality(charSequence.charAt(i11)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f110189a) {
                        return 1;
                    }
                    i11++;
                    z11 = z11;
                } else if (this.f110189a) {
                    return 0;
                }
                z11 = true;
                i11++;
                z11 = z11;
            }
            if (z11) {
                return this.f110189a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f110190a = new b();

        private b() {
        }

        @Override // s5.h.c
        public int a(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            int iB = 2;
            while (i11 < i13 && iB == 2) {
                iB = h.b(Character.getDirectionality(charSequence.charAt(i11)));
                i11++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i11, int i12);
    }

    private static abstract class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f110191a;

        d(c cVar) {
            this.f110191a = cVar;
        }

        private boolean b(CharSequence charSequence, int i11, int i12) {
            int iA = this.f110191a.a(charSequence, i11, i12);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // s5.g
        public boolean isRtl(CharSequence charSequence, int i11, int i12) {
            if (charSequence == null || i11 < 0 || i12 < 0 || charSequence.length() - i12 < i11) {
                throw new IllegalArgumentException();
            }
            return this.f110191a == null ? a() : b(charSequence, i11, i12);
        }
    }

    private static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f110192b;

        e(c cVar, boolean z11) {
            super(cVar);
            this.f110192b = z11;
        }

        @Override // s5.h.d
        protected boolean a() {
            return this.f110192b;
        }
    }

    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f110193b = new f();

        f() {
            super(null);
        }

        @Override // s5.h.d
        protected boolean a() {
            return i.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f110190a;
        f110184c = new e(bVar, false);
        f110185d = new e(bVar, true);
        f110186e = new e(a.f110188b, false);
        f110187f = f.f110193b;
    }

    static int a(int i11) {
        if (i11 != 0) {
            return (i11 == 1 || i11 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i11) {
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                return 0;
            }
            switch (i11) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
