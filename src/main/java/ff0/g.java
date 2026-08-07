package ff0;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ie0.c0;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import vc0.g2;
import vc0.o1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R\"\u00101\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010.0.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0018\u00104\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00103¨\u00065"}, d2 = {"Lff0/g;", "", "<init>", "()V", "Ljn0/h0;", "f", IntegerTokenConverter.CONVERTER_KEY, "Lff0/k;", "event", DateTokenConverter.CONVERTER_KEY, "(Lff0/k;)V", "", "vin", "Lff0/m;", "e", "(Ljava/lang/String;Lff0/m;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Landroid/content/Context;)V", "Lkotlin/Pair;", "Lff0/j;", "Lvc0/o1;", "b", "(Landroid/content/Context;)Lkotlin/Pair;", "", "traceTime", "Lff0/l;", "g", "(J)Lff0/l;", "Lff0/n;", "h", "(Ljava/lang/String;J)Lff0/n;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Lff0/k$e;", "Lff0/k$e;", "serviceStartEvent", "Lff0/k$a;", "Lff0/k$a;", "bootReceivedEvent", "Lff0/k$b;", "Lff0/k$b;", "packageReplacedEvent", "Lwm0/e;", "Lff0/k$f;", "kotlin.jvm.PlatformType", "Lwm0/e;", "serviceStateSubject", "Lam0/b;", "Lam0/b;", "disposable", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f65834a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("PhoneKeyJournalManager");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static k.e serviceStartEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static k.a bootReceivedEvent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static k.b packageReplacedEvent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final wm0.e<k.f> serviceStateSubject;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static am0.b disposable;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a<T1, T2> implements cm0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T1, T2> f65841a = new a<>();

        a() {
        }

        @Override // cm0.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(k.f fVar, k.f fVar2) {
            return (fVar == null || fVar2 == null || fVar.getRunningState() != fVar2.getRunningState()) ? false : true;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f65842a = new b<>();

        b() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            s.k(it, "it");
            g.logger.d("error observing PhoneKeyJournalManager", it);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f65843a = new c<>();

        c() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(k.f fVar) {
            g.logger.j("Received event: " + fVar.getRunningState() + " at " + fVar.getTime());
            f fVar2 = f.f65830a;
            s.h(fVar);
            fVar2.h(fVar);
        }
    }

    static {
        wm0.e eVarB0 = wm0.b.d0().b0();
        s.j(eVarB0, "toSerialized(...)");
        serviceStateSubject = eVarB0;
    }

    private g() {
    }

    private static final Pair<j, o1> b(Context context) {
        o1 o1Var;
        boolean z11;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z12 = androidx.core.content.b.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        int i11 = Build.VERSION.SDK_INT;
        boolean z13 = i11 < 29 || androidx.core.content.b.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
        if (z12) {
            linkedHashSet.add(g2.c.ACCESS_FINE_LOCATION);
        }
        if (z12 && z13) {
            o1Var = o1.LOCATION_PERMISSION_ALWAYS;
        } else {
            o1Var = z12 ? o1.LOCATION_PERMISSION_WHILE_USING_THE_APP : o1.LOCATION_PERMISSION_NEVER;
        }
        if (i11 >= 31) {
            boolean z14 = androidx.core.content.b.checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN") == 0;
            z11 = androidx.core.content.b.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") == 0;
            if (z14) {
                linkedHashSet.add(g2.c.BLUETOOTH_SCAN);
            }
            if (z11) {
                linkedHashSet.add(g2.c.BLUETOOTH_CONNECT);
            }
            if (c0.d(context)) {
                linkedHashSet.add(g2.c.UWB_RANGING);
            }
        } else {
            boolean z15 = androidx.core.content.b.checkSelfPermission(context, "android.permission.BLUETOOTH") == 0;
            z11 = androidx.core.content.b.checkSelfPermission(context, "android.permission.BLUETOOTH_ADMIN") == 0;
            if (z15) {
                linkedHashSet.add(g2.c.LEGACY_BLUETOOTH);
            }
            if (z11) {
                linkedHashSet.add(g2.c.LEGACY_BLUETOOTH_ADMIN);
            }
        }
        if (!ie0.h.f77583a.b(context)) {
            linkedHashSet.add(g2.c.BATTERY_OPTIMIZATION);
        }
        Object systemService = context.getSystemService("sensor");
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        if ((sensorManager != null ? sensorManager.getDefaultSensor(10) : null) != null) {
            linkedHashSet.add(g2.c.IMU_ENABLED);
        }
        return new Pair<>(j.INSTANCE.a(linkedHashSet), o1Var);
    }

    public static final void c(Context context) {
        s.k(context, "context");
        Pair<j, o1> pairB = b(context);
        d(new k.c(pairB.e().getBitmask(), pairB.f(), 0L, 4, null));
    }

    public static final void d(k event) {
        s.k(event, "event");
        if (event instanceof k.f) {
            serviceStateSubject.onNext(event);
            return;
        }
        if (event instanceof k.e) {
            if (serviceStartEvent == null) {
                serviceStartEvent = (k.e) event;
            }
        } else if (event instanceof k.a) {
            if (bootReceivedEvent == null) {
                bootReceivedEvent = (k.a) event;
            }
        } else {
            if (event instanceof k.b) {
                return;
            }
            if (event instanceof k.d) {
                f.f65830a.h(event);
            } else {
                if (!(event instanceof k.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                f.f65830a.h(event);
            }
        }
    }

    public static final void e(String vin, m event) {
        s.k(vin, "vin");
        s.k(event, "event");
        f.f65830a.j(vin, event);
    }

    public static final void f() {
        disposable = serviceStateSubject.k(a.f65841a).R(vm0.a.c()).o(b.f65842a).N(c.f65843a);
    }

    public static final void i() {
        am0.b bVar = disposable;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final ServiceRelatedTrace g(long traceTime) {
        k kVarPrevious;
        k kVarPrevious2;
        ServiceRelatedTrace serviceRelatedTrace = new ServiceRelatedTrace(null, 0, 0, 0, null, 0, null, 0, 255, null);
        k.a aVar = bootReceivedEvent;
        k kVar = null;
        if (aVar != null) {
            if (aVar.getTime() >= traceTime) {
                aVar = null;
            }
            if (aVar != null) {
                serviceRelatedTrace.i((int) ((aVar.getTime() - traceTime) / ((long) 1000)));
            }
        }
        k.e eVar = serviceStartEvent;
        if (eVar != null) {
            if (eVar.getTime() >= traceTime) {
                eVar = null;
            }
            if (eVar != null) {
                serviceRelatedTrace.p(eVar.getCom.fourthline.analytics.internal.AnalyticsAttribute.Reason java.lang.String());
                serviceRelatedTrace.l((int) ((eVar.getTime() - traceTime) / ((long) 1000)));
            }
        }
        LinkedList<k> linkedListF = f.f65830a.f();
        ListIterator<k> listIterator = linkedListF.listIterator(linkedListF.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                kVarPrevious = null;
                break;
            }
            kVarPrevious = listIterator.previous();
            k kVar2 = kVarPrevious;
            if (kVar2.getTime() < traceTime && (kVar2 instanceof k.f)) {
                break;
            }
        }
        k kVar3 = kVarPrevious;
        if (kVar3 != null) {
            s.i(kVar3, "null cannot be cast to non-null type com.teslamotors.plugins.ble.journal.ServiceEvent.ServiceStateEvent");
            k.f fVar = (k.f) kVar3;
            serviceRelatedTrace.o(fVar.getRunningState());
            serviceRelatedTrace.m((int) ((fVar.getTime() - traceTime) / ((long) 1000)));
        }
        ListIterator<k> listIterator2 = linkedListF.listIterator(linkedListF.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                kVarPrevious2 = null;
                break;
            }
            kVarPrevious2 = listIterator2.previous();
            k kVar4 = kVarPrevious2;
            if (kVar4.getTime() < traceTime && (kVar4 instanceof k.d)) {
                break;
            }
        }
        k kVar5 = kVarPrevious2;
        if (kVar5 != null) {
            serviceRelatedTrace.n((int) ((kVar5.getTime() - traceTime) / ((long) 1000)));
        }
        ListIterator<k> listIterator3 = linkedListF.listIterator(linkedListF.size());
        while (listIterator3.hasPrevious()) {
            k kVarPrevious3 = listIterator3.previous();
            k kVar6 = kVarPrevious3;
            if (kVar6.getTime() < traceTime && (kVar6 instanceof k.c)) {
                kVar = kVarPrevious3;
                break;
            }
        }
        k kVar7 = kVar;
        if (kVar7 != null) {
            s.i(kVar7, "null cannot be cast to non-null type com.teslamotors.plugins.ble.journal.ServiceEvent.PermissionEvent");
            k.c cVar = (k.c) kVar7;
            serviceRelatedTrace.k(cVar.getPermissionsBitmask());
            serviceRelatedTrace.j(cVar.getLocationPermission());
        }
        return serviceRelatedTrace;
    }

    public final VehicleRelatedTrace h(String vin, long traceTime) {
        Object obj;
        Object objPrevious;
        Object objPrevious2;
        Object objPrevious3;
        s.k(vin, "vin");
        VehicleRelatedTrace vehicleRelatedTrace = new VehicleRelatedTrace(null, 0, 0, 0, 15, null);
        List listG = f.f65830a.g(vin);
        if (listG == null) {
            listG = v.m();
        }
        ListIterator listIterator = listG.listIterator(listG.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            m mVar = (m) objPrevious;
            if (mVar.getTime() < traceTime && (mVar instanceof m.a)) {
                break;
            }
        }
        m mVar2 = (m) objPrevious;
        if (mVar2 != null) {
            s.i(mVar2, "null cannot be cast to non-null type com.teslamotors.plugins.ble.journal.VehicleEvent.BlueToothGATTConnState");
            vehicleRelatedTrace.f(((m.a) mVar2).getState());
        }
        ListIterator listIterator2 = listG.listIterator(listG.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                objPrevious2 = null;
                break;
            }
            objPrevious2 = listIterator2.previous();
            m mVar3 = (m) objPrevious2;
            if (mVar3.getTime() < traceTime && (mVar3 instanceof m.b)) {
                break;
            }
        }
        m mVar4 = (m) objPrevious2;
        if (mVar4 != null) {
            s.i(mVar4, "null cannot be cast to non-null type com.teslamotors.plugins.ble.journal.VehicleEvent.GATTServiceBitMask");
            vehicleRelatedTrace.e(((m.b) mVar4).getBitmask());
        }
        ListIterator listIterator3 = listG.listIterator(listG.size());
        while (true) {
            if (!listIterator3.hasPrevious()) {
                objPrevious3 = null;
                break;
            }
            objPrevious3 = listIterator3.previous();
            m mVar5 = (m) objPrevious3;
            if (mVar5.getTime() < traceTime && (mVar5 instanceof m.c)) {
                break;
            }
        }
        m mVar6 = (m) objPrevious3;
        if (mVar6 != null) {
            vehicleRelatedTrace.h((int) ((mVar6.getTime() - traceTime) / ((long) 1000)));
        }
        ListIterator listIterator4 = listG.listIterator(listG.size());
        while (listIterator4.hasPrevious()) {
            Object objPrevious4 = listIterator4.previous();
            m mVar7 = (m) objPrevious4;
            if (mVar7.getTime() < traceTime && (mVar7 instanceof m.d)) {
                obj = objPrevious4;
                break;
            }
        }
        m mVar8 = (m) obj;
        if (mVar8 != null) {
            vehicleRelatedTrace.g((int) ((mVar8.getTime() - traceTime) / ((long) 1000)));
        }
        return vehicleRelatedTrace;
    }
}
