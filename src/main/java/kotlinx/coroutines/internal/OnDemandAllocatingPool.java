package kotlinx.coroutines.internal;

import bo0.j;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0082\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u000b\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004R\u0013\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001c8\u0002X\u0082\u0004¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", "T", "", "", "maxCapacity", "Lkotlin/Function1;", "create", "<init>", "(ILwn0/l;)V", "tryForbidNewElements", "()I", "", "isClosed", "(I)Z", "allocate", "()Z", "", "close", "()Ljava/util/List;", "", "stateRepresentation$kotlinx_coroutines_core", "()Ljava/lang/String;", "stateRepresentation", "toString", "I", "Lwn0/l;", "Lkotlinx/atomicfu/AtomicInt;", "controlState", "Lkotlinx/atomicfu/AtomicArray;", "elements", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater controlState$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;
    private final l<Integer, T> create;
    private final /* synthetic */ AtomicReferenceArray elements;
    private final int maxCapacity;

    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandAllocatingPool(int i11, l<? super Integer, ? extends T> lVar) {
        this.maxCapacity = i11;
        this.create = lVar;
        this.elements = new AtomicReferenceArray(i11);
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.elements;
    }

    private final boolean isClosed(int i11) {
        return (i11 & Integer.MIN_VALUE) != 0;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l<? super Integer, h0> lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(int i11) {
        this.controlState$volatile = i11;
    }

    private final int tryForbidNewElements() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i11, Integer.MIN_VALUE | i11));
        return i11;
    }

    public final boolean allocate() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i11) != 0) {
                return false;
            }
            if (i11 >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i11, i11 + 1));
        getElements().set(i11, this.create.invoke(Integer.valueOf(i11)));
        return true;
    }

    public final List<T> close() {
        int i11;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i11 = 0;
                break;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i11, Integer.MIN_VALUE | i11));
        j jVarW = n.w(0, i11);
        ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            do {
                andSet = getElements().getAndSet(iNextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final String stateRepresentation$kotlinx_coroutines_core() {
        int i11 = controlState$volatile$FU.get(this);
        j jVarW = n.w(0, Integer.MAX_VALUE & i11);
        ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            arrayList.add(getElements().get(((s0) it).nextInt()));
        }
        return arrayList.toString() + ((i11 & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
