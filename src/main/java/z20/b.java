package z20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;
import wn0.q;
import y20.Snapshot;
import y20.r;
import y20.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005Ji\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t2\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013JQ\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u0014\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ[\u0010\u001f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u00012\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u001e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u008d\u0001\u0010&\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\b\"\u0004\b\u0003\u0010!2\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00012\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020$22\u0010\u0018\u001a.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\t\u0012\u0004\u0012\u00028\u00030\u001e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010'J=\u0010)\u001a\u0004\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u001d\u001a\u00028\u00002\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00150(2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+¨\u0006,"}, d2 = {"Lz20/b;", "Ly20/t;", "", "interceptors", "<init>", "(Ljava/util/List;)V", "P", "S", Gender.OTHER, "Ly20/t$b;", "inner", "g", "(Ly20/t$b;Ly20/t$b;)Ly20/t$b;", "Lkotlinx/coroutines/CoroutineScope;", "workflowScope", "Ly20/t$c;", "session", "Ljn0/h0;", "c", "(Lkotlinx/coroutines/CoroutineScope;Ly20/t$c;)V", "props", "Ly20/i;", "snapshot", "Lkotlin/Function2;", "proceed", "a", "(Ljava/lang/Object;Ly20/i;Lwn0/p;Ly20/t$c;)Ljava/lang/Object;", "old", "new", "state", "Lkotlin/Function3;", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwn0/q;Ly20/t$c;)Ljava/lang/Object;", "R", "renderProps", "renderState", "Ly20/a;", CoreConstants.CONTEXT_SCOPE_VALUE, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;Ly20/a;Lwn0/q;Ly20/t$c;)Ljava/lang/Object;", "Lkotlin/Function1;", "b", "(Ljava/lang/Object;Lwn0/l;Ly20/t$c;)Ly20/i;", "Ljava/util/List;", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<t> interceptors;

    /* JADX INFO: Add missing generic type declarations: [P, S] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"P", "S", "props", "Ly20/i;", "snapshot", "a", "(Ljava/lang/Object;Ly20/i;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class a<P, S> extends u implements p<P, Snapshot, S> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f126559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<P, Snapshot, S> f126560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t.c f126561e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(t tVar, p<? super P, ? super Snapshot, ? extends S> pVar, t.c cVar) {
            super(2);
            this.f126559c = tVar;
            this.f126560d = pVar;
            this.f126561e = cVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke(P p11, Snapshot snapshot) {
            return (S) this.f126559c.a(p11, snapshot, this.f126560d, this.f126561e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, S] */
    /* JADX INFO: renamed from: z20.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "S", "P", "old", "new", "state", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C2743b<P, S> extends u implements q<P, P, S, S> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f126562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q<P, P, S, S> f126563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t.c f126564e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2743b(t tVar, q<? super P, ? super P, ? super S, ? extends S> qVar, t.c cVar) {
            super(3);
            this.f126562c = tVar;
            this.f126563d = qVar;
            this.f126564e = cVar;
        }

        @Override // wn0.q
        public final S invoke(P p11, P p12, S s11) {
            return (S) this.f126562c.e(p11, p12, s11, this.f126563d, this.f126564e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, R, S, O] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P", "S", Gender.OTHER, "R", "props", "state", "Ly20/t$b;", "outerContextInterceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ly20/t$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class c<O, P, R, S> extends u implements q<P, S, t.b<P, S, O>, R> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f126565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y20.a<P, S, O> f126566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t.c f126567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f126568f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<P, S, t.b<P, S, O>, R> f126569g;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"P", "S", Gender.OTHER, "R", "p", "s", "Ly20/t$b;", "innerContextInterceptor", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ly20/t$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        static final class a extends u implements q<P, S, t.b<P, S, O>, R> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f126570c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ t.b<P, S, O> f126571d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ q<P, S, t.b<P, S, O>, R> f126572e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b bVar, t.b<P, S, O> bVar2, q<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> qVar) {
                super(3);
                this.f126570c = bVar;
                this.f126571d = bVar2;
                this.f126572e = qVar;
            }

            @Override // wn0.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final R invoke(P p11, S s11, t.b<P, S, O> bVar) {
                return this.f126572e.invoke(p11, s11, this.f126570c.g(this.f126571d, bVar));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(t tVar, y20.a<? extends P, S, ? super O> aVar, t.c cVar, b bVar, q<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> qVar) {
            super(3);
            this.f126565c = tVar;
            this.f126566d = aVar;
            this.f126567e = cVar;
            this.f126568f = bVar;
            this.f126569g = qVar;
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R invoke(P p11, S s11, t.b<P, S, O> bVar) {
            return (R) this.f126565c.d(p11, s11, this.f126566d, new a(this.f126568f, bVar, this.f126569g), this.f126567e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "state", "Ly20/i;", "b", "(Ljava/lang/Object;)Ly20/i;"}, k = 3, mv = {1, 6, 0})
    static final class d<S> extends u implements wn0.l<S, Snapshot> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f126573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<S, Snapshot> f126574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ t.c f126575e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(t tVar, wn0.l<? super S, Snapshot> lVar, t.c cVar) {
            super(1);
            this.f126573c = tVar;
            this.f126574d = lVar;
            this.f126575e = cVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Snapshot invoke(S s11) {
            return this.f126573c.b(s11, this.f126574d, this.f126575e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [P, S, O] */
    @Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001JO\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00022$\u0010\u0006\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJÇ\u0001\u0010\u0013\u001a\u00028\u0005\"\u0004\b\u0003\u0010\t\"\u0004\b\u0004\u0010\n\"\u0004\b\u0005\u0010\u000b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f2\u0006\u0010\u000e\u001a\u00028\u00032\u0006\u0010\u0010\u001a\u00020\u000f2$\u0010\u0011\u001a \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00020\u00042T\u0010\u0006\u001aP\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u000f\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00020\u0004\u0012\u0004\u0012\u00028\u00050\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014Jh\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00042.\u0010\u0006\u001a*\u0012\u0004\u0012\u00020\u000f\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0004\u0012\u0004\u0012\u00020\u00050\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR/\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00018\u0006¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"z20/b$e", "Ly20/t$b;", "Ly20/r;", "action", "Lkotlin/Function1;", "Ljn0/h0;", "proceed", "b", "(Ly20/r;Lwn0/l;)V", "CP", "CO", "CR", "Ly20/q;", "child", "childProps", "", Action.KEY_ATTRIBUTE, "handler", "Lkotlin/Function4;", "c", "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;Lwn0/r;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "", "sideEffect", "Lkotlin/Function2;", "a", "(Ljava/lang/String;Lwn0/l;Lwn0/p;)V", "Ly20/t$b;", "getOuter", "()Ly20/t$b;", "getOuter$annotations", "()V", "outer", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class e<O, P, S> implements t.b<P, S, O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final t.b<P, S, O> outer;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t.b<P, S, O> f126577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t.b<P, S, O> f126578c;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"P", "S", Gender.OTHER, "Ly20/r;", "interceptedAction", "Ljn0/h0;", "a", "(Ly20/r;)V"}, k = 3, mv = {1, 6, 0})
        static final class a extends u implements wn0.l<r<? super P, S, ? extends O>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ t.b<P, S, O> f126579c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.l<r<? super P, S, ? extends O>, h0> f126580d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(t.b<P, S, O> bVar, wn0.l<? super r<? super P, S, ? extends O>, h0> lVar) {
                super(1);
                this.f126579c = bVar;
                this.f126580d = lVar;
            }

            public final void a(r<? super P, S, ? extends O> interceptedAction) {
                s.k(interceptedAction, "interceptedAction");
                this.f126579c.b(interceptedAction, this.f126580d);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
                a((r) obj);
                return h0.f84049a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [CO, CP, CR] */
        /* JADX INFO: renamed from: z20.b$e$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\f0\u000bH\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"CP", "CO", "CR", "P", "S", Gender.OTHER, "Ly20/q;", "c", "p", "", "k", "Lkotlin/Function1;", "Ly20/r;", "h", "a", "(Ly20/q;Ljava/lang/Object;Ljava/lang/String;Lwn0/l;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        static final class C2744b<CO, CP, CR> extends u implements wn0.r<y20.q<? super CP, ? extends CO, ? extends CR>, CP, String, wn0.l<? super CO, ? extends r<? super P, S, ? extends O>>, CR> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ t.b<P, S, O> f126581c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.r<y20.q<? super CP, ? extends CO, ? extends CR>, CP, String, wn0.l<? super CO, ? extends r<? super P, S, ? extends O>>, CR> f126582d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2744b(t.b<P, S, O> bVar, wn0.r<? super y20.q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super wn0.l<? super CO, ? extends r<? super P, S, ? extends O>>, ? extends CR> rVar) {
                super(4);
                this.f126581c = bVar;
                this.f126582d = rVar;
            }

            @Override // wn0.r
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CR invoke(y20.q<? super CP, ? extends CO, ? extends CR> c11, CP cp2, String k11, wn0.l<? super CO, ? extends r<? super P, S, ? extends O>> h11) {
                s.k(c11, "c");
                s.k(k11, "k");
                s.k(h11, "h");
                return (CR) this.f126581c.c(c11, cp2, k11, h11, this.f126582d);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"P", "S", Gender.OTHER, "", "iKey", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "iSideEffect", "a", "(Ljava/lang/String;Lwn0/l;)V"}, k = 3, mv = {1, 6, 0})
        static final class c extends u implements p<String, wn0.l<? super Continuation<? super h0>, ? extends Object>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ t.b<P, S, O> f126583c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p<String, wn0.l<? super Continuation<? super h0>, ? extends Object>, h0> f126584d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(t.b<P, S, O> bVar, p<? super String, ? super wn0.l<? super Continuation<? super h0>, ? extends Object>, h0> pVar) {
                super(2);
                this.f126583c = bVar;
                this.f126584d = pVar;
            }

            public final void a(String iKey, wn0.l<? super Continuation<? super h0>, ? extends Object> iSideEffect) {
                s.k(iKey, "iKey");
                s.k(iSideEffect, "iSideEffect");
                this.f126583c.a(iKey, iSideEffect, this.f126584d);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(String str, wn0.l<? super Continuation<? super h0>, ? extends Object> lVar) {
                a(str, lVar);
                return h0.f84049a;
            }
        }

        e(t.b<P, S, O> bVar, t.b<P, S, O> bVar2) {
            this.f126577b = bVar;
            this.f126578c = bVar2;
            s.h(bVar);
            this.outer = bVar;
        }

        @Override // y20.t.b
        public void a(String key, wn0.l<? super Continuation<? super h0>, ? extends Object> sideEffect, p<? super String, ? super wn0.l<? super Continuation<? super h0>, ? extends Object>, h0> proceed) {
            s.k(key, "key");
            s.k(sideEffect, "sideEffect");
            s.k(proceed, "proceed");
            this.outer.a(key, sideEffect, new c(this.f126578c, proceed));
        }

        @Override // y20.t.b
        public void b(r<? super P, S, ? extends O> action, wn0.l<? super r<? super P, S, ? extends O>, h0> proceed) {
            s.k(action, "action");
            s.k(proceed, "proceed");
            this.outer.b(action, new a(this.f126578c, proceed));
        }

        @Override // y20.t.b
        public <CP, CO, CR> CR c(y20.q<? super CP, ? extends CO, ? extends CR> child, CP childProps, String key, wn0.l<? super CO, ? extends r<? super P, S, ? extends O>> handler, wn0.r<? super y20.q<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super wn0.l<? super CO, ? extends r<? super P, S, ? extends O>>, ? extends CR> proceed) {
            s.k(child, "child");
            s.k(key, "key");
            s.k(handler, "handler");
            s.k(proceed, "proceed");
            return (CR) this.outer.c(child, childProps, key, handler, new C2744b(this.f126578c, proceed));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends t> interceptors) {
        s.k(interceptors, "interceptors");
        this.interceptors = interceptors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <P, S, O> t.b<P, S, O> g(t.b<P, S, O> bVar, t.b<P, S, O> bVar2) {
        if (bVar == null && bVar2 == null) {
            return null;
        }
        if (bVar == null) {
            return bVar2;
        }
        return bVar2 == null ? bVar : new e(bVar, bVar2);
    }

    @Override // y20.t
    public <P, S> S a(P props, Snapshot snapshot, p<? super P, ? super Snapshot, ? extends S> proceed, t.c session) {
        s.k(proceed, "proceed");
        s.k(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new a(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(props, snapshot);
    }

    @Override // y20.t
    public <S> Snapshot b(S state, wn0.l<? super S, Snapshot> proceed, t.c session) {
        s.k(proceed, "proceed");
        s.k(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new d(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(state);
    }

    @Override // y20.t
    public void c(CoroutineScope workflowScope, t.c session) {
        s.k(workflowScope, "workflowScope");
        s.k(session, "session");
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((t) it.next()).c(workflowScope, session);
        }
    }

    @Override // y20.t
    public <P, S, O, R> R d(P renderProps, S renderState, y20.a<? extends P, S, ? super O> context, q<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> proceed, t.c session) {
        s.k(context, "context");
        s.k(proceed, "proceed");
        s.k(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            q<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> cVar = proceed;
            while (listIterator.hasPrevious()) {
                cVar = new c(listIterator.previous(), context, session, this, cVar);
            }
            proceed = cVar;
        }
        return proceed.invoke(renderProps, renderState, null);
    }

    @Override // y20.t
    public <P, S> S e(P old, P p11, S state, q<? super P, ? super P, ? super S, ? extends S> proceed, t.c session) {
        s.k(proceed, "proceed");
        s.k(session, "session");
        List<t> list = this.interceptors;
        if (!list.isEmpty()) {
            ListIterator<t> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                proceed = new C2743b(listIterator.previous(), proceed, session);
            }
        }
        return proceed.invoke(old, p11, state);
    }
}
