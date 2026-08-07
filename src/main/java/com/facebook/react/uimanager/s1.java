package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class, Map<String, m>> f23368a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, m> f23369b = new HashMap();

    class a extends ThreadLocal<Object[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f23370a;

        a(int i11) {
            this.f23370a = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] initialValue() {
            return new Object[this.f23370a];
        }
    }

    private static class b extends m {
        public b(no.a aVar, Method method) {
            super(aVar, "Array", method);
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    private static class c extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f23371i;

        public c(no.a aVar, Method method, boolean z11) {
            super(aVar, InquiryField.BooleanField.TYPE, method);
            this.f23371i = z11;
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            return obj == null ? this.f23371i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    private static class d extends m {
        public d(no.a aVar, Method method) {
            super(aVar, InquiryField.BooleanField.TYPE, method);
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    private static class e extends m {
        public e(no.a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ColorPropConverter.getColor(obj, context);
            }
            return null;
        }

        public e(no.b bVar, Method method, int i11) {
            super(bVar, "mixed", method, i11);
        }
    }

    private static class f extends m {
        public f(no.a aVar, Method method) {
            super(aVar, InquiryField.FloatField.TYPE2, method);
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
            }
            return null;
        }

        public f(no.b bVar, Method method, int i11) {
            super(bVar, InquiryField.FloatField.TYPE2, method, i11);
        }
    }

    private static class i extends m {
        public i(no.a aVar, Method method) {
            super(aVar, "mixed", method);
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }

        public i(no.b bVar, Method method, int i11) {
            super(bVar, "mixed", method, i11);
        }
    }

    private static class l extends m {
        public l(no.a aVar, Method method) {
            super(aVar, "Map", method);
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    private static class n extends m {
        public n(no.a aVar, Method method) {
            super(aVar, "String", method);
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            return (String) obj;
        }
    }

    public static void b() {
        f23368a.clear();
        f23369b.clear();
    }

    private static m c(no.a aVar, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new i(aVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new c(aVar, method, aVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return "Color".equals(aVar.customType()) ? new g(aVar, method, aVar.defaultInt()) : new k(aVar, method, aVar.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new j(aVar, method, aVar.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new h(aVar, method, aVar.defaultDouble());
        }
        if (cls == String.class) {
            return new n(aVar, method);
        }
        if (cls == Boolean.class) {
            return new d(aVar, method);
        }
        if (cls == Integer.class) {
            return "Color".equals(aVar.customType()) ? new e(aVar, method) : new f(aVar, method);
        }
        if (cls == ReadableArray.class) {
            return new b(aVar, method);
        }
        if (cls == ReadableMap.class) {
            return new l(aVar, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    private static void d(no.b bVar, Method method, Class<?> cls, Map<String, m> map) {
        String[] strArrNames = bVar.names();
        int i11 = 0;
        if (cls == Dynamic.class) {
            while (i11 < strArrNames.length) {
                map.put(strArrNames[i11], new i(bVar, method, i11));
                i11++;
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i11 < strArrNames.length) {
                if ("Color".equals(bVar.customType())) {
                    map.put(strArrNames[i11], new g(bVar, method, i11, bVar.defaultInt()));
                } else {
                    map.put(strArrNames[i11], new k(bVar, method, i11, bVar.defaultInt()));
                }
                i11++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i11 < strArrNames.length) {
                map.put(strArrNames[i11], new j(bVar, method, i11, bVar.defaultFloat()));
                i11++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            for (int i12 = 0; i12 < strArrNames.length; i12++) {
                map.put(strArrNames[i12], new h(bVar, method, i12, bVar.defaultDouble()));
            }
            return;
        }
        if (cls == Integer.class) {
            while (i11 < strArrNames.length) {
                if ("Color".equals(bVar.customType())) {
                    map.put(strArrNames[i11], new e(bVar, method, i11));
                } else {
                    map.put(strArrNames[i11], new f(bVar, method, i11));
                }
                i11++;
            }
            return;
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThreadLocal<Object[]> e(int i11) {
        if (i11 <= 0) {
            return null;
        }
        return new a(i11);
    }

    private static void f(Class<? extends i0> cls, Map<String, m> map) {
        for (Method method : cls.getDeclaredMethods()) {
            no.a aVar = (no.a) method.getAnnotation(no.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(aVar.name(), c(aVar, method, parameterTypes[0]));
            }
            no.b bVar = (no.b) method.getAnnotation(no.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                d(bVar, method, parameterTypes2[1], map);
            }
        }
    }

    private static void g(Class<? extends ViewManager> cls, Map<String, m> map) {
        for (Method method : cls.getDeclaredMethods()) {
            no.a aVar = (no.a) method.getAnnotation(no.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                map.put(aVar.name(), c(aVar, method, parameterTypes[1]));
            }
            no.b bVar = (no.b) method.getAnnotation(no.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                d(bVar, method, parameterTypes2[2], map);
            }
        }
    }

    static Map<String, m> h(Class<? extends i0> cls) {
        if (cls == null) {
            return f23369b;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == i0.class) {
                return f23369b;
            }
        }
        Map<Class, Map<String, m>> map = f23368a;
        Map<String, m> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(h(cls.getSuperclass()));
        f(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    static Map<String, m> i(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return f23369b;
        }
        Map<Class, Map<String, m>> map = f23368a;
        Map<String, m> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(i(cls.getSuperclass()));
        g(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    private static class g extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f23372i;

        public g(no.a aVar, Method method, int i11) {
            super(aVar, "mixed", method);
            this.f23372i = i11;
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            return obj == null ? Integer.valueOf(this.f23372i) : ColorPropConverter.getColor(obj, context);
        }

        public g(no.b bVar, Method method, int i11, int i12) {
            super(bVar, "mixed", method, i11);
            this.f23372i = i12;
        }
    }

    private static class h extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final double f23373i;

        public h(no.a aVar, Method method, double d11) {
            super(aVar, InquiryField.FloatField.TYPE2, method);
            this.f23373i = d11;
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.f23373i : ((Double) obj).doubleValue());
        }

        public h(no.b bVar, Method method, int i11, double d11) {
            super(bVar, InquiryField.FloatField.TYPE2, method, i11);
            this.f23373i = d11;
        }
    }

    private static class j extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f23374i;

        public j(no.a aVar, Method method, float f11) {
            super(aVar, InquiryField.FloatField.TYPE2, method);
            this.f23374i = f11;
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.f23374i : ((Double) obj).floatValue());
        }

        public j(no.b bVar, Method method, int i11, float f11) {
            super(bVar, InquiryField.FloatField.TYPE2, method, i11);
            this.f23374i = f11;
        }
    }

    private static class k extends m {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f23375i;

        public k(no.a aVar, Method method, int i11) {
            super(aVar, InquiryField.FloatField.TYPE2, method);
            this.f23375i = i11;
        }

        @Override // com.facebook.react.uimanager.s1.m
        protected Object c(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.f23375i : ((Double) obj).intValue());
        }

        public k(no.b bVar, Method method, int i11, int i12) {
            super(bVar, InquiryField.FloatField.TYPE2, method, i11);
            this.f23375i = i12;
        }
    }

    static abstract class m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ThreadLocal<Object[]> f23376e = s1.e(2);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ThreadLocal<Object[]> f23377f = s1.e(3);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final ThreadLocal<Object[]> f23378g = s1.e(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final ThreadLocal<Object[]> f23379h = s1.e(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final String f23380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final String f23381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Method f23382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final Integer f23383d;

        public String a() {
            return this.f23380a;
        }

        public String b() {
            return this.f23381b;
        }

        protected abstract Object c(Object obj, Context context);

        public void d(i0 i0Var, Object obj) {
            Object[] objArr;
            try {
                if (this.f23383d == null) {
                    objArr = f23378g.get();
                    objArr[0] = c(obj, i0Var.getThemedContext());
                } else {
                    objArr = f23379h.get();
                    objArr[0] = this.f23383d;
                    objArr[1] = c(obj, i0Var.getThemedContext());
                }
                this.f23382c.invoke(i0Var, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th2) {
                qk.a.j(ViewManager.class, "Error while updating prop " + this.f23380a, th2);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f23380a + "' in shadow node of type: " + i0Var.getViewClass(), th2);
            }
        }

        public void e(ViewManager viewManager, View view, Object obj) {
            Object[] objArr;
            try {
                if (this.f23383d == null) {
                    objArr = f23376e.get();
                    objArr[0] = view;
                    objArr[1] = c(obj, view.getContext());
                } else {
                    objArr = f23377f.get();
                    objArr[0] = view;
                    objArr[1] = this.f23383d;
                    objArr[2] = c(obj, view.getContext());
                }
                this.f23382c.invoke(viewManager, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th2) {
                qk.a.j(ViewManager.class, "Error while updating prop " + this.f23380a, th2);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f23380a + "' of a view managed by: " + viewManager.getName(), th2);
            }
        }

        private m(no.a aVar, String str, Method method) {
            this.f23380a = aVar.name();
            this.f23381b = "__default_type__".equals(aVar.customType()) ? str : aVar.customType();
            this.f23382c = method;
            this.f23383d = null;
        }

        private m(no.b bVar, String str, Method method, int i11) {
            this.f23380a = bVar.names()[i11];
            this.f23381b = "__default_type__".equals(bVar.customType()) ? str : bVar.customType();
            this.f23382c = method;
            this.f23383d = Integer.valueOf(i11);
        }
    }
}
