package ne;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.HttpException;
import com.adyen.checkout.core.internal.data.model.ErrorResponseBody;
import java.util.Map;
import jn0.t;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aj\u0010\f\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0087@¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/b;", "T", "R", "Lne/a;", "", "path", "body", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "requestSerializer", "responseSerializer", "", "queryParameters", "b", "(Lne/a;Ljava/lang/String;Lcom/adyen/checkout/core/internal/data/model/b;Lcom/adyen/checkout/core/internal/data/model/b$a;Lcom/adyen/checkout/core/internal/data/model/b$a;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/adyen/checkout/core/exception/HttpException;", "a", "(Lcom/adyen/checkout/core/exception/HttpException;)Ljava/lang/String;", "", "Lorg/json/JSONObject;", "c", "([B)Lorg/json/JSONObject;", "checkout-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.core.internal.data.api.HttpClientExtKt", f = "HttpClientExt.kt", i = {0, 0, 0}, l = {68}, m = "post", n = {"$this$post", "responseSerializer", "$this$runAndLogHttpException$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class a<T extends com.adyen.checkout.core.internal.data.model.b, R extends com.adyen.checkout.core.internal.data.model.b> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93885n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93886o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f93887p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f93888q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f93889r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93888q = obj;
            this.f93889r |= Integer.MIN_VALUE;
            return b.b(null, null, null, null, null, null, this);
        }
    }

    private static final String a(HttpException httpException) {
        if (httpException.getErrorBody() != null) {
            return com.adyen.checkout.core.internal.data.model.a.i(ErrorResponseBody.SERIALIZER.a(httpException.getErrorBody()));
        }
        return "[" + httpException.getCode() + "] " + httpException.getMessage();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final <T extends com.adyen.checkout.core.internal.data.model.b, R extends com.adyen.checkout.core.internal.data.model.b> Object b(ne.a aVar, String str, T t11, com.adyen.checkout.core.internal.data.model.b.a<T> aVar2, com.adyen.checkout.core.internal.data.model.b.a<R> aVar3, Map<String, String> map, Continuation<? super R> continuation) {
        a aVar4;
        ne.a aVar5;
        com.adyen.checkout.core.internal.data.model.b.a<R> aVar6;
        ne.a aVar7;
        me.a aVar8;
        me.b.Companion companion;
        String name;
        String strU1;
        if (continuation instanceof a) {
            aVar4 = (a) continuation;
            int i11 = aVar4.f93889r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar4.f93889r = i11 - Integer.MIN_VALUE;
            } else {
                aVar4 = new a(continuation);
            }
        } else {
            aVar4 = new a(continuation);
        }
        a aVar9 = aVar4;
        Object objA = aVar9.f93888q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar9.f93889r;
        if (i12 == 0) {
            t.b(objA);
            me.a aVar10 = me.a.DEBUG;
            me.b.Companion companion2 = me.b.INSTANCE;
            if (companion2.a().a(aVar10)) {
                String name2 = aVar.getClass().getName();
                s.h(name2);
                String strU2 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU2.length() != 0) {
                    name2 = p013kotlin.text.t.W0(strU2, "Kt");
                }
                me.b bVarA = companion2.a();
                bVarA.b(aVar10, "CO." + name2, "POST - " + str, null);
            }
            JSONObject jSONObjectA = aVar2.a(t11);
            me.a aVar11 = me.a.VERBOSE;
            if (companion2.a().a(aVar11)) {
                String name3 = aVar.getClass().getName();
                s.h(name3);
                String strU3 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name3, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU3.length() != 0) {
                    name3 = p013kotlin.text.t.W0(strU3, "Kt");
                }
                me.b bVarA2 = companion2.a();
                bVarA2.b(aVar11, "CO." + name3, "request - " + com.adyen.checkout.core.internal.data.model.a.i(jSONObjectA), null);
            }
            try {
                String string = jSONObjectA.toString();
                s.j(string, "toString(...)");
                aVar9.f93885n = aVar;
                aVar6 = aVar3;
                aVar9.f93886o = aVar6;
                aVar9.f93887p = aVar;
                aVar9.f93889r = 1;
                objA = ne.a.C2005a.a(aVar, str, string, map, null, aVar9, 8, null);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar5 = aVar;
                aVar7 = aVar5;
            } catch (HttpException e11) {
                e = e11;
                aVar5 = aVar;
                aVar8 = me.a.ERROR;
                companion = me.b.INSTANCE;
                if (companion.a().a(aVar8)) {
                    name = aVar5.getClass().getName();
                    s.h(name);
                    strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU1.length() != 0) {
                        name = p013kotlin.text.t.W0(strU1, "Kt");
                    }
                    me.b bVarA3 = companion.a();
                    bVarA3.b(aVar8, "CO." + name, "API error - " + a(e), null);
                }
                throw e;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar5 = (ne.a) aVar9.f93887p;
            com.adyen.checkout.core.internal.data.model.b.a<R> aVar12 = (com.adyen.checkout.core.internal.data.model.b.a) aVar9.f93886o;
            aVar7 = (ne.a) aVar9.f93885n;
            try {
                t.b(objA);
                aVar6 = aVar12;
            } catch (HttpException e12) {
                e = e12;
                aVar8 = me.a.ERROR;
                companion = me.b.INSTANCE;
                if (companion.a().a(aVar8)) {
                    name = aVar5.getClass().getName();
                    s.h(name);
                    strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU1.length() != 0) {
                        name = p013kotlin.text.t.W0(strU1, "Kt");
                    }
                    me.b bVarA4 = companion.a();
                    bVarA4.b(aVar8, "CO." + name, "API error - " + a(e), null);
                }
                throw e;
            }
        }
        JSONObject jSONObjectC = c((byte[]) objA);
        me.a aVar13 = me.a.VERBOSE;
        me.b.Companion companion3 = me.b.INSTANCE;
        if (companion3.a().a(aVar13)) {
            String name4 = aVar7.getClass().getName();
            s.h(name4);
            String strU4 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name4, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU4.length() != 0) {
                name4 = p013kotlin.text.t.W0(strU4, "Kt");
            }
            me.b bVarA5 = companion3.a();
            bVarA5.b(aVar13, "CO." + name4, "response - " + com.adyen.checkout.core.internal.data.model.a.i(jSONObjectC), null);
        }
        return aVar6.b(jSONObjectC);
    }

    private static final JSONObject c(byte[] bArr) {
        return bArr.length == 0 ? new JSONObject() : new JSONObject(new String(bArr, p013kotlin.text.d.UTF_8));
    }
}
