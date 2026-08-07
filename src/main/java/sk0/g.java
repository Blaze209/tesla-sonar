package sk0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpl0/a;", "", "c", "(Lpl0/a;)Z", "a", "Lpl0/a;", "DEFAULT_CLOSE_REASON_ERROR", "ktor-client-okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final pl0.a f111408a = new pl0.a(pl0.a.EnumC2192a.INTERNAL_ERROR, "Client failure");

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(pl0.a aVar) {
        pl0.a.EnumC2192a enumC2192aA = pl0.a.EnumC2192a.INSTANCE.a(aVar.getCode());
        return enumC2192aA == null || enumC2192aA == pl0.a.EnumC2192a.CLOSED_ABNORMALLY;
    }
}
