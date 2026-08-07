package jd;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.adyen3ds2.internal.data.model.SubmitFingerprintRequest;
import com.adyen.checkout.adyen3ds2.internal.data.model.SubmitFingerprintResponse;
import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.action.Threeds2Action;
import java.util.concurrent.CancellationException;
import jn0.s;
import jn0.t;
import kd.c;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Ljd/a;", "", "Ljd/b;", "submitFingerprintService", "<init>", "(Ljd/b;)V", "", "encodedFingerprint", "clientKey", "paymentData", "Ljn0/s;", "Lkd/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljd/b;", "b", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jd.b submitFingerprintService;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.adyen3ds2.internal.data.api.SubmitFingerprintRepository", f = "SubmitFingerprintRepository.kt", i = {0}, l = {36}, m = "submitFingerprint-BWLJW6A", n = {"$this$submitFingerprint_BWLJW6A_u24lambda_u245"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83598n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f83599o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83601q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f83599o = obj;
            this.f83601q |= Integer.MIN_VALUE;
            Object objA = a.this.a(null, null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    public a(jd.b submitFingerprintService) {
        p013kotlin.jvm.internal.s.k(submitFingerprintService, "submitFingerprintService");
        this.submitFingerprintService = submitFingerprintService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(String str, String str2, String str3, Continuation<? super s<? extends c>> continuation) {
        b bVar;
        a aVar;
        Object c1832c;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f83601q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f83601q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objB = bVar.f83599o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f83601q;
        try {
            if (i12 == 0) {
                t.b(objB);
                s.Companion companion = s.INSTANCE;
                me.a aVar2 = me.a.DEBUG;
                me.b.Companion companion2 = me.b.INSTANCE;
                if (companion2.a().a(aVar2)) {
                    String name = a.class.getName();
                    p013kotlin.jvm.internal.s.h(name);
                    String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU1.length() != 0) {
                        name = p013kotlin.text.t.W0(strU1, "Kt");
                    }
                    companion2.a().b(aVar2, "CO." + name, "Submitting fingerprint automatically", null);
                }
                SubmitFingerprintRequest submitFingerprintRequest = new SubmitFingerprintRequest(str, str3);
                jd.b bVar2 = this.submitFingerprintService;
                bVar.f83598n = this;
                bVar.f83601q = 1;
                objB = bVar2.b(submitFingerprintRequest, str2, bVar);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) bVar.f83598n;
                t.b(objB);
            }
            SubmitFingerprintResponse submitFingerprintResponse = (SubmitFingerprintResponse) objB;
            if (p013kotlin.jvm.internal.s.f(submitFingerprintResponse.getType(), "completed") && submitFingerprintResponse.getDetails() != null) {
                me.a aVar3 = me.a.DEBUG;
                me.b.Companion companion3 = me.b.INSTANCE;
                if (companion3.a().a(aVar3)) {
                    String name2 = aVar.getClass().getName();
                    p013kotlin.jvm.internal.s.h(name2);
                    String strU2 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU2.length() != 0) {
                        name2 = p013kotlin.text.t.W0(strU2, "Kt");
                    }
                    companion3.a().b(aVar3, "CO." + name2, "submitFingerprint: challenge completed", null);
                }
                c1832c = new c.a(new JSONObject(submitFingerprintResponse.getDetails()));
            } else if (p013kotlin.jvm.internal.s.f(submitFingerprintResponse.getType(), "action") && (submitFingerprintResponse.getAction() instanceof RedirectAction)) {
                me.a aVar4 = me.a.DEBUG;
                me.b.Companion companion4 = me.b.INSTANCE;
                if (companion4.a().a(aVar4)) {
                    String name3 = aVar.getClass().getName();
                    p013kotlin.jvm.internal.s.h(name3);
                    String strU3 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name3, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU3.length() != 0) {
                        name3 = p013kotlin.text.t.W0(strU3, "Kt");
                    }
                    companion4.a().b(aVar4, "CO." + name3, "submitFingerprint: received new RedirectAction", null);
                }
                c1832c = new c.b((RedirectAction) submitFingerprintResponse.getAction());
            } else {
                if (!p013kotlin.jvm.internal.s.f(submitFingerprintResponse.getType(), "action") || !(submitFingerprintResponse.getAction() instanceof Threeds2Action)) {
                    me.a aVar5 = me.a.DEBUG;
                    me.b.Companion companion5 = me.b.INSTANCE;
                    if (companion5.a().a(aVar5)) {
                        String name4 = aVar.getClass().getName();
                        p013kotlin.jvm.internal.s.h(name4);
                        String strU4 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name4, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                        if (strU4.length() != 0) {
                            name4 = p013kotlin.text.t.W0(strU4, "Kt");
                        }
                        me.b bVarA = companion5.a();
                        bVarA.b(aVar5, "CO." + name4, "submitFingerprint: unexpected response " + submitFingerprintResponse, null);
                    }
                    throw new IllegalStateException("Failed to retrieve 3DS2 fingerprint result");
                }
                me.a aVar6 = me.a.DEBUG;
                me.b.Companion companion6 = me.b.INSTANCE;
                if (companion6.a().a(aVar6)) {
                    String name5 = aVar.getClass().getName();
                    p013kotlin.jvm.internal.s.h(name5);
                    String strU5 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name5, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU5.length() != 0) {
                        name5 = p013kotlin.text.t.W0(strU5, "Kt");
                    }
                    companion6.a().b(aVar6, "CO." + name5, "submitFingerprint: received new Threeds2Action", null);
                }
                c1832c = new c.C1832c((Threeds2Action) submitFingerprintResponse.getAction());
            }
            return s.b(c1832c);
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            s.Companion companion7 = s.INSTANCE;
            return s.b(t.a(th2));
        }
    }
}
