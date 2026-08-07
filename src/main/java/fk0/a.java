package fk0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfk0/a;", "Ljp0/b;", "Lfk0/b;", "<init>", "()V", "", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements jp0.b, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f66028a = new a();

    /* JADX INFO: renamed from: fk0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "formatSequence", "", "arg", "a", "(Ljava/lang/String;D)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class C1348a extends u implements p<String, Double, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1348a f66029c = new C1348a();

        C1348a() {
            super(2);
        }

        public final String a(String formatSequence, double d11) {
            s.k(formatSequence, "formatSequence");
            String str = String.format(formatSequence, Double.valueOf(d11));
            s.j(str, "format(formatSequence, arg)");
            return str;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ String invoke(String str, Double d11) {
            return a(str, d11.doubleValue());
        }
    }

    private a() {
    }

    public String a(Object obj, Object obj2, p<? super String, ? super Double, String> pVar) {
        return b.a.b(this, obj, obj2, pVar);
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        return a(expression, data, C1348a.f66029c);
    }
}
