package com.fourthline.orca.internal;

import android.content.Context;
import java.io.File;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class SE implements QE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QE f27743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X3 f27744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f27745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3438jo f27746e;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27748b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27750d;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27748b = obj;
            this.f27750d |= Integer.MIN_VALUE;
            Object objA = SE.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ W3 f27752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ QE.b f27753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SE f27754d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(W3 w11, QE.b bVar, SE se2, Continuation continuation) {
            super(2, continuation);
            this.f27752b = w11;
            this.f27753c = bVar;
            this.f27754d = se2;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f27752b, this.f27753c, this.f27754d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f27751a;
            if (i11 == 0) {
                jn0.t.b(obj);
                W3 w11 = this.f27752b;
                String name = ((QE.b.C0514b) this.f27753c).a().e().getTenant().getName();
                String absolutePath = this.f27754d.f27745d.getAbsolutePath();
                p013kotlin.jvm.internal.s.j(absolutePath, "getAbsolutePath(...)");
                C3967w0 c3967w0 = new C3967w0(name, absolutePath);
                this.f27751a = 1;
                objA = w11.a(c3967w0, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objA = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objA);
        }
    }

    public SE(Context context, QE delegate, X3 cdnUrlDownloadWorker, File assetsFourthlineDirectory, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        p013kotlin.jvm.internal.s.k(assetsFourthlineDirectory, "assetsFourthlineDirectory");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f27742a = context;
        this.f27743b = delegate;
        this.f27744c = cdnUrlDownloadWorker;
        this.f27745d = assetsFourthlineDirectory;
        this.f27746e = tracker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.QE
    public Object a(QE.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        SE se2;
        QE.b bVar;
        QE.b bVar2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f27750d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f27750d = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f27748b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f27750d;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                QE qe2 = this.f27743b;
                aVar2.f27747a = this;
                aVar2.f27750d = 1;
                objA = qe2.a(aVar, aVar2);
                if (objA != coroutine_suspended) {
                    se2 = this;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                se2 = (SE) aVar2.f27747a;
                jn0.t.b(obj);
                objA = ((jn0.s) obj).getValue();
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (QE.b) aVar2.f27747a;
                jn0.t.b(obj);
            }
            jn0.t.b(((jn0.s) obj).getValue());
            bVar = bVar2;
            return jn0.s.b(bVar);
            if (!jn0.s.h(objA)) {
                return jn0.s.b(objA);
            }
            bVar = (QE.b) objA;
            if (bVar instanceof QE.b.C0514b) {
                if (((QE.b.C0514b) bVar).a().e().getTenant().getRemoteAssets().getEnabled()) {
                    W3 w11 = new W3(se2.f27744c, se2.f27746e);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    b bVar3 = new b(w11, bVar, se2, null);
                    aVar2.f27747a = bVar;
                    aVar2.f27750d = 2;
                    Object objWithContext = BuildersKt.withContext(io2, bVar3, aVar2);
                    if (objWithContext != coroutine_suspended) {
                        obj = objWithContext;
                        bVar2 = bVar;
                        jn0.t.b(((jn0.s) obj).getValue());
                        bVar = bVar2;
                    }
                    return coroutine_suspended;
                }
                if (AbstractC3972w5.b(se2.f27742a)) {
                    throw AbstractC3594nE.f33879a.a();
                }
            }
            return jn0.s.b(bVar);
        } catch (Throwable th2) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(th2));
        }
    }
}
