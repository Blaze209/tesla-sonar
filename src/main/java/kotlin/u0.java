package kotlin;

import android.view.KeyEvent;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import co0.h;
import o4.TextFieldValue;
import o4.f0;
import p007h2.h0;
import p007h2.k0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import t3.b;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/d;", "Lb2/b0;", "state", "Lh2/h0;", "manager", "Lo4/o0;", "value", "Lkotlin/Function1;", "Ljn0/h0;", "onValueChange", "", "editable", "singleLine", "Lo4/f0;", "offsetMapping", "Lb2/n1;", "undoManager", "Lo4/r;", "imeAction", "a", "(Landroidx/compose/ui/d;Lb2/b0;Lh2/h0;Lo4/o0;Lwn0/l;ZZLo4/f0;Lb2/n1;I)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u0 {

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<d, l, Integer, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0 f15894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h0 f15895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f15896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f15897f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f15898g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f15899h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ n1 f15900i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ wn0.l<TextFieldValue, jn0.h0> f15901j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f15902k;

        /* JADX INFO: renamed from: b2.u0$a$a, reason: collision with other inner class name */
        @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class C0295a extends p implements wn0.l<b, Boolean> {
            C0295a(Object obj) {
                super(1, obj, t0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public final Boolean a(KeyEvent keyEvent) {
                return Boolean.valueOf(((t0) this.receiver).l(keyEvent));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Boolean invoke(b bVar) {
                return a(bVar.getNativeKeyEvent());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b0 b0Var, h0 h0Var, TextFieldValue textFieldValue, boolean z11, boolean z12, f0 f0Var, n1 n1Var, wn0.l<? super TextFieldValue, jn0.h0> lVar, int i11) {
            super(3);
            this.f15894c = b0Var;
            this.f15895d = h0Var;
            this.f15896e = textFieldValue;
            this.f15897f = z11;
            this.f15898g = z12;
            this.f15899h = f0Var;
            this.f15900i = n1Var;
            this.f15901j = lVar;
            this.f15902k = i11;
        }

        public final d a(d dVar, l lVar, int i11) {
            lVar.o(851809892);
            if (o.J()) {
                o.S(851809892, i11, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
            }
            Object objI = lVar.I();
            l.Companion companion = l.INSTANCE;
            if (objI == companion.a()) {
                objI = new k0();
                lVar.B(objI);
            }
            k0 k0Var = (k0) objI;
            Object objI2 = lVar.I();
            if (objI2 == companion.a()) {
                objI2 = new k();
                lVar.B(objI2);
            }
            t0 t0Var = new t0(this.f15894c, this.f15895d, this.f15896e, this.f15897f, this.f15898g, k0Var, this.f15899h, this.f15900i, (k) objI2, null, this.f15901j, this.f15902k, 512, null);
            d.Companion companion2 = d.INSTANCE;
            boolean zK = lVar.K(t0Var);
            Object objI3 = lVar.I();
            if (zK || objI3 == companion.a()) {
                objI3 = new C0295a(t0Var);
                lVar.B(objI3);
            }
            d dVarA = androidx.compose.ui.input.key.a.a(companion2, (wn0.l) ((h) objI3));
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarA;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ d invoke(d dVar, l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    public static final d a(d dVar, b0 b0Var, h0 h0Var, TextFieldValue textFieldValue, wn0.l<? super TextFieldValue, jn0.h0> lVar, boolean z11, boolean z12, f0 f0Var, n1 n1Var, int i11) {
        return c.c(dVar, null, new a(b0Var, h0Var, textFieldValue, z11, z12, f0Var, n1Var, lVar, i11), 1, null);
    }
}
