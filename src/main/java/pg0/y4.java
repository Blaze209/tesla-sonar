package pg0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\n\u001a\"0\u0004R\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpg0/g3$a;", "renderProps", "Lpg0/n1$h;", "renderState", "Ly20/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Ly20/k;", "Lpg0/n1;", "Lpg0/g3$b;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxg0/k;", "videoCaptureHelper", "Ljn0/h0;", "g", "(Lpg0/g3$a;Lpg0/n1$h;Ly20/k$a;Lxg0/k;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", IntegerTokenConverter.CONVERTER_KEY, "(Lpg0/g3$a;Lpg0/n1$h;Ly20/k$a;Lxg0/k;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;)V", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class y4 {
    public static final void g(g3.a renderProps, n1.h renderState, y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a context, xg0.k videoCaptureHelper) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(videoCaptureHelper, "videoCaptureHelper");
        q captureConfig = renderState.getCaptureConfig();
        if (captureConfig instanceof q.AutoClassifyConfig) {
            context.c().b(y20.b0.c(null, new wn0.l() { // from class: pg0.s4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return y4.h((y20.r.c) obj);
                }
            }, 1, null));
        } else {
            if (!(captureConfig instanceof q.IdCaptureConfig)) {
                throw new NoWhenBranchMatchedException();
            }
            c4.R(renderState, context, renderProps, renderState.getIdForReview(), ((q.IdCaptureConfig) captureConfig).getId(), videoCaptureHelper, renderState.getCameraProperties(), (3584 & 128) != 0, (3584 & 256) != 0 ? renderState.j() : null, (3584 & 512) != 0 ? renderState.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? renderState.getCountryCode() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.h hVar = objC instanceof n1.h ? (n1.h) objC : null;
        if (hVar == null) {
            return jn0.h0.f84049a;
        }
        action.e(hVar.u(true));
        return jn0.h0.f84049a;
    }

    public static final void i(final g3.a renderProps, final n1.h renderState, final y20.k<? super g3.a, n1, ? extends g3.b, ? extends Object>.a context, final xg0.k videoCaptureHelper, AutoClassifyWorker.b autoClassifyWorkerFactory) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(videoCaptureHelper, "videoCaptureHelper");
        p013kotlin.jvm.internal.s.k(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        y20.w.l(context, autoClassifyWorkerFactory.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), renderState.getIdForReview(), new AutoClassifyWorker.SupplementaryData(), renderProps.getManualCaptureButtonDelayMs(), renderProps.getAutoClassificationConfig().getExtractTextFromImage()), p013kotlin.jvm.internal.o0.o(AutoClassifyWorker.class), "", new wn0.l() { // from class: pg0.t4
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return y4.j(context, videoCaptureHelper, renderProps, renderState, (AutoClassifyWorker.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r j(final y20.k.a aVar, final xg0.k kVar, final g3.a aVar2, final n1.h hVar, final AutoClassifyWorker.c it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof AutoClassifyWorker.c.a) {
            return y20.b0.c(null, new wn0.l() { // from class: pg0.u4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return y4.k(aVar, it, kVar, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof AutoClassifyWorker.c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        final AutoClassifyWorker.a autoClassificationResult = ((AutoClassifyWorker.c.b) it).getAutoClassificationResult();
        if (autoClassificationResult instanceof AutoClassifyWorker.a.C1174a) {
            return y20.b0.c(null, new wn0.l() { // from class: pg0.v4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return y4.l(aVar, aVar2, hVar, autoClassificationResult, kVar, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (autoClassificationResult instanceof AutoClassifyWorker.a.b) {
            return y20.b0.c(null, new wn0.l() { // from class: pg0.w4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return y4.m(hVar, autoClassificationResult, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (autoClassificationResult instanceof AutoClassifyWorker.a.c) {
            return y20.b0.c(null, new wn0.l() { // from class: pg0.x4
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return y4.n(hVar, autoClassificationResult, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k(y20.k.a aVar, AutoClassifyWorker.c cVar, xg0.k kVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        c4.W(aVar, new g3.b.c(((AutoClassifyWorker.c.a) cVar).getCause()), kVar);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l(y20.k.a aVar, g3.a aVar2, n1.h hVar, AutoClassifyWorker.a aVar3, xg0.k kVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.h hVar2 = objC instanceof n1.h ? (n1.h) objC : null;
        if (hVar2 == null) {
            return jn0.h0.f84049a;
        }
        action.e(hVar2.u(false));
        AutoClassifyWorker.a.C1174a c1174a = (AutoClassifyWorker.a.C1174a) aVar3;
        c4.R(hVar2, aVar, aVar2, hVar.getIdForReview(), c1174a.getIdConfig(), kVar, new zf0.u(null, null, null, 0, 15, null), (3584 & 128) != 0, (3584 & 256) != 0 ? hVar2.j() : c1174a.getIdConfig().b(), (3584 & 512) != 0 ? hVar2.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? hVar2.getCountryCode() : null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m(n1.h hVar, AutoClassifyWorker.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.h hVar2 = objC instanceof n1.h ? (n1.h) objC : null;
        if (hVar2 == null) {
            return jn0.h0.f84049a;
        }
        n1.h hVar3 = hVar2;
        action.e(new n1.AutoClassificationError(hVar3.getCurrentPart(), hVar3.k(), hVar3.j(), hVar3.getPartIndex(), c4.w(action, false), hVar3.getCountryCode(), hVar.getIdForReview().G3(), new zf0.u(null, null, null, 0, 15, null), ((AutoClassifyWorker.a.b) aVar).a(), null, null, c.IdTypeRejected, 1536, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n(n1.h hVar, AutoClassifyWorker.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        n1.h hVar2 = objC instanceof n1.h ? (n1.h) objC : null;
        if (hVar2 == null) {
            return jn0.h0.f84049a;
        }
        n1.h hVar3 = hVar2;
        action.e(new n1.AutoClassificationError(hVar3.getCurrentPart(), hVar3.k(), hVar3.j(), hVar3.getPartIndex(), c4.w(action, false), hVar3.getCountryCode(), hVar.getIdForReview().G3(), new zf0.u(null, null, null, 0, 15, null), ((AutoClassifyWorker.a.c) aVar).a(), null, null, c.UnableToClassify, 1536, null));
        return jn0.h0.f84049a;
    }
}
