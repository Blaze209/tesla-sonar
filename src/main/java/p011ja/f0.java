package p011ja;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import jn0.h0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0019\u0010\bR\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R*\u0010+\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001e0,8\u0006¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b\u001f\u0010.R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0,8\u0006¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b#\u0010.¨\u00061"}, d2 = {"Lja/f0;", "", "<init>", "()V", "Lja/k;", "backStackEntry", "Ljn0/h0;", "j", "(Lja/k;)V", "k", "Lja/r;", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Lja/r;Landroid/os/Bundle;)Lja/k;", "popUpTo", "", "saveState", "g", "(Lja/k;Z)V", "h", "f", "entry", "e", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_backStack", "", "c", "_transitionsInProgress", "<set-?>", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "l", "(Z)V", "isNavigating", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", "transitionsInProgress", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock backStackLock = new ReentrantLock(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<List<k>> _backStack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Set<k>> _transitionsInProgress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isNavigating;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<k>> backStack;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Set<k>> transitionsInProgress;

    public f0() {
        MutableStateFlow<List<k>> MutableStateFlow = StateFlowKt.MutableStateFlow(v.m());
        this._backStack = MutableStateFlow;
        MutableStateFlow<Set<k>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(d1.d());
        this._transitionsInProgress = MutableStateFlow2;
        this.backStack = FlowKt.asStateFlow(MutableStateFlow);
        this.transitionsInProgress = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public abstract k a(r destination, Bundle arguments);

    public final StateFlow<List<k>> b() {
        return this.backStack;
    }

    public final StateFlow<Set<k>> c() {
        return this.transitionsInProgress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsNavigating() {
        return this.isNavigating;
    }

    public void e(k entry) {
        s.k(entry, "entry");
        MutableStateFlow<Set<k>> mutableStateFlow = this._transitionsInProgress;
        mutableStateFlow.setValue(d1.m(mutableStateFlow.getValue(), entry));
    }

    public void f(k backStackEntry) {
        int iNextIndex;
        s.k(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            List<k> listP1 = v.p1(this.backStack.getValue());
            ListIterator<k> listIterator = listP1.listIterator(listP1.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (s.f(listIterator.previous().getId(), backStackEntry.getId())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listP1.set(iNextIndex, backStackEntry);
            this._backStack.setValue(listP1);
            h0 h0Var = h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void g(k popUpTo, boolean saveState) {
        s.k(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            MutableStateFlow<List<k>> mutableStateFlow = this._backStack;
            List<k> value = mutableStateFlow.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (s.f((k) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            mutableStateFlow.setValue(arrayList);
            h0 h0Var = h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void h(k popUpTo, boolean saveState) {
        k kVarPrevious;
        s.k(popUpTo, "popUpTo");
        Set<k> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((k) it.next()) == popUpTo) {
                    List<k> value2 = this.backStack.getValue();
                    if ((value2 instanceof Collection) && value2.isEmpty()) {
                        return;
                    }
                    Iterator<T> it2 = value2.iterator();
                    while (it2.hasNext()) {
                        if (((k) it2.next()) == popUpTo) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        MutableStateFlow<Set<k>> mutableStateFlow = this._transitionsInProgress;
        mutableStateFlow.setValue(d1.o(mutableStateFlow.getValue(), popUpTo));
        List<k> value3 = this.backStack.getValue();
        ListIterator<k> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                kVarPrevious = null;
                break;
            }
            kVarPrevious = listIterator.previous();
            k kVar = kVarPrevious;
            if (!s.f(kVar, popUpTo) && this.backStack.getValue().lastIndexOf(kVar) < this.backStack.getValue().lastIndexOf(popUpTo)) {
                break;
            }
        }
        k kVar2 = kVarPrevious;
        if (kVar2 != null) {
            MutableStateFlow<Set<k>> mutableStateFlow2 = this._transitionsInProgress;
            mutableStateFlow2.setValue(d1.o(mutableStateFlow2.getValue(), kVar2));
        }
        g(popUpTo, saveState);
    }

    public void i(k entry) {
        s.k(entry, "entry");
        MutableStateFlow<Set<k>> mutableStateFlow = this._transitionsInProgress;
        mutableStateFlow.setValue(d1.o(mutableStateFlow.getValue(), entry));
    }

    public void j(k backStackEntry) {
        s.k(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            MutableStateFlow<List<k>> mutableStateFlow = this._backStack;
            mutableStateFlow.setValue(v.Q0(mutableStateFlow.getValue(), backStackEntry));
            h0 h0Var = h0.f84049a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k(k backStackEntry) {
        s.k(backStackEntry, "backStackEntry");
        Set<k> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((k) it.next()) == backStackEntry) {
                    List<k> value2 = this.backStack.getValue();
                    if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                        Iterator<T> it2 = value2.iterator();
                        while (it2.hasNext()) {
                            if (((k) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        k kVar = (k) v.C0(this.backStack.getValue());
        if (kVar != null) {
            MutableStateFlow<Set<k>> mutableStateFlow = this._transitionsInProgress;
            mutableStateFlow.setValue(d1.o(mutableStateFlow.getValue(), kVar));
        }
        MutableStateFlow<Set<k>> mutableStateFlow2 = this._transitionsInProgress;
        mutableStateFlow2.setValue(d1.o(mutableStateFlow2.getValue(), backStackEntry));
        j(backStackEntry);
    }

    public final void l(boolean z11) {
        this.isNavigating = z11;
    }
}
