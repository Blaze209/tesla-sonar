package y5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.core.uwb.exceptions.UwbHardwareNotAvailableException;
import androidx.core.uwb.exceptions.UwbServiceNotAvailableException;
import androidx.core.uwb.exceptions.UwbSystemCallbackException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.uwb.RangingCapabilities;
import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.nearby.uwb.UwbAvailabilityObserver;
import com.google.android.gms.nearby.uwb.UwbClient;
import com.google.android.gms.tasks.Task;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import jn0.t;
import kotlinx.coroutines.tasks.TasksKt;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import v5.UwbComplexChannel;
import v5.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006\u001e"}, d2 = {"Ly5/i;", "Lv5/l;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "l", "()Z", "isController", "Lv5/h;", "j", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", IntegerTokenConverter.CONVERTER_KEY, "(Z)Lv5/h;", "Lv5/j;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Ljava/util/concurrent/Executor;", "executor", "Lv5/g;", "observer", "Ljn0/h0;", "a", "(Ljava/util/concurrent/Executor;Lv5/g;)V", DateTokenConverter.CONVERTER_KEY, "()V", "Landroid/content/Context;", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<Integer> f124999d = d1.i(1, 2, 4, 5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static w5.b f125000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static w5.d f125001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static UwbClient f125002g;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: y5.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ly5/i$a;", "", "<init>", "()V", "Lw5/b;", "iUwb", "Lw5/b;", "getIUwb", "()Lw5/b;", "a", "(Lw5/b;)V", "", "TAG", "Ljava/lang/String;", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(w5.b bVar) {
            i.f125000e = bVar;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"y5/i$b", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "className", "Landroid/os/IBinder;", "service", "Ljn0/h0;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "p0", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName className, IBinder service) {
            s.k(className, "className");
            s.k(service, "service");
            i.INSTANCE.a(w5.b.a.R2(service));
            Log.i("UwbMangerImpl", "iUwb service created successfully.");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName p11) {
            i.INSTANCE.a(null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.core.uwb.impl.UwbManagerImpl", f = "UwbManagerImpl.kt", i = {}, l = {94}, m = "controllerSessionScope", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f125004n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f125006p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125004n = obj;
            this.f125006p |= Integer.MIN_VALUE;
            return i.this.b(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.core.uwb.impl.UwbManagerImpl", f = "UwbManagerImpl.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 136, 137, 156}, m = "createGmsClientSessionScope", n = {"uwbClient", "isController", "uwbClient", "isController", "uwbClient", "nearbyLocalAddress", "isController", "uwbClient", "localAddress", "rangingCapabilities"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "L$2"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f125007n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f125008o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f125009p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f125010q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f125011r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f125013t;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125011r = obj;
            this.f125013t |= Integer.MIN_VALUE;
            return i.this.k(false, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.core.uwb.impl.UwbManagerImpl", f = "UwbManagerImpl.kt", i = {}, l = {99}, m = "isAvailable", n = {}, s = {})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f125014n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f125016p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125014n = obj;
            this.f125016p |= Integer.MIN_VALUE;
            return i.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"y5/i$f", "Lw5/c$a;", "", "isAvailable", "", AnalyticsAttribute.Reason, "Ljn0/h0;", "onUwbStateChanged", "(ZI)V", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends w5.c.a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Executor f125017n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ v5.g f125018o;

        f(Executor executor, v5.g gVar) {
            this.f125017n = executor;
            this.f125018o = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void S2(v5.g gVar, boolean z11, int i11) {
            gVar.onUwbStateChanged(z11, i11);
        }

        @Override // w5.c
        public void onUwbStateChanged(final boolean isAvailable, final int reason) {
            Executor executor = this.f125017n;
            final v5.g gVar = this.f125018o;
            executor.execute(new Runnable() { // from class: y5.j
                @Override // java.lang.Runnable
                public final void run() {
                    i.f.S2(gVar, isAvailable, reason);
                }
            });
        }
    }

    public i(Context context) {
        s.k(context, "context");
        this.context = context;
        b bVar = new b();
        Intent intent = new Intent("androidx.core.uwb.backend.service");
        intent.setPackage("androidx.core.uwb.backend");
        context.bindService(intent, bVar, 1);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0013  */
    private final v5.h i(boolean isController) {
        w5.d dVarP1;
        byte[] bArr;
        Log.i("UwbMangerImpl", "Creating Aosp Client session scope");
        v5.a aVar = null;
        w5.b bVar = f125000e;
        if (isController) {
            if (bVar != null) {
                dVarP1 = bVar.G0();
            } else {
                dVarP1 = null;
            }
        } else if (bVar != null) {
            dVarP1 = bVar.P1();
        } else {
            dVarP1 = null;
        }
        if (dVarP1 == null) {
            Log.e("UwbMangerImpl", "Failed to get UwbClient. AOSP backend is not available.");
        }
        s.h(dVarP1);
        w5.i localAddress = dVarP1.getLocalAddress();
        w5.e rangingCapabilities = dVarP1.getRangingCapabilities();
        v5.f fVar = (localAddress == null || (bArr = localAddress.f120839a) == null) ? null : new v5.f(bArr);
        if (rangingCapabilities != null) {
            boolean z11 = rangingCapabilities.f120811a;
            boolean z12 = rangingCapabilities.f120812b;
            boolean z13 = rangingCapabilities.f120813c;
            int i11 = rangingCapabilities.f120814d;
            int[] iArr = rangingCapabilities.f120815e;
            s.j(iArr, "it.supportedChannels");
            Set<Integer> setI1 = n.I1(iArr);
            int[] iArr2 = rangingCapabilities.f120816f;
            s.j(iArr2, "it.supportedNtfConfigs");
            Set<Integer> setI2 = n.I1(iArr2);
            int[] iArr3 = rangingCapabilities.f120817g;
            s.j(iArr3, "it.supportedConfigIds");
            List<Integer> listD1 = n.D1(iArr3);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD1) {
                if (f124999d.contains(Integer.valueOf(((Number) obj).intValue()))) {
                    arrayList.add(obj);
                }
            }
            Set setR1 = v.r1(arrayList);
            int[] iArr4 = rangingCapabilities.f120818h;
            s.j(iArr4, "it.supportedSlotDurations");
            Set<Integer> setI3 = n.I1(iArr4);
            int[] iArr5 = rangingCapabilities.f120819i;
            s.j(iArr5, "it.supportedRangingUpdateRates");
            aVar = new v5.a(z11, z12, z13, i11, setI1, setI2, setR1, setI3, n.I1(iArr5), rangingCapabilities.f120820j, rangingCapabilities.f120821k);
        }
        if (!isController) {
            s.h(aVar);
            s.h(fVar);
            return new y5.c(dVarP1, aVar, fVar);
        }
        w5.j complexChannel = dVarP1.getComplexChannel();
        s.h(aVar);
        s.h(fVar);
        s.h(complexChannel);
        return new y5.e(dVarP1, aVar, fVar, new UwbComplexChannel(complexChannel.f120840a, complexChannel.f120841b));
    }

    private final Object j(boolean z11, Continuation<? super v5.h> continuation) throws UwbHardwareNotAvailableException {
        x5.a.a(this.context);
        return l() ? k(z11, continuation) : i(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x0178 A[Catch: ApiException -> 0x0047, TryCatch #0 {ApiException -> 0x0047, blocks: (B:15:0x0042, B:51:0x0194, B:22:0x005c, B:45:0x00f1, B:47:0x0178, B:53:0x01a9, B:25:0x006c, B:41:0x00d1, B:38:0x00ba), top: B:59:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0191  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a9 A[Catch: ApiException -> 0x0047, TRY_LEAVE, TryCatch #0 {ApiException -> 0x0047, blocks: (B:15:0x0042, B:51:0x0194, B:22:0x005c, B:45:0x00f1, B:47:0x0178, B:53:0x01a9, B:25:0x006c, B:41:0x00d1, B:38:0x00ba), top: B:59:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object k(boolean z11, Continuation<? super v5.h> continuation) throws UwbSystemCallbackException, UwbServiceNotAvailableException {
        d dVar;
        UwbClient uwbClient;
        UwbAddress uwbAddress;
        Object objAwait;
        UwbAddress uwbAddress2;
        v5.f fVar;
        v5.a aVar;
        UwbClient uwbClient2;
        v5.f fVar2;
        v5.a aVar2;
        boolean z12 = z11;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f125013t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f125013t = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objAwait2 = dVar.f125011r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f125013t;
        try {
            if (i12 == 0) {
                t.b(objAwait2);
                Log.i("UwbMangerImpl", "Creating Gms Client session scope");
                UwbClient uwbControllerClient = z12 ? Nearby.getUwbControllerClient(this.context) : Nearby.getUwbControleeClient(this.context);
                s.j(uwbControllerClient, "if (isController) Nearby…bControleeClient(context)");
                Task<Boolean> taskIsAvailable = uwbControllerClient.isAvailable();
                s.j(taskIsAvailable, "uwbClient.isAvailable()");
                dVar.f125008o = uwbControllerClient;
                dVar.f125007n = z12;
                dVar.f125013t = 1;
                Object objAwait3 = TasksKt.await(taskIsAvailable, dVar);
                if (objAwait3 != coroutine_suspended) {
                    uwbClient = uwbControllerClient;
                    objAwait2 = objAwait3;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                z12 = dVar.f125007n;
                uwbClient = (UwbClient) dVar.f125008o;
                t.b(objAwait2);
            } else {
                if (i12 == 2) {
                    z12 = dVar.f125007n;
                    uwbClient = (UwbClient) dVar.f125008o;
                    t.b(objAwait2);
                    uwbAddress = (UwbAddress) objAwait2;
                    Task<RangingCapabilities> rangingCapabilities = uwbClient.getRangingCapabilities();
                    s.j(rangingCapabilities, "uwbClient.rangingCapabilities");
                    dVar.f125008o = uwbClient;
                    dVar.f125009p = uwbAddress;
                    dVar.f125007n = z12;
                    dVar.f125013t = 3;
                    objAwait = TasksKt.await(rangingCapabilities, dVar);
                    if (objAwait == coroutine_suspended) {
                        uwbAddress2 = uwbAddress;
                        objAwait2 = objAwait;
                        RangingCapabilities rangingCapabilities2 = (RangingCapabilities) objAwait2;
                        byte[] address = uwbAddress2.getAddress();
                        s.j(address, "nearbyLocalAddress.address");
                        fVar = new v5.f(address);
                        List<Integer> supportedConfigIds = rangingCapabilities2.getSupportedConfigIds();
                        s.j(supportedConfigIds, "nearbyRangingCapabilities.supportedConfigIds");
                        List listP1 = v.p1(supportedConfigIds);
                        listP1.retainAll(f124999d);
                        boolean zSupportsDistance = rangingCapabilities2.supportsDistance();
                        boolean zSupportsAzimuthalAngle = rangingCapabilities2.supportsAzimuthalAngle();
                        boolean zSupportsElevationAngle = rangingCapabilities2.supportsElevationAngle();
                        int minRangingInterval = rangingCapabilities2.getMinRangingInterval();
                        List<Integer> supportedChannels = rangingCapabilities2.getSupportedChannels();
                        s.j(supportedChannels, "nearbyRangingCapabilities.supportedChannels");
                        Set setR1 = v.r1(supportedChannels);
                        List<Integer> supportedNtfConfigs = rangingCapabilities2.getSupportedNtfConfigs();
                        s.j(supportedNtfConfigs, "nearbyRangingCapabilities.supportedNtfConfigs");
                        Set setR2 = v.r1(supportedNtfConfigs);
                        Set setR3 = v.r1(listP1);
                        List<Integer> supportedSlotDurations = rangingCapabilities2.getSupportedSlotDurations();
                        s.j(supportedSlotDurations, "nearbyRangingCapabilities.supportedSlotDurations");
                        Set setR4 = v.r1(supportedSlotDurations);
                        List<Integer> supportedRangingUpdateRates = rangingCapabilities2.getSupportedRangingUpdateRates();
                        s.j(supportedRangingUpdateRates, "nearbyRangingCapabilitie…pportedRangingUpdateRates");
                        aVar = new v5.a(zSupportsDistance, zSupportsAzimuthalAngle, zSupportsElevationAngle, minRangingInterval, setR1, setR2, setR3, setR4, v.r1(supportedRangingUpdateRates), rangingCapabilities2.supportsRangingIntervalReconfigure(), rangingCapabilities2.hasBackgroundRangingSupport());
                        if (!z12) {
                            return new y5.d(uwbClient, aVar, fVar);
                        }
                        Task<com.google.android.gms.nearby.uwb.UwbComplexChannel> complexChannel = uwbClient.getComplexChannel();
                        s.j(complexChannel, "uwbClient.complexChannel");
                        dVar.f125008o = uwbClient;
                        dVar.f125009p = fVar;
                        dVar.f125010q = aVar;
                        dVar.f125013t = 4;
                        objAwait2 = TasksKt.await(complexChannel, dVar);
                        if (objAwait2 != coroutine_suspended) {
                            uwbClient2 = uwbClient;
                            fVar2 = fVar;
                            aVar2 = aVar;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i12 == 3) {
                    z12 = dVar.f125007n;
                    UwbAddress uwbAddress3 = (UwbAddress) dVar.f125009p;
                    UwbClient uwbClient3 = (UwbClient) dVar.f125008o;
                    t.b(objAwait2);
                    uwbAddress2 = uwbAddress3;
                    uwbClient = uwbClient3;
                    RangingCapabilities rangingCapabilities3 = (RangingCapabilities) objAwait2;
                    byte[] address2 = uwbAddress2.getAddress();
                    s.j(address2, "nearbyLocalAddress.address");
                    fVar = new v5.f(address2);
                    List<Integer> supportedConfigIds2 = rangingCapabilities3.getSupportedConfigIds();
                    s.j(supportedConfigIds2, "nearbyRangingCapabilities.supportedConfigIds");
                    List listP2 = v.p1(supportedConfigIds2);
                    listP2.retainAll(f124999d);
                    boolean zSupportsDistance2 = rangingCapabilities3.supportsDistance();
                    boolean zSupportsAzimuthalAngle2 = rangingCapabilities3.supportsAzimuthalAngle();
                    boolean zSupportsElevationAngle2 = rangingCapabilities3.supportsElevationAngle();
                    int minRangingInterval2 = rangingCapabilities3.getMinRangingInterval();
                    List<Integer> supportedChannels2 = rangingCapabilities3.getSupportedChannels();
                    s.j(supportedChannels2, "nearbyRangingCapabilities.supportedChannels");
                    Set setR5 = v.r1(supportedChannels2);
                    List<Integer> supportedNtfConfigs2 = rangingCapabilities3.getSupportedNtfConfigs();
                    s.j(supportedNtfConfigs2, "nearbyRangingCapabilities.supportedNtfConfigs");
                    Set setR6 = v.r1(supportedNtfConfigs2);
                    Set setR7 = v.r1(listP2);
                    List<Integer> supportedSlotDurations2 = rangingCapabilities3.getSupportedSlotDurations();
                    s.j(supportedSlotDurations2, "nearbyRangingCapabilities.supportedSlotDurations");
                    Set setR8 = v.r1(supportedSlotDurations2);
                    List<Integer> supportedRangingUpdateRates2 = rangingCapabilities3.getSupportedRangingUpdateRates();
                    s.j(supportedRangingUpdateRates2, "nearbyRangingCapabilitie…pportedRangingUpdateRates");
                    aVar = new v5.a(zSupportsDistance2, zSupportsAzimuthalAngle2, zSupportsElevationAngle2, minRangingInterval2, setR5, setR6, setR7, setR8, v.r1(supportedRangingUpdateRates2), rangingCapabilities3.supportsRangingIntervalReconfigure(), rangingCapabilities3.hasBackgroundRangingSupport());
                    if (!z12) {
                        return new y5.d(uwbClient, aVar, fVar);
                    }
                    Task<com.google.android.gms.nearby.uwb.UwbComplexChannel> complexChannel2 = uwbClient.getComplexChannel();
                    s.j(complexChannel2, "uwbClient.complexChannel");
                    dVar.f125008o = uwbClient;
                    dVar.f125009p = fVar;
                    dVar.f125010q = aVar;
                    dVar.f125013t = 4;
                    objAwait2 = TasksKt.await(complexChannel2, dVar);
                    if (objAwait2 != coroutine_suspended) {
                        uwbClient2 = uwbClient;
                        fVar2 = fVar;
                        aVar2 = aVar;
                    }
                    return coroutine_suspended;
                }
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (v5.a) dVar.f125010q;
                fVar2 = (v5.f) dVar.f125009p;
                uwbClient2 = (UwbClient) dVar.f125008o;
                t.b(objAwait2);
            }
            com.google.android.gms.nearby.uwb.UwbComplexChannel uwbComplexChannel = (com.google.android.gms.nearby.uwb.UwbComplexChannel) objAwait2;
            return new y5.f(uwbClient2, aVar2, fVar2, new UwbComplexChannel(uwbComplexChannel.getChannel(), uwbComplexChannel.getPreambleIndex()));
            if (!((Boolean) objAwait2).booleanValue()) {
                Log.e("UwbMangerImpl", "Uwb availability : false");
                throw new UwbServiceNotAvailableException("Cannot start a ranging session when UWB is unavailable");
            }
            Task<UwbAddress> localAddress = uwbClient.getLocalAddress();
            s.j(localAddress, "uwbClient.localAddress");
            dVar.f125008o = uwbClient;
            dVar.f125007n = z12;
            dVar.f125013t = 2;
            objAwait2 = TasksKt.await(localAddress, dVar);
            if (objAwait2 != coroutine_suspended) {
                uwbAddress = (UwbAddress) objAwait2;
                Task<RangingCapabilities> rangingCapabilities4 = uwbClient.getRangingCapabilities();
                s.j(rangingCapabilities4, "uwbClient.rangingCapabilities");
                dVar.f125008o = uwbClient;
                dVar.f125009p = uwbAddress;
                dVar.f125007n = z12;
                dVar.f125013t = 3;
                objAwait = TasksKt.await(rangingCapabilities4, dVar);
                if (objAwait == coroutine_suspended) {
                    uwbAddress2 = uwbAddress;
                    objAwait2 = objAwait;
                    RangingCapabilities rangingCapabilities5 = (RangingCapabilities) objAwait2;
                    byte[] address3 = uwbAddress2.getAddress();
                    s.j(address3, "nearbyLocalAddress.address");
                    fVar = new v5.f(address3);
                    List<Integer> supportedConfigIds3 = rangingCapabilities5.getSupportedConfigIds();
                    s.j(supportedConfigIds3, "nearbyRangingCapabilities.supportedConfigIds");
                    List listP3 = v.p1(supportedConfigIds3);
                    listP3.retainAll(f124999d);
                    boolean zSupportsDistance3 = rangingCapabilities5.supportsDistance();
                    boolean zSupportsAzimuthalAngle3 = rangingCapabilities5.supportsAzimuthalAngle();
                    boolean zSupportsElevationAngle3 = rangingCapabilities5.supportsElevationAngle();
                    int minRangingInterval3 = rangingCapabilities5.getMinRangingInterval();
                    List<Integer> supportedChannels3 = rangingCapabilities5.getSupportedChannels();
                    s.j(supportedChannels3, "nearbyRangingCapabilities.supportedChannels");
                    Set setR9 = v.r1(supportedChannels3);
                    List<Integer> supportedNtfConfigs3 = rangingCapabilities5.getSupportedNtfConfigs();
                    s.j(supportedNtfConfigs3, "nearbyRangingCapabilities.supportedNtfConfigs");
                    Set setR10 = v.r1(supportedNtfConfigs3);
                    Set setR11 = v.r1(listP3);
                    List<Integer> supportedSlotDurations3 = rangingCapabilities5.getSupportedSlotDurations();
                    s.j(supportedSlotDurations3, "nearbyRangingCapabilities.supportedSlotDurations");
                    Set setR12 = v.r1(supportedSlotDurations3);
                    List<Integer> supportedRangingUpdateRates3 = rangingCapabilities5.getSupportedRangingUpdateRates();
                    s.j(supportedRangingUpdateRates3, "nearbyRangingCapabilitie…pportedRangingUpdateRates");
                    aVar = new v5.a(zSupportsDistance3, zSupportsAzimuthalAngle3, zSupportsElevationAngle3, minRangingInterval3, setR9, setR10, setR11, setR12, v.r1(supportedRangingUpdateRates3), rangingCapabilities5.supportsRangingIntervalReconfigure(), rangingCapabilities5.hasBackgroundRangingSupport());
                    if (!z12) {
                        return new y5.d(uwbClient, aVar, fVar);
                    }
                    Task<com.google.android.gms.nearby.uwb.UwbComplexChannel> complexChannel3 = uwbClient.getComplexChannel();
                    s.j(complexChannel3, "uwbClient.complexChannel");
                    dVar.f125008o = uwbClient;
                    dVar.f125009p = fVar;
                    dVar.f125010q = aVar;
                    dVar.f125013t = 4;
                    objAwait2 = TasksKt.await(complexChannel3, dVar);
                    if (objAwait2 != coroutine_suspended) {
                        uwbClient2 = uwbClient;
                        fVar2 = fVar;
                        aVar2 = aVar;
                        com.google.android.gms.nearby.uwb.UwbComplexChannel uwbComplexChannel2 = (com.google.android.gms.nearby.uwb.UwbComplexChannel) objAwait2;
                        return new y5.f(uwbClient2, aVar2, fVar2, new UwbComplexChannel(uwbComplexChannel2.getChannel(), uwbComplexChannel2.getPreambleIndex()));
                    }
                }
            }
            return coroutine_suspended;
        } catch (ApiException e11) {
            x5.a.b(e11);
            throw new RuntimeException("Unexpected error. This indicates that the library is not up-to-date with the service backend.");
        }
    }

    private final boolean l() {
        PackageManager packageManager = this.context.getPackageManager();
        return (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.context, 230100000) == 0) && !(packageManager.hasSystemFeature("cn.google.services") && packageManager.hasSystemFeature("com.google.android.feature.services_updater"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Executor executor, final v5.g gVar, final boolean z11, final int i11) {
        executor.execute(new Runnable() { // from class: y5.h
            @Override // java.lang.Runnable
            public final void run() {
                i.n(gVar, z11, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(v5.g gVar, boolean z11, int i11) {
        gVar.onUwbStateChanged(z11, i11);
    }

    @Override // v5.l
    public void a(final Executor executor, final v5.g observer) throws UwbHardwareNotAvailableException {
        s.k(executor, "executor");
        s.k(observer, "observer");
        x5.a.a(this.context);
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (l()) {
                try {
                    UwbClient uwbClient = f125002g;
                    if (uwbClient != null) {
                        uwbClient.unsubscribeFromUwbAvailability();
                    }
                    UwbClient uwbControllerClient = Nearby.getUwbControllerClient(this.context);
                    f125002g = uwbControllerClient;
                    if (uwbControllerClient != null) {
                        uwbControllerClient.subscribeToUwbAvailability(new UwbAvailabilityObserver() { // from class: y5.g
                            @Override // com.google.android.gms.nearby.uwb.UwbAvailabilityObserver
                            public final void onUwbStateChanged(boolean z11, int i11) {
                                i.m(executor, observer, z11, i11);
                            }
                        });
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    return;
                } catch (RuntimeException e11) {
                    throw e11;
                }
            }
            try {
                try {
                    f fVar = new f(executor, observer);
                    w5.b bVar = f125000e;
                    w5.d dVarG0 = bVar != null ? bVar.G0() : null;
                    f125001f = dVarG0;
                    if (dVarG0 != null) {
                        dVarG0.L(fVar);
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } catch (RuntimeException e12) {
                    throw e12;
                }
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        } catch (Throwable th3) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v5.l
    public Object b(Continuation<? super v5.j> continuation) throws UwbHardwareNotAvailableException {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f125006p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f125006p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objJ = cVar.f125004n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f125006p;
        if (i12 == 0) {
            t.b(objJ);
            cVar.f125006p = 1;
            objJ = j(true, cVar);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objJ);
        }
        s.i(objJ, "null cannot be cast to non-null type androidx.core.uwb.UwbControllerSessionScope");
        return (v5.j) objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v5.l
    public Object c(Continuation<? super Boolean> continuation) throws UwbHardwareNotAvailableException {
        e eVar;
        boolean zIsAvailable;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f125016p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f125016p = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objAwait = eVar.f125014n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f125016p;
        if (i12 == 0) {
            t.b(objAwait);
            x5.a.a(this.context);
            if (l()) {
                Task<Boolean> taskIsAvailable = Nearby.getUwbControllerClient(this.context).isAvailable();
                s.j(taskIsAvailable, "getUwbControllerClient(context).isAvailable");
                eVar.f125016p = 1;
                objAwait = TasksKt.await(taskIsAvailable, eVar);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                w5.b bVar = f125000e;
                w5.d dVarG0 = bVar != null ? bVar.G0() : null;
                zIsAvailable = dVarG0 != null ? dVarG0.isAvailable() : false;
            }
            return Boxing.boxBoolean(zIsAvailable);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(objAwait);
        s.j(objAwait, "getUwbControllerClient(c…text).isAvailable.await()");
        zIsAvailable = ((Boolean) objAwait).booleanValue();
        return Boxing.boxBoolean(zIsAvailable);
    }

    @Override // v5.l
    public void d() {
        if (l()) {
            UwbClient uwbClient = f125002g;
            if (uwbClient != null) {
                uwbClient.unsubscribeFromUwbAvailability();
            }
            f125002g = null;
            return;
        }
        w5.d dVar = f125001f;
        if (dVar != null) {
            dVar.s0();
        }
        f125001f = null;
    }
}
