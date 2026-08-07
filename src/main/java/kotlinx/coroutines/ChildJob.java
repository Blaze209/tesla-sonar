package kotlinx.coroutines;

import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@InternalCoroutinesApi
@jn0.e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ParentJob;", "parentJob", "Ljn0/h0;", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ChildJob extends Job {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(ChildJob childJob, R r11, p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
            return (R) Job.DefaultImpls.fold(childJob, r11, pVar);
        }

        public static <E extends CoroutineContext.Element> E get(ChildJob childJob, CoroutineContext.Key<E> key) {
            return (E) Job.DefaultImpls.get(childJob, key);
        }

        public static CoroutineContext minusKey(ChildJob childJob, CoroutineContext.Key<?> key) {
            return Job.DefaultImpls.minusKey(childJob, key);
        }

        public static CoroutineContext plus(ChildJob childJob, CoroutineContext coroutineContext) {
            return Job.DefaultImpls.plus(childJob, coroutineContext);
        }

        @jn0.e
        public static Job plus(ChildJob childJob, Job job) {
            return Job.DefaultImpls.plus((Job) childJob, job);
        }
    }

    @InternalCoroutinesApi
    void parentCancelled(ParentJob parentJob);
}
