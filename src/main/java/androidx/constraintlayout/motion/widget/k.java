package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class k extends d {
    private boolean A;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f6557g = 0.1f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f6558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f6559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f6560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    RectF f6561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    RectF f6562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    HashMap<String, Method> f6563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f6565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f6566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f6567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f6568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f6569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f6570t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f6571u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f6572v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f6573w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f6574x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f6575y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f6576z;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f6577a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6577a = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.i.f7335v6, 8);
            f6577a.append(androidx.constraintlayout.widget.i.f7379z6, 4);
            f6577a.append(androidx.constraintlayout.widget.i.A6, 1);
            f6577a.append(androidx.constraintlayout.widget.i.B6, 2);
            f6577a.append(androidx.constraintlayout.widget.i.f7346w6, 7);
            f6577a.append(androidx.constraintlayout.widget.i.C6, 6);
            f6577a.append(androidx.constraintlayout.widget.i.E6, 5);
            f6577a.append(androidx.constraintlayout.widget.i.f7368y6, 9);
            f6577a.append(androidx.constraintlayout.widget.i.f7357x6, 10);
            f6577a.append(androidx.constraintlayout.widget.i.D6, 11);
            f6577a.append(androidx.constraintlayout.widget.i.F6, 12);
            f6577a.append(androidx.constraintlayout.widget.i.G6, 13);
            f6577a.append(androidx.constraintlayout.widget.i.H6, 14);
        }

        public static void a(k kVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f6577a.get(index)) {
                    case 1:
                        kVar.f6567q = typedArray.getString(index);
                        break;
                    case 2:
                        kVar.f6568r = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f6577a.get(index));
                        break;
                    case 4:
                        kVar.f6565o = typedArray.getString(index);
                        break;
                    case 5:
                        kVar.f6557g = typedArray.getFloat(index, kVar.f6557g);
                        break;
                    case 6:
                        kVar.f6569s = typedArray.getResourceId(index, kVar.f6569s);
                        break;
                    case 7:
                        if (p.f6635d1) {
                            int resourceId = typedArray.getResourceId(index, kVar.f6479b);
                            kVar.f6479b = resourceId;
                            if (resourceId == -1) {
                                kVar.f6480c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            kVar.f6480c = typedArray.getString(index);
                        } else {
                            kVar.f6479b = typedArray.getResourceId(index, kVar.f6479b);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, kVar.f6478a);
                        kVar.f6478a = integer;
                        kVar.f6575y = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        kVar.f6570t = typedArray.getResourceId(index, kVar.f6570t);
                        break;
                    case 10:
                        kVar.A = typedArray.getBoolean(index, kVar.A);
                        break;
                    case 11:
                        kVar.f6566p = typedArray.getResourceId(index, kVar.f6566p);
                        break;
                    case 12:
                        kVar.f6560j = typedArray.getResourceId(index, kVar.f6560j);
                        break;
                    case 13:
                        kVar.f6558h = typedArray.getResourceId(index, kVar.f6558h);
                        break;
                    case 14:
                        kVar.f6559i = typedArray.getResourceId(index, kVar.f6559i);
                        break;
                }
            }
        }
    }

    public k() {
        int i11 = d.f6477f;
        this.f6558h = i11;
        this.f6559i = i11;
        this.f6560j = i11;
        this.f6561k = new RectF();
        this.f6562l = new RectF();
        this.f6563m = new HashMap<>();
        this.f6564n = -1;
        this.f6565o = null;
        int i12 = d.f6477f;
        this.f6566p = i12;
        this.f6567q = null;
        this.f6568r = null;
        this.f6569s = i12;
        this.f6570t = i12;
        this.f6571u = null;
        this.f6572v = true;
        this.f6573w = true;
        this.f6574x = true;
        this.f6575y = Float.NaN;
        this.A = false;
        this.f6481d = 5;
        this.f6482e = new HashMap<>();
    }

    private void v(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            w(str, view);
            return;
        }
        if (this.f6563m.containsKey(str)) {
            method = this.f6563m.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, null);
                this.f6563m.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f6563m.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.a.d(view));
                return;
            }
        }
        try {
            method.invoke(view, null);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f6565o + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.a.d(view));
        }
    }

    private void w(String str, View view) {
        boolean z11 = str.length() == 1;
        if (!z11) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f6482e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z11 || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.f6482e.get(str2);
                if (aVar != null) {
                    aVar.a(view);
                }
            }
        }
    }

    private void x(RectF rectF, View view, boolean z11) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z11) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void a(HashMap<String, f5.d> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.d
    /* JADX INFO: renamed from: b */
    public d clone() {
        return new k().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public d c(d dVar) {
        super.c(dVar);
        k kVar = (k) dVar;
        this.f6564n = kVar.f6564n;
        this.f6565o = kVar.f6565o;
        this.f6566p = kVar.f6566p;
        this.f6567q = kVar.f6567q;
        this.f6568r = kVar.f6568r;
        this.f6569s = kVar.f6569s;
        this.f6570t = kVar.f6570t;
        this.f6571u = kVar.f6571u;
        this.f6557g = kVar.f6557g;
        this.f6572v = kVar.f6572v;
        this.f6573w = kVar.f6573w;
        this.f6574x = kVar.f6574x;
        this.f6575y = kVar.f6575y;
        this.f6576z = kVar.f6576z;
        this.A = kVar.A;
        this.f6561k = kVar.f6561k;
        this.f6562l = kVar.f6562l;
        this.f6563m = kVar.f6563m;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void d(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.d
    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f7324u6), context);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    public void u(float f11, View view) {
        boolean z11;
        boolean z12;
        boolean z13;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z14;
        boolean z15 = true;
        boolean z16 = false;
        if (this.f6570t != d.f6477f) {
            if (this.f6571u == null) {
                this.f6571u = ((ViewGroup) view.getParent()).findViewById(this.f6570t);
            }
            x(this.f6561k, this.f6571u, this.A);
            x(this.f6562l, view, this.A);
            if (this.f6561k.intersect(this.f6562l)) {
                if (this.f6572v) {
                    this.f6572v = false;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f6574x) {
                    this.f6574x = false;
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f6573w = true;
            } else {
                if (this.f6572v) {
                    z11 = false;
                } else {
                    this.f6572v = true;
                    z11 = true;
                }
                if (this.f6573w) {
                    this.f6573w = false;
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f6574x = true;
                z16 = z14;
                z13 = false;
            }
        } else {
            if (this.f6572v) {
                float f16 = this.f6575y;
                if ((f11 - f16) * (this.f6576z - f16) < BitmapDescriptorFactory.HUE_RED) {
                    this.f6572v = false;
                    z11 = true;
                }
                if (this.f6573w) {
                    f14 = this.f6575y;
                    f15 = f11 - f14;
                    if ((this.f6576z - f14) * f15 >= BitmapDescriptorFactory.HUE_RED && f15 < BitmapDescriptorFactory.HUE_RED) {
                        this.f6573w = false;
                        z12 = true;
                    }
                    if (this.f6574x) {
                        f12 = this.f6575y;
                        f13 = f11 - f12;
                        if ((this.f6576z - f12) * f13 < BitmapDescriptorFactory.HUE_RED || f13 <= BitmapDescriptorFactory.HUE_RED) {
                            z15 = false;
                        } else {
                            this.f6574x = false;
                        }
                        z13 = z15;
                    } else {
                        if (Math.abs(f11 - this.f6575y) > this.f6557g) {
                            this.f6574x = true;
                        }
                        z13 = false;
                    }
                    z16 = z12;
                } else if (Math.abs(f11 - this.f6575y) > this.f6557g) {
                    this.f6573w = true;
                }
                z12 = false;
                if (this.f6574x) {
                    f12 = this.f6575y;
                    f13 = f11 - f12;
                    if ((this.f6576z - f12) * f13 < BitmapDescriptorFactory.HUE_RED) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    z13 = z15;
                } else {
                    if (Math.abs(f11 - this.f6575y) > this.f6557g) {
                        this.f6574x = true;
                    }
                    z13 = false;
                }
                z16 = z12;
            } else if (Math.abs(f11 - this.f6575y) > this.f6557g) {
                this.f6572v = true;
            }
            z11 = false;
            if (this.f6573w) {
                f14 = this.f6575y;
                f15 = f11 - f14;
                if ((this.f6576z - f14) * f15 >= BitmapDescriptorFactory.HUE_RED) {
                }
                if (this.f6574x) {
                    f12 = this.f6575y;
                    f13 = f11 - f12;
                    if ((this.f6576z - f12) * f13 < BitmapDescriptorFactory.HUE_RED) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    z13 = z15;
                } else {
                    if (Math.abs(f11 - this.f6575y) > this.f6557g) {
                        this.f6574x = true;
                    }
                    z13 = false;
                }
                z16 = z12;
            } else if (Math.abs(f11 - this.f6575y) > this.f6557g) {
                this.f6573w = true;
            }
            z12 = false;
            if (this.f6574x) {
                f12 = this.f6575y;
                f13 = f11 - f12;
                if ((this.f6576z - f12) * f13 < BitmapDescriptorFactory.HUE_RED) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                z13 = z15;
            } else {
                if (Math.abs(f11 - this.f6575y) > this.f6557g) {
                    this.f6574x = true;
                }
                z13 = false;
            }
            z16 = z12;
        }
        this.f6576z = f11;
        if (z16 || z11 || z13) {
            ((p) view.getParent()).h0(this.f6569s, z13, f11);
        }
        View viewFindViewById = this.f6566p == d.f6477f ? view : ((p) view.getParent()).findViewById(this.f6566p);
        if (z16) {
            String str = this.f6567q;
            if (str != null) {
                v(str, viewFindViewById);
            }
            if (this.f6558h != d.f6477f) {
                ((p) view.getParent()).E0(this.f6558h, viewFindViewById);
            }
        }
        if (z13) {
            String str2 = this.f6568r;
            if (str2 != null) {
                v(str2, viewFindViewById);
            }
            if (this.f6559i != d.f6477f) {
                ((p) view.getParent()).E0(this.f6559i, viewFindViewById);
            }
        }
        if (z11) {
            String str3 = this.f6565o;
            if (str3 != null) {
                v(str3, viewFindViewById);
            }
            if (this.f6560j != d.f6477f) {
                ((p) view.getParent()).E0(this.f6560j, viewFindViewById);
            }
        }
    }
}
