package tf;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.collection.y0;
import ch.qos.logback.classic.net.SyslogAppender;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, List<dg.e>> f113323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, z> f113324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f113325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, ag.c> f113326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<ag.h> f113327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private y0<ag.d> f113328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.collection.v<dg.e> f113329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<dg.e> f113330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f113331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f113332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f113333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f113334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f113335o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f113337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f113338r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f113321a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<String> f113322b = new HashSet<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f113336p = 0;

    public void a(String str) {
        hg.e.c(str);
        this.f113322b.add(str);
    }

    public Rect b() {
        return this.f113331k;
    }

    public y0<ag.d> c() {
        return this.f113328h;
    }

    public float d() {
        return (long) ((e() / this.f113334n) * 1000.0f);
    }

    public float e() {
        return this.f113333m - this.f113332l;
    }

    public float f() {
        return this.f113333m;
    }

    public Map<String, ag.c> g() {
        return this.f113326f;
    }

    public float h(float f11) {
        return hg.j.i(this.f113332l, this.f113333m, f11);
    }

    public float i() {
        return this.f113334n;
    }

    public Map<String, z> j() {
        float fE = hg.l.e();
        if (fE != this.f113325e) {
            for (Map.Entry<String, z> entry : this.f113324d.entrySet()) {
                this.f113324d.put(entry.getKey(), entry.getValue().a(this.f113325e / fE));
            }
        }
        this.f113325e = fE;
        return this.f113324d;
    }

    public List<dg.e> k() {
        return this.f113330j;
    }

    public ag.h l(String str) {
        int size = this.f113327g.size();
        for (int i11 = 0; i11 < size; i11++) {
            ag.h hVar = this.f113327g.get(i11);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f113336p;
    }

    public h0 n() {
        return this.f113321a;
    }

    public List<dg.e> o(String str) {
        return this.f113323c.get(str);
    }

    public float p() {
        return this.f113332l;
    }

    public boolean q() {
        return this.f113335o;
    }

    public boolean r() {
        return !this.f113324d.isEmpty();
    }

    public void s(int i11) {
        this.f113336p += i11;
    }

    public void t(Rect rect, float f11, float f12, float f13, List<dg.e> list, androidx.collection.v<dg.e> vVar, Map<String, List<dg.e>> map, Map<String, z> map2, float f14, y0<ag.d> y0Var, Map<String, ag.c> map3, List<ag.h> list2, int i11, int i12) {
        this.f113331k = rect;
        this.f113332l = f11;
        this.f113333m = f12;
        this.f113334n = f13;
        this.f113330j = list;
        this.f113329i = vVar;
        this.f113323c = map;
        this.f113324d = map2;
        this.f113325e = f14;
        this.f113328h = y0Var;
        this.f113326f = map3;
        this.f113327g = list2;
        this.f113337q = i11;
        this.f113338r = i12;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<dg.e> it = this.f113330j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().z(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
        }
        return sb2.toString();
    }

    public dg.e u(long j11) {
        return this.f113329i.d(j11);
    }

    public void v(boolean z11) {
        this.f113335o = z11;
    }

    public void w(boolean z11) {
        this.f113321a.b(z11);
    }
}
