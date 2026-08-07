package rz;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
class i extends ClassLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f109279a = d.class.getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f109280b;

    static {
        Class cls = Integer.TYPE;
        f109280b = new Class[]{String.class, byte[].class, cls, cls};
    }

    i(ClassLoader classLoader) {
        super(classLoader);
    }

    Class<?> a(String str, byte[] bArr) {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", f109280b);
            declaredMethod.setAccessible(true);
            return (Class) declaredMethod.invoke(getParent(), str, bArr, 0, Integer.valueOf(bArr.length));
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length);
        }
    }

    @Override // java.lang.ClassLoader
    protected synchronized Class<?> loadClass(String str, boolean z11) {
        if (str.equals(f109279a)) {
            return d.class;
        }
        return super.loadClass(str, z11);
    }
}
