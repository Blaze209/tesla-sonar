package y5;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ly5/c;", "Ly5/a;", "", "Lw5/d;", "uwbClient", "Lv5/a;", "rangingCapabilities", "Lv5/f;", "localAddress", "<init>", "(Lw5/d;Lv5/a;Lv5/f;)V", "f", "Lv5/a;", "getRangingCapabilities", "()Lv5/a;", "g", "Lv5/f;", "getLocalAddress", "()Lv5/f;", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends a implements v5.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final v5.a rangingCapabilities;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final v5.f localAddress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w5.d uwbClient, v5.a rangingCapabilities, v5.f localAddress) {
        super(uwbClient, rangingCapabilities, localAddress);
        s.k(uwbClient, "uwbClient");
        s.k(rangingCapabilities, "rangingCapabilities");
        s.k(localAddress, "localAddress");
        this.rangingCapabilities = rangingCapabilities;
        this.localAddress = localAddress;
    }
}
