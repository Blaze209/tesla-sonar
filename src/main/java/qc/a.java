package qc;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import jn0.t;
import nc.NetworkRequest;
import nc.NetworkResponse;
import nc.h;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"Lqc/a;", "Lnc/h;", "Lokhttp3/Call$Factory;", "callFactory", "c", "(Lokhttp3/Call$Factory;)Lokhttp3/Call$Factory;", "T", "Lnc/n;", "request", "Lkotlin/Function2;", "Lnc/p;", "Lkotlin/coroutines/Continuation;", "", "block", "e", "(Lokhttp3/Call$Factory;Lnc/n;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lokhttp3/Call$Factory;", "coil-network-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
@vn0.b
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Call.Factory callFactory;

    /* JADX INFO: renamed from: qc.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "utils.kt", i = {0, 1}, l = {24, 24, 25}, m = "executeRequest-impl", n = {"block", "block"}, s = {"L$0", "L$0"})
    static final class C2227a<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f105322n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f105323o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f105324p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f105325q;

        C2227a(Continuation<? super C2227a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f105324p = obj;
            this.f105325q |= Integer.MIN_VALUE;
            return a.e(null, null, null, this);
        }
    }

    private /* synthetic */ a(Call.Factory factory) {
        this.callFactory = factory;
    }

    public static final /* synthetic */ a b(Call.Factory factory) {
        return new a(factory);
    }

    public static boolean d(Call.Factory factory, Object obj) {
        return (obj instanceof a) && s.f(factory, ((a) obj).getCallFactory());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static <T> Object e(Call.Factory factory, NetworkRequest networkRequest, p<? super NetworkResponse, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        C2227a c2227a;
        p<? super NetworkResponse, ? super Continuation<? super T>, ? extends Object> pVar2;
        Closeable closeable;
        Throwable th2;
        Closeable closeable2;
        if (continuation instanceof C2227a) {
            c2227a = (C2227a) continuation;
            int i11 = c2227a.f105325q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2227a.f105325q = i11 - Integer.MIN_VALUE;
            } else {
                c2227a = new C2227a(continuation);
            }
        } else {
            c2227a = new C2227a(continuation);
        }
        Object objH = c2227a.f105324p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c2227a.f105325q;
        if (i12 == 0) {
            t.b(objH);
            c2227a.f105322n = pVar;
            c2227a.f105323o = factory;
            c2227a.f105325q = 1;
            objH = e.h(networkRequest, c2227a);
            if (objH != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = (Closeable) c2227a.f105322n;
                try {
                    t.b(objH);
                    sn0.b.a(closeable2, null);
                    return objH;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        throw th2;
                    } catch (Throwable th4) {
                        sn0.b.a(closeable2, th2);
                        throw th4;
                    }
                }
            }
            pVar2 = (p) c2227a.f105322n;
            t.b(objH);
            closeable = (Closeable) objH;
            try {
                NetworkResponse networkResponseG = e.g((Response) closeable);
                c2227a.f105322n = closeable;
                c2227a.f105325q = 3;
                objH = pVar2.invoke(networkResponseG, c2227a);
                if (objH != coroutine_suspended) {
                    closeable2 = closeable;
                    sn0.b.a(closeable2, null);
                    return objH;
                }
                return coroutine_suspended;
            } catch (Throwable th5) {
                th2 = th5;
                closeable2 = closeable;
                throw th2;
            }
        }
        factory = (Call.Factory) c2227a.f105323o;
        pVar = (p) c2227a.f105322n;
        t.b(objH);
        Call callNewCall = factory.newCall((Request) objH);
        c2227a.f105322n = pVar;
        c2227a.f105323o = null;
        c2227a.f105325q = 2;
        objH = b.a(callNewCall, c2227a);
        if (objH != coroutine_suspended) {
            pVar2 = pVar;
            closeable = (Closeable) objH;
            NetworkResponse networkResponseG2 = e.g((Response) closeable);
            c2227a.f105322n = closeable;
            c2227a.f105325q = 3;
            objH = pVar2.invoke(networkResponseG2, c2227a);
            if (objH != coroutine_suspended) {
                closeable2 = closeable;
                sn0.b.a(closeable2, null);
                return objH;
            }
        }
        return coroutine_suspended;
    }

    public static int f(Call.Factory factory) {
        return factory.hashCode();
    }

    public static String g(Call.Factory factory) {
        return "CallFactoryNetworkClient(callFactory=" + factory + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // nc.h
    public <T> Object a(NetworkRequest networkRequest, p<? super NetworkResponse, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return e(this.callFactory, networkRequest, pVar, continuation);
    }

    public boolean equals(Object other) {
        return d(this.callFactory, other);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ Call.Factory getCallFactory() {
        return this.callFactory;
    }

    public int hashCode() {
        return f(this.callFactory);
    }

    public String toString() {
        return g(this.callFactory);
    }

    public static Call.Factory c(Call.Factory factory) {
        return factory;
    }
}
