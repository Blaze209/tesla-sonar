package v3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lv3/y;", "", "<init>", "()V", "Lv3/z;", "pointerInputEvent", "Lv3/l0;", "positionCalculator", "Lv3/g;", "b", "(Lv3/z;Lv3/l0;)Lv3/g;", "Ljn0/h0;", "a", "Landroidx/collection/v;", "Lv3/y$a;", "Landroidx/collection/v;", "previousPointerInputData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.collection.v<a> previousPointerInputData = new androidx.collection.v<>(0, 1, null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lv3/y$a;", "", "", "uptime", "Lj3/g;", "positionOnScreen", "", "down", "Lv3/k0;", "type", "<init>", "(JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "c", "()J", "b", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "I", "getType-T8wyACA", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long uptime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long positionOnScreen;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean down;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int type;

        public /* synthetic */ a(long j11, long j12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12, z11, i11);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDown() {
            return this.down;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getUptime() {
            return this.uptime;
        }

        private a(long j11, long j12, boolean z11, int i11) {
            this.uptime = j11;
            this.positionOnScreen = j12;
            this.down = z11;
            this.type = i11;
        }
    }

    public final void a() {
        this.previousPointerInputData.a();
    }

    public final g b(z pointerInputEvent, l0 positionCalculator) {
        long uptime;
        boolean down;
        long jN;
        androidx.collection.v vVar = new androidx.collection.v(pointerInputEvent.b().size());
        List<PointerInputEventData> listB = pointerInputEvent.b();
        int size = listB.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointerInputEventData pointerInputEventData = listB.get(i11);
            a aVarD = this.previousPointerInputData.d(pointerInputEventData.getId());
            if (aVarD == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                jN = pointerInputEventData.getPosition();
            } else {
                uptime = aVarD.getUptime();
                down = aVarD.getDown();
                jN = positionCalculator.n(aVarD.getPositionOnScreen());
            }
            vVar.h(pointerInputEventData.getId(), new PointerInputChange(pointerInputEventData.getId(), pointerInputEventData.getUptime(), pointerInputEventData.getPosition(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jN, down, false, pointerInputEventData.getType(), pointerInputEventData.c(), pointerInputEventData.getScrollDelta(), pointerInputEventData.getOriginalEventPosition(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.h(pointerInputEventData.getId(), new a(pointerInputEventData.getUptime(), pointerInputEventData.getPositionOnScreen(), pointerInputEventData.getDown(), pointerInputEventData.getType(), null));
            } else {
                this.previousPointerInputData.i(pointerInputEventData.getId());
            }
        }
        return new g(vVar, pointerInputEvent);
    }
}
