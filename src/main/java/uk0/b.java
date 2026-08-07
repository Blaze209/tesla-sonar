package uk0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpk0/a;", "Lio/ktor/utils/io/g;", "content", "a", "(Lpk0/a;Lio/ktor/utils/io/g;)Lpk0/a;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final pk0.a a(pk0.a aVar, io.ktor.utils.io.g content) {
        s.k(aVar, "<this>");
        s.k(content, "content");
        return new a(aVar.getClient(), content, aVar);
    }
}
