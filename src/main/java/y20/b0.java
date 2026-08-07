package y20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032(\u0010\t\u001a$\u0012\u001a\u0012\u00180\u0006R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\f2(\u0010\t\u001a$\u0012\u001a\u0012\u00180\u0006R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\r\u0010\u000e\u001aY\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00120\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"PropsT", "StateT", "OutputT", "", "name", "Lkotlin/Function1;", "Ly20/r$c;", "Ly20/r;", "Ljn0/h0;", "apply", "a", "(Ljava/lang/String;Lwn0/l;)Ly20/r;", "Lkotlin/Function0;", "b", "(Lwn0/a;Lwn0/l;)Ly20/r;", "props", "state", "Lkotlin/Pair;", "Ly20/v;", DateTokenConverter.CONVERTER_KEY, "(Ly20/r;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class b0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"PropsT", "StateT", "OutputT", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f124665c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f124665c = str;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f124665c;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001J)\u0010\u0004\u001a\u00020\u0003*\u00180\u0002R\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"y20/b0$b", "Ly20/r;", "Ly20/r$c;", "Ljn0/h0;", "a", "(Ly20/r$c;)V", "", "toString", "()Ljava/lang/String;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b<OutputT, PropsT, StateT> extends r<PropsT, StateT, OutputT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<r<? super PropsT, StateT, ? extends OutputT>.c, h0> f124666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<String> f124667d;

        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.l<? super r<? super PropsT, StateT, ? extends OutputT>.c, h0> lVar, wn0.a<String> aVar) {
            this.f124666c = lVar;
            this.f124667d = aVar;
        }

        @Override // y20.r
        public void a(r<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            p013kotlin.jvm.internal.s.k(cVar, "<this>");
            this.f124666c.invoke(cVar);
        }

        public String toString() {
            return "WorkflowAction(" + this.f124667d.invoke() + ")@" + hashCode();
        }
    }

    public static final <PropsT, StateT, OutputT> r<PropsT, StateT, OutputT> a(String name, wn0.l<? super r<? super PropsT, StateT, ? extends OutputT>.c, h0> apply) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(apply, "apply");
        return w.c(new a(name), apply);
    }

    public static final <PropsT, StateT, OutputT> r<PropsT, StateT, OutputT> b(wn0.a<String> name, wn0.l<? super r<? super PropsT, StateT, ? extends OutputT>.c, h0> apply) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(apply, "apply");
        return new b(apply, name);
    }

    public static /* synthetic */ r c(String str, wn0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        return w.b(str, lVar);
    }

    public static final <PropsT, StateT, OutputT> Pair<StateT, WorkflowOutput<OutputT>> d(r<? super PropsT, StateT, ? extends OutputT> rVar, PropsT propst, StateT statet) {
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        r<? super Object, StateT, ? extends Object>.c cVar = new r.c(rVar, propst, statet);
        rVar.a(cVar);
        return new Pair<>(cVar.c(), cVar.a());
    }
}
