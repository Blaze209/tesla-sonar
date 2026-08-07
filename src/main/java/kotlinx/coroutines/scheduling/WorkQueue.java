package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b(\u0010\u001eJ\u0015\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0019¢\u0006\u0004\b*\u0010+R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0013\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004048\u0002X\u0082\u0004R\u000b\u00107\u001a\u0002068\u0002X\u0082\u0004R\u000b\u00108\u001a\u0002068\u0002X\u0082\u0004R\u000b\u00109\u001a\u0002068\u0002X\u0082\u0004¨\u0006:"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "<init>", "()V", "Lkotlinx/coroutines/scheduling/Task;", "task", "addLast", "(Lkotlinx/coroutines/scheduling/Task;)Lkotlinx/coroutines/scheduling/Task;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "stealWithExclusiveMode", "(I)Lkotlinx/coroutines/scheduling/Task;", "", "onlyBlocking", "pollWithExclusiveMode", "(Z)Lkotlinx/coroutines/scheduling/Task;", "index", "tryExtractFromTheMiddle", "(IZ)Lkotlinx/coroutines/scheduling/Task;", "Lkotlin/jvm/internal/n0;", "stolenTaskRef", "", "tryStealLastScheduled", "(ILkotlin/jvm/internal/n0;)J", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "queue", "pollTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)Z", "pollBuffer", "()Lkotlinx/coroutines/scheduling/Task;", "Ljn0/h0;", "decrementIfBlocking", "(Lkotlinx/coroutines/scheduling/Task;)V", "poll", "fair", "add", "(Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "trySteal", "pollBlocking", "pollCpu", "globalQueue", "offloadAllWorkTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "getBufferSize", "()I", "bufferSize", "getSize$kotlinx_coroutines_core", "size", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicInt;", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkQueue {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private final AtomicReferenceArray<Task> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater lastScheduledTask$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater producerIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumerIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater blockingTasksInBuffer$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer$volatile");

    public static /* synthetic */ Task add$default(WorkQueue workQueue, Task task, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return workQueue.add(task, z11);
    }

    private final Task addLast(Task task) {
        if (getBufferSize() == 127) {
            return task;
        }
        if (task.taskContext) {
            blockingTasksInBuffer$volatile$FU.incrementAndGet(this);
        }
        int i11 = producerIndex$volatile$FU.get(this) & 127;
        while (this.buffer.get(i11) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i11, task);
        producerIndex$volatile$FU.incrementAndGet(this);
        return null;
    }

    private final void decrementIfBlocking(Task task) {
        if (task == null || !task.taskContext) {
            return;
        }
        blockingTasksInBuffer$volatile$FU.decrementAndGet(this);
    }

    private final /* synthetic */ int getBlockingTasksInBuffer$volatile() {
        return this.blockingTasksInBuffer$volatile;
    }

    private final int getBufferSize() {
        return producerIndex$volatile$FU.get(this) - consumerIndex$volatile$FU.get(this);
    }

    private final /* synthetic */ int getConsumerIndex$volatile() {
        return this.consumerIndex$volatile;
    }

    private final /* synthetic */ Object getLastScheduledTask$volatile() {
        return this.lastScheduledTask$volatile;
    }

    private final /* synthetic */ int getProducerIndex$volatile() {
        return this.producerIndex$volatile;
    }

    private final Task pollBuffer() {
        Task andSet;
        while (true) {
            int i11 = consumerIndex$volatile$FU.get(this);
            if (i11 - producerIndex$volatile$FU.get(this) == 0) {
                return null;
            }
            int i12 = i11 & 127;
            if (consumerIndex$volatile$FU.compareAndSet(this, i11, i11 + 1) && (andSet = this.buffer.getAndSet(i12, null)) != null) {
                decrementIfBlocking(andSet);
                return andSet;
            }
        }
    }

    private final boolean pollTo(GlobalQueue queue) {
        Task taskPollBuffer = pollBuffer();
        if (taskPollBuffer == null) {
            return false;
        }
        queue.addLast(taskPollBuffer);
        return true;
    }

    private final Task pollWithExclusiveMode(boolean onlyBlocking) {
        Task task;
        do {
            task = (Task) lastScheduledTask$volatile$FU.get(this);
            if (task == null || task.taskContext != onlyBlocking) {
                int i11 = consumerIndex$volatile$FU.get(this);
                int i12 = producerIndex$volatile$FU.get(this);
                while (i11 != i12) {
                    if (onlyBlocking && blockingTasksInBuffer$volatile$FU.get(this) == 0) {
                        return null;
                    }
                    i12--;
                    Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i12, onlyBlocking);
                    if (taskTryExtractFromTheMiddle != null) {
                        return taskTryExtractFromTheMiddle;
                    }
                }
                return null;
            }
        } while (!b.a(lastScheduledTask$volatile$FU, this, task, null));
        return task;
    }

    private final /* synthetic */ void setBlockingTasksInBuffer$volatile(int i11) {
        this.blockingTasksInBuffer$volatile = i11;
    }

    private final /* synthetic */ void setConsumerIndex$volatile(int i11) {
        this.consumerIndex$volatile = i11;
    }

    private final /* synthetic */ void setLastScheduledTask$volatile(Object obj) {
        this.lastScheduledTask$volatile = obj;
    }

    private final /* synthetic */ void setProducerIndex$volatile(int i11) {
        this.producerIndex$volatile = i11;
    }

    private final Task stealWithExclusiveMode(int stealingMode) {
        int i11 = consumerIndex$volatile$FU.get(this);
        int i12 = producerIndex$volatile$FU.get(this);
        boolean z11 = stealingMode == 1;
        while (i11 != i12) {
            if (z11 && blockingTasksInBuffer$volatile$FU.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i11, z11);
            if (taskTryExtractFromTheMiddle != null) {
                return taskTryExtractFromTheMiddle;
            }
            i11 = i13;
        }
        return null;
    }

    private final Task tryExtractFromTheMiddle(int index, boolean onlyBlocking) {
        int i11 = index & 127;
        Task task = this.buffer.get(i11);
        if (task == null || task.taskContext != onlyBlocking || !nl0.b.a(this.buffer, i11, task, null)) {
            return null;
        }
        if (onlyBlocking) {
            blockingTasksInBuffer$volatile$FU.decrementAndGet(this);
        }
        return task;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.Task] */
    private final long tryStealLastScheduled(int stealingMode, n0<Task> stolenTaskRef) {
        ?? r11;
        do {
            r11 = (Task) lastScheduledTask$volatile$FU.get(this);
            if (r11 == 0) {
                return -2L;
            }
            if (((r11.taskContext ? 1 : 2) & stealingMode) == 0) {
                return -2L;
            }
            long jNanoTime = TasksKt.schedulerTimeSource.nanoTime() - r11.submissionTime;
            long j11 = TasksKt.WORK_STEALING_TIME_RESOLUTION_NS;
            if (jNanoTime < j11) {
                return j11 - jNanoTime;
            }
        } while (!b.a(lastScheduledTask$volatile$FU, this, r11, null));
        stolenTaskRef.f86529a = r11;
        return -1L;
    }

    public final Task add(Task task, boolean fair) {
        if (fair) {
            return addLast(task);
        }
        Task task2 = (Task) lastScheduledTask$volatile$FU.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return addLast(task2);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return lastScheduledTask$volatile$FU.get(this) != null ? getBufferSize() + 1 : getBufferSize();
    }

    public final void offloadAllWorkTo(GlobalQueue globalQueue) {
        Task task = (Task) lastScheduledTask$volatile$FU.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        while (pollTo(globalQueue)) {
        }
    }

    public final Task poll() {
        Task task = (Task) lastScheduledTask$volatile$FU.getAndSet(this, null);
        return task == null ? pollBuffer() : task;
    }

    public final Task pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    public final Task pollCpu() {
        return pollWithExclusiveMode(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int stealingMode, n0<Task> stolenTaskRef) {
        Task taskStealWithExclusiveMode;
        T t11;
        Task taskPollBuffer;
        if (stealingMode == 3) {
            taskPollBuffer = pollBuffer();
        } else {
            taskStealWithExclusiveMode = stealWithExclusiveMode(stealingMode);
        }
        if (t11 == 0) {
            t11 = taskStealWithExclusiveMode;
            t11 = taskPollBuffer;
            return tryStealLastScheduled(stealingMode, stolenTaskRef);
        }
        t11 = taskStealWithExclusiveMode;
        t11 = taskPollBuffer;
        stolenTaskRef.f86529a = t11;
        return -1L;
    }
}
