package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<c> f81495a = new ArrayList<>();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f81496a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            f81496a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81496a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81496a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81496a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f81496a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81496a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f81496a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f81496a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f81496a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f81496a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        Object a();
    }

    private interface c {
        Object getValue();
    }

    private static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f81499a;

        f(String str) {
            this.f81499a = str;
        }

        @Override // io.sentry.v1.c
        public Object getValue() {
            return this.f81499a;
        }
    }

    private static final class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f81500a;

        g(Object obj) {
            this.f81500a = obj;
        }

        @Override // io.sentry.v1.c
        public Object getValue() {
            return this.f81500a;
        }
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    private c f() {
        if (this.f81495a.isEmpty()) {
            return null;
        }
        ArrayList<c> arrayList = this.f81495a;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean g() {
        if (i()) {
            return true;
        }
        c cVarF = f();
        l();
        if (!(f() instanceof f)) {
            if (!(f() instanceof d)) {
                return false;
            }
            d dVar = (d) f();
            if (cVarF == null || dVar == null) {
                return false;
            }
            dVar.f81497a.add(cVarF.getValue());
            return false;
        }
        f fVar = (f) f();
        l();
        e eVar = (e) f();
        if (fVar == null || cVarF == null || eVar == null) {
            return false;
        }
        eVar.f81498a.put(fVar.f81499a, cVarF.getValue());
        return false;
    }

    private boolean h(b bVar) {
        Object objA = bVar.a();
        if (f() == null && objA != null) {
            m(new g(objA));
            return true;
        }
        if (f() instanceof f) {
            f fVar = (f) f();
            l();
            ((e) f()).f81498a.put(fVar.f81499a, objA);
            return false;
        }
        if (!(f() instanceof d)) {
            return false;
        }
        ((d) f()).f81497a.add(objA);
        return false;
    }

    private boolean i() {
        return this.f81495a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object j(w1 w1Var) {
        try {
            try {
                return Integer.valueOf(w1Var.nextInt());
            } catch (Exception unused) {
                return Double.valueOf(w1Var.nextDouble());
            }
        } catch (Exception unused2) {
            return Long.valueOf(w1Var.nextLong());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void k(final w1 w1Var) {
        boolean zG;
        a aVar = null;
        switch (a.f81496a[w1Var.peek().ordinal()]) {
            case 1:
                w1Var.f();
                m(new d(aVar));
                zG = false;
                break;
            case 2:
                w1Var.e();
                zG = g();
                break;
            case 3:
                w1Var.h();
                m(new e(aVar));
                zG = false;
                break;
            case 4:
                w1Var.j();
                zG = g();
                break;
            case 5:
                m(new f(w1Var.L()));
                zG = false;
                break;
            case 6:
                zG = h(new b() { // from class: io.sentry.r1
                    @Override // io.sentry.v1.b
                    public final Object a() {
                        return w1Var.O();
                    }
                });
                break;
            case 7:
                zG = h(new b() { // from class: io.sentry.s1
                    @Override // io.sentry.v1.b
                    public final Object a() {
                        return this.f81308a.j(w1Var);
                    }
                });
                break;
            case 8:
                zG = h(new b() { // from class: io.sentry.t1
                    @Override // io.sentry.v1.b
                    public final Object a() {
                        return Boolean.valueOf(w1Var.nextBoolean());
                    }
                });
                break;
            case 9:
                w1Var.c();
                zG = h(new b() { // from class: io.sentry.u1
                    @Override // io.sentry.v1.b
                    public final Object a() {
                        return v1.a();
                    }
                });
                break;
            case 10:
                zG = true;
                break;
            default:
                zG = false;
                break;
        }
        if (zG) {
            return;
        }
        k(w1Var);
    }

    private void l() {
        if (this.f81495a.isEmpty()) {
            return;
        }
        ArrayList<c> arrayList = this.f81495a;
        arrayList.remove(arrayList.size() - 1);
    }

    private void m(c cVar) {
        this.f81495a.add(cVar);
    }

    public Object e(w1 w1Var) {
        k(w1Var);
        c cVarF = f();
        if (cVarF != null) {
            return cVarF.getValue();
        }
        return null;
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList<Object> f81497a;

        private d() {
            this.f81497a = new ArrayList<>();
        }

        @Override // io.sentry.v1.c
        public Object getValue() {
            return this.f81497a;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final HashMap<String, Object> f81498a;

        private e() {
            this.f81498a = new HashMap<>();
        }

        @Override // io.sentry.v1.c
        public Object getValue() {
            return this.f81498a;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
