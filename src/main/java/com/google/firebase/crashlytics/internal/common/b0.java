package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes5.dex */
public class b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f43940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f43941h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k0 f43943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f43944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mv.d f43945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lv.j f43946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bv.i f43947f = bv.i.f18125a;

    static {
        HashMap map = new HashMap();
        f43940g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f43941h = String.format(Locale.US, "Crashlytics Android SDK/%s", "20.0.3");
    }

    public b0(Context context, k0 k0Var, a aVar, mv.d dVar, lv.j jVar) {
        this.f43942a = context;
        this.f43943b = k0Var;
        this.f43944c = aVar;
        this.f43945d = dVar;
        this.f43946e = jVar;
    }

    private gv.f0.e.d.a.c A(gv.f0.a aVar) {
        return this.f43947f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private gv.f0.a a(gv.f0.a aVar) {
        List<gv.f0.a.AbstractC1424a> listUnmodifiableList;
        if (!this.f43946e.a().f90794b.f90803c || this.f43944c.f43929c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f43944c.f43929c) {
                arrayList.add(gv.f0.a.AbstractC1424a.a().d(fVar.c()).b(fVar.a()).c(fVar.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return gv.f0.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    private gv.f0.b b() {
        return gv.f0.b().l("20.0.3").h(this.f43944c.f43927a).i(this.f43943b.a().c()).g(this.f43943b.a().e()).f(this.f43943b.a().d()).d(this.f43944c.f43932f).e(this.f43944c.f43933g).k(4);
    }

    private static long f(long j11) {
        if (j11 > 0) {
            return j11;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f43940g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private gv.f0.e.d.a.b.AbstractC1428a h() {
        return gv.f0.e.d.a.b.AbstractC1428a.a().b(0L).d(0L).c(this.f43944c.f43931e).e(this.f43944c.f43928b).a();
    }

    private List<gv.f0.e.d.a.b.AbstractC1428a> i() {
        return Collections.singletonList(h());
    }

    private gv.f0.e.d.a j(int i11, gv.f0.a aVar) {
        return gv.f0.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i11).f(o(aVar)).a();
    }

    private gv.f0.e.d.a k(int i11, mv.e eVar, Thread thread, int i12, int i13, boolean z11) {
        Boolean boolValueOf;
        gv.f0.e.d.a.c cVarE = this.f43947f.e(this.f43942a);
        if (cVarE.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return gv.f0.e.d.a.a().c(boolValueOf).d(cVarE).b(this.f43947f.d(this.f43942a)).h(i11).f(p(eVar, thread, i12, i13, z11)).a();
    }

    private gv.f0.e.d.c l(int i11) {
        e eVarA = e.a(this.f43942a);
        Float fB = eVarA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = eVarA.c();
        boolean zN = i.n(this.f43942a);
        return gv.f0.e.d.c.a().b(dValueOf).c(iC).f(zN).e(i11).g(f(i.b(this.f43942a) - i.a(this.f43942a))).d(i.c(Environment.getDataDirectory().getPath())).a();
    }

    private gv.f0.e.d.a.b.c m(mv.e eVar, int i11, int i12) {
        return n(eVar, i11, i12, 0);
    }

    private gv.f0.e.d.a.b.c n(mv.e eVar, int i11, int i12, int i13) {
        String str = eVar.f92519b;
        String str2 = eVar.f92518a;
        StackTraceElement[] stackTraceElementArr = eVar.f92520c;
        int i14 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        mv.e eVar2 = eVar.f92521d;
        if (i13 >= i12) {
            mv.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f92521d;
                i14++;
            }
        }
        gv.f0.e.d.a.b.c.AbstractC1431a abstractC1431aD = gv.f0.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i11)).d(i14);
        if (eVar2 != null && i14 == 0) {
            abstractC1431aD.b(n(eVar2, i11, i12, i13 + 1));
        }
        return abstractC1431aD.a();
    }

    private gv.f0.e.d.a.b o(gv.f0.a aVar) {
        return gv.f0.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private gv.f0.e.d.a.b p(mv.e eVar, Thread thread, int i11, int i12, boolean z11) {
        return gv.f0.e.d.a.b.a().f(z(eVar, thread, i11, z11)).d(m(eVar, i11, i12)).e(w()).c(i()).a();
    }

    private gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b q(StackTraceElement stackTraceElement, gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b.AbstractC1437a abstractC1437a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC1437a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private List<gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b> r(StackTraceElement[] stackTraceElementArr, int i11) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, gv.f0.e.d.a.b.AbstractC1434e.AbstractC1436b.a().c(i11)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private gv.f0.e.a s() {
        return gv.f0.e.a.a().e(this.f43943b.f()).g(this.f43944c.f43932f).d(this.f43944c.f43933g).f(this.f43943b.a().c()).b(this.f43944c.f43934h.d()).c(this.f43944c.f43934h.e()).a();
    }

    private gv.f0.e t(String str, long j11) {
        return gv.f0.e.a().m(j11).j(str).h(f43941h).b(s()).l(v()).e(u()).i(3).a();
    }

    private gv.f0.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = i.b(this.f43942a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zX = i.x();
        int iL = i.l();
        String str = Build.MANUFACTURER;
        return gv.f0.e.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zX).j(iL).e(str).g(Build.PRODUCT).a();
    }

    private gv.f0.e.AbstractC1441e v() {
        return gv.f0.e.AbstractC1441e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(i.y()).a();
    }

    private gv.f0.e.d.a.b.AbstractC1432d w() {
        return gv.f0.e.d.a.b.AbstractC1432d.a().d(WebrtcBuildVersion.maint_version).c(WebrtcBuildVersion.maint_version).b(0L).a();
    }

    private gv.f0.e.d.a.b.AbstractC1434e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private gv.f0.e.d.a.b.AbstractC1434e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i11) {
        return gv.f0.e.d.a.b.AbstractC1434e.a().d(thread.getName()).c(i11).b(r(stackTraceElementArr, i11)).a();
    }

    private List<gv.f0.e.d.a.b.AbstractC1434e> z(mv.e eVar, Thread thread, int i11, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f92520c, i11));
        if (z11) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f43945d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public gv.f0.e.d c(gv.f0.a aVar) {
        int i11 = this.f43942a.getResources().getConfiguration().orientation;
        return gv.f0.e.d.a().g("anr").f(aVar.i()).b(j(i11, a(aVar))).c(l(i11)).a();
    }

    public gv.f0.e.d d(Throwable th2, Thread thread, String str, long j11, int i11, int i12, boolean z11) {
        int i13 = this.f43942a.getResources().getConfiguration().orientation;
        return gv.f0.e.d.a().g(str).f(j11).b(k(i13, mv.e.a(th2, this.f43945d), thread, i11, i12, z11)).c(l(i13)).a();
    }

    public gv.f0 e(String str, long j11) {
        return b().m(t(str, j11)).a();
    }
}
