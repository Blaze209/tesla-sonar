package com.henninghall.date_picker;

import android.widget.LinearLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.v0;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static i a(v0 v0Var) {
        return new i(new LinearLayout.LayoutParams(-1, -1));
    }

    public static Map<String, Integer> b() {
        return jn.c.d("scroll", 1);
    }

    private static no.b c(String str, Class<? extends DatePickerManager> cls) {
        Method method = null;
        for (Method method2 : cls.getMethods()) {
            if (method2.getName().equals(str)) {
                method = method2;
            }
        }
        return (no.b) method.getAnnotation(no.b.class);
    }

    protected static void d(i iVar) {
        try {
            iVar.c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static void e(i iVar, int i11, ReadableArray readableArray) {
        if (i11 == 1) {
            iVar.b(readableArray.getInt(0), readableArray.getInt(1));
        }
    }

    public static void f(i iVar, int i11, Dynamic dynamic, Class<? extends DatePickerManager> cls) {
        h("setProps", iVar, i11, dynamic, cls);
    }

    public static void g(i iVar, int i11, Dynamic dynamic, Class<? extends DatePickerManager> cls) {
        h("setStyle", iVar, i11, dynamic, cls);
    }

    public static void h(String str, i iVar, int i11, Dynamic dynamic, Class<? extends DatePickerManager> cls) {
        iVar.d(c(str, cls).names()[i11], dynamic);
    }
}
