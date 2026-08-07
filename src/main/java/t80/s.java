package t80;

import com.stripe.android.stripe3ds2.transaction.IntentData;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lt80/s;", "", "Lt80/c;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt80/e;", "challengeParameters", "", "timeoutMins", "Lcom/stripe/android/stripe3ds2/transaction/n;", "intentData", "Lt80/m;", "b", "(Lt80/e;ILcom/stripe/android/stripe3ds2/transaction/n;)Lt80/m;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface s {
    Object a(Continuation<? super AuthenticationRequestParameters> continuation);

    InitChallengeArgs b(ChallengeParameters challengeParameters, int timeoutMins, IntentData intentData);
}
