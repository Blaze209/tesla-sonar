package oc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import nc.NetworkHeaders;
import nc.NetworkResponse;
import nc.q;
import okio.h;
import okio.i;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\tH\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0080\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\t*\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u0006*\u00060\u0014j\u0002`\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnc/m$a;", "", "line", "b", "(Lnc/m$a;Ljava/lang/String;)Lnc/m$a;", "Lhc/a$b;", "Ljn0/h0;", "a", "(Lhc/a$b;)V", "Lnc/q;", "Lokio/h;", "e", "(Lnc/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnc/m;", "other", DateTokenConverter.CONVERTER_KEY, "(Lnc/m;Lnc/m;)Lnc/m;", "Lnc/p;", "f", "(Lnc/p;)Lnc/q;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "c", "(Ljava/lang/AutoCloseable;)V", "coil-network-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.network.internal.UtilsKt", f = "utils.kt", i = {0}, l = {31}, m = "readBuffer", n = {"buffer"}, s = {"L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f97101n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f97102o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f97103p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f97104q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97103p = obj;
            this.f97104q |= Integer.MIN_VALUE;
            return e.e(null, this);
        }
    }

    public static final void a(hc.a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    public static final NetworkHeaders.a b(NetworkHeaders.a aVar, String str) {
        int iU0 = t.u0(str, CoreConstants.COLON_CHAR, 0, false, 6, null);
        if (iU0 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iU0);
        s.j(strSubstring, "substring(...)");
        String string = t.F1(strSubstring).toString();
        String strSubstring2 = str.substring(iU0 + 1);
        s.j(strSubstring2, "substring(...)");
        aVar.a(string, strSubstring2);
        return aVar;
    }

    public static final void c(AutoCloseable autoCloseable) {
        try {
            z6.b.a(autoCloseable);
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final NetworkHeaders d(NetworkHeaders networkHeaders, NetworkHeaders networkHeaders2) {
        NetworkHeaders.a aVarD = networkHeaders.d();
        for (Map.Entry<String, List<String>> entry : networkHeaders2.b().entrySet()) {
            aVarD.d(entry.getKey(), entry.getValue());
        }
        return aVarD.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(q qVar, Continuation<? super h> continuation) throws Exception {
        a aVar;
        AutoCloseable autoCloseable;
        Throwable th2;
        AutoCloseable autoCloseable2;
        i iVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f97104q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f97104q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f97103p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f97104q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (h) aVar.f97102o;
            autoCloseable = (AutoCloseable) aVar.f97101n;
            try {
                jn0.t.b(obj);
                autoCloseable2 = autoCloseable;
                un0.a.a(autoCloseable2, null);
                return iVar;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    un0.a.a(autoCloseable, th2);
                    throw th4;
                }
            }
        }
        jn0.t.b(obj);
        try {
            i hVar = new h();
            aVar.f97101n = qVar;
            aVar.f97102o = hVar;
            aVar.f97104q = 1;
            if (qVar.u(hVar, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            autoCloseable2 = qVar;
            iVar = hVar;
            un0.a.a(autoCloseable2, null);
            return iVar;
        } catch (Throwable th5) {
            autoCloseable = qVar;
            th2 = th5;
            throw th2;
        }
    }

    public static final q f(NetworkResponse networkResponse) {
        q body = networkResponse.getBody();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("body == null");
    }
}
