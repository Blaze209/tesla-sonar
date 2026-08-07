package androidx.versionedparcelable;

import android.os.Parcelable;
import fb.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f14295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f14296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final androidx.collection.a<String, Class> f14297c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        this.f14295a = aVar;
        this.f14296b = aVar2;
        this.f14297c = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(b bVar) {
        try {
            I(c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e11);
        }
    }

    private Class c(Class<? extends b> cls) throws ClassNotFoundException {
        Class cls2 = this.f14297c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f14297c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws NoSuchMethodException {
        Method method = this.f14295a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f14295a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = this.f14296b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f14296b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i11) {
        w(i11);
        A(bArr);
    }

    protected abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i11) {
        w(i11);
        C(charSequence);
    }

    protected abstract void E(int i11);

    public void F(int i11, int i12) {
        w(i12);
        E(i11);
    }

    protected abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i11) {
        w(i11);
        G(parcelable);
    }

    protected abstract void I(String str);

    public void J(String str, int i11) {
        w(i11);
        I(str);
    }

    protected <T extends b> void K(T t11, VersionedParcel versionedParcel) {
        try {
            e(t11.getClass()).invoke(null, t11, versionedParcel);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (InvocationTargetException e14) {
            if (!(e14.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e14);
            }
            throw ((RuntimeException) e14.getCause());
        }
    }

    protected void L(b bVar) {
        if (bVar == null) {
            I(null);
            return;
        }
        N(bVar);
        VersionedParcel versionedParcelB = b();
        K(bVar, versionedParcelB);
        versionedParcelB.a();
    }

    public void M(b bVar, int i11) {
        w(i11);
        L(bVar);
    }

    protected abstract void a();

    protected abstract VersionedParcel b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    public boolean h(boolean z11, int i11) {
        return !m(i11) ? z11 : g();
    }

    protected abstract byte[] i();

    public byte[] j(byte[] bArr, int i11) {
        return !m(i11) ? bArr : i();
    }

    protected abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i11) {
        return !m(i11) ? charSequence : k();
    }

    protected abstract boolean m(int i11);

    protected <T extends b> T n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (InvocationTargetException e14) {
            if (e14.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e14.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e14);
        }
    }

    protected abstract int o();

    public int p(int i11, int i12) {
        return !m(i12) ? i11 : o();
    }

    protected abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t11, int i11) {
        return !m(i11) ? t11 : (T) q();
    }

    protected abstract String s();

    public String t(String str, int i11) {
        return !m(i11) ? str : s();
    }

    protected <T extends b> T u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return (T) n(strS, b());
    }

    public <T extends b> T v(T t11, int i11) {
        return !m(i11) ? t11 : (T) u();
    }

    protected abstract void w(int i11);

    public void x(boolean z11, boolean z12) {
    }

    protected abstract void y(boolean z11);

    public void z(boolean z11, int i11) {
        w(i11);
        y(z11);
    }
}
