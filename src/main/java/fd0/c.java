package fd0;

import j$.time.Instant;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lfd0/c;", "", "<init>", "()V", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "b", "()Lj$/time/Instant;", "Lfd0/h;", "params", "Lsc0/h;", "routableMessage", "", "vehicleToken", "Lkc0/c;", "a", "(Lfd0/h;Lsc0/h;Ljava/lang/String;)Lkc0/c;", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f65694a = new c();

    private c() {
    }

    private final Instant b() {
        Instant EPOCH = Instant.EPOCH;
        s.j(EPOCH, "EPOCH");
        return EPOCH;
    }

    public final kc0.c a(ProtoRequestBuildParams params, sc0.h routableMessage, String vehicleToken) {
        s.k(params, "params");
        s.k(routableMessage, "routableMessage");
        Instant instantB = b();
        okio.k.Companion companion = okio.k.INSTANCE;
        return new kc0.c(companion.f(params.getRequest().I()), okio.k.Companion.i(companion, t.J("vehicle_device." + params.getVin() + ".cmds"), 0, 0, 3, null), instantB, null, 0, null, 0, null, instantB.plusMillis(10000L), routableMessage.encodeByteString(), vehicleToken != null ? d.f65695a.a(vehicleToken) : null, null, null, 6392, null);
    }
}
