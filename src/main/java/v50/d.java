package v50;

import android.webkit.URLUtil;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import j40.FinancialConnectionsEvent;
import java.util.Iterator;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import wn0.l;
import z50.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJd\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00112.\u0010\u0017\u001a*\u0012\u0004\u0012\u00020\n\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00150\u0014H\u0086B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lv50/d;", "", "Lz50/p;", "uriUtils", "Lj40/f;", "eventTracker", "Lo30/d;", "logger", "<init>", "(Lz50/p;Lj40/f;Lo30/d;)V", "", "uri", "Lv50/d$a;", "a", "(Ljava/lang/String;)Lv50/d$a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "currentPane", "Lkotlin/Function1;", "Ljn0/h0;", "onNetworkUrlClicked", "", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "knownDeeplinkActions", "b", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Lwn0/l;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz50/p;", "Lj40/f;", "c", "Lo30/d;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "internalLinkToPaneId", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p uriUtils;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> internalLinkToPaneId;

    /* JADX INFO: renamed from: v50.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lv50/d$a;", "", "", "nextPaneOrDrawerOnSecondaryCta", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeeplinkPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nextPaneOrDrawerOnSecondaryCta;

        public DeeplinkPayload(String str) {
            this.nextPaneOrDrawerOnSecondaryCta = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNextPaneOrDrawerOnSecondaryCta() {
            return this.nextPaneOrDrawerOnSecondaryCta;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeeplinkPayload) && s.f(this.nextPaneOrDrawerOnSecondaryCta, ((DeeplinkPayload) other).nextPaneOrDrawerOnSecondaryCta);
        }

        public int hashCode() {
            String str = this.nextPaneOrDrawerOnSecondaryCta;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "DeeplinkPayload(nextPaneOrDrawerOnSecondaryCta=" + this.nextPaneOrDrawerOnSecondaryCta + ")";
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.ui.HandleClickableUrl", f = "HandleClickableUrl.kt", i = {0, 0}, l = {32}, m = "invoke", n = {"this", "uri"}, s = {"L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f117911n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f117912o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f117913p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f117915r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f117913p = obj;
            this.f117915r |= Integer.MIN_VALUE;
            return d.this.b(null, null, null, null, this);
        }
    }

    public d(p uriUtils, j40.f eventTracker, o30.d logger) {
        s.k(uriUtils, "uriUtils");
        s.k(eventTracker, "eventTracker");
        s.k(logger, "logger");
        this.uriUtils = uriUtils;
        this.eventTracker = eventTracker;
        this.logger = logger;
        this.internalLinkToPaneId = v0.f(x.a("manual-entry", FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY.getValue()));
    }

    private final DeeplinkPayload a(String uri) {
        String strB = this.uriUtils.b(uri, "nextPaneOrDrawerOnSecondaryCta");
        return new DeeplinkPayload(strB != null ? this.internalLinkToPaneId.get(strB) : null);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00a9, please report this as an issue */
    public final Object b(FinancialConnectionsSessionManifest.Pane pane, String str, l<? super String, h0> lVar, Map<String, ? extends wn0.p<? super DeeplinkPayload, ? super Continuation<? super h0>, ? extends Object>> map, Continuation<? super h0> continuation) {
        b bVar;
        Object next;
        d dVar;
        h0 h0Var;
        wn0.p pVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f117915r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f117915r = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f117913p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f117915r;
        if (i12 == 0) {
            t.b(obj);
            String strB = this.uriUtils.b(str, "eventName");
            if (strB != null) {
                this.eventTracker.a(new FinancialConnectionsEvent.h(strB, pane));
            }
            if (URLUtil.isNetworkUrl(str)) {
                lVar.invoke(str);
            } else {
                Iterator<T> it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!this.uriUtils.a((String) ((Map.Entry) next).getKey(), str));
                Map.Entry entry = (Map.Entry) next;
                if (entry == null || (pVar = (wn0.p) entry.getValue()) == null) {
                    dVar = this;
                    h0Var = null;
                } else {
                    DeeplinkPayload deeplinkPayloadA = a(str);
                    bVar.f117911n = this;
                    bVar.f117912o = str;
                    bVar.f117915r = 1;
                    if (pVar.invoke(deeplinkPayloadA, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dVar = this;
                }
                if (h0Var == null) {
                    o30.d.b.a(dVar.logger, "Unrecognized clickable text: " + str, null, 2, null);
                }
            }
            return h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) bVar.f117912o;
        dVar = (d) bVar.f117911n;
        t.b(obj);
        h0Var = h0.f84049a;
        if (h0Var == null) {
            o30.d.b.a(dVar.logger, "Unrecognized clickable text: " + str, null, 2, null);
        }
        return h0.f84049a;
    }
}
