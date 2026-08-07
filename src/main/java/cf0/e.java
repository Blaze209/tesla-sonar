package cf0;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ec0.l;
import ef0.k;
import expo.modules.interfaces.permissions.PermissionsResponse;
import fc0.u5;
import gc0.u0;
import ie0.y;
import java.util.Set;
import java.util.UUID;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\u001c\u0018\u0000 k2\u00020\u0001:\u0001(B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0015J\r\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0015J\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u0015J\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0015J\r\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u0015J\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u0015J'\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0013¢\u0006\u0004\b%\u0010\u0015J\u0015\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010$R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u00104\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0012R$\u00106\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b5\u0010\u0012R$\u00108\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b7\u0010\u0012R$\u0010:\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\b9\u0010\u0012R$\u0010=\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u0010\u0012R$\u0010?\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b>\u0010\u0012R$\u0010A\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\b@\u0010\u0012R$\u0010C\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\bB\u0010\u0012R$\u0010E\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\bD\u0010\u0012R$\u0010I\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u00102R\u0016\u0010K\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010FR(\u0010M\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\bL\u00100R(\u0010O\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\bN\u00100R$\u0010T\u001a\u00020P2\u0006\u0010,\u001a\u00020P8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010SR$\u0010V\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\bU\u00100R$\u0010Y\u001a\u00020P2\u0006\u0010,\u001a\u00020P8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010SR\u0016\u0010[\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010QR\u0016\u0010]\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010FR\u0016\u0010_\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u00102R\u0018\u0010a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010.R\"\u0010e\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010Q\u001a\u0004\bc\u0010S\"\u0004\bZ\u0010dR\"\u0010h\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010F\u001a\u0004\bg\u0010H\"\u0004\bW\u0010\u0018R\u0016\u0010j\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010F¨\u0006l"}, d2 = {"Lcf0/e;", "", "", "connectionId", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "<init>", "(Ljava/lang/String;Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;)V", "vin", "", "bluetoothEnabled", "Lcf0/a;", "e", "(Ljava/lang/String;Z)Lcf0/a;", "", "r", "()J", "Ljn0/h0;", "m", "()V", "timedOut", "o", "(Z)V", "p", "k", "l", IntegerTokenConverter.CONVERTER_KEY, "j", "n", "phase", PermissionsResponse.STATUS_KEY, "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "g", "(Ljava/lang/String;)V", "q", "newConnectionId", "s", "a", "Landroid/content/Context;", "b", "Landroid/bluetooth/BluetoothAdapter;", "value", "c", "Ljava/lang/String;", "getConnectionId", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "J", "getGattConnectedTs", "gattConnectedTs", "getMtuCompletedTs", "mtuCompletedTs", "getServicesDiscoveredTs", "servicesDiscoveredTs", "getCharReadTs", "charReadTs", "h", "getConnectionEstablishedTs", "connectionEstablishedTs", "getFirstAuthAttemptTs", "firstAuthAttemptTs", "getLastAuthAttemptTs", "lastAuthAttemptTs", "getAuthResponseSentTs", "authResponseSentTs", "getHandlePulledWithoutAuthTs", "handlePulledWithoutAuthTs", "Z", "getMtuTimedOut", "()Z", "mtuTimedOut", "resetPeripheralDelayMs", "resetPeripheralWakeLockHeld", "getFailedPhase", "failedPhase", "getFailureStatus", "failureStatus", "", "I", "getAuthAttemptCount", "()I", "authAttemptCount", "getSessionId", "sessionId", "t", "getAttemptNumber", "attemptNumber", "u", "nextAttemptNumber", "v", "sessionCompleted", "w", "lastAttemptTimestamp", "x", "resolvedVehicleModel", "y", "getRssi", "(I)V", "rssi", "z", "getAutoConnect", "autoConnect", "A", "emitted", "B", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<Boolean> C = m.b(new wn0.a() { // from class: cf0.d
        @Override // wn0.a
        public final Object invoke() {
            return Boolean.valueOf(e.h());
        }
    });
    private static final Set<l> D = d1.i(l.FasciaTypeBasePoppyseed, l.FasciaTypePerformancePoppyseed, l.FasciaTypeD50Poppyseed);
    private static final Set<l> E = d1.i(l.FasciaTypeBaseBayberry, l.FasciaTypeE41Bayberry, l.FasciaTypePerformanceBayberry);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private volatile boolean emitted;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String connectionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long gattConnectedTs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long mtuCompletedTs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long servicesDiscoveredTs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long charReadTs;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long connectionEstablishedTs;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long firstAuthAttemptTs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long lastAuthAttemptTs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long authResponseSentTs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long handlePulledWithoutAuthTs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean mtuTimedOut;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long resetPeripheralDelayMs;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean resetPeripheralWakeLockHeld;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String failedPhase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private String failureStatus;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int authAttemptCount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private String sessionId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int attemptNumber;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int nextAttemptNumber;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean sessionCompleted;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long lastAttemptTimestamp;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String resolvedVehicleModel;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int rssi;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean autoConnect;

    /* JADX INFO: renamed from: cf0.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcf0/e$a;", "", "<init>", "()V", "", "vin", "Lec0/l;", "fasciaType", "b", "(Ljava/lang/String;Lec0/l;)Ljava/lang/String;", "", "isOHOS$delegate", "Lkotlin/Lazy;", "a", "()Z", "isOHOS", "", "SESSION_TIMEOUT_MS", "J", "", "poppyseedTypes", "Ljava/util/Set;", "bayberryTypes", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return ((Boolean) e.C.getValue()).booleanValue();
        }

        public final String b(String vin, l fasciaType) {
            s.k(vin, "vin");
            if (vin.length() < 4) {
                return "unknown";
            }
            char cCharAt = vin.charAt(3);
            if (cCharAt == '3') {
                return v.g0(e.D, fasciaType) ? "model3_nv35" : "model3";
            }
            if (cCharAt == 'C') {
                return "cybertruck";
            }
            if (cCharAt == 'S') {
                return "models";
            }
            if (cCharAt == 'T') {
                return "semi";
            }
            if (cCharAt == 'X') {
                return "modelx";
            }
            if (cCharAt != 'Y') {
                return "unknown";
            }
            return v.g0(e.E, fasciaType) ? "modely_nv36" : "modely";
        }

        private Companion() {
        }
    }

    public e(String connectionId, Context context, BluetoothAdapter bluetoothAdapter) {
        s.k(connectionId, "connectionId");
        this.context = context;
        this.bluetoothAdapter = bluetoothAdapter;
        this.connectionId = connectionId;
        String string = UUID.randomUUID().toString();
        s.j(string, "toString(...)");
        this.sessionId = string;
        this.rssi = -1000;
    }

    private final ConnectionTimelinePayload e(String vin, boolean bluetoothEnabled) {
        u0 vehicle_config;
        if (this.resolvedVehicleModel == null && vin.length() > 0) {
            l fascia_type = null;
            try {
                u5 u5VarD = be0.e.INSTANCE.a().d(vin);
                if (u5VarD != null && (vehicle_config = u5VarD.getVehicle_config()) != null) {
                    fascia_type = vehicle_config.getFascia_type();
                }
            } catch (Exception unused) {
            }
            this.resolvedVehicleModel = INSTANCE.b(vin, fascia_type);
        }
        String str = this.connectionId;
        long j11 = this.gattConnectedTs;
        long j12 = this.mtuCompletedTs;
        long j13 = this.servicesDiscoveredTs;
        long j14 = this.charReadTs;
        long j15 = this.connectionEstablishedTs;
        long j16 = this.firstAuthAttemptTs;
        long j17 = this.lastAuthAttemptTs;
        long j18 = this.authResponseSentTs;
        long j19 = this.handlePulledWithoutAuthTs;
        boolean z11 = this.mtuTimedOut;
        long j21 = this.resetPeripheralDelayMs;
        boolean z12 = this.resetPeripheralWakeLockHeld;
        String str2 = this.failedPhase;
        String str3 = this.failureStatus;
        String str4 = this.sessionId;
        int i11 = this.attemptNumber;
        int i12 = this.rssi;
        boolean z13 = this.autoConnect;
        boolean zA = INSTANCE.a();
        String str5 = this.resolvedVehicleModel;
        if (str5 == null) {
            str5 = "";
        }
        return new ConnectionTimelinePayload(str, vin, j11, j12, j13, j14, j15, j16, j17, j18, j19, z11, j21, z12, str2, str3, str4, i11, i12, z13, zA, str5, this.authAttemptCount, bluetoothEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h() {
        return y.f77624a.g();
    }

    private final long r() {
        return System.currentTimeMillis();
    }

    public final synchronized void f(String vin, String phase, String status) {
        s.k(vin, "vin");
        s.k(phase, "phase");
        this.failedPhase = phase;
        this.failureStatus = status;
        g(vin);
    }

    public final synchronized void g(String vin) {
        s.k(vin, "vin");
        if (!this.emitted && this.gattConnectedTs != 0) {
            this.emitted = true;
            c.INSTANCE.a(e(vin, k.f62906a.a(this.bluetoothAdapter)));
        }
    }

    public final void i() {
        long jR = r();
        if (this.firstAuthAttemptTs == 0) {
            this.firstAuthAttemptTs = jR;
        }
        this.lastAuthAttemptTs = jR;
        this.authAttemptCount++;
    }

    public final void j() {
        this.authResponseSentTs = r();
    }

    public final void k() {
        this.charReadTs = r();
    }

    public final void l() {
        if (this.connectionEstablishedTs == 0) {
            this.connectionEstablishedTs = r();
        }
    }

    public final void m() {
        this.gattConnectedTs = r();
    }

    public final void n() {
        if (this.handlePulledWithoutAuthTs == 0) {
            this.handlePulledWithoutAuthTs = r();
        }
    }

    public final void o(boolean timedOut) {
        this.mtuCompletedTs = r();
        this.mtuTimedOut = timedOut;
    }

    public final void p() {
        this.servicesDiscoveredTs = r();
    }

    public final synchronized void q() {
        this.sessionCompleted = true;
    }

    public final synchronized void s(String newConnectionId) {
        try {
            s.k(newConnectionId, "newConnectionId");
            if (this.gattConnectedTs > 0 && !this.emitted) {
                g("");
            }
            long jR = r();
            long j11 = this.lastAttemptTimestamp;
            boolean z11 = j11 > 0 && jR - j11 > 60000;
            if (this.sessionCompleted || z11) {
                this.sessionId = UUID.randomUUID().toString();
                this.nextAttemptNumber = 0;
                this.sessionCompleted = false;
            }
            this.lastAttemptTimestamp = jR;
            int i11 = this.nextAttemptNumber;
            this.nextAttemptNumber = i11 + 1;
            this.attemptNumber = i11;
            this.connectionId = newConnectionId;
            this.gattConnectedTs = 0L;
            this.mtuCompletedTs = 0L;
            this.servicesDiscoveredTs = 0L;
            this.charReadTs = 0L;
            this.connectionEstablishedTs = 0L;
            this.firstAuthAttemptTs = 0L;
            this.lastAuthAttemptTs = 0L;
            this.authResponseSentTs = 0L;
            this.handlePulledWithoutAuthTs = 0L;
            this.mtuTimedOut = false;
            this.resetPeripheralDelayMs = 0L;
            this.resetPeripheralWakeLockHeld = false;
            this.failedPhase = null;
            this.failureStatus = null;
            this.rssi = -1000;
            this.autoConnect = false;
            this.resolvedVehicleModel = null;
            this.authAttemptCount = 0;
            this.emitted = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void t(boolean z11) {
        this.autoConnect = z11;
    }

    public final void u(int i11) {
        this.rssi = i11;
    }
}
