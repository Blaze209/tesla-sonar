package fu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.play.core.splitinstall.internal.zzbh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference f66574e = new AtomicReference(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f66575f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f66576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gu.d f66577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f66578c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f66579d;

    private a(Context context) {
        try {
            f fVar = new f(context);
            this.f66576a = fVar;
            this.f66579d = new b(fVar);
            this.f66577b = new gu.d(context);
        } catch (PackageManager.NameNotFoundException e11) {
            throw new zzbh("Failed to initialize FileStorage", e11);
        }
    }

    public static boolean a(@NonNull Context context) {
        return j(context, false);
    }

    public static boolean b(@NonNull Context context) {
        if (k()) {
            return false;
        }
        a aVar = (a) f66574e.get();
        if (aVar != null) {
            return aVar.f66579d.b(context, aVar.g());
        }
        if (context.getApplicationContext() != null) {
            a(context.getApplicationContext());
        }
        return a(context);
    }

    public static boolean e(Context context) {
        return j(context, true);
    }

    public static boolean f() {
        return f66574e.get() != null;
    }

    private final Set g() {
        HashSet hashSet;
        synchronized (this.f66578c) {
            hashSet = new HashSet(this.f66578c);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f.l(this.f66576a.g((String) it.next()));
        }
        this.f66577b.b();
    }

    private final synchronized void i(Context context, boolean z11) {
        ZipFile zipFile;
        try {
            if (z11) {
                this.f66576a.k();
            } else {
                e.a().execute(new r(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                Set<u> setJ = this.f66576a.j();
                Set setA = this.f66577b.a();
                HashSet hashSet = new HashSet();
                Iterator it = setJ.iterator();
                while (it.hasNext()) {
                    String strB = ((u) it.next()).b();
                    if (arrayList.contains(strB) || setA.contains(gu.l.a(strB))) {
                        hashSet.add(strB);
                        it.remove();
                    }
                }
                if (z11) {
                    h(hashSet);
                } else if (!hashSet.isEmpty()) {
                    e.a().execute(new s(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = setJ.iterator();
                while (it2.hasNext()) {
                    String strB2 = ((u) it2.next()).b();
                    if (!gu.l.b(strB2)) {
                        hashSet2.add(strB2);
                    }
                }
                for (String str : arrayList) {
                    if (!gu.l.b(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<u> hashSet3 = new HashSet(setJ.size());
                for (u uVar : setJ) {
                    String strB3 = uVar.b();
                    int i11 = gu.l.f69562b;
                    if (strB3.startsWith("config.") || hashSet2.contains(gu.l.a(uVar.b()))) {
                        hashSet3.add(uVar);
                    }
                }
                o oVar = new o(this.f66576a);
                hu.h hVarA = hu.i.a();
                ClassLoader classLoader = context.getClassLoader();
                if (z11) {
                    hVarA.a(classLoader, oVar.c());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        Set setB = oVar.b((u) it3.next());
                        if (setB == null) {
                            it3.remove();
                        } else {
                            hVarA.a(classLoader, setB);
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (u uVar2 : hashSet3) {
                    try {
                        zipFile = new ZipFile(uVar2.a());
                        try {
                            ZipEntry entry = zipFile.getEntry("classes.dex");
                            zipFile.close();
                            if (entry == null || hVarA.b(classLoader, this.f66576a.a(uVar2.b()), uVar2.a(), z11)) {
                                hashSet4.add(uVar2.a());
                            } else {
                                Log.w("SplitCompat", "split was not installed ".concat(uVar2.a().toString()));
                            }
                        } catch (IOException e11) {
                            e = e11;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e12) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e12);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        zipFile = null;
                    }
                }
                this.f66579d.a(context, hashSet4);
                HashSet hashSet5 = new HashSet();
                for (u uVar3 : hashSet3) {
                    if (hashSet4.contains(uVar3.a())) {
                        Log.d("SplitCompat", "Split '" + uVar3.b() + "' installation emulated");
                        hashSet5.add(uVar3.b());
                    } else {
                        Log.d("SplitCompat", "Split '" + uVar3.b() + "' installation not emulated.");
                    }
                }
                synchronized (this.f66578c) {
                    this.f66578c.addAll(hashSet5);
                }
            } catch (PackageManager.NameNotFoundException e14) {
                throw new IOException(String.format("Cannot load data for application '%s'", packageName), e14);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static boolean j(Context context, boolean z11) {
        boolean z12;
        final Context context2;
        if (k()) {
            return false;
        }
        AtomicReference atomicReference = f66574e;
        a aVar = new a(context);
        while (true) {
            if (androidx.camera.view.i.a(atomicReference, null, aVar)) {
                z12 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z12 = false;
                break;
            }
        }
        a aVar2 = (a) f66574e.get();
        if (z12) {
            context2 = context;
            gu.i.INSTANCE.zzb(new hu.e(context2, e.a(), new hu.g(context, aVar2.f66576a, new hu.b()), aVar2.f66576a, new t()));
            gu.k.a(new q(aVar2));
            e.a().execute(new Runnable() { // from class: fu.p
                @Override // java.lang.Runnable
                public final void run() {
                    Context context3 = context2;
                    int i11 = a.f66575f;
                    try {
                        gu.o.f(context3).b(true);
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    }
                }
            });
        } else {
            context2 = context;
        }
        try {
            aVar2.i(context2, z11);
            return true;
        } catch (Exception e11) {
            Log.e("SplitCompat", "Error installing additional splits", e11);
            return false;
        }
    }

    private static boolean k() {
        return false;
    }
}
