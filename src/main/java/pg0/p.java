package pg0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg0/d4$e;", "Lzf0/q0$c;", "b", "(Lpg0/d4$e;)Lzf0/q0$c;", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102830a;

        static {
            int[] iArr = new int[IdConfig.e.values().length];
            try {
                iArr[IdConfig.e.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.e.FrontOrBack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102830a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zf0.q0.c b(IdConfig.e eVar) {
        int i11 = a.f102830a[eVar.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? zf0.q0.c.Back : zf0.q0.c.Front;
        }
        return zf0.q0.c.Front;
    }
}
