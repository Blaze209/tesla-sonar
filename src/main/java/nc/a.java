package nc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnc/a;", "", "<init>", "()V", "Lokio/j;", "source", "Lnc/p;", "a", "(Lokio/j;)Lnc/p;", "response", "Lokio/i;", "sink", "Ljn0/h0;", "b", "(Lnc/p;Lokio/i;)V", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93707a = new a();

    private a() {
    }

    public final NetworkResponse a(okio.j source) {
        int i11 = Integer.parseInt(source.w2());
        long j11 = Long.parseLong(source.w2());
        long j12 = Long.parseLong(source.w2());
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        int i12 = Integer.parseInt(source.w2());
        for (int i13 = 0; i13 < i12; i13++) {
            oc.e.b(aVar, source.w2());
        }
        return new NetworkResponse(i11, j11, j12, aVar.b(), null, null, 48, null);
    }

    public final void b(NetworkResponse response, okio.i sink) {
        sink.I0(response.getCode()).writeByte(10);
        sink.I0(response.getRequestMillis()).writeByte(10);
        sink.I0(response.getResponseMillis()).writeByte(10);
        Set<Map.Entry<String, List<String>>> setEntrySet = response.getHeaders().b().entrySet();
        Iterator<T> it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        sink.I0(size).writeByte(10);
        for (Map.Entry<String, List<String>> entry : setEntrySet) {
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                sink.l2(entry.getKey()).l2(":").l2(it2.next()).writeByte(10);
            }
        }
    }
}
