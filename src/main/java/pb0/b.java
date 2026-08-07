package pb0;

import be0.e;
import com.tesla.command_utils.usecase.CommandSigningRequirement;
import fc0.g5;
import fc0.u5;
import gc0.a1;
import ic0.q;
import java.util.List;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpb0/b;", "", "Lpb0/a;", "getCommandSigningRequirement", "Lbe0/e;", "getVehicleData", "<init>", "(Lpb0/a;Lbe0/e;)V", "Lic0/c;", "action", "Lic0/q;", "b", "(Lic0/c;)Lic0/q;", "", "originalTransports", "c", "(Lic0/c;Ljava/util/List;)Ljava/util/List;", "", "vin", "a", "(Ljava/lang/String;Lic0/c;)Ljava/util/List;", "Lpb0/a;", "Lbe0/e;", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a getCommandSigningRequirement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e getVehicleData;

    /* JADX INFO: renamed from: pb0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpb0/b$a;", "", "<init>", "()V", "Lpb0/a;", "getCommandSigningRequirement", "Lbe0/e;", "getVehicleData", "Lpb0/b;", "a", "(Lpb0/a;Lbe0/e;)Lpb0/b;", "", "MIN_QR_PAIRING_CAR_API_VERSION", "I", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(a getCommandSigningRequirement, e getVehicleData) {
            s.k(getCommandSigningRequirement, "getCommandSigningRequirement");
            s.k(getVehicleData, "getVehicleData");
            return new b(getCommandSigningRequirement, getVehicleData);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: pb0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C2161b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102080a;

        static {
            int[] iArr = new int[CommandSigningRequirement.values().length];
            try {
                iArr[CommandSigningRequirement.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommandSigningRequirement.ALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommandSigningRequirement.REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102080a = iArr;
        }
    }

    public b(a getCommandSigningRequirement, e getVehicleData) {
        s.k(getCommandSigningRequirement, "getCommandSigningRequirement");
        s.k(getVehicleData, "getVehicleData");
        this.getCommandSigningRequirement = getCommandSigningRequirement;
        this.getVehicleData = getVehicleData;
    }

    private final q b(ic0.c action) {
        g5 carServerAction = action.getCarServerAction();
        if (carServerAction != null) {
            if (carServerAction.getCreateStreamSession() != null || carServerAction.getStreamMessage() != null || carServerAction.getPiiKeyRequest() != null) {
                return q.TRANSPORT_HERMES;
            }
        } else if (action.getWebrtcRequest() != null) {
            return q.TRANSPORT_HERMES;
        }
        return com.tesla.features.a.a().getSignedCommandsTransport().getUseSignedOapiTransport() ? q.TRANSPORT_SIGNED_OAPI : q.TRANSPORT_HERMES;
    }

    public final List<q> a(String vin, ic0.c action) {
        a1 vehicle_state;
        Integer numG;
        s.k(vin, "vin");
        s.k(action, "action");
        u5 u5VarD = this.getVehicleData.d(vin);
        JSONObject jSONObjectH = this.getVehicleData.h(vin);
        Boolean boolValueOf = jSONObjectH != null ? Boolean.valueOf(jSONObjectH.optBoolean("phone_key_authorized")) : null;
        boolean z11 = false;
        if (((u5VarD == null || (numG = wb0.e.g(u5VarD)) == null) ? 0 : numG.intValue()) >= 20) {
            if (!(u5VarD != null && wb0.e.l0(u5VarD))) {
                if ((u5VarD == null || (vehicle_state = u5VarD.getVehicle_state()) == null) ? false : s.f(vehicle_state.getAllow_authorized_mobile_devices_only(), Boolean.TRUE)) {
                    z11 = true;
                }
            }
        }
        q qVarB = b(action);
        int i11 = C2161b.f102080a[this.getCommandSigningRequirement.a(vin).ordinal()];
        if (i11 == 1) {
            return v.p(q.TRANSPORT_BLUETOOTH, q.TRANSPORT_OWNER_API);
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return v.p(q.TRANSPORT_BLUETOOTH, qVarB);
            }
            throw new NoWhenBranchMatchedException();
        }
        q qVar = q.TRANSPORT_BLUETOOTH;
        if (!s.f(boolValueOf, Boolean.TRUE)) {
            qVarB = null;
        }
        return v.r(qVar, qVarB, z11 ? null : q.TRANSPORT_OWNER_API);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<q> c(ic0.c action, List<? extends q> originalTransports) {
        s.k(action, "action");
        s.k(originalTransports, "originalTransports");
        q qVar = q.TRANSPORT_SIGNED_OAPI;
        if (!originalTransports.contains(qVar) && !originalTransports.contains(q.TRANSPORT_HERMES)) {
            return originalTransports;
        }
        List<q> listP1 = v.p1(originalTransports);
        q qVarB = b(action);
        int iIndexOf = originalTransports.indexOf(q.TRANSPORT_HERMES);
        int iIndexOf2 = originalTransports.indexOf(qVar);
        if (iIndexOf != -1) {
            listP1.set(iIndexOf, qVarB);
            return listP1;
        }
        if (iIndexOf2 != -1) {
            listP1.set(iIndexOf2, qVarB);
        }
        return listP1;
    }
}
