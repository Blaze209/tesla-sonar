package me0;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.SystemClock;
import android.widget.RemoteViews;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.oapi.OwnerAPIError;
import fc0.u5;
import gc0.a1;
import gc0.e0;
import gc0.u0;
import j$.time.Instant;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 =2\u00020\u0001:\u000273B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0012\u001a\u00020\u0011*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u000b*\u00020\u000fH\u0083@¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001c\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010 \u001a\u00020\u0011*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%J4\u0010&\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010#J\u001b\u0010)\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J-\u0010+\u001a\u00020\u0011*\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lme0/s;", "", "Loe0/e;", "vehicleRepository", "Lqe0/a;", "widgetDependencies", "Lne0/b;", "vehicleCommandMarker", "<init>", "(Loe0/e;Lqe0/a;Lne0/b;)V", "Landroid/widget/RemoteViews;", "Lme0/s$c;", "widgetViewType", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lme0/w;", "widgetBuilderConfig", "Ljn0/h0;", "g", "(Landroid/widget/RemoteViews;Lme0/s$c;Landroid/content/Context;Lme0/w;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(Lme0/w;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lxc0/a;", "vehicle", "Lme0/a0;", "widgetType", "", "widgetId", "p", "(Landroid/widget/RemoteViews;Landroid/content/Context;Lxc0/a;Lme0/a0;I)V", "type", "appWidgetId", "h", "(Landroid/widget/RemoteViews;Landroid/content/Context;Lme0/a0;I)V", "o", "(Landroid/widget/RemoteViews;Landroid/content/Context;I)V", "n", "(Landroid/widget/RemoteViews;Landroid/content/Context;Lxc0/a;I)V", "l", "(Landroid/widget/RemoteViews;Landroid/content/Context;Lxc0/a;Lme0/a0;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "j", "(Landroid/widget/RemoteViews;Landroid/content/Context;)V", "m", "(Landroid/widget/RemoteViews;Lxc0/a;Landroid/content/Context;I)V", "", "vin", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/widget/RemoteViews;Landroid/content/Context;Ljava/lang/String;)V", "q", "(Landroid/content/Context;Lme0/w;)V", "a", "Loe0/e;", "b", "Lqe0/a;", "c", "Lne0/b;", "Lcom/tesla/logging/g;", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/logging/g;", "logger", "e", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oe0.e vehicleRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qe0.a widgetDependencies;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ne0.b vehicleCommandMarker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91971a;

        static {
            int[] iArr = new int[OwnerAPIError.values().length];
            try {
                iArr[OwnerAPIError.OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OwnerAPIError.OWNERAPI_ERROR_UNAUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OwnerAPIError.OWNERAPI_ERROR_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f91971a = iArr;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u000b\f\t\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lme0/s$c;", "", "<init>", "()V", "Lme0/a0;", "type", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/widget/RemoteViews;", "a", "(Lme0/a0;Landroid/content/Context;)Landroid/widget/RemoteViews;", DateTokenConverter.CONVERTER_KEY, "b", "e", "c", "Lme0/s$c$a;", "Lme0/s$c$b;", "Lme0/s$c$c;", "Lme0/s$c$d;", "Lme0/s$c$e;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static abstract class c {

        /* JADX INFO: renamed from: me0.s$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lme0/s$c$a;", "Lme0/s$c;", "Lxc0/a;", "vehicle", "<init>", "(Lxc0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxc0/a;", "b", "()Lxc0/a;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MobileAccessDisabled extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final xc0.a vehicle;

            public MobileAccessDisabled(xc0.a aVar) {
                super(null);
                this.vehicle = aVar;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final xc0.a getVehicle() {
                return this.vehicle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MobileAccessDisabled) && p013kotlin.jvm.internal.s.f(this.vehicle, ((MobileAccessDisabled) other).vehicle);
            }

            public int hashCode() {
                xc0.a aVar = this.vehicle;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                return "MobileAccessDisabled(vehicle=" + this.vehicle + ")";
            }
        }

        /* JADX INFO: renamed from: me0.s$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lme0/s$c$b;", "Lme0/s$c;", "", "vin", "", AnalyticsAttribute.Error, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoData extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String vin;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Throwable error;

            public NoData(String str, Throwable th2) {
                super(null);
                this.vin = str;
                this.error = th2;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getVin() {
                return this.vin;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoData)) {
                    return false;
                }
                NoData noData = (NoData) other;
                return p013kotlin.jvm.internal.s.f(this.vin, noData.vin) && p013kotlin.jvm.internal.s.f(this.error, noData.error);
            }

            public int hashCode() {
                String str = this.vin;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.error;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public String toString() {
                return "NoData(vin=" + this.vin + ", error=" + this.error + ")";
            }
        }

        /* JADX INFO: renamed from: me0.s$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme0/s$c$c;", "Lme0/s$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C1963c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1963c f91975a = new C1963c();

            private C1963c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1963c);
            }

            public int hashCode() {
                return 1788660116;
            }

            public String toString() {
                return "NonOwner";
            }
        }

        /* JADX INFO: renamed from: me0.s$c$d, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lme0/s$c$d;", "Lme0/s$c;", "Lxc0/a;", "vehicle", "", "Lne0/c;", "vehicleCommand", "<init>", "(Lxc0/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxc0/a;", "b", "()Lxc0/a;", "Ljava/util/List;", "c", "()Ljava/util/List;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Normal extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final xc0.a vehicle;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ne0.c> vehicleCommand;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Normal(xc0.a vehicle, List<? extends ne0.c> vehicleCommand) {
                super(null);
                p013kotlin.jvm.internal.s.k(vehicle, "vehicle");
                p013kotlin.jvm.internal.s.k(vehicleCommand, "vehicleCommand");
                this.vehicle = vehicle;
                this.vehicleCommand = vehicleCommand;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final xc0.a getVehicle() {
                return this.vehicle;
            }

            public final List<ne0.c> c() {
                return this.vehicleCommand;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Normal)) {
                    return false;
                }
                Normal normal = (Normal) other;
                return p013kotlin.jvm.internal.s.f(this.vehicle, normal.vehicle) && p013kotlin.jvm.internal.s.f(this.vehicleCommand, normal.vehicleCommand);
            }

            public int hashCode() {
                return (this.vehicle.hashCode() * 31) + this.vehicleCommand.hashCode();
            }

            public String toString() {
                return "Normal(vehicle=" + this.vehicle + ", vehicleCommand=" + this.vehicleCommand + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme0/s$c$e;", "Lme0/s$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class e extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f91978a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 1963598136;
            }

            public String toString() {
                return "NotSetUp";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RemoteViews a(a0 type, Context context) {
            p013kotlin.jvm.internal.s.k(type, "type");
            p013kotlin.jvm.internal.s.k(context, "context");
            return this instanceof Normal ? new RemoteViews(context.getPackageName(), type.getLayoutRes()) : new RemoteViews(context.getPackageName(), type.getDefaultLayoutRes());
        }

        private c() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.widget.VehicleWidgetBuilder", f = "VehicleWidgetBuilder.kt", i = {1, 1, 1, 2}, l = {164, 176, 185}, m = "mapToWidgetType", n = {"this", "vin", "appWidgetId", "exception"}, s = {"L$0", "L$1", "I$0", "L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f91979n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f91980o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f91981p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f91982q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f91984s;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f91982q = obj;
            this.f91984s |= Integer.MIN_VALUE;
            return s.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.widget.VehicleWidgetBuilder", f = "VehicleWidgetBuilder.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {113}, m = "setup", n = {"this", "$this$setup", "widgetViewType", CoreConstants.CONTEXT_SCOPE_VALUE, "type", "commandExecution", "vehicle", "appWidgetId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f91985n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f91986o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f91987p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f91988q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f91989r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f91990s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f91991t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f91992u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f91993v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f91995x;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f91993v = obj;
            this.f91995x |= Integer.MIN_VALUE;
            return s.this.g(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.widget.VehicleWidgetBuilder", f = "VehicleWidgetBuilder.kt", i = {0, 0, 0, 0, 0, 0}, l = {395}, m = "setupVehicleChargeOrLocation", n = {"this", "$this$setupVehicleChargeOrLocation", CoreConstants.CONTEXT_SCOPE_VALUE, "vehicle", "widgetType", "widgetId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f91996n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f91997o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f91998p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f91999q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f92000r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f92001s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f92002t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f92004v;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f92002t = obj;
            this.f92004v |= Integer.MIN_VALUE;
            return s.this.l(null, null, null, null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.widget.VehicleWidgetBuilder$setupVehicleChargeOrLocation$3", f = "VehicleWidgetBuilder.kt", i = {0}, l = {398}, m = "invokeSuspend", n = {"geoLocation"}, s = {"L$0"})
    static final class g extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f92005n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f92006o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ xc0.a f92007p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ s f92008q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ td0.m f92009r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(xc0.a aVar, s sVar, td0.m mVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f92007p = aVar;
            this.f92008q = sVar;
            this.f92009r = mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f92007p, this.f92008q, this.f92009r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair<Double, Double> pair;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f92006o;
            if (i11 == 0) {
                jn0.t.b(obj);
                u5 vehicle_data = this.f92007p.getVehicle_data();
                Pair<Double, Double> pairN = vehicle_data != null ? wb0.e.n(vehicle_data) : null;
                if (pairN == null) {
                    return null;
                }
                qe0.a aVar = this.f92008q.widgetDependencies;
                this.f92005n = pairN;
                this.f92006o = 1;
                Object objC = aVar.c(pairN, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pair = pairN;
                obj = objC;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pair = (Pair) this.f92005n;
                jn0.t.b(obj);
            }
            String str = (String) obj;
            if (str == null) {
                td0.m mVar = this.f92009r;
                p013kotlin.jvm.internal.s.h(mVar);
                String strC = oe0.b.c(mVar, wb0.e.q(this.f92007p), pair);
                this.f92008q.logger.a("Got cached location from realm");
                return strC;
            }
            s sVar = this.f92008q;
            td0.m mVar2 = this.f92009r;
            xc0.a aVar2 = this.f92007p;
            sVar.logger.a("Successfully fetched location from geocoder,caching it");
            p013kotlin.jvm.internal.s.h(mVar2);
            oe0.b.e(mVar2, wb0.e.q(aVar2), pair, str);
            return str;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.widget.VehicleWidgetBuilder$updateAppWidget$1", f = "VehicleWidgetBuilder.kt", i = {1}, l = {75, 78}, m = "invokeSuspend", n = {"views"}, s = {"L$0"})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f92010n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f92011o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ a0 f92012p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Context f92013q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ s f92014r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ WidgetBuilderConfig f92015s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AppWidgetManager f92016t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f92017u;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lme0/s$c;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lme0/s$c;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.tesla.widget.VehicleWidgetBuilder$updateAppWidget$1$widgetType$1", f = "VehicleWidgetBuilder.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super c>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f92018n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ s f92019o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ WidgetBuilderConfig f92020p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, WidgetBuilderConfig widgetBuilderConfig, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f92019o = sVar;
                this.f92020p = widgetBuilderConfig;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f92019o, this.f92020p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f92018n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                    return obj;
                }
                jn0.t.b(obj);
                s sVar = this.f92019o;
                WidgetBuilderConfig widgetBuilderConfig = this.f92020p;
                this.f92018n = 1;
                Object objF = sVar.f(widgetBuilderConfig, this);
                return objF == coroutine_suspended ? coroutine_suspended : objF;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super c> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a0 a0Var, Context context, s sVar, WidgetBuilderConfig widgetBuilderConfig, AppWidgetManager appWidgetManager, int i11, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f92012p = a0Var;
            this.f92013q = context;
            this.f92014r = sVar;
            this.f92015s = widgetBuilderConfig;
            this.f92016t = appWidgetManager;
            this.f92017u = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new h(this.f92012p, this.f92013q, this.f92014r, this.f92015s, this.f92016t, this.f92017u, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h hVar;
            RemoteViews remoteViews;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f92011o;
            if (i11 == 0) {
                jn0.t.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(this.f92014r, this.f92015s, null);
                this.f92011o = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                jn0.t.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                remoteViews = (RemoteViews) this.f92010n;
                jn0.t.b(obj);
                hVar = this;
            }
            me0.c.a().j("Setup done, widget should be refreshed");
            hVar.f92016t.updateAppWidget(hVar.f92017u, remoteViews);
            y.f92038a.b(hVar.f92017u);
            return h0.f84049a;
            c cVar = (c) obj;
            RemoteViews remoteViewsA = cVar.a(this.f92012p, this.f92013q);
            me0.c.a().j("Successfully generated widget type, current type: " + cVar + " ,start setup");
            s sVar = this.f92014r;
            Context context = this.f92013q;
            WidgetBuilderConfig widgetBuilderConfig = this.f92015s;
            this.f92010n = remoteViewsA;
            this.f92011o = 2;
            hVar = this;
            if (sVar.g(remoteViewsA, cVar, context, widgetBuilderConfig, hVar) != coroutine_suspended) {
                remoteViews = remoteViewsA;
                me0.c.a().j("Setup done, widget should be refreshed");
                hVar.f92016t.updateAppWidget(hVar.f92017u, remoteViews);
                y.f92038a.b(hVar.f92017u);
                return h0.f84049a;
            }
            return coroutine_suspended;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public s(oe0.e vehicleRepository, qe0.a widgetDependencies, ne0.b vehicleCommandMarker) {
        p013kotlin.jvm.internal.s.k(vehicleRepository, "vehicleRepository");
        p013kotlin.jvm.internal.s.k(widgetDependencies, "widgetDependencies");
        p013kotlin.jvm.internal.s.k(vehicleCommandMarker, "vehicleCommandMarker");
        this.vehicleRepository = vehicleRepository;
        this.widgetDependencies = widgetDependencies;
        this.vehicleCommandMarker = vehicleCommandMarker;
        this.logger = me0.c.a().p("WidgetBuilder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (r12 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0112, code lost:
    
        if (r11.k(r0) == r1) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(me0.WidgetBuilderConfig r11, p013kotlin.coroutines.Continuation<? super me0.s.c> r12) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me0.s.f(me0.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object g(RemoteViews remoteViews, c cVar, Context context, WidgetBuilderConfig widgetBuilderConfig, Continuation<? super h0> continuation) {
        e eVar;
        s sVar;
        RemoteViews remoteViews2;
        Context context2;
        xc0.a aVar;
        int i11;
        a0 a0Var;
        me0.b bVar;
        c cVar2 = cVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f91995x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f91995x = i12 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f91993v;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = eVar2.f91995x;
        if (i13 == 0) {
            jn0.t.b(obj);
            int appWidgetId = widgetBuilderConfig.getAppWidgetId();
            a0 type = widgetBuilderConfig.getType();
            me0.b commandExecution = widgetBuilderConfig.getCommandExecution();
            h(remoteViews, context, type, appWidgetId);
            if (cVar2 instanceof c.MobileAccessDisabled) {
                m(remoteViews, ((c.MobileAccessDisabled) cVar2).getVehicle(), context, appWidgetId);
            } else if (cVar2 instanceof c.NoData) {
                i(remoteViews, context, ((c.NoData) cVar2).getVin());
                o(remoteViews, context, appWidgetId);
            } else if (p013kotlin.jvm.internal.s.f(cVar2, c.C1963c.f91975a)) {
                j(remoteViews, context);
                o(remoteViews, context, appWidgetId);
            } else if (p013kotlin.jvm.internal.s.f(cVar2, c.e.f91978a)) {
                k(remoteViews, context, appWidgetId);
            } else {
                if (!(cVar2 instanceof c.Normal)) {
                    throw new NoWhenBranchMatchedException();
                }
                xc0.a vehicle = ((c.Normal) cVar2).getVehicle();
                u.f92021a.a(remoteViews, context, vehicle);
                p(remoteViews, context, vehicle, type, widgetBuilderConfig.e());
                eVar2.f91985n = this;
                eVar2.f91986o = remoteViews;
                eVar2.f91987p = cVar2;
                eVar2.f91988q = context;
                eVar2.f91989r = type;
                eVar2.f91990s = commandExecution;
                eVar2.f91991t = vehicle;
                eVar2.f91992u = appWidgetId;
                eVar2.f91995x = 1;
                if (l(remoteViews, context, vehicle, type, appWidgetId, eVar2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sVar = this;
                remoteViews2 = remoteViews;
                context2 = context;
                aVar = vehicle;
                i11 = appWidgetId;
                a0Var = type;
                bVar = commandExecution;
            }
            return h0.f84049a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i14 = eVar2.f91992u;
        xc0.a aVar2 = (xc0.a) eVar2.f91991t;
        bVar = (me0.b) eVar2.f91990s;
        a0Var = (a0) eVar2.f91989r;
        Context context3 = (Context) eVar2.f91988q;
        c cVar3 = (c) eVar2.f91987p;
        RemoteViews remoteViews3 = (RemoteViews) eVar2.f91986o;
        s sVar2 = (s) eVar2.f91985n;
        jn0.t.b(obj);
        i11 = i14;
        aVar = aVar2;
        sVar = sVar2;
        context2 = context3;
        cVar2 = cVar3;
        remoteViews2 = remoteViews3;
        sVar.o(remoteViews2, context2, i11);
        if (a0Var == a0.NORMAL) {
            l.h(remoteViews2, context2, aVar, i11, ((c.Normal) cVar2).c(), sVar.vehicleCommandMarker);
            l.i(remoteViews2, context2, bVar);
        }
        return h0.f84049a;
    }

    private final void h(RemoteViews remoteViews, Context context, a0 a0Var, int i11) {
        remoteViews.setViewVisibility(i.f91932j, 0);
        remoteViews.setOnClickPendingIntent(i.f91932j, a0Var.getRefreshPendingIntent(context, Integer.valueOf(i11)));
    }

    private final void i(RemoteViews remoteViews, Context context, String str) {
        remoteViews.setTextViewText(i.Q, context.getText(bc0.a.f16982f1));
        remoteViews.setViewVisibility(i.P, 4);
        if (str == null) {
            remoteViews.setOnClickPendingIntent(i.f91929g0, x.c(context, this.widgetDependencies));
        } else {
            remoteViews.setOnClickPendingIntent(i.f91929g0, x.j(context, str));
        }
        remoteViews.setImageViewResource(i.f91938p, me0.h.f91913j);
    }

    private final void j(RemoteViews remoteViews, Context context) {
        remoteViews.setTextViewText(i.Q, context.getText(bc0.a.f16976d1));
        remoteViews.setTextViewText(i.P, context.getText(bc0.a.f16985g1));
        remoteViews.setOnClickPendingIntent(i.f91929g0, x.b(context));
        remoteViews.setImageViewResource(i.f91938p, me0.h.f91913j);
    }

    private final void k(RemoteViews remoteViews, Context context, int i11) {
        remoteViews.setTextViewText(i.Q, context.getText(bc0.a.f16976d1));
        remoteViews.setTextViewText(i.P, context.getText(bc0.a.f16973c1));
        remoteViews.setOnClickPendingIntent(i.f91929g0, x.l(context, i11));
        remoteViews.setImageViewResource(i.f91938p, me0.h.f91913j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object l(RemoteViews remoteViews, Context context, xc0.a aVar, a0 a0Var, int i11, Continuation<? super h0> continuation) {
        f fVar;
        String location_name;
        RemoteViews remoteViews2;
        a0 a0Var2;
        int i12;
        Object objWithContext;
        s sVar;
        RemoteViews remoteViews3;
        a0 a0Var3;
        int i13;
        e0 location_state;
        a1 vehicle_state;
        List<Integer> listT;
        Integer num;
        String str;
        Context context2 = context;
        xc0.a aVar2 = aVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i14 = fVar.f92004v;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f92004v = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.f92002t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = fVar.f92004v;
        if (i15 == 0) {
            jn0.t.b(obj);
            td0.m mVarJ = td0.m.j();
            String strF = b0.f(aVar2, context2);
            if (b0.g(aVar2)) {
                u.f92021a.c(remoteViews, context2, aVar2, strF == null ? "" : strF, a0Var, i11);
            } else {
                j0 j0Var = new j0();
                u5 vehicle_data = aVar2.getVehicle_data();
                if (vehicle_data != null && (vehicle_state = vehicle_data.getVehicle_state()) != null && (listT = vehicle_state.t()) != null && (num = (Integer) p013kotlin.collections.v.r0(listT, 1)) != null) {
                    int iIntValue = num.intValue();
                    int value = gc0.v.MOBILE_APP_FEATURE_PRECISE_LOCATION_TAG.getValue() % 32;
                    j0Var.f86523a = (iIntValue & (1 << (value + ((((value ^ 32) & ((-value) | value)) >> 31) & 32)))) > 0;
                }
                location_name = null;
                if (j0Var.f86523a) {
                    u5 vehicle_data2 = aVar2.getVehicle_data();
                    if (vehicle_data2 != null && (location_state = vehicle_data2.getLocation_state()) != null) {
                        location_name = location_state.getLocation_name();
                    }
                    remoteViews3 = remoteViews;
                    a0Var3 = a0Var;
                    i13 = i11;
                    sVar = this;
                } else {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    g gVar = new g(aVar2, this, mVarJ, null);
                    fVar.f91996n = this;
                    remoteViews2 = remoteViews;
                    fVar.f91997o = remoteViews2;
                    fVar.f91998p = context2;
                    fVar.f91999q = aVar2;
                    a0Var2 = a0Var;
                    fVar.f92000r = a0Var2;
                    i12 = i11;
                    fVar.f92001s = i12;
                    fVar.f92004v = 1;
                    objWithContext = BuildersKt.withContext(io2, gVar, fVar);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sVar = this;
                }
                Context context3 = context2;
                xc0.a aVar3 = aVar2;
                sVar.logger.a("got vehicle location : " + location_name);
                u uVar = u.f92021a;
                if (location_name == null) {
                    str = "";
                } else {
                    str = location_name;
                }
                uVar.c(remoteViews3, context3, aVar3, str, a0Var3, i13);
            }
            return h0.f84049a;
        }
        if (i15 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i16 = fVar.f92001s;
        a0 a0Var4 = (a0) fVar.f92000r;
        xc0.a aVar4 = (xc0.a) fVar.f91999q;
        Context context4 = (Context) fVar.f91998p;
        RemoteViews remoteViews4 = (RemoteViews) fVar.f91997o;
        s sVar2 = (s) fVar.f91996n;
        jn0.t.b(obj);
        i12 = i16;
        a0Var2 = a0Var4;
        aVar2 = aVar4;
        context2 = context4;
        sVar = sVar2;
        objWithContext = obj;
        remoteViews2 = remoteViews4;
        remoteViews3 = remoteViews2;
        a0Var3 = a0Var2;
        i13 = i12;
        location_name = (String) objWithContext;
        Context context5 = context2;
        xc0.a aVar5 = aVar2;
        sVar.logger.a("got vehicle location : " + location_name);
        u uVar2 = u.f92021a;
        if (location_name == null) {
            str = "";
        } else {
            str = location_name;
        }
        uVar2.c(remoteViews3, context5, aVar5, str, a0Var3, i13);
        return h0.f84049a;
    }

    private final void m(RemoteViews remoteViews, xc0.a aVar, Context context, int i11) {
        remoteViews.setTextViewText(i.Q, aVar != null ? wb0.e.k(aVar) : null);
        remoteViews.setTextViewText(i.P, context.getText(bc0.a.f16979e1));
        if (aVar == null) {
            remoteViews.setOnClickPendingIntent(i.f91929g0, x.c(context, this.widgetDependencies));
        } else {
            n(remoteViews, context, aVar, i11);
            remoteViews.setOnClickPendingIntent(i.f91929g0, x.k(context, aVar));
        }
    }

    private final void n(RemoteViews remoteViews, Context context, xc0.a aVar, int i11) {
        u0 vehicle_config;
        u5 vehicle_data = aVar.getVehicle_data();
        Bitmap bitmapCreateScaledBitmap = null;
        int iN = z.n(z.f92041a, context, (vehicle_data == null || (vehicle_config = vehicle_data.getVehicle_config()) == null) ? null : vehicle_config.getCar_type(), me0.e.V, null, false, 24, null);
        String strD = b0.d(aVar, context);
        if (strD != null) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strD);
            if (bitmapDecodeFile != null) {
                y yVar = y.f92038a;
                int iC = yVar.c(context);
                int iD = iC - yVar.d(i11);
                me0.c.a().a("Byte Limit is: " + iC + ", original vehicle image bitmap size: " + bitmapDecodeFile.getAllocationByteCount() + ", bytesLeft: " + iD);
                if (iD < bitmapDecodeFile.getAllocationByteCount()) {
                    int allocationByteCount = ((bitmapDecodeFile.getAllocationByteCount() + iD) - 1) / iD;
                    me0.c.a().a("Shrinking vehicle image bitmap by " + allocationByteCount);
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, bitmapDecodeFile.getWidth() / allocationByteCount, bitmapDecodeFile.getHeight() / allocationByteCount, true);
                } else {
                    bitmapCreateScaledBitmap = bitmapDecodeFile;
                }
            }
            if (bitmapCreateScaledBitmap != null) {
                remoteViews.setImageViewBitmap(iN, bitmapCreateScaledBitmap);
                return;
            }
        }
        remoteViews.setImageViewResource(iN, b0.e(aVar));
    }

    private final void o(RemoteViews remoteViews, Context context, int i11) {
        if (this.vehicleRepository.b() > 1) {
            remoteViews.setOnClickPendingIntent(i.f91941s, x.l(context, i11));
            remoteViews.setOnClickPendingIntent(i.Q, x.l(context, i11));
        }
    }

    private final void p(RemoteViews remoteViews, Context context, xc0.a aVar, a0 a0Var, int i11) {
        int iH;
        Context context2;
        int iB;
        u0 vehicle_config;
        u0.d car_type;
        u0 vehicle_config2;
        u0 vehicle_config3;
        u5 vehicle_data = aVar.getVehicle_data();
        u0.d car_type2 = (vehicle_data == null || (vehicle_config3 = vehicle_data.getVehicle_config()) == null) ? null : vehicle_config3.getCar_type();
        remoteViews.setTextViewText(i.f91941s, wb0.e.k(aVar));
        if (wb0.e.c0(aVar)) {
            iH = z.h(z.f92041a, context, car_type2, me0.e.S, null, false, 24, null);
            context2 = context;
        } else {
            iH = z.h(z.f92041a, context, car_type2, me0.e.B, null, false, 24, null);
            context2 = context;
        }
        u0.d dVar = car_type2;
        Icon iconCreateWithResource = Icon.createWithResource(context2, iH);
        p013kotlin.jvm.internal.s.j(iconCreateWithResource, "createWithResource(...)");
        iconCreateWithResource.setTint(context2.getColor(wb0.e.c0(aVar) ? me0.f.f91880b : me0.f.f91881c));
        remoteViews.setImageViewIcon(i.f91926f, iconCreateWithResource);
        u uVar = u.f92021a;
        uVar.e(remoteViews, context2, aVar, a0Var, i11);
        y.f92038a.f(remoteViews, i.f91920c, re0.a.f107857a.c(context2, aVar), i11);
        uVar.b(remoteViews, context2, aVar, a0Var, i11);
        remoteViews.setViewVisibility(i.f91916a, me0.c.b(Boolean.valueOf(b0.g(aVar))));
        n(remoteViews, context2, aVar, i11);
        xc0.b ble_status = aVar.getBle_status();
        int color = (ble_status == null || !ble_status.getPhone_key_connected()) ? context2.getColor(me0.f.f91881c) : context2.getColor(me0.f.f91880b);
        Icon iconCreateWithResource2 = Icon.createWithResource(context, z.h(z.f92041a, context, dVar, me0.e.F, null, false, 24, null));
        iconCreateWithResource2.setTint(color);
        p013kotlin.jvm.internal.s.j(iconCreateWithResource2, "apply(...)");
        remoteViews.setViewVisibility(i.f91946x, me0.c.b(Boolean.valueOf(wb0.e.y(aVar))));
        remoteViews.setImageViewIcon(i.f91946x, iconCreateWithResource2);
        int i12 = i.f91947y;
        u5 vehicle_data2 = aVar.getVehicle_data();
        remoteViews.setViewVisibility(i12, me0.c.b(vehicle_data2 != null ? Boolean.valueOf(wb0.e.X(vehicle_data2)) : null));
        u5 vehicle_data3 = aVar.getVehicle_data();
        Instant timestamp = (vehicle_data3 == null || (vehicle_config2 = vehicle_data3.getVehicle_config()) == null) ? null : vehicle_config2.getTimestamp();
        remoteViews.setChronometer(i.f91948z, timestamp != null ? (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + timestamp.toEpochMilli() : SystemClock.elapsedRealtime(), context.getString(bc0.a.f16988h1), true);
        remoteViews.setOnClickPendingIntent(i.f91929g0, x.k(context, aVar));
        u5 vehicle_data4 = aVar.getVehicle_data();
        Boolean boolValueOf = vehicle_data4 != null ? Boolean.valueOf(wb0.e.P(vehicle_data4)) : null;
        remoteViews.setViewVisibility(i.f91934l, me0.c.b(boolValueOf));
        if (p013kotlin.jvm.internal.s.f(boolValueOf, Boolean.TRUE)) {
            uVar.f(remoteViews, context, aVar, a0Var, i11);
        }
        u5 vehicle_data5 = aVar.getVehicle_data();
        if (wb0.e.k0((vehicle_data5 == null || (vehicle_config = vehicle_data5.getVehicle_config()) == null || (car_type = vehicle_config.getCar_type()) == null) ? null : car_type.getCarTypeCybertruck())) {
            iB = 4;
        } else {
            u5 vehicle_data6 = aVar.getVehicle_data();
            iB = me0.c.b(vehicle_data6 != null ? Boolean.valueOf(wb0.e.P(vehicle_data6)) : null);
        }
        remoteViews.setViewVisibility(i.f91935m, iB);
    }

    public final void q(Context context, WidgetBuilderConfig widgetBuilderConfig) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(widgetBuilderConfig, "widgetBuilderConfig");
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int appWidgetId = widgetBuilderConfig.getAppWidgetId();
        a0 type = widgetBuilderConfig.getType();
        this.logger.a("start widget update type :" + type);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new h(type, context, this, widgetBuilderConfig, appWidgetManager, appWidgetId, null), 3, null);
    }
}
