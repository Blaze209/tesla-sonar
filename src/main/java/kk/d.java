package kk;

import android.content.Context;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import java.io.File;
import pk.n;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f86207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f86208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n<File> f86209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f86210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f86211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f86212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f86213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jk.a f86214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final jk.c f86215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final mk.b f86216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f86217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f86218l;

    class a implements n<File> {
        a() {
        }

        @Override // pk.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            pk.k.g(d.this.f86217k);
            return d.this.f86217k.getApplicationContext().getCacheDir();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f86220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f86221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n<File> f86222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f86223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f86224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f86225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j f86226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private jk.a f86227h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private jk.c f86228i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private mk.b f86229j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f86230k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Context f86231l;

        public d n() {
            return new d(this);
        }

        private b(Context context) {
            this.f86220a = 1;
            this.f86221b = "image_cache";
            this.f86223d = 41943040L;
            this.f86224e = SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE;
            this.f86225f = 2097152L;
            this.f86226g = new c();
            this.f86231l = context;
        }
    }

    protected d(b bVar) {
        Context context = bVar.f86231l;
        this.f86217k = context;
        pk.k.j((bVar.f86222c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f86222c == null && context != null) {
            bVar.f86222c = new a();
        }
        this.f86207a = bVar.f86220a;
        this.f86208b = (String) pk.k.g(bVar.f86221b);
        this.f86209c = (n) pk.k.g(bVar.f86222c);
        this.f86210d = bVar.f86223d;
        this.f86211e = bVar.f86224e;
        this.f86212f = bVar.f86225f;
        this.f86213g = (j) pk.k.g(bVar.f86226g);
        this.f86214h = bVar.f86227h == null ? jk.g.b() : bVar.f86227h;
        this.f86215i = bVar.f86228i == null ? jk.h.i() : bVar.f86228i;
        this.f86216j = bVar.f86229j == null ? mk.c.b() : bVar.f86229j;
        this.f86218l = bVar.f86230k;
    }

    public static b m(Context context) {
        return new b(context);
    }

    public String b() {
        return this.f86208b;
    }

    public n<File> c() {
        return this.f86209c;
    }

    public jk.a d() {
        return this.f86214h;
    }

    public jk.c e() {
        return this.f86215i;
    }

    public long f() {
        return this.f86210d;
    }

    public mk.b g() {
        return this.f86216j;
    }

    public j h() {
        return this.f86213g;
    }

    public boolean i() {
        return this.f86218l;
    }

    public long j() {
        return this.f86211e;
    }

    public long k() {
        return this.f86212f;
    }

    public int l() {
        return this.f86207a;
    }
}
