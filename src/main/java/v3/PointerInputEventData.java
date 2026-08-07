package v3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v3.a0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\b\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b$\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b \u0010+R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b&\u00103R\u001d\u0010\u0013\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001d\u0010\u0014\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b)\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Lv3/a0;", "", "Lv3/w;", "id", "", "uptime", "Lj3/g;", "positionOnScreen", "position", "", "down", "", "pressure", "Lv3/k0;", "type", "activeHover", "", "Lv3/e;", "historical", "scrollDelta", "originalEventPosition", "<init>", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", DateTokenConverter.CONVERTER_KEY, "()J", "b", "k", "c", "g", "f", "e", "Z", "()Z", Gender.FEMALE, "h", "()F", "I", "j", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PointerInputEventData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uptime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long positionOnScreen;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean down;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float pressure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean activeHover;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HistoricalChange> historical;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long scrollDelta;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long originalEventPosition;

    public /* synthetic */ PointerInputEventData(long j11, long j12, long j13, long j14, boolean z11, float f11, int i11, boolean z12, List list, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, z11, f11, i11, z12, list, j15, j16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActiveHover() {
        return this.activeHover;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> c() {
        return this.historical;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return w.d(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && j3.g.j(this.positionOnScreen, pointerInputEventData.positionOnScreen) && j3.g.j(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && k0.g(this.type, pointerInputEventData.type) && this.activeHover == pointerInputEventData.activeHover && p013kotlin.jvm.internal.s.f(this.historical, pointerInputEventData.historical) && j3.g.j(this.scrollDelta, pointerInputEventData.scrollDelta) && j3.g.j(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    public int hashCode() {
        return (((((((((((((((((((w.e(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + j3.g.o(this.positionOnScreen)) * 31) + j3.g.o(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + k0.h(this.type)) * 31) + Boolean.hashCode(this.activeHover)) * 31) + this.historical.hashCode()) * 31) + j3.g.o(this.scrollDelta)) * 31) + j3.g.o(this.originalEventPosition);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) w.f(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) j3.g.t(this.positionOnScreen)) + ", position=" + ((Object) j3.g.t(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) k0.i(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) j3.g.t(this.scrollDelta)) + ", originalEventPosition=" + ((Object) j3.g.t(this.originalEventPosition)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private PointerInputEventData(long j11, long j12, long j13, long j14, boolean z11, float f11, int i11, boolean z12, List<HistoricalChange> list, long j15, long j16) {
        this.id = j11;
        this.uptime = j12;
        this.positionOnScreen = j13;
        this.position = j14;
        this.down = z11;
        this.pressure = f11;
        this.type = i11;
        this.activeHover = z12;
        this.historical = list;
        this.scrollDelta = j15;
        this.originalEventPosition = j16;
    }
}
