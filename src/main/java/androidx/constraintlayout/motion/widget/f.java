package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f6501g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6502h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6503i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f6504j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f6505k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6506l = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f6507m = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f6508n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f6509o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f6510p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f6511q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f6512r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f6513s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f6514t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f6515u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f6516v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f6517w = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f6518x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f6519y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f6520z = Float.NaN;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f6521a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6521a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.C5, 1);
            f6521a.append(androidx.constraintlayout.widget.i.A5, 2);
            f6521a.append(androidx.constraintlayout.widget.i.D5, 3);
            f6521a.append(androidx.constraintlayout.widget.i.f7378z5, 4);
            f6521a.append(androidx.constraintlayout.widget.i.I5, 5);
            f6521a.append(androidx.constraintlayout.widget.i.G5, 6);
            f6521a.append(androidx.constraintlayout.widget.i.F5, 7);
            f6521a.append(androidx.constraintlayout.widget.i.J5, 8);
            f6521a.append(androidx.constraintlayout.widget.i.f7268p5, 9);
            f6521a.append(androidx.constraintlayout.widget.i.f7367y5, 10);
            f6521a.append(androidx.constraintlayout.widget.i.f7323u5, 11);
            f6521a.append(androidx.constraintlayout.widget.i.f7334v5, 12);
            f6521a.append(androidx.constraintlayout.widget.i.f7345w5, 13);
            f6521a.append(androidx.constraintlayout.widget.i.E5, 14);
            f6521a.append(androidx.constraintlayout.widget.i.f7301s5, 15);
            f6521a.append(androidx.constraintlayout.widget.i.f7312t5, 16);
            f6521a.append(androidx.constraintlayout.widget.i.f7279q5, 17);
            f6521a.append(androidx.constraintlayout.widget.i.f7290r5, 18);
            f6521a.append(androidx.constraintlayout.widget.i.f7356x5, 19);
            f6521a.append(androidx.constraintlayout.widget.i.B5, 20);
            f6521a.append(androidx.constraintlayout.widget.i.H5, 21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f6521a.get(index)) {
                    case 1:
                        if (p.f6635d1) {
                            int resourceId = typedArray.getResourceId(index, fVar.f6479b);
                            fVar.f6479b = resourceId;
                            if (resourceId == -1) {
                                fVar.f6480c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            fVar.f6480c = typedArray.getString(index);
                        } else {
                            fVar.f6479b = typedArray.getResourceId(index, fVar.f6479b);
                        }
                        break;
                    case 2:
                        fVar.f6478a = typedArray.getInt(index, fVar.f6478a);
                        break;
                    case 3:
                        fVar.f6501g = typedArray.getString(index);
                        break;
                    case 4:
                        fVar.f6502h = typedArray.getInteger(index, fVar.f6502h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            fVar.f6504j = typedArray.getString(index);
                            fVar.f6503i = 7;
                        } else {
                            fVar.f6503i = typedArray.getInt(index, fVar.f6503i);
                        }
                        break;
                    case 6:
                        fVar.f6505k = typedArray.getFloat(index, fVar.f6505k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            fVar.f6506l = typedArray.getDimension(index, fVar.f6506l);
                        } else {
                            fVar.f6506l = typedArray.getFloat(index, fVar.f6506l);
                        }
                        break;
                    case 8:
                        fVar.f6509o = typedArray.getInt(index, fVar.f6509o);
                        break;
                    case 9:
                        fVar.f6510p = typedArray.getFloat(index, fVar.f6510p);
                        break;
                    case 10:
                        fVar.f6511q = typedArray.getDimension(index, fVar.f6511q);
                        break;
                    case 11:
                        fVar.f6512r = typedArray.getFloat(index, fVar.f6512r);
                        break;
                    case 12:
                        fVar.f6514t = typedArray.getFloat(index, fVar.f6514t);
                        break;
                    case 13:
                        fVar.f6515u = typedArray.getFloat(index, fVar.f6515u);
                        break;
                    case 14:
                        fVar.f6513s = typedArray.getFloat(index, fVar.f6513s);
                        break;
                    case 15:
                        fVar.f6516v = typedArray.getFloat(index, fVar.f6516v);
                        break;
                    case 16:
                        fVar.f6517w = typedArray.getFloat(index, fVar.f6517w);
                        break;
                    case 17:
                        fVar.f6518x = typedArray.getDimension(index, fVar.f6518x);
                        break;
                    case 18:
                        fVar.f6519y = typedArray.getDimension(index, fVar.f6519y);
                        break;
                    case 19:
                        fVar.f6520z = typedArray.getDimension(index, fVar.f6520z);
                        break;
                    case 20:
                        fVar.f6508n = typedArray.getFloat(index, fVar.f6508n);
                        break;
                    case 21:
                        fVar.f6507m = typedArray.getFloat(index, fVar.f6507m) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f6521a.get(index));
                        break;
                }
            }
        }
    }

    public f() {
        this.f6481d = 4;
        this.f6482e = new HashMap<>();
    }

    public void U(HashMap<String, f5.c> map) {
        f5.c cVar;
        f5.c cVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.f6482e.get(str.substring(7));
                if (aVar != null && aVar.d() == androidx.constraintlayout.widget.a.EnumC0147a.FLOAT_TYPE && (cVar = map.get(str)) != null) {
                    cVar.d(this.f6478a, this.f6503i, this.f6504j, this.f6509o, this.f6505k, this.f6506l, this.f6507m, aVar.e(), aVar);
                }
            } else {
                float fV = V(str);
                if (!Float.isNaN(fV) && (cVar2 = map.get(str)) != null) {
                    cVar2.c(this.f6478a, this.f6503i, this.f6504j, this.f6509o, this.f6505k, this.f6506l, this.f6507m, fV);
                }
            }
        }
    }

    public float V(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return this.f6514t;
            case "rotationY":
                return this.f6515u;
            case "translationX":
                return this.f6518x;
            case "translationY":
                return this.f6519y;
            case "translationZ":
                return this.f6520z;
            case "progress":
                return this.f6508n;
            case "scaleX":
                return this.f6516v;
            case "scaleY":
                return this.f6517w;
            case "rotation":
                return this.f6512r;
            case "elevation":
                return this.f6511q;
            case "transitionPathRotate":
                return this.f6513s;
            case "alpha":
                return this.f6510p;
            case "waveOffset":
                return this.f6506l;
            case "wavePhase":
                return this.f6507m;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap<String, f5.d> map) {
        androidx.constraintlayout.motion.widget.a.g("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            f5.d dVar = map.get(str);
            if (dVar != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        dVar.b(this.f6478a, this.f6514t);
                        break;
                    case "rotationY":
                        dVar.b(this.f6478a, this.f6515u);
                        break;
                    case "translationX":
                        dVar.b(this.f6478a, this.f6518x);
                        break;
                    case "translationY":
                        dVar.b(this.f6478a, this.f6519y);
                        break;
                    case "translationZ":
                        dVar.b(this.f6478a, this.f6520z);
                        break;
                    case "progress":
                        dVar.b(this.f6478a, this.f6508n);
                        break;
                    case "scaleX":
                        dVar.b(this.f6478a, this.f6516v);
                        break;
                    case "scaleY":
                        dVar.b(this.f6478a, this.f6517w);
                        break;
                    case "rotation":
                        dVar.b(this.f6478a, this.f6512r);
                        break;
                    case "elevation":
                        dVar.b(this.f6478a, this.f6511q);
                        break;
                    case "transitionPathRotate":
                        dVar.b(this.f6478a, this.f6513s);
                        break;
                    case "alpha":
                        dVar.b(this.f6478a, this.f6510p);
                        break;
                    case "waveOffset":
                        dVar.b(this.f6478a, this.f6506l);
                        break;
                    case "wavePhase":
                        dVar.b(this.f6478a, this.f6507m);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        }
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        return new f().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        f fVar = (f) dVar;
        this.f6501g = fVar.f6501g;
        this.f6502h = fVar.f6502h;
        this.f6503i = fVar.f6503i;
        this.f6504j = fVar.f6504j;
        this.f6505k = fVar.f6505k;
        this.f6506l = fVar.f6506l;
        this.f6507m = fVar.f6507m;
        this.f6508n = fVar.f6508n;
        this.f6509o = fVar.f6509o;
        this.f6510p = fVar.f6510p;
        this.f6511q = fVar.f6511q;
        this.f6512r = fVar.f6512r;
        this.f6513s = fVar.f6513s;
        this.f6514t = fVar.f6514t;
        this.f6515u = fVar.f6515u;
        this.f6516v = fVar.f6516v;
        this.f6517w = fVar.f6517w;
        this.f6518x = fVar.f6518x;
        this.f6519y = fVar.f6519y;
        this.f6520z = fVar.f6520z;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f6510p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f6511q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f6512r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f6514t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f6515u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f6516v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f6517w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f6513s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f6518x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f6519y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f6520z)) {
            hashSet.add("translationZ");
        }
        if (this.f6482e.size() > 0) {
            Iterator<String> it = this.f6482e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f7257o5));
    }
}
