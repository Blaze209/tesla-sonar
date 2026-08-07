package di;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class o {
    public static String a() {
        return jh.a.f83724b;
    }

    public static String b(Context context) {
        if (kg.b.b()) {
            return "https://mobilegw.alipaydev.com/mgw.htm";
        }
        if (kg.b.a()) {
            return "https://mobilegw.dl.alipaydev.com/mgw.htm";
        }
        if (context == null) {
            return jh.a.f83723a;
        }
        String str = jh.a.f83723a;
        return TextUtils.isEmpty(str) ? jh.a.f83723a : str;
    }
}
