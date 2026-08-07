package ff0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.d2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u0006\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lff0/m;", "", "", "time", "<init>", "(J)V", "a", "J", "()J", "c", DateTokenConverter.CONVERTER_KEY, "b", "Lff0/m$a;", "Lff0/m$b;", "Lff0/m$c;", "Lff0/m$d;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long time;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lff0/m$a;", "Lff0/m;", "Lvc0/d2;", "state", "", "time", "<init>", "(Lvc0/d2;J)V", "b", "Lvc0/d2;", "()Lvc0/d2;", "c", "J", "a", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final d2 state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long time;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(d2 state) {
            this(state, 0L, 2, null);
            s.k(state, "state");
        }

        @Override // ff0.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getTime() {
            return this.time;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d2 getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d2 state, long j11) {
            super(j11, null);
            s.k(state, "state");
            this.state = state;
            this.time = j11;
        }

        public /* synthetic */ a(d2 d2Var, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(d2Var, (i11 & 2) != 0 ? System.currentTimeMillis() : j11);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lff0/m$b;", "Lff0/m;", "", "bitmask", "", "time", "<init>", "(IJ)V", "b", "I", "()I", "c", "J", "a", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int bitmask;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long time;

        public b(int i11) {
            this(i11, 0L, 2, null);
        }

        @Override // ff0.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getTime() {
            return this.time;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getBitmask() {
            return this.bitmask;
        }

        public b(int i11, long j11) {
            super(j11, null);
            this.bitmask = i11;
            this.time = j11;
        }

        public /* synthetic */ b(int i11, long j11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? System.currentTimeMillis() : j11);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lff0/m$c;", "Lff0/m;", "", "time", "<init>", "(J)V", "b", "J", "a", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long time;

        public c() {
            this(0L, 1, null);
        }

        @Override // ff0.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getTime() {
            return this.time;
        }

        public c(long j11) {
            super(j11, null);
            this.time = j11;
        }

        public /* synthetic */ c(long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? System.currentTimeMillis() : j11);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lff0/m$d;", "Lff0/m;", "", "time", "<init>", "(J)V", "b", "J", "a", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long time;

        public d() {
            this(0L, 1, null);
        }

        @Override // ff0.m
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

    public /* synthetic */ m(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public long getTime() {
        return this.time;
    }

    private m(long j11) {
        this.time = j11;
    }
}
