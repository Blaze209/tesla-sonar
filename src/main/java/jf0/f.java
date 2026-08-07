package jf0;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.core.uwb.exceptions.UwbServiceNotAvailableException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.uwb.RangingCapabilities;
import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.nearby.uwb.UwbClient;
import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import ie0.n;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ljf0/f;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljf0/e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "b", "(Landroid/content/Context;Ljf0/e;)V", "", "a", "(Landroid/content/Context;)Z", "c", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Ljava/lang/Boolean;", "hasGmsCore", "Ljf0/a;", DateTokenConverter.CONVERTER_KEY, "Ljf0/a;", "capabilities", "", "", "e", "Ljava/util/Set;", "PUBLIC_AVAILABLE_CONFIG_IDS", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Boolean hasGmsCore;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static RangingCapabilities capabilities;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f83675a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("UwbCapabilityHelper");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final Set<Integer> PUBLIC_AVAILABLE_CONFIG_IDS = d1.i(1, 2, 4, 5);

    private f() {
    }

    public static final boolean a(Context context) {
        s.k(context, "context");
        if (hasGmsCore == null) {
            PackageManager packageManager = context.getPackageManager();
            hasGmsCore = Boolean.valueOf(!(packageManager.hasSystemFeature("cn.google.services") && packageManager.hasSystemFeature("com.google.android.feature.services_updater")) && f83675a.c(context));
        }
        Boolean bool = hasGmsCore;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void b(Context context, e listener) throws UwbServiceNotAvailableException {
        s.k(context, "context");
        s.k(listener, "listener");
        if (!a(context)) {
            logger.a("AOSP");
            listener.a(null);
            return;
        }
        UwbClient uwbControllerClient = Nearby.getUwbControllerClient(context);
        s.j(uwbControllerClient, "getUwbControllerClient(...)");
        if (!((Boolean) Tasks.await(uwbControllerClient.isAvailable())).booleanValue()) {
            com.tesla.logging.g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Uwb capability : false");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            throw new UwbServiceNotAvailableException("Cannot start a ranging session when UWB is unavailable");
        }
        UwbAddress uwbAddress = (UwbAddress) Tasks.await(uwbControllerClient.getLocalAddress());
        UwbComplexChannel uwbComplexChannel = (UwbComplexChannel) Tasks.await(uwbControllerClient.getComplexChannel());
        RangingCapabilities rangingCapabilities = (RangingCapabilities) Tasks.await(uwbControllerClient.getRangingCapabilities());
        byte[] address = uwbAddress.getAddress();
        s.j(address, "getAddress(...)");
        v5.f fVar = new v5.f(address);
        List<Integer> supportedConfigIds = rangingCapabilities.getSupportedConfigIds();
        s.j(supportedConfigIds, "getSupportedConfigIds(...)");
        List listP1 = v.p1(supportedConfigIds);
        listP1.retainAll(PUBLIC_AVAILABLE_CONFIG_IDS);
        boolean zSupportsDistance = rangingCapabilities.supportsDistance();
        boolean zSupportsAzimuthalAngle = rangingCapabilities.supportsAzimuthalAngle();
        boolean zSupportsElevationAngle = rangingCapabilities.supportsElevationAngle();
        int minRangingInterval = rangingCapabilities.getMinRangingInterval();
        List<Integer> supportedChannels = rangingCapabilities.getSupportedChannels();
        s.j(supportedChannels, "getSupportedChannels(...)");
        Set setR1 = v.r1(supportedChannels);
        List<Integer> supportedNtfConfigs = rangingCapabilities.getSupportedNtfConfigs();
        s.j(supportedNtfConfigs, "getSupportedNtfConfigs(...)");
        Set setR2 = v.r1(supportedNtfConfigs);
        Set setR3 = v.r1(listP1);
        List<Integer> supportedSlotDurations = rangingCapabilities.getSupportedSlotDurations();
        s.j(supportedSlotDurations, "getSupportedSlotDurations(...)");
        Set setR4 = v.r1(supportedSlotDurations);
        List<Integer> supportedRangingUpdateRates = rangingCapabilities.getSupportedRangingUpdateRates();
        s.j(supportedRangingUpdateRates, "getSupportedRangingUpdateRates(...)");
        capabilities = new RangingCapabilities(zSupportsDistance, zSupportsAzimuthalAngle, zSupportsElevationAngle, minRangingInterval, setR1, setR2, setR3, setR4, v.r1(supportedRangingUpdateRates), rangingCapabilities.supportsRangingIntervalReconfigure(), rangingCapabilities.hasBackgroundRangingSupport());
        com.tesla.logging.g gVar2 = logger;
        gVar2.j(n.e(fVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String(), 0, 1, null));
        gVar2.j("local channel: " + uwbComplexChannel.getChannel());
        gVar2.j("local preamble index: " + uwbComplexChannel.getPreambleIndex());
        RangingCapabilities rangingCapabilities2 = capabilities;
        gVar2.j("Distance: " + (rangingCapabilities2 != null ? Boolean.valueOf(rangingCapabilities2.getIsDistanceSupported()) : null));
        RangingCapabilities rangingCapabilities3 = capabilities;
        gVar2.j("Azimuthal: " + (rangingCapabilities3 != null ? Boolean.valueOf(rangingCapabilities3.getIsAzimuthalAngleSupported()) : null));
        RangingCapabilities rangingCapabilities4 = capabilities;
        gVar2.j("Elevation : " + (rangingCapabilities4 != null ? Boolean.valueOf(rangingCapabilities4.getIsElevationAngleSupported()) : null));
        RangingCapabilities rangingCapabilities5 = capabilities;
        gVar2.j("Min ranging Interval : " + (rangingCapabilities5 != null ? Integer.valueOf(rangingCapabilities5.getMinRangingInterval()) : null));
        RangingCapabilities rangingCapabilities6 = capabilities;
        gVar2.j("Channels: " + (rangingCapabilities6 != null ? rangingCapabilities6.b() : null));
        RangingCapabilities rangingCapabilities7 = capabilities;
        gVar2.j("NtfConfigs: " + (rangingCapabilities7 != null ? rangingCapabilities7.c() : null));
        RangingCapabilities rangingCapabilities8 = capabilities;
        gVar2.j("slotDuration: " + (rangingCapabilities8 != null ? rangingCapabilities8.e() : null));
        RangingCapabilities rangingCapabilities9 = capabilities;
        gVar2.j("updateRate: " + (rangingCapabilities9 != null ? rangingCapabilities9.d() : null));
        RangingCapabilities rangingCapabilities10 = capabilities;
        gVar2.j("intervalReconfigure: " + (rangingCapabilities10 != null ? Boolean.valueOf(rangingCapabilities10.getIsRangingIntervalReconfigureSupported()) : null));
        RangingCapabilities rangingCapabilities11 = capabilities;
        gVar2.j("backgroundSupport: " + (rangingCapabilities11 != null ? Boolean.valueOf(rangingCapabilities11.getIsBackgroundRangingSupported()) : null));
        listener.a(capabilities);
    }

    private final boolean c(Context context) {
        try {
            int i11 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
            Object objInvoke = GoogleApiAvailability.class.getMethod("getInstance", null).invoke(null, null);
            Object objInvoke2 = objInvoke.getClass().getMethod("isGooglePlayServicesAvailable", Context.class).invoke(objInvoke, context);
            s.i(objInvoke2, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke2).intValue() == 0;
        } catch (Exception unused) {
        }
    }
}
