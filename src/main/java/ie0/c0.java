package ie0;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "", "c", "(Landroid/content/Context;)Z", "a", "b", DateTokenConverter.CONVERTER_KEY, "utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c0 {
    public static final boolean a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        return Build.VERSION.SDK_INT < 31 || androidx.core.content.b.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    public static final boolean b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        return c(context) && a(context);
    }

    public static final boolean c(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        return Build.VERSION.SDK_INT < 31 || androidx.core.content.b.checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN") == 0;
    }

    public static final boolean d(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        return Build.VERSION.SDK_INT >= 31 && androidx.core.content.b.checkSelfPermission(context, "android.permission.UWB_RANGING") == 0;
    }
}
