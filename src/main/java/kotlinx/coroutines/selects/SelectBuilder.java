package kotlinx.coroutines.selects;

import jn0.e;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J2\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002¢\u0006\u0004\b\b\u0010\tJD\u0010\b\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002¢\u0006\u0004\b\b\u0010\rJX\u0010\b\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002¢\u0006\u0004\b\b\u0010\u0011JR\u0010\b\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\n*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u000f2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0002¢\u0006\u0004\b\b\u0010\u0012J5\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H\u0017¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0001\u0001\u0017¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilder;", "R", "", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "Ljn0/h0;", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lwn0/l;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lwn0/p;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lwn0/p;)V", "(Lkotlinx/coroutines/selects/SelectClause2;Lwn0/p;)V", "", "timeMillis", "onTimeout", "(JLwn0/l;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SelectBuilder<R> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void invoke(SelectBuilder<? super R> selectBuilder, SelectClause2<? super P, ? extends Q> selectClause2, p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
            selectBuilder.invoke(selectClause2, null, pVar);
        }

        @e
        @ExperimentalCoroutinesApi
        public static <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j11, l<? super Continuation<? super R>, ? extends Object> lVar) {
            OnTimeoutKt.onTimeout(selectBuilder, j11, lVar);
        }
    }

    void invoke(SelectClause0 selectClause0, l<? super Continuation<? super R>, ? extends Object> lVar);

    <Q> void invoke(SelectClause1<? extends Q> selectClause1, p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p11, p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar);

    @e
    @ExperimentalCoroutinesApi
    void onTimeout(long timeMillis, l<? super Continuation<? super R>, ? extends Object> block);
}
