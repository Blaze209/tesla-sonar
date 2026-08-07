package com.teslamotors.plugins.ble;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ezvcard.property.Gender;
import java.lang.ref.WeakReference;
import java.security.KeyPair;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import vc0.e3;
import vc0.k3;
import vc0.l3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000b\u0018\u0000 h2\u00020\u0001:\u0001)B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u0019\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J+\u0010.\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010+2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00100R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R$\u00108\u001a\u0002032\u0006\u00104\u001a\u0002038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010\u000eR\u001e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010]\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R4\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040^2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040^8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010`\"\u0004\ba\u0010bR\u0016\u0010d\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010cR\u0016\u0010g\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006i"}, d2 = {"Lcom/teslamotors/plugins/ble/a2;", "Lcom/teslamotors/plugins/ble/h0;", "Lcom/teslamotors/plugins/ble/q1;", "vehicleController", "", "vin", Scopes.EMAIL, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/teslamotors/plugins/ble/q1;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "Lcom/teslamotors/plugins/ble/i0;", "state", "Ljn0/h0;", "I", "(Lcom/teslamotors/plugins/ble/i0;)V", "Q", "()V", "V", "message", "", "t", "L", "(Ljava/lang/String;Ljava/lang/Throwable;)V", Gender.MALE, "(Ljava/lang/String;)V", "P", "start", "e", "Lcom/teslamotors/plugins/ble/Peripheral;", "peripheral", "b", "(Lcom/teslamotors/plugins/ble/Peripheral;)V", "c", "Lcom/teslamotors/plugins/ble/h0$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "l", "(Lcom/teslamotors/plugins/ble/h0$c;)V", "", "token", "remoteKey", "a", "([B[B)[B", "Lvc0/w0;", "", "receivedBytesTimestamp", "f", "(Lvc0/w0;Lcom/teslamotors/plugins/ble/Peripheral;J)V", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "", "value", "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "onWhitelist", "Ljava/security/PublicKey;", "Ljava/security/PublicKey;", "publicKeyLocal", "g", "[B", "keyID", "h", "Lcom/teslamotors/plugins/ble/i0;", "currentState", "loadedLocalKeys", "Landroid/os/Handler;", "j", "Landroid/os/Handler;", "handler", "", "k", "numberOfKeysOnWhitelist", "", "Ljava/util/List;", "whitelistKeys", "Lrb0/a;", "m", "Lrb0/a;", "cryptoManager", "Ljava/lang/ref/WeakReference;", "n", "Ljava/lang/ref/WeakReference;", "Ljava/lang/Runnable;", "o", "Ljava/lang/Runnable;", "timeoutRunnable", "Lcom/teslamotors/plugins/ble/h0$d;", "p", "Lcom/teslamotors/plugins/ble/h0$d;", "getType", "()Lcom/teslamotors/plugins/ble/h0$d;", "type", "", "keyIDs", "()Ljava/util/Set;", "T", "(Ljava/util/Set;)V", "()Ljava/lang/String;", "publicKeyHash", "getPublicKey", "()[B", "publicKey", "q", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a2 implements h0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final com.tesla.logging.g f56711r = com.tesla.logging.g.INSTANCE.a("VehicleStateMachine");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set<i0> f56712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set<i0> f56713t;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String vin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String email;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean onWhitelist;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private PublicKey publicKeyLocal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private byte[] keyID;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private i0 currentState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean loadedLocalKeys;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int numberOfKeysOnWhitelist;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private List<byte[]> whitelistKeys;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final rb0.a cryptoManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<q1> vehicleController;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Runnable timeoutRunnable;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final h0.d type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56729a;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.LOAD_PUBLIC_KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.CONNECT_TO_PERIPHERAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i0.CONNECTION_ESTABLISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i0.CONNECTED_IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[i0.UNINITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[i0.IDLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[i0.WAITING_FOR_PERIPHERAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f56729a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/teslamotors/plugins/ble/a2$c", "Ljava/lang/Runnable;", "Ljn0/h0;", "run", "()V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vc0.w0 f56731b;

        c(vc0.w0 w0Var) {
            this.f56731b = w0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(a2 a2Var) {
            q1 q1Var = (q1) a2Var.vehicleController.get();
            if (q1Var != null) {
                q1Var.b0("native_not_on_whitelist_upon_connection_routable");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            q1 q1Var = (q1) a2.this.vehicleController.get();
            if (q1Var == null) {
                return;
            }
            l3 whitelistInfo = this.f56731b.getWhitelistInfo();
            if (whitelistInfo != null) {
                boolean onWhitelist = a2.this.getOnWhitelist();
                a2.this.onWhitelist = false;
                a2.this.numberOfKeysOnWhitelist = Math.min(whitelistInfo.getNumberOfEntries(), whitelistInfo.e().size());
                a2.this.whitelistKeys.clear();
                a2 a2Var = a2.this;
                p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
                String str = String.format("Received whitelist message with %s entries", Arrays.copyOf(new Object[]{Integer.valueOf(a2Var.numberOfKeysOnWhitelist)}, 1));
                p013kotlin.jvm.internal.s.j(str, "format(...)");
                a2Var.M(str);
                int i11 = a2.this.numberOfKeysOnWhitelist;
                for (int i12 = 0; i12 < i11; i12++) {
                    vc0.i1 i1Var = whitelistInfo.e().get(i12);
                    if (i1Var.getPublicKeySHA1() != okio.k.f97943e) {
                        byte[] bArrJ = i1Var.getPublicKeySHA1().J();
                        a2.this.whitelistKeys.add(bArrJ);
                        if (Arrays.equals(bArrJ, a2.this.keyID)) {
                            a2.this.onWhitelist = true;
                        }
                        a2 a2Var2 = a2.this;
                        p013kotlin.jvm.internal.t0 t0Var2 = p013kotlin.jvm.internal.t0.f86535a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArrJ, 4);
                        p013kotlin.jvm.internal.s.j(bArrCopyOf, "copyOf(...)");
                        String str2 = String.format("Whitelist Entry %s", Arrays.copyOf(new Object[]{ie0.q0.b(bArrCopyOf)}, 1));
                        p013kotlin.jvm.internal.s.j(str2, "format(...)");
                        a2Var2.M(str2);
                    }
                }
                if (onWhitelist && a2.this.getOnWhitelist()) {
                    a2 a2Var3 = a2.this;
                    p013kotlin.jvm.internal.t0 t0Var3 = p013kotlin.jvm.internal.t0.f86535a;
                    String str3 = String.format("[%s] already in whitelist!", Arrays.copyOf(new Object[]{ie0.q0.b(a2Var3.keyID)}, 1));
                    p013kotlin.jvm.internal.s.j(str3, "format(...)");
                    a2Var3.M(str3);
                } else if (a2.this.getOnWhitelist()) {
                    a2 a2Var4 = a2.this;
                    p013kotlin.jvm.internal.t0 t0Var4 = p013kotlin.jvm.internal.t0.f86535a;
                    String str4 = String.format("Found [%s] in whitelist!", Arrays.copyOf(new Object[]{ie0.q0.b(a2Var4.keyID)}, 1));
                    p013kotlin.jvm.internal.s.j(str4, "format(...)");
                    a2Var4.M(str4);
                } else {
                    a2 a2Var5 = a2.this;
                    p013kotlin.jvm.internal.t0 t0Var5 = p013kotlin.jvm.internal.t0.f86535a;
                    String str5 = String.format("Did NOT find key [%s] in whitelist!", Arrays.copyOf(new Object[]{ie0.q0.b(a2Var5.keyID)}, 1));
                    p013kotlin.jvm.internal.s.j(str5, "format(...)");
                    a2Var5.M(str5);
                    if (q1Var.m()) {
                        a2.this.M("Staying connected while unauthorized");
                    } else {
                        a2.this.M("Clearing peripheral...");
                        Handler handler = a2.this.handler;
                        final a2 a2Var6 = a2.this;
                        handler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.b2
                            @Override // java.lang.Runnable
                            public final void run() {
                                a2.c.b(a2Var6);
                            }
                        });
                    }
                }
                he0.b.m(a2.this.context).S(a2.this.vin, a2.this.email, a2.this.d());
                a2.this.V();
            }
            k3 whitelistEntryInfo = this.f56731b.getWhitelistEntryInfo();
            if (whitelistEntryInfo == null || whitelistEntryInfo.getKeyId() == null) {
                return;
            }
            vc0.i1 keyId = whitelistEntryInfo.getKeyId();
            a2 a2Var7 = a2.this;
            p013kotlin.jvm.internal.t0 t0Var6 = p013kotlin.jvm.internal.t0.f86535a;
            p013kotlin.jvm.internal.s.h(keyId);
            byte[] bArrCopyOf2 = Arrays.copyOf(keyId.getPublicKeySHA1().J(), 4);
            p013kotlin.jvm.internal.s.j(bArrCopyOf2, "copyOf(...)");
            String str6 = String.format("Whitelist Entry Information found for key [%s]", Arrays.copyOf(new Object[]{ie0.q0.b(bArrCopyOf2)}, 1));
            p013kotlin.jvm.internal.s.j(str6, "format(...)");
            a2Var7.M(str6);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/teslamotors/plugins/ble/a2$d", "Ljava/lang/Runnable;", "Ljn0/h0;", "run", "()V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            q1 q1Var = (q1) a2.this.vehicleController.get();
            if (q1Var == null) {
                return;
            }
            i0 i0Var = a2.this.currentState;
            if (!a2.f56712s.contains(i0Var) || q1Var.z() == df0.c.CONNECTED) {
                return;
            }
            if (q1Var.n0()) {
                a2 a2Var = a2.this;
                p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
                String str = String.format("Timed out in state %s. Still connected, retrying.", Arrays.copyOf(new Object[]{i0Var.name()}, 1));
                p013kotlin.jvm.internal.s.j(str, "format(...)");
                a2Var.M(str);
                a2.this.I(i0.CONNECT_TO_PERIPHERAL);
                return;
            }
            a2 a2Var2 = a2.this;
            p013kotlin.jvm.internal.t0 t0Var2 = p013kotlin.jvm.internal.t0.f86535a;
            String str2 = String.format("Timed out in state %s. No connection, cancelling retries", Arrays.copyOf(new Object[]{i0Var.name()}, 1));
            p013kotlin.jvm.internal.s.j(str2, "format(...)");
            a2Var2.M(str2);
            a2.this.I(i0.IDLE);
        }
    }

    static {
        i0 i0Var = i0.WAITING_FOR_PERIPHERAL;
        f56712s = p013kotlin.collections.d1.e(i0Var);
        f56713t = p013kotlin.collections.d1.e(i0.UNINITIALIZED, i0.IDLE, i0Var, i0.CONNECTED_IDLE);
    }

    public a2(q1 vehicleController, String vin, String email, Context context) {
        p013kotlin.jvm.internal.s.k(vehicleController, "vehicleController");
        p013kotlin.jvm.internal.s.k(vin, "vin");
        p013kotlin.jvm.internal.s.k(email, "email");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.vin = vin;
        this.email = email;
        this.context = context;
        this.whitelistKeys = new CopyOnWriteArrayList();
        this.currentState = i0.UNINITIALIZED;
        this.handler = new Handler(Looper.getMainLooper());
        this.cryptoManager = rb0.a.l();
        this.vehicleController = new WeakReference<>(vehicleController);
        M("created state machine!");
        this.timeoutRunnable = new d();
        this.type = h0.d.ROUTABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(i0 state) throws Throwable {
        p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
        String str = String.format("State Change: %s -> %s", Arrays.copyOf(new Object[]{this.currentState, state}, 2));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        M(str);
        boolean z11 = this.currentState != state;
        this.currentState = state;
        if (z11 || !f56713t.contains(state)) {
            Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(a2 a2Var) throws Throwable {
        a2Var.M("connectionEstablished - in state " + a2Var.currentState);
        a2Var.I(i0.CONNECTION_ESTABLISHED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(a2 a2Var) throws Throwable {
        a2Var.M("connectionLost - in state " + a2Var.currentState);
        a2Var.handler.removeCallbacks(a2Var.timeoutRunnable);
        a2Var.I(i0.CONNECT_TO_PERIPHERAL);
    }

    private final void L(String message, Throwable t11) {
        q1 q1Var = this.vehicleController.get();
        if (q1Var != null) {
            p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
            String str = String.format("[Logic Error] %s", Arrays.copyOf(new Object[]{message}, 1));
            p013kotlin.jvm.internal.s.j(str, "format(...)");
            q1Var.p(str, t11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String message) {
        q1 q1Var = this.vehicleController.get();
        if (q1Var != null) {
            p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
            String str = String.format("[Logic] %s", Arrays.copyOf(new Object[]{message}, 1));
            p013kotlin.jvm.internal.s.j(str, "format(...)");
            q1Var.E(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(a2 a2Var, Peripheral peripheral) throws Throwable {
        i0 i0Var;
        i0 i0Var2;
        q1 q1Var = a2Var.vehicleController.get();
        if (q1Var == null) {
            return;
        }
        p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
        String str = String.format("%s Found peripheral - in state %s", Arrays.copyOf(new Object[]{peripheral, a2Var.currentState}, 2));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        a2Var.M(str);
        if (q1Var.r() || (i0Var = a2Var.currentState) == i0.WAITING_FOR_PERIPHERAL || i0Var == (i0Var2 = i0.CONNECT_TO_PERIPHERAL)) {
            return;
        }
        a2Var.M("mVehicleController peripheral has not established connection... Connecting");
        a2Var.I(i0Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(a2 a2Var, h0.c cVar) throws Throwable {
        he0.b bVarM = he0.b.m(a2Var.context);
        bVarM.R(a2Var.vin, a2Var.email, 0L);
        bVarM.S(a2Var.vin, a2Var.email, p013kotlin.collections.d1.d());
        a2Var.onWhitelist = false;
        a2Var.numberOfKeysOnWhitelist = 0;
        a2Var.whitelistKeys.clear();
        a2Var.M("Cleared whitelist state.");
        a2Var.I(i0.IDLE);
        cVar.onReset();
    }

    private final void P() {
        this.handler.removeCallbacks(this.timeoutRunnable);
        this.handler.postDelayed(this.timeoutRunnable, 2000L);
    }

    private final void Q() throws Throwable {
        KeyPair keyPairN;
        q1 q1Var = this.vehicleController.get();
        p013kotlin.jvm.internal.t0 t0Var = p013kotlin.jvm.internal.t0.f86535a;
        String str = String.format("State: %s", Arrays.copyOf(new Object[]{this.currentState}, 1));
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        M(str);
        switch (b.f56729a[this.currentState.ordinal()]) {
            case 1:
                if (!this.loadedLocalKeys) {
                    try {
                        keyPairN = this.cryptoManager.n(this.email, this.context);
                    } catch (Exception e11) {
                        L("Unrecoverable failure trying to get local key pair", e11);
                        keyPairN = null;
                    }
                    if (keyPairN != null) {
                        M("Found key pair for " + this.email);
                        this.loadedLocalKeys = true;
                        PublicKey publicKey = keyPairN.getPublic();
                        this.publicKeyLocal = publicKey;
                        byte[] bArrQ = rb0.a.q(publicKey, 4);
                        this.keyID = bArrQ;
                        p013kotlin.jvm.internal.t0 t0Var2 = p013kotlin.jvm.internal.t0.f86535a;
                        String str2 = String.format("Local pub key ID    : %s", Arrays.copyOf(new Object[]{ie0.q0.b(bArrQ)}, 1));
                        p013kotlin.jvm.internal.s.j(str2, "format(...)");
                        M(str2);
                        he0.b bVarM = he0.b.m(this.context);
                        int iA = (int) bVarM.A(this.vin, this.email);
                        this.numberOfKeysOnWhitelist = iA;
                        String str3 = String.format("Found %d keys on whitelist via legacy method", Arrays.copyOf(new Object[]{Integer.valueOf(iA)}, 1));
                        p013kotlin.jvm.internal.s.j(str3, "format(...)");
                        M(str3);
                        Set<String> setB = bVarM.B(this.vin, this.email);
                        T(setB == null ? p013kotlin.collections.d1.d() : setB);
                        if (setB != null) {
                            Stream<byte[]> stream = this.whitelistKeys.stream();
                            final wn0.l lVar = new wn0.l() { // from class: com.teslamotors.plugins.ble.v1
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return a2.R((byte[]) obj);
                                }
                            };
                            String str4 = String.format("whitelistKeys: [%s]", Arrays.copyOf(new Object[]{stream.map(new Function() { // from class: com.teslamotors.plugins.ble.w1
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return a2.S(lVar, obj);
                                }
                            }).collect(Collectors.joining(", "))}, 1));
                            p013kotlin.jvm.internal.s.j(str4, "format(...)");
                            M(str4);
                            this.onWhitelist = false;
                            Iterator<byte[]> it = this.whitelistKeys.iterator();
                            while (it.hasNext()) {
                                if (Arrays.equals(it.next(), this.keyID)) {
                                    M("found key on whitelist!");
                                    this.onWhitelist = true;
                                }
                            }
                        } else {
                            this.onWhitelist = this.numberOfKeysOnWhitelist > 0;
                            if (getOnWhitelist()) {
                                this.whitelistKeys = new CopyOnWriteArrayList();
                                M("injecting whitelist keys with app's key for upgrade scenario; was previously paired");
                                for (int i11 = 0; i11 < this.numberOfKeysOnWhitelist; i11++) {
                                    this.whitelistKeys.add(this.keyID);
                                }
                            }
                        }
                    } else {
                        M("Failed to load local key pair");
                    }
                    V();
                }
                if (this.loadedLocalKeys) {
                    I(i0.IDLE);
                    return;
                } else {
                    I(i0.UNINITIALIZED);
                    return;
                }
            case 2:
                if (q1Var == null) {
                    return;
                }
                if (q1Var.r()) {
                    L("trying to connect when connection already established", new Throwable("trying to connect when connection already established"));
                    I(i0.CONNECTION_ESTABLISHED);
                    return;
                } else if (!q1Var.n0()) {
                    M("connect to peripheral with no service connected; going back to idle");
                    I(i0.IDLE);
                    return;
                } else {
                    M("connect to peripheral with service connected but haven't requested indications");
                    P();
                    I(i0.WAITING_FOR_PERIPHERAL);
                    q1Var.d0();
                    return;
                }
            case 3:
                V();
                I(i0.CONNECTED_IDLE);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String R(byte[] bArr) {
        return ie0.q0.b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String S(wn0.l lVar, Object obj) {
        return (String) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(a2 a2Var) throws Throwable {
        a2Var.M("start: " + a2Var.currentState + " with email: " + a2Var.email);
        if (a2Var.currentState != i0.UNINITIALIZED || p013kotlin.text.t.y0(a2Var.email)) {
            return;
        }
        a2Var.I(i0.LOAD_PUBLIC_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        q1 q1Var = this.vehicleController.get();
        if (q1Var != null) {
            q1Var.i(true);
        }
    }

    public void T(Set<String> keyIDs) {
        p013kotlin.jvm.internal.s.k(keyIDs, "keyIDs");
        this.whitelistKeys = new CopyOnWriteArrayList();
        Iterator<String> it = keyIDs.iterator();
        while (it.hasNext()) {
            this.whitelistKeys.add(ie0.q0.a(it.next()));
        }
    }

    @Override // com.teslamotors.plugins.ble.h0
    public byte[] a(byte[] token, byte[] remoteKey) {
        p013kotlin.jvm.internal.s.k(token, "token");
        p013kotlin.jvm.internal.s.k(remoteKey, "remoteKey");
        String strE = ie0.n.e(remoteKey, 0, 1, null);
        f56711r.j("encryptWithSharedSecret called for remote key: " + strE);
        byte[] encoded = rb0.e.f107486a.b(this.context, strE, "encryptWithSharedSecret").getEncoded();
        if (encoded != null) {
            return rb0.a.i(encoded, token);
        }
        return null;
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void b(Peripheral peripheral) {
        this.handler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.u1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                a2.K(this.f57006a);
            }
        });
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void c(final Peripheral peripheral) {
        this.handler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.t1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                a2.N(this.f57002a, peripheral);
            }
        });
    }

    @Override // com.teslamotors.plugins.ble.h0
    public Set<String> d() {
        HashSet hashSet = new HashSet();
        Iterator<byte[]> it = this.whitelistKeys.iterator();
        while (it.hasNext()) {
            hashSet.add(ie0.q0.b(it.next()));
        }
        return hashSet;
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void e() {
        this.handler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.z1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                a2.J(this.f57038a);
            }
        });
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void f(vc0.w0 message, Peripheral peripheral, long receivedBytesTimestamp) {
        if (message == null) {
            return;
        }
        this.handler.post(new c(message));
    }

    @Override // com.teslamotors.plugins.ble.h0
    public long g() {
        return h0.b.b(this);
    }

    @Override // com.teslamotors.plugins.ble.h0
    public byte[] getPublicKey() {
        PublicKey publicKey = this.publicKeyLocal;
        if (publicKey != null) {
            return rb0.a.t(publicKey);
        }
        return null;
    }

    @Override // com.teslamotors.plugins.ble.h0
    public h0.d getType() {
        return this.type;
    }

    @Override // com.teslamotors.plugins.ble.h0
    public String h() {
        byte[] bArr = this.keyID;
        if (bArr != null) {
            if (bArr.length == 0) {
                bArr = null;
            }
            if (bArr != null) {
                return ie0.q0.b(bArr);
            }
        }
        return null;
    }

    @Override // com.teslamotors.plugins.ble.h0
    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getOnWhitelist() {
        return this.onWhitelist;
    }

    @Override // com.teslamotors.plugins.ble.h0
    public df0.a k(e3 e3Var, byte[] bArr) {
        return h0.b.a(this, e3Var, bArr);
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void l(final h0.c listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.handler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.y1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                a2.O(this.f57033a, listener);
            }
        });
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void start() {
        this.handler.post(new Runnable() { // from class: com.teslamotors.plugins.ble.x1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                a2.U(this.f57020a);
            }
        });
    }
}
