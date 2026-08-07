package nf0;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R*\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lnf0/b;", "", "Lkotlinx/coroutines/flow/Flow;", "Lof0/a;", "b", "()Lkotlinx/coroutines/flow/Flow;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/coroutines/Job;", "a", "()Ljava/util/concurrent/ConcurrentHashMap;", "setSessionJobMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "sessionJobMap", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b {
    ConcurrentHashMap<Integer, Job> a();

    Flow<of0.a> b();
}
