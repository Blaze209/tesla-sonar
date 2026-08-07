package pd0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.core.app.o;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import jn0.t;
import jn0.x;
import nd0.g;
import nd0.h;
import nd0.i;
import nd0.k;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00102\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u00102\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J#\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J#\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0017J%\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u001d\u0010 \u001a\u0004\u0018\u00010\u00152\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\"\u0010\u0017J#\u0010#\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b#\u0010\u0017J\u001d\u0010$\u001a\u0004\u0018\u00010\u00152\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b$\u0010!J\u001f\u0010&\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010'J/\u0010+\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b+\u0010,J'\u00100\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(H\u0002¢\u0006\u0004\b0\u00101J;\u00105\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(042\u0006\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020(2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(H\u0002¢\u0006\u0004\b5\u00106J#\u00107\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b7\u0010\u0017J5\u0010;\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u00010(2\u0006\u00109\u001a\u00020\u00102\b\b\u0002\u0010:\u001a\u00020\u0010H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b?\u0010>JU\u0010C\u001a\u00020B2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00152\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010A\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lpd0/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpd0/c$d;", "Lcom/tesla/notifications/charging/StructuredPayload;", StatusResponse.PAYLOAD, "Landroid/graphics/Bitmap;", "carBitmap", "Landroid/app/PendingIntent;", "contentIntent", "Landroid/widget/RemoteViews;", "b", "(Landroid/content/Context;Lpd0/c$d;Landroid/graphics/Bitmap;Landroid/app/PendingIntent;)Landroid/widget/RemoteViews;", "", "showProgress", "isCybertruck", "c", "(Landroid/content/Context;Lpd0/c$d;Landroid/graphics/Bitmap;ZLandroid/app/PendingIntent;Z)Landroid/widget/RemoteViews;", "", "n", "(Landroid/content/Context;Lpd0/c$d;)Ljava/lang/String;", "s", "(Lpd0/c$d;)Z", "x", "r", "w", "q", "h", "v", "p", "(Lpd0/c$d;)Ljava/lang/String;", "g", "t", "o", "useMetric", "j", "(Landroid/content/Context;Z)Ljava/lang/String;", "", "fallbackResId", "snapshotBitmap", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Ljava/lang/Integer;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "source", "targetWPx", "targetHPx", "u", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "srcW", "srcH", "Lkotlin/Pair;", "m", "(IIII)Lkotlin/Pair;", "f", "etaMinutes", "etaIsToLimit", "etaIsToTrip", "k", "(Landroid/content/Context;Ljava/lang/Integer;ZZ)Ljava/lang/String;", "e", "(Landroid/content/Context;)I", DateTokenConverter.CONVERTER_KEY, "channelId", "largeIconRes", "Landroid/app/Notification;", "a", "(Landroid/content/Context;Ljava/lang/String;Lpd0/c$d;Landroid/app/PendingIntent;Ljava/lang/Integer;Landroid/graphics/Bitmap;Z)Landroid/app/Notification;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f102108a = new a();

    /* JADX INFO: renamed from: pd0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C2163a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102109a;

        static {
            int[] iArr = new int[c.b.values().length];
            try {
                iArr[c.b.CHARGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.b.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.b.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f102109a = iArr;
        }
    }

    private a() {
    }

    private final RemoteViews b(Context context, c.StructuredPayload payload, Bitmap carBitmap, PendingIntent contentIntent) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i.f93860a);
        if (contentIntent != null) {
            remoteViews.setOnClickPendingIntent(h.f93846f, contentIntent);
        }
        remoteViews.setTextViewText(h.f93845e, q(context, payload));
        remoteViews.setTextViewText(h.f93844d, h(context, payload));
        if (carBitmap == null) {
            remoteViews.setViewVisibility(h.f93843c, 8);
            return remoteViews;
        }
        remoteViews.setImageViewBitmap(h.f93843c, carBitmap);
        remoteViews.setViewVisibility(h.f93843c, 0);
        return remoteViews;
    }

    private final RemoteViews c(Context context, c.StructuredPayload payload, Bitmap carBitmap, boolean showProgress, PendingIntent contentIntent, boolean isCybertruck) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i.f93861b);
        if (contentIntent != null) {
            remoteViews.setOnClickPendingIntent(h.f93850j, contentIntent);
        }
        remoteViews.setTextViewText(h.f93842b, h(context, payload));
        String strV = v(context, payload);
        if (strV != null) {
            remoteViews.setTextViewText(h.f93851k, strV);
            remoteViews.setViewVisibility(h.f93851k, 0);
        } else {
            remoteViews.setViewVisibility(h.f93851k, 8);
        }
        if (carBitmap != null) {
            remoteViews.setImageViewBitmap(h.f93841a, carBitmap);
            remoteViews.setViewVisibility(h.f93841a, 0);
        } else {
            remoteViews.setViewVisibility(h.f93841a, 8);
        }
        d.f102144a.a(context, remoteViews, payload, showProgress, isCybertruck);
        String strN = n(context, payload);
        if (strN != null) {
            remoteViews.setTextViewText(h.f93847g, strN);
            remoteViews.setViewVisibility(h.f93847g, 0);
            remoteViews.setViewVisibility(h.f93855o, 8);
            return remoteViews;
        }
        if (payload.getDisplayState() != c.b.CHARGING || payload.getIsStale()) {
            remoteViews.setViewVisibility(h.f93855o, 8);
        } else {
            remoteViews.setViewVisibility(h.f93855o, 0);
            remoteViews.setTextViewText(h.f93852l, f(context, payload));
            remoteViews.setTextViewText(h.f93854n, g(context, payload));
            remoteViews.setTextViewText(h.f93853m, t(context, payload));
        }
        remoteViews.setViewVisibility(h.f93847g, 8);
        return remoteViews;
    }

    private final String f(Context context, c.StructuredPayload payload) {
        int i11 = bc0.a.f16977e;
        Integer numC = payload.getChargeAddedDistance();
        String string = context.getString(i11, Integer.valueOf(numC != null ? numC.intValue() : 0), j(context, payload.getUseMetric()));
        s.j(string, "getString(...)");
        return string;
    }

    private final String g(Context context, c.StructuredPayload payload) {
        Integer numF = payload.getChargeRateDistancePerHour();
        if (numF == null || numF.intValue() <= 0) {
            String string = context.getString(bc0.a.f16999n);
            s.j(string, "getString(...)");
            return string;
        }
        String string2 = context.getString(bc0.a.f16993k, numF, j(context, payload.getUseMetric()));
        s.j(string2, "getString(...)");
        return string2;
    }

    private final String h(Context context, c.StructuredPayload payload) {
        Integer numB = payload.getBatteryRangeDistance();
        if (payload.getShowEnergy() || numB == null || numB.intValue() <= 0) {
            String string = context.getString(bc0.a.f16983g, Integer.valueOf(payload.getBatteryPct()));
            s.h(string);
            return string;
        }
        String string2 = context.getString(bc0.a.f16986h, numB, j(context, payload.getUseMetric()));
        s.h(string2);
        return string2;
    }

    private final Bitmap i(Context context, Integer fallbackResId, Bitmap snapshotBitmap) {
        Drawable drawable;
        int iE = e(context);
        int iD = d(context);
        if (snapshotBitmap != null) {
            return u(snapshotBitmap, iE, iD);
        }
        if (fallbackResId == null || (drawable = androidx.core.content.b.getDrawable(context, fallbackResId.intValue())) == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : iE;
        Integer numValueOf2 = Integer.valueOf(drawable.getIntrinsicHeight());
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        Pair<Integer, Integer> pairM = m(iIntValue, num != null ? num.intValue() : iD, iE, iD);
        return l5.b.b(drawable, pairM.a().intValue(), pairM.b().intValue(), null, 4, null);
    }

    private final String j(Context context, boolean useMetric) {
        if (useMetric) {
            String string = context.getString(bc0.a.K);
            s.j(string, "getString(...)");
            return string;
        }
        String string2 = context.getString(bc0.a.L);
        s.j(string2, "getString(...)");
        return string2;
    }

    private final String k(Context context, Integer etaMinutes, boolean etaIsToLimit, boolean etaIsToTrip) {
        int iIntValue;
        if (etaMinutes == null || (iIntValue = etaMinutes.intValue()) <= 0) {
            return null;
        }
        if (iIntValue >= 1440) {
            return context.getString(etaIsToTrip ? bc0.a.f17005q : bc0.a.f17003p);
        }
        int i11 = iIntValue / 60;
        int i12 = iIntValue % 60;
        if (i11 == 0 && etaIsToTrip) {
            return context.getString(bc0.a.f17023z, Integer.valueOf(i12));
        }
        if (i11 == 0 && etaIsToLimit) {
            return context.getString(bc0.a.f17017w, Integer.valueOf(i12));
        }
        if (i11 == 0) {
            return context.getString(bc0.a.f17011t, Integer.valueOf(i12));
        }
        if (i12 == 0 && etaIsToTrip) {
            return context.getString(bc0.a.f17019x, Integer.valueOf(i11));
        }
        if (i12 == 0 && etaIsToLimit) {
            return context.getString(bc0.a.f17013u, Integer.valueOf(i11));
        }
        if (i12 == 0) {
            return context.getString(bc0.a.f17007r, Integer.valueOf(i11));
        }
        if (etaIsToTrip) {
            return context.getString(bc0.a.f17021y, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return etaIsToLimit ? context.getString(bc0.a.f17015v, Integer.valueOf(i11), Integer.valueOf(i12)) : context.getString(bc0.a.f17009s, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    static /* synthetic */ String l(a aVar, Context context, Integer num, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return aVar.k(context, num, z11, z12);
    }

    private final Pair<Integer, Integer> m(int srcW, int srcH, int targetWPx, int targetHPx) {
        if (srcW <= 0 || srcH <= 0) {
            return x.a(Integer.valueOf(targetWPx), Integer.valueOf(targetHPx));
        }
        float f11 = srcW;
        float f12 = srcH;
        float fMin = Math.min(targetWPx / f11, targetHPx / f12);
        return x.a(Integer.valueOf(n.f((int) (f11 * fMin), 1)), Integer.valueOf(n.f((int) (f12 * fMin), 1)));
    }

    private final String n(Context context, c.StructuredPayload payload) {
        if (payload.getDisplayState() == c.b.ERROR) {
            return context.getString(bc0.a.f17001o);
        }
        if (payload.getDisplayState() == c.b.COMPLETE || payload.getDisplayState() == c.b.STOPPED) {
            return context.getString(bc0.a.f16997m);
        }
        if (s(payload)) {
            return x(context, payload);
        }
        if (r(payload)) {
            return context.getString(bc0.a.f16995l);
        }
        if (payload.getIsStale()) {
            return w(context, payload);
        }
        return null;
    }

    private final String o(c.StructuredPayload payload) {
        Float fM;
        Object objB;
        if (!payload.getIsUsingTeslaSupercharger() || (fM = payload.getPaidSessionKwhRate()) == null) {
            return null;
        }
        float fFloatValue = fM.floatValue();
        String strL = payload.getPaidSessionFeeCurrency();
        if (strL == null) {
            return null;
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(Currency.getInstance(strL));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        Currency currency = (Currency) objB;
        if (currency == null) {
            return null;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        int iF = n.f(currency.getDefaultFractionDigits(), 2);
        currencyInstance.setMaximumFractionDigits(iF);
        currencyInstance.setMinimumFractionDigits(iF);
        return currencyInstance.format(fFloatValue);
    }

    private final String p(c.StructuredPayload payload) {
        Float fK;
        Object objB;
        if (!payload.getIsUsingTeslaSupercharger() || (fK = payload.getPaidSessionFee()) == null) {
            return null;
        }
        float fFloatValue = fK.floatValue();
        String strL = payload.getPaidSessionFeeCurrency();
        if (strL == null) {
            return null;
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(Currency.getInstance(strL));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        Currency currency = (Currency) objB;
        if (currency == null) {
            return null;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(currency.getDefaultFractionDigits());
        currencyInstance.setMinimumFractionDigits(currency.getDefaultFractionDigits());
        return currencyInstance.format(fFloatValue);
    }

    private final String q(Context context, c.StructuredPayload payload) {
        int i11 = C2163a.f102109a[payload.getDisplayState().ordinal()];
        if (i11 == 1) {
            String strL = l(this, context, payload.getMinutesToChargeLimit(), true, false, 8, null);
            if (strL != null) {
                return strL;
            }
            String string = context.getString(bc0.a.E);
            s.j(string, "getString(...)");
            return string;
        }
        if (i11 == 2) {
            String string2 = context.getString(bc0.a.F);
            s.j(string2, "getString(...)");
            return string2;
        }
        if (i11 == 3) {
            String string3 = context.getString(bc0.a.H);
            s.j(string3, "getString(...)");
            return string3;
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = context.getString(bc0.a.G);
        s.j(string4, "getString(...)");
        return string4;
    }

    private final boolean r(c.StructuredPayload payload) {
        Integer numI;
        int iIntValue;
        return payload.getDisplayState() == c.b.CHARGING && (numI = payload.getMinutesToChargeLimit()) != null && 1 <= (iIntValue = numI.intValue()) && iIntValue < 6;
    }

    private final boolean s(c.StructuredPayload payload) {
        return payload.getDisplayState() == c.b.CHARGING && payload.getIsTripPlanChargingSession();
    }

    private final String t(Context context, c.StructuredPayload payload) {
        String strO = o(payload);
        if (strO != null) {
            String string = context.getString(bc0.a.B, strO);
            s.j(string, "getString(...)");
            return string;
        }
        if (payload.getShowEnergy()) {
            int i11 = bc0.a.f16980f;
            Integer numD = payload.getChargeAddedEnergyKwh();
            String string2 = context.getString(i11, Integer.valueOf(numD != null ? numD.intValue() : 0));
            s.h(string2);
            return string2;
        }
        int i12 = bc0.a.f16977e;
        Integer numC = payload.getChargeAddedDistance();
        String string3 = context.getString(i12, Integer.valueOf(numC != null ? numC.intValue() : 0), j(context, payload.getUseMetric()));
        s.h(string3);
        return string3;
    }

    private final Bitmap u(Bitmap source, int targetWPx, int targetHPx) {
        Pair<Integer, Integer> pairM = m(source.getWidth(), source.getHeight(), targetWPx, targetHPx);
        int iIntValue = pairM.a().intValue();
        int iIntValue2 = pairM.b().intValue();
        if (iIntValue == source.getWidth() && iIntValue2 == source.getHeight()) {
            return source;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(source, iIntValue, iIntValue2, true);
        s.j(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }

    private final String v(Context context, c.StructuredPayload payload) {
        String strP = p(payload);
        if (strP != null) {
            return context.getString(bc0.a.A, strP);
        }
        Integer numE = payload.getChargeLimitPct();
        if (numE != null) {
            return payload.getBatteryPct() >= numE.intValue() ? context.getString(bc0.a.f16991j) : context.getString(bc0.a.f16989i, numE);
        }
        return null;
    }

    private final String w(Context context, c.StructuredPayload payload) {
        Long lG = payload.getChargeStateTimestampSec();
        if (lG == null || lG.longValue() <= 0) {
            String string = context.getString(bc0.a.C);
            s.j(string, "getString(...)");
            return string;
        }
        String string2 = context.getString(bc0.a.D, DateFormat.getTimeInstance(3).format(new Date(lG.longValue() * 1000)));
        s.j(string2, "getString(...)");
        return string2;
    }

    private final String x(Context context, c.StructuredPayload payload) {
        if (!payload.getIsTripPlanCharging()) {
            String string = context.getString(bc0.a.I);
            s.j(string, "getString(...)");
            return string;
        }
        String strK = k(context, payload.getMinutesToFullCharge(), false, true);
        if (strK != null) {
            return strK;
        }
        String string2 = context.getString(bc0.a.E);
        s.j(string2, "getString(...)");
        return string2;
    }

    public final Notification a(Context context, String channelId, c.StructuredPayload payload, PendingIntent contentIntent, Integer largeIconRes, Bitmap snapshotBitmap, boolean isCybertruck) {
        s.k(context, "context");
        s.k(channelId, "channelId");
        s.k(payload, "payload");
        c.b bVarH = payload.getDisplayState();
        c.b bVar = c.b.CHARGING;
        boolean z11 = bVarH == bVar || payload.getDisplayState() == c.b.COMPLETE || payload.getDisplayState() == c.b.ERROR || payload.getDisplayState() == c.b.STOPPED;
        Bitmap bitmapI = i(context, largeIconRes, snapshotBitmap);
        RemoteViews remoteViewsC = c(context, payload, bitmapI, z11, contentIntent, isCybertruck);
        RemoteViews remoteViewsB = b(context, payload, bitmapI, contentIntent);
        boolean z12 = payload.getDisplayState() == bVar || payload.getDisplayState() == c.b.ERROR;
        o.e eVarG = new o.e(context, channelId).D(g.f93834a).i(k.INSTANCE.c()).m(q(context, payload)).l(h(context, payload)).o(remoteViewsB).n(remoteViewsC).F(new o.g()).G(q(context, payload)).A(1).y(z12).f(!z12).z(true).C(false).K(1).g(ReactProgressBarViewManager.PROP_PROGRESS);
        s.j(eVarG, "setCategory(...)");
        if (contentIntent != null) {
            eVarG.k(contentIntent);
        }
        Notification notificationC = eVarG.c();
        s.j(notificationC, "build(...)");
        return notificationC;
    }

    public final int d(Context context) {
        s.k(context, "context");
        return context.getResources().getDimensionPixelSize(nd0.f.f93832a);
    }

    public final int e(Context context) {
        s.k(context, "context");
        return context.getResources().getDimensionPixelSize(nd0.f.f93833b);
    }
}
