package rz;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import xz.b0;
import xz.r;
import xz.s;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f109262j = b0.g(d.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Class<?> f109263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b[] f109264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final i f109265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f109266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f109267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f109268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f109269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final HashMap<Class<?>, Method> f109270h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Class<? extends Exception> f109271i = NoSuchFieldException.class;

    public e(Class<?> cls, b[] bVarArr, i iVar) {
        this.f109263a = cls;
        this.f109264b = bVarArr;
        this.f109265c = iVar;
        String name = cls.getName();
        this.f109266d = name;
        if (name.startsWith("java.")) {
            this.f109267e = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            this.f109267e = name.concat("AccAccess");
        }
        this.f109268f = this.f109267e.replace(CoreConstants.DOT, '/');
        this.f109269g = name.replace(CoreConstants.DOT, '/');
    }

    private void d(s sVar, int i11, int i12, r rVar) {
        sVar.E(21, i11);
        if (i12 == 0) {
            sVar.n(154, rVar);
            return;
        }
        if (i12 == 1) {
            sVar.j(4);
            sVar.n(160, rVar);
            return;
        }
        if (i12 == 2) {
            sVar.j(5);
            sVar.n(160, rVar);
            return;
        }
        if (i12 == 3) {
            sVar.j(6);
            sVar.n(160, rVar);
            return;
        }
        if (i12 == 4) {
            sVar.j(7);
            sVar.n(160, rVar);
        } else if (i12 == 5) {
            sVar.j(8);
            sVar.n(160, rVar);
        } else {
            if (i12 < 6) {
                throw new RuntimeException("non supported negative values");
            }
            sVar.l(16, i12);
            sVar.n(160, rVar);
        }
    }

    private void e(s sVar, b bVar) {
        Method method;
        s sVar2 = sVar;
        sVar2.E(25, 1);
        sVar2.D(192, this.f109269g);
        sVar2.E(25, 3);
        b0 b0VarM = b0.m(bVar.c());
        Class<?> clsC = bVar.c();
        String strG = b0.g(clsC);
        Method method2 = this.f109270h.get(clsC);
        if (method2 != null) {
            sVar2.v(184, b0.g(method2.getDeclaringClass()), method2.getName(), b0.h(method2), false);
        } else if (bVar.d()) {
            r rVar = new r();
            sVar2.n(EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE, rVar);
            sVar2.E(25, 3);
            sVar2.v(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            sVar2 = sVar;
            sVar2.v(184, strG, CoreConstants.VALUE_OF, "(Ljava/lang/String;)L" + strG + ";", false);
            sVar2.E(58, 3);
            sVar2.o(rVar);
            sVar2.h(3, 0, null, 0, null);
            sVar2.E(25, 1);
            sVar2.D(192, this.f109269g);
            sVar2.E(25, 3);
            sVar2.D(192, strG);
        } else if (clsC.equals(String.class)) {
            r rVar2 = new r();
            sVar2.n(EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE, rVar2);
            sVar2.E(25, 3);
            sVar2.v(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            sVar2.E(58, 3);
            sVar2.o(rVar2);
            sVar2.h(3, 0, null, 0, null);
            sVar2.E(25, 1);
            sVar2.D(192, this.f109269g);
            sVar2.E(25, 3);
            sVar2.D(192, strG);
        } else {
            sVar2.D(192, strG);
        }
        if (bVar.e() || (method = bVar.f109252b) == null) {
            sVar2.g(181, this.f109269g, bVar.b(), b0VarM.d());
        } else {
            sVar2.v(182, this.f109269g, bVar.f109252b.getName(), b0.h(method), false);
        }
        sVar2.j(177);
    }

    private void f(s sVar, Class<?> cls) {
        String strG = b0.g(cls);
        sVar.D(187, strG);
        sVar.j(89);
        sVar.p("mapping " + this.f109266d + " failed to map field:");
        sVar.E(21, 2);
        sVar.v(184, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
        sVar.v(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        sVar.v(183, strG, "<init>", "(Ljava/lang/String;)V", false);
        sVar.j(191);
    }

    private void g(s sVar, Class<?> cls) {
        String strG = b0.g(cls);
        sVar.D(187, strG);
        sVar.j(89);
        sVar.p("mapping " + this.f109266d + " failed to map field:");
        sVar.E(25, 2);
        sVar.v(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        sVar.v(183, strG, "<init>", "(Ljava/lang/String;)V", false);
        sVar.j(191);
    }

    public void a(Class<?> cls) {
        if (cls == null) {
            return;
        }
        for (Method method : cls.getMethods()) {
            if ((method.getModifiers() & 8) != 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(Object.class)) {
                    Class<?> returnType = method.getReturnType();
                    if (!returnType.equals(Void.TYPE)) {
                        this.f109270h.put(returnType, method);
                    }
                }
            }
        }
    }

    public void b(Iterable<Class<?>> iterable) {
        if (iterable == null) {
            return;
        }
        Iterator<Class<?>> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public Class<?> c() {
        Method method;
        b0 b0Var;
        Method method2;
        int i11;
        int i12;
        b0 b0Var2;
        Method method3;
        int i13 = 1;
        xz.g gVar = new xz.g(1);
        boolean z11 = this.f109264b.length > 10;
        gVar.a(50, 33, this.f109268f, "Lnet/minidev/asm/BeansAccess<L" + this.f109269g + ";>;", f109262j, null);
        s sVarG = gVar.g(1, "<init>", "()V", null, null);
        sVarG.e();
        sVarG.E(25, 0);
        sVarG.v(183, f109262j, "<init>", "()V", false);
        sVarG.j(177);
        sVarG.u(1, 1);
        sVarG.f();
        s sVarG2 = gVar.g(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        sVarG2.e();
        b[] bVarArr = this.f109264b;
        if (bVarArr.length != 0) {
            if (bVarArr.length > 14) {
                sVarG2.E(21, 2);
                r[] rVarArrF = a.f(this.f109264b.length);
                r rVar = new r();
                sVarG2.z(0, rVarArrF.length - 1, rVar, rVarArrF);
                b[] bVarArr2 = this.f109264b;
                int length = bVarArr2.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length) {
                    b bVar = bVarArr2[i14];
                    int i16 = i15 + 1;
                    sVarG2.o(rVarArrF[i15]);
                    if (bVar.h()) {
                        e(sVarG2, bVar);
                    } else {
                        sVarG2.j(177);
                    }
                    i14++;
                    i15 = i16;
                }
                sVarG2.o(rVar);
            } else {
                r[] rVarArrF2 = a.f(bVarArr.length);
                int i17 = 0;
                for (b bVar2 : this.f109264b) {
                    d(sVarG2, 2, i17, rVarArrF2[i17]);
                    e(sVarG2, bVar2);
                    sVarG2.o(rVarArrF2[i17]);
                    sVarG2.h(3, 0, null, 0, null);
                    i17++;
                }
            }
        }
        Class<? extends Exception> cls = this.f109271i;
        if (cls != null) {
            f(sVarG2, cls);
        } else {
            sVarG2.j(177);
        }
        sVarG2.u(0, 0);
        sVarG2.f();
        s sVarG3 = gVar.g(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        sVarG3.e();
        b[] bVarArr3 = this.f109264b;
        int i18 = 192;
        if (bVarArr3.length == 0) {
            sVarG3.h(3, 0, null, 0, null);
        } else if (bVarArr3.length > 14) {
            sVarG3.E(21, 2);
            r[] rVarArrF3 = a.f(this.f109264b.length);
            r rVar2 = new r();
            sVarG3.z(0, rVarArrF3.length - 1, rVar2, rVarArrF3);
            b[] bVarArr4 = this.f109264b;
            int length2 = bVarArr4.length;
            int i19 = 0;
            int i21 = 0;
            while (i19 < length2) {
                b bVar3 = bVarArr4[i19];
                int i22 = i21 + 1;
                sVarG3.o(rVarArrF3[i21]);
                int i23 = i19;
                sVarG3.h(3, 0, null, 0, null);
                if (bVar3.f()) {
                    sVarG3.E(25, i13);
                    sVarG3.D(i18, this.f109269g);
                    b0 b0VarM = b0.m(bVar3.c());
                    if (bVar3.e() || (method2 = bVar3.f109253c) == null) {
                        b0Var = b0VarM;
                        sVarG3.g(180, this.f109269g, bVar3.b(), b0Var.d());
                    } else {
                        String strH = b0.h(method2);
                        b0Var = b0VarM;
                        sVarG3.v(182, this.f109269g, bVar3.f109253c.getName(), strH, false);
                    }
                    a.a(sVarG3, b0Var);
                    sVarG3.j(176);
                } else {
                    sVarG3.j(i13);
                    sVarG3.j(176);
                }
                i19 = i23 + 1;
                i21 = i22;
                i18 = 192;
                i13 = 1;
            }
            sVarG3.o(rVar2);
            sVarG3.h(3, 0, null, 0, null);
        } else {
            r[] rVarArrF4 = a.f(bVarArr3.length);
            int i24 = 0;
            for (b bVar4 : this.f109264b) {
                d(sVarG3, 2, i24, rVarArrF4[i24]);
                sVarG3.E(25, 1);
                sVarG3.D(192, this.f109269g);
                b0 b0VarM2 = b0.m(bVar4.c());
                if (bVar4.e() || (method = bVar4.f109253c) == null) {
                    sVarG3.g(180, this.f109269g, bVar4.b(), b0VarM2.d());
                } else {
                    if (method == null) {
                        throw new RuntimeException("no Getter for field " + bVar4.b() + " in class " + this.f109266d);
                    }
                    sVarG3.v(182, this.f109269g, bVar4.f109253c.getName(), b0.h(method), false);
                }
                a.a(sVarG3, b0VarM2);
                sVarG3.j(176);
                sVarG3.o(rVarArrF4[i24]);
                sVarG3.h(3, 0, null, 0, null);
                i24++;
            }
        }
        Class<? extends Exception> cls2 = this.f109271i;
        if (cls2 != null) {
            f(sVarG3, cls2);
        } else {
            sVarG3.j(1);
            sVarG3.j(176);
        }
        sVarG3.u(0, 0);
        sVarG3.f();
        int i25 = 153;
        if (z11) {
            i11 = 176;
            i12 = 192;
        } else {
            i11 = 176;
            i12 = 192;
            s sVarG4 = gVar.g(1, "set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
            sVarG4.e();
            r[] rVarArrF5 = a.f(this.f109264b.length);
            int i26 = 0;
            for (b bVar5 : this.f109264b) {
                sVarG4.E(25, 2);
                sVarG4.p(bVar5.f109257g);
                sVarG4.v(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                sVarG4.n(153, rVarArrF5[i26]);
                e(sVarG4, bVar5);
                sVarG4.o(rVarArrF5[i26]);
                sVarG4.h(3, 0, null, 0, null);
                i26++;
            }
            Class<? extends Exception> cls3 = this.f109271i;
            if (cls3 != null) {
                g(sVarG4, cls3);
            } else {
                sVarG4.j(177);
            }
            sVarG4.u(0, 0);
            sVarG4.f();
        }
        if (!z11) {
            s sVarG5 = gVar.g(1, "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
            sVarG5.e();
            r[] rVarArrF6 = a.f(this.f109264b.length);
            b[] bVarArr5 = this.f109264b;
            int length3 = bVarArr5.length;
            int i27 = 0;
            int i28 = 0;
            while (i27 < length3) {
                b bVar6 = bVarArr5[i27];
                sVarG5.E(25, 2);
                sVarG5.p(bVar6.f109257g);
                sVarG5.v(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                sVarG5.n(i25, rVarArrF6[i28]);
                sVarG5.E(25, 1);
                sVarG5.D(i12, this.f109269g);
                b0 b0VarM3 = b0.m(bVar6.c());
                if (bVar6.e() || (method3 = bVar6.f109253c) == null) {
                    b0Var2 = b0VarM3;
                    sVarG5.g(180, this.f109269g, bVar6.b(), b0Var2.d());
                } else {
                    String strH2 = b0.h(method3);
                    b0Var2 = b0VarM3;
                    sVarG5.v(182, this.f109269g, bVar6.f109253c.getName(), strH2, false);
                }
                a.a(sVarG5, b0Var2);
                sVarG5.j(i11);
                sVarG5.o(rVarArrF6[i28]);
                sVarG5.h(3, 0, null, 0, null);
                i28++;
                i27++;
                i25 = 153;
            }
            Class<? extends Exception> cls4 = this.f109271i;
            if (cls4 != null) {
                g(sVarG5, cls4);
            } else {
                sVarG5.j(1);
                sVarG5.j(i11);
            }
            sVarG5.u(0, 0);
            sVarG5.f();
        }
        s sVarG6 = gVar.g(1, "newInstance", "()Ljava/lang/Object;", null, null);
        sVarG6.e();
        sVarG6.D(187, this.f109269g);
        sVarG6.j(89);
        sVarG6.v(183, this.f109269g, "<init>", "()V", false);
        sVarG6.j(i11);
        sVarG6.u(2, 1);
        sVarG6.f();
        gVar.d();
        return this.f109265c.a(this.f109267e, gVar.t());
    }
}
