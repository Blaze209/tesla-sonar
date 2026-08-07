package p010i90;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import androidx.compose.ui.platform.s2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import i4.p0;
import i4.q0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.KeyboardOptions;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o4.TextFieldValue;
import o4.z0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.e1;
import p009i2.j1;
import p009i2.n2;
import p009i2.o2;
import p009i2.w1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.Function0;
import p020r2.d4;
import p020r2.e2;
import p020r2.g2;
import p020r2.h2;
import p020r2.k2;
import p020r2.n3;
import p020r2.p1;
import p020r2.s3;
import p020r2.w2;
import p020r2.y2;
import p020r2.y3;
import q1.t0;
import z3.i0;

/* JADX INFO: renamed from: i90.b2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001ab\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aj\u0010\u0019\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a©\u0001\u0010-\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u00012\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b-\u0010.\u001a%\u00102\u001a\u00020\u00022\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u001d\u001a\u00020\u000bH\u0007¢\u0006\u0004\b2\u00103\u001a\u0019\u00105\u001a\u0002042\b\b\u0002\u0010#\u001a\u00020\u000bH\u0007¢\u0006\u0004\b5\u00106\u001a)\u00107\u001a\u00020\u00022\u0006\u0010!\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b7\u00108\u001a3\u0010;\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010\u001d\u001a\u00020\u000b2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\b;\u0010<\u001a.\u0010@\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a/\u0010C\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\bC\u0010D\u001a)\u0010G\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000b0EH\u0002¢\u0006\u0004\bG\u0010H\u001a#\u0010K\u001a\u00020\u0005*\u00020\u00052\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010IH\u0002¢\u0006\u0004\bK\u0010L\",\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00000M8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010N\u001a\u0004\bO\u0010P\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\²\u0006\u000e\u0010S\u001a\u0004\u0018\u00010R8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010!\u001a\u0004\u0018\u00010 8\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010T\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010U\u001a\u0004\u0018\u00010\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010V\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\nX\u008a\u0084\u0002²\u0006\u0010\u0010X\u001a\u0004\u0018\u00010W8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010Y\u001a\u0004\u0018\u00010W8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010Z\u001a\u0002008\nX\u008a\u0084\u0002²\u0006\u000e\u0010[\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "", "Ljn0/h0;", "G", "()Lwn0/l;", "Landroidx/compose/ui/d;", "modifier", "Li90/v1;", "textFieldController", "Lo4/r;", "imeAction", "", "enabled", "isSelected", "", "sectionTitle", "Li90/x1;", "onTextStateChanged", "e", "(Landroidx/compose/ui/d;Li90/v1;IZZLjava/lang/Integer;Lwn0/l;Lr2/l;II)V", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "Landroidx/compose/ui/focus/o;", "focusRequester", "c", "(Li90/v1;ZILandroidx/compose/ui/d;Lwn0/l;IILandroidx/compose/ui/focus/o;Lr2/l;II)V", "Lo4/o0;", "value", "loading", AnnotatedPrivateKey.LABEL, "placeholder", "Li90/w1;", "trailingIcon", "showOptionalLabel", "shouldShowError", "Lo4/z0;", "visualTransformation", "Lb2/a0;", "keyboardOptions", "Lb2/z;", "keyboardActions", "onValueChange", "Li90/w1$a$a;", "onDropdownItemClicked", "g", "(Lo4/o0;ZZLjava/lang/String;Ljava/lang/String;Li90/w1;ZZLandroidx/compose/ui/d;Lo4/z0;Lb2/a0;Lb2/z;Lwn0/l;Lwn0/l;Lr2/l;III)V", "", "Li90/w1$c;", "icons", "a", "(Ljava/util/List;ZLr2/l;I)V", "Li2/n2;", DateTokenConverter.CONVERTER_KEY, "(ZLr2/l;II)Li2/n2;", "w", "(Li90/w1$c;ZLandroidx/compose/ui/d;Lr2/l;II)V", "Li90/w1$a;", "icon", "t", "(Li90/w1$a;ZLwn0/l;Lr2/l;I)V", "Li3/f;", "focusManager", "direction", "K", "(Landroidx/compose/ui/d;Ljava/lang/String;Li3/f;I)Landroidx/compose/ui/d;", "autofillReporter", "I", "(Landroidx/compose/ui/d;Li90/v1;Lwn0/l;Lr2/l;I)Landroidx/compose/ui/d;", "Lr2/p1;", "hasFocus", "J", "(Landroidx/compose/ui/d;Li90/v1;Lr2/p1;)Landroidx/compose/ui/d;", "Lkotlin/Function0;", "onClick", Gender.FEMALE, "(Landroidx/compose/ui/d;Lwn0/a;)Landroidx/compose/ui/d;", "Lr2/g2;", "Lr2/g2;", "H", "()Lr2/g2;", "LocalAutofillEventReporter", "Li90/c0;", AnalyticsAttribute.Error, "contentDescription", "placeHolder", "fieldState", "Li4/p0;", "selection", "composition", "target", "expanded", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<wn0.l<String, jn0.h0>> f76331a = p020r2.w.f(e.f76361a);

    /* JADX INFO: renamed from: i90.b2$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<w1.Trailing> f76332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f76334e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<w1.Trailing> list, boolean z11, int i11) {
            super(2);
            this.f76332c = list;
            this.f76333d = z11;
            this.f76334e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function1.a(this.f76332c, this.f76333d, lVar, k2.a(this.f76334e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$a0 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a0 extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f76335c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(p1<Boolean> p1Var) {
            super(0);
            this.f76335c = p1Var;
        }

        public final void b() {
            Function1.v(this.f76335c, false);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$b */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li90/w1$c;", "it", "Ljn0/h0;", "a", "(Li90/w1$c;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.q<w1.Trailing, p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f76336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11) {
            super(3);
            this.f76336c = z11;
        }

        public final void a(w1.Trailing it, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(it, "it");
            if ((i11 & 14) == 0) {
                i11 |= lVar.n(it) ? 4 : 2;
            }
            if ((i11 & 91) == 18 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(2089412202, i11, -1, "com.stripe.android.uicore.elements.AnimatedIcons.<anonymous> (TextFieldUI.kt:344)");
            }
            Function1.w(it, this.f76336c, null, lVar, i11 & 14, 4);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.Trailing trailing, p020r2.l lVar, Integer num) {
            a(trailing, lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$b0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b0 extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w1.Dropdown f76337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<w1.Dropdown.Item, jn0.h0> f76339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f76340f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b0(w1.Dropdown dropdown, boolean z11, wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar, int i11) {
            super(2);
            this.f76337c = dropdown;
            this.f76338d = z11;
            this.f76339e = lVar;
            this.f76340f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function1.t(this.f76337c, this.f76338d, this.f76339e, lVar, k2.a(this.f76340f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<w1.Trailing> f76341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f76343e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<w1.Trailing> list, boolean z11, int i11) {
            super(2);
            this.f76341c = list;
            this.f76342d = z11;
            this.f76343e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function1.a(this.f76341c, this.f76342d, lVar, k2.a(this.f76343e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$c0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c0 extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w1.Trailing f76344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f76346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f76347f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f76348g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(w1.Trailing trailing, boolean z11, androidx.compose.ui.d dVar, int i11, int i12) {
            super(2);
            this.f76344c = trailing;
            this.f76345d = z11;
            this.f76346e = dVar;
            this.f76347f = i11;
            this.f76348g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function1.w(this.f76344c, this.f76345d, this.f76346e, lVar, k2.a(this.f76347f | 1), this.f76348g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$d */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr2/e2;", "Li90/w1$c;", "Ljn0/h0;", "<anonymous>", "(Lr2/e2;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2", f = "TextFieldUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<e2<w1.Trailing>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f76349n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f76350o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f76351p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f76352q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List<w1.Trailing> f76353r;

        /* JADX INFO: renamed from: i90.b2$d$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2$1", f = "TextFieldUI.kt", i = {0}, l = {336}, m = "invokeSuspend", n = {"it"}, s = {"L$2"})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f76354n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f76355o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f76356p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f76357q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ List<w1.Trailing> f76358r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ e2<w1.Trailing> f76359s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<w1.Trailing> list, e2<w1.Trailing> e2Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f76358r = list;
                this.f76359s = e2Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f76358r, this.f76359s, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x004f A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:9:0x0026 A[LOOP:0: B:10:0x0032->B:9:0x0026, LOOP_END] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f76357q
                    r2 = 1
                    if (r1 == 0) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r1 = r7.f76356p
                    i90.w1$c r1 = (p010i90.w1.Trailing) r1
                    java.lang.Object r3 = r7.f76355o
                    java.util.Iterator r3 = (java.util.Iterator) r3
                    java.lang.Object r4 = r7.f76354n
                    r2.e2 r4 = (p020r2.e2) r4
                    jn0.t.b(r8)
                    goto L50
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    jn0.t.b(r8)
                L26:
                    java.util.List<i90.w1$c> r8 = r7.f76358r
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    r2.e2<i90.w1$c> r1 = r7.f76359s
                    java.util.Iterator r8 = r8.iterator()
                    r3 = r8
                    r4 = r1
                L32:
                    boolean r8 = r3.hasNext()
                    if (r8 == 0) goto L26
                    java.lang.Object r8 = r3.next()
                    r1 = r8
                    i90.w1$c r1 = (p010i90.w1.Trailing) r1
                    r7.f76354n = r4
                    r7.f76355o = r3
                    r7.f76356p = r1
                    r7.f76357q = r2
                    r5 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                    if (r8 != r0) goto L50
                    return r0
                L50:
                    r4.setValue(r1)
                    goto L32
                */
                throw new UnsupportedOperationException("Method not decompiled: p010i90.Function1.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z11, CoroutineScope coroutineScope, List<w1.Trailing> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f76351p = z11;
            this.f76352q = coroutineScope;
            this.f76353r = list;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e2<w1.Trailing> e2Var, Continuation<? super jn0.h0> continuation) {
            return ((d) create(e2Var, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f76351p, this.f76352q, this.f76353r, continuation);
            dVar.f76350o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f76349n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            e2 e2Var = (e2) this.f76350o;
            if (!this.f76351p) {
                BuildersKt__Builders_commonKt.launch$default(this.f76352q, null, null, new a(this.f76353r, e2Var, null), 3, null);
            }
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$d0 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class d0 extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f76360c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(wn0.a<jn0.h0> aVar) {
            super(0);
            this.f76360c = aVar;
        }

        public final void b() {
            this.f76360c.invoke();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$e */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class e extends p013kotlin.jvm.internal.p implements wn0.a<wn0.l<? super String, ? extends jn0.h0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f76361a = new e();

        e() {
            super(0, Function1.class, "defaultAutofillEventReporter", "defaultAutofillEventReporter()Lkotlin/jvm/functions/Function1;", 1);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final wn0.l<String, jn0.h0> invoke() {
            return Function1.G();
        }
    }

    /* JADX INFO: renamed from: i90.b2$e0 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "autofillType", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class e0 extends p013kotlin.jvm.internal.u implements wn0.l<String, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e0 f76362c = new e0();

        e0() {
            super(1);
        }

        public final void a(String autofillType) {
            p013kotlin.jvm.internal.s.k(autofillType, "autofillType");
            o30.d.INSTANCE.a(false).debug("LocalAutofillEventReporter " + autofillType + " event not reported");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(String str) {
            a(str);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$f */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1 f76363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f76365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f76366f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.l<x1, jn0.h0> f76367g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f76368h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f76369i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.o f76370j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f76371k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f76372l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(v1 v1Var, boolean z11, int i11, androidx.compose.ui.d dVar, wn0.l<? super x1, jn0.h0> lVar, int i12, int i13, androidx.compose.ui.focus.o oVar, int i14, int i15) {
            super(2);
            this.f76363c = v1Var;
            this.f76364d = z11;
            this.f76365e = i11;
            this.f76366f = dVar;
            this.f76367g = lVar;
            this.f76368h = i12;
            this.f76369i = i13;
            this.f76370j = oVar;
            this.f76371k = i14;
            this.f76372l = i15;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function1.c(this.f76363c, this.f76364d, this.f76365e, this.f76366f, this.f76367g, this.f76368h, this.f76369i, this.f76370j, lVar, k2.a(this.f76371k | 1), this.f76372l);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$f0 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    static final class f0 extends p013kotlin.jvm.internal.u implements wn0.l<String, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1 f76373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, jn0.h0> f76374d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f0(v1 v1Var, wn0.l<? super String, jn0.h0> lVar) {
            super(1);
            this.f76373c = v1Var;
            this.f76374d = lVar;
        }

        public final void a(String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            e3.m autofillType = this.f76373c.getAutofillType();
            if (autofillType != null) {
                this.f76374d.invoke(autofillType.name());
            }
            this.f76373c.q(it);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(String str) {
            a(str);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$g0 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li3/o;", "it", "Ljn0/h0;", "a", "(Li3/o;)V"}, k = 3, mv = {1, 9, 0})
    static final class g0 extends p013kotlin.jvm.internal.u implements wn0.l<i3.o, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f76376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v1 f76377d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(p1<Boolean> p1Var, v1 v1Var) {
            super(1);
            this.f76376c = p1Var;
            this.f76377d = v1Var;
        }

        public final void a(i3.o it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            if (this.f76376c.getValue().booleanValue() != it.isFocused()) {
                this.f76377d.h(it.isFocused());
            }
            this.f76376c.setValue(Boolean.valueOf(it.isFocused()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(i3.o oVar) {
            a(oVar);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$h */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.elements.TextFieldUIKt$TextField$3", f = "TextFieldUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f76378n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f76379o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ i3.f f76380p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f76381q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ y3<x1> f76382r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(p1<Boolean> p1Var, i3.f fVar, int i11, y3<? extends x1> y3Var, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f76379o = p1Var;
            this.f76380p = fVar;
            this.f76381q = i11;
            this.f76382r = y3Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new h(this.f76379o, this.f76380p, this.f76381q, this.f76382r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f76378n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (p013kotlin.jvm.internal.s.f(Function1.h(this.f76382r), z1.a.f77176a) && this.f76379o.getValue().booleanValue()) {
                f90.a.a(this.f76380p, this.f76381q);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: i90.b2$h0 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt3/b;", "event", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class h0 extends p013kotlin.jvm.internal.u implements wn0.l<t3.b, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i3.f f76384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f76385e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(String str, i3.f fVar, int i11) {
            super(1);
            this.f76383c = str;
            this.f76384d = fVar;
            this.f76385e = i11;
        }

        public final Boolean a(KeyEvent event) {
            boolean z11;
            p013kotlin.jvm.internal.s.k(event, "event");
            if (t3.c.e(t3.d.b(event), t3.c.INSTANCE.a()) && event.getKeyCode() == 67 && this.f76383c.length() == 0) {
                f90.a.a(this.f76384d, this.f76385e);
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(t3.b bVar) {
            return a(bVar.getNativeKeyEvent());
        }
    }

    /* JADX INFO: renamed from: i90.b2$i */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class i extends p013kotlin.jvm.internal.p implements wn0.l<w1.Dropdown.Item, jn0.h0> {
        i(Object obj) {
            super(1, obj, v1.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0);
        }

        public final void a(w1.Dropdown.Item p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((v1) this.receiver).i(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.Dropdown.Item item) {
            a(item);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$j */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.l<g4.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<String> f76386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(y3<String> y3Var) {
            super(1);
            this.f76386c = y3Var;
        }

        public final void a(g4.y semantics) {
            p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
            g4.v.c0(semantics, Function1.r(this.f76386c));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g4.y yVar) {
            a(yVar);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$k */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb2/y;", "Ljn0/h0;", "a", "(Lb2/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.l<kotlin.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i3.f f76387c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(i3.f fVar) {
            super(1);
            this.f76387c = fVar;
        }

        public final void a(kotlin.y $receiver) {
            p013kotlin.jvm.internal.s.k($receiver, "$this$$receiver");
            this.f76387c.r(true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(kotlin.y yVar) {
            a(yVar);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$l */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb2/y;", "Ljn0/h0;", "a", "(Lb2/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.l<kotlin.y, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i3.f f76388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f76389d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(i3.f fVar, int i11) {
            super(1);
            this.f76388c = fVar;
            this.f76389d = i11;
        }

        public final void a(kotlin.y $receiver) {
            p013kotlin.jvm.internal.s.k($receiver, "$this$$receiver");
            f90.a.a(this.f76388c, this.f76389d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(kotlin.y yVar) {
            a(yVar);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$m */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/o0;", "newValue", "Ljn0/h0;", "a", "(Lo4/o0;)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends p013kotlin.jvm.internal.u implements wn0.l<TextFieldValue, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1 f76390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<x1, jn0.h0> f76391d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y3<x1> f76392e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y3<String> f76393f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p1<p0> f76394g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p1<p0> f76395h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(v1 v1Var, wn0.l<? super x1, jn0.h0> lVar, y3<? extends x1> y3Var, y3<String> y3Var2, p1<p0> p1Var, p1<p0> p1Var2) {
            super(1);
            this.f76390c = v1Var;
            this.f76391d = lVar;
            this.f76392e = y3Var;
            this.f76393f = y3Var2;
            this.f76394g = p1Var;
            this.f76395h = p1Var2;
        }

        public final void a(TextFieldValue newValue) {
            x1 x1VarQ;
            p013kotlin.jvm.internal.s.k(newValue, "newValue");
            String strH = newValue.h();
            boolean zA = a2.a(Function1.h(this.f76392e), Function1.n(this.f76393f), strH);
            if (p013kotlin.jvm.internal.s.f(strH, Function1.n(this.f76393f)) || zA) {
                Function1.k(this.f76394g, p0.b(newValue.getSelection()));
                Function1.m(this.f76395h, newValue.getComposition());
            }
            if (!zA || (x1VarQ = this.f76390c.q(strH)) == null) {
                return;
            }
            this.f76391d.invoke(x1VarQ);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$n */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/p1;", "", "b", "()Lr2/p1;"}, k = 3, mv = {1, 9, 0})
    static final class n extends p013kotlin.jvm.internal.u implements wn0.a<p1<Boolean>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f76396c = new n();

        n() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p1<Boolean> invoke() {
            return s3.d(Boolean.FALSE, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: i90.b2$p */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class p extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1 f76398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f76400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f76401f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.l<x1, jn0.h0> f76402g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(v1 v1Var, boolean z11, int i11, androidx.compose.ui.d dVar, wn0.l<? super x1, jn0.h0> lVar) {
            super(2);
            this.f76398c = v1Var;
            this.f76399d = z11;
            this.f76400e = i11;
            this.f76401f = dVar;
            this.f76402g = lVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1798948745, i11, -1, "com.stripe.android.uicore.elements.TextFieldSection.<anonymous> (TextFieldUI.kt:110)");
            }
            Function1.c(this.f76398c, this.f76399d, this.f76400e, this.f76401f, this.f76402g, 0, 0, null, lVar, 8, 224);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$q */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class q extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f76403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v1 f76404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f76405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f76406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f76407g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Integer f76408h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ wn0.l<x1, jn0.h0> f76409i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f76410j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f76411k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(androidx.compose.ui.d dVar, v1 v1Var, int i11, boolean z11, boolean z12, Integer num, wn0.l<? super x1, jn0.h0> lVar, int i12, int i13) {
            super(2);
            this.f76403c = dVar;
            this.f76404d = v1Var;
            this.f76405e = i11;
            this.f76406f = z11;
            this.f76407g = z12;
            this.f76408h = num;
            this.f76409i = lVar;
            this.f76410j = i12;
            this.f76411k = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function1.e(this.f76403c, this.f76404d, this.f76405e, this.f76406f, this.f76407g, this.f76408h, this.f76409i, lVar, k2.a(this.f76410j | 1), this.f76411k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$r */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class r extends p013kotlin.jvm.internal.u implements wn0.l<TextFieldValue, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f76412c = new r();

        r() {
            super(1);
        }

        public final void a(TextFieldValue it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$s */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class s extends p013kotlin.jvm.internal.u implements wn0.l<w1.Dropdown.Item, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f76413c = new s();

        s() {
            super(1);
        }

        public final void a(w1.Dropdown.Item it) {
            p013kotlin.jvm.internal.s.k(it, "it");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.Dropdown.Item item) {
            a(item);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$t */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class t extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f76414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f76415d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(boolean z11, String str) {
            super(2);
            this.f76414c = z11;
            this.f76415d = str;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-560051860, i11, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:265)");
            }
            lVar.H(-771988776);
            String strD = this.f76414c ? e4.i.d(f90.h.E, new Object[]{this.f76415d}, lVar, 64) : this.f76415d;
            lVar.T();
            p010i90.e0.a(strD, null, false, lVar, 0, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$u */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class u extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f76416c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(2);
            this.f76416c = str;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1625019091, i11, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:279)");
            }
            w0.a(this.f76416c, null, false, lVar, 0, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$v */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class v extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w1 f76417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<w1.Dropdown.Item, jn0.h0> f76419e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(w1 w1Var, boolean z11, wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar) {
            super(2);
            this.f76417c = w1Var;
            this.f76418d = z11;
            this.f76419e = lVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1001636886, i11, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:284)");
            }
            w1 w1Var = this.f76417c;
            boolean z11 = this.f76418d;
            wn0.l<w1.Dropdown.Item, jn0.h0> lVar2 = this.f76419e;
            lVar.H(693286680);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            v1.b bVar = v1.b.f117444a;
            v1.b.e eVarF = bVar.f();
            d3.c.Companion companion2 = d3.c.INSTANCE;
            i0 i0VarB = v1.e0.b(eVarF, companion2.l(), lVar, 0);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            b4.g.Companion aVar = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = aVar.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(companion);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarB, aVar.c());
            d4.b(lVarA, xVarC, aVar.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = aVar.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            if (w1Var instanceof w1.Trailing) {
                lVar.H(-292374014);
                Function1.w((w1.Trailing) w1Var, z11, null, lVar, 0, 4);
                lVar.T();
            } else if (w1Var instanceof w1.MultiTrailing) {
                lVar.H(-292225152);
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.t.i(companion, w4.h.g(10));
                lVar.H(693286680);
                i0 i0VarB2 = v1.e0.b(bVar.f(), companion2.l(), lVar, 0);
                lVar.H(-1323940314);
                int iA2 = p020r2.j.a(lVar, 0);
                p020r2.x xVarC2 = lVar.c();
                wn0.a<b4.g> aVarA2 = aVar.a();
                wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA2 = z3.a0.a(dVarI);
                if (lVar.w() == null) {
                    p020r2.j.c();
                }
                lVar.h();
                if (lVar.getInserting()) {
                    lVar.z(aVarA2);
                } else {
                    lVar.d();
                }
                p020r2.l lVarA2 = d4.a(lVar);
                d4.b(lVarA2, i0VarB2, aVar.c());
                d4.b(lVarA2, xVarC2, aVar.e());
                wn0.p<b4.g, Integer, jn0.h0> pVarB2 = aVar.b();
                if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA2.invoke(y2.a(y2.b(lVar)), lVar, 0);
                lVar.H(2058660585);
                lVar.H(-56264169);
                w1.MultiTrailing multiTrailing = (w1.MultiTrailing) w1Var;
                Iterator<T> it = multiTrailing.b().iterator();
                while (it.hasNext()) {
                    boolean z12 = z11;
                    Function1.w((w1.Trailing) it.next(), z12, null, lVar, 0, 4);
                    z11 = z12;
                }
                lVar.T();
                Function1.a(multiTrailing.a(), z11, lVar, 8);
                lVar.T();
                lVar.g();
                lVar.T();
                lVar.T();
                lVar.T();
            } else if (w1Var instanceof w1.Dropdown) {
                lVar.H(-291805536);
                Function1.t((w1.Dropdown) w1Var, z11, lVar2, lVar, w1.Dropdown.f77049e);
                lVar.T();
            } else {
                lVar.H(-291519437);
                lVar.T();
            }
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$w */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class w extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f76420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f76422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f76423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f76424g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w1 f76425h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f76426i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f76427j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f76428k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ z0 f76429l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f76430m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ kotlin.z f76431n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ wn0.l<TextFieldValue, jn0.h0> f76432o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.l<w1.Dropdown.Item, jn0.h0> f76433p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f76434q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f76435r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f76436s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(TextFieldValue textFieldValue, boolean z11, boolean z12, String str, String str2, w1 w1Var, boolean z13, boolean z14, androidx.compose.ui.d dVar, z0 z0Var, KeyboardOptions keyboardOptions, kotlin.z zVar, wn0.l<? super TextFieldValue, jn0.h0> lVar, wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar2, int i11, int i12, int i13) {
            super(2);
            this.f76420c = textFieldValue;
            this.f76421d = z11;
            this.f76422e = z12;
            this.f76423f = str;
            this.f76424g = str2;
            this.f76425h = w1Var;
            this.f76426i = z13;
            this.f76427j = z14;
            this.f76428k = dVar;
            this.f76429l = z0Var;
            this.f76430m = keyboardOptions;
            this.f76431n = zVar;
            this.f76432o = lVar;
            this.f76433p = lVar2;
            this.f76434q = i11;
            this.f76435r = i12;
            this.f76436s = i13;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function1.g(this.f76420c, this.f76421d, this.f76422e, this.f76423f, this.f76424g, this.f76425h, this.f76426i, this.f76427j, this.f76428k, this.f76429l, this.f76430m, this.f76431n, this.f76432o, this.f76433p, lVar, k2.a(this.f76434q | 1), k2.a(this.f76435r), this.f76436s);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$x */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/k;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/focus/k;)V"}, k = 3, mv = {1, 9, 0})
    static final class x extends p013kotlin.jvm.internal.u implements wn0.l<androidx.compose.ui.focus.k, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f76437c = new x();

        x() {
            super(1);
        }

        public final void a(androidx.compose.ui.focus.k focusProperties) {
            p013kotlin.jvm.internal.s.k(focusProperties, "$this$focusProperties");
            focusProperties.r(false);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(androidx.compose.ui.focus.k kVar) {
            a(kVar);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$y */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class y extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f76438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(p1<Boolean> p1Var) {
            super(0);
            this.f76438c = p1Var;
        }

        public final void b() {
            Function1.v(this.f76438c, true);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.b2$z */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li90/w1$a$a;", "item", "Ljn0/h0;", "a", "(Li90/w1$a$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class z extends p013kotlin.jvm.internal.u implements wn0.l<w1.Dropdown.Item, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<w1.Dropdown.Item, jn0.h0> f76439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f76440d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z(wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar, p1<Boolean> p1Var) {
            super(1);
            this.f76439c = lVar;
            this.f76440d = p1Var;
        }

        public final void a(w1.Dropdown.Item item) {
            p013kotlin.jvm.internal.s.k(item, "item");
            this.f76439c.invoke(item);
            Function1.v(this.f76440d, false);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(w1.Dropdown.Item item) {
            a(item);
            return jn0.h0.f84049a;
        }
    }

    private static final androidx.compose.ui.d F(androidx.compose.ui.d dVar, wn0.a<jn0.h0> aVar) {
        return aVar != null ? androidx.compose.foundation.d.d(dVar, false, null, null, new d0(aVar), 7, null) : dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wn0.l<String, jn0.h0> G() {
        return e0.f76362c;
    }

    public static final g2<wn0.l<String, jn0.h0>> H() {
        return f76331a;
    }

    @SuppressLint({"ComposableModifierFactory"})
    private static final androidx.compose.ui.d I(androidx.compose.ui.d dVar, v1 v1Var, wn0.l<? super String, jn0.h0> lVar, p020r2.l lVar2, int i11) {
        lVar2.H(-1079542001);
        if (p020r2.o.J()) {
            p020r2.o.S(-1079542001, i11, -1, "com.stripe.android.uicore.elements.onAutofill (TextFieldUI.kt:492)");
        }
        androidx.compose.ui.d dVarA = q90.a.a(dVar, p013kotlin.collections.v.q(v1Var.getAutofillType()), new f0(v1Var, lVar), lVar2, i11 & 14);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar2.T();
        return dVarA;
    }

    private static final androidx.compose.ui.d J(androidx.compose.ui.d dVar, v1 v1Var, p1<Boolean> p1Var) {
        return androidx.compose.ui.focus.b.a(dVar, new g0(p1Var, v1Var));
    }

    private static final androidx.compose.ui.d K(androidx.compose.ui.d dVar, String str, i3.f fVar, int i11) {
        return androidx.compose.ui.input.key.a.b(dVar, new h0(str, fVar, i11));
    }

    public static final void a(List<w1.Trailing> icons, boolean z11, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(icons, "icons");
        p020r2.l lVarV = lVar.v(-2067380269);
        if (p020r2.o.J()) {
            p020r2.o.S(-2067380269, i11, -1, "com.stripe.android.uicore.elements.AnimatedIcons (TextFieldUI.kt:323)");
        }
        if (icons.isEmpty()) {
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(icons, z11, i11));
                return;
            }
            return;
        }
        lVarV.H(773894976);
        lVarV.H(-492369756);
        Object objI = lVarV.I();
        if (objI == p020r2.l.INSTANCE.a()) {
            p020r2.a0 a0Var = new p020r2.a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVarV));
            lVarV.B(a0Var);
            objI = a0Var;
        }
        lVarV.T();
        CoroutineScope coroutineScope = ((p020r2.a0) objI).getCoroutineScope();
        lVarV.T();
        p015o1.j.a(b(n3.m(p013kotlin.collections.v.o0(icons), new d(((Boolean) lVarV.U(f90.n.j())).booleanValue(), coroutineScope, icons, null), lVarV, 64)), null, null, null, z2.c.b(lVarV, 2089412202, true, new b(z11)), lVarV, 24576, 14);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX2 = lVarV.x();
        if (w2VarX2 != null) {
            w2VarX2.a(new c(icons, z11, i11));
        }
    }

    private static final w1.Trailing b(y3<w1.Trailing> y3Var) {
        return y3Var.getValue();
    }

    public static final void c(v1 textFieldController, boolean z11, int i11, androidx.compose.ui.d dVar, wn0.l<? super x1, jn0.h0> lVar, int i12, int i13, androidx.compose.ui.focus.o oVar, p020r2.l lVar2, int i14, int i15) {
        int iE;
        int i16;
        int iF;
        androidx.compose.ui.focus.o oVar2;
        p013kotlin.jvm.internal.s.k(textFieldController, "textFieldController");
        p020r2.l lVarV = lVar2.v(-226690623);
        androidx.compose.ui.d dVar2 = (i15 & 8) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        wn0.l<? super x1, jn0.h0> lVar3 = (i15 & 16) != 0 ? g.f76375c : lVar;
        if ((i15 & 32) != 0) {
            i16 = i14 & (-458753);
            iE = androidx.compose.ui.focus.d.INSTANCE.e();
        } else {
            iE = i12;
            i16 = i14;
        }
        if ((i15 & 64) != 0) {
            i16 &= -3670017;
            iF = androidx.compose.ui.focus.d.INSTANCE.f();
        } else {
            iF = i13;
        }
        if ((i15 & 128) != 0) {
            lVarV.H(2088964379);
            Object objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new androidx.compose.ui.focus.o();
                lVarV.B(objI);
            }
            lVarV.T();
            oVar2 = (androidx.compose.ui.focus.o) objI;
        } else {
            oVar2 = oVar;
        }
        if (p020r2.o.J()) {
            p020r2.o.S(-226690623, i16, -1, "com.stripe.android.uicore.elements.TextField (TextFieldUI.kt:140)");
        }
        i3.f fVar = (i3.f) lVarV.U(androidx.compose.ui.platform.z0.h());
        y3 y3VarA = r90.f.a(textFieldController.p(), lVarV, 8);
        y3 y3VarA2 = r90.f.a(textFieldController.f(), lVarV, 8);
        y3 y3VarA3 = r90.f.a(textFieldController.j(), lVarV, 8);
        y3 y3VarA4 = r90.f.a(textFieldController.b(), lVarV, 8);
        y3 y3VarA5 = r90.f.a(textFieldController.getContentDescription(), lVarV, 8);
        y3 y3VarA6 = r90.f.a(textFieldController.d(), lVarV, 8);
        p1 p1Var = (p1) a3.b.c(new Object[0], null, null, n.f76396c, lVarV, 3080, 6);
        y3 y3VarA7 = r90.f.a(textFieldController.r(), lVarV, 8);
        y3 y3VarA8 = r90.f.a(textFieldController.getLabel(), lVarV, 8);
        int i17 = iE;
        Function0.g(h(y3VarA7), new h(p1Var, fVar, i17, y3VarA7, null), lVarV, 72);
        wn0.l lVar4 = (wn0.l) lVarV.U(f76331a);
        lVarV.H(2088999127);
        Object objI2 = lVarV.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI2 == companion.a()) {
            objI2 = s3.d(null, null, 2, null);
            lVarV.B(objI2);
        }
        p1 p1Var2 = (p1) objI2;
        lVarV.T();
        lVarV.H(2089001751);
        Object objI3 = lVarV.I();
        if (objI3 == companion.a()) {
            objI3 = s3.d(null, null, 2, null);
            lVarV.B(objI3);
        }
        p1 p1Var3 = (p1) objI3;
        lVarV.T();
        String strN = n(y3VarA);
        p0 p0VarJ = j(p1Var2);
        TextFieldValue textFieldValue = new TextFieldValue(strN, p0VarJ != null ? p0VarJ.getPackedValue() : q0.a(n(y3VarA).length()), l(p1Var3), (DefaultConstructorMarker) null);
        boolean zQ = q(y3VarA4);
        i iVar = new i(textFieldController);
        androidx.compose.ui.d dVarA = androidx.compose.ui.focus.p.a(J(I(K(dVar2, n(y3VarA), fVar, iF), textFieldController, lVar4, lVarV, 64), textFieldController, p1Var), oVar2);
        lVarV.H(2089049482);
        boolean zN = lVarV.n(y3VarA5);
        Object objI4 = lVarV.I();
        if (zN || objI4 == companion.a()) {
            objI4 = new j(y3VarA5);
            lVarV.B(objI4);
        }
        lVarV.T();
        androidx.compose.ui.d dVarD = g4.o.d(dVarA, false, (wn0.l) objI4, 1, null);
        boolean z12 = z11 && textFieldController.s();
        Integer numI = i(y3VarA8);
        lVarV.H(2089054540);
        String strC = numI == null ? null : e4.i.c(numI.intValue(), lVarV, 0);
        lVarV.T();
        boolean showOptionalLabel = textFieldController.getShowOptionalLabel();
        String strS = s(y3VarA6);
        w1 w1VarO = o(y3VarA2);
        boolean zP = p(y3VarA3);
        int i18 = iF;
        z0 visualTransformation = textFieldController.getVisualTransformation();
        KeyboardOptions keyboardOptions = new KeyboardOptions(textFieldController.getCapitalization(), false, textFieldController.getKeyboardType(), i11, 2, null);
        kotlin.z zVar = new kotlin.z(new k(fVar), null, new l(fVar, i17), null, null, null, 58, null);
        wn0.l<? super x1, jn0.h0> lVar5 = lVar3;
        m mVar = new m(textFieldController, lVar5, y3VarA7, y3VarA, p1Var2, p1Var3);
        androidx.compose.ui.focus.o oVar3 = oVar2;
        g(textFieldValue, z12, zQ, strC, strS, w1VarO, showOptionalLabel, zP, dVarD, visualTransformation, keyboardOptions, zVar, mVar, iVar, lVarV, 0, 0, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(textFieldController, z11, i11, dVar2, lVar5, i17, i18, oVar3, i14, i15));
        }
    }

    public static final n2 d(boolean z11, p020r2.l lVar, int i11, int i12) {
        long onComponent;
        lVar.H(-1455690364);
        boolean z12 = (i12 & 1) != 0 ? false : z11;
        if (p020r2.o.J()) {
            p020r2.o.S(-1455690364, i11, -1, "com.stripe.android.uicore.elements.TextFieldColors (TextFieldUI.kt:352)");
        }
        o2 o2Var = o2.f74777a;
        if (z12) {
            lVar.H(278521482);
            onComponent = j1.f74525a.a(lVar, j1.f74526b).d();
            lVar.T();
        } else {
            lVar.H(278569470);
            onComponent = f90.n.n(j1.f74525a, lVar, j1.f74526b).getOnComponent();
            lVar.T();
        }
        j1 j1Var = j1.f74525a;
        int i13 = j1.f74526b;
        long placeholderText = f90.n.n(j1Var, lVar, i13).getPlaceholderText();
        long placeholderText2 = f90.n.n(j1Var, lVar, i13).getPlaceholderText();
        long placeholderText3 = f90.n.n(j1Var, lVar, i13).getPlaceholderText();
        long component = f90.n.n(j1Var, lVar, i13).getComponent();
        k3.p1.Companion companion = k3.p1.INSTANCE;
        n2 n2VarN = o2Var.n(onComponent, 0L, component, f90.n.n(j1Var, lVar, i13).getTextCursor(), 0L, companion.i(), companion.i(), companion.i(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, placeholderText2, placeholderText, 0L, 0L, placeholderText3, 0L, lVar, 14352384, 0, 48, 1474322);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return n2VarN;
    }

    public static final void e(androidx.compose.ui.d dVar, v1 textFieldController, int i11, boolean z11, boolean z12, Integer num, wn0.l<? super x1, jn0.h0> lVar, p020r2.l lVar2, int i12, int i13) {
        p013kotlin.jvm.internal.s.k(textFieldController, "textFieldController");
        p020r2.l lVarV = lVar2.v(1707248643);
        androidx.compose.ui.d dVar2 = (i13 & 1) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        boolean z13 = (i13 & 16) != 0 ? false : z12;
        String strD = null;
        Integer num2 = (i13 & 32) != 0 ? null : num;
        wn0.l<? super x1, jn0.h0> lVar3 = (i13 & 64) != 0 ? o.f76397c : lVar;
        if (p020r2.o.J()) {
            p020r2.o.S(1707248643, i12, -1, "com.stripe.android.uicore.elements.TextFieldSection (TextFieldUI.kt:97)");
        }
        p010i90.c0 c0VarF = f(r90.f.a(textFieldController.a(), lVarV, 8));
        lVarV.H(1900557765);
        if (c0VarF != null) {
            Object[] formatArgs = c0VarF.getFormatArgs();
            lVarV.H(1900558623);
            strD = formatArgs != null ? e4.i.d(c0VarF.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), lVarV, 64) : null;
            lVarV.T();
            lVarV.H(1900558193);
            if (strD == null) {
                strD = e4.i.c(c0VarF.getErrorMessage(), lVarV, 0);
            }
            lVarV.T();
        }
        String str = strD;
        lVarV.T();
        androidx.compose.ui.d dVar3 = dVar2;
        o1.a(num2, str, null, z13, false, null, z2.c.b(lVarV, -1798948745, true, new p(textFieldController, z11, i11, dVar3, lVar3)), lVarV, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 3) & 7168), 52);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new q(dVar3, textFieldController, i11, z11, z13, num2, lVar3, i12, i13));
        }
    }

    private static final p010i90.c0 f(y3<p010i90.c0> y3Var) {
        return y3Var.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:102:0x012f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:107:0x013e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:111:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162  */
    /* JADX WARN: Code duplicated, block: B:122:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x0174  */
    /* JADX WARN: Code duplicated, block: B:128:0x017b  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:133:0x018c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0193  */
    /* JADX WARN: Code duplicated, block: B:139:0x019c  */
    /* JADX WARN: Code duplicated, block: B:140:0x019f  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:166:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x0208  */
    /* JADX WARN: Code duplicated, block: B:169:0x020d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0214  */
    /* JADX WARN: Code duplicated, block: B:172:0x0218  */
    /* JADX WARN: Code duplicated, block: B:173:0x021f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0225  */
    /* JADX WARN: Code duplicated, block: B:177:0x023d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0241  */
    /* JADX WARN: Code duplicated, block: B:180:0x0244  */
    /* JADX WARN: Code duplicated, block: B:182:0x0248  */
    /* JADX WARN: Code duplicated, block: B:183:0x0252  */
    /* JADX WARN: Code duplicated, block: B:186:0x0262  */
    /* JADX WARN: Code duplicated, block: B:189:0x027e  */
    /* JADX WARN: Code duplicated, block: B:190:0x028d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0292  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:195:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:196:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:199:0x0306  */
    /* JADX WARN: Code duplicated, block: B:203:0x0317  */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    public static final void g(TextFieldValue value, boolean z11, boolean z12, String str, String str2, w1 w1Var, boolean z13, boolean z14, androidx.compose.ui.d dVar, z0 z0Var, KeyboardOptions keyboardOptions, kotlin.z zVar, wn0.l<? super TextFieldValue, jn0.h0> lVar, wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar2, p020r2.l lVar3, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        androidx.compose.ui.d dVar2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        z0 z0VarC;
        KeyboardOptions keyboardOptionsA;
        kotlin.z zVar2;
        wn0.l<? super TextFieldValue, jn0.h0> lVar4;
        z0 z0Var2;
        kotlin.z zVar3;
        int i37;
        androidx.compose.ui.d dVar3;
        wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar5;
        z2.a aVarB;
        z2.a aVarB2;
        z2.a aVarB3;
        p020r2.l lVar6;
        z0 z0Var3;
        KeyboardOptions keyboardOptions2;
        kotlin.z zVar4;
        androidx.compose.ui.d dVar4;
        wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar7;
        wn0.l<? super TextFieldValue, jn0.h0> lVar8;
        w2 w2VarX;
        p013kotlin.jvm.internal.s.k(value, "value");
        p020r2.l lVarV = lVar3.v(-1297584226);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = (lVarV.n(value) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        int i38 = 16;
        if ((i13 & 2) == 0) {
            if ((i11 & 112) == 0) {
                i14 |= lVarV.p(z11) ? 32 : 16;
            }
            if ((i13 & 4) != 0) {
                i14 |= KyberEngine.KyberPolyBytes;
            } else if ((i11 & 896) == 0) {
                if (lVarV.p(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i14 |= i15;
            }
            if ((i13 & 8) != 0) {
                i14 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (lVarV.n(str)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            if ((i13 & 16) != 0) {
                i14 |= 24576;
            } else if ((57344 & i11) == 0) {
                if (lVarV.n(str2)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i14 |= i17;
            }
            if ((i13 & 32) != 0) {
                if ((458752 & i11) == 0) {
                    if (lVarV.n(w1Var)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                }
                if ((i13 & 64) != 0) {
                    if ((3670016 & i11) == 0) {
                        if (lVarV.p(z13)) {
                            i19 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i19 = PKIFailureInfo.signerNotTrusted;
                        }
                    }
                    if ((i13 & 128) != 0) {
                        if ((29360128 & i11) == 0) {
                            if (lVarV.p(z14)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                        }
                        i22 = i13 & 256;
                        if (i22 != 0) {
                            i14 |= 100663296;
                            dVar2 = dVar;
                        } else {
                            dVar2 = dVar;
                            if ((i11 & 234881024) == 0) {
                                if (lVarV.n(dVar2)) {
                                    i23 = 67108864;
                                } else {
                                    i23 = 33554432;
                                }
                                i14 |= i23;
                            }
                        }
                        i24 = i13 & 512;
                        if (i24 != 0) {
                            i14 |= 805306368;
                        } else if ((i11 & 1879048192) == 0) {
                            if (lVarV.n(z0Var)) {
                                i25 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i25 = 268435456;
                            }
                            i14 |= i25;
                        }
                        i26 = i13 & 1024;
                        if (i26 != 0) {
                            i27 = i12 | 6;
                        } else if ((i12 & 14) == 0) {
                            if (lVarV.n(keyboardOptions)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i12 | i28;
                        } else {
                            i27 = i12;
                        }
                        if ((i12 & 112) != 0) {
                            if ((i13 & 2048) == 0 && lVarV.n(zVar)) {
                                i38 = 32;
                            }
                            i27 |= i38;
                        }
                        i29 = i27;
                        i31 = i13 & 4096;
                        if (i31 != 0) {
                            i33 = i29 | KyberEngine.KyberPolyBytes;
                        } else {
                            i32 = i29;
                            if ((i12 & 896) != 0) {
                                i32 |= lVarV.K(lVar) ? 256 : 128;
                            }
                            i33 = i32;
                        }
                        i34 = i13 & PKIFailureInfo.certRevoked;
                        if (i34 != 0) {
                            i36 = i33 | 3072;
                        } else {
                            i35 = i33;
                            if ((i12 & 7168) != 0) {
                                i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                            }
                            i36 = i35;
                        }
                        if ((i14 & 1533916891) != 306783378 && (i36 & 5851) == 1170 && lVarV.b()) {
                            lVarV.j();
                            z0Var3 = z0Var;
                            zVar4 = zVar;
                            lVar8 = lVar;
                            lVar6 = lVarV;
                            dVar4 = dVar2;
                            keyboardOptions2 = keyboardOptions;
                            lVar7 = lVar2;
                        } else {
                            lVarV.L();
                            if ((i11 & 1) != 0 || lVarV.k()) {
                                if (i22 != 0) {
                                    dVar2 = androidx.compose.ui.d.INSTANCE;
                                }
                                if (i24 != 0) {
                                    z0VarC = z0.INSTANCE.c();
                                } else {
                                    z0VarC = z0Var;
                                }
                                if (i26 != 0) {
                                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                                } else {
                                    keyboardOptionsA = keyboardOptions;
                                }
                                if ((i13 & 2048) != 0) {
                                    zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                    i36 &= -113;
                                } else {
                                    zVar2 = zVar;
                                }
                                if (i31 != 0) {
                                    lVar4 = r.f76412c;
                                } else {
                                    lVar4 = lVar;
                                }
                                if (i34 != 0) {
                                    z0Var2 = z0VarC;
                                    i37 = i36;
                                    dVar3 = dVar2;
                                    lVar5 = s.f76413c;
                                    zVar3 = zVar2;
                                } else {
                                    z0Var2 = z0VarC;
                                    zVar3 = zVar2;
                                }
                                lVarV.C();
                                KeyboardOptions keyboardOptions3 = keyboardOptionsA;
                                if (p020r2.o.J()) {
                                    p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                                }
                                int i39 = (i14 >> 21) & 14;
                                n2 n2VarD = d(z14, lVarV, i39, 0);
                                int i41 = i37;
                                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                                if (str != null) {
                                    aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                                } else {
                                    aVarB = null;
                                }
                                if (str2 != null) {
                                    aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                                } else {
                                    aVarB2 = null;
                                }
                                if (w1Var != null) {
                                    aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                                } else {
                                    aVarB3 = null;
                                }
                                int i42 = i41 << 6;
                                int i43 = i39 | 24576 | ((i14 >> 24) & 112) | (i42 & 896) | (i42 & 7168);
                                wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar9 = lVar5;
                                androidx.compose.ui.d dVar5 = dVar3;
                                wn0.l<? super TextFieldValue, jn0.h0> lVar10 = lVar4;
                                lVar6 = lVarV;
                                z0 z0Var4 = z0Var2;
                                p012k90.b.b(value, lVar10, dVarH, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var4, keyboardOptions3, zVar3, true, 0, 0, null, null, n2VarD, lVar6, (i14 & 14) | ((i41 >> 3) & 112) | ((i14 << 6) & 7168), i43, 491824);
                                if (p020r2.o.J()) {
                                    p020r2.o.R();
                                }
                                z0Var3 = z0Var4;
                                keyboardOptions2 = keyboardOptions3;
                                zVar4 = zVar3;
                                dVar4 = dVar5;
                                lVar7 = lVar9;
                                lVar8 = lVar10;
                            } else {
                                lVarV.j();
                                if ((i13 & 2048) != 0) {
                                    i36 &= -113;
                                }
                                z0Var2 = z0Var;
                                keyboardOptionsA = keyboardOptions;
                                zVar3 = zVar;
                                lVar4 = lVar;
                            }
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                            lVarV.C();
                            KeyboardOptions keyboardOptions4 = keyboardOptionsA;
                            if (p020r2.o.J()) {
                                p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                            }
                            int i310 = (i14 >> 21) & 14;
                            n2 n2VarD2 = d(z14, lVarV, i310, 0);
                            int i44 = i37;
                            androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                            if (str != null) {
                                aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                            } else {
                                aVarB = null;
                            }
                            if (str2 != null) {
                                aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                            } else {
                                aVarB2 = null;
                            }
                            if (w1Var != null) {
                                aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                            } else {
                                aVarB3 = null;
                            }
                            int i45 = i44 << 6;
                            int i46 = i310 | 24576 | ((i14 >> 24) & 112) | (i45 & 896) | (i45 & 7168);
                            wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar11 = lVar5;
                            androidx.compose.ui.d dVar6 = dVar3;
                            wn0.l<? super TextFieldValue, jn0.h0> lVar12 = lVar4;
                            lVar6 = lVarV;
                            z0 z0Var5 = z0Var2;
                            p012k90.b.b(value, lVar12, dVarH2, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var5, keyboardOptions4, zVar3, true, 0, 0, null, null, n2VarD2, lVar6, (i14 & 14) | ((i44 >> 3) & 112) | ((i14 << 6) & 7168), i46, 491824);
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            z0Var3 = z0Var5;
                            keyboardOptions2 = keyboardOptions4;
                            zVar4 = zVar3;
                            dVar4 = dVar6;
                            lVar7 = lVar11;
                            lVar8 = lVar12;
                        }
                        w2VarX = lVar6.x();
                        if (w2VarX != null) {
                            w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                        }
                    }
                    i21 = 12582912;
                    i14 |= i21;
                    i22 = i13 & 256;
                    if (i22 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i11 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i14 |= i23;
                        }
                    }
                    i24 = i13 & 512;
                    if (i24 != 0) {
                        i14 |= 805306368;
                    } else if ((i11 & 1879048192) == 0) {
                        if (lVarV.n(z0Var)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                        i14 |= i25;
                    }
                    i26 = i13 & 1024;
                    if (i26 != 0) {
                        i27 = i12 | 6;
                    } else if ((i12 & 14) == 0) {
                        if (lVarV.n(keyboardOptions)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i12 | i28;
                    } else {
                        i27 = i12;
                    }
                    if ((i12 & 112) != 0) {
                        if ((i13 & 2048) == 0) {
                            i38 = 32;
                        }
                        i27 |= i38;
                    }
                    i29 = i27;
                    i31 = i13 & 4096;
                    if (i31 != 0) {
                        i33 = i29 | KyberEngine.KyberPolyBytes;
                    } else {
                        i32 = i29;
                        if ((i12 & 896) != 0) {
                            i32 |= lVarV.K(lVar) ? 256 : 128;
                        }
                        i33 = i32;
                    }
                    i34 = i13 & PKIFailureInfo.certRevoked;
                    if (i34 != 0) {
                        i36 = i33 | 3072;
                    } else {
                        i35 = i33;
                        if ((i12 & 7168) != 0) {
                            i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                        }
                        i36 = i35;
                    }
                    if ((i14 & 1533916891) != 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        }
                        lVarV.C();
                        KeyboardOptions keyboardOptions5 = keyboardOptionsA;
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                        }
                        int i311 = (i14 >> 21) & 14;
                        n2 n2VarD3 = d(z14, lVarV, i311, 0);
                        int i47 = i37;
                        androidx.compose.ui.d dVarH3 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                        if (str != null) {
                            aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                        } else {
                            aVarB = null;
                        }
                        if (str2 != null) {
                            aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                        } else {
                            aVarB2 = null;
                        }
                        if (w1Var != null) {
                            aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                        } else {
                            aVarB3 = null;
                        }
                        int i48 = i47 << 6;
                        int i49 = i311 | 24576 | ((i14 >> 24) & 112) | (i48 & 896) | (i48 & 7168);
                        wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar13 = lVar5;
                        androidx.compose.ui.d dVar7 = dVar3;
                        wn0.l<? super TextFieldValue, jn0.h0> lVar14 = lVar4;
                        lVar6 = lVarV;
                        z0 z0Var6 = z0Var2;
                        p012k90.b.b(value, lVar14, dVarH3, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var6, keyboardOptions5, zVar3, true, 0, 0, null, null, n2VarD3, lVar6, (i14 & 14) | ((i47 >> 3) & 112) | ((i14 << 6) & 7168), i49, 491824);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        z0Var3 = z0Var6;
                        keyboardOptions2 = keyboardOptions5;
                        zVar4 = zVar3;
                        dVar4 = dVar7;
                        lVar7 = lVar13;
                        lVar8 = lVar14;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        }
                        lVarV.C();
                        KeyboardOptions keyboardOptions6 = keyboardOptionsA;
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                        }
                        int i312 = (i14 >> 21) & 14;
                        n2 n2VarD4 = d(z14, lVarV, i312, 0);
                        int i410 = i37;
                        androidx.compose.ui.d dVarH4 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                        if (str != null) {
                            aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                        } else {
                            aVarB = null;
                        }
                        if (str2 != null) {
                            aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                        } else {
                            aVarB2 = null;
                        }
                        if (w1Var != null) {
                            aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                        } else {
                            aVarB3 = null;
                        }
                        int i411 = i410 << 6;
                        int i412 = i312 | 24576 | ((i14 >> 24) & 112) | (i411 & 896) | (i411 & 7168);
                        wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar15 = lVar5;
                        androidx.compose.ui.d dVar8 = dVar3;
                        wn0.l<? super TextFieldValue, jn0.h0> lVar16 = lVar4;
                        lVar6 = lVarV;
                        z0 z0Var7 = z0Var2;
                        p012k90.b.b(value, lVar16, dVarH4, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var7, keyboardOptions6, zVar3, true, 0, 0, null, null, n2VarD4, lVar6, (i14 & 14) | ((i410 >> 3) & 112) | ((i14 << 6) & 7168), i412, 491824);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        z0Var3 = z0Var7;
                        keyboardOptions2 = keyboardOptions6;
                        zVar4 = zVar3;
                        dVar4 = dVar8;
                        lVar7 = lVar15;
                        lVar8 = lVar16;
                    }
                    w2VarX = lVar6.x();
                    if (w2VarX != null) {
                        w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                    }
                }
                i19 = 1572864;
                i14 |= i19;
                if ((i13 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (lVarV.p(z14)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                    }
                    i22 = i13 & 256;
                    if (i22 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i11 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i14 |= i23;
                        }
                    }
                    i24 = i13 & 512;
                    if (i24 != 0) {
                        i14 |= 805306368;
                    } else if ((i11 & 1879048192) == 0) {
                        if (lVarV.n(z0Var)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                        i14 |= i25;
                    }
                    i26 = i13 & 1024;
                    if (i26 != 0) {
                        i27 = i12 | 6;
                    } else if ((i12 & 14) == 0) {
                        if (lVarV.n(keyboardOptions)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i12 | i28;
                    } else {
                        i27 = i12;
                    }
                    if ((i12 & 112) != 0) {
                        if ((i13 & 2048) == 0) {
                            i38 = 32;
                        }
                        i27 |= i38;
                    }
                    i29 = i27;
                    i31 = i13 & 4096;
                    if (i31 != 0) {
                        i33 = i29 | KyberEngine.KyberPolyBytes;
                    } else {
                        i32 = i29;
                        if ((i12 & 896) != 0) {
                            i32 |= lVarV.K(lVar) ? 256 : 128;
                        }
                        i33 = i32;
                    }
                    i34 = i13 & PKIFailureInfo.certRevoked;
                    if (i34 != 0) {
                        i36 = i33 | 3072;
                    } else {
                        i35 = i33;
                        if ((i12 & 7168) != 0) {
                            i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                        }
                        i36 = i35;
                    }
                    if ((i14 & 1533916891) != 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        }
                        lVarV.C();
                        KeyboardOptions keyboardOptions7 = keyboardOptionsA;
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                        }
                        int i313 = (i14 >> 21) & 14;
                        n2 n2VarD5 = d(z14, lVarV, i313, 0);
                        int i413 = i37;
                        androidx.compose.ui.d dVarH5 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                        if (str != null) {
                            aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                        } else {
                            aVarB = null;
                        }
                        if (str2 != null) {
                            aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                        } else {
                            aVarB2 = null;
                        }
                        if (w1Var != null) {
                            aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                        } else {
                            aVarB3 = null;
                        }
                        int i414 = i413 << 6;
                        int i415 = i313 | 24576 | ((i14 >> 24) & 112) | (i414 & 896) | (i414 & 7168);
                        wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar17 = lVar5;
                        androidx.compose.ui.d dVar9 = dVar3;
                        wn0.l<? super TextFieldValue, jn0.h0> lVar18 = lVar4;
                        lVar6 = lVarV;
                        z0 z0Var8 = z0Var2;
                        p012k90.b.b(value, lVar18, dVarH5, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var8, keyboardOptions7, zVar3, true, 0, 0, null, null, n2VarD5, lVar6, (i14 & 14) | ((i413 >> 3) & 112) | ((i14 << 6) & 7168), i415, 491824);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        z0Var3 = z0Var8;
                        keyboardOptions2 = keyboardOptions7;
                        zVar4 = zVar3;
                        dVar4 = dVar9;
                        lVar7 = lVar17;
                        lVar8 = lVar18;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        }
                        lVarV.C();
                        KeyboardOptions keyboardOptions8 = keyboardOptionsA;
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                        }
                        int i314 = (i14 >> 21) & 14;
                        n2 n2VarD6 = d(z14, lVarV, i314, 0);
                        int i416 = i37;
                        androidx.compose.ui.d dVarH6 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                        if (str != null) {
                            aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                        } else {
                            aVarB = null;
                        }
                        if (str2 != null) {
                            aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                        } else {
                            aVarB2 = null;
                        }
                        if (w1Var != null) {
                            aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                        } else {
                            aVarB3 = null;
                        }
                        int i417 = i416 << 6;
                        int i418 = i314 | 24576 | ((i14 >> 24) & 112) | (i417 & 896) | (i417 & 7168);
                        wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar19 = lVar5;
                        androidx.compose.ui.d dVar10 = dVar3;
                        wn0.l<? super TextFieldValue, jn0.h0> lVar110 = lVar4;
                        lVar6 = lVarV;
                        z0 z0Var9 = z0Var2;
                        p012k90.b.b(value, lVar110, dVarH6, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var9, keyboardOptions8, zVar3, true, 0, 0, null, null, n2VarD6, lVar6, (i14 & 14) | ((i416 >> 3) & 112) | ((i14 << 6) & 7168), i418, 491824);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        z0Var3 = z0Var9;
                        keyboardOptions2 = keyboardOptions8;
                        zVar4 = zVar3;
                        dVar4 = dVar10;
                        lVar7 = lVar19;
                        lVar8 = lVar110;
                    }
                    w2VarX = lVar6.x();
                    if (w2VarX != null) {
                        w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                    }
                }
                i21 = 12582912;
                i14 |= i21;
                i22 = i13 & 256;
                if (i22 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i11 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 512;
                if (i24 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 1879048192) == 0) {
                    if (lVarV.n(z0Var)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 1024;
                if (i26 != 0) {
                    i27 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (lVarV.n(keyboardOptions)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i12 | i28;
                } else {
                    i27 = i12;
                }
                if ((i12 & 112) != 0) {
                    if ((i13 & 2048) == 0) {
                        i38 = 32;
                    }
                    i27 |= i38;
                }
                i29 = i27;
                i31 = i13 & 4096;
                if (i31 != 0) {
                    i33 = i29 | KyberEngine.KyberPolyBytes;
                } else {
                    i32 = i29;
                    if ((i12 & 896) != 0) {
                        i32 |= lVarV.K(lVar) ? 256 : 128;
                    }
                    i33 = i32;
                }
                i34 = i13 & PKIFailureInfo.certRevoked;
                if (i34 != 0) {
                    i36 = i33 | 3072;
                } else {
                    i35 = i33;
                    if ((i12 & 7168) != 0) {
                        i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                    }
                    i36 = i35;
                }
                if ((i14 & 1533916891) != 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions9 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i315 = (i14 >> 21) & 14;
                    n2 n2VarD7 = d(z14, lVarV, i315, 0);
                    int i419 = i37;
                    androidx.compose.ui.d dVarH7 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i4110 = i419 << 6;
                    int i4111 = i315 | 24576 | ((i14 >> 24) & 112) | (i4110 & 896) | (i4110 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar111 = lVar5;
                    androidx.compose.ui.d dVar11 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar112 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var10 = z0Var2;
                    p012k90.b.b(value, lVar112, dVarH7, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var10, keyboardOptions9, zVar3, true, 0, 0, null, null, n2VarD7, lVar6, (i14 & 14) | ((i419 >> 3) & 112) | ((i14 << 6) & 7168), i4111, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var10;
                    keyboardOptions2 = keyboardOptions9;
                    zVar4 = zVar3;
                    dVar4 = dVar11;
                    lVar7 = lVar111;
                    lVar8 = lVar112;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions10 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i316 = (i14 >> 21) & 14;
                    n2 n2VarD8 = d(z14, lVarV, i316, 0);
                    int i4112 = i37;
                    androidx.compose.ui.d dVarH8 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i4113 = i4112 << 6;
                    int i4114 = i316 | 24576 | ((i14 >> 24) & 112) | (i4113 & 896) | (i4113 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar113 = lVar5;
                    androidx.compose.ui.d dVar12 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar114 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var11 = z0Var2;
                    p012k90.b.b(value, lVar114, dVarH8, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var11, keyboardOptions10, zVar3, true, 0, 0, null, null, n2VarD8, lVar6, (i14 & 14) | ((i4112 >> 3) & 112) | ((i14 << 6) & 7168), i4114, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var11;
                    keyboardOptions2 = keyboardOptions10;
                    zVar4 = zVar3;
                    dVar4 = dVar12;
                    lVar7 = lVar113;
                    lVar8 = lVar114;
                }
                w2VarX = lVar6.x();
                if (w2VarX != null) {
                    w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                }
            }
            i18 = 196608;
            i14 |= i18;
            if ((i13 & 64) != 0) {
                if ((3670016 & i11) == 0) {
                    if (lVarV.p(z13)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (lVarV.p(z14)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                    }
                    i22 = i13 & 256;
                    if (i22 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i11 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i14 |= i23;
                        }
                    }
                    i24 = i13 & 512;
                    if (i24 != 0) {
                        i14 |= 805306368;
                    } else if ((i11 & 1879048192) == 0) {
                        if (lVarV.n(z0Var)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                        i14 |= i25;
                    }
                    i26 = i13 & 1024;
                    if (i26 != 0) {
                        i27 = i12 | 6;
                    } else if ((i12 & 14) == 0) {
                        if (lVarV.n(keyboardOptions)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i12 | i28;
                    } else {
                        i27 = i12;
                    }
                    if ((i12 & 112) != 0) {
                        if ((i13 & 2048) == 0) {
                            i38 = 32;
                        }
                        i27 |= i38;
                    }
                    i29 = i27;
                    i31 = i13 & 4096;
                    if (i31 != 0) {
                        i33 = i29 | KyberEngine.KyberPolyBytes;
                    } else {
                        i32 = i29;
                        if ((i12 & 896) != 0) {
                            i32 |= lVarV.K(lVar) ? 256 : 128;
                        }
                        i33 = i32;
                    }
                    i34 = i13 & PKIFailureInfo.certRevoked;
                    if (i34 != 0) {
                        i36 = i33 | 3072;
                    } else {
                        i35 = i33;
                        if ((i12 & 7168) != 0) {
                            i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                        }
                        i36 = i35;
                    }
                    if ((i14 & 1533916891) != 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        }
                        lVarV.C();
                        KeyboardOptions keyboardOptions11 = keyboardOptionsA;
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                        }
                        int i317 = (i14 >> 21) & 14;
                        n2 n2VarD9 = d(z14, lVarV, i317, 0);
                        int i4115 = i37;
                        androidx.compose.ui.d dVarH9 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                        if (str != null) {
                            aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                        } else {
                            aVarB = null;
                        }
                        if (str2 != null) {
                            aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                        } else {
                            aVarB2 = null;
                        }
                        if (w1Var != null) {
                            aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                        } else {
                            aVarB3 = null;
                        }
                        int i4116 = i4115 << 6;
                        int i4117 = i317 | 24576 | ((i14 >> 24) & 112) | (i4116 & 896) | (i4116 & 7168);
                        wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar115 = lVar5;
                        androidx.compose.ui.d dVar13 = dVar3;
                        wn0.l<? super TextFieldValue, jn0.h0> lVar116 = lVar4;
                        lVar6 = lVarV;
                        z0 z0Var12 = z0Var2;
                        p012k90.b.b(value, lVar116, dVarH9, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var12, keyboardOptions11, zVar3, true, 0, 0, null, null, n2VarD9, lVar6, (i14 & 14) | ((i4115 >> 3) & 112) | ((i14 << 6) & 7168), i4117, 491824);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        z0Var3 = z0Var12;
                        keyboardOptions2 = keyboardOptions11;
                        zVar4 = zVar3;
                        dVar4 = dVar13;
                        lVar7 = lVar115;
                        lVar8 = lVar116;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        }
                        lVarV.C();
                        KeyboardOptions keyboardOptions12 = keyboardOptionsA;
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                        }
                        int i318 = (i14 >> 21) & 14;
                        n2 n2VarD10 = d(z14, lVarV, i318, 0);
                        int i4118 = i37;
                        androidx.compose.ui.d dVarH10 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                        if (str != null) {
                            aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                        } else {
                            aVarB = null;
                        }
                        if (str2 != null) {
                            aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                        } else {
                            aVarB2 = null;
                        }
                        if (w1Var != null) {
                            aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                        } else {
                            aVarB3 = null;
                        }
                        int i4119 = i4118 << 6;
                        int i41110 = i318 | 24576 | ((i14 >> 24) & 112) | (i4119 & 896) | (i4119 & 7168);
                        wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar117 = lVar5;
                        androidx.compose.ui.d dVar14 = dVar3;
                        wn0.l<? super TextFieldValue, jn0.h0> lVar118 = lVar4;
                        lVar6 = lVarV;
                        z0 z0Var13 = z0Var2;
                        p012k90.b.b(value, lVar118, dVarH10, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var13, keyboardOptions12, zVar3, true, 0, 0, null, null, n2VarD10, lVar6, (i14 & 14) | ((i4118 >> 3) & 112) | ((i14 << 6) & 7168), i41110, 491824);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        z0Var3 = z0Var13;
                        keyboardOptions2 = keyboardOptions12;
                        zVar4 = zVar3;
                        dVar4 = dVar14;
                        lVar7 = lVar117;
                        lVar8 = lVar118;
                    }
                    w2VarX = lVar6.x();
                    if (w2VarX != null) {
                        w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                    }
                }
                i21 = 12582912;
                i14 |= i21;
                i22 = i13 & 256;
                if (i22 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i11 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 512;
                if (i24 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 1879048192) == 0) {
                    if (lVarV.n(z0Var)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 1024;
                if (i26 != 0) {
                    i27 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (lVarV.n(keyboardOptions)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i12 | i28;
                } else {
                    i27 = i12;
                }
                if ((i12 & 112) != 0) {
                    if ((i13 & 2048) == 0) {
                        i38 = 32;
                    }
                    i27 |= i38;
                }
                i29 = i27;
                i31 = i13 & 4096;
                if (i31 != 0) {
                    i33 = i29 | KyberEngine.KyberPolyBytes;
                } else {
                    i32 = i29;
                    if ((i12 & 896) != 0) {
                        i32 |= lVarV.K(lVar) ? 256 : 128;
                    }
                    i33 = i32;
                }
                i34 = i13 & PKIFailureInfo.certRevoked;
                if (i34 != 0) {
                    i36 = i33 | 3072;
                } else {
                    i35 = i33;
                    if ((i12 & 7168) != 0) {
                        i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                    }
                    i36 = i35;
                }
                if ((i14 & 1533916891) != 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions13 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i319 = (i14 >> 21) & 14;
                    n2 n2VarD11 = d(z14, lVarV, i319, 0);
                    int i41111 = i37;
                    androidx.compose.ui.d dVarH11 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i41112 = i41111 << 6;
                    int i41113 = i319 | 24576 | ((i14 >> 24) & 112) | (i41112 & 896) | (i41112 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar119 = lVar5;
                    androidx.compose.ui.d dVar15 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar1110 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var14 = z0Var2;
                    p012k90.b.b(value, lVar1110, dVarH11, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var14, keyboardOptions13, zVar3, true, 0, 0, null, null, n2VarD11, lVar6, (i14 & 14) | ((i41111 >> 3) & 112) | ((i14 << 6) & 7168), i41113, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var14;
                    keyboardOptions2 = keyboardOptions13;
                    zVar4 = zVar3;
                    dVar4 = dVar15;
                    lVar7 = lVar119;
                    lVar8 = lVar1110;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions14 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i3110 = (i14 >> 21) & 14;
                    n2 n2VarD12 = d(z14, lVarV, i3110, 0);
                    int i41114 = i37;
                    androidx.compose.ui.d dVarH12 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i41115 = i41114 << 6;
                    int i41116 = i3110 | 24576 | ((i14 >> 24) & 112) | (i41115 & 896) | (i41115 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar1111 = lVar5;
                    androidx.compose.ui.d dVar16 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar1112 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var15 = z0Var2;
                    p012k90.b.b(value, lVar1112, dVarH12, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var15, keyboardOptions14, zVar3, true, 0, 0, null, null, n2VarD12, lVar6, (i14 & 14) | ((i41114 >> 3) & 112) | ((i14 << 6) & 7168), i41116, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var15;
                    keyboardOptions2 = keyboardOptions14;
                    zVar4 = zVar3;
                    dVar4 = dVar16;
                    lVar7 = lVar1111;
                    lVar8 = lVar1112;
                }
                w2VarX = lVar6.x();
                if (w2VarX != null) {
                    w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                }
            }
            i19 = 1572864;
            i14 |= i19;
            if ((i13 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (lVarV.p(z14)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                }
                i22 = i13 & 256;
                if (i22 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i11 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 512;
                if (i24 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 1879048192) == 0) {
                    if (lVarV.n(z0Var)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 1024;
                if (i26 != 0) {
                    i27 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (lVarV.n(keyboardOptions)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i12 | i28;
                } else {
                    i27 = i12;
                }
                if ((i12 & 112) != 0) {
                    if ((i13 & 2048) == 0) {
                        i38 = 32;
                    }
                    i27 |= i38;
                }
                i29 = i27;
                i31 = i13 & 4096;
                if (i31 != 0) {
                    i33 = i29 | KyberEngine.KyberPolyBytes;
                } else {
                    i32 = i29;
                    if ((i12 & 896) != 0) {
                        i32 |= lVarV.K(lVar) ? 256 : 128;
                    }
                    i33 = i32;
                }
                i34 = i13 & PKIFailureInfo.certRevoked;
                if (i34 != 0) {
                    i36 = i33 | 3072;
                } else {
                    i35 = i33;
                    if ((i12 & 7168) != 0) {
                        i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                    }
                    i36 = i35;
                }
                if ((i14 & 1533916891) != 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions15 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i3111 = (i14 >> 21) & 14;
                    n2 n2VarD13 = d(z14, lVarV, i3111, 0);
                    int i41117 = i37;
                    androidx.compose.ui.d dVarH13 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i41118 = i41117 << 6;
                    int i41119 = i3111 | 24576 | ((i14 >> 24) & 112) | (i41118 & 896) | (i41118 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar1113 = lVar5;
                    androidx.compose.ui.d dVar17 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar1114 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var16 = z0Var2;
                    p012k90.b.b(value, lVar1114, dVarH13, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var16, keyboardOptions15, zVar3, true, 0, 0, null, null, n2VarD13, lVar6, (i14 & 14) | ((i41117 >> 3) & 112) | ((i14 << 6) & 7168), i41119, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var16;
                    keyboardOptions2 = keyboardOptions15;
                    zVar4 = zVar3;
                    dVar4 = dVar17;
                    lVar7 = lVar1113;
                    lVar8 = lVar1114;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions16 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i3112 = (i14 >> 21) & 14;
                    n2 n2VarD14 = d(z14, lVarV, i3112, 0);
                    int i411110 = i37;
                    androidx.compose.ui.d dVarH14 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i411111 = i411110 << 6;
                    int i411112 = i3112 | 24576 | ((i14 >> 24) & 112) | (i411111 & 896) | (i411111 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar1115 = lVar5;
                    androidx.compose.ui.d dVar18 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar1116 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var17 = z0Var2;
                    p012k90.b.b(value, lVar1116, dVarH14, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var17, keyboardOptions16, zVar3, true, 0, 0, null, null, n2VarD14, lVar6, (i14 & 14) | ((i411110 >> 3) & 112) | ((i14 << 6) & 7168), i411112, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var17;
                    keyboardOptions2 = keyboardOptions16;
                    zVar4 = zVar3;
                    dVar4 = dVar18;
                    lVar7 = lVar1115;
                    lVar8 = lVar1116;
                }
                w2VarX = lVar6.x();
                if (w2VarX != null) {
                    w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                }
            }
            i21 = 12582912;
            i14 |= i21;
            i22 = i13 & 256;
            if (i22 != 0) {
                i14 |= 100663296;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i11 & 234881024) == 0) {
                    if (lVarV.n(dVar2)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 512;
            if (i24 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 1879048192) == 0) {
                if (lVarV.n(z0Var)) {
                    i25 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i25 = 268435456;
                }
                i14 |= i25;
            }
            i26 = i13 & 1024;
            if (i26 != 0) {
                i27 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (lVarV.n(keyboardOptions)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i12 | i28;
            } else {
                i27 = i12;
            }
            if ((i12 & 112) != 0) {
                if ((i13 & 2048) == 0) {
                    i38 = 32;
                }
                i27 |= i38;
            }
            i29 = i27;
            i31 = i13 & 4096;
            if (i31 != 0) {
                i33 = i29 | KyberEngine.KyberPolyBytes;
            } else {
                i32 = i29;
                if ((i12 & 896) != 0) {
                    i32 |= lVarV.K(lVar) ? 256 : 128;
                }
                i33 = i32;
            }
            i34 = i13 & PKIFailureInfo.certRevoked;
            if (i34 != 0) {
                i36 = i33 | 3072;
            } else {
                i35 = i33;
                if ((i12 & 7168) != 0) {
                    i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                }
                i36 = i35;
            }
            if ((i14 & 1533916891) != 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                }
                lVarV.C();
                KeyboardOptions keyboardOptions17 = keyboardOptionsA;
                if (p020r2.o.J()) {
                    p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                }
                int i3113 = (i14 >> 21) & 14;
                n2 n2VarD15 = d(z14, lVarV, i3113, 0);
                int i411113 = i37;
                androidx.compose.ui.d dVarH15 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                if (str != null) {
                    aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                } else {
                    aVarB = null;
                }
                if (str2 != null) {
                    aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                } else {
                    aVarB2 = null;
                }
                if (w1Var != null) {
                    aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                } else {
                    aVarB3 = null;
                }
                int i411114 = i411113 << 6;
                int i411115 = i3113 | 24576 | ((i14 >> 24) & 112) | (i411114 & 896) | (i411114 & 7168);
                wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar1117 = lVar5;
                androidx.compose.ui.d dVar19 = dVar3;
                wn0.l<? super TextFieldValue, jn0.h0> lVar1118 = lVar4;
                lVar6 = lVarV;
                z0 z0Var18 = z0Var2;
                p012k90.b.b(value, lVar1118, dVarH15, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var18, keyboardOptions17, zVar3, true, 0, 0, null, null, n2VarD15, lVar6, (i14 & 14) | ((i411113 >> 3) & 112) | ((i14 << 6) & 7168), i411115, 491824);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z0Var3 = z0Var18;
                keyboardOptions2 = keyboardOptions17;
                zVar4 = zVar3;
                dVar4 = dVar19;
                lVar7 = lVar1117;
                lVar8 = lVar1118;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                }
                lVarV.C();
                KeyboardOptions keyboardOptions18 = keyboardOptionsA;
                if (p020r2.o.J()) {
                    p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                }
                int i3114 = (i14 >> 21) & 14;
                n2 n2VarD16 = d(z14, lVarV, i3114, 0);
                int i411116 = i37;
                androidx.compose.ui.d dVarH16 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                if (str != null) {
                    aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                } else {
                    aVarB = null;
                }
                if (str2 != null) {
                    aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                } else {
                    aVarB2 = null;
                }
                if (w1Var != null) {
                    aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                } else {
                    aVarB3 = null;
                }
                int i411117 = i411116 << 6;
                int i411118 = i3114 | 24576 | ((i14 >> 24) & 112) | (i411117 & 896) | (i411117 & 7168);
                wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar1119 = lVar5;
                androidx.compose.ui.d dVar110 = dVar3;
                wn0.l<? super TextFieldValue, jn0.h0> lVar11110 = lVar4;
                lVar6 = lVarV;
                z0 z0Var19 = z0Var2;
                p012k90.b.b(value, lVar11110, dVarH16, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var19, keyboardOptions18, zVar3, true, 0, 0, null, null, n2VarD16, lVar6, (i14 & 14) | ((i411116 >> 3) & 112) | ((i14 << 6) & 7168), i411118, 491824);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z0Var3 = z0Var19;
                keyboardOptions2 = keyboardOptions18;
                zVar4 = zVar3;
                dVar4 = dVar110;
                lVar7 = lVar1119;
                lVar8 = lVar11110;
            }
            w2VarX = lVar6.x();
            if (w2VarX != null) {
                w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
            }
        }
        i14 |= 48;
        if ((i13 & 4) != 0) {
            i14 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            if (lVarV.p(z12)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i14 |= i15;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (lVarV.n(str)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i14 |= i16;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (lVarV.n(str2)) {
                i17 = 16384;
            } else {
                i17 = PKIFailureInfo.certRevoked;
            }
            i14 |= i17;
        }
        if ((i13 & 32) != 0) {
            if ((458752 & i11) == 0) {
                if (lVarV.n(w1Var)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
            }
            if ((i13 & 64) != 0) {
                if ((3670016 & i11) == 0) {
                    if (lVarV.p(z13)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((i13 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (lVarV.p(z14)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                    }
                    i22 = i13 & 256;
                    if (i22 != 0) {
                        i14 |= 100663296;
                        dVar2 = dVar;
                    } else {
                        dVar2 = dVar;
                        if ((i11 & 234881024) == 0) {
                            if (lVarV.n(dVar2)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i14 |= i23;
                        }
                    }
                    i24 = i13 & 512;
                    if (i24 != 0) {
                        i14 |= 805306368;
                    } else if ((i11 & 1879048192) == 0) {
                        if (lVarV.n(z0Var)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                        i14 |= i25;
                    }
                    i26 = i13 & 1024;
                    if (i26 != 0) {
                        i27 = i12 | 6;
                    } else if ((i12 & 14) == 0) {
                        if (lVarV.n(keyboardOptions)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i12 | i28;
                    } else {
                        i27 = i12;
                    }
                    if ((i12 & 112) != 0) {
                        if ((i13 & 2048) == 0) {
                            i38 = 32;
                        }
                        i27 |= i38;
                    }
                    i29 = i27;
                    i31 = i13 & 4096;
                    if (i31 != 0) {
                        i33 = i29 | KyberEngine.KyberPolyBytes;
                    } else {
                        i32 = i29;
                        if ((i12 & 896) != 0) {
                            i32 |= lVarV.K(lVar) ? 256 : 128;
                        }
                        i33 = i32;
                    }
                    i34 = i13 & PKIFailureInfo.certRevoked;
                    if (i34 != 0) {
                        i36 = i33 | 3072;
                    } else {
                        i35 = i33;
                        if ((i12 & 7168) != 0) {
                            i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                        }
                        i36 = i35;
                    }
                    if ((i14 & 1533916891) != 306783378) {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        }
                        lVarV.C();
                        KeyboardOptions keyboardOptions19 = keyboardOptionsA;
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                        }
                        int i3115 = (i14 >> 21) & 14;
                        n2 n2VarD17 = d(z14, lVarV, i3115, 0);
                        int i411119 = i37;
                        androidx.compose.ui.d dVarH17 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                        if (str != null) {
                            aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                        } else {
                            aVarB = null;
                        }
                        if (str2 != null) {
                            aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                        } else {
                            aVarB2 = null;
                        }
                        if (w1Var != null) {
                            aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                        } else {
                            aVarB3 = null;
                        }
                        int i4111110 = i411119 << 6;
                        int i4111111 = i3115 | 24576 | ((i14 >> 24) & 112) | (i4111110 & 896) | (i4111110 & 7168);
                        wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar11111 = lVar5;
                        androidx.compose.ui.d dVar111 = dVar3;
                        wn0.l<? super TextFieldValue, jn0.h0> lVar11112 = lVar4;
                        lVar6 = lVarV;
                        z0 z0Var110 = z0Var2;
                        p012k90.b.b(value, lVar11112, dVarH17, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var110, keyboardOptions19, zVar3, true, 0, 0, null, null, n2VarD17, lVar6, (i14 & 14) | ((i411119 >> 3) & 112) | ((i14 << 6) & 7168), i4111111, 491824);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        z0Var3 = z0Var110;
                        keyboardOptions2 = keyboardOptions19;
                        zVar4 = zVar3;
                        dVar4 = dVar111;
                        lVar7 = lVar11111;
                        lVar8 = lVar11112;
                    } else {
                        lVarV.L();
                        if ((i11 & 1) != 0) {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        } else {
                            if (i22 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i24 != 0) {
                                z0VarC = z0.INSTANCE.c();
                            } else {
                                z0VarC = z0Var;
                            }
                            if (i26 != 0) {
                                keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                            } else {
                                keyboardOptionsA = keyboardOptions;
                            }
                            if ((i13 & 2048) != 0) {
                                zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                                i36 &= -113;
                            } else {
                                zVar2 = zVar;
                            }
                            if (i31 != 0) {
                                lVar4 = r.f76412c;
                            } else {
                                lVar4 = lVar;
                            }
                            if (i34 != 0) {
                                z0Var2 = z0VarC;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = s.f76413c;
                                zVar3 = zVar2;
                            } else {
                                z0Var2 = z0VarC;
                                zVar3 = zVar2;
                                i37 = i36;
                                dVar3 = dVar2;
                                lVar5 = lVar2;
                            }
                        }
                        lVarV.C();
                        KeyboardOptions keyboardOptions110 = keyboardOptionsA;
                        if (p020r2.o.J()) {
                            p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                        }
                        int i3116 = (i14 >> 21) & 14;
                        n2 n2VarD18 = d(z14, lVarV, i3116, 0);
                        int i4111112 = i37;
                        androidx.compose.ui.d dVarH18 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                        if (str != null) {
                            aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                        } else {
                            aVarB = null;
                        }
                        if (str2 != null) {
                            aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                        } else {
                            aVarB2 = null;
                        }
                        if (w1Var != null) {
                            aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                        } else {
                            aVarB3 = null;
                        }
                        int i4111113 = i4111112 << 6;
                        int i4111114 = i3116 | 24576 | ((i14 >> 24) & 112) | (i4111113 & 896) | (i4111113 & 7168);
                        wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar11113 = lVar5;
                        androidx.compose.ui.d dVar112 = dVar3;
                        wn0.l<? super TextFieldValue, jn0.h0> lVar11114 = lVar4;
                        lVar6 = lVarV;
                        z0 z0Var111 = z0Var2;
                        p012k90.b.b(value, lVar11114, dVarH18, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var111, keyboardOptions110, zVar3, true, 0, 0, null, null, n2VarD18, lVar6, (i14 & 14) | ((i4111112 >> 3) & 112) | ((i14 << 6) & 7168), i4111114, 491824);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        z0Var3 = z0Var111;
                        keyboardOptions2 = keyboardOptions110;
                        zVar4 = zVar3;
                        dVar4 = dVar112;
                        lVar7 = lVar11113;
                        lVar8 = lVar11114;
                    }
                    w2VarX = lVar6.x();
                    if (w2VarX != null) {
                        w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                    }
                }
                i21 = 12582912;
                i14 |= i21;
                i22 = i13 & 256;
                if (i22 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i11 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 512;
                if (i24 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 1879048192) == 0) {
                    if (lVarV.n(z0Var)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 1024;
                if (i26 != 0) {
                    i27 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (lVarV.n(keyboardOptions)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i12 | i28;
                } else {
                    i27 = i12;
                }
                if ((i12 & 112) != 0) {
                    if ((i13 & 2048) == 0) {
                        i38 = 32;
                    }
                    i27 |= i38;
                }
                i29 = i27;
                i31 = i13 & 4096;
                if (i31 != 0) {
                    i33 = i29 | KyberEngine.KyberPolyBytes;
                } else {
                    i32 = i29;
                    if ((i12 & 896) != 0) {
                        i32 |= lVarV.K(lVar) ? 256 : 128;
                    }
                    i33 = i32;
                }
                i34 = i13 & PKIFailureInfo.certRevoked;
                if (i34 != 0) {
                    i36 = i33 | 3072;
                } else {
                    i35 = i33;
                    if ((i12 & 7168) != 0) {
                        i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                    }
                    i36 = i35;
                }
                if ((i14 & 1533916891) != 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions111 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i3117 = (i14 >> 21) & 14;
                    n2 n2VarD19 = d(z14, lVarV, i3117, 0);
                    int i4111115 = i37;
                    androidx.compose.ui.d dVarH19 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i4111116 = i4111115 << 6;
                    int i4111117 = i3117 | 24576 | ((i14 >> 24) & 112) | (i4111116 & 896) | (i4111116 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar11115 = lVar5;
                    androidx.compose.ui.d dVar113 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar11116 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var112 = z0Var2;
                    p012k90.b.b(value, lVar11116, dVarH19, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var112, keyboardOptions111, zVar3, true, 0, 0, null, null, n2VarD19, lVar6, (i14 & 14) | ((i4111115 >> 3) & 112) | ((i14 << 6) & 7168), i4111117, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var112;
                    keyboardOptions2 = keyboardOptions111;
                    zVar4 = zVar3;
                    dVar4 = dVar113;
                    lVar7 = lVar11115;
                    lVar8 = lVar11116;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions112 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i3118 = (i14 >> 21) & 14;
                    n2 n2VarD110 = d(z14, lVarV, i3118, 0);
                    int i4111118 = i37;
                    androidx.compose.ui.d dVarH110 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i4111119 = i4111118 << 6;
                    int i41111110 = i3118 | 24576 | ((i14 >> 24) & 112) | (i4111119 & 896) | (i4111119 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar11117 = lVar5;
                    androidx.compose.ui.d dVar114 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar11118 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var113 = z0Var2;
                    p012k90.b.b(value, lVar11118, dVarH110, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var113, keyboardOptions112, zVar3, true, 0, 0, null, null, n2VarD110, lVar6, (i14 & 14) | ((i4111118 >> 3) & 112) | ((i14 << 6) & 7168), i41111110, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var113;
                    keyboardOptions2 = keyboardOptions112;
                    zVar4 = zVar3;
                    dVar4 = dVar114;
                    lVar7 = lVar11117;
                    lVar8 = lVar11118;
                }
                w2VarX = lVar6.x();
                if (w2VarX != null) {
                    w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                }
            }
            i19 = 1572864;
            i14 |= i19;
            if ((i13 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (lVarV.p(z14)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                }
                i22 = i13 & 256;
                if (i22 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i11 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 512;
                if (i24 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 1879048192) == 0) {
                    if (lVarV.n(z0Var)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 1024;
                if (i26 != 0) {
                    i27 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (lVarV.n(keyboardOptions)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i12 | i28;
                } else {
                    i27 = i12;
                }
                if ((i12 & 112) != 0) {
                    if ((i13 & 2048) == 0) {
                        i38 = 32;
                    }
                    i27 |= i38;
                }
                i29 = i27;
                i31 = i13 & 4096;
                if (i31 != 0) {
                    i33 = i29 | KyberEngine.KyberPolyBytes;
                } else {
                    i32 = i29;
                    if ((i12 & 896) != 0) {
                        i32 |= lVarV.K(lVar) ? 256 : 128;
                    }
                    i33 = i32;
                }
                i34 = i13 & PKIFailureInfo.certRevoked;
                if (i34 != 0) {
                    i36 = i33 | 3072;
                } else {
                    i35 = i33;
                    if ((i12 & 7168) != 0) {
                        i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                    }
                    i36 = i35;
                }
                if ((i14 & 1533916891) != 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions113 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i3119 = (i14 >> 21) & 14;
                    n2 n2VarD111 = d(z14, lVarV, i3119, 0);
                    int i41111111 = i37;
                    androidx.compose.ui.d dVarH111 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i41111112 = i41111111 << 6;
                    int i41111113 = i3119 | 24576 | ((i14 >> 24) & 112) | (i41111112 & 896) | (i41111112 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar11119 = lVar5;
                    androidx.compose.ui.d dVar115 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar111110 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var114 = z0Var2;
                    p012k90.b.b(value, lVar111110, dVarH111, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var114, keyboardOptions113, zVar3, true, 0, 0, null, null, n2VarD111, lVar6, (i14 & 14) | ((i41111111 >> 3) & 112) | ((i14 << 6) & 7168), i41111113, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var114;
                    keyboardOptions2 = keyboardOptions113;
                    zVar4 = zVar3;
                    dVar4 = dVar115;
                    lVar7 = lVar11119;
                    lVar8 = lVar111110;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions114 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i31110 = (i14 >> 21) & 14;
                    n2 n2VarD112 = d(z14, lVarV, i31110, 0);
                    int i41111114 = i37;
                    androidx.compose.ui.d dVarH112 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i41111115 = i41111114 << 6;
                    int i41111116 = i31110 | 24576 | ((i14 >> 24) & 112) | (i41111115 & 896) | (i41111115 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar111111 = lVar5;
                    androidx.compose.ui.d dVar116 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar111112 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var115 = z0Var2;
                    p012k90.b.b(value, lVar111112, dVarH112, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var115, keyboardOptions114, zVar3, true, 0, 0, null, null, n2VarD112, lVar6, (i14 & 14) | ((i41111114 >> 3) & 112) | ((i14 << 6) & 7168), i41111116, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var115;
                    keyboardOptions2 = keyboardOptions114;
                    zVar4 = zVar3;
                    dVar4 = dVar116;
                    lVar7 = lVar111111;
                    lVar8 = lVar111112;
                }
                w2VarX = lVar6.x();
                if (w2VarX != null) {
                    w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                }
            }
            i21 = 12582912;
            i14 |= i21;
            i22 = i13 & 256;
            if (i22 != 0) {
                i14 |= 100663296;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i11 & 234881024) == 0) {
                    if (lVarV.n(dVar2)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 512;
            if (i24 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 1879048192) == 0) {
                if (lVarV.n(z0Var)) {
                    i25 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i25 = 268435456;
                }
                i14 |= i25;
            }
            i26 = i13 & 1024;
            if (i26 != 0) {
                i27 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (lVarV.n(keyboardOptions)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i12 | i28;
            } else {
                i27 = i12;
            }
            if ((i12 & 112) != 0) {
                if ((i13 & 2048) == 0) {
                    i38 = 32;
                }
                i27 |= i38;
            }
            i29 = i27;
            i31 = i13 & 4096;
            if (i31 != 0) {
                i33 = i29 | KyberEngine.KyberPolyBytes;
            } else {
                i32 = i29;
                if ((i12 & 896) != 0) {
                    i32 |= lVarV.K(lVar) ? 256 : 128;
                }
                i33 = i32;
            }
            i34 = i13 & PKIFailureInfo.certRevoked;
            if (i34 != 0) {
                i36 = i33 | 3072;
            } else {
                i35 = i33;
                if ((i12 & 7168) != 0) {
                    i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                }
                i36 = i35;
            }
            if ((i14 & 1533916891) != 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                }
                lVarV.C();
                KeyboardOptions keyboardOptions115 = keyboardOptionsA;
                if (p020r2.o.J()) {
                    p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                }
                int i31111 = (i14 >> 21) & 14;
                n2 n2VarD113 = d(z14, lVarV, i31111, 0);
                int i41111117 = i37;
                androidx.compose.ui.d dVarH113 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                if (str != null) {
                    aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                } else {
                    aVarB = null;
                }
                if (str2 != null) {
                    aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                } else {
                    aVarB2 = null;
                }
                if (w1Var != null) {
                    aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                } else {
                    aVarB3 = null;
                }
                int i41111118 = i41111117 << 6;
                int i41111119 = i31111 | 24576 | ((i14 >> 24) & 112) | (i41111118 & 896) | (i41111118 & 7168);
                wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar111113 = lVar5;
                androidx.compose.ui.d dVar117 = dVar3;
                wn0.l<? super TextFieldValue, jn0.h0> lVar111114 = lVar4;
                lVar6 = lVarV;
                z0 z0Var116 = z0Var2;
                p012k90.b.b(value, lVar111114, dVarH113, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var116, keyboardOptions115, zVar3, true, 0, 0, null, null, n2VarD113, lVar6, (i14 & 14) | ((i41111117 >> 3) & 112) | ((i14 << 6) & 7168), i41111119, 491824);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z0Var3 = z0Var116;
                keyboardOptions2 = keyboardOptions115;
                zVar4 = zVar3;
                dVar4 = dVar117;
                lVar7 = lVar111113;
                lVar8 = lVar111114;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                }
                lVarV.C();
                KeyboardOptions keyboardOptions116 = keyboardOptionsA;
                if (p020r2.o.J()) {
                    p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                }
                int i31112 = (i14 >> 21) & 14;
                n2 n2VarD114 = d(z14, lVarV, i31112, 0);
                int i411111110 = i37;
                androidx.compose.ui.d dVarH114 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                if (str != null) {
                    aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                } else {
                    aVarB = null;
                }
                if (str2 != null) {
                    aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                } else {
                    aVarB2 = null;
                }
                if (w1Var != null) {
                    aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                } else {
                    aVarB3 = null;
                }
                int i411111111 = i411111110 << 6;
                int i411111112 = i31112 | 24576 | ((i14 >> 24) & 112) | (i411111111 & 896) | (i411111111 & 7168);
                wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar111115 = lVar5;
                androidx.compose.ui.d dVar118 = dVar3;
                wn0.l<? super TextFieldValue, jn0.h0> lVar111116 = lVar4;
                lVar6 = lVarV;
                z0 z0Var117 = z0Var2;
                p012k90.b.b(value, lVar111116, dVarH114, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var117, keyboardOptions116, zVar3, true, 0, 0, null, null, n2VarD114, lVar6, (i14 & 14) | ((i411111110 >> 3) & 112) | ((i14 << 6) & 7168), i411111112, 491824);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z0Var3 = z0Var117;
                keyboardOptions2 = keyboardOptions116;
                zVar4 = zVar3;
                dVar4 = dVar118;
                lVar7 = lVar111115;
                lVar8 = lVar111116;
            }
            w2VarX = lVar6.x();
            if (w2VarX != null) {
                w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
            }
        }
        i18 = 196608;
        i14 |= i18;
        if ((i13 & 64) != 0) {
            if ((3670016 & i11) == 0) {
                if (lVarV.p(z13)) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
            }
            if ((i13 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (lVarV.p(z14)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                }
                i22 = i13 & 256;
                if (i22 != 0) {
                    i14 |= 100663296;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    if ((i11 & 234881024) == 0) {
                        if (lVarV.n(dVar2)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 512;
                if (i24 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 1879048192) == 0) {
                    if (lVarV.n(z0Var)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 1024;
                if (i26 != 0) {
                    i27 = i12 | 6;
                } else if ((i12 & 14) == 0) {
                    if (lVarV.n(keyboardOptions)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i12 | i28;
                } else {
                    i27 = i12;
                }
                if ((i12 & 112) != 0) {
                    if ((i13 & 2048) == 0) {
                        i38 = 32;
                    }
                    i27 |= i38;
                }
                i29 = i27;
                i31 = i13 & 4096;
                if (i31 != 0) {
                    i33 = i29 | KyberEngine.KyberPolyBytes;
                } else {
                    i32 = i29;
                    if ((i12 & 896) != 0) {
                        i32 |= lVarV.K(lVar) ? 256 : 128;
                    }
                    i33 = i32;
                }
                i34 = i13 & PKIFailureInfo.certRevoked;
                if (i34 != 0) {
                    i36 = i33 | 3072;
                } else {
                    i35 = i33;
                    if ((i12 & 7168) != 0) {
                        i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                    }
                    i36 = i35;
                }
                if ((i14 & 1533916891) != 306783378) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions117 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i31113 = (i14 >> 21) & 14;
                    n2 n2VarD115 = d(z14, lVarV, i31113, 0);
                    int i411111113 = i37;
                    androidx.compose.ui.d dVarH115 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i411111114 = i411111113 << 6;
                    int i411111115 = i31113 | 24576 | ((i14 >> 24) & 112) | (i411111114 & 896) | (i411111114 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar111117 = lVar5;
                    androidx.compose.ui.d dVar119 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar111118 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var118 = z0Var2;
                    p012k90.b.b(value, lVar111118, dVarH115, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var118, keyboardOptions117, zVar3, true, 0, 0, null, null, n2VarD115, lVar6, (i14 & 14) | ((i411111113 >> 3) & 112) | ((i14 << 6) & 7168), i411111115, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var118;
                    keyboardOptions2 = keyboardOptions117;
                    zVar4 = zVar3;
                    dVar4 = dVar119;
                    lVar7 = lVar111117;
                    lVar8 = lVar111118;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i24 != 0) {
                            z0VarC = z0.INSTANCE.c();
                        } else {
                            z0VarC = z0Var;
                        }
                        if (i26 != 0) {
                            keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                        } else {
                            keyboardOptionsA = keyboardOptions;
                        }
                        if ((i13 & 2048) != 0) {
                            zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                            i36 &= -113;
                        } else {
                            zVar2 = zVar;
                        }
                        if (i31 != 0) {
                            lVar4 = r.f76412c;
                        } else {
                            lVar4 = lVar;
                        }
                        if (i34 != 0) {
                            z0Var2 = z0VarC;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = s.f76413c;
                            zVar3 = zVar2;
                        } else {
                            z0Var2 = z0VarC;
                            zVar3 = zVar2;
                            i37 = i36;
                            dVar3 = dVar2;
                            lVar5 = lVar2;
                        }
                    }
                    lVarV.C();
                    KeyboardOptions keyboardOptions118 = keyboardOptionsA;
                    if (p020r2.o.J()) {
                        p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                    }
                    int i31114 = (i14 >> 21) & 14;
                    n2 n2VarD116 = d(z14, lVarV, i31114, 0);
                    int i411111116 = i37;
                    androidx.compose.ui.d dVarH116 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                    if (str != null) {
                        aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                    } else {
                        aVarB = null;
                    }
                    if (str2 != null) {
                        aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                    } else {
                        aVarB2 = null;
                    }
                    if (w1Var != null) {
                        aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                    } else {
                        aVarB3 = null;
                    }
                    int i411111117 = i411111116 << 6;
                    int i411111118 = i31114 | 24576 | ((i14 >> 24) & 112) | (i411111117 & 896) | (i411111117 & 7168);
                    wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar111119 = lVar5;
                    androidx.compose.ui.d dVar1110 = dVar3;
                    wn0.l<? super TextFieldValue, jn0.h0> lVar1111110 = lVar4;
                    lVar6 = lVarV;
                    z0 z0Var119 = z0Var2;
                    p012k90.b.b(value, lVar1111110, dVarH116, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var119, keyboardOptions118, zVar3, true, 0, 0, null, null, n2VarD116, lVar6, (i14 & 14) | ((i411111116 >> 3) & 112) | ((i14 << 6) & 7168), i411111118, 491824);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    z0Var3 = z0Var119;
                    keyboardOptions2 = keyboardOptions118;
                    zVar4 = zVar3;
                    dVar4 = dVar1110;
                    lVar7 = lVar111119;
                    lVar8 = lVar1111110;
                }
                w2VarX = lVar6.x();
                if (w2VarX != null) {
                    w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
                }
            }
            i21 = 12582912;
            i14 |= i21;
            i22 = i13 & 256;
            if (i22 != 0) {
                i14 |= 100663296;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i11 & 234881024) == 0) {
                    if (lVarV.n(dVar2)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 512;
            if (i24 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 1879048192) == 0) {
                if (lVarV.n(z0Var)) {
                    i25 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i25 = 268435456;
                }
                i14 |= i25;
            }
            i26 = i13 & 1024;
            if (i26 != 0) {
                i27 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (lVarV.n(keyboardOptions)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i12 | i28;
            } else {
                i27 = i12;
            }
            if ((i12 & 112) != 0) {
                if ((i13 & 2048) == 0) {
                    i38 = 32;
                }
                i27 |= i38;
            }
            i29 = i27;
            i31 = i13 & 4096;
            if (i31 != 0) {
                i33 = i29 | KyberEngine.KyberPolyBytes;
            } else {
                i32 = i29;
                if ((i12 & 896) != 0) {
                    i32 |= lVarV.K(lVar) ? 256 : 128;
                }
                i33 = i32;
            }
            i34 = i13 & PKIFailureInfo.certRevoked;
            if (i34 != 0) {
                i36 = i33 | 3072;
            } else {
                i35 = i33;
                if ((i12 & 7168) != 0) {
                    i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                }
                i36 = i35;
            }
            if ((i14 & 1533916891) != 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                }
                lVarV.C();
                KeyboardOptions keyboardOptions119 = keyboardOptionsA;
                if (p020r2.o.J()) {
                    p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                }
                int i31115 = (i14 >> 21) & 14;
                n2 n2VarD117 = d(z14, lVarV, i31115, 0);
                int i411111119 = i37;
                androidx.compose.ui.d dVarH117 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                if (str != null) {
                    aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                } else {
                    aVarB = null;
                }
                if (str2 != null) {
                    aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                } else {
                    aVarB2 = null;
                }
                if (w1Var != null) {
                    aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                } else {
                    aVarB3 = null;
                }
                int i4111111110 = i411111119 << 6;
                int i4111111111 = i31115 | 24576 | ((i14 >> 24) & 112) | (i4111111110 & 896) | (i4111111110 & 7168);
                wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar1111111 = lVar5;
                androidx.compose.ui.d dVar1111 = dVar3;
                wn0.l<? super TextFieldValue, jn0.h0> lVar1111112 = lVar4;
                lVar6 = lVarV;
                z0 z0Var1110 = z0Var2;
                p012k90.b.b(value, lVar1111112, dVarH117, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var1110, keyboardOptions119, zVar3, true, 0, 0, null, null, n2VarD117, lVar6, (i14 & 14) | ((i411111119 >> 3) & 112) | ((i14 << 6) & 7168), i4111111111, 491824);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z0Var3 = z0Var1110;
                keyboardOptions2 = keyboardOptions119;
                zVar4 = zVar3;
                dVar4 = dVar1111;
                lVar7 = lVar1111111;
                lVar8 = lVar1111112;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                }
                lVarV.C();
                KeyboardOptions keyboardOptions1110 = keyboardOptionsA;
                if (p020r2.o.J()) {
                    p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                }
                int i31116 = (i14 >> 21) & 14;
                n2 n2VarD118 = d(z14, lVarV, i31116, 0);
                int i4111111112 = i37;
                androidx.compose.ui.d dVarH118 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                if (str != null) {
                    aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                } else {
                    aVarB = null;
                }
                if (str2 != null) {
                    aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                } else {
                    aVarB2 = null;
                }
                if (w1Var != null) {
                    aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                } else {
                    aVarB3 = null;
                }
                int i4111111113 = i4111111112 << 6;
                int i4111111114 = i31116 | 24576 | ((i14 >> 24) & 112) | (i4111111113 & 896) | (i4111111113 & 7168);
                wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar1111113 = lVar5;
                androidx.compose.ui.d dVar1112 = dVar3;
                wn0.l<? super TextFieldValue, jn0.h0> lVar1111114 = lVar4;
                lVar6 = lVarV;
                z0 z0Var1111 = z0Var2;
                p012k90.b.b(value, lVar1111114, dVarH118, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var1111, keyboardOptions1110, zVar3, true, 0, 0, null, null, n2VarD118, lVar6, (i14 & 14) | ((i4111111112 >> 3) & 112) | ((i14 << 6) & 7168), i4111111114, 491824);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z0Var3 = z0Var1111;
                keyboardOptions2 = keyboardOptions1110;
                zVar4 = zVar3;
                dVar4 = dVar1112;
                lVar7 = lVar1111113;
                lVar8 = lVar1111114;
            }
            w2VarX = lVar6.x();
            if (w2VarX != null) {
                w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
            }
        }
        i19 = 1572864;
        i14 |= i19;
        if ((i13 & 128) != 0) {
            if ((29360128 & i11) == 0) {
                if (lVarV.p(z14)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
            }
            i22 = i13 & 256;
            if (i22 != 0) {
                i14 |= 100663296;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if ((i11 & 234881024) == 0) {
                    if (lVarV.n(dVar2)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 512;
            if (i24 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 1879048192) == 0) {
                if (lVarV.n(z0Var)) {
                    i25 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i25 = 268435456;
                }
                i14 |= i25;
            }
            i26 = i13 & 1024;
            if (i26 != 0) {
                i27 = i12 | 6;
            } else if ((i12 & 14) == 0) {
                if (lVarV.n(keyboardOptions)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i12 | i28;
            } else {
                i27 = i12;
            }
            if ((i12 & 112) != 0) {
                if ((i13 & 2048) == 0) {
                    i38 = 32;
                }
                i27 |= i38;
            }
            i29 = i27;
            i31 = i13 & 4096;
            if (i31 != 0) {
                i33 = i29 | KyberEngine.KyberPolyBytes;
            } else {
                i32 = i29;
                if ((i12 & 896) != 0) {
                    i32 |= lVarV.K(lVar) ? 256 : 128;
                }
                i33 = i32;
            }
            i34 = i13 & PKIFailureInfo.certRevoked;
            if (i34 != 0) {
                i36 = i33 | 3072;
            } else {
                i35 = i33;
                if ((i12 & 7168) != 0) {
                    i35 |= lVarV.K(lVar2) ? 2048 : 1024;
                }
                i36 = i35;
            }
            if ((i14 & 1533916891) != 306783378) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                }
                lVarV.C();
                KeyboardOptions keyboardOptions1111 = keyboardOptionsA;
                if (p020r2.o.J()) {
                    p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                }
                int i31117 = (i14 >> 21) & 14;
                n2 n2VarD119 = d(z14, lVarV, i31117, 0);
                int i4111111115 = i37;
                androidx.compose.ui.d dVarH119 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                if (str != null) {
                    aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                } else {
                    aVarB = null;
                }
                if (str2 != null) {
                    aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                } else {
                    aVarB2 = null;
                }
                if (w1Var != null) {
                    aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                } else {
                    aVarB3 = null;
                }
                int i4111111116 = i4111111115 << 6;
                int i4111111117 = i31117 | 24576 | ((i14 >> 24) & 112) | (i4111111116 & 896) | (i4111111116 & 7168);
                wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar1111115 = lVar5;
                androidx.compose.ui.d dVar1113 = dVar3;
                wn0.l<? super TextFieldValue, jn0.h0> lVar1111116 = lVar4;
                lVar6 = lVarV;
                z0 z0Var1112 = z0Var2;
                p012k90.b.b(value, lVar1111116, dVarH119, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var1112, keyboardOptions1111, zVar3, true, 0, 0, null, null, n2VarD119, lVar6, (i14 & 14) | ((i4111111115 >> 3) & 112) | ((i14 << 6) & 7168), i4111111117, 491824);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z0Var3 = z0Var1112;
                keyboardOptions2 = keyboardOptions1111;
                zVar4 = zVar3;
                dVar4 = dVar1113;
                lVar7 = lVar1111115;
                lVar8 = lVar1111116;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i24 != 0) {
                        z0VarC = z0.INSTANCE.c();
                    } else {
                        z0VarC = z0Var;
                    }
                    if (i26 != 0) {
                        keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                    } else {
                        keyboardOptionsA = keyboardOptions;
                    }
                    if ((i13 & 2048) != 0) {
                        zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                        i36 &= -113;
                    } else {
                        zVar2 = zVar;
                    }
                    if (i31 != 0) {
                        lVar4 = r.f76412c;
                    } else {
                        lVar4 = lVar;
                    }
                    if (i34 != 0) {
                        z0Var2 = z0VarC;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = s.f76413c;
                        zVar3 = zVar2;
                    } else {
                        z0Var2 = z0VarC;
                        zVar3 = zVar2;
                        i37 = i36;
                        dVar3 = dVar2;
                        lVar5 = lVar2;
                    }
                }
                lVarV.C();
                KeyboardOptions keyboardOptions1112 = keyboardOptionsA;
                if (p020r2.o.J()) {
                    p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
                }
                int i31118 = (i14 >> 21) & 14;
                n2 n2VarD1110 = d(z14, lVarV, i31118, 0);
                int i4111111118 = i37;
                androidx.compose.ui.d dVarH1110 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
                if (str != null) {
                    aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
                } else {
                    aVarB = null;
                }
                if (str2 != null) {
                    aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
                } else {
                    aVarB2 = null;
                }
                if (w1Var != null) {
                    aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
                } else {
                    aVarB3 = null;
                }
                int i4111111119 = i4111111118 << 6;
                int i41111111110 = i31118 | 24576 | ((i14 >> 24) & 112) | (i4111111119 & 896) | (i4111111119 & 7168);
                wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar1111117 = lVar5;
                androidx.compose.ui.d dVar1114 = dVar3;
                wn0.l<? super TextFieldValue, jn0.h0> lVar1111118 = lVar4;
                lVar6 = lVarV;
                z0 z0Var1113 = z0Var2;
                p012k90.b.b(value, lVar1111118, dVarH1110, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var1113, keyboardOptions1112, zVar3, true, 0, 0, null, null, n2VarD1110, lVar6, (i14 & 14) | ((i4111111118 >> 3) & 112) | ((i14 << 6) & 7168), i41111111110, 491824);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                z0Var3 = z0Var1113;
                keyboardOptions2 = keyboardOptions1112;
                zVar4 = zVar3;
                dVar4 = dVar1114;
                lVar7 = lVar1111117;
                lVar8 = lVar1111118;
            }
            w2VarX = lVar6.x();
            if (w2VarX != null) {
                w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
            }
        }
        i21 = 12582912;
        i14 |= i21;
        i22 = i13 & 256;
        if (i22 != 0) {
            i14 |= 100663296;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if ((i11 & 234881024) == 0) {
                if (lVarV.n(dVar2)) {
                    i23 = 67108864;
                } else {
                    i23 = 33554432;
                }
                i14 |= i23;
            }
        }
        i24 = i13 & 512;
        if (i24 != 0) {
            i14 |= 805306368;
        } else if ((i11 & 1879048192) == 0) {
            if (lVarV.n(z0Var)) {
                i25 = PKIFailureInfo.duplicateCertReq;
            } else {
                i25 = 268435456;
            }
            i14 |= i25;
        }
        i26 = i13 & 1024;
        if (i26 != 0) {
            i27 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            if (lVarV.n(keyboardOptions)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i27 = i12 | i28;
        } else {
            i27 = i12;
        }
        if ((i12 & 112) != 0) {
            if ((i13 & 2048) == 0) {
                i38 = 32;
            }
            i27 |= i38;
        }
        i29 = i27;
        i31 = i13 & 4096;
        if (i31 != 0) {
            i33 = i29 | KyberEngine.KyberPolyBytes;
        } else {
            i32 = i29;
            if ((i12 & 896) != 0) {
                i32 |= lVarV.K(lVar) ? 256 : 128;
            }
            i33 = i32;
        }
        i34 = i13 & PKIFailureInfo.certRevoked;
        if (i34 != 0) {
            i36 = i33 | 3072;
        } else {
            i35 = i33;
            if ((i12 & 7168) != 0) {
                i35 |= lVarV.K(lVar2) ? 2048 : 1024;
            }
            i36 = i35;
        }
        if ((i14 & 1533916891) != 306783378) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i24 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i26 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if ((i13 & 2048) != 0) {
                    zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                    i36 &= -113;
                } else {
                    zVar2 = zVar;
                }
                if (i31 != 0) {
                    lVar4 = r.f76412c;
                } else {
                    lVar4 = lVar;
                }
                if (i34 != 0) {
                    z0Var2 = z0VarC;
                    i37 = i36;
                    dVar3 = dVar2;
                    lVar5 = s.f76413c;
                    zVar3 = zVar2;
                } else {
                    z0Var2 = z0VarC;
                    zVar3 = zVar2;
                    i37 = i36;
                    dVar3 = dVar2;
                    lVar5 = lVar2;
                }
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i24 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i26 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if ((i13 & 2048) != 0) {
                    zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                    i36 &= -113;
                } else {
                    zVar2 = zVar;
                }
                if (i31 != 0) {
                    lVar4 = r.f76412c;
                } else {
                    lVar4 = lVar;
                }
                if (i34 != 0) {
                    z0Var2 = z0VarC;
                    i37 = i36;
                    dVar3 = dVar2;
                    lVar5 = s.f76413c;
                    zVar3 = zVar2;
                } else {
                    z0Var2 = z0VarC;
                    zVar3 = zVar2;
                    i37 = i36;
                    dVar3 = dVar2;
                    lVar5 = lVar2;
                }
            }
            lVarV.C();
            KeyboardOptions keyboardOptions1113 = keyboardOptionsA;
            if (p020r2.o.J()) {
                p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
            }
            int i31119 = (i14 >> 21) & 14;
            n2 n2VarD1111 = d(z14, lVarV, i31119, 0);
            int i41111111111 = i37;
            androidx.compose.ui.d dVarH1111 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
            if (str != null) {
                aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
            } else {
                aVarB = null;
            }
            if (str2 != null) {
                aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
            } else {
                aVarB2 = null;
            }
            if (w1Var != null) {
                aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
            } else {
                aVarB3 = null;
            }
            int i41111111112 = i41111111111 << 6;
            int i41111111113 = i31119 | 24576 | ((i14 >> 24) & 112) | (i41111111112 & 896) | (i41111111112 & 7168);
            wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar1111119 = lVar5;
            androidx.compose.ui.d dVar1115 = dVar3;
            wn0.l<? super TextFieldValue, jn0.h0> lVar11111110 = lVar4;
            lVar6 = lVarV;
            z0 z0Var1114 = z0Var2;
            p012k90.b.b(value, lVar11111110, dVarH1111, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var1114, keyboardOptions1113, zVar3, true, 0, 0, null, null, n2VarD1111, lVar6, (i14 & 14) | ((i41111111111 >> 3) & 112) | ((i14 << 6) & 7168), i41111111113, 491824);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z0Var3 = z0Var1114;
            keyboardOptions2 = keyboardOptions1113;
            zVar4 = zVar3;
            dVar4 = dVar1115;
            lVar7 = lVar1111119;
            lVar8 = lVar11111110;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i24 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i26 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if ((i13 & 2048) != 0) {
                    zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                    i36 &= -113;
                } else {
                    zVar2 = zVar;
                }
                if (i31 != 0) {
                    lVar4 = r.f76412c;
                } else {
                    lVar4 = lVar;
                }
                if (i34 != 0) {
                    z0Var2 = z0VarC;
                    i37 = i36;
                    dVar3 = dVar2;
                    lVar5 = s.f76413c;
                    zVar3 = zVar2;
                } else {
                    z0Var2 = z0VarC;
                    zVar3 = zVar2;
                    i37 = i36;
                    dVar3 = dVar2;
                    lVar5 = lVar2;
                }
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i24 != 0) {
                    z0VarC = z0.INSTANCE.c();
                } else {
                    z0VarC = z0Var;
                }
                if (i26 != 0) {
                    keyboardOptionsA = KeyboardOptions.INSTANCE.a();
                } else {
                    keyboardOptionsA = keyboardOptions;
                }
                if ((i13 & 2048) != 0) {
                    zVar2 = new kotlin.z(null, null, null, null, null, null, 63, null);
                    i36 &= -113;
                } else {
                    zVar2 = zVar;
                }
                if (i31 != 0) {
                    lVar4 = r.f76412c;
                } else {
                    lVar4 = lVar;
                }
                if (i34 != 0) {
                    z0Var2 = z0VarC;
                    i37 = i36;
                    dVar3 = dVar2;
                    lVar5 = s.f76413c;
                    zVar3 = zVar2;
                } else {
                    z0Var2 = z0VarC;
                    zVar3 = zVar2;
                    i37 = i36;
                    dVar3 = dVar2;
                    lVar5 = lVar2;
                }
            }
            lVarV.C();
            KeyboardOptions keyboardOptions1114 = keyboardOptionsA;
            if (p020r2.o.J()) {
                p020r2.o.S(-1297584226, i14, i37, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:255)");
            }
            int i311110 = (i14 >> 21) & 14;
            n2 n2VarD1112 = d(z14, lVarV, i311110, 0);
            int i41111111114 = i37;
            androidx.compose.ui.d dVarH1112 = androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null);
            if (str != null) {
                aVarB = z2.c.b(lVarV, -560051860, true, new t(z13, str));
            } else {
                aVarB = null;
            }
            if (str2 != null) {
                aVarB2 = z2.c.b(lVarV, -1625019091, true, new u(str2));
            } else {
                aVarB2 = null;
            }
            if (w1Var != null) {
                aVarB3 = z2.c.b(lVarV, -1001636886, true, new v(w1Var, z12, lVar5));
            } else {
                aVarB3 = null;
            }
            int i41111111115 = i41111111114 << 6;
            int i41111111116 = i311110 | 24576 | ((i14 >> 24) & 112) | (i41111111115 & 896) | (i41111111115 & 7168);
            wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar11111111 = lVar5;
            androidx.compose.ui.d dVar1116 = dVar3;
            wn0.l<? super TextFieldValue, jn0.h0> lVar11111112 = lVar4;
            lVar6 = lVarV;
            z0 z0Var1115 = z0Var2;
            p012k90.b.b(value, lVar11111112, dVarH1112, z11, false, null, aVarB, aVarB2, null, aVarB3, z14, z0Var1115, keyboardOptions1114, zVar3, true, 0, 0, null, null, n2VarD1112, lVar6, (i14 & 14) | ((i41111111114 >> 3) & 112) | ((i14 << 6) & 7168), i41111111116, 491824);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            z0Var3 = z0Var1115;
            keyboardOptions2 = keyboardOptions1114;
            zVar4 = zVar3;
            dVar4 = dVar1116;
            lVar7 = lVar11111111;
            lVar8 = lVar11111112;
        }
        w2VarX = lVar6.x();
        if (w2VarX != null) {
            w2VarX.a(new w(value, z11, z12, str, str2, w1Var, z13, z14, dVar4, z0Var3, keyboardOptions2, zVar4, lVar8, lVar7, i11, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1 h(y3<? extends x1> y3Var) {
        return y3Var.getValue();
    }

    private static final Integer i(y3<Integer> y3Var) {
        return y3Var.getValue();
    }

    private static final p0 j(p1<p0> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(p1<p0> p1Var, p0 p0Var) {
        p1Var.setValue(p0Var);
    }

    private static final p0 l(p1<p0> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(p1<p0> p1Var, p0 p0Var) {
        p1Var.setValue(p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(y3<String> y3Var) {
        return y3Var.getValue();
    }

    private static final w1 o(y3<? extends w1> y3Var) {
        return y3Var.getValue();
    }

    private static final boolean p(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }

    private static final boolean q(y3<Boolean> y3Var) {
        return y3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(y3<String> y3Var) {
        return y3Var.getValue();
    }

    private static final String s(y3<String> y3Var) {
        return y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(w1.Dropdown dropdown, boolean z11, wn0.l<? super w1.Dropdown.Item, jn0.h0> lVar, p020r2.l lVar2, int i11) {
        int i12;
        p020r2.l lVarV = lVar2.v(-58118303);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(dropdown) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.p(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.K(lVar) ? 256 : 128;
        }
        int i13 = i12;
        if ((i13 & 731) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-58118303, i13, -1, "com.stripe.android.uicore.elements.TrailingDropdown (TextFieldUI.kt:405)");
            }
            lVarV.H(1538978666);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = s3.d(Boolean.FALSE, null, 2, null);
                lVarV.B(objI);
            }
            p1 p1Var = (p1) objI;
            lVarV.T();
            boolean z12 = (z11 || dropdown.getHide()) ? false : true;
            androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarA = androidx.compose.ui.focus.m.a(companion2, x.f76437c);
            lVarV.H(1538985455);
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = new y(p1Var);
                lVarV.B(objI2);
            }
            lVarV.T();
            androidx.compose.ui.d dVarA2 = s2.a(androidx.compose.foundation.d.d(dVarA, z12, null, null, (wn0.a) objI2, 6, null), "dropdown_menu_clickable");
            lVarV.H(733328855);
            d3.c.Companion companion3 = d3.c.INSTANCE;
            i0 i0VarJ = androidx.compose.foundation.layout.g.j(companion3.o(), false, lVarV, 0);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion aVar = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = aVar.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA = z3.a0.a(dVarA2);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ, aVar.c());
            d4.b(lVarA, xVarC, aVar.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = aVar.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.t.i(companion2, w4.h.g(10));
            d3.c.InterfaceC1212c interfaceC1212cI = companion3.i();
            v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(4));
            lVarV.H(693286680);
            i0 i0VarB = v1.e0.b(fVarN, interfaceC1212cI, lVarV, 54);
            lVarV.H(-1323940314);
            int iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            wn0.a<b4.g> aVarA2 = aVar.a();
            wn0.q<y2<b4.g>, p020r2.l, Integer, jn0.h0> qVarA2 = z3.a0.a(dVarI);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarB, aVar.c());
            d4.b(lVarA2, xVarC2, aVar.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB2 = aVar.b();
            if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            w(new w1.Trailing(dropdown.getCurrentItem().getIcon().intValue(), null, false, null, 10, null), z11, null, lVarV, i13 & 112, 4);
            lVarV.H(-268249188);
            if (z12) {
                p020r2.w.b(new h2[]{p009i2.z.a().d(k3.p1.l(f90.n.n(j1.f74525a, lVarV, j1.f74526b).getPlaceholderText()))}, p010i90.q.f76824a.a(), lVarV, 56);
            }
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            boolean zU = u(p1Var);
            x30.c title = dropdown.getTitle();
            w1.Dropdown.Item currentItem = dropdown.getCurrentItem();
            List<w1.Dropdown.Item> listC = dropdown.c();
            j1 j1Var = j1.f74525a;
            int i14 = j1.f74526b;
            long subtitle = f90.n.n(j1Var, lVarV, i14).getSubtitle();
            long onComponent = f90.n.n(j1Var, lVarV, i14).getOnComponent();
            lVarV.H(-797506304);
            boolean z13 = (i13 & 896) == 256;
            Object objI3 = lVarV.I();
            if (z13 || objI3 == companion.a()) {
                objI3 = new z(lVar, p1Var);
                lVarV.B(objI3);
            }
            wn0.l lVar3 = (wn0.l) objI3;
            lVarV.T();
            lVarV.H(-797502293);
            Object objI4 = lVarV.I();
            if (objI4 == companion.a()) {
                objI4 = new a0(p1Var);
                lVarV.B(objI4);
            }
            lVarV.T();
            t1.b(zU, title, currentItem, listC, lVar3, subtitle, onComponent, (wn0.a) objI4, lVarV, (w1.Dropdown.Item.f77054d << 6) | 12587072);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b0(dropdown, z11, lVar, i11));
        }
    }

    private static final boolean u(p1<Boolean> p1Var) {
        return p1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(p1<Boolean> p1Var, boolean z11) {
        p1Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00ab, please report this as an issue */
    public static final void w(w1.Trailing trailingIcon, boolean z11, androidx.compose.ui.d dVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        androidx.compose.ui.d dVar3;
        androidx.compose.ui.d dVar4;
        w2 w2VarX;
        p013kotlin.jvm.internal.s.k(trailingIcon, "trailingIcon");
        p020r2.l lVarV = lVar.v(580728384);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(trailingIcon) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= lVarV.p(z11) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 == 0) {
            if ((i11 & 896) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 256 : 128;
            }
            if ((i13 & 731) == 146 || !lVarV.b()) {
                if (i14 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(580728384, i13, -1, "com.stripe.android.uicore.elements.TrailingIcon (TextFieldUI.kt:374)");
                }
                if (z11) {
                    lVarV.H(611848850);
                    w1.b(androidx.compose.foundation.layout.x.i(t0.a(dVar3), w4.h.g(24)), 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, lVarV, 0, 30);
                    lVarV.T();
                } else {
                    if (trailingIcon.getIsTintable()) {
                        lVarV.H(612058906);
                        androidx.compose.ui.graphics.painter.b bVarC = e4.e.c(trailingIcon.getIdRes(), lVarV, 0);
                        Integer contentDescription = trailingIcon.getContentDescription();
                        lVarV.H(435390263);
                        String strC = contentDescription != null ? e4.i.c(trailingIcon.getContentDescription().intValue(), lVarV, 0) : null;
                        lVarV.T();
                        e1.a(bVarC, strC, F(dVar3, trailingIcon.c()), 0L, lVarV, 8, 8);
                        lVarV = lVarV;
                        lVarV.T();
                    } else {
                        lVarV.H(612386297);
                        androidx.compose.ui.graphics.painter.b bVarC2 = e4.e.c(trailingIcon.getIdRes(), lVarV, 0);
                        Integer contentDescription2 = trailingIcon.getContentDescription();
                        lVarV.H(435400855);
                        String strC2 = contentDescription2 != null ? e4.i.c(trailingIcon.getContentDescription().intValue(), lVarV, 0) : null;
                        lVarV.T();
                        q1.b0.a(bVarC2, strC2, F(dVar3, trailingIcon.c()), null, null, BitmapDescriptorFactory.HUE_RED, null, lVarV, 8, 120);
                        lVarV.T();
                    }
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar3;
            } else {
                lVarV.j();
                dVar4 = dVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c0(trailingIcon, z11, dVar4, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        if ((i13 & 731) == 146) {
            if (i14 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(580728384, i13, -1, "com.stripe.android.uicore.elements.TrailingIcon (TextFieldUI.kt:374)");
            }
            if (z11) {
                lVarV.H(611848850);
                w1.b(androidx.compose.foundation.layout.x.i(t0.a(dVar3), w4.h.g(24)), 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, lVarV, 0, 30);
                lVarV.T();
            } else {
                if (trailingIcon.getIsTintable()) {
                    lVarV.H(612058906);
                    androidx.compose.ui.graphics.painter.b bVarC3 = e4.e.c(trailingIcon.getIdRes(), lVarV, 0);
                    Integer contentDescription3 = trailingIcon.getContentDescription();
                    lVarV.H(435390263);
                    String strC3 = contentDescription3 != null ? e4.i.c(trailingIcon.getContentDescription().intValue(), lVarV, 0) : null;
                    lVarV.T();
                    e1.a(bVarC3, strC3, F(dVar3, trailingIcon.c()), 0L, lVarV, 8, 8);
                    lVarV = lVarV;
                    lVarV.T();
                } else {
                    lVarV.H(612386297);
                    androidx.compose.ui.graphics.painter.b bVarC4 = e4.e.c(trailingIcon.getIdRes(), lVarV, 0);
                    Integer contentDescription4 = trailingIcon.getContentDescription();
                    lVarV.H(435400855);
                    String strC4 = contentDescription4 != null ? e4.i.c(trailingIcon.getContentDescription().intValue(), lVarV, 0) : null;
                    lVarV.T();
                    q1.b0.a(bVarC4, strC4, F(dVar3, trailingIcon.c()), null, null, BitmapDescriptorFactory.HUE_RED, null, lVarV, 8, 120);
                    lVarV.T();
                }
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
        } else {
            if (i14 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(580728384, i13, -1, "com.stripe.android.uicore.elements.TrailingIcon (TextFieldUI.kt:374)");
            }
            if (z11) {
                lVarV.H(611848850);
                w1.b(androidx.compose.foundation.layout.x.i(t0.a(dVar3), w4.h.g(24)), 0L, BitmapDescriptorFactory.HUE_RED, 0L, 0, lVarV, 0, 30);
                lVarV.T();
            } else {
                if (trailingIcon.getIsTintable()) {
                    lVarV.H(612058906);
                    androidx.compose.ui.graphics.painter.b bVarC5 = e4.e.c(trailingIcon.getIdRes(), lVarV, 0);
                    Integer contentDescription5 = trailingIcon.getContentDescription();
                    lVarV.H(435390263);
                    String strC5 = contentDescription5 != null ? e4.i.c(trailingIcon.getContentDescription().intValue(), lVarV, 0) : null;
                    lVarV.T();
                    e1.a(bVarC5, strC5, F(dVar3, trailingIcon.c()), 0L, lVarV, 8, 8);
                    lVarV = lVarV;
                    lVarV.T();
                } else {
                    lVarV.H(612386297);
                    androidx.compose.ui.graphics.painter.b bVarC6 = e4.e.c(trailingIcon.getIdRes(), lVarV, 0);
                    Integer contentDescription6 = trailingIcon.getContentDescription();
                    lVarV.H(435400855);
                    String strC6 = contentDescription6 != null ? e4.i.c(trailingIcon.getContentDescription().intValue(), lVarV, 0) : null;
                    lVarV.T();
                    q1.b0.a(bVarC6, strC6, F(dVar3, trailingIcon.c()), null, null, BitmapDescriptorFactory.HUE_RED, null, lVarV, 8, 120);
                    lVarV.T();
                }
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar3;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c0(trailingIcon, z11, dVar4, i11, i12));
        }
    }

    /* JADX INFO: renamed from: i90.b2$g */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<x1, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f76375c = new g();

        g() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(x1 x1Var) {
            a(x1Var);
            return jn0.h0.f84049a;
        }

        public final void a(x1 x1Var) {
        }
    }

    /* JADX INFO: renamed from: i90.b2$o */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class o extends p013kotlin.jvm.internal.u implements wn0.l<x1, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f76397c = new o();

        o() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(x1 x1Var) {
            a(x1Var);
            return jn0.h0.f84049a;
        }

        public final void a(x1 x1Var) {
        }
    }
}
