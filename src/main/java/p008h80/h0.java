package p008h80;

import n70.u;
import n70.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import w80.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh80/h0;", "", "<init>", "()V", "", "hasBackStack", "isLiveMode", "Lh80/g0$a;", "editable", "Lh80/g0;", "a", "(ZZLh80/g0$a;)Lh80/g0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f71089a = new h0();

    private h0() {
    }

    public final PaymentSheetTopBarState a(boolean hasBackStack, boolean isLiveMode, PaymentSheetTopBarState.a editable) {
        wn0.a<jn0.h0> aVarB;
        s.k(editable, "editable");
        int i11 = hasBackStack ? u.f93475g : u.f93486r;
        int i12 = hasBackStack ? n.f121502c : x.F;
        boolean z11 = !isLiveMode;
        boolean z12 = editable instanceof PaymentSheetTopBarState.a.Maybe;
        PaymentSheetTopBarState.a.Maybe maybe = z12 ? (PaymentSheetTopBarState.a.Maybe) editable : null;
        boolean z13 = false;
        boolean z14 = maybe != null && maybe.getCanEdit();
        PaymentSheetTopBarState.a.Maybe maybe2 = z12 ? (PaymentSheetTopBarState.a.Maybe) editable : null;
        if (maybe2 != null && maybe2.getIsEditing()) {
            z13 = true;
        }
        PaymentSheetTopBarState.a.Maybe maybe3 = z12 ? (PaymentSheetTopBarState.a.Maybe) editable : null;
        if (maybe3 == null || (aVarB = maybe3.b()) == null) {
            aVarB = a.f71090c;
        }
        return new PaymentSheetTopBarState(i11, i12, z11, z14, z13, aVarB);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f71090c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }

        public final void b() {
        }
    }
}
