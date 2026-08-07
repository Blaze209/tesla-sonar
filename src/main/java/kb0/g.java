package kb0;

import android.annotation.SuppressLint;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.ProcessLifecycleOwner;
import androidx.p003lifecycle.k0;
import androidx.p003lifecycle.w;
import ce0.TeslaCommandRequest;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tesla.domain.model.EnergySite;
import com.tesla.domain.model.Product;
import com.tesla.domain.model.Vehicle;
import ic0.h;
import ic0.q;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\\A?B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0007¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\nH\u0007¢\u0006\u0004\b&\u0010\u0003J\u0015\u0010'\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b.\u0010/J1\u00101\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u0004\u0018\u0001032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b6\u00105J\u0019\u00107\u001a\u0004\u0018\u0001032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b7\u00105J\u0019\u00108\u001a\u0004\u0018\u0001032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b8\u00105J\u0017\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b=\u0010>R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002030C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002030C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020!0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010FR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002030C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010FR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002030C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010FR \u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002030C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010FR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001a0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010Z¨\u0006]"}, d2 = {"Lkb0/g;", "Landroidx/lifecycle/w;", "<init>", "()V", "Lbe0/b;", "getSelectedProduct", "Lpb0/c;", "wakeVehicleOverNetwork", "Lmb0/a;", "commandTransport", "Ljn0/h0;", "q", "(Lbe0/b;Lpb0/c;Lmb0/a;)V", "Lce0/j;", "request", "Lle0/b;", AnalyticsAttribute.Reason, "Lkotlin/Function0;", "onBleWakeFinish", "B", "(Lce0/j;Lle0/b;Lwn0/a;)V", "", "vin", "command", "C", "(Ljava/lang/String;Lle0/b;Lce0/j;Lwn0/a;)V", "Lkb0/g$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "s", "(Lkb0/g$b;)V", "v", "A", "(Ljava/lang/String;)V", "Lkb0/g$c;", "state", "z", "(Ljava/lang/String;Lkb0/g$c;)V", "onAppForegrounded", "onAppBackgrounded", "j", "(Ljava/lang/String;)Lkb0/g$c;", "n", "(Ljava/lang/String;)Ljava/lang/String;", "Llb0/c$a;", "o", "(Ljava/lang/String;)Llb0/c$a;", "r", "(Lmb0/a;)V", "wakeVehicleOverNetworkUseCase", "w", "(Ljava/lang/String;Lle0/b;Lce0/j;Lpb0/c;)V", "", "k", "(Ljava/lang/String;)Ljava/lang/Long;", "m", "l", "p", "Lcom/tesla/domain/model/Vehicle;", "vehicle", "u", "(Lcom/tesla/domain/model/Vehicle;)V", "t", "(Lkb0/g$c;Ljava/lang/String;)V", "b", "Lpb0/c;", "c", "Lmb0/a;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lam0/b;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/ConcurrentHashMap;", "networkWakeFallbackDisposables", "e", "lastWakeTime", "f", "lastBleWakeTime", "g", "states", "h", "lastOnlineStateTimestamps", IntegerTokenConverter.CONVERTER_KEY, "stateTimestamps", "vehicleDataSuccessTimestamps", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "allVehiclesListeners", "Lkb0/g$a;", "Lkb0/g$a;", "analyticsState", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "a", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static pb0.c wakeVehicleOverNetwork;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static mb0.a commandTransport;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static AnalyticsState analyticsState;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f85866a = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, am0.b> networkWakeFallbackDisposables = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, Long> lastWakeTime = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, Long> lastBleWakeTime = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, c> states = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, Long> lastOnlineStateTimestamps = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, Long> stateTimestamps = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, Long> vehicleDataSuccessTimestamps = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentLinkedQueue<b> allVehiclesListeners = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("VehicleStateManager");

    /* JADX INFO: renamed from: kb0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u0012\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lkb0/g$a;", "", "", "vin", "Ljava/util/Date;", "startedListeningAt", "", "hasBeenSeenOnline", "<init>", "(Ljava/lang/String;Ljava/util/Date;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "setVin", "(Ljava/lang/String;)V", "b", "Ljava/util/Date;", "()Ljava/util/Date;", "setStartedListeningAt", "(Ljava/util/Date;)V", "Z", "()Z", "setHasBeenSeenOnline", "(Z)V", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class AnalyticsState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String vin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private Date startedListeningAt;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean hasBeenSeenOnline;

        public AnalyticsState(String vin, Date startedListeningAt, boolean z11) {
            s.k(vin, "vin");
            s.k(startedListeningAt, "startedListeningAt");
            this.vin = vin;
            this.startedListeningAt = startedListeningAt;
            this.hasBeenSeenOnline = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getHasBeenSeenOnline() {
            return this.hasBeenSeenOnline;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Date getStartedListeningAt() {
            return this.startedListeningAt;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticsState)) {
                return false;
            }
            AnalyticsState analyticsState = (AnalyticsState) other;
            return s.f(this.vin, analyticsState.vin) && s.f(this.startedListeningAt, analyticsState.startedListeningAt) && this.hasBeenSeenOnline == analyticsState.hasBeenSeenOnline;
        }

        public int hashCode() {
            return (((this.vin.hashCode() * 31) + this.startedListeningAt.hashCode()) * 31) + Boolean.hashCode(this.hasBeenSeenOnline);
        }

        public String toString() {
            return "AnalyticsState(vin=" + this.vin + ", startedListeningAt=" + this.startedListeningAt + ", hasBeenSeenOnline=" + this.hasBeenSeenOnline + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkb0/g$b;", "", "", "vin", "Lkb0/g$c;", "state", "Ljn0/h0;", "a", "(Ljava/lang/String;Lkb0/g$c;)V", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(String vin, c state);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkb0/g$c;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "ONLINE", "OFFLINE", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum c {
        UNKNOWN,
        ONLINE,
        OFFLINE;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kb0/g$d", "Lbe0/b$a;", "Lcom/tesla/domain/model/Product;", "product", "Ljn0/h0;", "a", "(Lcom/tesla/domain/model/Product;)V", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements be0.b.a {
        d() {
        }

        @Override // be0.b.a
        public void a(Product product) {
            s.k(product, "product");
            boolean z11 = product instanceof Vehicle;
            if (z11) {
                Vehicle vehicle = (Vehicle) product;
                g.logger.j("vehicle selected: " + vehicle.getId() + " " + vehicle.getDisplayName());
            } else if (product instanceof EnergySite) {
                g.logger.j("energy site selected: " + ((EnergySite) product).getId());
                return;
            }
            Vehicle vehicle2 = z11 ? (Vehicle) product : null;
            if (vehicle2 == null) {
                return;
            }
            g.f85866a.u(vehicle2);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f85882a;

        e(String str) {
            this.f85882a = str;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            s.k(error, "error");
            g.networkWakeFallbackDisposables.remove(this.f85882a);
            g.logger.d(this.f85882a + " Network wake fallback timer error", error);
        }
    }

    private g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void D(g gVar, TeslaCommandRequest teslaCommandRequest, le0.b bVar, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar = new wn0.a() { // from class: kb0.d
                @Override // wn0.a
                public final Object invoke() {
                    return g.F();
                }
            };
        }
        gVar.B(teslaCommandRequest, bVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void E(g gVar, String str, le0.b bVar, TeslaCommandRequest teslaCommandRequest, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            teslaCommandRequest = null;
        }
        if ((i11 & 8) != 0) {
            aVar = new wn0.a() { // from class: kb0.a
                @Override // wn0.a
                public final Object invoke() {
                    return g.G();
                }
            };
        }
        gVar.C(str, bVar, teslaCommandRequest, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 F() {
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 G() {
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(String str, le0.b bVar, TeslaCommandRequest teslaCommandRequest, pb0.c cVar) {
        if (networkWakeFallbackDisposables.remove(str) != null) {
            logger.j("BLE wake timed out, network wake fallback will fire");
            f85866a.w(str, bVar, teslaCommandRequest, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(String str, wn0.a aVar, pb0.c cVar, le0.b bVar, TeslaCommandRequest teslaCommandRequest, ic0.g response) {
        s.k(response, "response");
        if (response.getResult() == h.RESULT_SUCCESS) {
            am0.b bVarRemove = networkWakeFallbackDisposables.remove(str);
            if (bVarRemove != null) {
                logger.j("BLE wake succeeded, cancelling network wake fallback");
                bVarRemove.dispose();
            }
            f85866a.z(str, c.ONLINE);
        } else {
            lastBleWakeTime.remove(str);
            am0.b bVarRemove2 = networkWakeFallbackDisposables.remove(str);
            if (bVarRemove2 != null) {
                logger.j("BLE wake failed, cancelling timer and sending network wake immediately");
                bVarRemove2.dispose();
                if (cVar != null) {
                    f85866a.w(str, bVar, teslaCommandRequest, cVar);
                }
            }
        }
        aVar.invoke();
    }

    private final Long k(String vin) {
        return lastOnlineStateTimestamps.get(vin);
    }

    private final Long l(String vin) {
        return lastWakeTime.get(vin);
    }

    private final Long m(String vin) {
        return stateTimestamps.get(vin);
    }

    private final Long p(String vin) {
        return vehicleDataSuccessTimestamps.get(vin);
    }

    @SuppressLint({"CheckResult"})
    public static final void r(mb0.a commandTransport2) {
        s.k(commandTransport2, "commandTransport");
        commandTransport = commandTransport2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void t(c state, String vin) {
        AnalyticsState analyticsState2 = analyticsState;
        if (analyticsState2 == null || analyticsState2.getHasBeenSeenOnline() || state != c.ONLINE) {
            return;
        }
        analyticsState = new AnalyticsState(analyticsState2.getVin(), analyticsState2.getStartedListeningAt(), true);
        double time = (new Date().getTime() - analyticsState2.getStartedListeningAt().getTime()) / 1000.0d;
        logger.j("refreshed data on: " + vin + " in " + time);
        pa0.c.c().b(cc0.d.VEHICLE_ONLINE_IN_SESSION, v.p(new cc0.f(cc0.g.DURATION_S, null, null, new cc0.b(time, null, 2, null), null, null, 54, null), new cc0.f(cc0.g.REFRESHED_DATA, new cc0.a(true, null, 2, 0 == true ? 1 : 0), null, null, null, null, 60, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u(Vehicle vehicle) {
        AnalyticsState analyticsState2 = analyticsState;
        if (analyticsState2 == null) {
            logger.j("Started listening for product: " + vehicle.getId());
            analyticsState = new AnalyticsState(vehicle.getId(), new Date(), false);
            return;
        }
        if (s.f(vehicle.getId(), analyticsState2.getVin())) {
            return;
        }
        com.tesla.logging.g gVar = logger;
        gVar.j("Changing vehicle to: " + vehicle.getVin());
        if (!analyticsState2.getHasBeenSeenOnline()) {
            double time = (new Date().getTime() - analyticsState2.getStartedListeningAt().getTime()) / 1000.0d;
            gVar.n("Never saw: " + analyticsState2.getVin() + ", in: " + time + " seconds.");
            pa0.c.c().b(cc0.d.VEHICLE_ONLINE_IN_SESSION, v.p(new cc0.f(cc0.g.DURATION_S, null, null, new cc0.b(time, null, 2, null), null, null, 54, null), new cc0.f(cc0.g.REFRESHED_DATA, new cc0.a(true, null, 2, 0 == true ? 1 : 0), null, null, null, null, 60, null)));
        }
        analyticsState = new AnalyticsState(vehicle.getId(), new Date(), false);
    }

    private final void w(final String vin, le0.b reason, TeslaCommandRequest command, pb0.c wakeVehicleOverNetworkUseCase) {
        logger.j(vin + " Sending network wake, wake reason " + reason);
        wakeVehicleOverNetworkUseCase.a(vin, reason, command != null ? command.getRequest() : null, new wn0.a() { // from class: kb0.e
            @Override // wn0.a
            public final Object invoke() {
                return g.x(vin);
            }
        }, new l() { // from class: kb0.f
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g.y(vin, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 x(String str) {
        logger.a(str + " Successfully sent WAKE request.");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 y(String str, int i11) {
        String str2 = str + " Failed to send WAKE request. " + i11;
        logger.d(str2, new Throwable(str2));
        return h0.f84049a;
    }

    public final void A(String vin) {
        s.k(vin, "vin");
        vehicleDataSuccessTimestamps.put(vin, Long.valueOf(System.currentTimeMillis()));
    }

    public final void B(TeslaCommandRequest request, le0.b reason, wn0.a<h0> onBleWakeFinish) {
        s.k(request, "request");
        s.k(reason, "reason");
        s.k(onBleWakeFinish, "onBleWakeFinish");
        String vin = request.getVin();
        if (!request.getRequest().getLetSleep()) {
            C(vin, reason, request, onBleWakeFinish);
            return;
        }
        logger.j("Not waking vehicle for reason " + reason + " for " + request.o() + " because letSleep property is set");
        onBleWakeFinish.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    public final void C(String vin, final le0.b reason, final TeslaCommandRequest command, final wn0.a<h0> onBleWakeFinish) {
        boolean z11;
        final le0.b bVar;
        final TeslaCommandRequest teslaCommandRequest;
        final pb0.c cVar;
        mb0.a aVar;
        final String vin2 = vin;
        Long l11 = 0L;
        s.k(vin2, "vin");
        s.k(reason, "reason");
        s.k(onBleWakeFinish, "onBleWakeFinish");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentHashMap<String, Long> concurrentHashMap = lastBleWakeTime;
        Long lPutIfAbsent = concurrentHashMap.get(vin2);
        if (lPutIfAbsent == null) {
            logger.j("Vehicle " + vin2 + " has never been woke over BLE");
            lPutIfAbsent = concurrentHashMap.putIfAbsent(vin2, l11);
            if (lPutIfAbsent == null) {
                lPutIfAbsent = l11;
            }
        }
        Long l12 = lPutIfAbsent;
        s.h(l12);
        long j11 = 30000;
        boolean z12 = jCurrentTimeMillis - l12.longValue() >= 30000;
        if (j(vin) == c.ONLINE) {
            logger.j("Vehicle is already online! Not sending wake to " + vin2 + " for reason " + reason);
            onBleWakeFinish.invoke();
            return;
        }
        final pb0.c cVar2 = wakeVehicleOverNetwork;
        q transport = command != null ? command.getTransport() : null;
        q qVar = q.TRANSPORT_BLUETOOTH;
        boolean z13 = (transport == qVar || cVar2 == null) ? false : true;
        if (z13) {
            ConcurrentHashMap<String, Long> concurrentHashMap2 = lastWakeTime;
            Long l13 = concurrentHashMap2.get(vin2);
            if (l13 == null) {
                logger.j("Vehicle " + vin2 + " has never been woke over OAPI");
                Long lPutIfAbsent2 = concurrentHashMap2.putIfAbsent(vin2, l11);
                l13 = lPutIfAbsent2 != null ? lPutIfAbsent2 : 0L;
            }
            l11 = l13;
        } else {
            j11 = 30000;
        }
        Long l14 = l11;
        if (z13) {
            s.h(l14);
            if (jCurrentTimeMillis - l14.longValue() >= j11) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (z11) {
            lastWakeTime.put(vin2, Long.valueOf(jCurrentTimeMillis));
        }
        if (z11 && z12 && cVar2 != null) {
            logger.j("Scheduling network wake fallback in 500ms while waiting for BLE");
            am0.b bVarI = io.reactivex.rxjava3.core.b.l(500L, TimeUnit.MILLISECONDS).i(new cm0.a() { // from class: kb0.b
                @Override // cm0.a
                public final void run() {
                    g.H(vin2, reason, command, cVar2);
                }
            }, new e(vin2));
            s.j(bVarI, "subscribe(...)");
            am0.b bVarPut = networkWakeFallbackDisposables.put(vin2, bVarI);
            if (bVarPut != null) {
                bVarPut.dispose();
            }
        }
        if (z12) {
            concurrentHashMap.put(vin2, Long.valueOf(jCurrentTimeMillis));
            mb0.a aVar2 = commandTransport;
            if (aVar2 == null) {
                s.B("commandTransport");
                aVar = null;
            } else {
                aVar = aVar2;
            }
            ic0.e eVarR0 = ob0.e.r0(ob0.e.f97095a, vin2, null, "vehicle_state_manager_ble_wake_vehicle", 2, null);
            bVar = reason;
            teslaCommandRequest = command;
            cVar = cVar2;
            vin2 = vin;
            aVar.a(eVarR0, new ce0.d() { // from class: kb0.c
                @Override // ce0.d
                public final void a(ic0.g gVar) {
                    g.I(vin2, onBleWakeFinish, cVar, bVar, teslaCommandRequest, gVar);
                }
            });
        } else {
            bVar = reason;
            teslaCommandRequest = command;
            cVar = cVar2;
            logger.j(vin2 + " Wake recently sent over BLE, not sending again. Notifying wake finished now.");
            onBleWakeFinish.invoke();
        }
        if ((teslaCommandRequest != null ? teslaCommandRequest.getTransport() : null) == qVar) {
            return;
        }
        if (z11 && !z12 && cVar != null) {
            logger.j(vin2 + " Send wake over BLE: false, network: true, wake reason " + bVar);
            w(vin2, bVar, teslaCommandRequest, cVar);
            return;
        }
        if (z11 || !z13) {
            return;
        }
        s.h(l14);
        long jLongValue = jCurrentTimeMillis - l14.longValue();
        logger.j(vin2 + " Send wake over BLE: " + z12 + ", network: false. Last wake was " + jLongValue + "ms ago");
    }

    public final c j(String vin) {
        c cVarPutIfAbsent;
        s.k(vin, "vin");
        ConcurrentHashMap<String, c> concurrentHashMap = states;
        c cVar = concurrentHashMap.get(vin);
        if (cVar == null && (cVarPutIfAbsent = concurrentHashMap.putIfAbsent(vin, (cVar = c.UNKNOWN))) != null) {
            cVar = cVarPutIfAbsent;
        }
        s.j(cVar, "getOrPut(...)");
        return cVar;
    }

    public final String n(String vin) {
        s.k(vin, "vin");
        String lowerCase = j(vin).name().toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final lb0.c.VehicleConnectivityInfo o(String vin) {
        s.k(vin, "vin");
        return new lb0.c.VehicleConnectivityInfo(n(vin), k(vin), l(vin), m(vin), p(vin));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k0(Lifecycle.a.ON_STOP)
    public final void onAppBackgrounded() {
        logger.j("Entered Background. Resetting vehicle states to unknown");
        for (Map.Entry<String, c> entry : states.entrySet()) {
            String key = entry.getKey();
            entry.getValue();
            f85866a.z(key, c.UNKNOWN);
        }
        AnalyticsState analyticsState2 = analyticsState;
        if (analyticsState2 == null || analyticsState2.getHasBeenSeenOnline()) {
            return;
        }
        double time = (new Date().getTime() - analyticsState2.getStartedListeningAt().getTime()) / 1000.0d;
        logger.j("Entered the background, never saw " + analyticsState2.getVin() + " in session.");
        pa0.c.c().b(cc0.d.VEHICLE_ONLINE_IN_SESSION, v.p(new cc0.f(cc0.g.DURATION_S, null, null, new cc0.b(time, null, 2, null), null, null, 54, null), new cc0.f(cc0.g.REFRESHED_DATA, new cc0.a(false, null, 2, 0 == true ? 1 : 0), null, null, null, null, 60, null)));
    }

    @k0(Lifecycle.a.ON_START)
    public final void onAppForegrounded() {
        for (Map.Entry<String, c> entry : states.entrySet()) {
            String key = entry.getKey();
            entry.getValue();
            f85866a.z(key, c.UNKNOWN);
        }
        AnalyticsState analyticsState2 = analyticsState;
        if (analyticsState2 != null) {
            logger.j("Resetting connectivity analytics for foreground.");
            analyticsState = new AnalyticsState(analyticsState2.getVin(), new Date(), false);
        }
    }

    @SuppressLint({"CheckResult"})
    public final void q(be0.b getSelectedProduct, pb0.c wakeVehicleOverNetwork2, mb0.a commandTransport2) {
        s.k(commandTransport2, "commandTransport");
        wakeVehicleOverNetwork = wakeVehicleOverNetwork2;
        commandTransport = commandTransport2;
        ProcessLifecycleOwner.INSTANCE.a().getLifecycle().a(this);
        if (getSelectedProduct != null) {
            getSelectedProduct.b(new d());
        }
    }

    public final void s(b listener) {
        s.k(listener, "listener");
        allVehiclesListeners.add(listener);
    }

    public final void v(b listener) {
        s.k(listener, "listener");
        allVehiclesListeners.remove(listener);
    }

    public final void z(String vin, c state) {
        s.k(vin, "vin");
        s.k(state, "state");
        long jCurrentTimeMillis = System.currentTimeMillis();
        stateTimestamps.put(vin, Long.valueOf(jCurrentTimeMillis));
        if (state == c.ONLINE) {
            lastOnlineStateTimestamps.put(vin, Long.valueOf(jCurrentTimeMillis));
        }
        logger.j("setting " + vin + " online state to " + state);
        ConcurrentHashMap<String, c> concurrentHashMap = states;
        c cVar = concurrentHashMap.get(vin);
        concurrentHashMap.put(vin, state);
        Iterator<b> it = allVehiclesListeners.iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().a(vin, state);
        }
        if (cVar == state) {
            logger.a(vin + " state is already " + state + ", doing nothing else.");
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("vin", vin);
        String lowerCase = state.name().toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        writableNativeMap.putString("state", lowerCase);
        com.tesla.logging.a.b(com.tesla.logging.a.EnumC1131a.VEHICLE_CONNECTIVITY_STATE, writableNativeMap);
        t(state, vin);
    }
}
