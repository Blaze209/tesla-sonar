package com.google.gson.internal.bind;

import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class d<T extends Enum<T>> extends x<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final y f44885d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, T> f44886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, T> f44887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<T, String> f44888c;

    class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            a aVar2 = null;
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new d(rawType, aVar2);
        }
    }

    /* synthetic */ d(Class cls, a aVar) {
        this(cls);
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T b(ex.a aVar) throws IOException {
        if (aVar.n0() == ex.b.NULL) {
            aVar.c0();
            return null;
        }
        String strO = aVar.O();
        T t11 = this.f44886a.get(strO);
        return t11 == null ? this.f44887b.get(strO) : t11;
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ex.c cVar, T t11) throws IOException {
        cVar.O0(t11 == null ? null : this.f44888c.get(t11));
    }

    private d(Class<T> cls) {
        this.f44886a = new HashMap();
        this.f44887b = new HashMap();
        this.f44888c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i11 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i11] = field;
                    i11++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i11);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r11 = (Enum) field2.get(null);
                String strName = r11.name();
                String string = r11.toString();
                ax.c cVar = (ax.c) field2.getAnnotation(ax.c.class);
                if (cVar != null) {
                    strName = cVar.value();
                    for (String str : cVar.alternate()) {
                        this.f44886a.put(str, (T) r11);
                    }
                }
                this.f44886a.put(strName, (T) r11);
                this.f44887b.put(string, (T) r11);
                this.f44888c.put((T) r11, strName);
            }
        } catch (IllegalAccessException e11) {
            throw new AssertionError(e11);
        }
    }
}
