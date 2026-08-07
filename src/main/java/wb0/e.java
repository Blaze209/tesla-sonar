package wb0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tesla.domain.model.widget.VehicleClosure;
import ec0.h0;
import ec0.l;
import ec0.y;
import ezvcard.property.Gender;
import fc0.u5;
import gc0.a0;
import gc0.a1;
import gc0.e0;
import gc0.o;
import gc0.q;
import gc0.r;
import gc0.u;
import gc0.u0;
import gc0.v0;
import j$.time.Instant;
import java.util.Iterator;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import vc0.g0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001a\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\u000b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0003\u001a\u0011\u0010\r\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0003\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0011\u0010\u0015\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u0011\u0010\u0017\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0011\u0010\u0018\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0013\u001a\u0011\u0010\u0019\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0013\u001a\u0011\u0010\u001a\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0013\u001a\u0011\u0010\u001b\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0013\u001a\u0011\u0010\u001c\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0013\u001a\u0011\u0010\u001d\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u0013\u001a\u0011\u0010\u001e\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u0013\u001a\u0011\u0010\u001f\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0013\u001a\u0011\u0010 \u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b \u0010\u0013\u001a\u0011\u0010\"\u001a\u00020!*\u00020\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u000e*\u0004\u0018\u00010!¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010&\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b&\u0010\u0013\u001a\u0011\u0010'\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b'\u0010\u0013\u001a\u0011\u0010(\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b(\u0010\u0013\u001a\u0011\u0010)\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b)\u0010\u0013\u001a\u0011\u0010*\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b*\u0010\u0013\u001a\u0011\u0010+\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b+\u0010\u0013\u001a\u0011\u0010,\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b,\u0010\u0003\u001a\u0011\u0010.\u001a\u00020-*\u00020\u0000¢\u0006\u0004\b.\u0010/\u001a\u0011\u00100\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\b0\u0010\u0013\u001a\u001f\u00103\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0018\u000101*\u00020\u0011¢\u0006\u0004\b3\u00104\u001a\u0011\u00106\u001a\u000205*\u00020\u0011¢\u0006\u0004\b6\u00107\u001a\u0013\u00109\u001a\u00020\u0001*\u0004\u0018\u000108¢\u0006\u0004\b9\u0010:\u001a\u0011\u0010<\u001a\u00020\u0001*\u00020;¢\u0006\u0004\b<\u0010=\u001a\u0011\u0010>\u001a\u00020\u0001*\u00020;¢\u0006\u0004\b>\u0010=\u001a\u0011\u0010?\u001a\u00020\u0001*\u00020;¢\u0006\u0004\b?\u0010=\u001a\u0011\u0010@\u001a\u00020\u0001*\u00020;¢\u0006\u0004\b@\u0010=\u001a\u0011\u0010A\u001a\u00020!*\u00020\u0011¢\u0006\u0004\bA\u0010B\u001a\u0011\u0010C\u001a\u00020\u0001*\u00020\u0011¢\u0006\u0004\bC\u0010\u0013\u001a\u0011\u0010D\u001a\u00020\u0001*\u00020;¢\u0006\u0004\bD\u0010=\u001a\u001f\u0010E\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202\u0018\u000101*\u00020\u0011¢\u0006\u0004\bE\u00104\u001a%\u0010H\u001a\u00020\u0001*\u00020\u00112\b\u0010F\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010G\u001a\u00020\u0001¢\u0006\u0004\bH\u0010I\u001a\u0011\u0010K\u001a\u00020J*\u00020\u0011¢\u0006\u0004\bK\u0010L\u001a\u0013\u0010N\u001a\u00020\u0001*\u0004\u0018\u00010M¢\u0006\u0004\bN\u0010O\u001a\u0015\u0010Q\u001a\u0004\u0018\u00010P*\u0004\u0018\u00010P¢\u0006\u0004\bQ\u0010R\u001a\u0011\u0010S\u001a\u000202*\u000202¢\u0006\u0004\bS\u0010T\u001a+\u0010W\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202012\u0006\u0010U\u001a\u0002022\u0006\u0010V\u001a\u000202H\u0002¢\u0006\u0004\bW\u0010X\u001a+\u0010[\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000202012\u0006\u0010Y\u001a\u0002022\u0006\u0010Z\u001a\u000202H\u0002¢\u0006\u0004\b[\u0010X\u001a\u001f\u0010\\\u001a\u0002022\u0006\u0010\u001f\u001a\u0002022\u0006\u0010\u0004\u001a\u000202H\u0002¢\u0006\u0004\b\\\u0010]\u001a\u001f\u0010^\u001a\u0002022\u0006\u0010\u001f\u001a\u0002022\u0006\u0010\u0004\u001a\u000202H\u0002¢\u0006\u0004\b^\u0010]\"\u0015\u0010`\u001a\u00020\u000e*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b_\u0010\u0010\"\u0015\u0010b\u001a\u00020!*\u00020\u00008F¢\u0006\u0006\u001a\u0004\ba\u0010#\"\u0017\u0010e\u001a\u0004\u0018\u000105*\u00020\u00118F¢\u0006\u0006\u001a\u0004\bc\u0010d\"\u0017\u0010g\u001a\u0004\u0018\u000105*\u00020\u00118F¢\u0006\u0006\u001a\u0004\bf\u0010d\"\u0017\u0010i\u001a\u0004\u0018\u00010!*\u00020\u00118F¢\u0006\u0006\u001a\u0004\bh\u0010B¨\u0006j"}, d2 = {"Lxc0/a;", "", "b", "(Lxc0/a;)Z", "y", "Lcom/tesla/domain/model/widget/VehicleClosure;", "closure", "j", "(Lxc0/a;Lcom/tesla/domain/model/widget/VehicleClosure;)Z", "c0", "D", "H", Gender.OTHER, "b0", "Lqf0/a;", "h", "(Lxc0/a;)Lqf0/a;", "Lfc0/u5;", "J", "(Lfc0/u5;)Z", "I", DateTokenConverter.CONVERTER_KEY, "c", "z", "A", "G", "X", "R", "Q", "W", Gender.UNKNOWN, "x", "f0", "", "k", "(Lxc0/a;)Ljava/lang/String;", "C", "(Ljava/lang/String;)Lqf0/a;", "w", "d0", "S", "Z", "Y", "e0", "a0", "Lvc0/g0;", "t", "(Lxc0/a;)Lvc0/g0;", "P", "Lkotlin/Pair;", "", "u", "(Lfc0/u5;)Lkotlin/Pair;", "", "r", "(Lfc0/u5;)I", "Lgc0/u0$d;", "T", "(Lgc0/u0$d;)Z", "Lgc0/u0;", "V", "(Lgc0/u0;)Z", Gender.FEMALE, "L", "B", IntegerTokenConverter.CONVERTER_KEY, "(Lfc0/u5;)Ljava/lang/String;", "l0", "K", "n", "other", "equalIsValid", Gender.MALE, "(Lfc0/u5;Lfc0/u5;Z)Z", "j$/time/Instant", "s", "(Lfc0/u5;)Lj$/time/Instant;", "Lec0/h0;", "k0", "(Lec0/h0;)Z", "", "j0", "(Ljava/lang/Float;)Ljava/lang/Float;", "g0", "(D)D", "gcjLat", "gcjLng", "f", "(DD)Lkotlin/Pair;", "lat", "lng", "e", "h0", "(DD)D", "i0", "p", "protocolCarType", "q", "requiredVin", "g", "(Lfc0/u5;)Ljava/lang/Integer;", "apiVersion", "o", "keyVersion", "v", "vin", "domain_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f121658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f121659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f121660d;

        static {
            int[] iArr = new int[qf0.a.values().length];
            try {
                iArr[qf0.a.CAR_TYPE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f121657a = iArr;
            int[] iArr2 = new int[g0.values().length];
            try {
                iArr2[g0.CLOSURESTATE_OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[g0.CLOSURESTATE_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[g0.CLOSURESTATE_CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[g0.CLOSURESTATE_CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            f121658b = iArr2;
            int[] iArr3 = new int[c.values().length];
            try {
                iArr3[c.STATIONARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[c.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[c.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f121659c = iArr3;
            int[] iArr4 = new int[l.values().length];
            try {
                iArr4[l.FasciaTypeOriginal.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[l.FasciaTypeBasePoppyseed.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[l.FasciaTypePerformancePoppyseed.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[l.FasciaTypeD50Poppyseed.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[l.FasciaTypeBaseBayberry.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[l.FasciaTypeP3S.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[l.FasciaTypeP3SPlaid.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[l.FasciaTypeP3X.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[l.FasciaTypePerformanceBayberry.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[l.FasciaTypeE41Bayberry.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            f121660d = iArr4;
        }
    }

    public static final boolean A(u5 u5Var) {
        s.k(u5Var, "<this>");
        u0 vehicle_config = u5Var.getVehicle_config();
        return wb0.a.j(vehicle_config != null ? vehicle_config.getCar_type() : null) == qf0.a.CAR_TYPE_CYBERTRUCK;
    }

    public static final boolean B(u0 u0Var) {
        s.k(u0Var, "<this>");
        u0.s steering_wheel_type = u0Var.getSteering_wheel_type();
        return k0(steering_wheel_type != null ? steering_wheel_type.getYoke() : null);
    }

    public static final qf0.a C(String str) {
        if (str == null || str.length() == 0 || str.length() <= 3) {
            return qf0.a.CAR_TYPE_UNKNOWN;
        }
        Integer numB = wb0.a.b(str);
        char cCharAt = str.charAt(3);
        if (cCharAt == '3') {
            return qf0.a.CAR_TYPE_MODEL3;
        }
        if (cCharAt == 'C') {
            return qf0.a.CAR_TYPE_CYBERTRUCK;
        }
        if (cCharAt == 'S') {
            if (numB == null) {
                return qf0.a.CAR_TYPE_MODELS;
            }
            if (numB.intValue() >= 2022) {
                return qf0.a.CAR_TYPE_LYCHEE;
            }
            if (numB.intValue() != 2021) {
                return numB.intValue() >= 2016 ? qf0.a.CAR_TYPE_MODELS2 : qf0.a.CAR_TYPE_MODELS;
            }
            b bVarA = b.INSTANCE.a(str);
            return (bVarA == null || !bVarA.isPreP2SX()) ? qf0.a.CAR_TYPE_LYCHEE : qf0.a.CAR_TYPE_MODELS2;
        }
        if (cCharAt == 'T') {
            return qf0.a.CAR_TYPE_SEMI_TRUCK;
        }
        if (cCharAt != 'X') {
            return cCharAt != 'Y' ? qf0.a.CAR_TYPE_UNKNOWN : qf0.a.CAR_TYPE_MODELY;
        }
        if (numB == null) {
            return qf0.a.CAR_TYPE_MODELX;
        }
        if (numB.intValue() > 2022) {
            return qf0.a.CAR_TYPE_TAMARIND;
        }
        if (numB.intValue() != 2021) {
            return qf0.a.CAR_TYPE_MODELX;
        }
        b bVarA2 = b.INSTANCE.a(str);
        return (bVarA2 == null || !bVarA2.isPreP2SX()) ? qf0.a.CAR_TYPE_TAMARIND : qf0.a.CAR_TYPE_MODELX;
    }

    public static final boolean D(final xc0.a aVar) {
        s.k(aVar, "<this>");
        Iterator it = ho0.l.U(ho0.l.v(VehicleClosure.DRIVER_FRONT_DOOR, VehicleClosure.DRIVER_REAR_DOOR, VehicleClosure.PASSENGER_FRONT_DOOR, VehicleClosure.PASSENGER_REAR_DOOR), new wn0.l() { // from class: wb0.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e.E(aVar, (VehicleClosure) obj));
            }
        }).iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(xc0.a aVar, VehicleClosure it) {
        s.k(it, "it");
        return j(aVar, it);
    }

    public static final boolean F(u0 u0Var) {
        s.k(u0Var, "<this>");
        u0.d car_type = u0Var.getCar_type();
        if (!k0(car_type != null ? car_type.getCarTypeModelY() : null)) {
            return false;
        }
        l fascia_type = u0Var.getFascia_type();
        switch (fascia_type == null ? -1 : a.f121660d[fascia_type.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 5:
                return true;
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
                return true;
        }
    }

    public static final boolean G(u5 u5Var) {
        s.k(u5Var, "<this>");
        q climate_state = u5Var.getClimate_state();
        if (climate_state != null) {
            return s.f(climate_state.getBioweapon_mode_on(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean H(xc0.a aVar) {
        o charge_state;
        s.k(aVar, "<this>");
        if (b(aVar)) {
            xc0.b bVarC = aVar.getBle_status();
            return bVarC != null && bVarC.getCharge_port_open();
        }
        u5 u5VarJ = aVar.getVehicle_data();
        if (u5VarJ == null || (charge_state = u5VarJ.getCharge_state()) == null) {
            return false;
        }
        return s.f(charge_state.getCharge_port_door_open(), Boolean.TRUE);
    }

    public static final boolean I(u5 u5Var) {
        q.c cVarT;
        s.k(u5Var, "<this>");
        q climate_state = u5Var.getClimate_state();
        return (climate_state == null || (cVarT = climate_state.getClimate_keeper_mode()) == null || x20.d.d(cVarT.getDog(), cVarT.getOn(), cVarT.getParty()) != 1) ? false : true;
    }

    public static final boolean J(u5 u5Var) {
        s.k(u5Var, "<this>");
        q climate_state = u5Var.getClimate_state();
        if (climate_state != null ? s.f(climate_state.getIs_climate_on(), Boolean.TRUE) : false) {
            return true;
        }
        q climate_state2 = u5Var.getClimate_state();
        return climate_state2 != null ? s.f(climate_state2.getIs_preconditioning(), Boolean.TRUE) : false;
    }

    public static final boolean K(u0 u0Var) {
        s.k(u0Var, "<this>");
        return wb0.a.j(u0Var.getCar_type()) == qf0.a.CAR_TYPE_CYBERTRUCK;
    }

    public static final boolean L(u0 u0Var) {
        s.k(u0Var, "<this>");
        u0.d car_type = u0Var.getCar_type();
        if (!k0(car_type != null ? car_type.getCarTypeModelY() : null)) {
            return false;
        }
        l fascia_type = u0Var.getFascia_type();
        switch (fascia_type == null ? -1 : a.f121660d[fascia_type.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 10:
                return true;
        }
    }

    public static final boolean M(u5 u5Var, u5 u5Var2, boolean z11) {
        Instant timestamp;
        u0 vehicle_config;
        Instant timestamp2;
        s.k(u5Var, "<this>");
        u0 vehicle_config2 = u5Var.getVehicle_config();
        if (vehicle_config2 == null || (timestamp = vehicle_config2.getTimestamp()) == null) {
            return false;
        }
        if (u5Var2 == null || (vehicle_config = u5Var2.getVehicle_config()) == null || (timestamp2 = vehicle_config.getTimestamp()) == null) {
            return true;
        }
        int iCompareTo = timestamp.compareTo(timestamp2);
        if (z11) {
            return iCompareTo >= 0;
        }
        return iCompareTo > 0;
    }

    public static /* synthetic */ boolean N(u5 u5Var, u5 u5Var2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return M(u5Var, u5Var2, z11);
    }

    public static final boolean O(xc0.a aVar) {
        s.k(aVar, "<this>");
        return j(aVar, VehicleClosure.FRONT_TRUNK);
    }

    public static final boolean P(u5 u5Var) {
        s.k(u5Var, "<this>");
        a1 vehicle_state = u5Var.getVehicle_state();
        if (vehicle_state != null) {
            return s.f(vehicle_state.getService_mode(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean Q(u5 u5Var) {
        s.k(u5Var, "<this>");
        o charge_state = u5Var.getCharge_state();
        if (charge_state != null) {
            return s.f(charge_state.getLow_power_mode_forced_on(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean R(u5 u5Var) {
        s.k(u5Var, "<this>");
        o charge_state = u5Var.getCharge_state();
        if (charge_state != null) {
            return s.f(charge_state.getLow_power_mode(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean S(u5 u5Var) {
        q.g gVarX;
        s.k(u5Var, "<this>");
        q climate_state = u5Var.getClimate_state();
        return k0((climate_state == null || (gVarX = climate_state.getDefrost_mode()) == null) ? null : gVarX.getMax());
    }

    public static final boolean T(u0.d dVar) {
        if (dVar == null) {
            return false;
        }
        return k0(dVar.getCarTypeLychee()) || k0(dVar.getCarTypeTamarind());
    }

    public static final boolean U(u5 u5Var) {
        y yVarS;
        s.k(u5Var, "<this>");
        u drive_state = u5Var.getDrive_state();
        return (drive_state == null || (yVarS = drive_state.getShift_state()) == null || x20.d.d(yVarS.getCarServer_Invalid(), yVarS.getSNA(), yVarS.getP()) != 1) ? false : true;
    }

    public static final boolean V(u0 u0Var) {
        s.k(u0Var, "<this>");
        u0.d car_type = u0Var.getCar_type();
        if (!k0(car_type != null ? car_type.getCarTypeModel3() : null)) {
            return false;
        }
        l fascia_type = u0Var.getFascia_type();
        switch (fascia_type == null ? -1 : a.f121660d[fascia_type.ordinal()]) {
            case -1:
            case 1:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return false;
        }
    }

    public static final boolean W(u5 u5Var) {
        s.k(u5Var, "<this>");
        r closures_state = u5Var.getClosures_state();
        if (closures_state != null) {
            return s.f(closures_state.getRemote_start(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean X(u5 u5Var) {
        r.d dVarZ;
        s.k(u5Var, "<this>");
        r closures_state = u5Var.getClosures_state();
        return (closures_state == null || (dVarZ = closures_state.getSentry_mode_state()) == null || x20.d.e(dVarZ.getAware(), dVarZ.getArmed(), dVarZ.getIdle(), dVarZ.getPanic(), dVarZ.getQuiet()) != 1) ? false : true;
    }

    public static final boolean Y(u5 u5Var) {
        s.k(u5Var, "<this>");
        r closures_state = u5Var.getClosures_state();
        r.e eVarD = closures_state != null ? closures_state.getSun_roof_state() : null;
        r closures_state2 = u5Var.getClosures_state();
        Integer numB = closures_state2 != null ? closures_state2.getSun_roof_percent_open() : null;
        if (k0(eVarD != null ? eVarD.getClosed() : null)) {
            return true;
        }
        return k0(eVarD != null ? eVarD.getUnknown() : null) && numB != null && numB.intValue() == 0;
    }

    public static final boolean Z(u5 u5Var) {
        s.k(u5Var, "<this>");
        r closures_state = u5Var.getClosures_state();
        r.e eVarD = closures_state != null ? closures_state.getSun_roof_state() : null;
        r closures_state2 = u5Var.getClosures_state();
        Integer numB = closures_state2 != null ? closures_state2.getSun_roof_percent_open() : null;
        if (k0(eVarD != null ? eVarD.getOpen() : null)) {
            return true;
        }
        if (k0(eVarD != null ? eVarD.getVent() : null)) {
            return true;
        }
        return k0(eVarD != null ? eVarD.getUnknown() : null) && numB != null && numB.intValue() > 0;
    }

    public static final boolean a0(xc0.a aVar) {
        s.k(aVar, "<this>");
        g0 g0VarT = t(aVar);
        return g0VarT == g0.CLOSURESTATE_OPEN || g0VarT == g0.CLOSURESTATE_OPENING || g0VarT == g0.CLOSURESTATE_AJAR;
    }

    public static final boolean b(xc0.a aVar) {
        r rVarD;
        Instant instantE;
        Instant instantNow;
        r closures_state;
        s.k(aVar, "<this>");
        xc0.b bVarC = aVar.getBle_status();
        if (bVarC != null && (rVarD = bVarC.getClosure_state()) != null && (instantE = rVarD.getTimestamp()) != null) {
            u5 u5VarJ = aVar.getVehicle_data();
            if (u5VarJ == null || (closures_state = u5VarJ.getClosures_state()) == null || (instantNow = closures_state.getTimestamp()) == null) {
                instantNow = Instant.now();
            }
            if (instantE.isAfter(instantNow)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b0(xc0.a aVar) {
        s.k(aVar, "<this>");
        return j(aVar, VehicleClosure.REAR_TRUNK);
    }

    public static final boolean c(u5 u5Var) {
        o.f charging_state;
        s.k(u5Var, "<this>");
        o charge_state = u5Var.getCharge_state();
        return k0((charge_state == null || (charging_state = charge_state.getCharging_state()) == null) ? null : charging_state.getDisconnected());
    }

    public static final boolean c0(xc0.a aVar) {
        s.k(aVar, "<this>");
        return !j(aVar, VehicleClosure.LOCKED);
    }

    public static final boolean d(u5 u5Var) {
        o.f charging_state;
        ec0.c charge_port_latch;
        s.k(u5Var, "<this>");
        o charge_state = u5Var.getCharge_state();
        if (charge_state != null && (charging_state = charge_state.getCharging_state()) != null && x20.d.d(charging_state.getComplete(), charging_state.getStopped(), charging_state.getNoPower()) == 1) {
            o charge_state2 = u5Var.getCharge_state();
            if (charge_state2 != null ? s.f(charge_state2.getCharge_port_door_open(), Boolean.TRUE) : false) {
                o charge_state3 = u5Var.getCharge_state();
                if (!k0((charge_state3 == null || (charge_port_latch = charge_state3.getCharge_port_latch()) == null) ? null : charge_port_latch.getDisengaged())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean d0(u5 u5Var) {
        s.k(u5Var, "<this>");
        r closures_state = u5Var.getClosures_state();
        if (closures_state == null) {
            return true;
        }
        Boolean boolM = closures_state.getWindow_open_driver_front();
        Boolean boolQ = closures_state.getWindow_open_passenger_front();
        Boolean boolO = closures_state.getWindow_open_driver_rear();
        Boolean boolS = closures_state.getWindow_open_passenger_rear();
        Boolean bool = Boolean.TRUE;
        return (s.f(boolM, bool) || s.f(boolQ, bool) || s.f(boolO, bool) || s.f(boolS, bool)) ? false : true;
    }

    private static final Pair<Double, Double> e(double d11, double d12) {
        double d13 = d12 - 105.0d;
        double d14 = d11 - 35.0d;
        double dH0 = h0(d13, d14);
        double dI0 = i0(d13, d14);
        double d15 = (d11 / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(d15);
        double d16 = 1;
        double d17 = d16 - ((dSin * 0.006693421622965943d) * dSin);
        double dSqrt = Math.sqrt(d17);
        return x.a(Double.valueOf((dH0 * 180.0d) / ((((d16 - 0.006693421622965943d) * 6378245.0d) / (d17 * dSqrt)) * 3.141592653589793d)), Double.valueOf((dI0 * 180.0d) / (((6378245.0d / dSqrt) * Math.cos(d15)) * 3.141592653589793d)));
    }

    public static final boolean e0(u5 u5Var) {
        o.i outlet_state;
        s.k(u5Var, "<this>");
        o charge_state = u5Var.getCharge_state();
        if (charge_state == null || (outlet_state = charge_state.getOutlet_state()) == null) {
            outlet_state = o.i.OutletStateOff;
        }
        return outlet_state == o.i.OutletStateCabin || outlet_state == o.i.OutletStateCabinAndBed;
    }

    private static final Pair<Double, Double> f(double d11, double d12) {
        Pair<Double, Double> pairE = e(d11, d12);
        return x.a(Double.valueOf(d11 - pairE.a().doubleValue()), Double.valueOf(d12 - pairE.b().doubleValue()));
    }

    public static final boolean f0(u5 u5Var) {
        u0.d car_type;
        s.k(u5Var, "<this>");
        u0 vehicle_config = u5Var.getVehicle_config();
        return (vehicle_config == null || (car_type = vehicle_config.getCar_type()) == null || x20.d.d(car_type.getCarTypeModelS(), car_type.getCarTypeModelS2(), car_type.getCarTypeModelX()) != 1) ? false : true;
    }

    public static final Integer g(u5 u5Var) {
        s.k(u5Var, "<this>");
        a1 vehicle_state = u5Var.getVehicle_state();
        if (vehicle_state != null) {
            return vehicle_state.getApi_version();
        }
        return null;
    }

    public static final double g0(double d11) {
        return d11 * 1.609344d;
    }

    public static final qf0.a h(xc0.a aVar) {
        u0 vehicle_config;
        s.k(aVar, "<this>");
        u5 u5VarJ = aVar.getVehicle_data();
        qf0.a aVarJ = wb0.a.j((u5VarJ == null || (vehicle_config = u5VarJ.getVehicle_config()) == null) ? null : vehicle_config.getCar_type());
        return a.f121657a[aVarJ.ordinal()] == 1 ? C(aVar.getVin()) : aVarJ;
    }

    private static final double h0(double d11, double d12) {
        double d13 = d11 * 2.0d;
        double dSqrt = (-100.0d) + d13 + (d12 * 3.0d) + (d12 * 0.2d * d12) + (0.1d * d11 * d12) + (Math.sqrt(Math.abs(d11)) * 0.2d) + ((((Math.sin((6.0d * d11) * 3.141592653589793d) * 20.0d) + (Math.sin(d13 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d);
        double d14 = d12 * 3.141592653589793d;
        return dSqrt + ((((Math.sin(d14) * 20.0d) + (Math.sin((d12 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d12 / 12.0d) * 3.141592653589793d) * 160.0d) + (((double) 320) * Math.sin(d14 / 30.0d))) * 2.0d) / 3.0d);
    }

    public static final String i(u5 u5Var) {
        s.k(u5Var, "<this>");
        u0 vehicle_config = u5Var.getVehicle_config();
        return wb0.a.a(wb0.a.j(vehicle_config != null ? vehicle_config.getCar_type() : null));
    }

    private static final double i0(double d11, double d12) {
        double d13 = d11 * 0.1d;
        return d11 + 300.0d + (d12 * 2.0d) + (d13 * d11) + (d13 * d12) + (Math.sqrt(Math.abs(d11)) * 0.1d) + ((((Math.sin((6.0d * d11) * 3.141592653589793d) * 20.0d) + (Math.sin((d11 * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d11 * 3.141592653589793d) * 20.0d) + (Math.sin((d11 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d11 / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d11 / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }

    public static final boolean j(xc0.a aVar, VehicleClosure closure) {
        r closures_state;
        r rVarD;
        s.k(aVar, "<this>");
        s.k(closure, "closure");
        if (b(aVar)) {
            xc0.b bVarC = aVar.getBle_status();
            return (bVarC == null || (rVarD = bVarC.getClosure_state()) == null || !yb0.a.a(rVarD, closure)) ? false : true;
        }
        u5 u5VarJ = aVar.getVehicle_data();
        return (u5VarJ == null || (closures_state = u5VarJ.getClosures_state()) == null || !yb0.a.a(closures_state, closure)) ? false : true;
    }

    public static final Float j0(Float f11) {
        if (f11 == null || s.d(f11, BitmapDescriptorFactory.HUE_RED)) {
            return null;
        }
        return f11;
    }

    public static final String k(xc0.a aVar) {
        String strL;
        s.k(aVar, "<this>");
        u5 u5VarJ = aVar.getVehicle_data();
        return (u5VarJ == null || (strL = l(u5VarJ)) == null) ? wb0.a.c(h(aVar)) : strL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean k0(h0 h0Var) {
        return s.f(h0Var, new h0(null, 1, 0 == true ? 1 : 0));
    }

    private static final String l(u5 u5Var) {
        String strH1;
        v0 vehicle_detail_state = u5Var.getVehicle_detail_state();
        if (vehicle_detail_state == null || (strH1 = vehicle_detail_state.getVehicle_name()) == null) {
            a0 legacy_vehicle_state = u5Var.getLegacy_vehicle_state();
            strH1 = legacy_vehicle_state != null ? legacy_vehicle_state.getVehicle_name() : null;
        }
        if (strH1 == null || m(strH1)) {
            return null;
        }
        return strH1;
    }

    public static final boolean l0(u5 u5Var) {
        Integer key_version;
        s.k(u5Var, "<this>");
        u0 vehicle_config = u5Var.getVehicle_config();
        if (((vehicle_config == null || (key_version = vehicle_config.getKey_version()) == null) ? 0 : key_version.intValue()) > 0) {
            return true;
        }
        u0 vehicle_config2 = u5Var.getVehicle_config();
        u0.d car_type = vehicle_config2 != null ? vehicle_config2.getCar_type() : null;
        if (!k0(car_type != null ? car_type.getCarTypeModel3() : null)) {
            if (!k0(car_type != null ? car_type.getCarTypeModelY() : null)) {
                if (!k0(car_type != null ? car_type.getCarTypeLychee() : null)) {
                    if (!k0(car_type != null ? car_type.getCarTypeTamarind() : null)) {
                        if (!k0(car_type != null ? car_type.getCarTypeSemiTruck() : null)) {
                            if (!k0(car_type != null ? car_type.getCarTypeCybertruck() : null)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static final boolean m(String str) {
        return new p013kotlin.text.q("^\\s*$").i(str);
    }

    public static final Pair<Double, Double> n(u5 u5Var) {
        s.k(u5Var, "<this>");
        e0 location_state = u5Var.getLocation_state();
        if (location_state == null) {
            return null;
        }
        Float fJ0 = j0(location_state.getLatitude());
        Float fJ1 = j0(location_state.getLongitude());
        if (s.f(location_state.getNative_location_supported(), Boolean.TRUE)) {
            e0.c cVarI = location_state.getNative_type();
            if (k0(cVarI != null ? cVarI.getGCJ() : null)) {
                fJ0 = j0(location_state.getNative_latitude());
                if (fJ0 == null) {
                    fJ0 = j0(location_state.getCorrected_latitude());
                }
                fJ1 = j0(location_state.getNative_longitude());
                if (fJ1 == null) {
                    fJ1 = j0(location_state.getCorrected_longitude());
                }
            }
        }
        if (fJ0 == null || fJ1 == null) {
            return null;
        }
        return x.a(Double.valueOf(fJ0.floatValue()), Double.valueOf(fJ1.floatValue()));
    }

    public static final Integer o(u5 u5Var) {
        s.k(u5Var, "<this>");
        u0 vehicle_config = u5Var.getVehicle_config();
        if (vehicle_config != null) {
            return vehicle_config.getKey_version();
        }
        return null;
    }

    public static final qf0.a p(xc0.a aVar) {
        u0 vehicle_config;
        s.k(aVar, "<this>");
        u5 u5VarJ = aVar.getVehicle_data();
        return wb0.a.j((u5VarJ == null || (vehicle_config = u5VarJ.getVehicle_config()) == null) ? null : vehicle_config.getCar_type());
    }

    public static final String q(xc0.a aVar) {
        s.k(aVar, "<this>");
        String strL = aVar.getVin();
        if (!t.y0(strL)) {
            return strL;
        }
        if (ie0.r.c()) {
            throw new IllegalArgumentException("This vehicle doesn't have a vin!");
        }
        return "";
    }

    public static final int r(u5 u5Var) {
        s.k(u5Var, "<this>");
        u0 vehicle_config = u5Var.getVehicle_config();
        u0.d car_type = vehicle_config != null ? vehicle_config.getCar_type() : null;
        if (car_type == null) {
            return Integer.MAX_VALUE;
        }
        if (k0(car_type.getCarTypeModel3())) {
            return 0;
        }
        if (k0(car_type.getCarTypeModelY())) {
            return 1;
        }
        if (k0(car_type.getCarTypeModelS())) {
            return 2;
        }
        if (k0(car_type.getCarTypeModelS2())) {
            return 3;
        }
        if (k0(car_type.getCarTypeLychee())) {
            return 4;
        }
        if (k0(car_type.getCarTypeModelX())) {
            return 5;
        }
        if (k0(car_type.getCarTypeTamarind())) {
            return 6;
        }
        if (k0(car_type.getCarTypeCybertruck())) {
            return 7;
        }
        return k0(car_type.getCarTypeSemiTruck()) ? 8 : Integer.MAX_VALUE;
    }

    public static final Instant s(u5 u5Var) {
        Instant instantY;
        Instant instantE;
        Instant instantX;
        Instant instantC0;
        Instant timestamp;
        s.k(u5Var, "<this>");
        a1 vehicle_state = u5Var.getVehicle_state();
        if (vehicle_state == null || (instantY = vehicle_state.getTimestamp()) == null) {
            instantY = Instant.MIN;
        }
        s.h(instantY);
        r closures_state = u5Var.getClosures_state();
        if (closures_state == null || (instantE = closures_state.getTimestamp()) == null) {
            instantE = Instant.MIN;
        }
        u drive_state = u5Var.getDrive_state();
        if (drive_state == null || (instantX = drive_state.getTimestamp()) == null) {
            instantX = Instant.MIN;
        }
        q climate_state = u5Var.getClimate_state();
        if (climate_state == null || (instantC0 = climate_state.getTimestamp()) == null) {
            instantC0 = Instant.MIN;
        }
        o charge_state = u5Var.getCharge_state();
        if (charge_state == null || (timestamp = charge_state.getTimestamp()) == null) {
            timestamp = Instant.MIN;
        }
        Comparable comparableJ = mn0.a.j(instantY, instantE, instantX, instantC0, timestamp);
        s.j(comparableJ, "maxOf(...)");
        return (Instant) comparableJ;
    }

    public static final g0 t(xc0.a aVar) {
        r closures_state;
        g0 g0VarH;
        r rVarD;
        g0 g0VarH2;
        s.k(aVar, "<this>");
        if (b(aVar)) {
            xc0.b bVarC = aVar.getBle_status();
            return (bVarC == null || (rVarD = bVarC.getClosure_state()) == null || (g0VarH2 = rVarD.getTonneau_state()) == null) ? g0.CLOSURESTATE_UNKNOWN : g0VarH2;
        }
        u5 u5VarJ = aVar.getVehicle_data();
        return (u5VarJ == null || (closures_state = u5VarJ.getClosures_state()) == null || (g0VarH = closures_state.getTonneau_state()) == null) ? g0.CLOSURESTATE_UNKNOWN : g0VarH;
    }

    public static final Pair<Double, Double> u(u5 u5Var) {
        s.k(u5Var, "<this>");
        e0 location_state = u5Var.getLocation_state();
        Float fJ0 = j0(location_state != null ? location_state.getLatitude() : null);
        e0 location_state2 = u5Var.getLocation_state();
        Float fJ1 = j0(location_state2 != null ? location_state2.getLongitude() : null);
        e0 location_state3 = u5Var.getLocation_state();
        e0.c cVarI = location_state3 != null ? location_state3.getNative_type() : null;
        e0 location_state4 = u5Var.getLocation_state();
        boolean z11 = false;
        if (location_state4 != null ? s.f(location_state4.getNative_location_supported(), Boolean.TRUE) : false) {
            if (k0(cVarI != null ? cVarI.getGCJ() : null)) {
                e0 location_state5 = u5Var.getLocation_state();
                fJ0 = j0(location_state5 != null ? location_state5.getNative_latitude() : null);
                if (fJ0 == null) {
                    e0 location_state6 = u5Var.getLocation_state();
                    fJ0 = j0(location_state6 != null ? location_state6.getCorrected_latitude() : null);
                }
                e0 location_state7 = u5Var.getLocation_state();
                fJ1 = j0(location_state7 != null ? location_state7.getNative_longitude() : null);
                if (fJ1 == null) {
                    e0 location_state8 = u5Var.getLocation_state();
                    fJ1 = j0(location_state8 != null ? location_state8.getCorrected_longitude() : null);
                }
                z11 = true;
            }
        }
        if (fJ0 == null || fJ1 == null) {
            return null;
        }
        return z11 ? f(fJ0.floatValue(), fJ1.floatValue()) : x.a(Double.valueOf(fJ0.floatValue()), Double.valueOf(fJ1.floatValue()));
    }

    public static final String v(u5 u5Var) {
        s.k(u5Var, "<this>");
        u0 vehicle_config = u5Var.getVehicle_config();
        if (vehicle_config != null) {
            return vehicle_config.getVin();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public static final boolean w(u5 u5Var) {
        Float fJ0;
        Float fJ1;
        s.k(u5Var, "<this>");
        e0 location_state = u5Var.getLocation_state();
        if (location_state == null) {
            return false;
        }
        if (s.f(location_state.getNative_location_supported(), Boolean.TRUE)) {
            e0.c cVarI = location_state.getNative_type();
            if (k0(cVarI != null ? cVarI.getGCJ() : null)) {
                fJ0 = j0(location_state.getNative_latitude());
                if (fJ0 == null) {
                    fJ0 = j0(location_state.getCorrected_latitude());
                }
                fJ1 = j0(location_state.getNative_longitude());
                if (fJ1 == null) {
                    fJ1 = j0(location_state.getCorrected_longitude());
                }
            } else {
                fJ0 = j0(location_state.getLatitude());
                fJ1 = j0(location_state.getLongitude());
            }
        } else {
            fJ0 = j0(location_state.getLatitude());
            fJ1 = j0(location_state.getLongitude());
        }
        return (fJ1 == null || fJ0 == null) ? false : true;
    }

    public static final boolean x(u5 u5Var) {
        s.k(u5Var, "<this>");
        u0 vehicle_config = u5Var.getVehicle_config();
        if (vehicle_config != null) {
            return s.f(vehicle_config.getMotorized_charge_port(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean y(xc0.a aVar) {
        s.k(aVar, "<this>");
        xc0.b bVarC = aVar.getBle_status();
        return bVarC != null && bVarC.getPhone_key_paired();
    }

    public static final boolean z(u5 u5Var) {
        s.k(u5Var, "<this>");
        u0 vehicle_config = u5Var.getVehicle_config();
        if (vehicle_config != null) {
            return s.f(vehicle_config.getPlg(), Boolean.TRUE);
        }
        return false;
    }
}
