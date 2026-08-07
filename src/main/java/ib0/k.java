package ib0;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lib0/k;", "", "<init>", "()V", "Loc0/a;", "action", "Lnd0/a;", "a", "(Loc0/a;)Lnd0/a;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f77420a = new k();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77421a;

        static {
            int[] iArr = new int[oc0.a.values().length];
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_REAR_TRUNK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_FRONT_TRUNK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_TONNEAU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLIMATE_ON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLIMATE_ON_OVERRIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLIMATE_OFF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLIMATE_KEEPER_CAMP_MODE_OVERRIDE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLIMATE_KEEPER_DOG_MODE_OVERRIDE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_DISABLE_SENTRY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_STOP_CHARGING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_SUNROOF.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_UPDATE_SOFTWARE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CANCEL_SOFTWARE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_WINDOW.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_WINDOW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_WINDOW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_WINDOW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_ALL_WINDOWS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_DOOR_LOCK.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_ENABLE_SENTRY.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_FRONT_DRIVER_DOOR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_FRONT_PASSENGER_DOOR.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_REAR_DRIVER_DOOR.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_REAR_PASSENGER_DOOR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_CLOSE_ALL_DOORS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[oc0.a.NOTIFICATION_ACTION_START_CHARGING.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            f77421a = iArr;
        }
    }

    private k() {
    }

    public final nd0.a a(oc0.a action) {
        s.k(action, "action");
        switch (a.f77421a[action.ordinal()]) {
            case 1:
                return h.f77417a;
            case 2:
                return g.f77416a;
            case 3:
                return j.f77419a;
            case 4:
                return new e(false, 1, null);
            case 5:
                return new e(true);
            case 6:
                return d.f77413a;
            case 7:
                return new b(false, 1, null);
            case 8:
                return new b(true);
            case 9:
                return new c(false, 1, null);
            case 10:
                return new c(true);
            case 11:
                return l.f77422a;
            case 12:
                return n.f77424a;
            case 13:
                return i.f77418a;
            case 14:
                return o.f77425a;
            case 15:
                return ib0.a.f77410a;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return f.f77415a;
            case 21:
                return m.f77423a;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
