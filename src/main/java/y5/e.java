package y5;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import v5.UwbComplexChannel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ly5/e;", "Ly5/a;", "Lv5/j;", "Lw5/d;", "uwbClient", "Lv5/a;", "rangingCapabilities", "Lv5/f;", "localAddress", "Lv5/i;", "uwbComplexChannel", "<init>", "(Lw5/d;Lv5/a;Lv5/f;Lv5/i;)V", "f", "Lw5/d;", "g", "Lv5/a;", "getRangingCapabilities", "()Lv5/a;", "h", "Lv5/f;", "getLocalAddress", "()Lv5/f;", IntegerTokenConverter.CONVERTER_KEY, "Lv5/i;", "b", "()Lv5/i;", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends a implements v5.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w5.d uwbClient;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final v5.a rangingCapabilities;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final v5.f localAddress;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final UwbComplexChannel uwbComplexChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w5.d uwbClient, v5.a rangingCapabilities, v5.f localAddress, UwbComplexChannel uwbComplexChannel) {
        super(uwbClient, rangingCapabilities, localAddress);
        s.k(uwbClient, "uwbClient");
        s.k(rangingCapabilities, "rangingCapabilities");
        s.k(localAddress, "localAddress");
        s.k(uwbComplexChannel, "uwbComplexChannel");
        this.uwbClient = uwbClient;
        this.rangingCapabilities = rangingCapabilities;
        this.localAddress = localAddress;
        this.uwbComplexChannel = uwbComplexChannel;
    }

    @Override // v5.j
    /* JADX INFO: renamed from: b, reason: from getter */
    public UwbComplexChannel getUwbComplexChannel() {
        return this.uwbComplexChannel;
    }

    @Override // v5.h
    public v5.f getLocalAddress() {
        return this.localAddress;
    }

    @Override // v5.h
    public v5.a getRangingCapabilities() {
        return this.rangingCapabilities;
    }
}
