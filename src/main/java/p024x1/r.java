package p024x1;

import a3.d;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.l;
import p020r2.l0;
import p020r2.o;
import wn0.p;
import z2.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0018R\u00020\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"Lx1/r;", "", "La3/d;", "saveableStateHolder", "Lkotlin/Function0;", "Lx1/t;", "itemProvider", "<init>", "(La3/d;Lwn0/a;)V", Action.KEY_ATTRIBUTE, "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "index", CMSAttributeTableGenerator.CONTENT_TYPE, "Ljn0/h0;", "b", "(ILjava/lang/Object;Ljava/lang/Object;)Lwn0/p;", "a", "La3/d;", "Lwn0/a;", DateTokenConverter.CONVERTER_KEY, "()Lwn0/a;", "", "Lx1/r$a;", "Ljava/util/Map;", "lambdasCache", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d saveableStateHolder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<t> itemProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, a> lambdasCache = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001a"}, d2 = {"Lx1/r$a;", "", "", "index", Action.KEY_ATTRIBUTE, CMSAttributeTableGenerator.CONTENT_TYPE, "<init>", "(Lx1/r;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "Ljn0/h0;", "c", "()Lwn0/p;", "a", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "b", "e", "<set-?>", "I", "f", "()I", DateTokenConverter.CONVERTER_KEY, "Lwn0/p;", "_content", "content", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object contentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private p<? super l, ? super Integer, h0> _content;

        /* JADX INFO: renamed from: x1.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class C2638a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ r f122654c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f122655d;

            /* JADX INFO: renamed from: x1.r$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
            static final class C2639a extends u implements wn0.l<l0, k0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f122656c;

                /* JADX INFO: renamed from: x1.r$a$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"x1/r$a$a$a$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class C2640a implements k0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a f122657a;

                    public C2640a(a aVar) {
                        this.f122657a = aVar;
                    }

                    @Override // p020r2.k0
                    public void dispose() {
                        this.f122657a._content = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2639a(a aVar) {
                    super(1);
                    this.f122656c = aVar;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final k0 invoke(l0 l0Var) {
                    return new C2640a(this.f122656c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2638a(r rVar, a aVar) {
                super(2);
                this.f122654c = rVar;
                this.f122655d = aVar;
            }

            public final void a(l lVar, int i11) {
                l lVar2;
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(1403994769, i11, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                }
                t tVarInvoke = this.f122654c.d().invoke();
                int index = this.f122655d.getIndex();
                if ((index >= tVarInvoke.a() || !s.f(tVarInvoke.c(index), this.f122655d.getKey())) && (index = tVarInvoke.b(this.f122655d.getKey())) != -1) {
                    this.f122655d.index = index;
                }
                int i12 = index;
                if (i12 != -1) {
                    lVar.o(-660479623);
                    lVar2 = lVar;
                    s.a(tVarInvoke, s0.a(this.f122654c.saveableStateHolder), i12, s0.a(this.f122655d.getKey()), lVar2, 0);
                    lVar2.l();
                } else {
                    lVar2 = lVar;
                    lVar2.o(-660272047);
                    lVar2.l();
                }
                Object key = this.f122655d.getKey();
                boolean zK = lVar2.K(this.f122655d);
                a aVar = this.f122655d;
                Object objI = lVar2.I();
                if (zK || objI == l.INSTANCE.a()) {
                    objI = new C2639a(aVar);
                    lVar2.B(objI);
                }
                Function0.c(key, (wn0.l) objI, lVar2, 0);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        public a(int i11, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i11;
        }

        private final p<l, Integer, h0> c() {
            return c.c(1403994769, true, new C2638a(r.this, this));
        }

        public final p<l, Integer, h0> d() {
            p pVar = this._content;
            if (pVar != null) {
                return pVar;
            }
            p<l, Integer, h0> pVarC = c();
            this._content = pVarC;
            return pVarC;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Object getContentType() {
            return this.contentType;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Object getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(d dVar, wn0.a<? extends t> aVar) {
        this.saveableStateHolder = dVar;
        this.itemProvider = aVar;
    }

    public final p<l, Integer, h0> b(int index, Object key, Object contentType) {
        a aVar = this.lambdasCache.get(key);
        if (aVar != null && aVar.getIndex() == index && s.f(aVar.getContentType(), contentType)) {
            return aVar.d();
        }
        a aVar2 = new a(index, key, contentType);
        this.lambdasCache.put(key, aVar2);
        return aVar2.d();
    }

    public final Object c(Object key) {
        if (key == null) {
            return null;
        }
        a aVar = this.lambdasCache.get(key);
        if (aVar != null) {
            return aVar.getContentType();
        }
        t tVarInvoke = this.itemProvider.invoke();
        int iB = tVarInvoke.b(key);
        if (iB != -1) {
            return tVarInvoke.d(iB);
        }
        return null;
    }

    public final wn0.a<t> d() {
        return this.itemProvider;
    }
}
