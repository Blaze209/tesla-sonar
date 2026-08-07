package r5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.x;
import androidx.collection.x0;
import androidx.core.util.Consumer;
import c0.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final x<String, Typeface> f107001a = new x<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f107002b = h.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f107003c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final x0<String, ArrayList<Consumer<e>>> f107004d = new x0<>();

    class a implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f107005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f107006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r5.e f107007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f107008d;

        a(String str, Context context, r5.e eVar, int i11) {
            this.f107005a = str;
            this.f107006b = context;
            this.f107007c = eVar;
            this.f107008d = i11;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f107005a, this.f107006b, h0.a(new Object[]{this.f107007c}), this.f107008d);
        }
    }

    class b implements Consumer<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r5.a f107009a;

        b(r5.a aVar) {
            this.f107009a = aVar;
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f107009a.b(eVar);
        }
    }

    class c implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f107010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f107011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f107012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f107013d;

        c(String str, Context context, List list, int i11) {
            this.f107010a = str;
            this.f107011b = context;
            this.f107012c = list;
            this.f107013d = i11;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f107010a, this.f107011b, this.f107012c, this.f107013d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements Consumer<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f107014a;

        d(String str) {
            this.f107014a = str;
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f107003c) {
                try {
                    x0<String, ArrayList<Consumer<e>>> x0Var = f.f107004d;
                    ArrayList<Consumer<e>> arrayList = x0Var.get(this.f107014a);
                    if (arrayList == null) {
                        return;
                    }
                    x0Var.remove(this.f107014a);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        arrayList.get(i11).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static String a(List<r5.e> list, int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < list.size(); i12++) {
            sb2.append(list.get(i12).d());
            sb2.append("-");
            sb2.append(i11);
            if (i12 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @SuppressLint({"WrongConstant"})
    private static int b(g.a aVar) {
        int i11 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        g.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i11 = 0;
            for (g.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i11;
    }

    static e c(String str, Context context, List<r5.e> list, int i11) {
        eb.a.c("getFontSync");
        try {
            x<String, Typeface> xVar = f107001a;
            Typeface typeface = xVar.get(str);
            if (typeface != null) {
                e eVar = new e(typeface);
                eb.a.f();
                return eVar;
            }
            try {
                g.a aVarE = r5.d.e(context, list, null);
                int iB = b(aVarE);
                if (iB != 0) {
                    e eVar2 = new e(iB);
                    eb.a.f();
                    return eVar2;
                }
                Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? k5.h.b(context, null, aVarE.c(), i11) : k5.h.c(context, null, aVarE.d(), i11);
                if (typefaceB == null) {
                    e eVar3 = new e(-3);
                    eb.a.f();
                    return eVar3;
                }
                xVar.put(str, typefaceB);
                e eVar4 = new e(typefaceB);
                eb.a.f();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                eb.a.f();
                return eVar5;
            }
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    static Typeface d(Context context, List<r5.e> list, int i11, Executor executor, r5.a aVar) {
        String strA = a(list, i11);
        Typeface typeface = f107001a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f107003c) {
            try {
                x0<String, ArrayList<Consumer<e>>> x0Var = f107004d;
                ArrayList<Consumer<e>> arrayList = x0Var.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<Consumer<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                x0Var.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i11);
                if (executor == null) {
                    executor = f107002b;
                }
                h.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static Typeface e(Context context, r5.e eVar, r5.a aVar, int i11, int i12) {
        String strA = a(h0.a(new Object[]{eVar}), i11);
        Typeface typeface = f107001a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i12 == -1) {
            e eVarC = c(strA, context, h0.a(new Object[]{eVar}), i11);
            aVar.b(eVarC);
            return eVarC.f107015a;
        }
        try {
            e eVar2 = (e) h.d(f107002b, new a(strA, context, eVar, i11), i12);
            aVar.b(eVar2);
            return eVar2.f107015a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f107015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f107016b;

        e(int i11) {
            this.f107015a = null;
            this.f107016b = i11;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.f107016b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f107015a = typeface;
            this.f107016b = 0;
        }
    }
}
