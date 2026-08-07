package ee0;

import android.annotation.SuppressLint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.plaid.internal.EnumC4419g;
import com.tesla.logging.TeslaLog;
import com.tesla.sessionmanager.VehicleSessionInfo;
import fc0.u5;
import ic0.q;
import ie0.n;
import io.reactivex.rxjava3.core.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 P2\u00020\u0001:\u0005:IG<>B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010$\u001a*\u0012\u0004\u0012\u00020\u0011\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\"j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d`#0!2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010%J/\u0010(\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J1\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b.\u0010/J+\u00100\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00110!2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b0\u00101J1\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0006020,2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b3\u0010/J!\u00106\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010\u001d2\u0006\u00105\u001a\u00020\u001dH\u0002¢\u0006\u0004\b6\u00107J9\u0010:\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\b\u00108\u001a\u0004\u0018\u00010\u00112\u0006\u00109\u001a\u00020\u001aH\u0016¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010=J'\u0010>\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b>\u0010?J)\u0010@\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010AJ'\u0010B\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bB\u0010CJ7\u0010E\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bE\u0010FJ/\u0010G\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bG\u0010)J7\u0010I\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bI\u0010FJ\u001f\u0010J\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bJ\u0010KJ?\u0010N\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&2\u0006\u0010M\u001a\u00020\u0011H\u0016¢\u0006\u0004\bN\u0010OJ7\u0010P\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&2\u0006\u0010M\u001a\u00020\u0011H\u0016¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010RR\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010TRh\u0010W\u001aV\u0012\u0004\u0012\u00020\u0011\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\"j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d`#0\"j*\u0012\u0004\u0012\u00020\u0011\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\"j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d`#`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010VRh\u0010X\u001aV\u0012\u0004\u0012\u00020\u0011\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\"j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d`#0\"j*\u0012\u0004\u0012\u00020\u0011\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\"j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d`#`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010VR0\u0010Z\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020Y0\"j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020Y`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010VR0\u0010\\\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020[0\"j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020[`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010VR0\u0010^\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020]0\"j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020]`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010V¨\u0006_"}, d2 = {"Lee0/g;", "Lee0/a;", "Lee0/b;", "repository", "Lbe0/b;", "getSelectedProduct", "", "userPublicKey", "Lio/reactivex/rxjava3/core/o;", "Ljn0/s;", "publicKey", "<init>", "(Lee0/b;Lbe0/b;[BLio/reactivex/rxjava3/core/o;)V", "sourcePublicKey", "Ljn0/h0;", "x", "([B)V", "", "vin", "y", "(Ljava/lang/String;[B)V", "Lsc0/b;", "domain", "z", "(Ljava/lang/String;[BLsc0/b;)V", "publicKeyHex", "", "A", "(Ljava/lang/String;)Z", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "sessionInfo", "D", "(Ljava/lang/String;Lsc0/b;[BLcom/tesla/sessionmanager/VehicleSessionInfo;)V", "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "v", "(Lsc0/b;)Ljava/util/Map;", "Lic0/q;", "transport", "B", "(Ljava/lang/String;[BLsc0/b;Lic0/q;)Z", "w", "(Ljava/lang/String;[BLsc0/b;Lic0/q;)Ljava/lang/String;", "", "Lee0/g$f;", "s", "(Lsc0/b;Lic0/q;)Ljava/util/Set;", "u", "(Lsc0/b;Lic0/q;)Ljava/util/Map;", "Lkotlin/Pair;", "t", "old", "new", "C", "(Lcom/tesla/sessionmanager/VehicleSessionInfo;Lcom/tesla/sessionmanager/VehicleSessionInfo;)Lcom/tesla/sessionmanager/VehicleSessionInfo;", "requestId", "persist", DateTokenConverter.CONVERTER_KEY, "(Lcom/tesla/sessionmanager/VehicleSessionInfo;Ljava/lang/String;[BLjava/lang/String;Z)V", "e", "(Lsc0/b;Ljava/lang/String;[B)V", "b", "(Lsc0/b;[BLjava/lang/String;)V", "g", "(Lsc0/b;Ljava/lang/String;[B)Lcom/tesla/sessionmanager/VehicleSessionInfo;", "l", "(Lsc0/b;[BLjava/lang/String;)Z", "fetching", "h", "(ZLjava/lang/String;[BLsc0/b;Lic0/q;)V", "c", "confirmed", "f", "a", "(Ljava/lang/String;Lic0/q;)V", "inFlight", "ownerCommandId", "j", "(ZLjava/lang/String;[BLsc0/b;Lic0/q;Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;[BLsc0/b;Lic0/q;Ljava/lang/String;)Z", "Lee0/b;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/util/HashMap;", "vinToSourcePublicKeyToVCSEC", "vinToSourcePublicKeyInfotainment", "Lee0/g$d;", "fetchingSessionInfoStates", "Lee0/g$c;", "sessionInfoConfirmed", "Lee0/g$e;", "signingInFlightStates", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CheckResult"})
public final class g implements ee0.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final com.tesla.logging.g f62854j = com.tesla.logging.g.INSTANCE.a("SessionInfoManager");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b repository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ReentrantReadWriteLock lock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, HashMap<byte[], VehicleSessionInfo>> vinToSourcePublicKeyToVCSEC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, HashMap<byte[], VehicleSessionInfo>> vinToSourcePublicKeyInfotainment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final HashMap<q, d> fetchingSessionInfoStates;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final HashMap<q, c> sessionInfoConfirmed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final HashMap<q, e> signingInFlightStates;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<T1, T2, R> implements cm0.c {
        a() {
        }

        public final void a(u5 vehicle, Object obj) {
            s.k(vehicle, "vehicle");
            String strV = wb0.e.v(vehicle);
            if (strV == null) {
                return;
            }
            if (jn0.s.g(obj)) {
                obj = null;
            }
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                return;
            }
            g.f62854j.j("vehicle selected, attempting to hydrate for " + strV + " user key " + n.e(bArr, 0, 1, null));
            g.this.y(strV, bArr);
        }

        @Override // cm0.c
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            a((u5) obj, ((jn0.s) obj2).getValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR'\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\r"}, d2 = {"Lee0/g$c;", "", "<init>", "()V", "Ljava/util/HashSet;", "Lee0/g$f;", "Lkotlin/collections/HashSet;", "a", "Ljava/util/HashSet;", "b", "()Ljava/util/HashSet;", "vcsec", "infotainment", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HashSet<SigningGateKey> vcsec = new HashSet<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final HashSet<SigningGateKey> infotainment = new HashSet<>();

        public final HashSet<SigningGateKey> a() {
            return this.infotainment;
        }

        public final HashSet<SigningGateKey> b() {
            return this.vcsec;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R?\u0010\r\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR?\u0010\u000e\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005`\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u000f"}, d2 = {"Lee0/g$d;", "", "<init>", "()V", "Ljava/util/HashSet;", "Lkotlin/Pair;", "", "", "Lkotlin/collections/HashSet;", "a", "Ljava/util/HashSet;", "b", "()Ljava/util/HashSet;", "fetchingVCSEC", "fetchingInfotainment", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HashSet<Pair<String, byte[]>> fetchingVCSEC = new HashSet<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final HashSet<Pair<String, byte[]>> fetchingInfotainment = new HashSet<>();

        public final HashSet<Pair<String, byte[]>> a() {
            return this.fetchingInfotainment;
        }

        public final HashSet<Pair<String, byte[]>> b() {
            return this.fetchingVCSEC;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R3\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR3\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\u000e"}, d2 = {"Lee0/g$e;", "", "<init>", "()V", "Ljava/util/HashMap;", "Lee0/g$f;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "b", "()Ljava/util/HashMap;", "vcsec", "infotainment", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HashMap<SigningGateKey, String> vcsec = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final HashMap<SigningGateKey, String> infotainment = new HashMap<>();

        public final HashMap<SigningGateKey, String> a() {
            return this.infotainment;
        }

        public final HashMap<SigningGateKey, String> b() {
            return this.vcsec;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ee0.g$f, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lee0/g$f;", "", "", "vin", "publicKeyHex", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getPublicKeyHex", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class SigningGateKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String publicKeyHex;

        public SigningGateKey(String vin, String publicKeyHex) {
            s.k(vin, "vin");
            s.k(publicKeyHex, "publicKeyHex");
            this.vin = vin;
            this.publicKeyHex = publicKeyHex;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SigningGateKey)) {
                return false;
            }
            SigningGateKey signingGateKey = (SigningGateKey) other;
            return s.f(this.vin, signingGateKey.vin) && s.f(this.publicKeyHex, signingGateKey.publicKeyHex);
        }

        public int hashCode() {
            return (this.vin.hashCode() * 31) + this.publicKeyHex.hashCode();
        }

        public String toString() {
            return "SigningGateKey(vin=" + this.vin + ", publicKeyHex=" + this.publicKeyHex + ")";
        }
    }

    /* JADX INFO: renamed from: ee0.g$g, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C1288g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62871a;

        static {
            int[] iArr = new int[sc0.b.values().length];
            try {
                iArr[sc0.b.DOMAIN_VEHICLE_SECURITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sc0.b.DOMAIN_INFOTAINMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sc0.b.DOMAIN_AUTHD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sc0.b.DOMAIN_BROADCAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[sc0.b.DOMAIN_ENERGY_DEVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[sc0.b.DOMAIN_ENERGY_DEVICE_AUTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f62871a = iArr;
        }
    }

    public g(b repository, be0.b getSelectedProduct, byte[] bArr, o<jn0.s<byte[]>> publicKey) {
        s.k(repository, "repository");
        s.k(getSelectedProduct, "getSelectedProduct");
        s.k(publicKey, "publicKey");
        this.repository = repository;
        this.lock = new ReentrantReadWriteLock();
        this.vinToSourcePublicKeyToVCSEC = new HashMap<>();
        this.vinToSourcePublicKeyInfotainment = new HashMap<>();
        HashMap<q, d> map = new HashMap<>();
        this.fetchingSessionInfoStates = map;
        HashMap<q, c> map2 = new HashMap<>();
        this.sessionInfoConfirmed = map2;
        HashMap<q, e> map3 = new HashMap<>();
        this.signingInFlightStates = map3;
        q qVar = q.TRANSPORT_BLUETOOTH;
        map.put(qVar, new d());
        q qVar2 = q.TRANSPORT_HERMES;
        map.put(qVar2, new d());
        q qVar3 = q.TRANSPORT_SIGNED_OAPI;
        map.put(qVar3, new d());
        map2.put(qVar, new c());
        map2.put(qVar2, new c());
        map2.put(qVar3, new c());
        map3.put(qVar, new e());
        map3.put(qVar2, new e());
        map3.put(qVar3, new e());
        o.c(getSelectedProduct.c(), publicKey, new a());
        if (bArr != null) {
            x(bArr);
        }
    }

    private final boolean A(String publicKeyHex) {
        try {
            return rb0.a.p(n.f(publicKeyHex)) != null;
        } catch (Exception e11) {
            f62854j.d("Error validating public key: " + publicKeyHex, e11);
            return false;
        }
    }

    private final boolean B(String vin, byte[] sourcePublicKey, sc0.b domain, q transport) {
        return s(domain, transport).contains(new SigningGateKey(vin, n.e(sourcePublicKey, 0, 1, null)));
    }

    private final VehicleSessionInfo C(VehicleSessionInfo old, VehicleSessionInfo vehicleSessionInfo) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            f62854j.a("merging session information. older " + old + " with newer " + vehicleSessionInfo);
            if (old == null) {
                while (i11 < readHoldCount) {
                    lock.lock();
                    i11++;
                }
                writeLock.unlock();
                return vehicleSessionInfo;
            }
            if (!s.f(old.getEpochHex(), vehicleSessionInfo.getEpochHex())) {
                while (i11 < readHoldCount) {
                    lock.lock();
                    i11++;
                }
                writeLock.unlock();
                return vehicleSessionInfo;
            }
            VehicleSessionInfo vehicleSessionInfoCopy$default = VehicleSessionInfo.copy$default(vehicleSessionInfo, null, 0, Math.max(old.getCounter(), vehicleSessionInfo.getCounter()), 0, null, vehicleSessionInfo.getClockTime() >= old.getClockTime() ? ((int) (System.currentTimeMillis() / ((long) 1000))) - vehicleSessionInfo.getClockTime() : old.getEpochStartSeconds(), null, null, EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE, null);
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
            return vehicleSessionInfoCopy$default;
        } catch (Throwable th2) {
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    private final void D(String vin, sc0.b domain, byte[] sourcePublicKey, VehicleSessionInfo sessionInfo) {
        this.repository.c(vin, sourcePublicKey, domain, sessionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(String str, SigningGateKey it) {
        s.k(it, "it");
        return s.f(it.getVin(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(String str, SigningGateKey it) {
        s.k(it, "it");
        return s.f(it.getVin(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap G(String it) {
        s.k(it, "it");
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap H(l lVar, Object obj) {
        return (HashMap) lVar.invoke(obj);
    }

    private final Set<SigningGateKey> s(sc0.b domain, q transport) {
        c cVar = this.sessionInfoConfirmed.get(transport);
        if (cVar == null) {
            return new LinkedHashSet();
        }
        switch (C1288g.f62871a[domain.ordinal()]) {
            case 1:
                return cVar.b();
            case 2:
                return cVar.a();
            case 3:
            case 4:
            case 5:
            case 6:
                return new LinkedHashSet();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Set<Pair<String, byte[]>> t(sc0.b domain, q transport) {
        d dVar = this.fetchingSessionInfoStates.get(transport);
        if (dVar == null) {
            return new LinkedHashSet();
        }
        switch (C1288g.f62871a[domain.ordinal()]) {
            case 1:
                return dVar.b();
            case 2:
                return dVar.a();
            case 3:
            case 4:
            case 5:
            case 6:
                return new LinkedHashSet();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Map<SigningGateKey, String> u(sc0.b domain, q transport) {
        e eVar = this.signingInFlightStates.get(transport);
        if (eVar == null) {
            return new LinkedHashMap();
        }
        switch (C1288g.f62871a[domain.ordinal()]) {
            case 1:
                return eVar.b();
            case 2:
                return eVar.a();
            case 3:
            case 4:
            case 5:
            case 6:
                return new LinkedHashMap();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final Map<String, HashMap<byte[], VehicleSessionInfo>> v(sc0.b domain) {
        switch (C1288g.f62871a[domain.ordinal()]) {
            case 1:
                return this.vinToSourcePublicKeyToVCSEC;
            case 2:
                return this.vinToSourcePublicKeyInfotainment;
            case 3:
            case 4:
            case 5:
            case 6:
                return new LinkedHashMap();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String w(String vin, byte[] sourcePublicKey, sc0.b domain, q transport) {
        return u(domain, transport).get(new SigningGateKey(vin, n.e(sourcePublicKey, 0, 1, null)));
    }

    private final void x(byte[] sourcePublicKey) {
        String str = (String) v.q0(qb0.a.INSTANCE.b().w());
        if (str == null) {
            f62854j.j("No selected VIN to get persisted session info");
        } else {
            f62854j.j("hydrating session info from storage...");
            y(str, sourcePublicKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(String vin, byte[] sourcePublicKey) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            z(vin, sourcePublicKey, sc0.b.DOMAIN_INFOTAINMENT);
            z(vin, sourcePublicKey, sc0.b.DOMAIN_VEHICLE_SECURITY);
            h0 h0Var = h0.f84049a;
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
        } finally {
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    private final void z(String vin, byte[] sourcePublicKey, sc0.b domain) {
        HashMap<byte[], VehicleSessionInfo> map = v(domain).get(vin);
        if ((map != null ? map.get(sourcePublicKey) : null) != null) {
            f62854j.a("not hydrating " + domain + " session info for " + vin + " " + n.e(sourcePublicKey, 0, 1, null) + " because it already exists.");
            return;
        }
        VehicleSessionInfo vehicleSessionInfoB = this.repository.b(vin, sourcePublicKey, domain);
        if (vehicleSessionInfoB == null) {
            f62854j.a("No " + domain + " session info for " + vin + " " + n.e(sourcePublicKey, 0, 1, null) + " was previously persisted");
            return;
        }
        if (!A(vehicleSessionInfoB.getPublicKeyHex())) {
            f62854j.n("Clearing persisted " + domain + " session info for " + vin + " - invalid public key: " + vehicleSessionInfoB.getPublicKeyHex());
            this.repository.a(vin, sourcePublicKey, domain);
            return;
        }
        f62854j.j("Successfully hydrated " + domain + " session info for " + vin + " " + n.e(sourcePublicKey, 0, 1, null) + " -> " + vehicleSessionInfoB);
        d(vehicleSessionInfoB, vin, sourcePublicKey, null, false);
    }

    @Override // ee0.a
    public void a(final String vin, q transport) {
        s.k(vin, "vin");
        s.k(transport, "transport");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            for (sc0.b bVar : v.p(sc0.b.DOMAIN_VEHICLE_SECURITY, sc0.b.DOMAIN_INFOTAINMENT)) {
                v.J(s(bVar, transport), new l() { // from class: ee0.e
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(g.E(vin, (g.SigningGateKey) obj));
                    }
                });
                v.J(u(bVar, transport).keySet(), new l() { // from class: ee0.f
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(g.F(vin, (g.SigningGateKey) obj));
                    }
                });
            }
            f62854j.j("resetSessionInfoConfirmedForVin vin:" + vin + " transport:" + transport);
            h0 h0Var = h0.f84049a;
        } finally {
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ee0.a
    public void b(sc0.b domain, byte[] sourcePublicKey, String vin) {
        s.k(domain, "domain");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(vin, "vin");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            f62854j.a("clearing session info " + domain + " " + n.e(sourcePublicKey, 0, 1, null) + " " + vin);
            HashMap<byte[], VehicleSessionInfo> map = v(domain).get(vin);
            if (map != null) {
                map.remove(sourcePublicKey);
            }
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
        } finally {
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ee0.a
    public boolean c(String vin, byte[] sourcePublicKey, sc0.b domain, q transport) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        s.k(transport, "transport");
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            return t(domain, transport).contains(new Pair(vin, sourcePublicKey));
        } finally {
            lock.unlock();
        }
    }

    @Override // ee0.a
    public void d(VehicleSessionInfo sessionInfo, String vin, byte[] sourcePublicKey, String requestId, boolean persist) {
        s.k(sessionInfo, "sessionInfo");
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        sc0.b domain = sessionInfo.getDomain();
        sessionInfo.setRequestId(requestId);
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Map<String, HashMap<byte[], VehicleSessionInfo>> mapV = v(domain);
            VehicleSessionInfo vehicleSessionInfoG = g(domain, vin, sourcePublicKey);
            VehicleSessionInfo vehicleSessionInfoC = C(vehicleSessionInfoG, sessionInfo);
            final l lVar = new l() { // from class: ee0.c
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return g.G((String) obj);
                }
            };
            HashMap<byte[], VehicleSessionInfo> mapComputeIfAbsent = mapV.computeIfAbsent(vin, new Function() { // from class: ee0.d
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return g.H(lVar, obj);
                }
            });
            s.j(mapComputeIfAbsent, "computeIfAbsent(...)");
            mapComputeIfAbsent.put(sourcePublicKey, vehicleSessionInfoC);
            if (persist && !s.f(vehicleSessionInfoG, vehicleSessionInfoC)) {
                D(vin, domain, sourcePublicKey, sessionInfo);
            }
            h0 h0Var = h0.f84049a;
        } finally {
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ee0.a
    public void e(sc0.b domain, String vin, byte[] sourcePublicKey) {
        s.k(domain, "domain");
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            HashMap<byte[], VehicleSessionInfo> map = v(domain).get(vin);
            VehicleSessionInfo vehicleSessionInfo = map != null ? map.get(sourcePublicKey) : null;
            if (vehicleSessionInfo == null) {
                com.tesla.logging.g gVar = f62854j;
                String str = "no " + domain + " session info found for " + vin + " " + n.e(sourcePublicKey, 0, 1, null) + ", can't persist anything!";
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g(str);
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
            } else {
                D(vin, domain, sourcePublicKey, vehicleSessionInfo);
            }
            h0 h0Var = h0.f84049a;
        } finally {
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ee0.a
    public void f(boolean confirmed, String vin, byte[] sourcePublicKey, sc0.b domain, q transport) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        s.k(transport, "transport");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            SigningGateKey signingGateKey = new SigningGateKey(vin, n.e(sourcePublicKey, 0, 1, null));
            if (confirmed) {
                s(domain, transport).add(signingGateKey);
                u(domain, transport).remove(signingGateKey);
            } else {
                s(domain, transport).remove(signingGateKey);
            }
            f62854j.j("setSessionInfoConfirmed confirmed:" + confirmed + " domain:" + domain + " vin:" + vin);
            h0 h0Var = h0.f84049a;
        } finally {
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ee0.a
    public VehicleSessionInfo g(sc0.b domain, String vin, byte[] sourcePublicKey) {
        s.k(domain, "domain");
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            HashMap<byte[], VehicleSessionInfo> map = v(domain).get(vin);
            return map != null ? map.get(sourcePublicKey) : null;
        } finally {
            lock.unlock();
        }
    }

    @Override // ee0.a
    public void h(boolean fetching, String vin, byte[] sourcePublicKey, sc0.b domain, q transport) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        s.k(transport, "transport");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Set<Pair<String, byte[]>> setT = t(domain, transport);
            if (fetching) {
                f62854j.a("started fetching session info " + domain + " " + transport + " " + vin + " " + n.e(sourcePublicKey, 0, 1, null));
                setT.add(new Pair<>(vin, sourcePublicKey));
            } else {
                f62854j.a("stopped fetching session info " + domain + " " + transport + " " + vin + " " + n.e(sourcePublicKey, 0, 1, null));
                setT.remove(new Pair(vin, sourcePublicKey));
            }
        } finally {
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ee0.a
    public boolean i(String vin, byte[] sourcePublicKey, sc0.b domain, q transport, String ownerCommandId) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        s.k(transport, "transport");
        s.k(ownerCommandId, "ownerCommandId");
        if (!com.tesla.features.a.a().getSigningGate().getEnabledAndMeetsVersionThreshold() || transport != q.TRANSPORT_BLUETOOTH) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            String strW = w(vin, sourcePublicKey, domain, transport);
            if (strW == null || s.f(strW, ownerCommandId) || B(vin, sourcePublicKey, domain, transport)) {
                j(true, vin, sourcePublicKey, domain, transport, ownerCommandId);
                return true;
            }
            int i13 = 0;
            return false;
        } finally {
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ee0.a
    public void j(boolean inFlight, String vin, byte[] sourcePublicKey, sc0.b domain, q transport, String ownerCommandId) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        s.k(transport, "transport");
        s.k(ownerCommandId, "ownerCommandId");
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            SigningGateKey signingGateKey = new SigningGateKey(vin, n.e(sourcePublicKey, 0, 1, null));
            Map<SigningGateKey, String> mapU = u(domain, transport);
            if (inFlight) {
                mapU.put(signingGateKey, ownerCommandId);
            } else if (!mapU.containsKey(signingGateKey)) {
                f62854j.a("signing in-flight already cleared for commandId:" + ownerCommandId + " domain:" + domain + " vin:" + vin);
            } else if (s.f(mapU.get(signingGateKey), ownerCommandId)) {
                mapU.remove(signingGateKey);
            } else {
                f62854j.a("not clearing signing in-flight for non-owner commandId:" + ownerCommandId + " domain:" + domain + " vin:" + vin);
            }
            f62854j.j("setSigningInFlight inFlight:" + inFlight + " domain:" + domain + " vin:" + vin + " ownerCommandId:" + ownerCommandId);
            h0 h0Var = h0.f84049a;
        } finally {
            while (i11 < readHoldCount) {
                lock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ee0.a
    public boolean l(sc0.b domain, byte[] sourcePublicKey, String vin) {
        s.k(domain, "domain");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(vin, "vin");
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        lock.lock();
        try {
            HashMap<byte[], VehicleSessionInfo> map = v(domain).get(vin);
            return map != null ? map.containsKey(sourcePublicKey) : false;
        } finally {
            lock.unlock();
        }
    }
}
