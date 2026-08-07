package v3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v3.x, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJz\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0086\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b5\u0010*R\u001d\u0010\r\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b8\u00100R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b<\u0010*R$\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b7\u0010=\u0012\u0004\b>\u0010\u001cR(\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b6\u0010*\"\u0004\b@\u0010AR*\u0010H\u001a\u00020B2\u0006\u0010C\u001a\u00020B8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010D\u0012\u0004\bG\u0010\u001c\u001a\u0004\bE\u0010FR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010\u001c\u001a\u0004\b1\u0010IR\u0017\u0010M\u001a\u00020\b8F¢\u0006\f\u0012\u0004\bL\u0010\u001c\u001a\u0004\bK\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Lv3/x;", "", "Lv3/w;", "id", "", "uptimeMillis", "Lj3/g;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Lv3/k0;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lv3/e;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljn0/h0;", "a", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "b", "(JJJZJJZILjava/util/List;J)Lv3/x;", DateTokenConverter.CONVERTER_KEY, "(JJJZFJJZILjava/util/List;J)Lv3/x;", "", "toString", "()Ljava/lang/String;", "J", "f", "()J", "o", "c", "h", "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "e", Gender.FEMALE, "j", "()F", "getPreviousUptimeMillis", "g", "k", "l", "I", "n", "()I", "m", "Ljava/util/List;", "get_historical$annotations", "_historical", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "Lv3/d;", "<set-?>", "Lv3/d;", "getConsumed", "()Lv3/d;", "getConsumed$annotations", "consumed", "()Ljava/util/List;", "getHistorical$annotations", "p", "isConsumed$annotations", "isConsumed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PointerInputChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pressed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float pressure;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long previousUptimeMillis;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long previousPosition;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean previousPressed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long scrollDelta;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<HistoricalChange> _historical;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long originalEventPosition;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private d consumed;

    public /* synthetic */ PointerInputChange(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, i11, j16);
    }

    public static /* synthetic */ PointerInputChange c(PointerInputChange pointerInputChange, long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, int i11, List list, long j16, int i12, Object obj) {
        long j17;
        long j18 = (i12 & 1) != 0 ? pointerInputChange.id : j11;
        long j19 = (i12 & 2) != 0 ? pointerInputChange.uptimeMillis : j12;
        long j21 = (i12 & 4) != 0 ? pointerInputChange.position : j13;
        boolean z13 = (i12 & 8) != 0 ? pointerInputChange.pressed : z11;
        long j22 = (i12 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j14;
        long j23 = (i12 & 32) != 0 ? pointerInputChange.previousPosition : j15;
        boolean z14 = (i12 & 64) != 0 ? pointerInputChange.previousPressed : z12;
        int i13 = (i12 & 128) != 0 ? pointerInputChange.type : i11;
        if ((i12 & 512) != 0) {
            j17 = pointerInputChange.scrollDelta;
            j18 = j18;
        } else {
            j17 = j16;
        }
        return pointerInputChange.b(j18, j19, j21, z13, j22, j23, z14, i13, list, j17);
    }

    public final void a() {
        this.consumed.c(true);
        this.consumed.d(true);
    }

    public final PointerInputChange b(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        return d(id2, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
    }

    public final PointerInputChange d(long id2, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, this.originalEventPosition, null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    public final List<HistoricalChange> e() {
        List<HistoricalChange> list = this._historical;
        return list == null ? p013kotlin.collections.v.m() : list;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean p() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) w.f(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) j3.g.t(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) j3.g.t(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + p() + ", type=" + ((Object) k0.i(this.type)) + ", historical=" + e() + ",scrollDelta=" + ((Object) j3.g.t(this.scrollDelta)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ PointerInputChange(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, List list, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, i11, (List<HistoricalChange>) list, j16, j17);
    }

    private PointerInputChange(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, long j16) {
        this.id = j11;
        this.uptimeMillis = j12;
        this.position = j13;
        this.pressed = z11;
        this.pressure = f11;
        this.previousUptimeMillis = j14;
        this.previousPosition = j15;
        this.previousPressed = z12;
        this.type = i11;
        this.scrollDelta = j16;
        this.originalEventPosition = j3.g.INSTANCE.c();
        this.consumed = new d(z13, z13);
    }

    public /* synthetic */ PointerInputChange(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, long j16, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, (i12 & 512) != 0 ? k0.INSTANCE.d() : i11, (i12 & 1024) != 0 ? j3.g.INSTANCE.c() : j16, null);
    }

    private PointerInputChange(long j11, long j12, long j13, boolean z11, float f11, long j14, long j15, boolean z12, boolean z13, int i11, List<HistoricalChange> list, long j16, long j17) {
        this(j11, j12, j13, z11, f11, j14, j15, z12, z13, i11, j16, null);
        this._historical = list;
        this.originalEventPosition = j17;
    }
}
