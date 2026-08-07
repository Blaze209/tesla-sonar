package ml;

import android.R;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ll.s;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f92294t = s.f90220h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f92295u = s.f90221i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f92296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f92297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f92298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f92299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s f92300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f92301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s f92302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f92303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private s f92304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f92305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s f92306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private s f92307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f92308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PointF f92309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorFilter f92310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f92311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<Drawable> f92312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f92313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f92314s;

    public b(Resources resources) {
        this.f92296a = resources;
        t();
    }

    private void K() {
        List<Drawable> list = this.f92312q;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                k.g(it.next());
            }
        }
    }

    private void t() {
        this.f92297b = 300;
        this.f92298c = BitmapDescriptorFactory.HUE_RED;
        this.f92299d = null;
        s sVar = f92294t;
        this.f92300e = sVar;
        this.f92301f = null;
        this.f92302g = sVar;
        this.f92303h = null;
        this.f92304i = sVar;
        this.f92305j = null;
        this.f92306k = sVar;
        this.f92307l = f92295u;
        this.f92308m = null;
        this.f92309n = null;
        this.f92310o = null;
        this.f92311p = null;
        this.f92312q = null;
        this.f92313r = null;
        this.f92314s = null;
    }

    public static b u(Resources resources) {
        return new b(resources);
    }

    public b A(s sVar) {
        this.f92304i = sVar;
        return this;
    }

    public b B(Drawable drawable) {
        if (drawable == null) {
            this.f92312q = null;
            return this;
        }
        this.f92312q = Arrays.asList(drawable);
        return this;
    }

    public b C(Drawable drawable) {
        this.f92299d = drawable;
        return this;
    }

    public b D(s sVar) {
        this.f92300e = sVar;
        return this;
    }

    public b E(Drawable drawable) {
        if (drawable == null) {
            this.f92313r = null;
            return this;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        this.f92313r = stateListDrawable;
        return this;
    }

    public b F(Drawable drawable) {
        this.f92305j = drawable;
        return this;
    }

    public b G(s sVar) {
        this.f92306k = sVar;
        return this;
    }

    public b H(Drawable drawable) {
        this.f92301f = drawable;
        return this;
    }

    public b I(s sVar) {
        this.f92302g = sVar;
        return this;
    }

    public b J(e eVar) {
        this.f92314s = eVar;
        return this;
    }

    public a a() {
        K();
        return new a(this);
    }

    public ColorFilter b() {
        return this.f92310o;
    }

    public PointF c() {
        return this.f92309n;
    }

    public s d() {
        return this.f92307l;
    }

    public Drawable e() {
        return this.f92311p;
    }

    public float f() {
        return this.f92298c;
    }

    public int g() {
        return this.f92297b;
    }

    public Drawable h() {
        return this.f92303h;
    }

    public s i() {
        return this.f92304i;
    }

    public List<Drawable> j() {
        return this.f92312q;
    }

    public Drawable k() {
        return this.f92299d;
    }

    public s l() {
        return this.f92300e;
    }

    public Drawable m() {
        return this.f92313r;
    }

    public Drawable n() {
        return this.f92305j;
    }

    public s o() {
        return this.f92306k;
    }

    public Resources p() {
        return this.f92296a;
    }

    public Drawable q() {
        return this.f92301f;
    }

    public s r() {
        return this.f92302g;
    }

    public e s() {
        return this.f92314s;
    }

    public b v(s sVar) {
        this.f92307l = sVar;
        this.f92308m = null;
        return this;
    }

    public b w(Drawable drawable) {
        this.f92311p = drawable;
        return this;
    }

    public b x(float f11) {
        this.f92298c = f11;
        return this;
    }

    public b y(int i11) {
        this.f92297b = i11;
        return this;
    }

    public b z(Drawable drawable) {
        this.f92303h = drawable;
        return this;
    }
}
