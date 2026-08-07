package kotlinx.coroutines.internal;

import androidx.camera.view.i;
import ezvcard.property.Gender;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013kotlin.Metadata;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u0013\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "", "id", "Lkotlin/Function2;", "createNewSegment", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLwn0/p;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", Gender.NONE, "close", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILwn0/l;)Z", "POINTERS_SHIFT", "I", "Lkotlinx/coroutines/internal/Symbol;", "CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    private static final /* synthetic */ boolean addConditionally$atomicfu$ATOMIC_ARRAY$Int(AtomicIntegerArray atomicIntegerArray, int i11, int i12, l<? super Integer, Boolean> lVar) {
        int i13;
        do {
            i13 = atomicIntegerArray.get(i11);
            if (!lVar.invoke(Integer.valueOf(i13)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i11, i13, i13 + i12));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, int i11, l<? super Integer, Boolean> lVar) {
        int i12;
        do {
            i12 = atomicIntegerFieldUpdater.get(obj);
            if (!lVar.invoke(Integer.valueOf(i12)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i12, i12 + i11));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$BOXED_ATOMIC$Int(AtomicInteger atomicInteger, int i11, l<? super Integer, Boolean> lVar) {
        int i12;
        do {
            i12 = atomicInteger.get();
            if (!lVar.invoke(Integer.valueOf(i12)).booleanValue()) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i12, i12 + i11));
        return true;
    }

    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n11) {
        while (true) {
            Object nextOrClosed = n11.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n11;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) nextOrClosed;
            if (concurrentLinkedListNode != null) {
                n11 = (N) concurrentLinkedListNode;
            } else if (n11.markAsClosed()) {
                return n11;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$ATOMIC_ARRAY$Any(AtomicReferenceArray atomicReferenceArray, int i11, long j11, S s11, p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s11, j11, pVar);
            if (SegmentOrClosed.m582isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM580getSegmentimpl = SegmentOrClosed.m580getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceArray.get(i11);
                if (segment.id >= segmentM580getSegmentimpl.id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM580getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (nl0.b.a(atomicReferenceArray, i11, segment, segmentM580getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                    return objFindSegmentInternal;
                }
                if (segmentM580getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM580getSegmentimpl.remove();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, long j11, S s11, p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s11, j11, pVar);
            if (SegmentOrClosed.m582isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM580getSegmentimpl = SegmentOrClosed.m580getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
                if (segment.id >= segmentM580getSegmentimpl.id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM580getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, segment, segmentM580getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                    return objFindSegmentInternal;
                }
                if (segmentM580getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM580getSegmentimpl.remove();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$BOXED_ATOMIC$Any(AtomicReference atomicReference, long j11, S s11, p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s11, j11, pVar);
            if (SegmentOrClosed.m582isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM580getSegmentimpl = SegmentOrClosed.m580getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReference.get();
                if (segment.id >= segmentM580getSegmentimpl.id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM580getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (i.a(atomicReference, segment, segmentM580getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                    return objFindSegmentInternal;
                }
                if (segmentM580getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM580getSegmentimpl.remove();
                }
            }
        }
    }

    public static final <S extends Segment<S>> Object findSegmentInternal(S s11, long j11, p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s11.id >= j11 && !s11.isRemoved()) {
                return SegmentOrClosed.m577constructorimpl(s11);
            }
            Object nextOrClosed = s11.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m577constructorimpl(CLOSED);
            }
            S sInvoke = (S) ((ConcurrentLinkedListNode) nextOrClosed);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s11.id + 1), s11);
                if (s11.trySetNext(sInvoke)) {
                    if (s11.isRemoved()) {
                        s11.remove();
                    }
                }
            }
            s11 = (Object) sInvoke;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$ATOMIC_ARRAY$Any(AtomicReferenceArray atomicReferenceArray, int i11, S s11) {
        while (true) {
            Segment segment = (Segment) atomicReferenceArray.get(i11);
            if (segment.id >= s11.id) {
                return true;
            }
            if (!s11.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (nl0.b.a(atomicReferenceArray, i11, segment, s11)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s11.decPointers$kotlinx_coroutines_core()) {
                s11.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, S s11) {
        while (true) {
            Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment.id >= s11.id) {
                return true;
            }
            if (!s11.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, segment, s11)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s11.decPointers$kotlinx_coroutines_core()) {
                s11.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$BOXED_ATOMIC$Any(AtomicReference atomicReference, S s11) {
        while (true) {
            Segment segment = (Segment) atomicReference.get();
            if (segment.id >= s11.id) {
                return true;
            }
            if (!s11.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (i.a(atomicReference, segment, s11)) {
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
                return true;
            }
            if (s11.decPointers$kotlinx_coroutines_core()) {
                s11.remove();
            }
        }
    }
}
