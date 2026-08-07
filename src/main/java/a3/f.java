package a3;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"La3/d;", "a", "(Lr2/l;I)La3/d;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La3/e;", "b", "()La3/e;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f94c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e(null, 1, null);
        }
    }

    public static final d a(p020r2.l lVar, int i11) {
        if (o.J()) {
            o.S(15454635, i11, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:60)");
        }
        lVar.o(-796080049);
        e eVar = (e) b.c(new Object[0], e.INSTANCE.a(), null, a.f94c, lVar, 3072, 4);
        eVar.i((g) lVar.U(i.d()));
        lVar.l();
        if (o.J()) {
            o.R();
        }
        return eVar;
    }
}
