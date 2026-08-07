package r30;

import java.util.Calendar;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import w30.e0;
import w30.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lw30/l0;", "", "Lr30/d;", "c", "(Lw30/l0;)Lr30/d;", "Lkotlin/Function0;", "", "a", "Lwn0/a;", "timestampSupplier", "Lr30/e;", "b", "Lr30/e;", "fraudDetectionJsonParser", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final wn0.a<Long> f106947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f106948b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<Long> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f106949c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(Calendar.getInstance().getTimeInMillis());
        }
    }

    static {
        a aVar = a.f106949c;
        f106947a = aVar;
        f106948b = new e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FraudDetectionData c(l0<String> l0Var) {
        if (!l0Var.getIsOk()) {
            l0Var = null;
        }
        if (l0Var != null) {
            return f106948b.a(e0.a(l0Var));
        }
        return null;
    }
}
