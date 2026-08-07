package io.realm;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import io.realm.exceptions.RealmError;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.Util;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class c0 extends io.realm.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f78909m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static i0 f78910n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t0 f78911l;

    public interface a {
    }

    private c0(g0 g0Var, OsSharedRealm.a aVar) {
        super(g0Var, G0(g0Var.i().n()), aVar);
        this.f78911l = new n(this, new io.realm.internal.b(this.f78897c.n(), this.f78899e.getSchemaInfo()));
        if (this.f78897c.r()) {
            io.realm.internal.p pVarN = this.f78897c.n();
            Iterator<Class<? extends n0>> it = pVarN.k().iterator();
            while (it.hasNext()) {
                String strQ = Table.q(pVarN.l(it.next()));
                if (!this.f78899e.hasTable(strQ)) {
                    this.f78899e.close();
                    throw new RealmMigrationNeededException(this.f78897c.k(), String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", Table.h(strQ)));
                }
            }
        }
    }

    private <E extends n0> E D0(E e11, int i11, Map<n0, io.realm.internal.o.a<n0>> map) {
        n();
        return (E) this.f78897c.n().e(e11, i11, map);
    }

    private static OsSchemaInfo G0(io.realm.internal.p pVar) {
        return new OsSchemaInfo(pVar.h().values());
    }

    static c0 H0(g0 g0Var, OsSharedRealm.a aVar) {
        return new c0(g0Var, aVar);
    }

    static c0 J0(OsSharedRealm osSharedRealm) {
        return new c0(osSharedRealm);
    }

    public static Object K0() {
        try {
            Constructor<?> constructor = DefaultRealmModule.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance(null);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException e11) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e11);
        } catch (InstantiationException e12) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e12);
        } catch (InvocationTargetException e13) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e13);
        }
    }

    public static c0 O0(i0 i0Var) {
        if (i0Var != null) {
            return (c0) g0.e(i0Var, c0.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public static synchronized void U0(Context context) {
        Y0(context, "");
    }

    private static void Y0(Context context, String str) {
        if (io.realm.a.f78891h == null) {
            if (context == null) {
                throw new IllegalArgumentException("Non-null context required.");
            }
            k0(context);
            if (c1(context)) {
                throw new RealmError("Could not initialize Realm: Instant apps are not currently supported.");
            }
            io.realm.internal.n.a(context);
            d1(new i0.a(context).a());
            io.realm.internal.i.e().h(context, str, new io.realm.internal.i.a() { // from class: io.realm.a0
            }, new io.realm.internal.i.b() { // from class: io.realm.b0
            });
            if (context.getApplicationContext() != null) {
                io.realm.a.f78891h = context.getApplicationContext();
            } else {
                io.realm.a.f78891h = context;
            }
            OsSharedRealm.initialize(new File(context.getFilesDir(), ".realm.temp"));
        }
    }

    private static boolean c1(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            return ((Boolean) Class.forName("com.google.android.gms.instantapps.PackageManagerCompat").getMethod("isInstantApp", null).invoke(Class.forName("com.google.android.gms.instantapps.InstantApps").getMethod("getPackageManagerCompat", Context.class).invoke(null, context), null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void d1(i0 i0Var) {
        if (i0Var == null) {
            throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
        }
        synchronized (f78909m) {
            f78910n = i0Var;
        }
    }

    private static void k0(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            if (filesDir.exists()) {
                return;
            } else {
                try {
                    filesDir.mkdirs();
                } catch (SecurityException unused) {
                }
            }
        }
        if (filesDir == null || !filesDir.exists()) {
            long[] jArr = {1, 2, 5, 10, 16};
            long j11 = 0;
            int i11 = -1;
            do {
                if (context.getFilesDir() != null && context.getFilesDir().exists()) {
                    break;
                }
                i11++;
                long j12 = jArr[Math.min(i11, 4)];
                SystemClock.sleep(j12);
                j11 += j12;
            } while (j11 <= 200);
        }
        if (context.getFilesDir() == null || !context.getFilesDir().exists()) {
            throw new IllegalStateException("Context.getFilesDir() returns " + context.getFilesDir() + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154");
        }
    }

    private void n0(Class<? extends n0> cls) {
        if (T0(cls)) {
            return;
        }
        throw new IllegalArgumentException("A RealmObject with no @PrimaryKey cannot be updated: " + cls.toString());
    }

    private void r0(int i11) {
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException("maxDepth must be > 0. It was: " + i11);
    }

    private <E extends n0> void s0(E e11) {
        if (e11 == null) {
            throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
        }
    }

    private <E extends n0> void t0(E e11) {
        if (e11 == null) {
            throw new IllegalArgumentException("Null objects cannot be copied from Realm.");
        }
        if (!p0.i(e11) || !p0.j(e11)) {
            throw new IllegalArgumentException("Only valid managed objects can be copied from Realm.");
        }
        if (e11 instanceof j) {
            throw new IllegalArgumentException("DynamicRealmObject cannot be copied from Realm.");
        }
    }

    private <E extends n0> E y0(E e11, boolean z11, Map<n0, io.realm.internal.o> map, Set<o> set) {
        n();
        if (!c0()) {
            throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
        }
        if (this.f78897c.n().p(Util.c(e11.getClass()))) {
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
        try {
            return (E) this.f78897c.n().c(this, e11, z11, map, set);
        } catch (RuntimeException e12) {
            if (e12.getMessage().startsWith("Attempting to create an object of type")) {
                throw new RealmPrimaryKeyConstraintException(e12.getMessage());
            }
            throw e12;
        }
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ i0 I() {
        return super.I();
    }

    @Override // io.realm.a
    public t0 J() {
        return this.f78911l;
    }

    Table P0(Class<? extends n0> cls) {
        return this.f78911l.i(cls);
    }

    boolean T0(Class<? extends n0> cls) {
        return this.f78897c.n().n(cls);
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean b0() {
        return super.b0();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void beginTransaction() {
        super.beginTransaction();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
    }

    @Override // io.realm.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void e0() {
        super.e0();
    }

    public <E extends n0> RealmQuery<E> e1(Class<E> cls) {
        n();
        return RealmQuery.e(this, cls);
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ String getPath() {
        return super.getPath();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    public <E extends n0> List<E> u0(Iterable<E> iterable) {
        return w0(iterable, Integer.MAX_VALUE);
    }

    public <E extends n0> List<E> w0(Iterable<E> iterable, int i11) {
        r0(i11);
        if (iterable == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = iterable instanceof Collection ? new ArrayList(((Collection) iterable).size()) : new ArrayList();
        HashMap map = new HashMap();
        for (E e11 : iterable) {
            t0(e11);
            arrayList.add(D0(e11, i11, map));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends n0> E z0(E e11, o... oVarArr) {
        s0(e11);
        n0(e11.getClass());
        return (E) y0(e11, true, new HashMap(), Util.h(oVarArr));
    }

    private c0(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.f78911l = new n(this, new io.realm.internal.b(this.f78897c.n(), osSharedRealm.getSchemaInfo()));
    }
}
