package r60;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import wn0.p;
import z2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f107053a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p<l, Integer, h0> f107054b = c.c(-1700090362, false, C2277a.f107055c);

    /* JADX INFO: renamed from: r60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class C2277a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2277a f107055c = new C2277a();

        C2277a() {
            super(2);
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1700090362, i11, -1, "com.stripe.android.link.utils.ComposableSingletons$InlineContentTemplateBuilderKt.lambda-1.<anonymous> (InlineContentTemplateBuilder.kt:46)");
            }
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

    public final p<l, Integer, h0> a() {
        return f107054b;
    }
}
