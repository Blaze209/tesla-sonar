package yb0;

import com.tesla.domain.model.widget.VehicleClosure;
import gc0.r;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgc0/r;", "Lcom/tesla/domain/model/widget/VehicleClosure;", "closure", "", "a", "(Lgc0/r;Lcom/tesla/domain/model/widget/VehicleClosure;)Z", "domain_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: yb0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C2724a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125330a;

        static {
            int[] iArr = new int[VehicleClosure.values().length];
            try {
                iArr[VehicleClosure.DRIVER_FRONT_DOOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VehicleClosure.DRIVER_REAR_DOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VehicleClosure.PASSENGER_FRONT_DOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VehicleClosure.PASSENGER_REAR_DOOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VehicleClosure.FRONT_TRUNK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VehicleClosure.REAR_TRUNK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VehicleClosure.LOCKED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f125330a = iArr;
        }
    }

    public static final boolean a(r rVar, VehicleClosure closure) {
        s.k(rVar, "<this>");
        s.k(closure, "closure");
        switch (C2724a.f125330a[closure.ordinal()]) {
            case 1:
                return s.f(rVar.getDoor_open_driver_front(), Boolean.TRUE);
            case 2:
                return s.f(rVar.getDoor_open_driver_rear(), Boolean.TRUE);
            case 3:
                return s.f(rVar.getDoor_open_passenger_front(), Boolean.TRUE);
            case 4:
                return s.f(rVar.getDoor_open_passenger_rear(), Boolean.TRUE);
            case 5:
                return s.f(rVar.getDoor_open_trunk_front(), Boolean.TRUE);
            case 6:
                return s.f(rVar.getDoor_open_trunk_rear(), Boolean.TRUE);
            case 7:
                return s.f(rVar.getLocked(), Boolean.TRUE);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
