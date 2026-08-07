package gb0;

import j$.time.Instant;
import java.util.UUID;
import kc0.c;
import kc0.d;
import kc0.g;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkc0/c;", "Lkc0/d;", "a", "(Lkc0/c;)Lkc0/d;", "command_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final d a(c cVar) {
        s.k(cVar, "<this>");
        k.Companion companion = k.INSTANCE;
        String string = UUID.randomUUID().toString();
        s.j(string, "toString(...)");
        byte[] bytes = string.getBytes(p013kotlin.text.d.UTF_8);
        s.j(bytes, "getBytes(...)");
        k kVarI = k.Companion.i(companion, bytes, 0, 0, 3, null);
        k txid = cVar.getTxid();
        k request_txid = cVar.getRequest_txid();
        return new d(new c(kVarI, cVar.getTopic(), Instant.EPOCH, null, 0, txid, g.STATUS_CODE_CLIENT_ACK.getValue(), null, null, request_txid, null, cVar.getMessage_id(), null, 5528, null), null, null, null, 14, null);
    }
}
