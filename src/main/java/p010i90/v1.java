package p010i90;

import androidx.compose.ui.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import e3.m;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.flow.StateFlow;
import o4.r;
import o4.z0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import r90.g;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bg\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JR\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\u00020+8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\u00020/8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b0\u0010-R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010)R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010)R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010)R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010)R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010)R\u001c\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010)R\u0014\u0010\u0011\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010:R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00030&8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, d2 = {"Li90/v1;", "Li90/h0;", "Li90/i1;", "", "displayFormatted", "Li90/x1;", "q", "(Ljava/lang/String;)Li90/x1;", "", "newHasFocus", "Ljn0/h0;", "h", "(Z)V", "Li90/w1$a$a;", "item", IntegerTokenConverter.CONVERTER_KEY, "(Li90/w1$a$a;)V", "enabled", "Li90/j1;", "field", "Landroidx/compose/ui/d;", "modifier", "", "Li90/g0;", "hiddenIdentifiers", "lastTextFieldIdentifier", "Landroidx/compose/ui/focus/d;", "nextFocusDirection", "previousFocusDirection", "g", "(ZLi90/j1;Landroidx/compose/ui/d;Ljava/util/Set;Li90/g0;IILr2/l;I)V", "l", "()Ljava/lang/String;", "initialValue", "Le3/m;", "k", "()Le3/m;", "autofillType", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/w1;", "f", "()Lkotlinx/coroutines/flow/StateFlow;", "trailingIcon", "Lo4/x;", "e", "()I", "capitalization", "Lo4/y;", "o", "keyboardType", "", "getLabel", AnnotatedPrivateKey.LABEL, "Lo4/z0;", "c", "()Lo4/z0;", "visualTransformation", "n", "()Z", "showOptionalLabel", "r", "fieldState", "p", "fieldValue", "j", "visibleError", "b", "loading", DateTokenConverter.CONVERTER_KEY, "placeHolder", "s", "getContentDescription", "contentDescription", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface v1 extends h0, i1 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: i90.v1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class C1626a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ v1 f77035c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f77036d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ j1 f77037e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f77038f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Set<IdentifierSpec> f77039g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ IdentifierSpec f77040h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f77041i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f77042j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f77043k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1626a(v1 v1Var, boolean z11, j1 j1Var, d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, int i13) {
                super(2);
                this.f77035c = v1Var;
                this.f77036d = z11;
                this.f77037e = j1Var;
                this.f77038f = dVar;
                this.f77039g = set;
                this.f77040h = identifierSpec;
                this.f77041i = i11;
                this.f77042j = i12;
                this.f77043k = i13;
            }

            public final void a(l lVar, int i11) {
                this.f77035c.g(this.f77036d, this.f77037e, this.f77038f, this.f77039g, this.f77040h, this.f77041i, this.f77042j, lVar, k2.a(this.f77043k | 1));
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        public static void a(v1 v1Var, boolean z11, j1 field, d modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, int i11, int i12, l lVar, int i13) {
            int i14;
            int i15;
            s.k(field, "field");
            s.k(modifier, "modifier");
            s.k(hiddenIdentifiers, "hiddenIdentifiers");
            l lVarV = lVar.v(-2028039881);
            if ((i13 & 14) == 0) {
                i14 = (lVarV.p(z11) ? 4 : 2) | i13;
            } else {
                i14 = i13;
            }
            if ((i13 & 112) == 0) {
                i14 |= lVarV.n(field) ? 32 : 16;
            }
            if ((i13 & 896) == 0) {
                i14 |= lVarV.n(modifier) ? 256 : 128;
            }
            if ((57344 & i13) == 0) {
                i14 |= lVarV.n(identifierSpec) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((i13 & 458752) == 0) {
                i14 |= lVarV.r(i11) ? 131072 : 65536;
            }
            if ((i13 & 3670016) == 0) {
                i15 = i12;
                i14 |= lVarV.r(i15) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            } else {
                i15 = i12;
            }
            if ((29360128 & i13) == 0) {
                i14 |= lVarV.n(v1Var) ? 8388608 : 4194304;
            }
            if ((23962331 & i14) == 4792466 && lVarV.b()) {
                lVarV.j();
            } else {
                if (o.J()) {
                    o.S(-2028039881, i14, -1, "com.stripe.android.uicore.elements.TextFieldController.ComposeUI (TextFieldController.kt:64)");
                }
                int i16 = i14 << 3;
                Function1.c(v1Var, z11, s.f(identifierSpec, field.getIdentifier()) ? r.INSTANCE.b() : r.INSTANCE.d(), modifier, null, i11, i15, null, lVarV, (458752 & i14) | ((i14 >> 21) & 14) | (i16 & 112) | (i16 & 7168) | (i14 & 3670016), 144);
                if (o.J()) {
                    o.R();
                }
            }
            w2 w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new C1626a(v1Var, z11, field, modifier, hiddenIdentifiers, identifierSpec, i11, i12, i13));
            }
        }

        public static boolean b(v1 v1Var) {
            return true;
        }

        public static StateFlow<String> c(v1 v1Var) {
            return g.n(null);
        }

        public static void d(v1 v1Var, w1.Dropdown.Item item) {
            s.k(item, "item");
        }
    }

    StateFlow<Boolean> b();

    /* JADX INFO: renamed from: c */
    z0 getVisualTransformation();

    StateFlow<String> d();

    /* JADX INFO: renamed from: e */
    int getCapitalization();

    StateFlow<w1> f();

    void g(boolean z11, j1 j1Var, d dVar, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, int i11, int i12, l lVar, int i13);

    StateFlow<String> getContentDescription();

    StateFlow<Integer> getLabel();

    void h(boolean newHasFocus);

    void i(w1.Dropdown.Item item);

    StateFlow<Boolean> j();

    /* JADX INFO: renamed from: k */
    m getAutofillType();

    /* JADX INFO: renamed from: l */
    String getInitialValue();

    /* JADX INFO: renamed from: n */
    boolean getShowOptionalLabel();

    /* JADX INFO: renamed from: o */
    int getKeyboardType();

    StateFlow<String> p();

    x1 q(String displayFormatted);

    StateFlow<x1> r();

    boolean s();
}
