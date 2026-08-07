package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f23968a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f23969b = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f23971d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f23972e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static List<Integer> f23973f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map<Integer, List<Integer>> f23974g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f23975h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f23970c = 3 + 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ReentrantReadWriteLock f23976i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashSet<String> f23977j = new a();

    class a extends HashSet<String> {
        a() {
            add("libEGL.so");
            add("libGLESv2.so");
            add("libGLESv3.so");
            add("libOpenSLES.so");
            add("libandroid.so");
            add("libc.so");
            add("libdl.so");
            add("libjnigraphics.so");
            add("liblog.so");
            add("libm.so");
            add("libstdc++.so");
            add("libz.so");
        }
    }

    private static String[] a(String str) {
        if (f23971d) {
            return i(str);
        }
        if (!f23975h) {
            return null;
        }
        f23976i.readLock().lock();
        try {
            return i(str);
        } finally {
            f23976i.readLock().unlock();
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public static String[] b(String str, h hVar) {
        boolean z11 = SoLoader.f23902a;
        if (z11) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        cp.b.b();
        try {
            try {
                try {
                    String[] strArrA = a(str);
                    if (strArrA != null) {
                        cp.b.a(null);
                        if (z11) {
                            Api18TraceUtils.b();
                        }
                        return strArrA;
                    }
                    String[] strArrA2 = s.a(hVar);
                    cp.b.a(null);
                    if (z11) {
                        Api18TraceUtils.b();
                    }
                    return strArrA2;
                } catch (Error | RuntimeException e11) {
                    throw e11;
                }
            } catch (s.a e12) {
                throw c0.b(str, e12);
            }
        } catch (Throwable th2) {
            cp.b.a(null);
            if (SoLoader.f23902a) {
                Api18TraceUtils.b();
            }
            throw th2;
        }
    }

    private static String[] c(int i11, int i12) {
        byte b11;
        ArrayList arrayList = new ArrayList();
        int i13 = (i11 + i12) - f23970c;
        int i14 = 0;
        boolean z11 = false;
        while (true) {
            byte[] bArr = f23972e;
            if (i13 >= bArr.length || (b11 = bArr[i13]) == 10) {
                break;
            }
            if (b11 == 32) {
                if (z11) {
                    String strD = d(i14);
                    if (strD == null) {
                        return null;
                    }
                    arrayList.add(strD);
                    i14 = 0;
                    z11 = false;
                } else {
                    continue;
                }
            } else {
                if (b11 < 48 || b11 > 57) {
                    return null;
                }
                i14 = (i14 * 10) + (b11 - 48);
                z11 = true;
            }
            i13++;
        }
        if (z11) {
            String strD2 = d(i14);
            if (strD2 == null) {
                return null;
            }
            arrayList.add(strD2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static String d(int i11) {
        if (i11 >= f23973f.size()) {
            return null;
        }
        int iIntValue = f23973f.get(i11).intValue();
        int i12 = iIntValue;
        while (true) {
            byte[] bArr = f23972e;
            if (i12 >= bArr.length || bArr[i12] <= 32) {
                break;
            }
            i12++;
        }
        int i13 = (i12 - iIntValue) + f23970c;
        char[] cArr = new char[i13];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i14 = 0; i14 < i13 - f23970c; i14++) {
            cArr[f23968a + i14] = (char) f23972e[iIntValue + i14];
        }
        cArr[i13 - 3] = CoreConstants.DOT;
        cArr[i13 - 2] = 's';
        cArr[i13 - 1] = 'o';
        return new String(cArr);
    }

    private static int e(String str) {
        List<Integer> list = f23974g.get(Integer.valueOf(f(str)));
        if (list == null) {
            return -1;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (g(str, iIntValue)) {
                return iIntValue;
            }
        }
        return -1;
    }

    private static int f(String str) {
        int iCodePointAt = 5381;
        for (int i11 = f23968a; i11 < str.length() - f23969b; i11++) {
            iCodePointAt = str.codePointAt(i11) + (iCodePointAt << 5) + iCodePointAt;
        }
        return iCodePointAt;
    }

    private static boolean g(String str, int i11) {
        int i12;
        int i13 = f23968a;
        while (true) {
            int length = str.length();
            i12 = f23969b;
            if (i13 >= length - i12 || i11 >= f23972e.length || (str.codePointAt(i13) & 255) != f23972e[i11]) {
                break;
            }
            i13++;
            i11++;
        }
        return i13 == str.length() - i12;
    }

    public static void h(String str, h hVar, int i11, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrB = b(str, hVar);
        p.a("SoLoader", "Loading " + str + "'s dependencies: " + Arrays.toString(strArrB));
        for (String str2 : strArrB) {
            if (!str2.startsWith("/") && !f23977j.contains(str2)) {
                SoLoader.s(str2, i11, threadPolicy);
            }
        }
    }

    static String[] i(String str) {
        int iE;
        if (f23971d && str.length() > f23970c && (iE = e(str)) != -1) {
            return c(iE, str.length());
        }
        return null;
    }
}
