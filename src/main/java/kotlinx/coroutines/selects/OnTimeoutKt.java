package kotlinx.coroutines.selects;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"R", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "timeMillis", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "Ljn0/h0;", "onTimeout", "(Lkotlinx/coroutines/selects/SelectBuilder;JLwn0/l;)V", "Lio0/b;", "timeout", "onTimeout-8Mi8wO0", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class OnTimeoutKt {
    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalCoroutinesApi
    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j11, l<? super Continuation<? super R>, ? extends Object> lVar) {
        selectBuilder.invoke(new OnTimeout(j11).getSelectClause(), (l<? super Continuation<? super Object>, ? extends Object>) lVar);
    }

    @ExperimentalCoroutinesApi
    /* JADX INFO: renamed from: onTimeout-8Mi8wO0, reason: not valid java name */
    public static final <R> void m591onTimeout8Mi8wO0(SelectBuilder<? super R> selectBuilder, long j11, l<? super Continuation<? super R>, ? extends Object> lVar) {
        onTimeout(selectBuilder, DelayKt.m507toDelayMillisLRDsOJo(j11), lVar);
    }
}
