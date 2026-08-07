package pi;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.apollographql.apollo3.exception.ApolloException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okio.j;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\r\u001a\u00020\n*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lji/i;", "response", "Lkotlinx/coroutines/flow/Flow;", "Lokio/j;", DateTokenConverter.CONVERTER_KEY, "(Lji/i;)Lkotlinx/coroutines/flow/Flow;", "", CMSAttributeTableGenerator.CONTENT_TYPE, "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "c", "(Lji/i;)Z", "isMultipart", "apollo-runtime"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lokio/j;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", i = {0}, l = {28}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    static final class a extends SuspendLambda implements p<FlowCollector<? super j>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f103016n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f103017o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ n0<i> f103018p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ji.i f103019q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0<i> n0Var, ji.i iVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f103018p = n0Var;
            this.f103019q = iVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f103018p, this.f103019q, continuation);
            aVar.f103017o = obj;
            return aVar;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [T, pi.i] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            j body;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f103016n;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f103017o;
                n0<i> n0Var = this.f103018p;
                j jVarA = this.f103019q.a();
                s.h(jVarA);
                String strB = h.b(ji.e.a(this.f103019q.b(), "Content-Type"));
                if (strB == null) {
                    throw new ApolloException("Expected the Content-Type to have a boundary parameter", null, 2, null);
                }
                n0Var.f86529a = new i(jVarA, strB);
                flowCollector = flowCollector2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f103017o;
                t.b(obj);
            }
            do {
                i iVar = this.f103018p.f86529a;
                s.h(iVar);
                i.b bVarB = iVar.B();
                if (bVarB == null) {
                    return h0.f84049a;
                }
                body = bVarB.getBody();
                this.f103017o = flowCollector;
                this.f103016n = 1;
            } while (flowCollector.emit(body, this) != coroutine_suspended);
            return coroutine_suspended;
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super j> flowCollector, Continuation<? super h0> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lokio/j;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements q<FlowCollector<? super j>, Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f103020n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f103021o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ n0<i> f103022p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n0<i> n0Var, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f103022p = n0Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h0 h0Var;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f103020n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            n0<i> n0Var = this.f103022p;
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                i iVar = n0Var.f86529a;
                if (iVar != null) {
                    iVar.close();
                    h0Var = h0.f84049a;
                } else {
                    h0Var = null;
                }
                jn0.s.b(h0Var);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                jn0.s.b(t.a(th2));
            }
            return h0.f84049a;
        }

        @Override // wn0.q
        public final Object invoke(FlowCollector<? super j> flowCollector, Throwable th2, Continuation<? super h0> continuation) {
            b bVar = new b(this.f103022p, continuation);
            bVar.f103021o = flowCollector;
            return bVar.invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        Object next;
        List listE1;
        String str2;
        if (str == null) {
            return null;
        }
        List listE2 = p013kotlin.text.t.e1(str, new char[]{';'}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(v.y(listE2, 10));
        Iterator it = listE2.iterator();
        while (it.hasNext()) {
            arrayList.add(p013kotlin.text.t.F1((String) it.next()).toString());
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!p013kotlin.text.t.b0((String) next, "boundary=", false, 2, null));
        String str3 = (String) next;
        if (str3 == null || (listE1 = p013kotlin.text.t.e1(str3, new char[]{'='}, false, 0, 6, null)) == null || (str2 = (String) v.r0(listE1, 1)) == null) {
            return null;
        }
        return p013kotlin.text.t.G1(str2, CoreConstants.DOUBLE_QUOTE_CHAR, CoreConstants.SINGLE_QUOTE_CHAR);
    }

    public static final boolean c(ji.i iVar) {
        s.k(iVar, "<this>");
        String strA = ji.e.a(iVar.b(), "Content-Type");
        return strA != null && p013kotlin.text.t.Z(strA, "multipart/", true);
    }

    public static final Flow<j> d(ji.i response) {
        s.k(response, "response");
        n0 n0Var = new n0();
        return FlowKt.onCompletion(FlowKt.flow(new a(n0Var, response, null)), new b(n0Var, null));
    }
}
