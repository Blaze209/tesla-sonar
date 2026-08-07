package hk0;

import freemarker.template.utility.NullArgumentException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
abstract class x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f73092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[][] f73093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static /* synthetic */ Class f73094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static /* synthetic */ Class f73095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static /* synthetic */ Class f73096k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static /* synthetic */ Class f73097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f73098m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static /* synthetic */ Class f73099n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static /* synthetic */ Class f73100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static /* synthetic */ Class f73101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static /* synthetic */ Class f73102q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static /* synthetic */ Class f73103r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static /* synthetic */ Class f73104s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static /* synthetic */ Class f73105t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class[][] f73106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[][] f73107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f73108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f73109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f73110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final boolean f73111f;

    static {
        int[] iArr = new int[0];
        f73092g = iArr;
        f73093h = new int[][]{iArr};
    }

    x(boolean z11) {
        Map mapD = freemarker.core.n.d(6, 0.75f, 1);
        this.f73108c = mapD;
        this.f73109d = freemarker.core.n.b(mapD);
        this.f73110e = new LinkedList();
        this.f73111f = z11;
    }

    static /* synthetic */ Class c(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    void a(z zVar) throws Throwable {
        this.f73110e.add(zVar);
        Class[] clsArrH = h(zVar);
        int length = clsArrH.length;
        Class[][] clsArr = this.f73106a;
        if (clsArr == null) {
            Class[][] clsArr2 = new Class[length + 1][];
            this.f73106a = clsArr2;
            clsArr2[length] = (Class[]) clsArrH.clone();
        } else if (clsArr.length <= length) {
            Class[][] clsArr3 = new Class[length + 1][];
            System.arraycopy(clsArr, 0, clsArr3, 0, clsArr.length);
            this.f73106a = clsArr3;
            clsArr3[length] = (Class[]) clsArrH.clone();
        } else {
            Class[] clsArr4 = clsArr[length];
            if (clsArr4 == null) {
                clsArr[length] = (Class[]) clsArrH.clone();
            } else {
                for (int i11 = 0; i11 < clsArrH.length; i11++) {
                    clsArr4[i11] = d(clsArr4[i11], clsArrH[i11]);
                }
            }
        }
        int[] iArr = f73092g;
        if (this.f73111f) {
            for (int i12 = 0; i12 < length; i12++) {
                int iB = c0.b(clsArrH[i12]);
                if (iB != 0) {
                    if (iArr == f73092g) {
                        iArr = new int[length];
                    }
                    iArr[i12] = iB;
                }
            }
            g(length, iArr);
        }
        if (!this.f73111f) {
            clsArrH = this.f73106a[length];
        }
        b(clsArrH, iArr);
    }

    abstract void b(Class[] clsArr, int[] iArr);

    /* JADX WARN: Multi-variable type inference failed */
    protected Class d(Class cls, Class cls2) throws Throwable {
        boolean z11;
        boolean z12;
        Class cls3;
        Class cls4;
        if (cls == cls2) {
            return cls;
        }
        if (this.f73111f) {
            if (cls.isPrimitive()) {
                cls = mk0.a.g(cls);
                z11 = true;
            } else {
                z11 = false;
            }
            if (cls2.isPrimitive()) {
                cls2 = mk0.a.g(cls2);
                z12 = true;
            } else {
                z12 = false;
            }
            if (cls == cls2) {
                return cls;
            }
            Class cls5 = f73094i;
            if (cls5 == null) {
                cls3 = cls5;
                Class clsC = c("java.lang.Number");
                f73094i = clsC;
                cls3 = clsC;
            }
            cls3 = cls5;
            if (cls3.isAssignableFrom(cls)) {
                Class cls6 = f73094i;
                if (cls6 == null) {
                    cls4 = cls6;
                    Class clsC2 = c("java.lang.Number");
                    f73094i = clsC2;
                    cls4 = clsC2;
                }
                cls4 = cls6;
                if (cls4.isAssignableFrom(cls2)) {
                    Class cls7 = f73094i;
                    if (cls7 != null) {
                        return cls7;
                    }
                    Class clsC3 = c("java.lang.Number");
                    f73094i = clsC3;
                    return clsC3;
                }
            }
            if (z11 || z12) {
                Class cls8 = f73095j;
                if (cls8 != null) {
                    return cls8;
                }
                Class clsC4 = c("java.lang.Object");
                f73095j = clsC4;
                return clsC4;
            }
        } else if (cls2.isPrimitive()) {
            if (cls2 == Byte.TYPE) {
                cls2 = f73096k;
                if (cls2 == null) {
                    cls2 = c("java.lang.Byte");
                    f73096k = cls2;
                }
            } else if (cls2 == Short.TYPE) {
                cls2 = f73097l;
                if (cls2 == null) {
                    cls2 = c("java.lang.Short");
                    f73097l = cls2;
                }
            } else if (cls2 == Character.TYPE) {
                cls2 = f73098m;
                if (cls2 == null) {
                    cls2 = c("java.lang.Character");
                    f73098m = cls2;
                }
            } else if (cls2 == Integer.TYPE) {
                cls2 = f73099n;
                if (cls2 == null) {
                    cls2 = c("java.lang.Integer");
                    f73099n = cls2;
                }
            } else if (cls2 == Float.TYPE) {
                cls2 = f73100o;
                if (cls2 == null) {
                    cls2 = c("java.lang.Float");
                    f73100o = cls2;
                }
            } else if (cls2 == Long.TYPE) {
                cls2 = f73101p;
                if (cls2 == null) {
                    cls2 = c("java.lang.Long");
                    f73101p = cls2;
                }
            } else if (cls2 == Double.TYPE && (cls2 = f73102q) == null) {
                cls2 = c("java.lang.Double");
                f73102q = cls2;
            }
        }
        Set<Class> setC = g0.c(cls, cls2);
        setC.retainAll(g0.c(cls2, cls));
        if (setC.isEmpty()) {
            Class cls9 = f73095j;
            if (cls9 != null) {
                return cls9;
            }
            Class clsC5 = c("java.lang.Object");
            f73095j = clsC5;
            return clsC5;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls10 : setC) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(cls10);
                    break;
                }
                Class cls11 = (Class) it.next();
                if (g0.e(cls11, cls10, false, 0) != 0) {
                    break;
                }
                if (g0.e(cls10, cls11, false, 0) != 0) {
                    it.remove();
                }
            }
        }
        if (arrayList.size() > 1) {
            if (!this.f73111f) {
                Class cls12 = f73095j;
                if (cls12 != null) {
                    return cls12;
                }
                Class clsC6 = c("java.lang.Object");
                f73095j = clsC6;
                return clsC6;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Class cls13 = (Class) it2.next();
                if (!cls13.isInterface()) {
                    Class clsC7 = f73095j;
                    if (clsC7 == null) {
                        clsC7 = c("java.lang.Object");
                        f73095j = clsC7;
                    }
                    if (cls13 != clsC7) {
                        return cls13;
                    }
                    it2.remove();
                }
            }
            Class clsC8 = f73103r;
            if (clsC8 == null) {
                clsC8 = c("java.lang.Cloneable");
                f73103r = clsC8;
            }
            arrayList.remove(clsC8);
            if (arrayList.size() > 1) {
                Class clsC9 = f73104s;
                if (clsC9 == null) {
                    clsC9 = c("java.io.Serializable");
                    f73104s = clsC9;
                }
                arrayList.remove(clsC9);
                if (arrayList.size() > 1) {
                    Class clsC10 = f73105t;
                    if (clsC10 == null) {
                        clsC10 = c("java.lang.Comparable");
                        f73105t = clsC10;
                    }
                    arrayList.remove(clsC10);
                    if (arrayList.size() > 1) {
                        Class cls14 = f73095j;
                        if (cls14 != null) {
                            return cls14;
                        }
                        Class clsC11 = c("java.lang.Object");
                        f73095j = clsC11;
                        return clsC11;
                    }
                }
            }
        }
        return (Class) arrayList.get(0);
    }

    protected final int[] e(int i11) {
        int[][] iArr = this.f73107b;
        if (iArr == null || iArr.length <= i11) {
            return null;
        }
        return iArr[i11];
    }

    Class[][] f() {
        return this.f73106a;
    }

    protected final void g(int i11, int[] iArr) {
        int i12;
        NullArgumentException.a("srcTypesFlagsByParamIdx", iArr);
        int i13 = 0;
        if (i11 == 0) {
            int[][] iArr2 = this.f73107b;
            if (iArr2 == null) {
                this.f73107b = f73093h;
                return;
            } else {
                if (iArr2 != f73093h) {
                    iArr2[0] = f73092g;
                    return;
                }
                return;
            }
        }
        int[][] iArr3 = this.f73107b;
        if (iArr3 == null) {
            this.f73107b = new int[i11 + 1][];
        } else if (iArr3.length <= i11) {
            int[][] iArr4 = new int[i11 + 1][];
            System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            this.f73107b = iArr4;
        }
        int[][] iArr5 = this.f73107b;
        int[] iArr6 = iArr5[i11];
        if (iArr6 == null) {
            int[] iArr7 = f73092g;
            if (iArr != iArr7) {
                int length = iArr.length;
                int[] iArr8 = new int[i11];
                while (i13 < i11) {
                    iArr8[i13] = iArr[i13 < length ? i13 : length - 1];
                    i13++;
                }
                iArr7 = iArr8;
            }
            this.f73107b[i11] = iArr7;
            return;
        }
        if (iArr == iArr6) {
            return;
        }
        if (iArr6 == f73092g && i11 > 0) {
            iArr6 = new int[i11];
            iArr5[i11] = iArr6;
        }
        int i14 = 0;
        while (i14 < i11) {
            if (iArr != f73092g) {
                int length2 = iArr.length;
                i12 = iArr[i14 < length2 ? i14 : length2 - 1];
            } else {
                i12 = 0;
            }
            int i15 = iArr6[i14];
            if (i15 != i12) {
                int i16 = i12 | i15;
                if ((i16 & 2044) != 0) {
                    i16 |= 1;
                }
                iArr6[i14] = i16;
            }
            i14++;
        }
    }

    abstract Class[] h(m mVar);
}
