package io.realm;

import android.content.Context;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.Util;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class i0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Object f78934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final io.realm.internal.p f78935t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f78936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f78937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f78938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f78939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f78940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f78941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m0 f78942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f78943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OsRealmConfig.c f78944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.realm.internal.p f78945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final fn0.b f78946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final zm0.a f78947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f78948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CompactOnLaunchCallback f78949n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f78950o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f78951p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f78952q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f78953r;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f78954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f78955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f78956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f78957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f78958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private m0 f78959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f78960g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private OsRealmConfig.c f78961h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private HashSet<Object> f78962i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private HashSet<Class<? extends n0>> f78963j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f78964k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private fn0.b f78965l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private zm0.a f78966m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f78967n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private CompactOnLaunchCallback f78968o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f78969p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f78970q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f78971r;

        public a() {
            this(io.realm.a.f78891h);
        }

        private void c(Context context) {
            this.f78954a = context.getFilesDir();
            this.f78955b = "default.realm";
            this.f78957d = null;
            this.f78958e = 0L;
            this.f78959f = null;
            this.f78960g = false;
            this.f78961h = OsRealmConfig.c.FULL;
            this.f78967n = false;
            this.f78968o = null;
            if (i0.f78934s != null) {
                this.f78962i.add(i0.f78934s);
            }
            this.f78970q = false;
            this.f78971r = true;
        }

        public i0 a() {
            if (this.f78967n) {
                if (this.f78956c == null) {
                    throw new IllegalStateException("Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided.");
                }
                if (this.f78960g) {
                    throw new IllegalStateException("'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined");
                }
                if (this.f78968o != null) {
                    throw new IllegalStateException("'compactOnLaunch()' and read-only Realms cannot be combined");
                }
            }
            if (this.f78965l == null && Util.g()) {
                this.f78965l = new fn0.a(true);
            }
            if (this.f78966m == null && Util.e()) {
                this.f78966m = new zm0.b(Boolean.TRUE);
            }
            return new i0(new File(this.f78954a, this.f78955b), this.f78956c, this.f78957d, this.f78958e, this.f78959f, this.f78960g, this.f78961h, i0.b(this.f78962i, this.f78963j, this.f78964k), this.f78965l, this.f78966m, null, this.f78967n, this.f78968o, false, this.f78969p, this.f78970q, this.f78971r);
        }

        public a b(CompactOnLaunchCallback compactOnLaunchCallback) {
            if (compactOnLaunchCallback == null) {
                throw new IllegalArgumentException("A non-null compactOnLaunch must be provided");
            }
            this.f78968o = compactOnLaunchCallback;
            return this;
        }

        public a d(m0 m0Var) {
            if (m0Var == null) {
                throw new IllegalArgumentException("A non-null migration must be provided");
            }
            this.f78959f = m0Var;
            return this;
        }

        public a e(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("A non-empty filename must be provided");
            }
            this.f78955b = str;
            return this;
        }

        public a f(long j11) {
            if (j11 >= 0) {
                this.f78958e = j11;
                return this;
            }
            throw new IllegalArgumentException("Realm schema version numbers must be 0 (zero) or higher. Yours was: " + j11);
        }

        a(Context context) {
            this.f78962i = new HashSet<>();
            this.f78963j = new HashSet<>();
            this.f78964k = false;
            this.f78969p = Long.MAX_VALUE;
            if (context == null) {
                throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
            }
            io.realm.internal.n.a(context);
            c(context);
        }
    }

    static {
        Object objK0 = c0.K0();
        f78934s = objK0;
        if (objK0 == null) {
            f78935t = null;
            return;
        }
        io.realm.internal.p pVarJ = j(objK0.getClass().getCanonicalName());
        if (!pVarJ.r()) {
            throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://docs.mongodb.com/realm/sdk/android/install/#customize-dependecies-defined-by-the-realm-gradle-plugin");
        }
        f78935t = pVarJ;
    }

    protected i0(File file, String str, byte[] bArr, long j11, m0 m0Var, boolean z11, OsRealmConfig.c cVar, io.realm.internal.p pVar, fn0.b bVar, zm0.a aVar, c0.a aVar2, boolean z12, CompactOnLaunchCallback compactOnLaunchCallback, boolean z13, long j12, boolean z14, boolean z15) {
        this.f78936a = file.getParentFile();
        this.f78937b = file.getName();
        this.f78938c = file.getAbsolutePath();
        this.f78939d = str;
        this.f78940e = bArr;
        this.f78941f = j11;
        this.f78942g = m0Var;
        this.f78943h = z11;
        this.f78944i = cVar;
        this.f78945j = pVar;
        this.f78946k = bVar;
        this.f78947l = aVar;
        this.f78948m = z12;
        this.f78949n = compactOnLaunchCallback;
        this.f78953r = z13;
        this.f78950o = j12;
        this.f78951p = z14;
        this.f78952q = z15;
    }

    protected static io.realm.internal.p b(Set<Object> set, Set<Class<? extends n0>> set2, boolean z11) {
        if (set2.size() > 0) {
            return new dn0.b(f78935t, set2, z11);
        }
        if (set.size() == 1) {
            return j(set.iterator().next().getClass().getCanonicalName());
        }
        io.realm.internal.p[] pVarArr = new io.realm.internal.p[set.size()];
        Iterator<Object> it = set.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            pVarArr[i11] = j(it.next().getClass().getCanonicalName());
            i11++;
        }
        return new dn0.a(pVarArr);
    }

    private static io.realm.internal.p j(String str) {
        String[] strArrSplit = str.split("\\.");
        String str2 = String.format(Locale.US, "io.realm.%s%s", strArrSplit[strArrSplit.length - 1], "Mediator");
        try {
            Constructor<?> constructor = Class.forName(str2).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (io.realm.internal.p) constructor.newInstance(null);
        } catch (ClassNotFoundException e11) {
            throw new RealmException("Could not find " + str2, e11);
        } catch (IllegalAccessException e12) {
            throw new RealmException("Could not create an instance of " + str2, e12);
        } catch (InstantiationException e13) {
            throw new RealmException("Could not create an instance of " + str2, e13);
        } catch (InvocationTargetException e14) {
            throw new RealmException("Could not create an instance of " + str2, e14);
        }
    }

    public String c() {
        return this.f78939d;
    }

    public CompactOnLaunchCallback d() {
        return this.f78949n;
    }

    public OsRealmConfig.c e() {
        return this.f78944i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f78941f != i0Var.f78941f || this.f78943h != i0Var.f78943h || this.f78948m != i0Var.f78948m || this.f78953r != i0Var.f78953r) {
                return false;
            }
            File file = this.f78936a;
            if (file == null ? i0Var.f78936a != null : !file.equals(i0Var.f78936a)) {
                return false;
            }
            String str = this.f78937b;
            if (str == null ? i0Var.f78937b != null : !str.equals(i0Var.f78937b)) {
                return false;
            }
            if (!this.f78938c.equals(i0Var.f78938c)) {
                return false;
            }
            String str2 = this.f78939d;
            if (str2 == null ? i0Var.f78939d != null : !str2.equals(i0Var.f78939d)) {
                return false;
            }
            if (!Arrays.equals(this.f78940e, i0Var.f78940e)) {
                return false;
            }
            m0 m0Var = this.f78942g;
            if (m0Var == null ? i0Var.f78942g != null : !m0Var.equals(i0Var.f78942g)) {
                return false;
            }
            if (this.f78944i != i0Var.f78944i || !this.f78945j.equals(i0Var.f78945j)) {
                return false;
            }
            fn0.b bVar = this.f78946k;
            if (bVar == null ? i0Var.f78946k != null : !bVar.equals(i0Var.f78946k)) {
                return false;
            }
            CompactOnLaunchCallback compactOnLaunchCallback = this.f78949n;
            if (compactOnLaunchCallback == null ? i0Var.f78949n != null : !compactOnLaunchCallback.equals(i0Var.f78949n)) {
                return false;
            }
            if (this.f78950o == i0Var.f78950o) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        byte[] bArr = this.f78940e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    protected c0.a g() {
        return null;
    }

    public long h() {
        return this.f78950o;
    }

    public int hashCode() {
        File file = this.f78936a;
        int iHashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.f78937b;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f78938c.hashCode()) * 31;
        String str2 = this.f78939d;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f78940e)) * 31;
        long j11 = this.f78941f;
        int i11 = (iHashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        m0 m0Var = this.f78942g;
        int iHashCode4 = (((((((i11 + (m0Var != null ? m0Var.hashCode() : 0)) * 31) + (this.f78943h ? 1 : 0)) * 31) + this.f78944i.hashCode()) * 31) + this.f78945j.hashCode()) * 31;
        fn0.b bVar = this.f78946k;
        int iHashCode5 = (((iHashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 961) + (this.f78948m ? 1 : 0)) * 31;
        CompactOnLaunchCallback compactOnLaunchCallback = this.f78949n;
        int iHashCode6 = (((iHashCode5 + (compactOnLaunchCallback != null ? compactOnLaunchCallback.hashCode() : 0)) * 31) + (this.f78953r ? 1 : 0)) * 31;
        long j12 = this.f78950o;
        return iHashCode6 + ((int) (j12 ^ (j12 >>> 32)));
    }

    public m0 i() {
        return this.f78942g;
    }

    public String k() {
        return this.f78938c;
    }

    public File l() {
        return this.f78936a;
    }

    public String m() {
        return this.f78937b;
    }

    protected io.realm.internal.p n() {
        return this.f78945j;
    }

    public long o() {
        return this.f78941f;
    }

    public boolean p() {
        return !Util.f(this.f78939d);
    }

    public boolean q() {
        return this.f78952q;
    }

    public boolean r() {
        return this.f78948m;
    }

    public boolean s() {
        return this.f78953r;
    }

    protected boolean t() {
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("realmDirectory: ");
        File file = this.f78936a;
        sb2.append(file != null ? file.toString() : "");
        sb2.append("\n");
        sb2.append("realmFileName : ");
        sb2.append(this.f78937b);
        sb2.append("\n");
        sb2.append("canonicalPath: ");
        sb2.append(this.f78938c);
        sb2.append("\n");
        sb2.append("key: ");
        sb2.append("[length: ");
        sb2.append(this.f78940e == null ? 0 : 64);
        sb2.append("]");
        sb2.append("\n");
        sb2.append("schemaVersion: ");
        sb2.append(Long.toString(this.f78941f));
        sb2.append("\n");
        sb2.append("migration: ");
        sb2.append(this.f78942g);
        sb2.append("\n");
        sb2.append("deleteRealmIfMigrationNeeded: ");
        sb2.append(this.f78943h);
        sb2.append("\n");
        sb2.append("durability: ");
        sb2.append(this.f78944i);
        sb2.append("\n");
        sb2.append("schemaMediator: ");
        sb2.append(this.f78945j);
        sb2.append("\n");
        sb2.append("readOnly: ");
        sb2.append(this.f78948m);
        sb2.append("\n");
        sb2.append("compactOnLaunch: ");
        sb2.append(this.f78949n);
        sb2.append("\n");
        sb2.append("maxNumberOfActiveVersions: ");
        sb2.append(this.f78950o);
        return sb2.toString();
    }

    protected boolean u() {
        return new File(this.f78938c).exists();
    }

    public boolean v() {
        return this.f78943h;
    }
}
