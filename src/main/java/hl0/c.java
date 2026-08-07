package hl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\u0015Ba\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012H\u0010\u000e\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r0\b¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u0015\u001a\u00020\f2B\u0010\u0014\u001a>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r¢\u0006\u0004\b\u0015\u0010\u0016JW\u0010\u0018\u001a\u00020\f2H\u0010\u0017\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r0\b¢\u0006\u0004\b\u0018\u0010\u0019JO\u0010\u001a\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r0\b¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010\u001c\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r0\b¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%RX\u0010\u000e\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lhl0/c;", "", "TSubject", "Call", "Lhl0/h;", "phase", "Lhl0/i;", "relation", "", "Lkotlin/Function3;", "Lhl0/e;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "interceptors", "<init>", "(Lhl0/h;Lhl0/i;Ljava/util/List;)V", "(Lhl0/h;Lhl0/i;)V", DateTokenConverter.CONVERTER_KEY, "()V", "interceptor", "a", "(Lwn0/q;)V", "destination", "b", "(Ljava/util/List;)V", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "c", "", "toString", "()Ljava/lang/String;", "Lhl0/h;", "e", "()Lhl0/h;", "Lhl0/i;", "f", "()Lhl0/i;", "Ljava/util/List;", "", "Z", "getShared", "()Z", "setShared", "(Z)V", "shared", "h", "isEmpty", "", "g", "()I", "size", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c<TSubject, Call> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List<Object> f73136f = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Phase phase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i relation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<q<e<TSubject, Call>, TSubject, Continuation<? super h0>, Object>> interceptors;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean shared;

    public c(Phase phase, i relation, List<q<e<TSubject, Call>, TSubject, Continuation<? super h0>, Object>> interceptors) {
        s.k(phase, "phase");
        s.k(relation, "relation");
        s.k(interceptors, "interceptors");
        this.phase = phase;
        this.relation = relation;
        this.interceptors = interceptors;
        this.shared = true;
    }

    private final void d() {
        this.interceptors = c();
        this.shared = false;
    }

    public final void a(q<? super e<TSubject, Call>, ? super TSubject, ? super Continuation<? super h0>, ? extends Object> interceptor) {
        s.k(interceptor, "interceptor");
        if (this.shared) {
            d();
        }
        this.interceptors.add(interceptor);
    }

    public final void b(List<q<e<TSubject, Call>, TSubject, Continuation<? super h0>, Object>> destination) {
        s.k(destination, "destination");
        List<q<e<TSubject, Call>, TSubject, Continuation<? super h0>, Object>> list = this.interceptors;
        if (destination instanceof ArrayList) {
            ((ArrayList) destination).ensureCapacity(destination.size() + list.size());
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            destination.add(list.get(i11));
        }
    }

    public final List<q<e<TSubject, Call>, TSubject, Continuation<? super h0>, Object>> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.interceptors);
        return arrayList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Phase getPhase() {
        return this.phase;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final i getRelation() {
        return this.relation;
    }

    public final int g() {
        return this.interceptors.size();
    }

    public final boolean h() {
        return this.interceptors.isEmpty();
    }

    public final List<q<e<TSubject, Call>, TSubject, Continuation<? super h0>, Object>> i() {
        this.shared = true;
        return this.interceptors;
    }

    public String toString() {
        return "Phase `" + this.phase.getName() + "`, " + g() + " handlers";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Phase phase, i relation) {
        s.k(phase, "phase");
        s.k(relation, "relation");
        List<Object> list = f73136f;
        s.i(list, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>");
        this(phase, relation, u0.c(list));
        if (!list.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }
}
