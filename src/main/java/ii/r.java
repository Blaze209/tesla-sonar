package ii;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\u000f\u0013J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lii/r;", "", "Lii/r$c;", "E", "Lii/r$d;", Action.KEY_ATTRIBUTE, "a", "(Lii/r$d;)Lii/r$c;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lwn0/p;)Ljava/lang/Object;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Lii/r;)Lii/r;", "b", "(Lii/r$d;)Lii/r;", DateTokenConverter.CONVERTER_KEY, "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f78164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f78163b = m.f78152c;

    /* JADX INFO: renamed from: ii.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lii/r$a;", "", "<init>", "()V", "Lii/r;", "Empty", "Lii/r;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f78164a = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lii/r;", "acc", "Lii/r$c;", "element", "a", "(Lii/r;Lii/r$c;)Lii/r;"}, k = 3, mv = {1, 5, 1})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.p<r, c, r> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f78165c = new a();

            a() {
                super(2);
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke(r acc, c element) {
                p013kotlin.jvm.internal.s.k(acc, "acc");
                p013kotlin.jvm.internal.s.k(element, "element");
                r rVarB = acc.b(element.getKey());
                return rVarB == m.f78152c ? element : new h(rVarB, element);
            }
        }

        public static r a(r rVar, r context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            return context == m.f78152c ? rVar : (r) context.fold(rVar, a.f78165c);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lii/r$c;", "Lii/r;", "E", "Lii/r$d;", Action.KEY_ATTRIBUTE, "a", "(Lii/r$d;)Lii/r$c;", "getKey", "()Lii/r$d;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface c extends r {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a {
            public static <R> R a(c cVar, R r11, wn0.p<? super R, ? super c, ? extends R> operation) {
                p013kotlin.jvm.internal.s.k(operation, "operation");
                return operation.invoke(r11, cVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends c> E b(c cVar, d<E> key) {
                p013kotlin.jvm.internal.s.k(key, "key");
                if (!p013kotlin.jvm.internal.s.f(cVar.getKey(), key)) {
                    return null;
                }
                p013kotlin.jvm.internal.s.i(cVar, "null cannot be cast to non-null type E of com.apollographql.apollo3.api.ExecutionContext.Element.get");
                return cVar;
            }

            public static r c(c cVar, d<?> key) {
                p013kotlin.jvm.internal.s.k(key, "key");
                return p013kotlin.jvm.internal.s.f(cVar.getKey(), key) ? m.f78152c : cVar;
            }

            public static r d(c cVar, r context) {
                p013kotlin.jvm.internal.s.k(context, "context");
                return b.a(cVar, context);
            }
        }

        @Override // ii.r
        <E extends c> E a(d<E> key);

        d<?> getKey();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lii/r$d;", "Lii/r$c;", "E", "", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface d<E extends c> {
    }

    <E extends c> E a(d<E> key);

    r b(d<?> key);

    r c(r context);

    <R> R fold(R initial, wn0.p<? super R, ? super c, ? extends R> operation);
}
