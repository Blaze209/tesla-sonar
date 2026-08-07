package hl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\f\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JQ\u0010\u001f\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001e0\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 JQ\u0010!\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001e0\u001aH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#JY\u0010%\u001a\u00020\u001d2H\u0010$\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001e0\u001aH\u0002¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\u00020\u001d2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0002¢\u0006\u0004\b(\u0010)J[\u0010+\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00052B\u0010*\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001eH\u0002¢\u0006\u0004\b+\u0010,J#\u0010-\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b2\u00101JN\u00103\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000524\u0010*\u001a0\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bø\u0001\u0000¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001dH\u0016¢\u0006\u0004\b5\u0010#R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b5\u00107\u001a\u0004\b8\u00109R\u001a\u0010>\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00010?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u0016\u0010C\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010BR\u0016\u0010D\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0018\u0010F\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010ER¬\u0001\u0010J\u001aF\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001e\u0018\u00010\u001a2J\u0010G\u001aF\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001e\u0018\u00010\u001a8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bH\u0010 \"\u0004\bI\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Lhl0/d;", "", "TSubject", "TContext", "", "Lhl0/h;", "phases", "<init>", "([Lhl0/h;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "subject", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lhl0/e;", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lhl0/e;", "phase", "Lhl0/c;", "e", "(Lhl0/h;)Lhl0/c;", "", "f", "(Lhl0/h;)I", "", IntegerTokenConverter.CONVERTER_KEY, "(Lhl0/h;)Z", "", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "b", "()Ljava/util/List;", "q", "n", "()V", "list", "m", "(Ljava/util/List;)V", "phaseContent", "p", "(Lhl0/c;)V", "block", "r", "(Lhl0/h;Lwn0/q;)Z", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reference", "j", "(Lhl0/h;Lhl0/h;)V", "k", "l", "(Lhl0/h;Lwn0/q;)V", "a", "Ldl0/b;", "Ldl0/b;", "getAttributes", "()Ldl0/b;", "attributes", "Z", "g", "()Z", "developmentMode", "", "Ljava/util/List;", "phasesRaw", "I", "interceptorsQuantity", "interceptorsListShared", "Lhl0/h;", "interceptorsListSharedPhase", "value", "h", "o", "interceptors", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class d<TSubject, TContext> {
    private volatile /* synthetic */ Object _interceptors;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dl0.b attributes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean developmentMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Object> phasesRaw;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int interceptorsQuantity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean interceptorsListShared;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Phase interceptorsListSharedPhase;

    public d(Phase... phases) {
        s.k(phases, "phases");
        this.attributes = dl0.d.a(true);
        this.phasesRaw = v.s(Arrays.copyOf(phases, phases.length));
        this._interceptors = null;
    }

    private final List<q<e<TSubject, TContext>, TSubject, Continuation<? super h0>, Object>> b() {
        int iO;
        int i11 = this.interceptorsQuantity;
        if (i11 == 0) {
            m(v.m());
            return v.m();
        }
        List<Object> list = this.phasesRaw;
        int i12 = 0;
        if (i11 == 1 && (iO = v.o(list)) >= 0) {
            int i13 = 0;
            while (true) {
                Object obj = list.get(i13);
                c<TSubject, TContext> cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && !cVar.h()) {
                    List<q<e<TSubject, TContext>, TSubject, Continuation<? super h0>, Object>> listI = cVar.i();
                    p(cVar);
                    return listI;
                }
                if (i13 == iO) {
                    break;
                }
                i13++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int iO2 = v.o(list);
        if (iO2 >= 0) {
            while (true) {
                Object obj2 = list.get(i12);
                c cVar2 = obj2 instanceof c ? (c) obj2 : null;
                if (cVar2 != null) {
                    cVar2.b(arrayList);
                }
                if (i12 == iO2) {
                    break;
                }
                i12++;
            }
        }
        m(arrayList);
        return arrayList;
    }

    private final e<TSubject, TContext> c(TContext context, TSubject subject, CoroutineContext coroutineContext) {
        return f.a(context, q(), subject, coroutineContext, getDevelopmentMode());
    }

    private final c<TSubject, TContext> e(Phase phase) {
        List<Object> list = this.phasesRaw;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj == phase) {
                c<TSubject, TContext> cVar = new c<>(phase, i.c.f73152a);
                list.set(i11, cVar);
                return cVar;
            }
            if (obj instanceof c) {
                c<TSubject, TContext> cVar2 = (c) obj;
                if (cVar2.getPhase() == phase) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final int f(Phase phase) {
        List<Object> list = this.phasesRaw;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj == phase || ((obj instanceof c) && ((c) obj).getPhase() == phase)) {
                return i11;
            }
        }
        return -1;
    }

    private final List<q<e<TSubject, TContext>, TSubject, Continuation<? super h0>, Object>> h() {
        return (List) this._interceptors;
    }

    private final boolean i(Phase phase) {
        List<Object> list = this.phasesRaw;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj == phase) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).getPhase() == phase) {
                return true;
            }
        }
        return false;
    }

    private final void m(List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super Continuation<? super h0>, ? extends Object>> list) {
        o(list);
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = null;
    }

    private final void n() {
        o(null);
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = null;
    }

    private final void o(List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super Continuation<? super h0>, ? extends Object>> list) {
        this._interceptors = list;
    }

    private final void p(c<TSubject, TContext> phaseContent) {
        o(phaseContent.i());
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = phaseContent.getPhase();
    }

    private final List<q<e<TSubject, TContext>, TSubject, Continuation<? super h0>, Object>> q() {
        if (h() == null) {
            b();
        }
        this.interceptorsListShared = true;
        List<q<e<TSubject, TContext>, TSubject, Continuation<? super h0>, Object>> listH = h();
        s.h(listH);
        return listH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean r(Phase phase, q<? super e<TSubject, TContext>, ? super TSubject, ? super Continuation<? super h0>, ? extends Object> block) {
        List<q<e<TSubject, TContext>, TSubject, Continuation<? super h0>, Object>> listH = h();
        if (this.phasesRaw.isEmpty() || listH == null || this.interceptorsListShared || !u0.p(listH)) {
            return false;
        }
        if (s.f(this.interceptorsListSharedPhase, phase)) {
            listH.add(block);
            return true;
        }
        if (!s.f(phase, v.A0(this.phasesRaw)) && f(phase) != v.o(this.phasesRaw)) {
            return false;
        }
        c<TSubject, TContext> cVarE = e(phase);
        s.h(cVarE);
        cVarE.a(block);
        listH.add(block);
        return true;
    }

    public final Object d(TContext tcontext, TSubject tsubject, Continuation<? super TSubject> continuation) {
        return c(tcontext, tsubject, continuation.getContext()).a(tsubject, continuation);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public final void j(Phase reference, Phase phase) throws b {
        i relation;
        Phase relativeTo;
        s.k(reference, "reference");
        s.k(phase, "phase");
        if (i(phase)) {
            return;
        }
        int iF = f(reference);
        if (iF == -1) {
            throw new b("Phase " + reference + " was not registered for this pipeline");
        }
        int i11 = iF + 1;
        int iO = v.o(this.phasesRaw);
        if (i11 <= iO) {
            while (true) {
                Object obj = this.phasesRaw.get(i11);
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null && (relation = cVar.getRelation()) != null) {
                    i.a aVar = relation instanceof i.a ? (i.a) relation : null;
                    if (aVar != null && (relativeTo = aVar.getRelativeTo()) != null && s.f(relativeTo, reference)) {
                        iF = i11;
                    }
                    if (i11 == iO) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    break;
                }
            }
        }
        this.phasesRaw.add(iF + 1, new c(phase, new i.a(reference)));
    }

    public final void k(Phase reference, Phase phase) throws b {
        s.k(reference, "reference");
        s.k(phase, "phase");
        if (i(phase)) {
            return;
        }
        int iF = f(reference);
        if (iF != -1) {
            this.phasesRaw.add(iF, new c(phase, new i.b(reference)));
            return;
        }
        throw new b("Phase " + reference + " was not registered for this pipeline");
    }

    public final void l(Phase phase, q<? super e<TSubject, TContext>, ? super TSubject, ? super Continuation<? super h0>, ? extends Object> block) {
        s.k(phase, "phase");
        s.k(block, "block");
        c<TSubject, TContext> cVarE = e(phase);
        if (cVarE == null) {
            throw new b("Phase " + phase + " was not registered for this pipeline");
        }
        if (r(phase, block)) {
            this.interceptorsQuantity++;
            return;
        }
        cVarE.a(block);
        this.interceptorsQuantity++;
        n();
        a();
    }

    public void a() {
    }
}
