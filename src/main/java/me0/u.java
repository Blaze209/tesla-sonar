package me0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.widget.RemoteViews;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import fc0.u5;
import gc0.u0;
import java.util.HashMap;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0015\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0010\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J9\u0010\u0015\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0011R2\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018j\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001f¨\u0006!"}, d2 = {"Lme0/u;", "", "<init>", "()V", "Landroid/widget/RemoteViews;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxc0/a;", "vehicle", "Ljn0/h0;", "a", "(Landroid/widget/RemoteViews;Landroid/content/Context;Lxc0/a;)V", "Lme0/a0;", "widgetType", "", "widgetId", "e", "(Landroid/widget/RemoteViews;Landroid/content/Context;Lxc0/a;Lme0/a0;I)V", "b", "", "content", "c", "(Landroid/widget/RemoteViews;Landroid/content/Context;Lxc0/a;Ljava/lang/String;Lme0/a0;I)V", "f", "Ljava/util/HashMap;", "Lme0/u$b;", "Landroid/graphics/Bitmap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "textImageCache", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f92021a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static HashMap<b, Bitmap> textImageCache = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = me0.c.a().p("WidgetThemeManager");

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92024a;

        static {
            int[] iArr = new int[a0.values().length];
            try {
                iArr[a0.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a0.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f92024a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lme0/u$b;", "", "Lme0/u$c;", "textType", "Lme0/a0;", "widgetType", "", "content", "", "tint", "themeId", "<init>", "(Lme0/u$c;Lme0/a0;Ljava/lang/String;II)V", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lme0/u$c;", "b", "Lme0/a0;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "I", "e", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c textType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a0 widgetType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int tint;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int themeId;

        public b(c textType, a0 widgetType, String content, int i11, int i12) {
            p013kotlin.jvm.internal.s.k(textType, "textType");
            p013kotlin.jvm.internal.s.k(widgetType, "widgetType");
            p013kotlin.jvm.internal.s.k(content, "content");
            this.textType = textType;
            this.widgetType = widgetType;
            this.content = content;
            this.tint = i11;
            this.themeId = i12;
        }

        public boolean equals(Object other) {
            b bVar = other instanceof b ? (b) other : null;
            return bVar != null && this.widgetType == bVar.widgetType && this.themeId == bVar.themeId && this.tint == bVar.tint && this.textType == bVar.textType && p013kotlin.jvm.internal.s.f(this.content, bVar.content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lme0/u$c;", "", "<init>", "(Ljava/lang/String;I)V", "VEHICLE_NAME", "VEHICLE_NAME_SENTRY_OFF", "VEHICLE_NAME_SENTRY_ON", "SERVICE_MODE_LABEL", "BATTERY_RANGE", "CHARGE_TIME_LOCATION", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum c {
        VEHICLE_NAME,
        VEHICLE_NAME_SENTRY_OFF,
        VEHICLE_NAME_SENTRY_ON,
        SERVICE_MODE_LABEL,
        BATTERY_RANGE,
        CHARGE_TIME_LOCATION;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u000f"}, d2 = {"me0/u$d", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "a", "I", "b", "()I", DateTokenConverter.CONVERTER_KEY, "c", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int left;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int top;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int right;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int bottom;

        public d(int i11, int i12, int i13, int i14) {
            this.left = i11;
            this.top = i12;
            this.right = i13;
            this.bottom = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getRight() {
            return this.right;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTop() {
            return this.top;
        }
    }

    private u() {
    }

    private static final void d(RemoteViews remoteViews, int i11, Bitmap bitmap, int i12) {
        char c11 = bitmap.getHeight() > i12 ? (char) 2 : (char) 1;
        y.f92038a.f(remoteViews, c11 == 1 ? i.f91936n : i.f91937o, bitmap, i11);
        remoteViews.setViewVisibility(i.f91936n, me0.c.b(Boolean.valueOf(c11 == 1)));
        remoteViews.setViewVisibility(i.f91937o, me0.c.b(Boolean.valueOf(c11 == 2)));
    }

    public final void a(RemoteViews remoteViews, Context context, xc0.a vehicle) {
        u0 vehicle_config;
        p013kotlin.jvm.internal.s.k(remoteViews, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
        u5 vehicle_data = vehicle.getVehicle_data();
        u0.d car_type = (vehicle_data == null || (vehicle_config = vehicle_data.getVehicle_config()) == null) ? null : vehicle_config.getCar_type();
        int i11 = i.f91947y;
        z zVar = z.f92041a;
        remoteViews.setImageViewResource(i11, z.h(zVar, context, car_type, e.K, null, false, 24, null));
        Icon iconCreateWithResource = Icon.createWithResource(context, ub0.a.f116072a);
        p013kotlin.jvm.internal.s.j(iconCreateWithResource, "createWithResource(...)");
        iconCreateWithResource.setTint(z.d(zVar, context, car_type, e.f91853a, null, false, 24, null));
        remoteViews.setImageViewIcon(i.f91916a, iconCreateWithResource);
        for (Pair pair : p013kotlin.collections.v.p(new Pair(Integer.valueOf(i.F), Integer.valueOf(e.f91867o)), new Pair(Integer.valueOf(i.G), Integer.valueOf(e.f91867o)), new Pair(Integer.valueOf(i.H), Integer.valueOf(e.f91867o)), new Pair(Integer.valueOf(i.I), Integer.valueOf(e.f91867o)), new Pair(Integer.valueOf(i.L), Integer.valueOf(e.f91867o)), new Pair(Integer.valueOf(i.O), Integer.valueOf(e.Z)), new Pair(Integer.valueOf(i.N), Integer.valueOf(e.Y)), new Pair(Integer.valueOf(i.K), Integer.valueOf(e.Z)), new Pair(Integer.valueOf(i.J), Integer.valueOf(e.Y)), new Pair(Integer.valueOf(i.f91940r), Integer.valueOf(e.Z)), new Pair(Integer.valueOf(i.f91939q), Integer.valueOf(e.Y)))) {
            remoteViews.setViewVisibility(((Number) pair.e()).intValue(), z.p(z.f92041a, context, car_type, ((Number) pair.f()).intValue(), null, false, 24, null));
        }
        int i12 = i.M;
        z zVar2 = z.f92041a;
        remoteViews.setInt(i12, "setBackgroundResource", z.b(zVar2, context, car_type, e.f91869q, null, false, 24, null));
        for (Pair pair2 : p013kotlin.collections.v.p(new Pair(Integer.valueOf(i.f91920c), new d(0, (int) z.f(zVar2, context, car_type, e.f91863k, null, false, 24, null), (int) z.f(zVar2, context, car_type, e.f91862j, null, false, 24, null), (int) z.f(zVar2, context, car_type, e.f91863k, null, false, 24, null))), new Pair(Integer.valueOf(i.f91945w), new d(0, 0, 0, (int) z.f(zVar2, context, car_type, e.W, null, false, 24, null))), new Pair(Integer.valueOf(i.W), new d(0, (int) z.f(zVar2, context, car_type, e.f91868p, null, false, 24, null), 0, (int) z.f(zVar2, context, car_type, e.f91868p, null, false, 24, null))), new Pair(Integer.valueOf(i.X), new d(0, (int) z.f(zVar2, context, car_type, e.f91868p, null, false, 24, null), 0, (int) z.f(zVar2, context, car_type, e.f91868p, null, false, 24, null))), new Pair(Integer.valueOf(i.Y), new d(0, (int) z.f(zVar2, context, car_type, e.f91868p, null, false, 24, null), 0, (int) z.f(zVar2, context, car_type, e.f91868p, null, false, 24, null))), new Pair(Integer.valueOf(i.Z), new d(0, (int) z.f(zVar2, context, car_type, e.f91868p, null, false, 24, null), 0, (int) z.f(zVar2, context, car_type, e.f91868p, null, false, 24, null))), new Pair(Integer.valueOf(i.f91917a0), new d(0, (int) z.f(zVar2, context, car_type, e.f91868p, null, false, 24, null), 0, (int) z.f(zVar2, context, car_type, e.f91868p, null, false, 24, null))), new Pair(Integer.valueOf(i.M), new d(0, (int) z.f(zVar2, context, car_type, e.f91866n, null, false, 24, null), 0, 0)))) {
            d dVar = (d) pair2.f();
            remoteViews.setViewPadding(((Number) pair2.e()).intValue(), dVar.getLeft(), dVar.getTop(), dVar.getRight(), dVar.getBottom());
        }
    }

    public final void b(RemoteViews remoteViews, Context context, xc0.a vehicle, a0 widgetType, int i11) {
        u0 vehicle_config;
        p013kotlin.jvm.internal.s.k(remoteViews, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
        p013kotlin.jvm.internal.s.k(widgetType, "widgetType");
        Integer numC = b0.c(vehicle);
        if (numC == null) {
            remoteViews.setViewVisibility(i.f91922d, 8);
            return;
        }
        String str = numC.intValue() + " " + b0.b(vehicle, context);
        int iA = b0.a(vehicle, context, true);
        u5 vehicle_data = vehicle.getVehicle_data();
        b bVar = new b(c.BATTERY_RANGE, widgetType, str, iA, z.f92041a.l((vehicle_data == null || (vehicle_config = vehicle_data.getVehicle_config()) == null) ? null : vehicle_config.getCar_type()));
        if (!textImageCache.containsKey(bVar)) {
            Bitmap bitmapA = re0.b.f107859a.a(context, vehicle, str, context.getResources().getDimensionPixelOffset(widgetType == a0.NORMAL ? g.f91894l : g.f91888f), context.getResources().getDimensionPixelOffset(g.f91892j), context.getResources().getDimensionPixelSize(g.f91893k), iA, (128 & 128) != 0 ? 1 : 0);
            textImageCache.put(bVar, bitmapA);
            y.f92038a.f(remoteViews, i.f91922d, bitmapA, i11);
        } else {
            logger.a("cache Detected and used for battery range: " + str);
            y.f92038a.f(remoteViews, i.f91922d, textImageCache.get(bVar), i11);
        }
    }

    public final void c(RemoteViews remoteViews, Context context, xc0.a vehicle, String content, a0 widgetType, int i11) {
        u0 vehicle_config;
        p013kotlin.jvm.internal.s.k(remoteViews, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
        p013kotlin.jvm.internal.s.k(content, "content");
        p013kotlin.jvm.internal.s.k(widgetType, "widgetType");
        if (content.length() == 0) {
            remoteViews.setViewVisibility(i.f91936n, 8);
            remoteViews.setViewVisibility(i.f91937o, 8);
            return;
        }
        u5 vehicle_data = vehicle.getVehicle_data();
        u0.d car_type = (vehicle_data == null || (vehicle_config = vehicle_data.getVehicle_config()) == null) ? null : vehicle_config.getCar_type();
        z zVar = z.f92041a;
        int iL = zVar.l(car_type);
        int iD = z.d(zVar, context, car_type, e.f91865m, null, false, 24, null);
        b bVar = new b(c.CHARGE_TIME_LOCATION, widgetType, content, iD, iL);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(g.f91895m);
        Bitmap bitmap = textImageCache.get(bVar);
        if (bitmap == null) {
            a0 a0Var = a0.NORMAL;
            Bitmap bitmapA = re0.b.f107859a.a(context, vehicle, content, context.getResources().getDimensionPixelOffset(widgetType == a0Var ? g.f91896n : g.f91889g), dimensionPixelOffset, context.getResources().getDimensionPixelSize(g.f91899q), iD, widgetType == a0Var ? 2 : 1);
            textImageCache.put(bVar, bitmapA);
            d(remoteViews, i11, bitmapA, dimensionPixelOffset);
            return;
        }
        logger.a("cache Detected and used for location or charge time: " + content);
        d(remoteViews, i11, bitmap, dimensionPixelOffset);
    }

    public final void e(RemoteViews remoteViews, Context context, xc0.a vehicle, a0 widgetType, int i11) {
        int i12;
        int i13;
        c cVar;
        u0 vehicle_config;
        p013kotlin.jvm.internal.s.k(remoteViews, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
        p013kotlin.jvm.internal.s.k(widgetType, "widgetType");
        u5 vehicle_data = vehicle.getVehicle_data();
        u0.d car_type = (vehicle_data == null || (vehicle_config = vehicle_data.getVehicle_config()) == null) ? null : vehicle_config.getCar_type();
        String strK = wb0.e.k(vehicle);
        com.tesla.logging.g gVar = logger;
        gVar.a("the size of the cache map is: " + textImageCache.size());
        u5 vehicle_data2 = vehicle.getVehicle_data();
        boolean zX = vehicle_data2 != null ? wb0.e.X(vehicle_data2) : false;
        int i14 = a.f92024a[widgetType.ordinal()];
        if (i14 == 1) {
            i12 = g.f91903u;
            i13 = i.f91942t;
            cVar = c.VEHICLE_NAME;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (zX) {
                i12 = g.f91891i;
                i13 = i.f91944v;
                cVar = c.VEHICLE_NAME_SENTRY_ON;
                remoteViews.setViewVisibility(i.f91943u, 8);
                remoteViews.setViewVisibility(i.f91944v, 0);
            } else {
                i12 = g.f91890h;
                i13 = i.f91943u;
                cVar = c.VEHICLE_NAME_SENTRY_OFF;
                remoteViews.setViewVisibility(i.f91944v, 8);
                remoteViews.setViewVisibility(i.f91943u, 0);
            }
        }
        int i15 = i12;
        int i16 = i13;
        c cVar2 = cVar;
        z zVar = z.f92041a;
        int iL = zVar.l(car_type);
        int iD = z.d(zVar, context, car_type, e.f91864l, null, false, 24, null);
        b bVar = new b(cVar2, widgetType, strK, iD, iL);
        if (textImageCache.containsKey(bVar)) {
            gVar.a("cache Detected and used for vehicle name: " + strK);
            y.f92038a.f(remoteViews, i16, textImageCache.get(bVar), i11);
            return;
        }
        Bitmap bitmapA = re0.b.f107859a.a(context, vehicle, strK, context.getResources().getDimensionPixelOffset(i15), context.getResources().getDimensionPixelOffset(g.f91902t), context.getResources().getDimensionPixelSize(g.f91901s), iD, (128 & 128) != 0 ? 1 : 0);
        textImageCache.put(bVar, bitmapA);
        y.f92038a.f(remoteViews, i16, bitmapA, i11);
        gVar.a("Created a bitmap for vehicle name: " + strK + " and inserted the cache");
    }

    public final void f(RemoteViews remoteViews, Context context, xc0.a vehicle, a0 widgetType, int i11) {
        u0 vehicle_config;
        p013kotlin.jvm.internal.s.k(remoteViews, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
        p013kotlin.jvm.internal.s.k(widgetType, "widgetType");
        u5 vehicle_data = vehicle.getVehicle_data();
        u0.d car_type = (vehicle_data == null || (vehicle_config = vehicle_data.getVehicle_config()) == null) ? null : vehicle_config.getCar_type();
        z zVar = z.f92041a;
        int iL = zVar.l(car_type);
        int iD = z.d(zVar, context, car_type, e.f91865m, null, false, 24, null);
        String string = context.getString(bc0.a.Y0);
        p013kotlin.jvm.internal.s.j(string, "getString(...)");
        b bVar = new b(c.SERVICE_MODE_LABEL, widgetType, string, iD, iL);
        if (!textImageCache.containsKey(bVar)) {
            Bitmap bitmapA = re0.b.f107859a.a(context, vehicle, string, context.getResources().getDimensionPixelOffset(g.f91898p), context.getResources().getDimensionPixelOffset(g.f91897o), context.getResources().getDimensionPixelSize(g.f91900r), iD, (128 & 128) != 0 ? 1 : 0);
            textImageCache.put(bVar, bitmapA);
            y.f92038a.f(remoteViews, i.f91934l, bitmapA, i11);
        } else {
            logger.a("cache Detected and used for service mode label: " + string);
            y.f92038a.f(remoteViews, i.f91934l, textImageCache.get(bVar), i11);
        }
    }
}
