package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.x2;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import g4.v;
import g4.y;
import i4.SpanStyle;
import i4.TextLayoutInput;
import i4.TextLayoutResult;
import i4.n0;
import java.util.Arrays;
import java.util.List;
import jn0.h0;
import jn0.t;
import k3.g4;
import k3.p3;
import k3.t3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.s0;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.n3;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import w4.n;
import w4.q;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010%\u001a\u00020\u001d2\u0016\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010 \"\u0004\u0018\u00010\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001d0\"H\u0003¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001dH\u0007¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010*R/\u00105\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00108\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010,\u001a\u0004\b6\u0010*\"\u0004\b7\u0010\u0005R&\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001d0\"098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lb2/f1;", "", "Li4/d;", "initialText", "<init>", "(Li4/d;)V", "Landroidx/compose/ui/d;", "", "start", "end", "q", "(Landroidx/compose/ui/d;II)Landroidx/compose/ui/d;", "Li4/d$c;", "Li4/h;", "Landroidx/compose/foundation/text/LinkRange;", "range", "Lk3/g4;", "p", "(Li4/d$c;)Lk3/g4;", "Lk3/t3;", "n", "(Li4/d$c;)Lk3/t3;", "Li4/d0;", "other", "m", "(Li4/d0;Li4/d0;)Li4/d0;", "link", "Landroidx/compose/ui/platform/x2;", "uriHandler", "Ljn0/h0;", "l", "(Li4/h;Landroidx/compose/ui/platform/x2;)V", "", "keys", "Lkotlin/Function1;", "Lb2/j0;", "block", "c", "([Ljava/lang/Object;Lwn0/l;Lr2/l;I)V", "b", "(Lr2/l;I)V", "h", "()Li4/d;", "a", "Li4/d;", "getInitialText$foundation_release", "Li4/m0;", "<set-?>", "Lr2/p1;", "k", "()Li4/m0;", "o", "(Li4/m0;)V", "textLayoutResult", "j", "setText$foundation_release", "text", "Landroidx/compose/runtime/snapshots/k;", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/runtime/snapshots/k;", "annotators", "Lkotlin/Function0;", "", IntegerTokenConverter.CONVERTER_KEY, "()Lwn0/a;", "shouldMeasureLinks", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i4.d initialText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 textLayoutResult = s3.d(null, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private i4.d text;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<l<j0, h0>> annotators;

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15562c = new a();

        a() {
            super(1);
        }

        public final void a(y yVar) {
            v.z(yVar);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i4.d.Range<i4.h> f15564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ x2 f15565e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i4.d.Range<i4.h> range, x2 x2Var) {
            super(0);
            this.f15564d = range;
            this.f15565e = x2Var;
        }

        public final void b() {
            f1.this.l(this.f15564d.e(), this.f15565e);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f15566n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ c0 f15567o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ u1.l f15568p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c0 c0Var, u1.l lVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f15567o = c0Var;
            this.f15568p = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f15567o, this.f15568p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f15566n;
            if (i11 == 0) {
                t.b(obj);
                c0 c0Var = this.f15567o;
                u1.l lVar = this.f15568p;
                this.f15566n = 1;
                if (c0Var.e(lVar, this) == coroutine_suspended) {
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
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb2/j0;", "Ljn0/h0;", "a", "(Lb2/j0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<j0, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i4.d.Range<i4.h> f15570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c0 f15571e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i4.d.Range<i4.h> range, c0 c0Var) {
            super(1);
            this.f15570d = range;
            this.f15571e = c0Var;
        }

        public final void a(j0 j0Var) {
            n0 styles;
            n0 styles2;
            n0 styles3;
            f1 f1Var = f1.this;
            n0 styles4 = this.f15570d.e().getStyles();
            SpanStyle pressedStyle = null;
            SpanStyle spanStyleM = f1Var.m(f1Var.m(styles4 != null ? styles4.getStyle() : null, (!this.f15571e.f() || (styles3 = this.f15570d.e().getStyles()) == null) ? null : styles3.getFocusedStyle()), (!this.f15571e.g() || (styles2 = this.f15570d.e().getStyles()) == null) ? null : styles2.getHoveredStyle());
            if (this.f15571e.h() && (styles = this.f15570d.e().getStyles()) != null) {
                pressedStyle = styles.getPressedStyle();
            }
            SpanStyle spanStyleM2 = f1Var.m(spanStyleM, pressedStyle);
            if (spanStyleM2 != null) {
                i4.d.Range<i4.h> range = this.f15570d;
                j0Var.a(spanStyleM2, range.f(), range.d());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(j0 j0Var) {
            a(j0Var);
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15573d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11) {
            super(2);
            this.f15573d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f1.this.b(lVar, k2.a(this.f15573d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements l<l0, k0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<j0, h0> f15575d;

        @p013kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"b2/f1$f$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1 f15576a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f15577b;

            public a(f1 f1Var, l lVar) {
                this.f15576a = f1Var;
                this.f15577b = lVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f15576a.annotators.remove(this.f15577b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(l<? super j0, h0> lVar) {
            super(1);
            this.f15575d = lVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            f1.this.annotators.add(this.f15575d);
            return new a(f1.this, this.f15575d);
        }
    }

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object[] f15579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<j0, h0> f15580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15581f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Object[] objArr, l<? super j0, h0> lVar, int i11) {
            super(2);
            this.f15579d = objArr;
            this.f15580e = lVar;
            this.f15581f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f1 f1Var = f1.this;
            Object[] objArr = this.f15579d;
            f1Var.c(Arrays.copyOf(objArr, objArr.length), this.f15580e, lVar, k2.a(this.f15581f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"b2/f1$h", "Lk3/g4;", "Lj3/m;", "size", "Lw4/t;", "layoutDirection", "Lw4/d;", "density", "Lk3/p3;", "a", "(JLw4/t;Lw4/d;)Lk3/p3;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h implements g4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t3 f15582a;

        h(t3 t3Var) {
            this.f15582a = t3Var;
        }

        @Override // k3.g4
        public p3 a(long size, w4.t layoutDirection, w4.d density) {
            return new p3.a(this.f15582a);
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class i extends u implements wn0.a<Boolean> {
        i() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            TextLayoutInput layoutInput;
            i4.d text = f1.this.getText();
            TextLayoutResult textLayoutResultK = f1.this.k();
            return Boolean.valueOf(s.f(text, (textLayoutResultK == null || (layoutInput = textLayoutResultK.getLayoutInput()) == null) ? null : layoutInput.getText()));
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw4/n;", "b", "()J"}, k = 3, mv = {1, 8, 0})
    static final class j extends u implements wn0.a<n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w4.p f15584c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(w4.p pVar) {
            super(0);
            this.f15584c = pVar;
        }

        public final long b() {
            return this.f15584c.j();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ n invoke() {
            return n.b(b());
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw4/n;", "b", "()J"}, k = 3, mv = {1, 8, 0})
    static final class k extends u implements wn0.a<n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f15585c = new k();

        k() {
            super(0);
        }

        public final long b() {
            return n.INSTANCE.a();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ n invoke() {
            return n.b(b());
        }
    }

    public f1(i4.d dVar) {
        SpanStyle style;
        this.initialText = dVar;
        i4.d.a aVar = new i4.d.a(dVar);
        List<i4.d.Range<i4.h>> listD = dVar.d(0, dVar.length());
        int size = listD.size();
        for (int i11 = 0; i11 < size; i11++) {
            i4.d.Range<i4.h> range = listD.get(i11);
            n0 styles = range.e().getStyles();
            if (styles != null && (style = styles.getStyle()) != null) {
                aVar.c(style, range.f(), range.d());
            }
        }
        this.text = aVar.o();
        this.annotators = n3.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Object[] objArr, l<? super j0, h0> lVar, p020r2.l lVar2, int i11) {
        p020r2.l lVarV = lVar2.v(-2083052099);
        int i12 = (i11 & 48) == 0 ? (lVarV.K(lVar) ? 32 : 16) | i11 : i11;
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(this) ? 256 : 128;
        }
        lVarV.M(-416686647, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i12 |= lVarV.K(obj) ? 4 : 0;
        }
        lVarV.S();
        if ((i12 & 14) == 0) {
            i12 |= 2;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-2083052099, i12, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:253)");
            }
            s0 s0Var = new s0(2);
            s0Var.a(lVar);
            s0Var.b(objArr);
            Object[] objArrD = s0Var.d(new Object[s0Var.c()]);
            boolean zK = ((i12 & 112) == 32) | lVarV.K(this);
            Object objI = lVarV.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new f(lVar);
                lVarV.B(objI);
            }
            Function0.d(objArrD, (l) objI, lVarV, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(objArr, lVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(i4.h link, x2 uriHandler) {
        if (link instanceof i4.h.b) {
            link.a();
            try {
                uriHandler.a(((i4.h.b) link).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        } else if (link instanceof i4.h.a) {
            link.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpanStyle m(SpanStyle spanStyle, SpanStyle spanStyle2) {
        SpanStyle spanStyleX;
        return (spanStyle == null || (spanStyleX = spanStyle.x(spanStyle2)) == null) ? spanStyle2 : spanStyleX;
    }

    private final t3 n(i4.d.Range<i4.h> range) {
        t3 t3VarZ = null;
        if (!i().invoke().booleanValue()) {
            return null;
        }
        TextLayoutResult textLayoutResultK = k();
        if (textLayoutResultK != null) {
            t3VarZ = textLayoutResultK.z(range.f(), range.d());
            j3.i iVarD = textLayoutResultK.d(range.f());
            t3VarZ.f(j3.g.u(j3.h.a(textLayoutResultK.q(range.f()) == textLayoutResultK.q(range.d()) ? Math.min(textLayoutResultK.d(range.d() - 1).getLeft(), iVarD.getLeft()) : BitmapDescriptorFactory.HUE_RED, iVarD.getTop())));
        }
        return t3VarZ;
    }

    private final g4 p(i4.d.Range<i4.h> range) {
        t3 t3VarN = n(range);
        if (t3VarN != null) {
            return new h(t3VarN);
        }
        return null;
    }

    private final androidx.compose.ui.d q(androidx.compose.ui.d dVar, final int i11, final int i12) {
        return dVar.g(new l1(new m1() { // from class: b2.e1
            @Override // kotlin.m1
            public final j1 a(k1 k1Var) {
                return f1.r(this.f15521a, i11, i12, k1Var);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 r(f1 f1Var, int i11, int i12, k1 k1Var) {
        TextLayoutResult textLayoutResultK = f1Var.k();
        if (textLayoutResultK == null) {
            return k1Var.a(0, 0, k.f15585c);
        }
        w4.p pVarB = q.b(textLayoutResultK.z(i11, i12).getBounds());
        return k1Var.a(pVarB.k(), pVarB.e(), new j(pVarB));
    }

    public final void b(p020r2.l lVar, int i11) {
        int i12;
        androidx.compose.ui.d dVarA;
        p020r2.l lVarV = lVar.v(1154651354);
        int i13 = 2;
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(1154651354, i12, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:153)");
            }
            x2 x2Var = (x2) lVarV.U(z0.t());
            i4.d dVar = this.text;
            List<i4.d.Range<i4.h>> listD = dVar.d(0, dVar.length());
            int size = listD.size();
            int i14 = 0;
            while (i14 < size) {
                i4.d.Range<i4.h> range = listD.get(i14);
                if (range.f() != range.d()) {
                    lVarV.o(1383677450);
                    g4 g4VarP = p(range);
                    if (g4VarP == null || (dVarA = h3.e.a(androidx.compose.ui.d.INSTANCE, g4VarP)) == null) {
                        dVarA = androidx.compose.ui.d.INSTANCE;
                    }
                    Object objI = lVarV.I();
                    p020r2.l.Companion companion = p020r2.l.INSTANCE;
                    if (objI == companion.a()) {
                        objI = u1.k.a();
                        lVarV.B(objI);
                    }
                    u1.l lVar2 = (u1.l) objI;
                    androidx.compose.ui.d dVarD = g4.o.d(v3.t.b(androidx.compose.foundation.h.b(q(dVarA, range.f(), range.d()), lVar2, false, i13, null), v3.s.INSTANCE.b(), false, i13, null), false, a.f15562c, 1, null);
                    boolean zK = lVarV.K(this) | lVarV.n(range) | lVarV.K(x2Var);
                    Object objI2 = lVarV.I();
                    if (zK || objI2 == companion.a()) {
                        objI2 = new b(range, x2Var);
                        lVarV.B(objI2);
                    }
                    androidx.compose.foundation.layout.g.a(androidx.compose.foundation.d.f(dVarD, lVar2, null, false, null, null, null, null, null, (wn0.a) objI2, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), lVarV, 0);
                    if (g1.b(range.e().getStyles())) {
                        lVarV.o(1386435086);
                        lVarV.l();
                    } else {
                        lVarV.o(1384566902);
                        Object objI3 = lVarV.I();
                        if (objI3 == companion.a()) {
                            objI3 = new c0();
                            lVarV.B(objI3);
                        }
                        c0 c0Var = (c0) objI3;
                        Object objI4 = lVarV.I();
                        if (objI4 == companion.a()) {
                            objI4 = new c(c0Var, lVar2, null);
                            lVarV.B(objI4);
                        }
                        Function0.g(lVar2, (p) objI4, lVarV, 6);
                        Boolean boolValueOf = Boolean.valueOf(c0Var.g());
                        Boolean boolValueOf2 = Boolean.valueOf(c0Var.f());
                        Boolean boolValueOf3 = Boolean.valueOf(c0Var.h());
                        n0 styles = range.e().getStyles();
                        SpanStyle style = styles != null ? styles.getStyle() : null;
                        n0 styles2 = range.e().getStyles();
                        SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                        n0 styles3 = range.e().getStyles();
                        SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                        n0 styles4 = range.e().getStyles();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                        boolean zK2 = lVarV.K(this) | lVarV.n(range);
                        Object objI5 = lVarV.I();
                        if (zK2 || objI5 == companion.a()) {
                            objI5 = new d(range, c0Var);
                            lVarV.B(objI5);
                        }
                        c(objArr, (l) objI5, lVarV, (i12 << 6) & 896);
                        lVarV.l();
                    }
                    lVarV.l();
                } else {
                    lVarV.o(1386448974);
                    lVarV.l();
                }
                i14++;
                i13 = 2;
            }
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(i11));
        }
    }

    public final i4.d h() {
        i4.d dVarO;
        if (this.annotators.isEmpty()) {
            dVarO = this.text;
        } else {
            i4.d.a aVar = new i4.d.a(0, 1, null);
            aVar.g(this.initialText);
            j0 j0Var = new j0(aVar);
            SnapshotStateList<l<j0, h0>> snapshotStateList = this.annotators;
            int size = snapshotStateList.size();
            for (int i11 = 0; i11 < size; i11++) {
                snapshotStateList.get(i11).invoke(j0Var);
            }
            dVarO = aVar.o();
        }
        this.text = dVarO;
        return dVarO;
    }

    public final wn0.a<Boolean> i() {
        return new i();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final i4.d getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextLayoutResult k() {
        return (TextLayoutResult) this.textLayoutResult.getValue();
    }

    public final void o(TextLayoutResult textLayoutResult) {
        this.textLayoutResult.setValue(textLayoutResult);
    }
}
