package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class m {
    private HashMap<String, f5.f> B;
    private HashMap<String, f5.d> C;
    private HashMap<String, f5.c> D;
    private k[] E;
    private int F;
    private int G;
    private View H;
    private int I;
    private float J;
    private Interpolator K;
    private boolean L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f6605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f6606c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f6608e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b5.b[] f6614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b5.b f6615l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f6619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f6620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int[] f6621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double[] f6622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double[] f6623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String[] f6624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f6625v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Rect f6604a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f6607d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6609f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f6610g = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f6611h = new q();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f6612i = new l();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l f6613j = new l();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f6616m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f6617n = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f6618o = 1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f6626w = 4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float[] f6627x = new float[4];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ArrayList<q> f6628y = new ArrayList<>();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float[] f6629z = new float[1];
    private ArrayList<d> A = new ArrayList<>();

    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b5.c f6630a;

        a(b5.c cVar) {
            this.f6630a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) this.f6630a.a(f11);
        }
    }

    m(View view) {
        int i11 = d.f6477f;
        this.F = i11;
        this.G = i11;
        this.H = null;
        this.I = i11;
        this.J = Float.NaN;
        this.K = null;
        this.L = false;
        E(view);
    }

    private float g(float f11, float[] fArr) {
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f6618o;
            if (f13 != 1.0d) {
                float f14 = this.f6617n;
                if (f11 < f14) {
                    f11 = 0.0f;
                }
                if (f11 > f14 && f11 < 1.0d) {
                    f11 = Math.min((f11 - f14) * f13, 1.0f);
                }
            }
        }
        b5.c cVar = this.f6610g.f6713a;
        float f15 = Float.NaN;
        for (q qVar : this.f6628y) {
            b5.c cVar2 = qVar.f6713a;
            if (cVar2 != null) {
                float f16 = qVar.f6715c;
                if (f16 < f11) {
                    cVar = cVar2;
                    f12 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = qVar.f6715c;
                }
            }
        }
        if (cVar != null) {
            float f17 = (Float.isNaN(f15) ? 1.0f : f15) - f12;
            double d11 = (f11 - f12) / f17;
            f11 = (((float) cVar.a(d11)) * f17) + f12;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d11);
            }
        }
        return f11;
    }

    private static Interpolator p(Context context, int i11, String str, int i12) {
        if (i11 == -2) {
            return AnimationUtils.loadInterpolator(context, i12);
        }
        if (i11 == -1) {
            return new a(b5.c.c(str));
        }
        if (i11 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i11 == 1) {
            return new AccelerateInterpolator();
        }
        if (i11 == 2) {
            return new DecelerateInterpolator();
        }
        if (i11 == 4) {
            return new BounceInterpolator();
        }
        if (i11 != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    private float r() {
        float[] fArr = new float[2];
        float f11 = 1.0f / 99;
        double d11 = 0.0d;
        double d12 = 0.0d;
        int i11 = 0;
        float fHypot = BitmapDescriptorFactory.HUE_RED;
        while (i11 < 100) {
            float f12 = i11 * f11;
            double dA = f12;
            b5.c cVar = this.f6610g.f6713a;
            float f13 = Float.NaN;
            float f14 = BitmapDescriptorFactory.HUE_RED;
            for (q qVar : this.f6628y) {
                b5.c cVar2 = qVar.f6713a;
                if (cVar2 != null) {
                    float f15 = qVar.f6715c;
                    if (f15 < f12) {
                        cVar = cVar2;
                        f14 = f15;
                    } else if (Float.isNaN(f13)) {
                        f13 = qVar.f6715c;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                float f16 = f13 - f14;
                dA = (((float) cVar.a((f12 - f14) / f16)) * f16) + f14;
            }
            double d13 = dA;
            this.f6614k[0].d(d13, this.f6622s);
            int i12 = i11;
            this.f6610g.f(d13, this.f6621r, this.f6622s, fArr, 0);
            if (i12 > 0) {
                fHypot += (float) Math.hypot(d12 - ((double) fArr[1]), d11 - ((double) fArr[0]));
            }
            d11 = fArr[0];
            d12 = fArr[1];
            i11 = i12 + 1;
        }
        return fHypot;
    }

    private void t(q qVar) {
        int iBinarySearch = Collections.binarySearch(this.f6628y, qVar);
        if (iBinarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + qVar.f6716d + "\" outside of range");
        }
        this.f6628y.add((-iBinarySearch) - 1, qVar);
    }

    private void v(q qVar) {
        qVar.q((int) this.f6605b.getX(), (int) this.f6605b.getY(), this.f6605b.getWidth(), this.f6605b.getHeight());
    }

    public void A(int i11) {
        this.F = i11;
    }

    void B(View view) {
        q qVar = this.f6610g;
        qVar.f6715c = BitmapDescriptorFactory.HUE_RED;
        qVar.f6716d = BitmapDescriptorFactory.HUE_RED;
        qVar.q(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f6612i.j(view);
    }

    void C(Rect rect, androidx.constraintlayout.widget.d dVar, int i11, int i12) {
        m mVar;
        Rect rect2;
        int i13 = dVar.f6983e;
        if (i13 != 0) {
            mVar = this;
            rect2 = rect;
            mVar.x(rect2, this.f6604a, i13, i11, i12);
        } else {
            mVar = this;
            rect2 = rect;
        }
        q qVar = mVar.f6610g;
        qVar.f6715c = BitmapDescriptorFactory.HUE_RED;
        qVar.f6716d = BitmapDescriptorFactory.HUE_RED;
        v(qVar);
        mVar.f6610g.q(rect2.left, rect2.top, rect2.width(), rect2.height());
        androidx.constraintlayout.widget.d.a aVarG = dVar.G(mVar.f6606c);
        mVar.f6610g.a(aVarG);
        mVar.f6616m = aVarG.f6990d.f7058g;
        mVar.f6612i.i(rect2, dVar, i13, mVar.f6606c);
        mVar.G = aVarG.f6992f.f7080i;
        androidx.constraintlayout.widget.d.c cVar = aVarG.f6990d;
        mVar.I = cVar.f7062k;
        mVar.J = cVar.f7061j;
        Context context = mVar.f6605b.getContext();
        androidx.constraintlayout.widget.d.c cVar2 = aVarG.f6990d;
        mVar.K = p(context, cVar2.f7064m, cVar2.f7063l, cVar2.f7065n);
    }

    public void D(f5.e eVar, View view, int i11, int i12, int i13) {
        q qVar = this.f6610g;
        qVar.f6715c = BitmapDescriptorFactory.HUE_RED;
        qVar.f6716d = BitmapDescriptorFactory.HUE_RED;
        Rect rect = new Rect();
        if (i11 == 1) {
            int i14 = eVar.f64396b + eVar.f64398d;
            rect.left = ((eVar.f64397c + eVar.f64399e) - eVar.b()) / 2;
            rect.top = i12 - ((i14 + eVar.a()) / 2);
            rect.right = rect.left + eVar.b();
            rect.bottom = rect.top + eVar.a();
        } else if (i11 == 2) {
            int i15 = eVar.f64396b + eVar.f64398d;
            rect.left = i13 - (((eVar.f64397c + eVar.f64399e) + eVar.b()) / 2);
            rect.top = (i15 - eVar.a()) / 2;
            rect.right = rect.left + eVar.b();
            rect.bottom = rect.top + eVar.a();
        }
        this.f6610g.q(rect.left, rect.top, rect.width(), rect.height());
        this.f6612i.h(rect, view, i11, eVar.f64395a);
    }

    public void E(View view) {
        this.f6605b = view;
        this.f6606c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f6608e = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public void F(int i11, int i12, float f11, long j11) {
        ArrayList arrayList;
        String[] strArr;
        androidx.constraintlayout.widget.a aVar;
        f5.f fVarH;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        f5.d dVarF;
        androidx.constraintlayout.widget.a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i13 = this.F;
        if (i13 != d.f6477f) {
            this.f6610g.f6723k = i13;
        }
        this.f6612i.f(this.f6613j, hashSet2);
        ArrayList<d> arrayList2 = this.A;
        if (arrayList2 != null) {
            arrayList = null;
            for (d dVar : arrayList2) {
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    t(new q(i11, i12, hVar, this.f6610g, this.f6611h));
                    int i14 = hVar.f6537g;
                    if (i14 != d.f6477f) {
                        this.f6609f = i14;
                    }
                } else if (dVar instanceof f) {
                    dVar.d(hashSet3);
                } else if (dVar instanceof j) {
                    dVar.d(hashSet);
                } else if (dVar instanceof k) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((k) dVar);
                } else {
                    dVar.g(map);
                    dVar.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i15 = 0;
        if (arrayList != null) {
            this.E = (k[]) arrayList.toArray(new k[0]);
        }
        char c11 = 1;
        if (!hashSet2.isEmpty()) {
            this.C = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (d dVar2 : this.A) {
                        HashMap<String, androidx.constraintlayout.widget.a> map2 = dVar2.f6482e;
                        if (map2 != null && (aVar3 = map2.get(str2)) != null) {
                            sparseArray.append(dVar2.f6478a, aVar3);
                        }
                    }
                    dVarF = f5.d.e(str, sparseArray);
                } else {
                    dVarF = f5.d.f(str);
                }
                if (dVarF != null) {
                    dVarF.c(str);
                    this.C.put(str, dVarF);
                }
            }
            ArrayList<d> arrayList3 = this.A;
            if (arrayList3 != null) {
                for (d dVar3 : arrayList3) {
                    if (dVar3 instanceof e) {
                        dVar3.a(this.C);
                    }
                }
            }
            this.f6612i.a(this.C, 0);
            this.f6613j.a(this.C, 100);
            for (String str3 : this.C.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                f5.d dVar4 = this.C.get(str3);
                if (dVar4 != null) {
                    dVar4.d(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.B == null) {
                this.B = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (d dVar5 : this.A) {
                            HashMap<String, androidx.constraintlayout.widget.a> map3 = dVar5.f6482e;
                            if (map3 != null && (aVar2 = map3.get(str5)) != null) {
                                sparseArray2.append(dVar5.f6478a, aVar2);
                            }
                        }
                        fVarH = f5.f.g(str4, sparseArray2);
                    } else {
                        fVarH = f5.f.h(str4, j11);
                    }
                    if (fVarH != null) {
                        fVarH.d(str4);
                        this.B.put(str4, fVarH);
                    }
                }
            }
            ArrayList<d> arrayList4 = this.A;
            if (arrayList4 != null) {
                for (d dVar6 : arrayList4) {
                    if (dVar6 instanceof j) {
                        ((j) dVar6).Q(this.B);
                    }
                }
            }
            for (String str6 : this.B.keySet()) {
                this.B.get(str6).e(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.f6628y.size();
        int i16 = size + 2;
        q[] qVarArr = new q[i16];
        qVarArr[0] = this.f6610g;
        qVarArr[size + 1] = this.f6611h;
        if (this.f6628y.size() > 0 && this.f6609f == -1) {
            this.f6609f = 0;
        }
        Iterator<q> it = this.f6628y.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            qVarArr[i17] = it.next();
            i17++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f6611h.f6727o.keySet()) {
            if (this.f6610g.f6727o.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f6624u = strArr2;
        this.f6625v = new int[strArr2.length];
        int i18 = 0;
        while (true) {
            strArr = this.f6624u;
            if (i18 >= strArr.length) {
                break;
            }
            String str8 = strArr[i18];
            this.f6625v[i18] = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                if (qVarArr[i19].f6727o.containsKey(str8) && (aVar = qVarArr[i19].f6727o.get(str8)) != null) {
                    int[] iArr = this.f6625v;
                    iArr[i18] = iArr[i18] + aVar.h();
                    break;
                }
            }
            i18++;
        }
        boolean z11 = qVarArr[0].f6723k != d.f6477f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i21 = 1; i21 < i16; i21++) {
            qVarArr[i21].d(qVarArr[i21 - 1], zArr, this.f6624u, z11);
        }
        int i22 = 0;
        for (int i23 = 1; i23 < length; i23++) {
            if (zArr[i23]) {
                i22++;
            }
        }
        this.f6621r = new int[i22];
        int i24 = 2;
        int iMax = Math.max(2, i22);
        this.f6622s = new double[iMax];
        this.f6623t = new double[iMax];
        int i25 = 0;
        for (int i26 = 1; i26 < length; i26++) {
            if (zArr[i26]) {
                this.f6621r[i25] = i26;
                i25++;
            }
        }
        int[] iArr2 = {i16, this.f6621r.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i16];
        for (int i27 = 0; i27 < i16; i27++) {
            qVarArr[i27].e(dArr[i27], this.f6621r);
            dArr2[i27] = qVarArr[i27].f6715c;
        }
        int i28 = 0;
        while (true) {
            int[] iArr3 = this.f6621r;
            if (i28 >= iArr3.length) {
                break;
            }
            if (iArr3[i28] < q.f6712t.length) {
                String str9 = q.f6712t[this.f6621r[i28]] + " [";
                for (int i29 = 0; i29 < i16; i29++) {
                    str9 = str9 + dArr[i29][i28];
                }
            }
            i28++;
        }
        this.f6614k = new b5.b[this.f6624u.length + 1];
        int i31 = 0;
        while (true) {
            String[] strArr3 = this.f6624u;
            if (i31 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i31];
            int i32 = i15;
            int i33 = i32;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i32 < i16) {
                char c12 = c11;
                if (qVarArr[i32].k(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i16];
                        int[] iArr4 = new int[i24];
                        iArr4[c12] = qVarArr[i32].i(str10);
                        iArr4[i15] = i16;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    }
                    q qVar = qVarArr[i32];
                    dArr3[i33] = qVar.f6715c;
                    qVar.h(str10, dArr4[i33], 0);
                    i33++;
                }
                i32++;
                c11 = c12;
                qVarArr = qVarArr;
                i24 = 2;
                i15 = 0;
            }
            i31++;
            this.f6614k[i31] = b5.b.a(this.f6609f, Arrays.copyOf(dArr3, i33), (double[][]) Arrays.copyOf(dArr4, i33));
            c11 = c11;
            qVarArr = qVarArr;
            i24 = 2;
            i15 = 0;
        }
        q[] qVarArr2 = qVarArr;
        char c13 = c11;
        this.f6614k[0] = b5.b.a(this.f6609f, dArr2, dArr);
        if (qVarArr2[0].f6723k != d.f6477f) {
            int[] iArr5 = new int[i16];
            double[] dArr5 = new double[i16];
            int[] iArr6 = new int[2];
            iArr6[c13] = 2;
            iArr6[0] = i16;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i34 = 0; i34 < i16; i34++) {
                q qVar2 = qVarArr2[i34];
                iArr5[i34] = qVar2.f6723k;
                dArr5[i34] = qVar2.f6715c;
                double[] dArr7 = dArr6[i34];
                dArr7[0] = qVar2.f6717e;
                dArr7[c13] = qVar2.f6718f;
            }
            this.f6615l = b5.b.b(iArr5, dArr5, dArr6);
        }
        this.D = new HashMap<>();
        if (this.A != null) {
            float fR = Float.NaN;
            for (String str11 : hashSet3) {
                f5.c cVarH = f5.c.h(str11);
                if (cVarH != null) {
                    if (cVarH.g() && Float.isNaN(fR)) {
                        fR = r();
                    }
                    cVarH.e(str11);
                    this.D.put(str11, cVarH);
                }
            }
            for (d dVar7 : this.A) {
                if (dVar7 instanceof f) {
                    ((f) dVar7).U(this.D);
                }
            }
            Iterator<f5.c> it2 = this.D.values().iterator();
            while (it2.hasNext()) {
                it2.next().f(fR);
            }
        }
    }

    public void G(m mVar) {
        this.f6610g.t(mVar, mVar.f6610g);
        this.f6611h.t(mVar, mVar.f6611h);
    }

    public void a(d dVar) {
        this.A.add(dVar);
    }

    void b(ArrayList<d> arrayList) {
        this.A.addAll(arrayList);
    }

    int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrG = this.f6614k[0].g();
        if (iArr != null) {
            Iterator<q> it = this.f6628y.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                iArr[i11] = it.next().f6728p;
                i11++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < dArrG.length; i13++) {
            this.f6614k[0].d(dArrG[i13], this.f6622s);
            this.f6610g.f(dArrG[i13], this.f6621r, this.f6622s, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    void d(float[] fArr, int i11) {
        int i12 = i11;
        float f11 = 1.0f;
        float f12 = 1.0f / (i12 - 1);
        HashMap<String, f5.d> map = this.C;
        f5.d dVar = map == null ? null : map.get("translationX");
        HashMap<String, f5.d> map2 = this.C;
        f5.d dVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, f5.c> map3 = this.D;
        f5.c cVar = map3 == null ? null : map3.get("translationX");
        HashMap<String, f5.c> map4 = this.D;
        f5.c cVar2 = map4 != null ? map4.get("translationY") : null;
        int i13 = 0;
        while (i13 < i12) {
            float fMin = i13 * f12;
            float f13 = this.f6618o;
            float f14 = BitmapDescriptorFactory.HUE_RED;
            if (f13 != f11) {
                float f15 = this.f6617n;
                if (fMin < f15) {
                    fMin = 0.0f;
                }
                if (fMin > f15 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f15) * f13, f11);
                }
            }
            double dA = fMin;
            b5.c cVar3 = this.f6610g.f6713a;
            float f16 = Float.NaN;
            for (q qVar : this.f6628y) {
                b5.c cVar4 = qVar.f6713a;
                if (cVar4 != null) {
                    float f17 = qVar.f6715c;
                    if (f17 < fMin) {
                        f14 = f17;
                        cVar3 = cVar4;
                    } else if (Float.isNaN(f16)) {
                        f16 = qVar.f6715c;
                    }
                }
            }
            if (cVar3 != null) {
                if (Float.isNaN(f16)) {
                    f16 = 1.0f;
                }
                float f18 = f16 - f14;
                dA = (((float) cVar3.a((fMin - f14) / f18)) * f18) + f14;
            }
            this.f6614k[0].d(dA, this.f6622s);
            b5.b bVar = this.f6615l;
            if (bVar != null) {
                double[] dArr = this.f6622s;
                if (dArr.length > 0) {
                    bVar.d(dA, dArr);
                }
            }
            int i14 = i13 * 2;
            this.f6610g.f(dA, this.f6621r, this.f6622s, fArr, i14);
            if (cVar != null) {
                fArr[i14] = fArr[i14] + cVar.a(fMin);
            } else if (dVar != null) {
                fArr[i14] = fArr[i14] + dVar.a(fMin);
            }
            if (cVar2 != null) {
                int i15 = i14 + 1;
                fArr[i15] = fArr[i15] + cVar2.a(fMin);
            } else if (dVar2 != null) {
                int i16 = i14 + 1;
                fArr[i16] = fArr[i16] + dVar2.a(fMin);
            }
            i13++;
            i12 = i11;
            f11 = 1.0f;
        }
    }

    void e(float f11, float[] fArr, int i11) {
        this.f6614k[0].d(g(f11, null), this.f6622s);
        this.f6610g.j(this.f6621r, this.f6622s, fArr, i11);
    }

    void f(boolean z11) {
        if (!"button".equals(androidx.constraintlayout.motion.widget.a.d(this.f6605b)) || this.E == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            k[] kVarArr = this.E;
            if (i11 >= kVarArr.length) {
                return;
            }
            kVarArr[i11].u(z11 ? -100.0f : 100.0f, this.f6605b);
            i11++;
        }
    }

    public int h() {
        return this.f6610g.f6724l;
    }

    public void i(double d11, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f6614k[0].d(d11, dArr);
        this.f6614k[0].f(d11, dArr2);
        Arrays.fill(fArr2, BitmapDescriptorFactory.HUE_RED);
        this.f6610g.g(d11, this.f6621r, dArr, fArr, dArr2, fArr2);
    }

    public float j() {
        return this.f6619p;
    }

    public float k() {
        return this.f6620q;
    }

    void l(float f11, float f12, float f13, float[] fArr) {
        double[] dArr;
        float fG = g(f11, this.f6629z);
        b5.b[] bVarArr = this.f6614k;
        int i11 = 0;
        if (bVarArr == null) {
            q qVar = this.f6611h;
            float f14 = qVar.f6717e;
            q qVar2 = this.f6610g;
            float f15 = f14 - qVar2.f6717e;
            float f16 = qVar.f6718f - qVar2.f6718f;
            float f17 = (qVar.f6719g - qVar2.f6719g) + f15;
            float f18 = (qVar.f6720h - qVar2.f6720h) + f16;
            fArr[0] = (f15 * (1.0f - f12)) + (f17 * f12);
            fArr[1] = (f16 * (1.0f - f13)) + (f18 * f13);
            return;
        }
        double d11 = fG;
        bVarArr[0].f(d11, this.f6623t);
        this.f6614k[0].d(d11, this.f6622s);
        float f19 = this.f6629z[0];
        while (true) {
            dArr = this.f6623t;
            if (i11 >= dArr.length) {
                break;
            }
            dArr[i11] = dArr[i11] * ((double) f19);
            i11++;
        }
        b5.b bVar = this.f6615l;
        if (bVar == null) {
            this.f6610g.r(f12, f13, fArr, this.f6621r, dArr, this.f6622s);
            return;
        }
        double[] dArr2 = this.f6622s;
        if (dArr2.length > 0) {
            bVar.d(d11, dArr2);
            this.f6615l.f(d11, this.f6623t);
            this.f6610g.r(f12, f13, fArr, this.f6621r, this.f6623t, this.f6622s);
        }
    }

    public int m() {
        int iMax = this.f6610g.f6714b;
        Iterator<q> it = this.f6628y.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f6714b);
        }
        return Math.max(iMax, this.f6611h.f6714b);
    }

    public float n() {
        return this.f6611h.f6717e;
    }

    public float o() {
        return this.f6611h.f6718f;
    }

    q q(int i11) {
        return this.f6628y.get(i11);
    }

    public View s() {
        return this.f6605b;
    }

    public String toString() {
        return " start: x: " + this.f6610g.f6717e + " y: " + this.f6610g.f6718f + " end: x: " + this.f6611h.f6717e + " y: " + this.f6611h.f6718f;
    }

    boolean u(View view, float f11, long j11, b5.d dVar) {
        f5.f.d dVar2;
        boolean zJ;
        View view2;
        View view3;
        float f12;
        double d11;
        View view4 = view;
        float fG = g(f11, null);
        int i11 = this.I;
        if (i11 != d.f6477f) {
            float f13 = 1.0f / i11;
            float fFloor = ((float) Math.floor(fG / f13)) * f13;
            float f14 = (fG % f13) / f13;
            if (!Float.isNaN(this.J)) {
                f14 = (f14 + this.J) % 1.0f;
            }
            Interpolator interpolator = this.K;
            fG = ((interpolator != null ? interpolator.getInterpolation(f14) : ((double) f14) > 0.5d ? 1.0f : BitmapDescriptorFactory.HUE_RED) * f13) + fFloor;
        }
        HashMap<String, f5.d> map = this.C;
        if (map != null) {
            Iterator<f5.d> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().g(view4, fG);
            }
        }
        HashMap<String, f5.f> map2 = this.B;
        if (map2 != null) {
            f5.f.d dVar3 = null;
            boolean zI = false;
            for (f5.f fVar : map2.values()) {
                if (fVar instanceof f5.f.d) {
                    dVar3 = (f5.f.d) fVar;
                } else {
                    zI |= fVar.i(view4, fG, j11, dVar);
                    view4 = view;
                }
            }
            zJ = zI;
            dVar2 = dVar3;
        } else {
            dVar2 = null;
            zJ = false;
        }
        b5.b[] bVarArr = this.f6614k;
        if (bVarArr != null) {
            double d12 = fG;
            bVarArr[0].d(d12, this.f6622s);
            this.f6614k[0].f(d12, this.f6623t);
            b5.b bVar = this.f6615l;
            if (bVar != null) {
                double[] dArr = this.f6622s;
                if (dArr.length > 0) {
                    bVar.d(d12, dArr);
                    this.f6615l.f(d12, this.f6623t);
                }
            }
            if (this.L) {
                view3 = view;
                f12 = BitmapDescriptorFactory.HUE_RED;
                d11 = d12;
            } else {
                q qVar = this.f6610g;
                int[] iArr = this.f6621r;
                double[] dArr2 = this.f6622s;
                double[] dArr3 = this.f6623t;
                boolean z11 = this.f6607d;
                float f15 = fG;
                d11 = d12;
                f12 = BitmapDescriptorFactory.HUE_RED;
                qVar.s(f15, view, iArr, dArr2, dArr3, null, z11);
                fG = f15;
                view3 = view;
                this.f6607d = false;
            }
            if (this.G != d.f6477f) {
                if (this.H == null) {
                    this.H = ((View) view3.getParent()).findViewById(this.G);
                }
                View view5 = this.H;
                if (view5 != null) {
                    float top = (view5.getTop() + this.H.getBottom()) / 2.0f;
                    float left = (this.H.getLeft() + this.H.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        float left2 = left - view3.getLeft();
                        float top2 = top - view3.getTop();
                        view3.setPivotX(left2);
                        view3.setPivotY(top2);
                    }
                }
            }
            HashMap<String, f5.d> map3 = this.C;
            if (map3 != null) {
                for (f5.d dVar4 : map3.values()) {
                    if (dVar4 instanceof f5.d.C1321d) {
                        double[] dArr4 = this.f6623t;
                        if (dArr4.length > 1) {
                            ((f5.d.C1321d) dVar4).h(view3, fG, dArr4[0], dArr4[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (dVar2 != null) {
                double[] dArr5 = this.f6623t;
                view2 = view;
                float f16 = fG;
                fG = f16;
                zJ |= dVar2.j(view2, dVar, f16, j11, dArr5[0], dArr5[1]);
            } else {
                view2 = view;
            }
            int i12 = 1;
            while (true) {
                b5.b[] bVarArr2 = this.f6614k;
                if (i12 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i12].e(d11, this.f6627x);
                f5.a.b(this.f6610g.f6727o.get(this.f6624u[i12 - 1]), view2, this.f6627x);
                i12++;
            }
            l lVar = this.f6612i;
            if (lVar.f6579b == 0) {
                if (fG <= f12) {
                    view2.setVisibility(lVar.f6580c);
                } else if (fG >= 1065353216) {
                    view2.setVisibility(this.f6613j.f6580c);
                } else if (this.f6613j.f6580c != lVar.f6580c) {
                    view2.setVisibility(0);
                }
            }
            if (this.E != null) {
                int i13 = 0;
                while (true) {
                    k[] kVarArr = this.E;
                    if (i13 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i13].u(fG, view2);
                    i13++;
                }
            }
        } else {
            view2 = view;
            q qVar2 = this.f6610g;
            float f17 = qVar2.f6717e;
            q qVar3 = this.f6611h;
            float f18 = f17 + ((qVar3.f6717e - f17) * fG);
            float f19 = qVar2.f6718f;
            float f21 = f19 + ((qVar3.f6718f - f19) * fG);
            float f22 = qVar2.f6719g;
            float f23 = qVar3.f6719g;
            float f24 = qVar2.f6720h;
            float f25 = qVar3.f6720h;
            float f26 = f18 + 0.5f;
            int i14 = (int) f26;
            float f27 = f21 + 0.5f;
            int i15 = (int) f27;
            int i16 = (int) (f26 + ((f23 - f22) * fG) + f22);
            int i17 = (int) (f27 + ((f25 - f24) * fG) + f24);
            int i18 = i16 - i14;
            int i19 = i17 - i15;
            if (f23 != f22 || f25 != f24 || this.f6607d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.f6607d = false;
            }
            view2.layout(i14, i15, i16, i17);
        }
        HashMap<String, f5.c> map4 = this.D;
        if (map4 != null) {
            for (f5.c cVar : map4.values()) {
                if (cVar instanceof f5.c.d) {
                    double[] dArr6 = this.f6623t;
                    ((f5.c.d) cVar).j(view2, fG, dArr6[0], dArr6[1]);
                } else {
                    cVar.i(view2, fG);
                }
            }
        }
        return zJ;
    }

    public void w() {
        this.f6607d = true;
    }

    void x(Rect rect, Rect rect2, int i11, int i12, int i13) {
        if (i11 == 1) {
            int i14 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i13 - ((i14 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i11 == 2) {
            int i15 = rect.left + rect.right;
            rect2.left = i12 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i15 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i11 == 3) {
            int i16 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i16 / 2);
            rect2.top = i13 - ((i16 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i11 != 4) {
            return;
        }
        int i17 = rect.left + rect.right;
        rect2.left = i12 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i17 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    void y(View view) {
        q qVar = this.f6610g;
        qVar.f6715c = BitmapDescriptorFactory.HUE_RED;
        qVar.f6716d = BitmapDescriptorFactory.HUE_RED;
        this.L = true;
        qVar.q(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f6611h.q(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f6612i.j(view);
        this.f6613j.j(view);
    }

    void z(Rect rect, androidx.constraintlayout.widget.d dVar, int i11, int i12) {
        m mVar;
        int i13 = dVar.f6983e;
        if (i13 != 0) {
            mVar = this;
            mVar.x(rect, this.f6604a, i13, i11, i12);
            rect = mVar.f6604a;
        } else {
            mVar = this;
        }
        q qVar = mVar.f6611h;
        qVar.f6715c = 1.0f;
        qVar.f6716d = 1.0f;
        v(qVar);
        mVar.f6611h.q(rect.left, rect.top, rect.width(), rect.height());
        mVar.f6611h.a(dVar.G(mVar.f6606c));
        mVar.f6613j.i(rect, dVar, i13, mVar.f6606c);
    }
}
