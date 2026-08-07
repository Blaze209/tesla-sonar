package uk0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Luk0/a;", "Lpk0/a;", "Lok0/a;", "client", "Lio/ktor/utils/io/g;", "content", "originCall", "<init>", "(Lok0/a;Lio/ktor/utils/io/g;Lpk0/a;)V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends pk0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ok0.a client, io.ktor.utils.io.g content, pk0.a originCall) {
        super(client);
        s.k(client, "client");
        s.k(content, "content");
        s.k(originCall, "originCall");
        h(new c(this, originCall.d()));
        i(new d(this, content, originCall.e()));
    }
}
