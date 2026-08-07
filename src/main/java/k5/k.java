package k5;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Class<?> f84945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Constructor<?> f84946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final Method f84947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final Method f84948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final Method f84949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final Method f84950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Method f84951m;

    public k() {
        Class<?> clsW;
        Constructor<?> constructorX;
        Method methodT;
        Method methodU;
        Method methodY;
        Method methodS;
        Method methodV;
        try {
            clsW = w();
            constructorX = x(clsW);
            methodT = t(clsW);
            methodU = u(clsW);
            methodY = y(clsW);
            methodS = s(clsW);
            methodV = v(clsW);
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e11.getClass().getName(), e11);
            clsW = null;
            constructorX = null;
            methodT = null;
            methodU = null;
            methodY = null;
            methodS = null;
            methodV = null;
        }
        this.f84945g = clsW;
        this.f84946h = constructorX;
        this.f84947i = methodT;
        this.f84948j = methodU;
        this.f84949k = methodY;
        this.f84950l = methodS;
        this.f84951m = methodV;
    }

    private Object m() {
        try {
            return this.f84946h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void n(Object obj) {
        try {
            this.f84950l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean o(Context context, Object obj, String str, int i11, int i12, int i13, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f84947i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj, ByteBuffer byteBuffer, int i11, int i12, int i13) {
        try {
            return ((Boolean) this.f84948j.invoke(obj, byteBuffer, Integer.valueOf(i11), null, Integer.valueOf(i12), Integer.valueOf(i13))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q(Object obj) {
        try {
            return ((Boolean) this.f84949k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r() {
        if (this.f84947i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f84947i != null;
    }

    @Override // k5.i, k5.n
    public Typeface a(Context context, j5.e.c cVar, Resources resources, int i11) {
        if (!r()) {
            return super.a(context, cVar, resources, i11);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        j5.e.d[] dVarArrA = cVar.a();
        int length = dVarArrA.length;
        int i12 = 0;
        while (i12 < length) {
            j5.e.d dVar = dVarArrA[i12];
            Context context2 = context;
            if (!o(context2, objM, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                n(objM);
                return null;
            }
            i12++;
            context = context2;
        }
        if (q(objM)) {
            return j(objM);
        }
        return null;
    }

    @Override // k5.i, k5.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, r5.g.b[] bVarArr, int i11) {
        Typeface typefaceJ;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!r()) {
            r5.g.b bVarH = h(bVarArr, i11);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarH.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarH.e()).setItalic(bVarH.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapH = o.h(context, bVarArr, cancellationSignal);
        Object objM = m();
        if (objM == null) {
            return null;
        }
        int length = bVarArr.length;
        int i12 = 0;
        boolean z11 = false;
        while (i12 < length) {
            r5.g.b bVar = bVarArr[i12];
            ByteBuffer byteBuffer = mapH.get(bVar.d());
            if (byteBuffer == null) {
                obj = objM;
            } else {
                boolean zP = p(objM, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0);
                obj = objM;
                if (!zP) {
                    n(obj);
                    return null;
                }
                z11 = true;
            }
            i12++;
            objM = obj;
            z11 = z11;
        }
        Object obj2 = objM;
        if (!z11) {
            n(obj2);
            return null;
        }
        if (q(obj2) && (typefaceJ = j(obj2)) != null) {
            return Typeface.create(typefaceJ, i11);
        }
        return null;
    }

    @Override // k5.n
    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i11) {
        return super.c(context, cancellationSignal, list, i11);
    }

    @Override // k5.n
    public Typeface e(Context context, Resources resources, int i11, String str, int i12) {
        if (!r()) {
            return super.e(context, resources, i11, str, i12);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        if (!o(context, objM, str, 0, -1, -1, null)) {
            n(objM);
            return null;
        }
        if (q(objM)) {
            return j(objM);
        }
        return null;
    }

    protected Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f84945g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f84951m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method s(Class<?> cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method t(Class<?> cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    protected Method u(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> w() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> x(Class<?> cls) {
        return cls.getConstructor(null);
    }

    protected Method y(Class<?> cls) {
        return cls.getMethod("freeze", null);
    }
}
