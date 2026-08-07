package ec;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ic.SourceFetchResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001'BÃ\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u00124\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*RD\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R=\u00103\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010*R!\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b0\u0010*¨\u00065"}, d2 = {"Lec/h;", "", "", "Ljc/d;", "interceptors", "Lkotlin/Pair;", "Llc/c;", "Lco0/d;", "mappers", "Lkc/c;", "keyers", "Lkotlin/Function0;", "Lic/j$a;", "lazyFetcherFactories", "Lgc/k$a;", "lazyDecoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "Lrc/n;", "options", "j", "(Ljava/lang/Object;Lrc/n;)Ljava/lang/Object;", "Lec/r;", "imageLoader", "", "startIndex", "Lic/j;", "m", "(Ljava/lang/Object;Lrc/n;Lec/r;I)Lkotlin/Pair;", "Lic/o;", "result", "Lgc/k;", "l", "(Lic/o;Lrc/n;Lec/r;I)Lkotlin/Pair;", "Lec/h$a;", "k", "()Lec/h$a;", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "h", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lkotlin/Lazy;", "fetcherFactories", "decoderFactories", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<jc.d> interceptors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<lc.c<? extends Object, ? extends Object>, co0.d<? extends Object>>> mappers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<kc.c<? extends Object>, co0.d<? extends Object>>> keyers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<? extends wn0.a<? extends List<? extends Pair<? extends ic.j.a<? extends Object>, ? extends co0.d<? extends Object>>>>> lazyFetcherFactories;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<? extends wn0.a<? extends List<? extends gc.k.a>>> lazyDecoderFactories;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy fetcherFactories;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy decoderFactories;

    public /* synthetic */ h(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(h hVar) {
        List<? extends wn0.a<? extends List<? extends gc.k.a>>> list = hVar.lazyDecoderFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            p013kotlin.collections.v.E(arrayList, list.get(i11).invoke());
        }
        hVar.lazyDecoderFactories = p013kotlin.collections.v.m();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(h hVar) {
        List<? extends wn0.a<? extends List<? extends Pair<? extends ic.j.a<? extends Object>, ? extends co0.d<? extends Object>>>>> list = hVar.lazyFetcherFactories;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            p013kotlin.collections.v.E(arrayList, list.get(i11).invoke());
        }
        hVar.lazyFetcherFactories = p013kotlin.collections.v.m();
        return arrayList;
    }

    public final List<gc.k.a> e() {
        return (List) this.decoderFactories.getValue();
    }

    public final List<Pair<ic.j.a<? extends Object>, co0.d<? extends Object>>> f() {
        return (List) this.fetcherFactories.getValue();
    }

    public final List<jc.d> g() {
        return this.interceptors;
    }

    public final List<Pair<kc.c<? extends Object>, co0.d<? extends Object>>> h() {
        return this.keyers;
    }

    public final List<Pair<lc.c<? extends Object, ? extends Object>, co0.d<? extends Object>>> i() {
        return this.mappers;
    }

    public final Object j(Object data, Options options) {
        List<Pair<lc.c<? extends Object, ? extends Object>, co0.d<? extends Object>>> list = this.mappers;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Pair<lc.c<? extends Object, ? extends Object>, co0.d<? extends Object>> pair = list.get(i11);
            lc.c<? extends Object, ? extends Object> cVarA = pair.a();
            if (pair.b().j(data)) {
                p013kotlin.jvm.internal.s.i(cVarA, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                Object objA = cVarA.a(data, options);
                if (objA != null) {
                    data = objA;
                }
            }
        }
        return data;
    }

    public final a k() {
        return new a(this);
    }

    public final Pair<gc.k, Integer> l(SourceFetchResult result, Options options, r imageLoader, int startIndex) {
        int size = e().size();
        while (startIndex < size) {
            gc.k kVarA = e().get(startIndex).a(result, options, imageLoader);
            if (kVarA != null) {
                return jn0.x.a(kVarA, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    public final Pair<ic.j, Integer> m(Object data, Options options, r imageLoader, int startIndex) {
        int size = f().size();
        while (startIndex < size) {
            Pair<ic.j.a<? extends Object>, co0.d<? extends Object>> pair = f().get(startIndex);
            ic.j.a<? extends Object> aVarA = pair.a();
            if (pair.b().j(data)) {
                p013kotlin.jvm.internal.s.i(aVarA, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                ic.j jVarA = aVarA.a(data, options, imageLoader);
                if (jVarA != null) {
                    return jn0.x.a(jVarA, Integer.valueOf(startIndex));
                }
            }
            startIndex++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(List<? extends jc.d> list, List<? extends Pair<? extends lc.c<? extends Object, ? extends Object>, ? extends co0.d<? extends Object>>> list2, List<? extends Pair<? extends kc.c<? extends Object>, ? extends co0.d<? extends Object>>> list3, List<? extends wn0.a<? extends List<? extends Pair<? extends ic.j.a<? extends Object>, ? extends co0.d<? extends Object>>>>> list4, List<? extends wn0.a<? extends List<? extends gc.k.a>>> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.lazyFetcherFactories = list4;
        this.lazyDecoderFactories = list5;
        this.fetcherFactories = jn0.m.b(new wn0.a() { // from class: ec.b
            @Override // wn0.a
            public final Object invoke() {
                return h.d(this.f62459a);
            }
        });
        this.decoderFactories = jn0.m.b(new wn0.a() { // from class: ec.c
            @Override // wn0.a
            public final Object invoke() {
                return h.c(this.f62460a);
            }
        });
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001d\u001a\u00020\u00002.\u0010\u0017\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R@\u0010-\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R<\u00100\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)RH\u00103\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)R,\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)¨\u00067"}, d2 = {"Lec/h$a;", "", "<init>", "()V", "Lec/h;", "registry", "(Lec/h;)V", "Ljc/d;", "interceptor", IntegerTokenConverter.CONVERTER_KEY, "(Ljc/d;)Lec/h$a;", "T", "Llc/c;", "mapper", "Lco0/d;", "type", "k", "(Llc/c;Lco0/d;)Lec/h$a;", "Lkc/c;", "keyer", "j", "(Lkc/c;Lco0/d;)Lec/h$a;", "Lic/j$a;", "factory", "h", "(Lic/j$a;Lco0/d;)Lec/h$a;", "Lkotlin/Function0;", "", "Lkotlin/Pair;", "o", "(Lwn0/a;)Lec/h$a;", "Lgc/k$a;", "g", "(Lgc/k$a;)Lec/h$a;", "n", "p", "()Lec/h;", "", "a", "Ljava/util/List;", "getInterceptors$coil_core_release", "()Ljava/util/List;", "interceptors", "b", "getMappers$coil_core_release", "mappers", "c", "getKeyers$coil_core_release", "keyers", DateTokenConverter.CONVERTER_KEY, "r", "lazyFetcherFactories", "e", "q", "lazyDecoderFactories", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<jc.d> interceptors;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<lc.c<? extends Object, ?>, co0.d<? extends Object>>> mappers;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<kc.c<? extends Object>, co0.d<? extends Object>>> keyers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<wn0.a<List<Pair<ic.j.a<? extends Object>, co0.d<? extends Object>>>>> lazyFetcherFactories;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<wn0.a<List<gc.k.a>>> lazyDecoderFactories;

        public a() {
            this.interceptors = new ArrayList();
            this.mappers = new ArrayList();
            this.keyers = new ArrayList();
            this.lazyFetcherFactories = new ArrayList();
            this.lazyDecoderFactories = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List e(Pair pair) {
            return p013kotlin.collections.v.e(pair);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List f(gc.k.a aVar) {
            return p013kotlin.collections.v.e(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List l(gc.k.a aVar) {
            return p013kotlin.collections.v.e(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List m(ic.j.a aVar, co0.d dVar) {
            return p013kotlin.collections.v.e(jn0.x.a(aVar, dVar));
        }

        public final a g(final gc.k.a factory) {
            this.lazyDecoderFactories.add(new wn0.a() { // from class: ec.g
                @Override // wn0.a
                public final Object invoke() {
                    return h.a.l(factory);
                }
            });
            return this;
        }

        public final <T> a h(final ic.j.a<T> factory, final co0.d<T> type) {
            this.lazyFetcherFactories.add(new wn0.a() { // from class: ec.f
                @Override // wn0.a
                public final Object invoke() {
                    return h.a.m(factory, type);
                }
            });
            return this;
        }

        public final a i(jc.d interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        public final <T> a j(kc.c<T> keyer, co0.d<T> type) {
            this.keyers.add(jn0.x.a(keyer, type));
            return this;
        }

        public final <T> a k(lc.c<T, ?> mapper, co0.d<T> type) {
            this.mappers.add(jn0.x.a(mapper, type));
            return this;
        }

        public final a n(wn0.a<? extends List<? extends gc.k.a>> factory) {
            this.lazyDecoderFactories.add(factory);
            return this;
        }

        public final a o(wn0.a<? extends List<? extends Pair<? extends ic.j.a<? extends Object>, ? extends co0.d<? extends Object>>>> factory) {
            this.lazyFetcherFactories.add(factory);
            return this;
        }

        public final h p() {
            return new h(yc.d.c(this.interceptors), yc.d.c(this.mappers), yc.d.c(this.keyers), yc.d.c(this.lazyFetcherFactories), yc.d.c(this.lazyDecoderFactories), null);
        }

        public final List<wn0.a<List<gc.k.a>>> q() {
            return this.lazyDecoderFactories;
        }

        public final List<wn0.a<List<Pair<ic.j.a<? extends Object>, co0.d<? extends Object>>>>> r() {
            return this.lazyFetcherFactories;
        }

        public a(h hVar) {
            this.interceptors = p013kotlin.collections.v.p1(hVar.g());
            this.mappers = p013kotlin.collections.v.p1(hVar.i());
            this.keyers = p013kotlin.collections.v.p1(hVar.h());
            List<Pair<ic.j.a<? extends Object>, co0.d<? extends Object>>> listF = hVar.f();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                final Pair pair = (Pair) it.next();
                arrayList.add(new wn0.a() { // from class: ec.d
                    @Override // wn0.a
                    public final Object invoke() {
                        return h.a.e(pair);
                    }
                });
            }
            this.lazyFetcherFactories = arrayList;
            List<gc.k.a> listE = hVar.e();
            ArrayList arrayList2 = new ArrayList();
            for (final gc.k.a aVar : listE) {
                arrayList2.add(new wn0.a() { // from class: ec.e
                    @Override // wn0.a
                    public final Object invoke() {
                        return h.a.f(aVar);
                    }
                });
            }
            this.lazyDecoderFactories = arrayList2;
        }
    }

    public h() {
        this(p013kotlin.collections.v.m(), p013kotlin.collections.v.m(), p013kotlin.collections.v.m(), p013kotlin.collections.v.m(), p013kotlin.collections.v.m());
    }
}
