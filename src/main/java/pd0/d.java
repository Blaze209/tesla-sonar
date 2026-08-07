package pd0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import j5.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpd0/d;", "", "<init>", "()V", "Lpd0/c$d;", StatusResponse.PAYLOAD, "", DateTokenConverter.CONVERTER_KEY, "(Lpd0/c$d;)I", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Bitmap;", "c", "(Landroid/content/Context;Lpd0/c$d;)Landroid/graphics/Bitmap;", "b", "Landroid/widget/RemoteViews;", "view", "", "showProgress", "isCybertruck", "Ljn0/h0;", "a", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lpd0/c$d;ZZ)V", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f102144a = new d();

    private d() {
    }

    private final Bitmap b(Context context, c.StructuredPayload payload) {
        float f11 = context.getResources().getDisplayMetrics().density;
        int i11 = (int) (360 * f11);
        int i12 = (int) (12 * f11);
        Resources resources = context.getResources();
        int iD = h.d(resources, d(payload), null);
        int iD2 = h.d(resources, nd0.e.f93830e, null);
        int iD3 = h.d(resources, nd0.e.f93826a, null);
        int iF = n.f(40, 10);
        Integer chargeLimitPct = payload.getChargeLimitPct();
        return e.f102145a.a(i11, i12, payload.getBatteryPct(), n.n(chargeLimitPct != null ? chargeLimitPct.intValue() : 100, payload.getBatteryPct(), 100), iD, iD2, iD3, iF);
    }

    private final Bitmap c(Context context, c.StructuredPayload payload) {
        float f11 = context.getResources().getDisplayMetrics().density;
        int i11 = (int) (360 * f11);
        int i12 = (int) (10 * f11);
        Resources resources = context.getResources();
        int iD = h.d(resources, d(payload), null);
        int iD2 = h.d(resources, nd0.e.f93830e, null);
        int iD3 = h.d(resources, nd0.e.f93826a, null);
        Integer chargeLimitPct = payload.getChargeLimitPct();
        return f.f102146a.a(i11, i12, f11, payload.getBatteryPct(), n.n(chargeLimitPct != null ? chargeLimitPct.intValue() : 100, payload.getBatteryPct(), 100), iD, iD2, iD3);
    }

    private final int d(c.StructuredPayload payload) {
        if (payload.getIsStale()) {
            return nd0.e.f93831f;
        }
        if (payload.getDisplayState() == c.b.ERROR) {
            return nd0.e.f93831f;
        }
        if (payload.getDisplayState() == c.b.STOPPED) {
            return nd0.e.f93831f;
        }
        if (payload.getBatteryPct() < 7) {
            return nd0.e.f93828c;
        }
        return payload.getBatteryPct() < 20 ? nd0.e.f93829d : nd0.e.f93827b;
    }

    public final void a(Context context, RemoteViews view, c.StructuredPayload payload, boolean showProgress, boolean isCybertruck) {
        s.k(context, "context");
        s.k(view, "view");
        s.k(payload, "payload");
        if (!showProgress) {
            view.setViewVisibility(nd0.h.f93849i, 8);
        } else {
            view.setImageViewBitmap(nd0.h.f93848h, isCybertruck ? b(context, payload) : c(context, payload));
            view.setViewVisibility(nd0.h.f93848h, 0);
        }
    }
}
