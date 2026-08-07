package qb0;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class b {
    public static String a(Context context) {
        return c.a().e("ACCOUNT_EMAIL", c.g(context));
    }

    public static String b(Context context) {
        return c.a().e("APP_PREVIOUSLY_LAUNCHED", c.b(context));
    }

    public static String c(Context context) {
        return c.a().e("APP_UUID", c.g(context));
    }

    public static String d(Context context) {
        return c.a().e("OWNERAPI_AUTH_TOKEN", c.g(context));
    }

    public static long e(String str, Context context) {
        return c.a().c(str, c.h(context));
    }

    public static String f(Context context) {
        return c.a().e("KEY_STORE_PASS", c.h(context));
    }

    public static Set<String> g(String str, Context context) {
        return c.a().f(str, c.h(context), Collections.EMPTY_SET);
    }

    public static String h(Context context) {
        return c.a().e("SELECTED_PRODUCT", c.g(context));
    }

    public static String i(Context context) {
        return c.a().e("SELECTED_VIN", c.b(context));
    }

    public static String j(Context context) {
        return c.a().e("SHARED_SELECTED_PRODUCT_DATA", c.g(context));
    }

    public static String k(Context context) {
        return c.a().e("COLORIZED_IMAGE_DIRECTORY_HASH", c.b(context));
    }

    public static String l(String str, Context context) {
        return c.a().e(str, c.h(context));
    }

    public static long m(String str, Context context) {
        return c.a().c(str, c.h(context));
    }

    public static Set<String> n(String str, Context context) {
        return c.a().d(str, c.h(context));
    }

    public static long o(long j11, String str, Context context) {
        return c.a().i(str, j11, c.h(context));
    }

    public static void p(String str, Set<String> set, Context context) {
        c.a().k(str, set, c.h(context));
    }

    public static long q(long j11, String str, Context context) {
        return c.a().i(str, j11, c.h(context));
    }

    public static Set<String> r(Set<String> set, String str, Context context) {
        return c.a().j(str, set, c.h(context));
    }
}
