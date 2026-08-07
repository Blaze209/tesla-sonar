package ye0;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ie0.y;
import java.security.MessageDigest;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.g1;
import vc0.j2;
import vc0.n0;
import vc0.r;
import vc0.r0;
import vc0.v;
import vc0.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 M2\u00020\u0001:\u0002JFB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010'\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b-\u0010,J\u0017\u0010.\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b.\u0010,J\u0017\u0010/\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b/\u0010,J\u001f\u00102\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020)2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020)2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020)2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J%\u0010>\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020)2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0<¢\u0006\u0004\b>\u0010?J\u001d\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020@2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\f2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010L¨\u0006N"}, d2 = {"Lye0/n;", "", "Lmb0/a;", "dispatcher", "", "vin", "<init>", "(Lmb0/a;Ljava/lang/String;)V", "Lvc0/g1;", "requestType", "", "keyId", "Ljn0/h0;", "o", "(Lvc0/g1;[B)V", "Lvc0/r;", "authenticationResponse", "", "receivedRequestBytesTimestamp", "Lce0/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "h", "(Lvc0/r;JLce0/d;)V", "q", "()V", "Lvc0/z;", "cpdNotificationResponse", IntegerTokenConverter.CONVERTER_KEY, "(Lvc0/z;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "batteryLevelPercent", "Lvc0/v;", "batteryState", "Lvc0/j2;", "thermalState", "", "lowPowerModeEnabled", "k", "(Landroid/content/Context;ILvc0/v;Lvc0/j2;Z)V", "Lic0/f;", "source", "p", "(Lic0/f;)V", "u", "s", "r", "Lvc0/i;", "appEventLog", "g", "(Lic0/f;Lvc0/i;)V", "Lvc0/n0;", "firaCapabilities", "m", "(Lic0/f;Lvc0/n0;)V", "Lvc0/r0;", "firaResponse", "n", "(Lic0/f;Lvc0/r0;)V", "", "sessionIds", "t", "(Lic0/f;Ljava/util/List;)V", "Lic0/e;", "commandRequest", "e", "(Lic0/e;Lce0/d;)V", DateTokenConverter.CONVERTER_KEY, "(Lic0/e;)V", "a", "Lmb0/a;", "getDispatcher", "()Lmb0/a;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.tesla.logging.g f125460d = com.tesla.logging.g.INSTANCE.a("CommandRequestSender");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mb0.a dispatcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String vin;

    /* JADX INFO: renamed from: ye0.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lye0/n$a;", "", "<init>", "()V", "Lmb0/a;", "dispatcher", "", "vin", "Lye0/n;", "a", "(Lmb0/a;Ljava/lang/String;)Lye0/n;", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(mb0.a dispatcher, String vin) {
            s.k(dispatcher, "dispatcher");
            s.k(vin, "vin");
            return new n(dispatcher, vin, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lye0/n$b;", "Lce0/d;", "<init>", "()V", "Lic0/g;", "response", "Ljn0/h0;", "a", "(Lic0/g;)V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b implements ce0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f125463a = new b();

        private b() {
        }

        @Override // ce0.d
        public void a(ic0.g response) {
            s.k(response, "response");
        }
    }

    public /* synthetic */ n(mb0.a aVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str);
    }

    public static final n c(mb0.a aVar, String str) {
        return INSTANCE.a(aVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ic0.e eVar, ce0.d dVar, ic0.g response) {
        s.k(response, "response");
        f125460d.j("receiving " + ce0.c.b(eVar) + " for " + lb0.a.b(response.getResult()));
        dVar.a(response);
    }

    public static /* synthetic */ void l(n nVar, Context context, int i11, v vVar, j2 j2Var, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            vVar = v.BATTERY_STATE_UNKNOWN;
        }
        if ((i12 & 8) != 0) {
            j2Var = j2.PHONE_THERMAL_STATE_UNKNOWN;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        nVar.k(context, i11, vVar, j2Var, z11);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    public final void d(ic0.e commandRequest) {
        s.k(commandRequest, "commandRequest");
        e(commandRequest, b.f125463a);
    }

    public final void e(final ic0.e commandRequest, final ce0.d listener) {
        s.k(commandRequest, "commandRequest");
        s.k(listener, "listener");
        this.dispatcher.a(commandRequest, new ce0.d() { // from class: ye0.m
            @Override // ce0.d
            public final void a(ic0.g gVar) {
                n.f(commandRequest, listener, gVar);
            }
        });
    }

    public final void g(ic0.f source, vc0.i appEventLog) {
        s.k(source, "source");
        s.k(appEventLog, "appEventLog");
        d(ob0.e.f97095a.b(this.vin, source, appEventLog, "ble_app_event_log"));
    }

    public final void h(r authenticationResponse, long receivedRequestBytesTimestamp, ce0.d listener) {
        s.k(authenticationResponse, "authenticationResponse");
        s.k(listener, "listener");
        e(ob0.e.f97095a.c(this.vin, receivedRequestBytesTimestamp, authenticationResponse, "ble_authentication_response"), listener);
    }

    public final void i(z cpdNotificationResponse) {
        s.k(cpdNotificationResponse, "cpdNotificationResponse");
        d(ob0.e.f97095a.C(this.vin, cpdNotificationResponse, "ble_cpd_notification_response"));
    }

    public final void j(Context context) {
        s.k(context, "context");
        l(this, context, 0, null, null, false, 30, null);
    }

    public final void k(Context context, int batteryLevelPercent, v batteryState, j2 thermalState, boolean lowPowerModeEnabled) {
        okio.k kVarI;
        s.k(context, "context");
        s.k(batteryState, "batteryState");
        s.k(thermalState, "thermalState");
        try {
            String str = y.f77624a.g() ? "HARMONY_" : "";
            String str2 = str + Build.MODEL;
            okio.k.Companion companion = okio.k.INSTANCE;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str2.getBytes(p013kotlin.text.d.UTF_8);
            s.j(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            s.j(bArrDigest, "digest(...)");
            kVarI = okio.k.Companion.i(companion, bArrDigest, 0, 0, 3, null);
        } catch (Exception unused) {
            okio.k.Companion companion2 = okio.k.INSTANCE;
            byte[] bytes2 = "DEADBEEFDEADBEEFDEADBEEFDEADBEEFDEADBEEFDEADBEEFDEADBEEFDEADBEEF".getBytes(p013kotlin.text.d.UTF_8);
            s.j(bytes2, "getBytes(...)");
            kVarI = okio.k.Companion.i(companion2, bytes2, 0, 0, 3, null);
        }
        d(ob0.e.f97095a.D(this.vin, context, kVarI, batteryLevelPercent, batteryState, thermalState, lowPowerModeEnabled, "ble_device_info_response"));
    }

    public final void m(ic0.f source, n0 firaCapabilities) {
        s.k(source, "source");
        s.k(firaCapabilities, "firaCapabilities");
        d(ob0.e.f97095a.E(this.vin, source, firaCapabilities, "ble_fira_capabilities"));
    }

    public final void n(ic0.f source, r0 firaResponse) {
        s.k(source, "source");
        s.k(firaResponse, "firaResponse");
        d(ob0.e.f97095a.F(this.vin, source, firaResponse, "ble_fira_response"));
    }

    public final void o(g1 requestType, byte[] keyId) {
        s.k(requestType, "requestType");
        d(ob0.e.f97095a.Z(this.vin, requestType, keyId, "ble_information_request"));
    }

    public final void p(ic0.f source) {
        s.k(source, "source");
        d(ob0.e.f97095a.N(this.vin, source, "ble_lock"));
    }

    public final void q() {
        d(ob0.e.f97095a.S(this.vin, "ble_metadata_response"));
    }

    public final void r(ic0.f source) {
        s.k(source, "source");
        d(ob0.e.f97095a.V(this.vin, source, "ble_open_frunk"));
    }

    public final void s(ic0.f source) {
        s.k(source, "source");
        d(ob0.e.f97095a.X(this.vin, source, "ble_open_trunk"));
    }

    public final void t(ic0.f source, List<Integer> sessionIds) {
        s.k(source, "source");
        s.k(sessionIds, "sessionIds");
        d(ob0.e.f97095a.G(this.vin, source, sessionIds, "ble_fira_session_stopped"));
    }

    public final void u(ic0.f source) {
        s.k(source, "source");
        d(ob0.e.f97095a.o0(this.vin, source, "ble_unlock"));
    }

    private n(mb0.a aVar, String str) {
        this.dispatcher = aVar;
        this.vin = str;
    }
}
