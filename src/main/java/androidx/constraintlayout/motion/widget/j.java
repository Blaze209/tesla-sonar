package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class j extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f6538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6539h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f6540i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f6541j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f6542k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6543l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f6544m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f6545n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f6546o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f6547p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f6548q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f6549r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f6550s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f6551t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f6552u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f6553v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f6554w = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f6555x = BitmapDescriptorFactory.HUE_RED;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f6556a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6556a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.f7114b6, 1);
            f6556a.append(androidx.constraintlayout.widget.i.f7214k6, 2);
            f6556a.append(androidx.constraintlayout.widget.i.f7170g6, 4);
            f6556a.append(androidx.constraintlayout.widget.i.f7181h6, 5);
            f6556a.append(androidx.constraintlayout.widget.i.f7192i6, 6);
            f6556a.append(androidx.constraintlayout.widget.i.f7148e6, 7);
            f6556a.append(androidx.constraintlayout.widget.i.f7280q6, 8);
            f6556a.append(androidx.constraintlayout.widget.i.f7269p6, 9);
            f6556a.append(androidx.constraintlayout.widget.i.f7258o6, 10);
            f6556a.append(androidx.constraintlayout.widget.i.f7236m6, 12);
            f6556a.append(androidx.constraintlayout.widget.i.f7225l6, 13);
            f6556a.append(androidx.constraintlayout.widget.i.f7159f6, 14);
            f6556a.append(androidx.constraintlayout.widget.i.f7126c6, 15);
            f6556a.append(androidx.constraintlayout.widget.i.f7137d6, 16);
            f6556a.append(androidx.constraintlayout.widget.i.f7203j6, 17);
            f6556a.append(androidx.constraintlayout.widget.i.f7247n6, 18);
            f6556a.append(androidx.constraintlayout.widget.i.f7302s6, 20);
            f6556a.append(androidx.constraintlayout.widget.i.f7291r6, 21);
            f6556a.append(androidx.constraintlayout.widget.i.f7313t6, 19);
        }

        public static void a(j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f6556a.get(index)) {
                    case 1:
                        jVar.f6540i = typedArray.getFloat(index, jVar.f6540i);
                        break;
                    case 2:
                        jVar.f6541j = typedArray.getDimension(index, jVar.f6541j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f6556a.get(index));
                        break;
                    case 4:
                        jVar.f6542k = typedArray.getFloat(index, jVar.f6542k);
                        break;
                    case 5:
                        jVar.f6543l = typedArray.getFloat(index, jVar.f6543l);
                        break;
                    case 6:
                        jVar.f6544m = typedArray.getFloat(index, jVar.f6544m);
                        break;
                    case 7:
                        jVar.f6546o = typedArray.getFloat(index, jVar.f6546o);
                        break;
                    case 8:
                        jVar.f6545n = typedArray.getFloat(index, jVar.f6545n);
                        break;
                    case 9:
                        jVar.f6538g = typedArray.getString(index);
                        break;
                    case 10:
                        if (p.f6635d1) {
                            int resourceId = typedArray.getResourceId(index, jVar.f6479b);
                            jVar.f6479b = resourceId;
                            if (resourceId == -1) {
                                jVar.f6480c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            jVar.f6480c = typedArray.getString(index);
                        } else {
                            jVar.f6479b = typedArray.getResourceId(index, jVar.f6479b);
                        }
                        break;
                    case 12:
                        jVar.f6478a = typedArray.getInt(index, jVar.f6478a);
                        break;
                    case 13:
                        jVar.f6539h = typedArray.getInteger(index, jVar.f6539h);
                        break;
                    case 14:
                        jVar.f6547p = typedArray.getFloat(index, jVar.f6547p);
                        break;
                    case 15:
                        jVar.f6548q = typedArray.getDimension(index, jVar.f6548q);
                        break;
                    case 16:
                        jVar.f6549r = typedArray.getDimension(index, jVar.f6549r);
                        break;
                    case 17:
                        jVar.f6550s = typedArray.getDimension(index, jVar.f6550s);
                        break;
                    case 18:
                        jVar.f6551t = typedArray.getFloat(index, jVar.f6551t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            jVar.f6553v = typedArray.getString(index);
                            jVar.f6552u = 7;
                        } else {
                            jVar.f6552u = typedArray.getInt(index, jVar.f6552u);
                        }
                        break;
                    case 20:
                        jVar.f6554w = typedArray.getFloat(index, jVar.f6554w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            jVar.f6555x = typedArray.getDimension(index, jVar.f6555x);
                        } else {
                            jVar.f6555x = typedArray.getFloat(index, jVar.f6555x);
                        }
                        break;
                }
            }
        }
    }

    public j() {
        this.f6481d = 3;
        this.f6482e = new HashMap<>();
    }

    public void Q(HashMap<String, f5.f> map) {
        for (String str : map.keySet()) {
            f5.f fVar = map.get(str);
            if (fVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f6543l)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6543l, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f6544m)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6544m, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f6548q)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6548q, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f6549r)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6549r, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f6550s)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6550s, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f6551t)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6551t, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f6546o)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6546o, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f6547p)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6547p, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f6542k)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6542k, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f6541j)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6541j, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f6545n)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6545n, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f6540i)) {
                                break;
                            } else {
                                fVar.b(this.f6478a, this.f6540i, this.f6554w, this.f6552u, this.f6555x);
                                break;
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = this.f6482e.get(str.substring(7));
                    if (aVar != null) {
                        ((f5.f.b) fVar).j(this.f6478a, aVar, this.f6554w, this.f6552u, this.f6555x);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap<String, f5.d> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        return new j().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        j jVar = (j) dVar;
        this.f6538g = jVar.f6538g;
        this.f6539h = jVar.f6539h;
        this.f6552u = jVar.f6552u;
        this.f6554w = jVar.f6554w;
        this.f6555x = jVar.f6555x;
        this.f6551t = jVar.f6551t;
        this.f6540i = jVar.f6540i;
        this.f6541j = jVar.f6541j;
        this.f6542k = jVar.f6542k;
        this.f6545n = jVar.f6545n;
        this.f6543l = jVar.f6543l;
        this.f6544m = jVar.f6544m;
        this.f6546o = jVar.f6546o;
        this.f6547p = jVar.f6547p;
        this.f6548q = jVar.f6548q;
        this.f6549r = jVar.f6549r;
        this.f6550s = jVar.f6550s;
        this.f6553v = jVar.f6553v;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f6540i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f6541j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f6542k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f6543l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f6544m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f6548q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f6549r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f6550s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f6545n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f6546o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f6547p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f6551t)) {
            hashSet.add(ReactProgressBarViewManager.PROP_PROGRESS);
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
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f7102a6));
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void g(HashMap<String, Integer> map) {
        if (this.f6539h == -1) {
            return;
        }
        if (!Float.isNaN(this.f6540i)) {
            map.put("alpha", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6541j)) {
            map.put("elevation", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6542k)) {
            map.put("rotation", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6543l)) {
            map.put("rotationX", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6544m)) {
            map.put("rotationY", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6548q)) {
            map.put("translationX", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6549r)) {
            map.put("translationY", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6550s)) {
            map.put("translationZ", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6545n)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6546o)) {
            map.put("scaleX", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6546o)) {
            map.put("scaleY", Integer.valueOf(this.f6539h));
        }
        if (!Float.isNaN(this.f6551t)) {
            map.put(ReactProgressBarViewManager.PROP_PROGRESS, Integer.valueOf(this.f6539h));
        }
        if (this.f6482e.size() > 0) {
            Iterator<String> it = this.f6482e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f6539h));
            }
        }
    }
}
