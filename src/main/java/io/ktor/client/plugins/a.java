package io.ktor.client.plugins;

import io.ktor.utils.io.charsets.MalformedInputException;
import jn0.h0;
import jn0.t;
import org.slf4j.Logger;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0018\u0010\f\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lok0/b;", "Ljn0/h0;", "c", "(Lok0/b;)V", "Ldl0/a;", "a", "Ldl0/a;", "ValidateMark", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "b", "Lorg/slf4j/Logger;", "LOGGER", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final dl0.a<h0> f78403a = new dl0.a<>("ValidateMark");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f78404b = gl0.a.a("io.ktor.client.plugins.DefaultResponseValidation");

    /* JADX INFO: renamed from: io.ktor.client.plugins.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/client/plugins/b$b;", "Ljn0/h0;", "a", "(Lio/ktor/client/plugins/b$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class C1664a extends u implements l<b.C1669b, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ok0.b<?> f78405c;

        /* JADX INFO: renamed from: io.ktor.client.plugins.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyk0/c;", "response", "Ljn0/h0;", "<anonymous>", "(Lyk0/c;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", i = {0, 0, 1, 1, 1}, l = {42, 48}, m = "invokeSuspend", n = {"response", "statusCode", "response", "exceptionResponse", "statusCode"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
        static final class C1665a extends SuspendLambda implements p<yk0.c, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f78406n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f78407o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f78408p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f78409q;

            C1665a(Continuation<? super C1665a> continuation) {
                super(2, continuation);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yk0.c cVar, Continuation<? super h0> continuation) {
                return ((C1665a) create(cVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                C1665a c1665a = new C1665a(continuation);
                c1665a.f78409q = obj;
                return c1665a;
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
            /* JADX WARN: Code duplicated, block: B:41:0x00e6 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:44:0x00ef A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
            /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                int value;
                yk0.c cVar;
                yk0.c cVarE;
                int i11;
                yk0.c cVar2;
                yk0.c cVar3;
                String str;
                Throwable responseException;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f78408p;
                try {
                    if (i12 == 0) {
                        t.b(obj);
                        yk0.c cVar4 = (yk0.c) this.f78409q;
                        if (!((Boolean) cVar4.getCall().getAttributes().e(c.e())).booleanValue()) {
                            a.f78404b.trace("Skipping default response validation for " + cVar4.getCall().d().getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String());
                            return h0.f84049a;
                        }
                        value = cVar4.getStatus().getValue();
                        pk0.a call = cVar4.getCall();
                        if (value < 300 || call.getAttributes().f(a.f78403a)) {
                            return h0.f84049a;
                        }
                        this.f78409q = cVar4;
                        this.f78407o = value;
                        this.f78408p = 1;
                        Object objA = pk0.b.a(call, this);
                        if (objA != coroutine_suspended) {
                            cVar = cVar4;
                            obj = objA;
                        }
                        return coroutine_suspended;
                    }
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i11 = this.f78407o;
                        cVar3 = (yk0.c) this.f78406n;
                        cVar2 = (yk0.c) this.f78409q;
                        try {
                            t.b(obj);
                            str = (String) obj;
                        } catch (MalformedInputException unused) {
                            str = "<body failed decoding>";
                        }
                        if (300 > i11 && i11 < 400) {
                            responseException = new RedirectResponseException(cVar3, str);
                        } else if (400 > i11 && i11 < 500) {
                            responseException = new ClientRequestException(cVar3, str);
                        } else if (500 <= i11 || i11 >= 600) {
                            responseException = new ResponseException(cVar3, str);
                        } else {
                            responseException = new ServerResponseException(cVar3, str);
                        }
                        a.f78404b.trace("Default response validation for " + cVar2.getCall().d().getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String() + " failed with " + responseException);
                        throw responseException;
                    }
                    value = this.f78407o;
                    cVar = (yk0.c) this.f78409q;
                    t.b(obj);
                    this.f78409q = cVar;
                    this.f78406n = cVarE;
                    this.f78407o = value;
                    this.f78408p = 2;
                    Object objB = yk0.e.b(cVarE, null, this, 1, null);
                    if (objB != coroutine_suspended) {
                        i11 = value;
                        cVar3 = cVarE;
                        obj = objB;
                        cVar2 = cVar;
                        str = (String) obj;
                        if (300 > i11) {
                            if (400 > i11) {
                                if (500 <= i11) {
                                    responseException = new ResponseException(cVar3, str);
                                } else {
                                    responseException = new ResponseException(cVar3, str);
                                }
                            } else if (500 <= i11) {
                                responseException = new ResponseException(cVar3, str);
                            } else {
                                responseException = new ResponseException(cVar3, str);
                            }
                        } else if (400 > i11) {
                            if (500 <= i11) {
                                responseException = new ResponseException(cVar3, str);
                            } else {
                                responseException = new ResponseException(cVar3, str);
                            }
                        } else if (500 <= i11) {
                            responseException = new ResponseException(cVar3, str);
                        } else {
                            responseException = new ResponseException(cVar3, str);
                        }
                        a.f78404b.trace("Default response validation for " + cVar2.getCall().d().getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String() + " failed with " + responseException);
                        throw responseException;
                    }
                    return coroutine_suspended;
                } catch (MalformedInputException unused2) {
                    i11 = value;
                    cVar2 = cVar;
                    cVar3 = cVarE;
                    str = "<body failed decoding>";
                }
                pk0.a aVar = (pk0.a) obj;
                aVar.getAttributes().c(a.f78403a, h0.f84049a);
                cVarE = aVar.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1664a(ok0.b<?> bVar) {
            super(1);
            this.f78405c = bVar;
        }

        public final void a(b.C1669b HttpResponseValidator) {
            s.k(HttpResponseValidator, "$this$HttpResponseValidator");
            HttpResponseValidator.d(this.f78405c.getExpectSuccess());
            HttpResponseValidator.e(new C1665a(null));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(b.C1669b c1669b) {
            a(c1669b);
            return h0.f84049a;
        }
    }

    public static final void c(ok0.b<?> bVar) {
        s.k(bVar, "<this>");
        c.b(bVar, new C1664a(bVar));
    }
}
