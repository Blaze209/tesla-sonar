package gp;

import java.io.Serializable;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final int f69306h = EnumC1419a.collectDefaults();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final int f69307i = d.collectDefaults();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final int f69308j = b.collectDefaults();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final f f69309k = jp.a.f84115a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final ThreadLocal<SoftReference<Object>> f69310l = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final transient ip.c f69311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final transient ip.a f69312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    protected final transient ip.b f69313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f69314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f69315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f69316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected f f69317g;

    /* JADX INFO: renamed from: gp.a$a, reason: collision with other inner class name */
    public enum EnumC1419a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        EnumC1419a(boolean z11) {
            this._defaultState = z11;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (EnumC1419a enumC1419a : values()) {
                if (enumC1419a.enabledByDefault()) {
                    mask |= enumC1419a.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i11) {
            return (i11 & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public a() {
        this(null);
    }

    public a(e eVar) {
        this.f69311a = ip.c.b();
        this.f69312b = ip.a.c();
        this.f69313c = ip.b.a();
        this.f69314d = f69306h;
        this.f69315e = f69307i;
        this.f69316f = f69308j;
        this.f69317g = f69309k;
    }
}
