package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f6483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6484h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6485i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f6486j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f6487k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f6488l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f6489m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f6490n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f6491o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f6492p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f6493q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f6494r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f6495s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f6496t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f6497u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f6498v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f6499w = Float.NaN;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f6500a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6500a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.W4, 1);
            f6500a.append(androidx.constraintlayout.widget.i.f7180h5, 2);
            f6500a.append(androidx.constraintlayout.widget.i.f7136d5, 4);
            f6500a.append(androidx.constraintlayout.widget.i.f7147e5, 5);
            f6500a.append(androidx.constraintlayout.widget.i.f7158f5, 6);
            f6500a.append(androidx.constraintlayout.widget.i.X4, 19);
            f6500a.append(androidx.constraintlayout.widget.i.Y4, 20);
            f6500a.append(androidx.constraintlayout.widget.i.f7113b5, 7);
            f6500a.append(androidx.constraintlayout.widget.i.f7246n5, 8);
            f6500a.append(androidx.constraintlayout.widget.i.f7235m5, 9);
            f6500a.append(androidx.constraintlayout.widget.i.f7224l5, 10);
            f6500a.append(androidx.constraintlayout.widget.i.f7202j5, 12);
            f6500a.append(androidx.constraintlayout.widget.i.f7191i5, 13);
            f6500a.append(androidx.constraintlayout.widget.i.f7125c5, 14);
            f6500a.append(androidx.constraintlayout.widget.i.Z4, 15);
            f6500a.append(androidx.constraintlayout.widget.i.f7101a5, 16);
            f6500a.append(androidx.constraintlayout.widget.i.f7169g5, 17);
            f6500a.append(androidx.constraintlayout.widget.i.f7213k5, 18);
        }

        public static void a(e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f6500a.get(index)) {
                    case 1:
                        eVar.f6486j = typedArray.getFloat(index, eVar.f6486j);
                        break;
                    case 2:
                        eVar.f6487k = typedArray.getDimension(index, eVar.f6487k);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f6500a.get(index));
                        break;
                    case 4:
                        eVar.f6488l = typedArray.getFloat(index, eVar.f6488l);
                        break;
                    case 5:
                        eVar.f6489m = typedArray.getFloat(index, eVar.f6489m);
                        break;
                    case 6:
                        eVar.f6490n = typedArray.getFloat(index, eVar.f6490n);
                        break;
                    case 7:
                        eVar.f6494r = typedArray.getFloat(index, eVar.f6494r);
                        break;
                    case 8:
                        eVar.f6493q = typedArray.getFloat(index, eVar.f6493q);
                        break;
                    case 9:
                        eVar.f6483g = typedArray.getString(index);
                        break;
                    case 10:
                        if (p.f6635d1) {
                            int resourceId = typedArray.getResourceId(index, eVar.f6479b);
                            eVar.f6479b = resourceId;
                            if (resourceId == -1) {
                                eVar.f6480c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            eVar.f6480c = typedArray.getString(index);
                        } else {
                            eVar.f6479b = typedArray.getResourceId(index, eVar.f6479b);
                        }
                        break;
                    case 12:
                        eVar.f6478a = typedArray.getInt(index, eVar.f6478a);
                        break;
                    case 13:
                        eVar.f6484h = typedArray.getInteger(index, eVar.f6484h);
                        break;
                    case 14:
                        eVar.f6495s = typedArray.getFloat(index, eVar.f6495s);
                        break;
                    case 15:
                        eVar.f6496t = typedArray.getDimension(index, eVar.f6496t);
                        break;
                    case 16:
                        eVar.f6497u = typedArray.getDimension(index, eVar.f6497u);
                        break;
                    case 17:
                        eVar.f6498v = typedArray.getDimension(index, eVar.f6498v);
                        break;
                    case 18:
                        eVar.f6499w = typedArray.getFloat(index, eVar.f6499w);
                        break;
                    case 19:
                        eVar.f6491o = typedArray.getDimension(index, eVar.f6491o);
                        break;
                    case 20:
                        eVar.f6492p = typedArray.getDimension(index, eVar.f6492p);
                        break;
                }
            }
        }
    }

    public e() {
        this.f6481d = 1;
        this.f6482e = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap<String, f5.d> map) {
        for (String str : map.keySet()) {
            f5.d dVar = map.get(str);
            if (dVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f6489m)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6489m);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f6490n)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6490n);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f6496t)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6496t);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f6497u)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6497u);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f6498v)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6498v);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f6499w)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6499w);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f6494r)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6494r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f6495s)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6495s);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f6489m)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6491o);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f6490n)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6492p);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f6488l)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6488l);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f6487k)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6487k);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f6493q)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6493q);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f6486j)) {
                                break;
                            } else {
                                dVar.b(this.f6478a, this.f6486j);
                                break;
                            }
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = this.f6482e.get(str.substring(7));
                    if (aVar != null) {
                        ((f5.d.b) dVar).h(this.f6478a, aVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        return new e().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        e eVar = (e) dVar;
        this.f6484h = eVar.f6484h;
        this.f6485i = eVar.f6485i;
        this.f6486j = eVar.f6486j;
        this.f6487k = eVar.f6487k;
        this.f6488l = eVar.f6488l;
        this.f6489m = eVar.f6489m;
        this.f6490n = eVar.f6490n;
        this.f6491o = eVar.f6491o;
        this.f6492p = eVar.f6492p;
        this.f6493q = eVar.f6493q;
        this.f6494r = eVar.f6494r;
        this.f6495s = eVar.f6495s;
        this.f6496t = eVar.f6496t;
        this.f6497u = eVar.f6497u;
        this.f6498v = eVar.f6498v;
        this.f6499w = eVar.f6499w;
        this.f6483g = eVar.f6483g;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f6486j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f6487k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f6488l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f6489m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f6490n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f6491o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f6492p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f6496t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f6497u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f6498v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f6493q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f6494r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f6495s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f6499w)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.V4));
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void g(HashMap<String, Integer> map) {
        if (this.f6484h == -1) {
            return;
        }
        if (!Float.isNaN(this.f6486j)) {
            map.put("alpha", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6487k)) {
            map.put("elevation", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6488l)) {
            map.put("rotation", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6489m)) {
            map.put("rotationX", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6490n)) {
            map.put("rotationY", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6491o)) {
            map.put("transformPivotX", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6492p)) {
            map.put("transformPivotY", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6496t)) {
            map.put("translationX", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6497u)) {
            map.put("translationY", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6498v)) {
            map.put("translationZ", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6493q)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6494r)) {
            map.put("scaleX", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6495s)) {
            map.put("scaleY", Integer.valueOf(this.f6484h));
        }
        if (!Float.isNaN(this.f6499w)) {
            map.put(ReactProgressBarViewManager.PROP_PROGRESS, Integer.valueOf(this.f6484h));
        }
        if (this.f6482e.size() > 0) {
            Iterator<String> it = this.f6482e.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f6484h));
            }
        }
    }
}
