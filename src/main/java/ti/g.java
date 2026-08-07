package ti;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ii.v;
import java.util.Map;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import okio.h;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001:\u0002&\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\b\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\b\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H&¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0018\u001a\u00020\u0017*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\f*\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b*\u00020\fH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001e\u0010\u000fJ%\u0010\u001f\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0004¢\u0006\u0004\b\u001f\u0010\u000fJ-\u0010\"\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0006\u0010!\u001a\u00020 H\u0004¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0084@¢\u0006\u0004\b$\u0010\nJ\u0010\u0010%\u001a\u00020\bH\u0096@¢\u0006\u0004\b%\u0010\nJ\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lti/g;", "", "Lti/c;", "webSocketConnection", "Lti/g$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lti/c;Lti/g$b;)V", "Ljn0/h0;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "messageMap", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)V", "Lii/v$a;", "D", "Lii/f;", "request", "k", "(Lii/f;)V", "l", "Lokio/k;", "m", "(Ljava/util/Map;)Lokio/k;", "o", "(Ljava/util/Map;)Ljava/lang/String;", "n", "(Ljava/lang/String;)Ljava/util/Map;", IntegerTokenConverter.CONVERTER_KEY, "j", "Lti/f;", "frameType", "h", "(Ljava/util/Map;Lti/f;)V", "e", "f", "a", "()V", "Lti/c;", "getWebSocketConnection", "()Lti/c;", "Lti/g$b;", "c", "()Lti/g$b;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ti.c webSocketConnection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lti/g$a;", "", "Lti/c;", "webSocketConnection", "Lti/g$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lti/g;", "a", "(Lti/c;Lti/g$b;Lkotlinx/coroutines/CoroutineScope;)Lti/g;", "", "getName", "()Ljava/lang/String;", "name", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
        g a(ti.c webSocketConnection, b listener, CoroutineScope scope);

        String getName();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lti/g$b;", "", "", "id", "", StatusResponse.PAYLOAD, "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/util/Map;)V", "a", "c", "(Ljava/lang/String;)V", "b", "(Ljava/util/Map;)V", "", "cause", "e", "(Ljava/lang/Throwable;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface b {
        void a(String id2, Map<String, ? extends Object> payload);

        void b(Map<String, ? extends Object> payload);

        void c(String id2);

        void d(String id2, Map<String, ? extends Object> payload);

        void e(Throwable cause);
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114611a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.Binary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f114611a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WsProtocol", f = "WsProtocol.kt", i = {0}, l = {131}, m = "receiveMessageMap", n = {"this"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f114612n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f114613o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f114614p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f114616r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114614p = obj;
            this.f114616r |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo3.network.ws.WsProtocol", f = "WsProtocol.kt", i = {0}, l = {144}, m = "run$suspendImpl", n = {"$this"}, s = {"L$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f114617n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f114618o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f114619p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f114621r;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114619p = obj;
            this.f114621r |= Integer.MIN_VALUE;
            return g.g(g.this, this);
        }
    }

    public g(ti.c webSocketConnection, b listener) {
        s.k(webSocketConnection, "webSocketConnection");
        s.k(listener, "listener");
        this.webSocketConnection = webSocketConnection;
        this.listener = listener;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004b -> B:23:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static /* synthetic */ java.lang.Object g(ti.g r4, p013kotlin.coroutines.Continuation<? super jn0.h0> r5) {
        /*
            boolean r0 = r5 instanceof ti.g.e
            if (r0 == 0) goto L13
            r0 = r5
            ti.g$e r0 = (ti.g.e) r0
            int r1 = r0.f114621r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114621r = r1
            goto L18
        L13:
            ti.g$e r0 = new ti.g$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f114619p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f114621r
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f114618o
            ti.g r4 = (ti.g) r4
            java.lang.Object r2 = r0.f114617n
            ti.g r2 = (ti.g) r2
            jn0.t.b(r5)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L5e
            goto L4c
        L31:
            r4 = move-exception
            goto L56
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            jn0.t.b(r5)
        L3e:
            r0.f114617n = r4     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L5e
            r0.f114618o = r4     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L5e
            r0.f114621r = r3     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L5e
            java.lang.Object r5 = r4.e(r0)     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L5e
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r2 = r4
        L4c:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L5e
            r4.d(r5)     // Catch: java.lang.Exception -> L31 java.util.concurrent.CancellationException -> L5e
            r4 = r2
            goto L3e
        L53:
            r5 = move-exception
            r2 = r4
            r4 = r5
        L56:
            ti.g$b r5 = r2.listener
            r5.e(r4)
            jn0.h0 r4 = jn0.h0.f84049a
            return r4
        L5e:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.g.g(ti.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void a() {
        this.webSocketConnection.close();
    }

    public abstract Object b(Continuation<? super h0> continuation);

    /* JADX INFO: renamed from: c, reason: from getter */
    protected final b getListener() {
        return this.listener;
    }

    public abstract void d(Map<String, ? extends Object> messageMap);

    /* JADX WARN: Code duplicated, block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004c -> B:19:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    protected final java.lang.Object e(p013kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ti.g.d
            if (r0 == 0) goto L13
            r0 = r6
            ti.g$d r0 = (ti.g.d) r0
            int r1 = r0.f114616r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114616r = r1
            goto L18
        L13:
            ti.g$d r0 = new ti.g$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f114614p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f114616r
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f114613o
            ti.g r2 = (ti.g) r2
            java.lang.Object r4 = r0.f114612n
            ti.g r4 = (ti.g) r4
            jn0.t.b(r6)
            goto L4d
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            jn0.t.b(r6)
            r2 = r5
        L3d:
            ti.c r6 = r2.webSocketConnection
            r0.f114612n = r2
            r0.f114613o = r2
            r0.f114616r = r3
            java.lang.Object r6 = r6.receive(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r4 = r2
        L4d:
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map r6 = r2.n(r6)
            if (r6 == 0) goto L56
            return r6
        L56:
            r2 = r4
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.g.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object f(Continuation<? super h0> continuation) {
        return g(this, continuation);
    }

    protected final void h(Map<String, ? extends Object> messageMap, f frameType) {
        s.k(messageMap, "messageMap");
        s.k(frameType, "frameType");
        int i11 = c.f114611a[frameType.ordinal()];
        if (i11 == 1) {
            j(messageMap);
        } else {
            if (i11 != 2) {
                return;
            }
            i(messageMap);
        }
    }

    protected final void i(Map<String, ? extends Object> messageMap) {
        s.k(messageMap, "messageMap");
        this.webSocketConnection.send(m(messageMap));
    }

    protected final void j(Map<String, ? extends Object> messageMap) {
        s.k(messageMap, "messageMap");
        this.webSocketConnection.send(o(messageMap));
    }

    public abstract <D extends v.a> void k(ii.f<D> request);

    public abstract <D extends v.a> void l(ii.f<D> request);

    protected final k m(Map<String, ? extends Object> map) {
        s.k(map, "<this>");
        h hVar = new h();
        mi.b.a(new mi.c(hVar, null), map);
        return hVar.m1();
    }

    protected final Map<String, Object> n(String str) {
        s.k(str, "<this>");
        try {
            Object objA = ii.d.f78093g.a(new mi.d(new h().l2(str)), ii.k.f78142g);
            if (objA instanceof Map) {
                return (Map) objA;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    protected final String o(Map<String, ? extends Object> map) {
        s.k(map, "<this>");
        h hVar = new h();
        mi.b.a(new mi.c(hVar, null), map);
        return hVar.t1();
    }
}
