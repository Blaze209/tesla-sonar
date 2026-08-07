package nc;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import coil3.network.HttpException;
import com.google.android.gms.common.internal.ImagesContract;
import com.plaid.internal.EnumC4419g;
import ec.g0;
import gc.u;
import gc.v;
import ic.SourceFetchResult;
import java.io.IOException;
import jn0.h0;
import jn0.t;
import okio.c0;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00012BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJB\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000!\u0012\u0006\u0012\u0004\u0018\u00010\"0 H\u0082@¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u0004\u0018\u00010\u0015*\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020(*\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010*J\u0014\u0010,\u001a\u00020(*\u00020+H\u0082@¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020(*\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201H\u0096@¢\u0006\u0004\b2\u00103J#\u00105\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lnc/l;", "Lic/j;", "", ImagesContract.URL, "Lrc/n;", "options", "Lkotlin/Lazy;", "Lnc/h;", "networkClient", "Lhc/a;", "diskCache", "Lnc/b;", "cacheStrategy", "Lnc/d;", "connectivityChecker", "<init>", "(Ljava/lang/String;Lrc/n;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lnc/d;)V", "Lhc/a$c;", "m", "()Lhc/a$c;", "snapshot", "Lnc/p;", "cacheResponse", "Lnc/n;", "networkRequest", "networkResponse", "r", "(Lhc/a$c;Lnc/p;Lnc/n;Lnc/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "()Lnc/n;", "T", "request", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "h", "(Lnc/n;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "(Lhc/a$c;)Lnc/p;", "Lgc/u;", "n", "(Lhc/a$c;)Lgc/u;", "Lnc/q;", "p", "(Lnc/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokio/h;", "o", "(Lokio/h;)Lgc/u;", "Lic/i;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CMSAttributeTableGenerator.CONTENT_TYPE, "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "b", "Lrc/n;", "c", "Lkotlin/Lazy;", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lnc/d;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "diskCacheKey", "Lokio/o;", "j", "()Lokio/o;", "fileSystem", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements ic.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy<h> networkClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy<hc.a> diskCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy<nc.b> cacheStrategy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final nc.d connectivityChecker;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"T", "Lnc/p;", "response", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", f = "NetworkFetcher.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends SuspendLambda implements wn0.p<NetworkResponse, Continuation<? super T>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93734n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93735o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.p<NetworkResponse, Continuation<? super T>, Object> f93736p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.p<? super NetworkResponse, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f93736p = pVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, Continuation<? super T> continuation) {
            return ((b) create(networkResponse, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f93736p, continuation);
            bVar.f93735o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93734n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            NetworkResponse networkResponse = (NetworkResponse) this.f93735o;
            int code = networkResponse.getCode();
            if ((200 > code || code >= 300) && networkResponse.getCode() != 304) {
                throw new HttpException(networkResponse);
            }
            wn0.p<NetworkResponse, Continuation<? super T>, Object> pVar = this.f93736p;
            this.f93734n = 1;
            Object objInvoke = pVar.invoke(networkResponse, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", i = {0, 0, 1, 2}, l = {61, 74, 102}, m = "fetch", n = {"snapshot", "cacheResponse", "snapshot", "snapshot"}, s = {"L$0", "L$1", "L$0", "L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93737n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93738o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f93739p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f93741r;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93739p = obj;
            this.f93741r |= Integer.MIN_VALUE;
            return l.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnc/p;", "response", "Lic/o;", "<anonymous>", "(Lnc/p;)Lic/o;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"response"}, s = {"L$0"})
    static final class d extends SuspendLambda implements wn0.p<NetworkResponse, Continuation<? super SourceFetchResult>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f93742n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93743o;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, Continuation<? super SourceFetchResult> continuation) {
            return ((d) create(networkResponse, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = l.this.new d(continuation);
            dVar.f93743o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NetworkResponse networkResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93742n;
            if (i11 == 0) {
                t.b(obj);
                NetworkResponse networkResponse2 = (NetworkResponse) this.f93743o;
                l lVar = l.this;
                q qVarF = oc.e.f(networkResponse2);
                this.f93743o = networkResponse2;
                this.f93742n = 1;
                Object objP = lVar.p(qVarF, this);
                if (objP == coroutine_suspended) {
                    return coroutine_suspended;
                }
                networkResponse = networkResponse2;
                obj = objP;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                networkResponse = (NetworkResponse) this.f93743o;
                t.b(obj);
            }
            l lVar2 = l.this;
            return new SourceFetchResult((u) obj, lVar2.k(lVar2.url, networkResponse.getHeaders().c("Content-Type")), gc.h.NETWORK);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnc/p;", "response", "Lic/o;", "<anonymous>", "(Lnc/p;)Lic/o;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", i = {0, 1}, l = {76, 87}, m = "invokeSuspend", n = {"response", "response"}, s = {"L$0", "L$0"})
    static final class e extends SuspendLambda implements wn0.p<NetworkResponse, Continuation<? super SourceFetchResult>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93745n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f93746o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f93747p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n0<hc.a.c> f93748q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ l f93749r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ n0<NetworkResponse> f93750s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ NetworkRequest f93751t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n0<hc.a.c> n0Var, l lVar, n0<NetworkResponse> n0Var2, NetworkRequest networkRequest, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f93748q = n0Var;
            this.f93749r = lVar;
            this.f93750s = n0Var2;
            this.f93751t = networkRequest;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NetworkResponse networkResponse, Continuation<? super SourceFetchResult> continuation) {
            return ((e) create(networkResponse, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f93748q, this.f93749r, this.f93750s, this.f93751t, continuation);
            eVar.f93747p = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e1 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v12, types: [T, nc.p] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            n0<hc.a.c> n0Var;
            e eVar;
            NetworkResponse networkResponse;
            T t11;
            NetworkResponse networkResponse2;
            NetworkHeaders headers;
            Object obj2;
            okio.h hVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f93746o;
            String strC = null;
            if (i11 == 0) {
                t.b(obj);
                NetworkResponse networkResponse3 = (NetworkResponse) this.f93747p;
                n0Var = this.f93748q;
                l lVar = this.f93749r;
                hc.a.c cVar = n0Var.f86529a;
                NetworkResponse networkResponse4 = this.f93750s.f86529a;
                NetworkRequest networkRequest = this.f93751t;
                this.f93747p = networkResponse3;
                this.f93745n = n0Var;
                this.f93746o = 1;
                eVar = this;
                Object objR = lVar.r(cVar, networkResponse4, networkRequest, networkResponse3, eVar);
                if (objR != coroutine_suspended) {
                    networkResponse = networkResponse3;
                    t11 = objR;
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                n0Var = (n0) this.f93745n;
                networkResponse = (NetworkResponse) this.f93747p;
                t.b(obj);
                eVar = this;
                t11 = obj;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                networkResponse2 = (NetworkResponse) this.f93747p;
                t.b(obj);
                eVar = this;
                obj2 = obj;
            }
            hVar = (okio.h) obj2;
            if (hVar.getSize() > 0) {
                return null;
            }
            u uVarO = eVar.f93749r.o(hVar);
            l lVar2 = eVar.f93749r;
            return new SourceFetchResult(uVarO, lVar2.k(lVar2.url, networkResponse2.getHeaders().c("Content-Type")), gc.h.NETWORK);
            n0Var.f86529a = t11;
            hc.a.c cVar2 = eVar.f93748q.f86529a;
            if (cVar2 != null) {
                n0<NetworkResponse> n0Var2 = eVar.f93750s;
                l lVar3 = eVar.f93749r;
                s.h(cVar2);
                n0Var2.f86529a = lVar3.q(cVar2);
                l lVar4 = eVar.f93749r;
                hc.a.c cVar3 = eVar.f93748q.f86529a;
                s.h(cVar3);
                u uVarN = lVar4.n(cVar3);
                l lVar5 = eVar.f93749r;
                String str = lVar5.url;
                NetworkResponse networkResponse5 = eVar.f93750s.f86529a;
                if (networkResponse5 != null && (headers = networkResponse5.getHeaders()) != null) {
                    strC = headers.c("Content-Type");
                }
                return new SourceFetchResult(uVarN, lVar5.k(str, strC), gc.h.NETWORK);
            }
            q qVarF = oc.e.f(networkResponse);
            eVar.f93747p = networkResponse;
            eVar.f93745n = null;
            eVar.f93746o = 2;
            Object objE = oc.e.e(qVarF, this);
            if (objE != coroutine_suspended) {
                networkResponse2 = networkResponse;
                obj2 = objE;
                hVar = (okio.h) obj2;
                if (hVar.getSize() > 0) {
                    return null;
                }
                u uVarO2 = eVar.f93749r.o(hVar);
                l lVar6 = eVar.f93749r;
                return new SourceFetchResult(uVarO2, lVar6.k(lVar6.url, networkResponse2.getHeaders().c("Content-Type")), gc.h.NETWORK);
            }
            return coroutine_suspended;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m = "toImageSource", n = {"buffer"}, s = {"L$0"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93752n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f93753o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f93755q;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93753o = obj;
            this.f93755q |= Integer.MIN_VALUE;
            return l.this.p(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", i = {0, 0, 1, 1, 1}, l = {138, 153}, m = "writeToDiskCache", n = {"snapshot", "networkResponse", "networkResponse", "modifiedNetworkResponse", "editor"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93756n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93757o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f93758p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f93759q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f93761s;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93759q = obj;
            this.f93761s |= Integer.MIN_VALUE;
            return l.this.r(null, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(String str, Options options, Lazy<? extends h> lazy, Lazy<? extends hc.a> lazy2, Lazy<? extends nc.b> lazy3, nc.d dVar) {
        this.url = str;
        this.options = options;
        this.networkClient = lazy;
        this.diskCache = lazy2;
        this.cacheStrategy = lazy3;
        this.connectivityChecker = dVar;
    }

    private final <T> Object h(NetworkRequest networkRequest, wn0.p<? super NetworkResponse, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        if (this.options.getNetworkCachePolicy().getReadEnabled()) {
            oc.f.a();
        }
        return this.networkClient.getValue().a(networkRequest, new b(pVar, null), continuation);
    }

    private final String i() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    private final okio.o j() {
        okio.o fileSystem;
        hc.a value = this.diskCache.getValue();
        return (value == null || (fileSystem = value.getFileSystem()) == null) ? this.options.getFileSystem() : fileSystem;
    }

    private final NetworkRequest l() {
        NetworkHeaders.a aVarD = nc.g.b(this.options).d();
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean z11 = this.options.getNetworkCachePolicy().getReadEnabled() && this.connectivityChecker.a();
        if (!z11 && readEnabled) {
            aVarD.c("Cache-Control", "only-if-cached, max-stale=2147483647");
        } else if (!z11 || readEnabled) {
            if (!z11 && !readEnabled) {
                aVarD.c("Cache-Control", "no-cache, only-if-cached");
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            aVarD.c("Cache-Control", "no-cache");
        } else {
            aVarD.c("Cache-Control", "no-cache, no-store");
        }
        return new NetworkRequest(this.url, nc.g.c(this.options), aVarD.b(), nc.g.a(this.options), this.options.getExtras());
    }

    private final hc.a.c m() {
        hc.a value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.b(i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u n(hc.a.c cVar) {
        return v.d(cVar.getData(), j(), i(), cVar, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u o(okio.h hVar) {
        return v.c(hVar, j(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(q qVar, Continuation<? super u> continuation) {
        f fVar;
        okio.h hVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f93755q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f93755q = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.f93753o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f93755q;
        if (i12 == 0) {
            t.b(obj);
            okio.h hVar2 = new okio.h();
            fVar.f93752n = hVar2;
            fVar.f93755q = 1;
            if (qVar.u(hVar2, fVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            hVar = hVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (okio.h) fVar.f93752n;
            t.b(obj);
        }
        return o(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkResponse q(hc.a.c cVar) throws Throwable {
        Throwable th2;
        NetworkResponse networkResponseA;
        try {
            okio.j jVarD = c0.d(j().r0(cVar.getMetadata()));
            try {
                networkResponseA = nc.a.f93707a.a(jVarD);
                if (jVarD != null) {
                    try {
                        jVarD.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (jVarD != null) {
                    try {
                        jVarD.close();
                    } catch (Throwable th5) {
                        jn0.g.a(th4, th5);
                    }
                }
                th2 = th4;
                networkResponseA = null;
            }
            if (th2 == null) {
                return networkResponseA;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
    
        if (r0.V2(r2, r3, r7) == r1) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(hc.a.c r12, nc.NetworkResponse r13, nc.NetworkRequest r14, nc.NetworkResponse r15, p013kotlin.coroutines.Continuation<? super hc.a.c> r16) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.l.r(hc.a$c, nc.p, nc.n, nc.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b A[Catch: Exception -> 0x0166, TRY_LEAVE, TryCatch #5 {Exception -> 0x0166, blocks: (B:72:0x0147, B:74:0x014b), top: B:103:0x0147 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x015f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x016a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x0177  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, hc.a$c] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, nc.p] */
    @Override // ic.j
    public Object a(Continuation<? super ic.i> continuation) throws Exception {
        c cVar;
        n0 n0Var;
        n0 n0Var2;
        n0 n0Var3;
        nc.b.ReadResult readResult;
        n0 n0Var4;
        Exception exc;
        n0 n0Var5;
        NetworkRequest request;
        n0 n0Var6;
        SourceFetchResult sourceFetchResult;
        hc.a.c cVar2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f93741r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f93741r = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objH = cVar.f93739p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f93741r;
        if (i12 == 0) {
            t.b(objH);
            n0 n0Var7 = new n0();
            n0Var7.f86529a = m();
            try {
                n0Var2 = new n0();
                if (n0Var7.f86529a != 0) {
                    Long size = j().b0(((hc.a.c) n0Var7.f86529a).getMetadata()).getSize();
                    if (size != null && size.longValue() == 0) {
                        return new SourceFetchResult(n((hc.a.c) n0Var7.f86529a), k(this.url, null), gc.h.DISK);
                    }
                    ?? Q = q((hc.a.c) n0Var7.f86529a);
                    n0Var2.f86529a = Q;
                    if (Q != 0) {
                        nc.b value = this.cacheStrategy.getValue();
                        NetworkResponse networkResponse = (NetworkResponse) n0Var2.f86529a;
                        NetworkRequest networkRequestL = l();
                        Options options = this.options;
                        cVar.f93737n = n0Var7;
                        cVar.f93738o = n0Var2;
                        cVar.f93741r = 1;
                        Object objA = value.a(networkResponse, networkRequestL, options, cVar);
                        if (objA != coroutine_suspended) {
                            n0Var4 = n0Var7;
                            objH = objA;
                        }
                    }
                    return coroutine_suspended;
                }
                n0Var3 = n0Var7;
                readResult = null;
                n0Var5 = n0Var2;
                if (readResult != null) {
                    request = l();
                    NetworkRequest networkRequest = request;
                    e eVar = new e(n0Var3, this, n0Var5, networkRequest, null);
                    cVar.f93737n = n0Var3;
                    cVar.f93738o = null;
                    cVar.f93741r = 2;
                    objH = h(networkRequest, eVar, cVar);
                    if (objH != coroutine_suspended) {
                        n0Var6 = n0Var3;
                        sourceFetchResult = (SourceFetchResult) objH;
                        if (sourceFetchResult != null) {
                            return sourceFetchResult;
                        }
                        NetworkRequest networkRequestL2 = l();
                        d dVar = new d(null);
                        cVar.f93737n = n0Var6;
                        cVar.f93741r = 3;
                        objH = h(networkRequestL2, dVar, cVar);
                        if (objH != coroutine_suspended) {
                            n0Var = n0Var6;
                            return (SourceFetchResult) objH;
                        }
                    }
                    return coroutine_suspended;
                }
                try {
                    request = readResult.getRequest();
                    if (request == null) {
                        try {
                            request = l();
                        } catch (Exception e11) {
                            e = e11;
                            exc = e;
                            n0Var = n0Var3;
                            cVar2 = (hc.a.c) n0Var.f86529a;
                            if (cVar2 == null) {
                                throw exc;
                            }
                            oc.e.c(cVar2);
                            throw exc;
                        }
                    }
                    NetworkRequest networkRequest2 = request;
                    try {
                        e eVar2 = new e(n0Var3, this, n0Var5, networkRequest2, null);
                        cVar.f93737n = n0Var3;
                        cVar.f93738o = null;
                        cVar.f93741r = 2;
                        objH = h(networkRequest2, eVar2, cVar);
                        if (objH != coroutine_suspended) {
                            n0Var6 = n0Var3;
                            sourceFetchResult = (SourceFetchResult) objH;
                            if (sourceFetchResult != null) {
                                return sourceFetchResult;
                            }
                            NetworkRequest networkRequestL3 = l();
                            d dVar2 = new d(null);
                            cVar.f93737n = n0Var6;
                            cVar.f93741r = 3;
                            objH = h(networkRequestL3, dVar2, cVar);
                            if (objH != coroutine_suspended) {
                                n0Var = n0Var6;
                                return (SourceFetchResult) objH;
                            }
                        }
                        return coroutine_suspended;
                    } catch (Exception e12) {
                        e = e12;
                        exc = e;
                        n0Var = n0Var3;
                        cVar2 = (hc.a.c) n0Var.f86529a;
                        if (cVar2 == null) {
                            throw exc;
                        }
                        oc.e.c(cVar2);
                        throw exc;
                    }
                } catch (Exception e13) {
                    exc = e13;
                    n0Var = n0Var3;
                    cVar2 = (hc.a.c) n0Var.f86529a;
                    if (cVar2 == null) {
                        throw exc;
                    }
                    oc.e.c(cVar2);
                    throw exc;
                }
            } catch (Exception e14) {
                e = e14;
                n0Var = n0Var7;
                exc = e;
                cVar2 = (hc.a.c) n0Var.f86529a;
                if (cVar2 == null) {
                    throw exc;
                }
                oc.e.c(cVar2);
                throw exc;
            }
            cVar2 = (hc.a.c) n0Var.f86529a;
            if (cVar2 == null) {
                throw exc;
            }
            oc.e.c(cVar2);
            throw exc;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                n0Var6 = (n0) cVar.f93737n;
                try {
                    t.b(objH);
                    try {
                        sourceFetchResult = (SourceFetchResult) objH;
                        if (sourceFetchResult != null) {
                            return sourceFetchResult;
                        }
                        NetworkRequest networkRequestL4 = l();
                        d dVar3 = new d(null);
                        cVar.f93737n = n0Var6;
                        cVar.f93741r = 3;
                        objH = h(networkRequestL4, dVar3, cVar);
                        if (objH != coroutine_suspended) {
                            n0Var = n0Var6;
                        }
                        return coroutine_suspended;
                    } catch (Exception e15) {
                        exc = e15;
                        n0Var = n0Var6;
                        cVar2 = (hc.a.c) n0Var.f86529a;
                        if (cVar2 == null) {
                            throw exc;
                        }
                        oc.e.c(cVar2);
                        throw exc;
                    }
                } catch (Exception e16) {
                    exc = e16;
                    n0Var = n0Var6;
                    cVar2 = (hc.a.c) n0Var.f86529a;
                    if (cVar2 == null) {
                        throw exc;
                    }
                    oc.e.c(cVar2);
                    throw exc;
                }
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) cVar.f93737n;
            try {
                t.b(objH);
            } catch (Exception e17) {
                exc = e17;
            }
            try {
                return (SourceFetchResult) objH;
            } catch (Exception e18) {
                e = e18;
                exc = e;
                cVar2 = (hc.a.c) n0Var.f86529a;
                if (cVar2 == null) {
                    throw exc;
                }
                oc.e.c(cVar2);
                throw exc;
            }
        }
        n0Var2 = (n0) cVar.f93738o;
        n0Var4 = (n0) cVar.f93737n;
        try {
            t.b(objH);
        } catch (Exception e19) {
            exc = e19;
            n0Var = n0Var4;
        }
        readResult = (nc.b.ReadResult) objH;
        if (readResult.getResponse() != null) {
            return new SourceFetchResult(n((hc.a.c) n0Var4.f86529a), k(this.url, readResult.getResponse().getHeaders().c("Content-Type")), gc.h.DISK);
        }
        n0Var3 = n0Var4;
        n0Var5 = n0Var2;
        if (readResult != null) {
            request = l();
            NetworkRequest networkRequest3 = request;
            e eVar3 = new e(n0Var3, this, n0Var5, networkRequest3, null);
            cVar.f93737n = n0Var3;
            cVar.f93738o = null;
            cVar.f93741r = 2;
            objH = h(networkRequest3, eVar3, cVar);
            if (objH != coroutine_suspended) {
                n0Var6 = n0Var3;
                sourceFetchResult = (SourceFetchResult) objH;
                if (sourceFetchResult != null) {
                    return sourceFetchResult;
                }
                NetworkRequest networkRequestL5 = l();
                d dVar4 = new d(null);
                cVar.f93737n = n0Var6;
                cVar.f93741r = 3;
                objH = h(networkRequestL5, dVar4, cVar);
                if (objH != coroutine_suspended) {
                    n0Var = n0Var6;
                    return (SourceFetchResult) objH;
                }
            }
            return coroutine_suspended;
        }
        request = readResult.getRequest();
        if (request == null) {
            request = l();
        }
        NetworkRequest networkRequest4 = request;
        e eVar4 = new e(n0Var3, this, n0Var5, networkRequest4, null);
        cVar.f93737n = n0Var3;
        cVar.f93738o = null;
        cVar.f93741r = 2;
        objH = h(networkRequest4, eVar4, cVar);
        if (objH != coroutine_suspended) {
            n0Var6 = n0Var3;
            sourceFetchResult = (SourceFetchResult) objH;
            if (sourceFetchResult != null) {
                return sourceFetchResult;
            }
            NetworkRequest networkRequestL6 = l();
            d dVar5 = new d(null);
            cVar.f93737n = n0Var6;
            cVar.f93741r = 3;
            objH = h(networkRequestL6, dVar5, cVar);
            if (objH != coroutine_suspended) {
                n0Var = n0Var6;
                return (SourceFetchResult) objH;
            }
        }
        return coroutine_suspended;
        cVar2 = (hc.a.c) n0Var.f86529a;
        if (cVar2 == null) {
            throw exc;
        }
        oc.e.c(cVar2);
        throw exc;
    }

    public final String k(String url, String contentType) {
        String strB;
        if ((contentType == null || p013kotlin.text.t.b0(contentType, "text/plain", false, 2, null)) && (strB = yc.v.f125365a.b(url)) != null) {
            return strB;
        }
        if (contentType != null) {
            return p013kotlin.text.t.y1(contentType, ';', null, 2, null);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR$\u0010#\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lnc/l$a;", "Lic/j$a;", "Lec/g0;", "Lkotlin/Function0;", "Lnc/h;", "networkClient", "Lnc/b;", "cacheStrategy", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "Lnc/d;", "connectivityChecker", "<init>", "(Lwn0/a;Lwn0/a;Lwn0/l;)V", "data", "", "g", "(Lec/g0;)Z", "Lrc/n;", "options", "Lec/r;", "imageLoader", "Lic/j;", "e", "(Lec/g0;Lrc/n;Lec/r;)Lic/j;", "Lkotlin/Lazy;", "a", "Lkotlin/Lazy;", "networkClientLazy", "b", "cacheStrategyLazy", "Loc/b;", "c", "Loc/b;", "connectivityCheckerLazy", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ic.j.a<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Lazy<h> networkClientLazy;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Lazy<nc.b> cacheStrategyLazy;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final oc.b<Context, nc.d> connectivityCheckerLazy;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: nc.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class C2002a extends p013kotlin.jvm.internal.p implements wn0.l<Context, nc.d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2002a f93733a = new C2002a();

            C2002a() {
                super(1, nc.f.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final nc.d invoke(Context context) {
                return nc.f.a(context);
            }
        }

        public a(wn0.a<? extends h> aVar, wn0.a<? extends nc.b> aVar2, wn0.l<? super Context, ? extends nc.d> lVar) {
            this.networkClientLazy = jn0.m.b(aVar);
            this.cacheStrategyLazy = jn0.m.b(aVar2);
            this.connectivityCheckerLazy = oc.c.a(lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final nc.b d() {
            return nc.b.f93709b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc.a f(ec.r rVar) {
            return rVar.a();
        }

        private final boolean g(g0 data) {
            return s.f(data.getCom.adyen.checkout.components.core.paymentmethod.CardPaymentMethod.PAYMENT_METHOD_TYPE java.lang.String(), "http") || s.f(data.getCom.adyen.checkout.components.core.paymentmethod.CardPaymentMethod.PAYMENT_METHOD_TYPE java.lang.String(), "https");
        }

        @Override // ic.j.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ic.j a(g0 data, Options options, final ec.r imageLoader) {
            if (g(data)) {
                return new l(data.getData(), options, this.networkClientLazy, jn0.m.b(new wn0.a() { // from class: nc.j
                    @Override // wn0.a
                    public final Object invoke() {
                        return l.a.f(imageLoader);
                    }
                }), this.cacheStrategyLazy, this.connectivityCheckerLazy.a(options.getContext()));
            }
            return null;
        }

        public /* synthetic */ a(wn0.a aVar, wn0.a aVar2, wn0.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i11 & 2) != 0 ? new wn0.a() { // from class: nc.k
                @Override // wn0.a
                public final Object invoke() {
                    return l.a.d();
                }
            } : aVar2, (i11 & 4) != 0 ? C2002a.f93733a : lVar);
        }
    }
}
