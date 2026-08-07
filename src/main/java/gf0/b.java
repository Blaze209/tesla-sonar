package gf0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.teslamotors.plugins.ble.Peripheral;
import com.teslamotors.plugins.ble.h0;
import com.teslamotors.plugins.ble.q1;
import com.teslamotors.plugins.ble.z;
import ie0.q0;
import java.lang.ref.WeakReference;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Collectors;
import okio.k;
import vc0.c2;
import vc0.e3;
import vc0.g1;
import vc0.i0;
import vc0.i1;
import vc0.i3;
import vc0.k3;
import vc0.l3;
import vc0.u2;
import vc0.v2;
import vc0.w0;
import vc0.w2;
import vc0.x2;
import vc0.z2;
import ye0.n;

/* JADX INFO: loaded from: classes8.dex */
public class b implements h0 {
    private static final Set<i> C;
    private static final Set<i> D;
    private final n A;
    private final Runnable B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PublicKey f68842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PrivateKey f68843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PublicKey f68844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    byte[] f68845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    byte[] f68846f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f68847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f68848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f68849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f68850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f68851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f68852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private u2 f68853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicLong f68854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f68855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f68856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f68857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f68858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f68859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<byte[]> f68860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Handler f68861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f68862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final rb0.a f68863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f68864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final WeakReference<q1> f68865y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Context f68866z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            q1 q1Var = (q1) b.this.f68865y.get();
            if (q1Var == null) {
                return;
            }
            if (b.C.contains(b.this.f68847g) && q1Var.z() != df0.c.CONNECTED) {
                if (q1Var.n0()) {
                    b bVar = b.this;
                    bVar.N(String.format("Timed out in state %s. Still connected, retrying.", bVar.f68847g.name()));
                    b.this.K(i.CONNECT_TO_PERIPHERAL);
                    return;
                } else {
                    b bVar2 = b.this;
                    bVar2.N(String.format("Timed out in state %s. No connection, cancelling retries", bVar2.f68847g.name()));
                    b.this.K(i.IDLE);
                    return;
                }
            }
            b bVar3 = b.this;
            if (bVar3.f68855o > 10 && !bVar3.f68849i) {
                b.this.N("Timed out getting public key");
                b.this.K(i.IDLE);
                q1Var.F0("public key timeout");
                return;
            }
            b bVar4 = b.this;
            if (bVar4.f68856p > 10 && !bVar4.f68851k) {
                b.this.N("Timed out getting whitelist");
                b.this.K(i.IDLE);
                q1Var.F0("whitelist timeout");
                return;
            }
            b bVar5 = b.this;
            if (bVar5.f68858r == 10) {
                bVar5.M("Timed out getting status", new Exception("[TMBLE Logic] Failed to get vehicle status after 10 attempts; resetting peripheral."));
                b.this.K(i.IDLE);
                q1Var.F0("status timeout");
                return;
            }
            if (bVar5.f68857q > 10) {
                bVar5.N("Timed out getting IV");
                b.this.K(i.ALL_CRYPTO_COMPLETE);
                return;
            }
            if (bVar5.f68847g == i.WAITING_FOR_PUB_KEY) {
                b bVar6 = b.this;
                bVar6.f68855o++;
                bVar6.N("Restarting timer for request pub key");
                b.this.K(i.REQUEST_PUB_KEY);
                return;
            }
            if (b.this.f68847g == i.WAITING_FOR_WHITELIST) {
                b bVar7 = b.this;
                bVar7.f68856p++;
                bVar7.N("Restarting timer for whitelist");
                b.this.K(i.CHECK_WHITELIST);
                return;
            }
            if (b.this.f68847g == i.WAITING_FOR_STATUS) {
                b bVar8 = b.this;
                bVar8.f68858r++;
                bVar8.N("Restarting timer for status");
                b.this.K(i.GET_STATUS);
                return;
            }
            if (b.this.f68847g == i.WAITING_FOR_CRYPTO_COUNTER) {
                b bVar9 = b.this;
                bVar9.f68857q++;
                bVar9.N("Restarting timer for syncing crypto counter");
                b.this.K(i.SYNC_CRYPTO_COUNTER);
            }
        }
    }

    /* JADX INFO: renamed from: gf0.b$b, reason: collision with other inner class name */
    class RunnableC1405b implements Runnable {
        RunnableC1405b() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.N("start: " + b.this.f68847g);
            if (b.this.f68847g != i.UNINITIALIZED || b.this.f68852l == null || b.this.f68852l.isEmpty()) {
                return;
            }
            b.this.K(i.LOAD_KEY_PAIR);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.N("connectionEstablished - in state " + b.this.f68847g);
            b bVar = b.this;
            bVar.f68855o = 0;
            bVar.f68856p = 0;
            bVar.f68858r = 0;
            bVar.f68857q = 0;
            bVar.f68862v = true;
            b.this.K(i.CONNECTION_ESTABLISHED);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.N("connectionLost - in state " + b.this.f68847g);
            b.this.f68862v = false;
            b bVar = b.this;
            bVar.f68861u.removeCallbacks(bVar.B);
            b.this.K(i.CONNECT_TO_PERIPHERAL);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Peripheral f68871a;

        e(Peripheral peripheral) {
            this.f68871a = peripheral;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            q1 q1Var = (q1) b.this.f68865y.get();
            if (q1Var == null) {
                return;
            }
            b bVar = b.this;
            bVar.N(String.format("%s Found peripheral - in state %s", this.f68871a, bVar.f68847g));
            if (q1Var.r() || b.this.f68847g == i.WAITING_FOR_PERIPHERAL) {
                return;
            }
            i iVar = b.this.f68847g;
            i iVar2 = i.CONNECT_TO_PERIPHERAL;
            if (iVar != iVar2) {
                b.this.N("mVehicleController peripheral has not established connection... Connecting");
                b.this.K(iVar2);
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0.c f68873a;

        f(h0.c cVar) {
            this.f68873a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            b.this.f68849i = false;
            b.this.f68850j = false;
            b.this.f68851k = false;
            b.this.f68859s = 0;
            b.this.f68860t.clear();
            he0.b.m(b.this.f68866z).R(b.this.f68864x, b.this.f68852l, 0L);
            he0.b.m(b.this.f68866z).S(b.this.f68864x, b.this.f68852l, Collections.EMPTY_SET);
            b bVar = b.this;
            bVar.f68855o = 0;
            bVar.f68857q = 0;
            bVar.f68856p = 0;
            bVar.f68858r = 0;
            bVar.f68845e = null;
            bVar.N("Forgetting remote ephemeral and derived secret");
            b.this.K(i.IDLE);
            this.f68873a.onReset();
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w0 f68875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Peripheral f68876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f68877c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                q1 q1Var = (q1) b.this.f68865y.get();
                if (q1Var != null) {
                    q1Var.b0("native_not_on_whitelist_upon_connection_legacy");
                }
            }
        }

        g(w0 w0Var, Peripheral peripheral, long j11) {
            this.f68875a = w0Var;
            this.f68876b = peripheral;
            this.f68877c = j11;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            q1 q1Var = (q1) b.this.f68865y.get();
            if (q1Var == null) {
                return;
            }
            u2 sessionInfo = this.f68875a.getSessionInfo();
            if (sessionInfo != null && sessionInfo.getPublicKey() != k.f97943e) {
                b.this.N(String.format("Received session info with public key: %s", "REDACTED"));
                if (b.this.f68847g == i.WAITING_FOR_PUB_KEY) {
                    b.this.f68853m = sessionInfo;
                    b.this.K(i.PARSE_PUB_KEY);
                }
            }
            int counter = sessionInfo == null ? 0 : sessionInfo.getCounter();
            if (counter != 0 || b.this.f68847g == i.WAITING_FOR_CRYPTO_COUNTER) {
                b bVar = b.this;
                bVar.f68857q = 0;
                long j11 = bVar.f68854n.get();
                b.this.N(String.format("Received session info with counter. VCSEC: %d Phone: %d", Integer.valueOf(counter), Long.valueOf(j11)));
                long j12 = counter;
                if (j12 > j11) {
                    b.this.f68854n.set(j12);
                    he0.b.m(b.this.f68866z).F(b.this.f68854n.get(), b.this.f68864x, b.this.f68852l);
                    if (!q1Var.m()) {
                        HashMap map = new HashMap();
                        map.put("vcsec_iv", Integer.valueOf(counter));
                        map.put("phone_iv", Long.valueOf(j11));
                        map.put("delta", Long.valueOf(j12 - j11));
                        String str = "[TMBLE Logic] IV inconsistent outside of pairing..." + map.toString();
                        b.this.M(str, new Throwable(str));
                        b.this.N(String.format("WARNING! VCSEC and phone IV were inconsistent outside of pairing. VCSEC: %d Phone: %d", Integer.valueOf(counter), Long.valueOf(j11)));
                    }
                }
                if (b.this.f68847g == i.WAITING_FOR_CRYPTO_COUNTER) {
                    b.this.K(i.ALL_CRYPTO_COMPLETE);
                }
            }
            i3 vehicleStatus = this.f68875a.getVehicleStatus();
            if (vehicleStatus != null) {
                b bVar2 = b.this;
                bVar2.f68858r = 0;
                bVar2.N(String.format("Received vehicle status: %s", df0.e.j(vehicleStatus)));
                if (b.this.f68847g == i.WAITING_FOR_STATUS) {
                    b.this.K(i.CONNECTED_IDLE);
                }
            }
            i0 commandStatus = this.f68875a.getCommandStatus();
            if (commandStatus != null) {
                if (commandStatus.getSignedMessageStatus() != null) {
                    x2 signedMessageInformation = commandStatus.getSignedMessageStatus().getSignedMessageInformation();
                    int counter2 = commandStatus.getSignedMessageStatus().getCounter();
                    q1Var.A0(commandStatus, this.f68876b, this.f68877c);
                    b.this.N(String.format("Command Status: %s, Counter: %s, Message Information: %s", commandStatus.getOperationStatus().name(), Integer.valueOf(counter2), signedMessageInformation.name()));
                    if (commandStatus.getOperationStatus() == c2.OPERATIONSTATUS_ERROR) {
                        if (signedMessageInformation == x2.SIGNEDMESSAGE_INFORMATION_FAULT_NOT_ON_WHITELIST) {
                            if (b.this.f68851k) {
                                b.this.N("app got error about not being whitelist when it thought it was; refreshing");
                                b.this.P(g1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO);
                            }
                        } else if (signedMessageInformation != x2.SIGNEDMESSAGE_INFORMATION_FAULT_AES_DECRYPT_AUTH) {
                            b.this.P(g1.INFORMATION_REQUEST_TYPE_GET_COUNTER);
                        } else if (!q1Var.m()) {
                            String str2 = "[TMBLE Logic] AES Decrypt auth fault outside of pairing. " + new StringBuilder().toString();
                            b.this.M(str2, new Throwable(str2));
                            b.this.N("Got AES Fault - re-fetching public key / deriving keys");
                            b.this.f68849i = false;
                            b.this.f68850j = false;
                            b.this.K(i.REQUEST_PUB_KEY);
                        }
                    }
                } else {
                    b.this.N(String.format("Command Status: %s", commandStatus.getOperationStatus().name()));
                }
            }
            l3 whitelistInfo = this.f68875a.getWhitelistInfo();
            if (whitelistInfo != null && b.this.f68849i && b.this.f68850j) {
                boolean z11 = b.this.f68851k;
                b.this.f68851k = false;
                b.this.f68859s = Math.min(whitelistInfo.getNumberOfEntries(), whitelistInfo.e().size());
                b bVar3 = b.this;
                bVar3.f68856p = 0;
                bVar3.f68860t.clear();
                b bVar4 = b.this;
                bVar4.N(String.format("Received whitelist message with %s entries", Integer.valueOf(bVar4.f68859s)));
                for (int i11 = 0; i11 < b.this.f68859s; i11++) {
                    i1 i1Var = whitelistInfo.e().get(i11);
                    if (i1Var.getPublicKeySHA1() != k.f97943e) {
                        byte[] bArrJ = i1Var.getPublicKeySHA1().J();
                        b.this.f68860t.add(bArrJ);
                        if (Arrays.equals(bArrJ, b.this.f68846f)) {
                            b.this.f68851k = true;
                        }
                        b.this.N(String.format("Whitelist Entry %s", q0.b(Arrays.copyOf(bArrJ, 4))));
                    }
                }
                if (!z11 || !b.this.f68851k) {
                    if (b.this.f68851k) {
                        b bVar5 = b.this;
                        bVar5.N(String.format("Found [%s] in whitelist! -> SYNC_CRYPTO_COUNTER", q0.b(bVar5.f68846f)));
                        b.this.K(i.SYNC_CRYPTO_COUNTER);
                    } else {
                        b bVar6 = b.this;
                        bVar6.N(String.format("Did NOT find key [%s] in whitelist -> IDLE", q0.b(bVar6.f68846f)));
                        b.this.K(i.IDLE);
                        if (q1Var.m()) {
                            b.this.N("Staying connected while unauthorized");
                        } else {
                            b.this.N("Clearing peripheral...");
                            b.this.f68861u.post(new a());
                        }
                    }
                }
                he0.b.m(b.this.f68866z).S(b.this.f68864x, b.this.f68852l, b.this.d());
                b.this.U();
            }
            k3 whitelistEntryInfo = this.f68875a.getWhitelistEntryInfo();
            if (whitelistEntryInfo == null || whitelistEntryInfo.getKeyId() == null) {
                return;
            }
            b.this.N(String.format("Whitelist Entry Information found for key [%s]", q0.b(Arrays.copyOf(whitelistEntryInfo.getKeyId().getPublicKeySHA1().J(), 4))));
        }
    }

    static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f68880a;

        static {
            int[] iArr = new int[i.values().length];
            f68880a = iArr;
            try {
                iArr[i.LOAD_KEY_PAIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68880a[i.CONNECT_TO_PERIPHERAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68880a[i.CONNECTION_ESTABLISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68880a[i.REQUEST_PUB_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68880a[i.PARSE_PUB_KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68880a[i.DERIVE_SHARED_KEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68880a[i.CHECK_WHITELIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f68880a[i.GET_STATUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f68880a[i.SYNC_CRYPTO_COUNTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f68880a[i.ALL_CRYPTO_COMPLETE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f68880a[i.CONNECTED_IDLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f68880a[i.UNINITIALIZED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f68880a[i.IDLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f68880a[i.WAITING_FOR_PERIPHERAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f68880a[i.WAITING_FOR_CRYPTO_COUNTER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f68880a[i.WAITING_FOR_PUB_KEY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f68880a[i.WAITING_FOR_STATUS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f68880a[i.WAITING_FOR_WHITELIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public enum i {
        UNINITIALIZED,
        IDLE,
        LOAD_KEY_PAIR,
        CONNECT_TO_PERIPHERAL,
        WAITING_FOR_PERIPHERAL,
        CONNECTION_ESTABLISHED,
        REQUEST_PUB_KEY,
        PARSE_PUB_KEY,
        WAITING_FOR_PUB_KEY,
        DERIVE_SHARED_KEY,
        CHECK_WHITELIST,
        WAITING_FOR_WHITELIST,
        GET_STATUS,
        WAITING_FOR_STATUS,
        SYNC_CRYPTO_COUNTER,
        WAITING_FOR_CRYPTO_COUNTER,
        ALL_CRYPTO_COMPLETE,
        CONNECTED_IDLE
    }

    static {
        i iVar = i.WAITING_FOR_STATUS;
        i iVar2 = i.WAITING_FOR_PUB_KEY;
        i iVar3 = i.WAITING_FOR_CRYPTO_COUNTER;
        i iVar4 = i.WAITING_FOR_WHITELIST;
        i iVar5 = i.WAITING_FOR_PERIPHERAL;
        C = new HashSet(Arrays.asList(iVar, iVar2, iVar3, iVar4, iVar5));
        D = new HashSet(Arrays.asList(i.UNINITIALIZED, i.IDLE, iVar2, iVar4, iVar5, iVar3, iVar, i.CONNECTED_IDLE));
    }

    public b(q1 q1Var, String str, String str2, Context context, n nVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.f68854n = atomicLong;
        this.f68860t = new CopyOnWriteArrayList();
        this.B = new a();
        this.f68848h = false;
        this.f68849i = false;
        this.f68850j = false;
        this.f68851k = false;
        this.f68862v = false;
        this.f68847g = i.UNINITIALIZED;
        this.f68861u = new Handler(Looper.getMainLooper());
        this.f68863w = rb0.a.l();
        this.f68865y = new WeakReference<>(q1Var);
        this.f68864x = str;
        this.f68852l = str2;
        this.f68866z = context;
        this.A = nVar;
        atomicLong.set(he0.b.m(context).l(str, str2));
        N("created legacy state machine!");
    }

    private synchronized long L() {
        return he0.b.m(this.f68866z).F(this.f68854n.incrementAndGet(), this.f68864x, this.f68852l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str, @NonNull Throwable th2) {
        q1 q1Var = this.f68865y.get();
        if (q1Var != null) {
            q1Var.p(String.format("[Logic Error] %s", str), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(String str) {
        q1 q1Var = this.f68865y.get();
        if (q1Var != null) {
            q1Var.E(String.format("[Logic] %s", str));
        }
    }

    private PublicKey O() {
        N(String.format("Parsing certificate to retrieve public key: %s", "REDACTED"));
        PublicKey publicKeyP = rb0.a.p(this.f68853m.getPublicKey().J());
        this.f68844d = publicKeyP;
        return publicKeyP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(g1 g1Var) {
        this.A.o(g1Var, this.f68846f);
    }

    private void Q() {
        this.f68861u.removeCallbacks(this.B);
        this.f68861u.postDelayed(this.B, 2000L);
    }

    private void R() throws Throwable {
        q1 q1Var = this.f68865y.get();
        N(String.format("State: %s", this.f68847g));
        switch (h.f68880a[this.f68847g.ordinal()]) {
            case 1:
                if (!this.f68848h) {
                    try {
                        KeyPair keyPairN = this.f68863w.n(this.f68852l, this.f68866z);
                        if (keyPairN != null) {
                            N("Found key pair");
                            this.f68848h = true;
                            this.f68843c = keyPairN.getPrivate();
                            PublicKey publicKey = keyPairN.getPublic();
                            this.f68842b = publicKey;
                            byte[] bArrQ = rb0.a.q(publicKey, 4);
                            this.f68846f = bArrQ;
                            N(String.format("Local pub key ID    : %s", q0.b(bArrQ)));
                            int iA = (int) he0.b.m(this.f68866z).A(this.f68864x, this.f68852l);
                            this.f68859s = iA;
                            N(String.format("Found %d keys on whitelist via legacy method", Integer.valueOf(iA)));
                            Set<String> setB = he0.b.m(this.f68866z).B(this.f68864x, this.f68852l);
                            S(setB);
                            if (setB != null) {
                                N(String.format("whitelistKeys: [%s]", this.f68860t.stream().map(new Function() { // from class: gf0.a
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return q0.b((byte[]) obj);
                                    }
                                }).collect(Collectors.joining(", "))));
                                this.f68851k = false;
                                Iterator<byte[]> it = this.f68860t.iterator();
                                while (it.hasNext()) {
                                    if (Arrays.equals(it.next(), this.f68846f)) {
                                        this.f68851k = true;
                                    }
                                }
                            } else {
                                boolean z11 = this.f68859s > 0;
                                this.f68851k = z11;
                                if (z11) {
                                    this.f68860t = new CopyOnWriteArrayList();
                                    N("injecting whitelist keys with app's key for upgrade scenario; was previously paired");
                                    for (int i11 = 0; i11 < this.f68859s; i11++) {
                                        this.f68860t.add(this.f68846f);
                                    }
                                }
                            }
                        } else {
                            N("Failed to load local key pair");
                        }
                        U();
                    } catch (Exception e11) {
                        M("Unrecoverable failure trying to get local key pair", e11);
                        return;
                    }
                }
                if (this.f68848h) {
                    K(i.IDLE);
                } else {
                    K(i.UNINITIALIZED);
                }
                break;
            case 2:
                if (q1Var != null) {
                    if (q1Var.r()) {
                        M("trying to connect when connection already established", new Throwable("trying to connect when connection already established"));
                        K(i.CONNECTION_ESTABLISHED);
                    } else if (q1Var.n0()) {
                        N("connect to peripheral with service connected but haven't requested indications");
                        Q();
                        K(i.WAITING_FOR_PERIPHERAL);
                        q1Var.d0();
                    } else {
                        N("connect to peripheral with no service connected; going back to idle");
                        K(i.IDLE);
                    }
                    break;
                }
                break;
            case 3:
                if (!this.f68849i) {
                    K(i.REQUEST_PUB_KEY);
                } else if (!this.f68848h) {
                    K(i.LOAD_KEY_PAIR);
                } else if (!this.f68850j) {
                    K(i.DERIVE_SHARED_KEY);
                } else if (this.f68851k) {
                    U();
                    K(i.ALL_CRYPTO_COMPLETE);
                } else {
                    K(i.CHECK_WHITELIST);
                }
                break;
            case 4:
                if (this.f68862v) {
                    Q();
                    K(i.WAITING_FOR_PUB_KEY);
                    P(g1.INFORMATION_REQUEST_TYPE_GET_EPHEMERAL_PUBLIC_KEY);
                }
                break;
            case 5:
                PublicKey publicKeyO = O();
                this.f68844d = publicKeyO;
                this.f68855o = 0;
                if (publicKeyO != null) {
                    this.f68849i = true;
                    he0.b.m(this.f68866z).P(this.f68864x, q0.b(rb0.a.t(this.f68844d)));
                    K(i.DERIVE_SHARED_KEY);
                    U();
                } else {
                    M("[TMBLE Logic] Could not parse public key", new Throwable("[TMBLE Logic] Could not parse public key"));
                    K(i.REQUEST_PUB_KEY);
                }
                break;
            case 6:
                boolean z12 = this.f68850j;
                if (!z12 && this.f68849i && this.f68848h) {
                    N("Performing ECDH Key Exchange");
                    byte[] bArrF = rb0.a.f(this.f68844d, this.f68843c, "legacy derive shared key");
                    this.f68845e = bArrF;
                    if (bArrF != null) {
                        this.f68850j = true;
                        N("Performed ECDH Key Exchange - shared secret:");
                        if (this.f68851k) {
                            K(i.ALL_CRYPTO_COMPLETE);
                        } else {
                            K(i.CHECK_WHITELIST);
                        }
                    } else {
                        M("Could not perform key exchange", new Throwable("Could not perform key exchange"));
                        this.f68849i = false;
                        K(i.REQUEST_PUB_KEY);
                    }
                } else if (!z12 || !this.f68849i || !this.f68848h) {
                    String str = String.format("Could not derive shared keys. Derived keys %s. Remote key %s. Local key %s", Boolean.valueOf(z12), Boolean.valueOf(this.f68849i), Boolean.valueOf(this.f68848h));
                    M(str, new Throwable(str));
                }
                break;
            case 7:
                if (this.f68862v) {
                    Q();
                    K(i.WAITING_FOR_WHITELIST);
                    P(g1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO);
                }
                break;
            case 8:
                if (this.f68862v) {
                    Q();
                    K(i.WAITING_FOR_STATUS);
                    P(g1.INFORMATION_REQUEST_TYPE_GET_STATUS);
                }
                break;
            case 9:
                if (this.f68862v) {
                    Q();
                    K(i.WAITING_FOR_CRYPTO_COUNTER);
                    P(g1.INFORMATION_REQUEST_TYPE_GET_COUNTER);
                }
                break;
            case 10:
                K(i.GET_STATUS);
                break;
        }
    }

    private void S(Set<String> set) {
        this.f68860t = new CopyOnWriteArrayList();
        if (set == null) {
            return;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            this.f68860t.add(q0.a(it.next()));
        }
    }

    private z2 T(w2 w2Var) {
        if (w2Var == null) {
            return null;
        }
        return z.b(w2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        q1 q1Var = this.f68865y.get();
        if (q1Var != null) {
            q1Var.i(true);
        }
    }

    void K(i iVar) throws Throwable {
        N(String.format("State Change: %s -> %s", this.f68847g, iVar));
        boolean z11 = this.f68847g != iVar;
        this.f68847g = iVar;
        if (z11 || !D.contains(iVar)) {
            R();
        }
    }

    @Override // com.teslamotors.plugins.ble.h0
    public byte[] a(byte[] bArr, byte[] bArr2) {
        u2 u2Var;
        boolean z11 = this.f68849i && (u2Var = this.f68853m) != null && Arrays.equals(u2Var.getPublicKey().J(), bArr2);
        if (this.f68850j && z11) {
            return rb0.a.i(this.f68845e, bArr);
        }
        if (!this.f68848h) {
            return null;
        }
        rb0.a.p(bArr2);
        byte[] bArrF = rb0.a.f(rb0.a.p(bArr2), this.f68843c, "legacy encrypt with shared secret");
        if (bArrF != null) {
            return rb0.a.i(bArrF, bArr);
        }
        return null;
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void b(Peripheral peripheral) {
        this.f68861u.post(new d());
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void c(Peripheral peripheral) {
        this.f68861u.post(new e(peripheral));
    }

    @Override // com.teslamotors.plugins.ble.h0
    @NonNull
    public Set<String> d() {
        HashSet hashSet = new HashSet();
        Iterator<byte[]> it = this.f68860t.iterator();
        while (it.hasNext()) {
            hashSet.add(q0.b(it.next()));
        }
        return hashSet;
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void e() {
        this.f68861u.post(new c());
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void f(w0 w0Var, Peripheral peripheral, long j11) {
        this.f68861u.post(new g(w0Var, peripheral, j11));
    }

    @Override // com.teslamotors.plugins.ble.h0
    public long g() {
        return this.f68854n.get();
    }

    @Override // com.teslamotors.plugins.ble.h0
    public byte[] getPublicKey() {
        PublicKey publicKey = this.f68842b;
        if (publicKey == null) {
            return null;
        }
        return rb0.a.t(publicKey);
    }

    @Override // com.teslamotors.plugins.ble.h0
    @NonNull
    public h0.d getType() {
        return h0.d.LEGACY;
    }

    @Override // com.teslamotors.plugins.ble.h0
    public String h() {
        byte[] bArr = this.f68846f;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return q0.b(bArr);
    }

    @Override // com.teslamotors.plugins.ble.h0
    public boolean i() {
        return this.f68851k;
    }

    @Override // com.teslamotors.plugins.ble.h0
    public df0.a k(e3 e3Var, byte[] bArr) {
        long jL = L();
        byte[] bArr2 = {(byte) ((jL >> 24) & 255), (byte) ((jL >> 16) & 255), (byte) ((jL >> 8) & 255), (byte) (255 & jL)};
        if (this.f68845e == null) {
            N("Shared secret is null! Cannot encrypt unsigned message.");
            return null;
        }
        byte[] bArrH = rb0.a.h(e3Var.encode(), this.f68845e, bArr2, bArr);
        if (bArrH == null) {
            N("Encrypted command is null!");
            return null;
        }
        N(String.format("Signed message - (%s) %s %s", Integer.valueOf(bArrH.length - 16), q0.b(this.f68846f), Long.valueOf(jL)));
        v2 v2Var = v2.SIGNATURE_TYPE_AES_GCM;
        if (bArr != null) {
            v2Var = v2.SIGNATURE_TYPE_AES_GCM_TOKEN;
        }
        return new df0.a(jL, T(z.a(v2Var, Arrays.copyOf(bArrH, bArrH.length - 16), Arrays.copyOfRange(bArrH, bArrH.length - 16, bArrH.length), jL, this.f68846f)));
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void l(@NonNull h0.c cVar) {
        this.f68861u.post(new f(cVar));
    }

    @Override // com.teslamotors.plugins.ble.h0
    public void start() {
        this.f68861u.post(new RunnableC1405b());
    }
}
