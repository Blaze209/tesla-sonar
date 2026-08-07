package h30;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.AccountRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000f\u0010\tR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lh30/m;", "Lh30/e;", "<init>", "()V", "Lh30/a;", "bin", "", "Lcom/stripe/android/model/a;", "b", "(Lh30/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountRanges", "Ljn0/h0;", "a", "(Lh30/a;Ljava/util/List;)V", "", "c", "", "Ljava/util/Map;", PlaceTypes.STORE, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<a, List<AccountRange>> store = new LinkedHashMap();

    @Override // h30.e
    public void a(a bin, List<AccountRange> accountRanges) {
        s.k(bin, "bin");
        s.k(accountRanges, "accountRanges");
        this.store.put(bin, accountRanges);
    }

    @Override // h30.e
    public Object b(a aVar, Continuation<? super List<AccountRange>> continuation) {
        List<AccountRange> list = this.store.get(aVar);
        return list == null ? v.m() : list;
    }

    @Override // h30.e
    public Object c(a aVar, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.store.containsKey(aVar));
    }
}
