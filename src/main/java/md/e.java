package md;

import com.adyen.threeds2.ChallengeResult;
import com.adyen.threeds2.ChallengeStatusHandler;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR.\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lmd/e;", "Lcom/adyen/threeds2/ChallengeStatusHandler;", "<init>", "()V", "Lcom/adyen/threeds2/ChallengeResult;", "result", "Ljn0/h0;", "onCompletion", "(Lcom/adyen/threeds2/ChallengeResult;)V", "value", "b", "Lcom/adyen/threeds2/ChallengeStatusHandler;", "getOnCompletionListener", "()Lcom/adyen/threeds2/ChallengeStatusHandler;", "a", "(Lcom/adyen/threeds2/ChallengeStatusHandler;)V", "onCompletionListener", "c", "Lcom/adyen/threeds2/ChallengeResult;", "queuedResult", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements ChallengeStatusHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f91826a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static ChallengeStatusHandler onCompletionListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static ChallengeResult queuedResult;

    private e() {
    }

    public final void a(ChallengeStatusHandler challengeStatusHandler) {
        onCompletionListener = challengeStatusHandler;
        ChallengeResult challengeResult = queuedResult;
        if (challengeResult != null) {
            f91826a.onCompletion(challengeResult);
        }
    }

    @Override // com.adyen.threeds2.ChallengeStatusHandler
    public void onCompletion(ChallengeResult result) {
        s.k(result, "result");
        ChallengeStatusHandler challengeStatusHandler = onCompletionListener;
        h0 h0Var = null;
        if (challengeStatusHandler != null) {
            challengeStatusHandler.onCompletion(result);
            h0 h0Var2 = h0.f84049a;
            queuedResult = null;
            h0Var = h0.f84049a;
        }
        if (h0Var == null) {
            queuedResult = result;
        }
    }
}
