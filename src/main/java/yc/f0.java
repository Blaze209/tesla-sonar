package yc;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import coil3.request.NullRequestDataException;
import java.io.Closeable;
import java.util.List;
import kotlinx.coroutines.CoroutineDispatcher;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.o0;
import rc.ErrorResult;
import rc.ImageRequest;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0002*\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0012\u001a\u0004\u0018\u00010\u0010*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0019\u001a\u00020\u0014*\u00020\u00142\u001c\u0010\u0018\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001d\u001a\u00020\u0014*\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-\"(\u00104\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0018\u00108\u001a\u00020 *\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0018\u0010<\u001a\u000209*\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;\" \u0010C\u001a\u0004\u0018\u00010>*\u00020=8@X\u0080\u0004¢\u0006\f\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Ljava/io/Closeable;", "Lokio/Closeable;", "Ljn0/h0;", "h", "(Ljava/io/Closeable;)V", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/AutoCloseable;)V", "Lec/h;", "", "data", "Lrc/n;", "options", "Lyc/t;", "logger", "", "tag", "p", "(Lec/h;Ljava/lang/Object;Lrc/n;Lyc/t;Ljava/lang/String;)Ljava/lang/String;", "Lec/h$a;", "Lkotlin/Pair;", "Lic/j$a;", "Lco0/d;", "pair", "e", "(Lec/h$a;Lkotlin/Pair;)Lec/h$a;", "Lgc/k$a;", "factory", DateTokenConverter.CONVERTER_KEY, "(Lec/h$a;Lgc/k$a;)Lec/h$a;", "", "", "n", "(I)Z", "Lec/g0;", "uri", "m", "(Lec/g0;)Z", "Lrc/g;", "request", "", "throwable", "Lrc/e;", "c", "(Lrc/g;Ljava/lang/Throwable;)Lrc/e;", "Lkotlin/Function1;", "Lec/n;", "a", "Lwn0/l;", "k", "()Lwn0/l;", "EMPTY_IMAGE_FACTORY", "Ljc/d$a;", "o", "(Ljc/d$a;)Z", "isPlaceholderCached", "Lec/j;", "l", "(Ljc/d$a;)Lec/j;", "eventListener", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/CoroutineDispatcher;", "j", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "dispatcher", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wn0.l<ImageRequest, ec.n> f125341a = a.f125342a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements wn0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f125342a = new a();

        a() {
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ImageRequest imageRequest) {
            return null;
        }
    }

    public static final ErrorResult c(ImageRequest imageRequest, Throwable th2) {
        ec.n nVarA;
        if (!(th2 instanceof NullRequestDataException) || (nVarA = imageRequest.b()) == null) {
            nVarA = imageRequest.a();
        }
        return new ErrorResult(nVarA, imageRequest, th2);
    }

    public static final ec.h.a d(ec.h.a aVar, final gc.k.a aVar2) {
        if (aVar2 != null) {
            aVar.q().add(0, new wn0.a() { // from class: yc.e0
                @Override // wn0.a
                public final Object invoke() {
                    return f0.g(aVar2);
                }
            });
        }
        return aVar;
    }

    public static final ec.h.a e(ec.h.a aVar, final Pair<? extends ic.j.a<?>, ? extends co0.d<?>> pair) {
        if (pair != null) {
            aVar.r().add(0, new wn0.a() { // from class: yc.d0
                @Override // wn0.a
                public final Object invoke() {
                    return f0.f(pair);
                }
            });
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(Pair pair) {
        return p013kotlin.collections.v.e(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(gc.k.a aVar) {
        return p013kotlin.collections.v.e(aVar);
    }

    public static final void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final void i(AutoCloseable autoCloseable) {
        try {
            z6.b.a(autoCloseable);
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final CoroutineDispatcher j(CoroutineContext coroutineContext) {
        return (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.INSTANCE);
    }

    public static final wn0.l<ImageRequest, ec.n> k() {
        return f125341a;
    }

    public static final ec.j l(jc.d.a aVar) {
        return aVar instanceof jc.e ? ((jc.e) aVar).getEventListener() : ec.j.f62492b;
    }

    public static final boolean m(ec.g0 g0Var) {
        return ((g0Var.getCom.adyen.checkout.components.core.paymentmethod.CardPaymentMethod.PAYMENT_METHOD_TYPE java.lang.String() != null && !p013kotlin.jvm.internal.s.f(g0Var.getCom.adyen.checkout.components.core.paymentmethod.CardPaymentMethod.PAYMENT_METHOD_TYPE java.lang.String(), Action.FILE_ATTRIBUTE)) || g0Var.getPath() == null || g0.h(g0Var)) ? false : true;
    }

    public static final boolean n(int i11) {
        return i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE;
    }

    public static final boolean o(jc.d.a aVar) {
        return (aVar instanceof jc.e) && ((jc.e) aVar).getIsPlaceholderCached();
    }

    public static final String p(ec.h hVar, Object obj, Options options, t tVar, String str) {
        List<Pair<kc.c<? extends Object>, co0.d<? extends Object>>> listH = hVar.h();
        int size = listH.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            Pair<kc.c<? extends Object>, co0.d<? extends Object>> pair = listH.get(i11);
            kc.c<? extends Object> cVarA = pair.a();
            if (pair.b().j(obj)) {
                p013kotlin.jvm.internal.s.i(cVarA, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                String strA = cVarA.a(obj, options);
                if (strA != null) {
                    return strA;
                }
                z11 = true;
            }
        }
        if (!z11 && tVar != null) {
            t.a aVar = t.a.Warn;
            if (tVar.b().compareTo(aVar) <= 0) {
                tVar.a(str, aVar, "No keyer is registered for data with type '" + o0.b(obj.getClass()).l() + "'. Register Keyer<" + o0.b(obj.getClass()).l() + "> in the component registry to cache the output image in the memory cache.", null);
            }
        }
        return null;
    }
}
