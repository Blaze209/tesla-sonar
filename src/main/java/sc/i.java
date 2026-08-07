package sc;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lsc/i;", "", "Lsc/g;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f111067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f111066b = j.a(Size.f111062d);

    /* JADX INFO: renamed from: sc.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lsc/i$a;", "", "<init>", "()V", "Lsc/i;", "ORIGINAL", "Lsc/i;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f111067a = new Companion();

        private Companion() {
        }
    }

    Object a(Continuation<? super Size> continuation);
}
