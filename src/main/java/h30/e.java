package h30;

import com.stripe.android.model.AccountRange;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lh30/e;", "", "Lh30/a;", "bin", "", "Lcom/stripe/android/model/a;", "b", "(Lh30/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountRanges", "Ljn0/h0;", "a", "(Lh30/a;Ljava/util/List;)V", "", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface e {
    void a(a bin, List<AccountRange> accountRanges);

    Object b(a aVar, Continuation<? super List<AccountRange>> continuation);

    Object c(a aVar, Continuation<? super Boolean> continuation);
}
