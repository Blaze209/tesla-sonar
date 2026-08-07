package u4;

import bo0.j;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import p020r2.l;

/* JADX INFO: loaded from: classes.dex */
@e
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\t\u001a\u00020\b2\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\"\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J?\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lu4/a;", "", "<init>", "()V", "", "Ljava/lang/Class;", "composableMethodTypes", "previewParameterTypes", "", "a", "([Ljava/lang/Class;[Ljava/lang/Class;)Z", "Ljava/lang/reflect/Method;", "", "methodName", "args", DateTokenConverter.CONVERTER_KEY, "([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "previewParamArgs", "e", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;", "f", "(Ljava/lang/Class;)Ljava/lang/Object;", "instance", "Lr2/l;", "composer", "h", "(Ljava/lang/reflect/Method;Ljava/lang/Object;Lr2/l;[Ljava/lang/Object;)Ljava/lang/Object;", "", "realValueParams", "thisParams", "b", "(II)I", "c", "(I)I", "className", "Ljn0/h0;", "g", "(Ljava/lang/String;Ljava/lang/String;Lr2/l;[Ljava/lang/Object;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f115362a = new a();

    private a() {
    }

    private final boolean a(Class<?>[] composableMethodTypes, Class<?>[] previewParameterTypes) {
        if (composableMethodTypes.length == previewParameterTypes.length) {
            ArrayList arrayList = new ArrayList(composableMethodTypes.length);
            int length = composableMethodTypes.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                boolean z11 = true;
                if (i11 >= length) {
                    break;
                }
                Class<?> cls = composableMethodTypes[i11];
                int i13 = i12 + 1;
                Class<?> cls2 = previewParameterTypes[i12];
                if (!s.f(vn0.a.e(cls), vn0.a.e(cls2)) && !cls.isAssignableFrom(cls2)) {
                    z11 = false;
                }
                arrayList.add(Boolean.valueOf(z11));
                i11++;
                i12 = i13;
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final int b(int realValueParams, int thisParams) {
        if (realValueParams == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (realValueParams + thisParams)) / 10.0d);
    }

    private final int c(int realValueParams) {
        return (int) Math.ceil(((double) realValueParams) / 31.0d);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    private final Method d(Method[] methodArr, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        int i11 = 0;
        while (true) {
            method = null;
            if (i11 >= length) {
                break;
            }
            Method method2 = methodArr[i11];
            if (!s.f(str, method2.getName())) {
                if (!t.b0(method2.getName(), str + CoreConstants.DASH_CHAR, false, 2, null)) {
                    continue;
                } else if (f115362a.a(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                    method = method2;
                    break;
                }
            } else if (f115362a.a(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                method = method2;
                break;
            }
            i11++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    private final Method e(Class<?> cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i11++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int iB = b(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                j jVarW = n.w(0, iB);
                ArrayList arrayList2 = new ArrayList(v.y(jVarW, 10));
                Iterator<Integer> it = jVarW.iterator();
                while (it.hasNext()) {
                    ((s0) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                p013kotlin.jvm.internal.s0 s0Var = new p013kotlin.jvm.internal.s0(3);
                s0Var.b(clsArr);
                s0Var.a(l.class);
                s0Var.b(clsArr2);
                return d(declaredMethods, str, (Class[]) s0Var.d(new Class[s0Var.c()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!s.f(method.getName(), str)) {
                    if (!t.b0(method.getName(), str + CoreConstants.DASH_CHAR, false, 2, null)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    private final Object f(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                return !name.equals("int") ? null : 0;
            case 3039496:
                return !name.equals("byte") ? null : (byte) 0;
            case 3052374:
                return !name.equals("char") ? null : (char) 0;
            case 3327612:
                return !name.equals("long") ? null : 0L;
            case 64711720:
                if (name.equals(InquiryField.BooleanField.TYPE)) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals(InquiryField.FloatField.TYPE)) {
                    return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                }
                return null;
            case 109413500:
                return !name.equals("short") ? null : (short) 0;
            default:
                return null;
        }
    }

    private final Object h(Method method, Object obj, l lVar, Object... objArr) {
        Object objF;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i11 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (s.f(parameterTypes[length], l.class)) {
                    i11 = length;
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length = i12;
            }
        }
        int i13 = i11 + 1;
        int iB = b(i11, obj != null ? 1 : 0) + i13;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iB ? c(i11) : 0) + iB != length2) {
            throw new IllegalStateException("params don't add up to total params");
        }
        Object[] objArr2 = new Object[length2];
        int i14 = 0;
        while (i14 < length2) {
            if (i14 >= 0 && i14 < i11) {
                objF = (i14 < 0 || i14 > p013kotlin.collections.n.u0(objArr)) ? f115362a.f(method.getParameterTypes()[i14]) : objArr[i14];
            } else if (i14 == i11) {
                objF = lVar;
            } else if (i13 <= i14 && i14 < iB) {
                objF = 0;
            } else {
                if (iB > i14 || i14 >= length2) {
                    throw new IllegalStateException("Unexpected index");
                }
                objF = 2097151;
            }
            objArr2[i14] = objF;
            i14++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public final void g(String className, String methodName, l composer, Object... args) throws Exception {
        try {
            Class<?> cls = Class.forName(className);
            Method methodE = e(cls, methodName, Arrays.copyOf(args, args.length));
            if (methodE != null) {
                methodE.setAccessible(true);
                if (Modifier.isStatic(methodE.getModifiers())) {
                    h(methodE, null, composer, Arrays.copyOf(args, args.length));
                    return;
                } else {
                    h(methodE, cls.getConstructor(null).newInstance(null), composer, Arrays.copyOf(args, args.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + className + CoreConstants.DOT + methodName + " not found");
        } catch (Exception e11) {
            c.Companion.c(c.INSTANCE, "Failed to invoke Composable Method '" + className + CoreConstants.DOT + methodName + CoreConstants.SINGLE_QUOTE_CHAR, null, 2, null);
            throw e11;
        }
    }
}
