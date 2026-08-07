package io.ktor.utils.io;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J+\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lio/ktor/utils/io/g;", "", "", "dst", "", "offset", "length", IntegerTokenConverter.CONVERTER_KEY, "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lml0/a;", "b", "(Lml0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "Lll0/k;", "g", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "max", "c", "a", "()I", "availableForRead", "o", "()Z", "isClosedForRead", "h", "()Ljava/lang/Throwable;", "closedCause", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f78712a;

    /* JADX INFO: renamed from: io.ktor.utils.io.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/utils/io/g$a;", "", "<init>", "()V", "Lio/ktor/utils/io/g;", "b", "Lkotlin/Lazy;", "a", "()Lio/ktor/utils/io/g;", "Empty", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f78712a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Lazy<c> Empty = jn0.m.b(C1676a.f78714c);

        /* JADX INFO: renamed from: io.ktor.utils.io.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/c;", "b", "()Lio/ktor/utils/io/c;"}, k = 3, mv = {1, 8, 0})
        static final class C1676a extends p013kotlin.jvm.internal.u implements wn0.a<c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1676a f78714c = new C1676a();

            C1676a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke() {
                c cVarB = e.b(false, 1, null);
                k.a(cVarB);
                return cVarB;
            }
        }

        private Companion() {
        }

        public final g a() {
            return Empty.getValue();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ Object a(g gVar, long j11, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readRemaining");
            }
            if ((i11 & 1) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return gVar.g(j11, continuation);
        }
    }

    int a();

    Object b(ml0.a aVar, Continuation<? super Integer> continuation);

    Object c(long j11, Continuation<? super Long> continuation);

    boolean cancel(Throwable cause);

    Object g(long j11, Continuation<? super ll0.k> continuation);

    Throwable h();

    Object i(byte[] bArr, int i11, int i12, Continuation<? super Integer> continuation);

    boolean o();
}
