package re0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.t0;
import ch.qos.logback.core.CoreConstants;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.tesla.logging.g;
import fc0.u5;
import gc0.u0;
import java.util.HashMap;
import me0.c;
import me0.e;
import me0.z;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0014j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0015`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lre0/b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxc0/a;", "vehicle", "", "strContent", "", Snapshot.WIDTH, "lineHeight", "", "textSize", "tint", "maxLineNumber", "Landroid/graphics/Bitmap;", "a", "(Landroid/content/Context;Lxc0/a;Ljava/lang/String;IIFII)Landroid/graphics/Bitmap;", "Ljava/util/HashMap;", "Landroid/graphics/Typeface;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "typeFaceCache", "Lcom/tesla/logging/g;", "c", "Lcom/tesla/logging/g;", "logger", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f107859a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static HashMap<String, Typeface> typeFaceCache = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final g logger = c.a().p("WidgetTextDrawer");

    private b() {
    }

    public final Bitmap a(Context context, xc0.a vehicle, String strContent, int width, int lineHeight, float textSize, int tint, int maxLineNumber) {
        u0 vehicle_config;
        s.k(context, "context");
        s.k(vehicle, "vehicle");
        s.k(strContent, "strContent");
        u5 vehicle_data = vehicle.getVehicle_data();
        String strJ = z.j(z.f92041a, context, (vehicle_data == null || (vehicle_config = vehicle_data.getVehicle_config()) == null) ? null : vehicle_config.getCar_type(), e.X, null, false, 24, null);
        Typeface typefaceCreateFromAsset = typeFaceCache.get(strJ);
        if (typefaceCreateFromAsset != null) {
            c.a().j("typeface cache used for " + strJ);
        } else {
            typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), strJ);
            typeFaceCache.put(strJ, typefaceCreateFromAsset);
            s.j(typefaceCreateFromAsset, "run(...)");
        }
        int i11 = maxLineNumber * lineHeight;
        c.a().a("drawing text: " + strContent + " with typeface: " + strJ);
        c.a().a("inflated textview width: " + width + " height: " + i11);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(width, i11));
        textView.setText(strContent);
        textView.setMaxLines(maxLineNumber);
        textView.setTextAlignment(2);
        textView.setGravity(16);
        textView.setTypeface(typefaceCreateFromAsset);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(0, textSize);
        textView.setTextColor(tint);
        textView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        int lineCount = textView.getLineCount();
        if (maxLineNumber <= 1 || lineCount >= maxLineNumber) {
            return t0.a(textView, Bitmap.Config.ARGB_8888);
        }
        c.a().j("Redundant line spaces, returning to line number of " + lineCount);
        return a(context, vehicle, strContent, width, lineHeight, textSize, tint, lineCount);
    }
}
