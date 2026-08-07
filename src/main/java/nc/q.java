package nc;

import jn0.h0;
import okio.i0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lnc/q;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lokio/i;", "sink", "Ljn0/h0;", "u", "(Lokio/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokio/o;", "fileSystem", "Lokio/i0;", "path", "V2", "(Lokio/o;Lokio/i0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q extends AutoCloseable {
    Object V2(okio.o oVar, i0 i0Var, Continuation<? super h0> continuation);

    Object u(okio.i iVar, Continuation<? super h0> continuation);
}
