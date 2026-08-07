package androidx.p003lifecycle;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import q.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 <2\u00020\u0001:\u0002\"%B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010&R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R&\u00108\u001a\u0012\u0012\u0004\u0012\u00020\t05j\b\u0012\u0004\u0012\u00020\t`68\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010:R\u0014\u0010>\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010A\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010?\"\u0004\b@\u0010\r¨\u0006B"}, d2 = {"Landroidx/lifecycle/y;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleOwner;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Z)V", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "next", "Ljn0/h0;", "l", "(Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/w;", "observer", "f", "(Landroidx/lifecycle/w;)Landroidx/lifecycle/Lifecycle$State;", "m", "()V", "state", "n", "lifecycleOwner", IntegerTokenConverter.CONVERTER_KEY, "e", "p", "", "methodName", "h", "(Ljava/lang/String;)V", "Landroidx/lifecycle/Lifecycle$a;", "event", "j", "(Landroidx/lifecycle/Lifecycle$a;)V", "a", "(Landroidx/lifecycle/w;)V", DateTokenConverter.CONVERTER_KEY, "b", "Z", "Lq/a;", "Landroidx/lifecycle/y$b;", "c", "Lq/a;", "observerMap", "Landroidx/lifecycle/Lifecycle$State;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "g", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_currentStateFlow", "k", "()Z", "isSynced", "()Landroidx/lifecycle/Lifecycle$State;", "o", "currentState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class y extends Lifecycle {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceMainThread;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a<w, b> observerMap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Lifecycle.State state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<LifecycleOwner> lifecycleOwner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int addingObserverCounter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean handlingEvent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean newEventOccurred;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Lifecycle.State> parentStates;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Lifecycle.State> _currentStateFlow;

    /* JADX INFO: renamed from: androidx.lifecycle.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/y$a;", "", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/y;", "a", "(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/y;", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "b", "(Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a(LifecycleOwner owner) {
            s.k(owner, "owner");
            return new y(owner, false, null);
        }

        public final Lifecycle.State b(Lifecycle.State state1, Lifecycle.State state2) {
            s.k(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/y$b;", "", "Landroidx/lifecycle/w;", "observer", "Landroidx/lifecycle/Lifecycle$State;", "initialState", "<init>", "(Landroidx/lifecycle/w;Landroidx/lifecycle/Lifecycle$State;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", "a", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "Landroidx/lifecycle/Lifecycle$State;", "b", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "state", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/u;", "getLifecycleObserver", "()Landroidx/lifecycle/u;", "setLifecycleObserver", "(Landroidx/lifecycle/u;)V", "lifecycleObserver", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Lifecycle.State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private u lifecycleObserver;

        public b(w wVar, Lifecycle.State initialState) {
            s.k(initialState, "initialState");
            s.h(wVar);
            this.lifecycleObserver = c0.f(wVar);
            this.state = initialState;
        }

        public final void a(LifecycleOwner owner, Lifecycle.a event) {
            s.k(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.state = y.INSTANCE.b(this.state, targetState);
            u uVar = this.lifecycleObserver;
            s.h(owner);
            uVar.onStateChanged(owner, event);
            this.state = targetState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Lifecycle.State getState() {
            return this.state;
        }
    }

    public /* synthetic */ y(LifecycleOwner lifecycleOwner, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, z11);
    }

    private final void e(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<w, b>> itDescendingIterator = this.observerMap.descendingIterator();
        s.j(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<w, b> next = itDescendingIterator.next();
            s.j(next, "next()");
            w key = next.getKey();
            b value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                Lifecycle.a aVarA = Lifecycle.a.INSTANCE.a(value.getState());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                n(aVarA.getTargetState());
                value.a(lifecycleOwner, aVarA);
                m();
            }
        }
    }

    private final Lifecycle.State f(w observer) {
        b value;
        Map.Entry<w, b> entryI = this.observerMap.i(observer);
        Lifecycle.State state = null;
        Lifecycle.State state2 = (entryI == null || (value = entryI.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.parentStates;
            state = arrayList.get(arrayList.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.b(companion.b(this.state, state2), state);
    }

    public static final y g(LifecycleOwner lifecycleOwner) {
        return INSTANCE.a(lifecycleOwner);
    }

    private final void h(String methodName) {
        if (!this.enforceMainThread || a0.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    private final void i(LifecycleOwner lifecycleOwner) {
        q.b<w, b>.d dVarD = this.observerMap.d();
        s.j(dVarD, "observerMap.iteratorWithAdditions()");
        while (dVarD.hasNext() && !this.newEventOccurred) {
            Map.Entry next = dVarD.next();
            w wVar = (w) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(wVar)) {
                n(bVar.getState());
                Lifecycle.a aVarC = Lifecycle.a.INSTANCE.c(bVar.getState());
                if (aVarC == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.a(lifecycleOwner, aVarC);
                m();
            }
        }
    }

    private final boolean k() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<w, b> entryA = this.observerMap.a();
        s.h(entryA);
        Lifecycle.State state = entryA.getValue().getState();
        Map.Entry<w, b> entryE = this.observerMap.e();
        s.h(entryE);
        Lifecycle.State state2 = entryE.getValue().getState();
        return state == state2 && this.state == state2;
    }

    private final void l(Lifecycle.State next) {
        Lifecycle.State state = this.state;
        if (state == next) {
            return;
        }
        if (state == Lifecycle.State.INITIALIZED && next == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + next + ", but was " + this.state + " in component " + this.lifecycleOwner.get()).toString());
        }
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        p();
        this.handlingEvent = false;
        if (this.state == Lifecycle.State.DESTROYED) {
            this.observerMap = new a<>();
        }
    }

    private final void m() {
        ArrayList<Lifecycle.State> arrayList = this.parentStates;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void n(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    private final void p() {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!k()) {
            this.newEventOccurred = false;
            Lifecycle.State state = this.state;
            Map.Entry<w, b> entryA = this.observerMap.a();
            s.h(entryA);
            if (state.compareTo(entryA.getValue().getState()) < 0) {
                e(lifecycleOwner);
            }
            Map.Entry<w, b> entryE = this.observerMap.e();
            if (!this.newEventOccurred && entryE != null && this.state.compareTo(entryE.getValue().getState()) > 0) {
                i(lifecycleOwner);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    @Override // androidx.p003lifecycle.Lifecycle
    public void a(w observer) {
        LifecycleOwner lifecycleOwner;
        s.k(observer, "observer");
        h("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        b bVar = new b(observer, state2);
        if (this.observerMap.g(observer, bVar) == null && (lifecycleOwner = this.lifecycleOwner.get()) != null) {
            boolean z11 = this.addingObserverCounter != 0 || this.handlingEvent;
            Lifecycle.State stateF = f(observer);
            this.addingObserverCounter++;
            while (bVar.getState().compareTo(stateF) < 0 && this.observerMap.contains(observer)) {
                n(bVar.getState());
                Lifecycle.a aVarC = Lifecycle.a.INSTANCE.c(bVar.getState());
                if (aVarC == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.a(lifecycleOwner, aVarC);
                m();
                stateF = f(observer);
            }
            if (!z11) {
                p();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.p003lifecycle.Lifecycle
    /* JADX INFO: renamed from: b, reason: from getter */
    public Lifecycle.State getState() {
        return this.state;
    }

    @Override // androidx.p003lifecycle.Lifecycle
    public void d(w observer) {
        s.k(observer, "observer");
        h("removeObserver");
        this.observerMap.h(observer);
    }

    public void j(Lifecycle.a event) {
        s.k(event, "event");
        h("handleLifecycleEvent");
        l(event.getTargetState());
    }

    public void o(Lifecycle.State state) {
        s.k(state, "state");
        h("setCurrentState");
        l(state);
    }

    private y(LifecycleOwner lifecycleOwner, boolean z11) {
        this.enforceMainThread = z11;
        this.observerMap = new a<>();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(lifecycleOwner);
        this._currentStateFlow = StateFlowKt.MutableStateFlow(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(LifecycleOwner provider) {
        this(provider, true);
        s.k(provider, "provider");
    }
}
