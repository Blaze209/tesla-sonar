package xd;

import jn0.h0;
import ke.ButtonComponentParams;
import kf.p;
import kf.r;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import ud.BacsDirectDebitComponentState;
import wn0.l;
import yd.BacsDirectDebitInputData;
import yd.BacsDirectDebitOutputData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lxd/b;", "Lje/d;", "Lud/b;", "Lkf/r;", "Lkf/c;", "Lkf/p;", "Lud/e;", "mode", "", "s", "(Lud/e;)Z", "Lkotlin/Function1;", "Lyd/a;", "Ljn0/h0;", "update", "t", "(Lwn0/l;)V", "isInteractionBlocked", "m", "(Z)V", "Lke/d;", "e", "()Lke/d;", "componentParams", "Lyd/b;", "c", "()Lyd/b;", "outputData", "Lkotlinx/coroutines/flow/Flow;", "h", "()Lkotlinx/coroutines/flow/Flow;", "outputDataFlow", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b extends je.d<BacsDirectDebitComponentState>, r, kf.c, p {
    BacsDirectDebitOutputData c();

    @Override // je.b
    ButtonComponentParams e();

    Flow<BacsDirectDebitOutputData> h();

    void m(boolean isInteractionBlocked);

    boolean s(ud.e mode);

    void t(l<? super BacsDirectDebitInputData, h0> update);
}
