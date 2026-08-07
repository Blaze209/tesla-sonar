package ff0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.g2;
import vc0.o1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\u0006\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lff0/k;", "", "", "time", "<init>", "(J)V", "a", "J", "()J", DateTokenConverter.CONVERTER_KEY, "c", "f", "e", "b", "Lff0/k$a;", "Lff0/k$b;", "Lff0/k$c;", "Lff0/k$d;", "Lff0/k$e;", "Lff0/k$f;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long time;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lff0/k$a;", "Lff0/k;", "", "time", "<init>", "(J)V", "b", "J", "a", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long time;

        public a() {
            this(0L, 1, null);
        }

        @Override // ff0.k
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getTime() {
            return this.time;
        }

        public a(long j11) {
            super(j11, null);
            this.time = j11;
        }

        public /* synthetic */ a(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? System.currentTimeMillis() : j11);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lff0/k$b;", "Lff0/k;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends k {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lff0/k$c;", "Lff0/k;", "", "permissionsBitmask", "Lvc0/o1;", "locationPermission", "", "time", "<init>", "(ILvc0/o1;J)V", "b", "I", "c", "()I", "Lvc0/o1;", "()Lvc0/o1;", DateTokenConverter.CONVERTER_KEY, "J", "a", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int permissionsBitmask;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final o1 locationPermission;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, o1 locationPermission, long j11) {
            super(j11, null);
            s.k(locationPermission, "locationPermission");
            this.permissionsBitmask = i11;
            this.locationPermission = locationPermission;
            this.time = j11;
        }

        @Override // ff0.k
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getTime() {
            return this.time;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o1 getLocationPermission() {
            return this.locationPermission;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getPermissionsBitmask() {
            return this.permissionsBitmask;
        }

        public /* synthetic */ c(int i11, o1 o1Var, long j11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, o1Var, (i12 & 4) != 0 ? System.currentTimeMillis() : j11);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lff0/k$d;", "Lff0/k;", "", "time", "<init>", "(J)V", "b", "J", "a", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long time;

        public d() {
            this(0L, 1, null);
        }

        @Override // ff0.k
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getTime() {
            return this.time;
        }

        public d(long j11) {
            super(j11, null);
            this.time = j11;
        }

        public /* synthetic */ d(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? System.currentTimeMillis() : j11);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lff0/k$e;", "Lff0/k;", "Lvc0/g2$e;", AnalyticsAttribute.Reason, "", "time", "<init>", "(Lvc0/g2$e;J)V", "b", "Lvc0/g2$e;", "()Lvc0/g2$e;", "c", "J", "a", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final g2.e reason;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long time;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(g2.e reason) {
            this(reason, 0L, 2, null);
            s.k(reason, "reason");
        }

        @Override // ff0.k
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getTime() {
            return this.time;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final g2.e getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g2.e reason, long j11) {
            super(j11, null);
            s.k(reason, "reason");
            this.reason = reason;
            this.time = j11;
        }

        public /* synthetic */ e(g2.e eVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(eVar, (i11 & 2) != 0 ? System.currentTimeMillis() : j11);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lff0/k$f;", "Lff0/k;", "Lvc0/g2$d;", "runningState", "", "time", "<init>", "(Lvc0/g2$d;J)V", "b", "Lvc0/g2$d;", "()Lvc0/g2$d;", "c", "J", "a", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final g2.d runningState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long time;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(g2.d runningState) {
            this(runningState, 0L, 2, null);
            s.k(runningState, "runningState");
        }

        @Override // ff0.k
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getTime() {
            return this.time;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final g2.d getRunningState() {
            return this.runningState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(g2.d runningState, long j11) {
            super(j11, null);
            s.k(runningState, "runningState");
            this.runningState = runningState;
            this.time = j11;
        }

        public /* synthetic */ f(g2.d dVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, (i11 & 2) != 0 ? System.currentTimeMillis() : j11);
        }
    }

    public /* synthetic */ k(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public long getTime() {
        return this.time;
    }

    private k(long j11) {
        this.time = j11;
    }
}
