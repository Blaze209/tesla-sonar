package fw;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a f66678p = new C1356a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f66679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f66680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f66681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f66682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f66683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f66684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f66685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f66686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f66687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f66688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f66689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f66690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f66691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f66692n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f66693o;

    /* JADX INFO: renamed from: fw.a$a, reason: collision with other inner class name */
    public static final class C1356a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f66694a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f66695b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f66696c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f66697d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f66698e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f66699f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f66700g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f66701h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f66702i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f66703j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f66704k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private b f66705l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f66706m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f66707n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f66708o = "";

        C1356a() {
        }

        public a a() {
            return new a(this.f66694a, this.f66695b, this.f66696c, this.f66697d, this.f66698e, this.f66699f, this.f66700g, this.f66701h, this.f66702i, this.f66703j, this.f66704k, this.f66705l, this.f66706m, this.f66707n, this.f66708o);
        }

        public C1356a b(String str) {
            this.f66706m = str;
            return this;
        }

        public C1356a c(String str) {
            this.f66700g = str;
            return this;
        }

        public C1356a d(String str) {
            this.f66708o = str;
            return this;
        }

        public C1356a e(b bVar) {
            this.f66705l = bVar;
            return this;
        }

        public C1356a f(String str) {
            this.f66696c = str;
            return this;
        }

        public C1356a g(String str) {
            this.f66695b = str;
            return this;
        }

        public C1356a h(c cVar) {
            this.f66697d = cVar;
            return this;
        }

        public C1356a i(String str) {
            this.f66699f = str;
            return this;
        }

        public C1356a j(int i11) {
            this.f66701h = i11;
            return this;
        }

        public C1356a k(long j11) {
            this.f66694a = j11;
            return this;
        }

        public C1356a l(d dVar) {
            this.f66698e = dVar;
            return this;
        }

        public C1356a m(String str) {
            this.f66703j = str;
            return this;
        }

        public C1356a n(int i11) {
            this.f66702i = i11;
            return this;
        }
    }

    public enum b implements uv.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i11) {
            this.number_ = i11;
        }

        @Override // uv.c
        public int getNumber() {
            return this.number_;
        }
    }

    public enum c implements uv.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i11) {
            this.number_ = i11;
        }

        @Override // uv.c
        public int getNumber() {
            return this.number_;
        }
    }

    public enum d implements uv.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i11) {
            this.number_ = i11;
        }

        @Override // uv.c
        public int getNumber() {
            return this.number_;
        }
    }

    a(long j11, String str, String str2, c cVar, d dVar, String str3, String str4, int i11, int i12, String str5, long j12, b bVar, String str6, long j13, String str7) {
        this.f66679a = j11;
        this.f66680b = str;
        this.f66681c = str2;
        this.f66682d = cVar;
        this.f66683e = dVar;
        this.f66684f = str3;
        this.f66685g = str4;
        this.f66686h = i11;
        this.f66687i = i12;
        this.f66688j = str5;
        this.f66689k = j12;
        this.f66690l = bVar;
        this.f66691m = str6;
        this.f66692n = j13;
        this.f66693o = str7;
    }

    public static C1356a p() {
        return new C1356a();
    }

    @uv.d(tag = 13)
    public String a() {
        return this.f66691m;
    }

    @uv.d(tag = 11)
    public long b() {
        return this.f66689k;
    }

    @uv.d(tag = 14)
    public long c() {
        return this.f66692n;
    }

    @uv.d(tag = 7)
    public String d() {
        return this.f66685g;
    }

    @uv.d(tag = 15)
    public String e() {
        return this.f66693o;
    }

    @uv.d(tag = 12)
    public b f() {
        return this.f66690l;
    }

    @uv.d(tag = 3)
    public String g() {
        return this.f66681c;
    }

    @uv.d(tag = 2)
    public String h() {
        return this.f66680b;
    }

    @uv.d(tag = 4)
    public c i() {
        return this.f66682d;
    }

    @uv.d(tag = 6)
    public String j() {
        return this.f66684f;
    }

    @uv.d(tag = 8)
    public int k() {
        return this.f66686h;
    }

    @uv.d(tag = 1)
    public long l() {
        return this.f66679a;
    }

    @uv.d(tag = 5)
    public d m() {
        return this.f66683e;
    }

    @uv.d(tag = 10)
    public String n() {
        return this.f66688j;
    }

    @uv.d(tag = 9)
    public int o() {
        return this.f66687i;
    }
}
