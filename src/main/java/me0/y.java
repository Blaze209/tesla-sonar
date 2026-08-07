package me0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.RemoteViews;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\u0007*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0003R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R2\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d¨\u0006\u001f"}, d2 = {"Lme0/y;", "", "<init>", "()V", "", "widgetId", "size", "Ljn0/h0;", "a", "(II)V", DateTokenConverter.CONVERTER_KEY, "(I)I", "b", "(I)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Landroid/content/Context;)I", "Landroid/widget/RemoteViews;", "viewId", "Landroid/graphics/Bitmap;", "bitmap", "f", "(Landroid/widget/RemoteViews;ILandroid/graphics/Bitmap;I)V", "e", "I", "sizeLimit", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "bitmapMemoryMap", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static int sizeLimit;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f92038a = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static HashMap<Integer, Integer> bitmapMemoryMap = new HashMap<>();

    private y() {
    }

    private final void a(int widgetId, int size) {
        HashMap<Integer, Integer> map = bitmapMemoryMap;
        Integer numValueOf = Integer.valueOf(widgetId);
        Integer num = bitmapMemoryMap.get(Integer.valueOf(widgetId));
        if (num != null) {
            size += num.intValue();
        }
        map.put(numValueOf, Integer.valueOf(size));
    }

    public final void b(int widgetId) {
        bitmapMemoryMap.remove(Integer.valueOf(widgetId));
    }

    public final int c(Context context) {
        int iWidth;
        int iHeight;
        p013kotlin.jvm.internal.s.k(context, "context");
        int i11 = sizeLimit;
        if (i11 != 0) {
            return i11;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = context.getSystemService("window");
            p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
            p013kotlin.jvm.internal.s.j(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            iWidth = currentWindowMetrics.getBounds().width();
            iHeight = currentWindowMetrics.getBounds().height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService2 = context.getSystemService("window");
            p013kotlin.jvm.internal.s.i(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService2).getDefaultDisplay().getMetrics(displayMetrics);
            int i12 = displayMetrics.widthPixels;
            int i13 = displayMetrics.heightPixels;
            iWidth = i12;
            iHeight = i13;
        }
        int i14 = iWidth * iHeight * 6;
        if (ie0.y.f77624a.f()) {
            i14 /= 2;
        }
        sizeLimit = i14;
        return i14;
    }

    public final int d(int widgetId) {
        Integer num = bitmapMemoryMap.get(Integer.valueOf(widgetId));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void e() {
        sizeLimit = 0;
    }

    public final void f(RemoteViews remoteViews, int i11, Bitmap bitmap, int i12) {
        p013kotlin.jvm.internal.s.k(remoteViews, "<this>");
        if (bitmap != null) {
            f92038a.a(i12, bitmap.getAllocationByteCount());
        }
        remoteViews.setImageViewBitmap(i11, bitmap);
    }
}
