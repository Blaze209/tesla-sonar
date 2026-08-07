package df0;

import androidx.annotation.NonNull;
import hf0.m;
import java.util.LinkedList;
import vc0.f3;
import vc0.g0;
import vc0.g3;
import vc0.h0;
import vc0.h3;
import vc0.i3;
import vc0.j0;
import vc0.j1;
import vc0.k1;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i3 f60529a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f60530b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f60531c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public String[] f60532d = new String[0];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f60534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f60535c;

        static {
            int[] iArr = new int[g0.values().length];
            f60535c = iArr;
            try {
                iArr[g0.CLOSURESTATE_CLOSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60535c[g0.CLOSURESTATE_OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60535c[g0.CLOSURESTATE_FAILED_UNLATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60535c[g0.CLOSURESTATE_AJAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60535c[g0.CLOSURESTATE_OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[f3.values().length];
            f60534b = iArr2;
            try {
                iArr2[f3.VEHICLE_USER_PRESENCE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60534b[f3.VEHICLE_USER_PRESENCE_NOT_PRESENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60534b[f3.VEHICLE_USER_PRESENCE_PRESENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[h3.values().length];
            f60533a = iArr3;
            try {
                iArr3[h3.VEHICLE_SLEEP_STATUS_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60533a[h3.VEHICLE_SLEEP_STATUS_AWAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60533a[h3.VEHICLE_SLEEP_STATUS_ASLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private static Boolean a(g0 g0Var) {
        if (g0Var == g0.CLOSURESTATE_OPEN) {
            return Boolean.TRUE;
        }
        if (g0Var == g0.CLOSURESTATE_CLOSED) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static Integer b(g0 g0Var) {
        int i11 = a.f60535c[g0Var.ordinal()];
        if (i11 == 1) {
            return 4;
        }
        if (i11 == 2) {
            return 3;
        }
        if (i11 != 3) {
            return (i11 == 4 || i11 == 5) ? 1 : 0;
        }
        return 2;
    }

    public static String j(i3 i3Var) {
        if (i3Var == null) {
            return "unknown";
        }
        LinkedList linkedList = new LinkedList();
        int i11 = a.f60533a[i3Var.getVehicleSleepStatus().ordinal()];
        if (i11 == 1) {
            linkedList.add("sleep status: unknown");
        } else if (i11 == 2) {
            linkedList.add("sleep status: online");
        } else if (i11 == 3) {
            linkedList.add("sleep status: asleep");
        }
        g3 vehicleLockState = i3Var.getVehicleLockState();
        if (vehicleLockState == g3.VEHICLELOCKSTATE_LOCKED || vehicleLockState == g3.VEHICLELOCKSTATE_INTERNAL_LOCKED) {
            linkedList.add("locked");
        } else if (vehicleLockState == g3.VEHICLELOCKSTATE_SELECTIVE_UNLOCKED) {
            linkedList.add("selective-unlocked");
        } else {
            linkedList.add("unlocked");
        }
        int i12 = a.f60534b[i3Var.getUserPresence().ordinal()];
        if (i12 == 1) {
            linkedList.add("user presence: unknown");
        } else if (i12 == 2) {
            linkedList.add("user presence: not present");
        } else if (i12 == 3) {
            linkedList.add("user presence: present");
        }
        h0 closureStatuses = i3Var.getClosureStatuses();
        if (closureStatuses != null) {
            linkedList.add("open closures:");
            g0 frontDriverDoor = closureStatuses.getFrontDriverDoor();
            g0 g0Var = g0.CLOSURESTATE_OPEN;
            if (frontDriverDoor == g0Var) {
                linkedList.add("df");
            }
            if (closureStatuses.getRearDriverDoor() == g0Var) {
                linkedList.add("dr");
            }
            if (closureStatuses.getFrontPassengerDoor() == g0Var) {
                linkedList.add("pf");
            }
            if (closureStatuses.getRearPassengerDoor() == g0Var) {
                linkedList.add("pr");
            }
            if (closureStatuses.getFrontTrunk() == g0Var) {
                linkedList.add("ft");
            }
            if (closureStatuses.getRearTrunk() == g0Var) {
                linkedList.add("rt");
            }
            if (closureStatuses.getChargePort() == g0Var) {
                linkedList.add("cp");
            }
        }
        return linkedList.toString();
    }

    public double c() {
        return this.f60530b;
    }

    public double d() {
        return this.f60531c;
    }

    public boolean e() {
        return this.f60529a == null;
    }

    public void f(double d11) {
        this.f60530b = d11;
    }

    public void g(i3 i3Var) {
        this.f60529a = i3Var;
    }

    public void h(double d11) {
        this.f60531c = d11;
    }

    public String i() {
        return j(this.f60529a);
    }

    public void k(m mVar) {
        i3 i3Var = this.f60529a;
        if (i3Var != null) {
            mVar.f72693z = i3Var.getVehicleSleepStatus();
            int i11 = a.f60534b[this.f60529a.getUserPresence().ordinal()];
            boolean z11 = true;
            if (i11 == 1) {
                mVar.f72692y = null;
            } else if (i11 == 2) {
                mVar.f72692y = Boolean.FALSE;
            } else if (i11 == 3) {
                mVar.f72692y = Boolean.TRUE;
            }
            h0 closureStatuses = this.f60529a.getClosureStatuses();
            if (closureStatuses == null) {
                g0 g0Var = g0.CLOSURESTATE_CLOSED;
                mVar.c(b(g0Var), b(g0Var), b(g0Var), b(g0Var), a(g0Var), a(g0Var), a(g0Var), b(g0Var));
            } else {
                mVar.c(b(closureStatuses.getFrontDriverDoor()), b(closureStatuses.getFrontPassengerDoor()), b(closureStatuses.getRearDriverDoor()), b(closureStatuses.getRearPassengerDoor()), a(closureStatuses.getFrontTrunk()), a(closureStatuses.getRearTrunk()), a(closureStatuses.getChargePort()), b(closureStatuses.getTonneau()));
            }
            g3 vehicleLockState = this.f60529a.getVehicleLockState();
            if (!vehicleLockState.equals(g3.VEHICLELOCKSTATE_LOCKED) && !vehicleLockState.equals(g3.VEHICLELOCKSTATE_INTERNAL_LOCKED) && !vehicleLockState.equals(g3.VEHICLELOCKSTATE_SELECTIVE_UNLOCKED)) {
                z11 = false;
            }
            mVar.f72678k = z11;
            mVar.f72679l = vehicleLockState.equals(g3.VEHICLELOCKSTATE_INTERNAL_LOCKED);
            j1 keyLocationStatus = this.f60529a.getKeyLocationStatus();
            if (keyLocationStatus != null) {
                mVar.f72680m = keyLocationStatus.getKeyCloseToCenterConsoleWithHighProbability().equals(k1.KEY_LOCATION_PRESENT);
            }
            j0 detailedClosureStatus = this.f60529a.getDetailedClosureStatus();
            if (detailedClosureStatus != null) {
                mVar.f72673f = Integer.valueOf(detailedClosureStatus.getTonneauPercentOpen());
            }
        }
    }
}
