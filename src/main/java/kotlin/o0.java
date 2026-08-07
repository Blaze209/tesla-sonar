package kotlin;

import androidx.compose.ui.d;
import androidx.compose.ui.platform.m3;
import androidx.compose.ui.platform.z0;
import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import ezvcard.property.Gender;
import i4.TextLayoutResult;
import i4.p0;
import j3.m;
import jn0.h0;
import jn0.t;
import k3.SolidColor;
import k3.h1;
import kotlinx.coroutines.CoroutineScope;
import m3.c;
import m3.f;
import o4.TextFieldValue;
import o4.f0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p019p1.i;
import p019p1.j;
import p019p1.r0;
import p020r2.Function0;
import p020r2.l;
import p020r2.o;
import w4.h;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/d;", "Lb2/b0;", "state", "Lo4/o0;", "value", "Lo4/f0;", "offsetMapping", "Lk3/h1;", "cursorBrush", "", "enabled", "a", "(Landroidx/compose/ui/d;Lb2/b0;Lo4/o0;Lo4/f0;Lk3/h1;Z)Landroidx/compose/ui/d;", "Lp1/i;", "", "Lp1/i;", "cursorAnimationSpec", "Lw4/h;", "b", Gender.FEMALE, "()F", "DefaultCursorThickness", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i<Float> f15824a = j.e(j.f(b.f15837c), null, 0, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f15825b = h.g(2);

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements q<d, l, Integer, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h1 f15826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f15827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f15828e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f15829f;

        /* JADX INFO: renamed from: b2.o0$a$a, reason: collision with other inner class name */
        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
        static final class C0292a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f15830n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ e2.i f15831o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0292a(e2.i iVar, Continuation<? super C0292a> continuation) {
                super(2, continuation);
                this.f15831o = iVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C0292a(this.f15831o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f15830n;
                if (i11 == 0) {
                    t.b(obj);
                    e2.i iVar = this.f15831o;
                    this.f15830n = 1;
                    if (iVar.e(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C0292a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/c;", "Ljn0/h0;", "a", "(Lm3/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements wn0.l<c, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e2.i f15832c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f0 f15833d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ TextFieldValue f15834e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b0 f15835f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ h1 f15836g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e2.i iVar, f0 f0Var, TextFieldValue textFieldValue, b0 b0Var, h1 h1Var) {
                super(1);
                this.f15832c = iVar;
                this.f15833d = f0Var;
                this.f15834e = textFieldValue;
                this.f15835f = b0Var;
                this.f15836g = h1Var;
            }

            public final void a(c cVar) {
                j3.i iVar;
                TextLayoutResult value;
                cVar.M0();
                float fC = this.f15832c.c();
                if (fC == BitmapDescriptorFactory.HUE_RED) {
                    return;
                }
                int iOriginalToTransformed = this.f15833d.originalToTransformed(p0.n(this.f15834e.getSelection()));
                c1 c1VarJ = this.f15835f.j();
                if (c1VarJ == null || (value = c1VarJ.getValue()) == null || (iVar = value.e(iOriginalToTransformed)) == null) {
                    iVar = new j3.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                float fO1 = cVar.O1(o0.b());
                float f11 = fO1 / 2;
                float fE = n.e(n.i(iVar.getLeft() + f11, m.k(cVar.b()) - f11), f11);
                f.I1(cVar, this.f15836g, j3.h.a(fE, iVar.getTop()), j3.h.a(fE, iVar.getBottom()), fO1, 0, null, fC, null, 0, 432, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(c cVar) {
                a(cVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h1 h1Var, b0 b0Var, TextFieldValue textFieldValue, f0 f0Var) {
            super(3);
            this.f15826c = h1Var;
            this.f15827d = b0Var;
            this.f15828e = textFieldValue;
            this.f15829f = f0Var;
        }

        public final d a(d dVar, l lVar, int i11) {
            d dVarD;
            lVar.o(-84507373);
            if (o.J()) {
                o.S(-84507373, i11, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
            }
            Object objI = lVar.I();
            l.Companion companion = l.INSTANCE;
            if (objI == companion.a()) {
                objI = new e2.i();
                lVar.B(objI);
            }
            e2.i iVar = (e2.i) objI;
            h1 h1Var = this.f15826c;
            boolean z11 = ((h1Var instanceof SolidColor) && ((SolidColor) h1Var).getValue() == 16) ? false : true;
            if (((m3) lVar.U(z0.v())).a() && this.f15827d.e() && p0.h(this.f15828e.getSelection()) && z11) {
                lVar.o(808320157);
                i4.d text = this.f15828e.getText();
                p0 p0VarB = p0.b(this.f15828e.getSelection());
                boolean zK = lVar.K(iVar);
                Object objI2 = lVar.I();
                if (zK || objI2 == companion.a()) {
                    objI2 = new C0292a(iVar, null);
                    lVar.B(objI2);
                }
                Function0.f(text, p0VarB, (p) objI2, lVar, 0);
                boolean zK2 = lVar.K(iVar) | lVar.K(this.f15829f) | lVar.n(this.f15828e) | lVar.K(this.f15827d) | lVar.n(this.f15826c);
                f0 f0Var = this.f15829f;
                TextFieldValue textFieldValue = this.f15828e;
                b0 b0Var = this.f15827d;
                h1 h1Var2 = this.f15826c;
                Object objI3 = lVar.I();
                if (zK2 || objI3 == companion.a()) {
                    objI3 = new b(iVar, f0Var, textFieldValue, b0Var, h1Var2);
                    lVar.B(objI3);
                }
                dVarD = androidx.compose.ui.draw.b.d(dVar, (wn0.l) objI3);
                lVar.l();
            } else {
                lVar.o(809534830);
                lVar.l();
                dVarD = d.INSTANCE;
            }
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarD;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ d invoke(d dVar, l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/r0$b;", "", "Ljn0/h0;", "a", "(Lp1/r0$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<r0.b<Float>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f15837c = new b();

        b() {
            super(1);
        }

        public final void a(r0.b<Float> bVar) {
            bVar.e(1000);
            Float fValueOf = Float.valueOf(1.0f);
            bVar.g(fValueOf, 0);
            bVar.g(fValueOf, DownloaderService.STATUS_DEVICE_NOT_FOUND_ERROR);
            Float fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            bVar.g(fValueOf2, 500);
            bVar.g(fValueOf2, 999);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(r0.b<Float> bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    public static final d a(d dVar, b0 b0Var, TextFieldValue textFieldValue, f0 f0Var, h1 h1Var, boolean z11) {
        return z11 ? androidx.compose.ui.c.c(dVar, null, new a(h1Var, b0Var, textFieldValue, f0Var), 1, null) : dVar;
    }

    public static final float b() {
        return f15825b;
    }
}
