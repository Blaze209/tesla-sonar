package z80;

import android.util.Log;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lz80/r1;", "", "<init>", "()V", "", "str", "Ljn0/s;", "", "Lz80/g2;", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "Lwo0/b;", "b", "Lwo0/b;", "format", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f127742a = new r1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final wo0.b format = wo0.u.b(null, a.f127745c, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f127744c = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwo0/d;", "Ljn0/h0;", "a", "(Lwo0/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<wo0.d, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f127745c = new a();

        a() {
            super(1);
        }

        public final void a(wo0.d Json) {
            p013kotlin.jvm.internal.s.k(Json, "$this$Json");
            Json.h(true);
            Json.c("#class");
            Json.d(true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(wo0.d dVar) {
            a(dVar);
            return jn0.h0.f84049a;
        }
    }

    private r1() {
    }

    public final Object a(String str) {
        Object objB;
        p013kotlin.jvm.internal.s.k(str, "str");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b((List) format.d(new vo0.e(SharedDataSpec.INSTANCE.serializer()), str));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            Log.w("STRIPE", "Error parsing LPMs", thE);
        }
        return objB;
    }
}
