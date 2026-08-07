package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
class l implements Comparable<l> {
    static String[] D = {"position", "x", "y", Snapshot.WIDTH, Snapshot.HEIGHT, "pathRotate"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f6580c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b5.c f6597t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f6599v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f6600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f6601x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f6602y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f6603z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f6578a = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6579b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f6581d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f6582e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double[] f6583f = new double[18];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    double[] f6584g = new double[18];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f6585h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6586i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f6587j = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f6588k = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6589l = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f6590m = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f6591n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f6592o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f6593p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f6594q = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f6595r = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f6596s = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f6598u = 0;
    private float A = Float.NaN;
    private float B = Float.NaN;
    private int C = -1;

    l() {
    }

    private boolean e(float f11, float f12) {
        if (Float.isNaN(f11) || Float.isNaN(f12)) {
            return Float.isNaN(f11) != Float.isNaN(f12);
        }
        return Math.abs(f11 - f12) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, f5.d> map, int i11) {
        for (String str : map.keySet()) {
            f5.d dVar = map.get(str);
            if (dVar != null) {
                str.getClass();
                byte b11 = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b11 = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b11 = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b11 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b11 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b11 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                            b11 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b11 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b11 = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b11 = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b11 = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b11 = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b11 = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b11 = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b11 = 13;
                        }
                        break;
                }
                float f11 = BitmapDescriptorFactory.HUE_RED;
                switch (b11) {
                    case 0:
                        if (!Float.isNaN(this.f6589l)) {
                            f11 = this.f6589l;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 1:
                        if (!Float.isNaN(this.f6578a)) {
                            f11 = this.f6578a;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 2:
                        if (!Float.isNaN(this.f6594q)) {
                            f11 = this.f6594q;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 3:
                        if (!Float.isNaN(this.f6595r)) {
                            f11 = this.f6595r;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 4:
                        if (!Float.isNaN(this.f6596s)) {
                            f11 = this.f6596s;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 5:
                        if (!Float.isNaN(this.B)) {
                            f11 = this.B;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 6:
                        dVar.b(i11, Float.isNaN(this.f6590m) ? 1.0f : this.f6590m);
                        break;
                    case 7:
                        dVar.b(i11, Float.isNaN(this.f6591n) ? 1.0f : this.f6591n);
                        break;
                    case 8:
                        if (!Float.isNaN(this.f6592o)) {
                            f11 = this.f6592o;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 9:
                        if (!Float.isNaN(this.f6593p)) {
                            f11 = this.f6593p;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 10:
                        if (!Float.isNaN(this.f6588k)) {
                            f11 = this.f6588k;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 11:
                        if (!Float.isNaN(this.f6587j)) {
                            f11 = this.f6587j;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 12:
                        if (!Float.isNaN(this.A)) {
                            f11 = this.A;
                        }
                        dVar.b(i11, f11);
                        break;
                    case 13:
                        dVar.b(i11, Float.isNaN(this.f6585h) ? 1.0f : this.f6585h);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            if (this.f6581d.containsKey(str2)) {
                                androidx.constraintlayout.widget.a aVar = this.f6581d.get(str2);
                                if (dVar instanceof f5.d.b) {
                                    ((f5.d.b) dVar).h(i11, aVar);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i11 + ", value" + aVar.e() + dVar);
                                }
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline " + str);
                        }
                        break;
                }
            }
        }
    }

    public void b(View view) {
        this.f6580c = view.getVisibility();
        this.f6585h = view.getVisibility() != 0 ? BitmapDescriptorFactory.HUE_RED : view.getAlpha();
        this.f6586i = false;
        this.f6587j = view.getElevation();
        this.f6588k = view.getRotation();
        this.f6589l = view.getRotationX();
        this.f6578a = view.getRotationY();
        this.f6590m = view.getScaleX();
        this.f6591n = view.getScaleY();
        this.f6592o = view.getPivotX();
        this.f6593p = view.getPivotY();
        this.f6594q = view.getTranslationX();
        this.f6595r = view.getTranslationY();
        this.f6596s = view.getTranslationZ();
    }

    public void c(androidx.constraintlayout.widget.d.a aVar) {
        androidx.constraintlayout.widget.d.C0149d c0149d = aVar.f6989c;
        int i11 = c0149d.f7068c;
        this.f6579b = i11;
        int i12 = c0149d.f7067b;
        this.f6580c = i12;
        this.f6585h = (i12 == 0 || i11 != 0) ? c0149d.f7069d : BitmapDescriptorFactory.HUE_RED;
        androidx.constraintlayout.widget.d.e eVar = aVar.f6992f;
        this.f6586i = eVar.f7084m;
        this.f6587j = eVar.f7085n;
        this.f6588k = eVar.f7073b;
        this.f6589l = eVar.f7074c;
        this.f6578a = eVar.f7075d;
        this.f6590m = eVar.f7076e;
        this.f6591n = eVar.f7077f;
        this.f6592o = eVar.f7078g;
        this.f6593p = eVar.f7079h;
        this.f6594q = eVar.f7081j;
        this.f6595r = eVar.f7082k;
        this.f6596s = eVar.f7083l;
        this.f6597t = b5.c.c(aVar.f6990d.f7055d);
        androidx.constraintlayout.widget.d.c cVar = aVar.f6990d;
        this.A = cVar.f7060i;
        this.f6598u = cVar.f7057f;
        this.C = cVar.f7053b;
        this.B = aVar.f6989c.f7070e;
        for (String str : aVar.f6993g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f6993g.get(str);
            if (aVar2.g()) {
                this.f6581d.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        return Float.compare(this.f6599v, lVar.f6599v);
    }

    void f(l lVar, HashSet<String> hashSet) {
        if (e(this.f6585h, lVar.f6585h)) {
            hashSet.add("alpha");
        }
        if (e(this.f6587j, lVar.f6587j)) {
            hashSet.add("elevation");
        }
        int i11 = this.f6580c;
        int i12 = lVar.f6580c;
        if (i11 != i12 && this.f6579b == 0 && (i11 == 0 || i12 == 0)) {
            hashSet.add("alpha");
        }
        if (e(this.f6588k, lVar.f6588k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.A) || !Float.isNaN(lVar.A)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.B) || !Float.isNaN(lVar.B)) {
            hashSet.add(ReactProgressBarViewManager.PROP_PROGRESS);
        }
        if (e(this.f6589l, lVar.f6589l)) {
            hashSet.add("rotationX");
        }
        if (e(this.f6578a, lVar.f6578a)) {
            hashSet.add("rotationY");
        }
        if (e(this.f6592o, lVar.f6592o)) {
            hashSet.add("transformPivotX");
        }
        if (e(this.f6593p, lVar.f6593p)) {
            hashSet.add("transformPivotY");
        }
        if (e(this.f6590m, lVar.f6590m)) {
            hashSet.add("scaleX");
        }
        if (e(this.f6591n, lVar.f6591n)) {
            hashSet.add("scaleY");
        }
        if (e(this.f6594q, lVar.f6594q)) {
            hashSet.add("translationX");
        }
        if (e(this.f6595r, lVar.f6595r)) {
            hashSet.add("translationY");
        }
        if (e(this.f6596s, lVar.f6596s)) {
            hashSet.add("translationZ");
        }
    }

    void g(float f11, float f12, float f13, float f14) {
        this.f6600w = f11;
        this.f6601x = f12;
        this.f6602y = f13;
        this.f6603z = f14;
    }

    public void h(Rect rect, View view, int i11, float f11) {
        g(rect.left, rect.top, rect.width(), rect.height());
        b(view);
        this.f6592o = Float.NaN;
        this.f6593p = Float.NaN;
        if (i11 == 1) {
            this.f6588k = f11 - 90.0f;
        } else {
            if (i11 != 2) {
                return;
            }
            this.f6588k = f11 + 90.0f;
        }
    }

    public void i(Rect rect, androidx.constraintlayout.widget.d dVar, int i11, int i12) {
        g(rect.left, rect.top, rect.width(), rect.height());
        c(dVar.G(i12));
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                }
            }
            float f11 = this.f6588k + 90.0f;
            this.f6588k = f11;
            if (f11 > 180.0f) {
                this.f6588k = f11 - 360.0f;
                return;
            }
            return;
        }
        this.f6588k -= 90.0f;
    }

    public void j(View view) {
        g(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }
}
