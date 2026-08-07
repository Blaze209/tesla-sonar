package tf;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.r0;

/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, com.airbnb.lottie.r<i>> f113394a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<g0> f113395b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f113396c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f113397d = {31, -117, 8};

    public static e0<i> A(r0 r0Var, String str, boolean z11) {
        return y(gg.c.n(okio.c0.d(r0Var)), str, z11);
    }

    public static com.airbnb.lottie.r<i> B(final String str, final String str2) {
        return l(str2, new Callable() { // from class: tf.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.C(str, str2);
            }
        }, null);
    }

    public static e0<i> C(String str, String str2) {
        return z(okio.c0.m(new ByteArrayInputStream(str.getBytes())), str2);
    }

    public static com.airbnb.lottie.r<i> D(Context context, int i11) {
        return E(context, i11, T(context, i11));
    }

    public static com.airbnb.lottie.r<i> E(Context context, final int i11, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return l(str, new Callable() { // from class: tf.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.d(weakReference, applicationContext, i11, str);
            }
        }, null);
    }

    public static e0<i> F(Context context, int i11) {
        return G(context, i11, T(context, i11));
    }

    public static e0<i> G(Context context, int i11, String str) {
        i iVarA = str == null ? null : ag.g.b().a(str);
        if (iVarA != null) {
            return new e0<>(iVarA);
        }
        try {
            okio.j jVarD = okio.c0.d(okio.c0.m(context.getResources().openRawResource(i11)));
            if (Q(jVarD).booleanValue()) {
                return L(context, new ZipInputStream(jVarD.K3()), str);
            }
            if (!O(jVarD).booleanValue()) {
                return w(gg.c.n(jVarD), str);
            }
            try {
                return u(new GZIPInputStream(jVarD.K3()), str);
            } catch (IOException e11) {
                return new e0<>((Throwable) e11);
            }
        } catch (Resources.NotFoundException e12) {
            return new e0<>((Throwable) e12);
        }
    }

    public static com.airbnb.lottie.r<i> H(Context context, String str) {
        return I(context, str, "url_" + str);
    }

    public static com.airbnb.lottie.r<i> I(final Context context, final String str, final String str2) {
        return l(str2, new Callable() { // from class: tf.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.c(context, str, str2);
            }
        }, null);
    }

    public static com.airbnb.lottie.r<i> J(final Context context, final ZipInputStream zipInputStream, final String str) {
        return l(str, new Callable() { // from class: tf.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.L(context, zipInputStream, str);
            }
        }, new Runnable() { // from class: tf.o
            @Override // java.lang.Runnable
            public final void run() {
                hg.l.c(zipInputStream);
            }
        });
    }

    public static com.airbnb.lottie.r<i> K(ZipInputStream zipInputStream, String str) {
        return J(null, zipInputStream, str);
    }

    public static e0<i> L(Context context, ZipInputStream zipInputStream, String str) {
        return M(context, zipInputStream, str, true);
    }

    public static e0<i> M(Context context, ZipInputStream zipInputStream, String str, boolean z11) {
        try {
            return N(context, zipInputStream, str);
        } finally {
            if (z11) {
                hg.l.c(zipInputStream);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x014b A[Catch: IOException -> 0x02b0, TryCatch #4 {IOException -> 0x02b0, blocks: (B:7:0x0019, B:9:0x001f, B:12:0x0028, B:14:0x0034, B:75:0x017b, B:15:0x0039, B:17:0x0045, B:18:0x004a, B:20:0x0056, B:21:0x006f, B:24:0x0079, B:26:0x0081, B:28:0x0089, B:31:0x0093, B:33:0x009b, B:36:0x00a4, B:37:0x00a9, B:39:0x00bb, B:41:0x00dc, B:70:0x0141, B:72:0x014b, B:73:0x0168, B:69:0x0120, B:74:0x016c, B:5:0x000f, B:42:0x00e5, B:53:0x0106, B:68:0x011f, B:67:0x011c, B:64:0x0117, B:43:0x00ea, B:52:0x0103, B:63:0x0116, B:62:0x0113), top: B:131:0x000f, inners: #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x014b, please report this as an issue */
    private static e0<i> N(Context context, ZipInputStream zipInputStream, String str) {
        i iVarA;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            iVarA = null;
        } else {
            try {
                iVarA = ag.g.b().a(str);
            } catch (IOException e11) {
                return new e0<>((Throwable) e11);
            }
        }
        if (iVarA != null) {
            return new e0<>(iVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        i iVarB = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                iVarB = y(gg.c.n(okio.c0.d(okio.c0.m(zipInputStream))), null, false).b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new e0<>((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i11 = zipInputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i11);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                hg.e.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    hg.e.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th6);
                    Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        hg.e.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile2);
                    nextEntry = zipInputStream.getNextEntry();
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (iVarB == null) {
            return new e0<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            z zVarM = m(iVarB, (String) entry.getKey());
            if (zVarM != null) {
                zVarM.g(hg.l.m((Bitmap) entry.getValue(), zVarM.f(), zVarM.d()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z11 = false;
            for (ag.c cVar : iVarB.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z11 = true;
                }
            }
            if (!z11) {
                hg.e.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, z>> it = iVarB.j().entrySet().iterator();
            while (it.hasNext()) {
                z value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strC = value.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            value.g(hg.l.m(bitmapDecodeByteArray, value.f(), value.d()));
                        }
                    } catch (IllegalArgumentException e12) {
                        hg.e.d("data URL did not have correct base64 format.", e12);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            ag.g.b().c(str, iVarB);
        }
        return new e0<>(iVarB);
    }

    private static Boolean O(okio.j jVar) {
        return R(jVar, f113397d);
    }

    private static boolean P(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean Q(okio.j jVar) {
        return R(jVar, f113396c);
    }

    private static Boolean R(okio.j jVar, byte[] bArr) {
        try {
            okio.j jVarPeek = jVar.peek();
            for (byte b11 : bArr) {
                if (jVarPeek.readByte() != b11) {
                    return Boolean.FALSE;
                }
            }
            jVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e11) {
            hg.e.b("Failed to check zip file header", e11);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static void S(boolean z11) {
        ArrayList arrayList = new ArrayList(f113395b);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((g0) arrayList.get(i11)).a(z11);
        }
    }

    private static String T(Context context, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(P(context) ? "_night_" : "_day_");
        sb2.append(i11);
        return sb2.toString();
    }

    public static /* synthetic */ void b(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map<String, com.airbnb.lottie.r<i>> map = f113394a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            S(true);
        }
    }

    public static /* synthetic */ e0 c(Context context, String str, String str2) {
        e0<i> e0VarC = e.j(context).c(context, str, str2);
        if (str2 != null && e0VarC.b() != null) {
            ag.g.b().c(str2, e0VarC.b());
        }
        return e0VarC;
    }

    public static /* synthetic */ e0 d(WeakReference weakReference, Context context, int i11, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return G(context, i11, str);
    }

    public static /* synthetic */ void k(String str, AtomicBoolean atomicBoolean, i iVar) {
        Map<String, com.airbnb.lottie.r<i>> map = f113394a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            S(true);
        }
    }

    private static com.airbnb.lottie.r<i> l(final String str, Callable<e0<i>> callable, Runnable runnable) {
        i iVarA = str == null ? null : ag.g.b().a(str);
        com.airbnb.lottie.r<i> rVar = iVarA != null ? new com.airbnb.lottie.r<>(iVarA) : null;
        if (str != null) {
            Map<String, com.airbnb.lottie.r<i>> map = f113394a;
            if (map.containsKey(str)) {
                rVar = map.get(str);
            }
        }
        if (rVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return rVar;
        }
        com.airbnb.lottie.r<i> rVar2 = new com.airbnb.lottie.r<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            rVar2.d(new a0() { // from class: tf.s
                @Override // tf.a0
                public final void onResult(Object obj) {
                    u.k(str, atomicBoolean, (i) obj);
                }
            });
            rVar2.c(new a0() { // from class: tf.t
                @Override // tf.a0
                public final void onResult(Object obj) {
                    u.b(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, com.airbnb.lottie.r<i>> map2 = f113394a;
                map2.put(str, rVar2);
                if (map2.size() == 1) {
                    S(false);
                }
            }
        }
        return rVar2;
    }

    private static z m(i iVar, String str) {
        for (z zVar : iVar.j().values()) {
            if (zVar.c().equals(str)) {
                return zVar;
            }
        }
        return null;
    }

    public static com.airbnb.lottie.r<i> n(Context context, String str) {
        return o(context, str, "asset_" + str);
    }

    public static com.airbnb.lottie.r<i> o(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return l(str2, new Callable() { // from class: tf.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.q(applicationContext, str, str2);
            }
        }, null);
    }

    public static e0<i> p(Context context, String str) {
        return q(context, str, "asset_" + str);
    }

    public static e0<i> q(Context context, String str, String str2) {
        i iVarA = str2 == null ? null : ag.g.b().a(str2);
        if (iVarA != null) {
            return new e0<>(iVarA);
        }
        try {
            return s(context, context.getAssets().open(str), str2);
        } catch (IOException e11) {
            return new e0<>((Throwable) e11);
        }
    }

    public static com.airbnb.lottie.r<i> r(Context context, final InputStream inputStream, final String str) {
        final Context applicationContext = context == null ? null : context.getApplicationContext();
        return l(str, new Callable() { // from class: tf.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.s(applicationContext, inputStream, str);
            }
        }, null);
    }

    public static e0<i> s(Context context, InputStream inputStream, String str) {
        i iVarA = str == null ? null : ag.g.b().a(str);
        if (iVarA != null) {
            return new e0<>(iVarA);
        }
        try {
            okio.j jVarD = okio.c0.d(okio.c0.m(inputStream));
            if (Q(jVarD).booleanValue()) {
                return L(context, new ZipInputStream(jVarD.K3()), str);
            }
            return O(jVarD).booleanValue() ? u(new GZIPInputStream(jVarD.K3()), str) : w(gg.c.n(jVarD), str);
        } catch (IOException e11) {
            return new e0<>((Throwable) e11);
        }
    }

    public static com.airbnb.lottie.r<i> t(final InputStream inputStream, final String str) {
        return l(str, new Callable() { // from class: tf.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u.u(inputStream, str);
            }
        }, new Runnable() { // from class: tf.m
            @Override // java.lang.Runnable
            public final void run() {
                hg.l.c(inputStream);
            }
        });
    }

    public static e0<i> u(InputStream inputStream, String str) {
        return v(inputStream, str, true);
    }

    public static e0<i> v(InputStream inputStream, String str, boolean z11) {
        return A(okio.c0.m(inputStream), str, z11);
    }

    public static e0<i> w(gg.c cVar, String str) {
        return x(cVar, str, true);
    }

    public static e0<i> x(gg.c cVar, String str, boolean z11) {
        return y(cVar, str, z11);
    }

    private static e0<i> y(gg.c cVar, String str, boolean z11) {
        try {
            i iVarA = str == null ? null : ag.g.b().a(str);
            if (iVarA != null) {
                return new e0<>(iVarA);
            }
            i iVarA2 = fg.w.a(cVar);
            if (str != null) {
                ag.g.b().c(str, iVarA2);
            }
            return new e0<>(iVarA2);
        } catch (Exception e11) {
            return new e0<>((Throwable) e11);
        } finally {
            if (z11) {
                hg.l.c(cVar);
            }
        }
    }

    public static e0<i> z(r0 r0Var, String str) {
        return A(r0Var, str, true);
    }
}
