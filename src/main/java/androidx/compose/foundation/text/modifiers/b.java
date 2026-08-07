package androidx.compose.foundation.text.modifiers;

import b4.b0;
import b4.e0;
import b4.r;
import b4.s1;
import b4.t1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import g2.g;
import g4.y;
import i4.Placeholder;
import i4.TextLayoutInput;
import i4.TextLayoutResult;
import i4.TextStyle;
import j3.i;
import j3.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import k3.Shadow;
import k3.h1;
import k3.j1;
import k3.p1;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p014n4.q;
import t4.j;
import t4.k;
import t4.t;
import w4.v;
import wn0.l;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0086\u0001BÇ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b1\u0010+JV\u00102\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b2\u00103Ja\u00104\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b4\u00105J-\u0010:\u001a\u00020\r2\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u0011¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\rH\u0000¢\u0006\u0004\b<\u0010-J\u0013\u0010>\u001a\u00020\r*\u00020=H\u0016¢\u0006\u0004\b>\u0010?J(\u0010G\u001a\u00020F2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020Dø\u0001\u0000¢\u0006\u0004\bG\u0010HJ&\u0010I\u001a\u00020F*\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010HJ%\u0010N\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013¢\u0006\u0004\bN\u0010OJ#\u0010P\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013H\u0016¢\u0006\u0004\bP\u0010OJ%\u0010R\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013¢\u0006\u0004\bR\u0010OJ#\u0010S\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013H\u0016¢\u0006\u0004\bS\u0010OJ%\u0010T\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013¢\u0006\u0004\bT\u0010OJ#\u0010U\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010OJ%\u0010V\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013¢\u0006\u0004\bV\u0010OJ#\u0010W\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013H\u0016¢\u0006\u0004\bW\u0010OJ\u0015\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0013\u0010\\\u001a\u00020\r*\u00020XH\u0016¢\u0006\u0004\b\\\u0010[R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010]R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010bR\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010dR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010dR$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR,\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010bR*\u0010v\u001a\u0010\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\u0013\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bs\u0010t\u0012\u0004\bu\u0010-R\u0018\u0010x\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010wR*\u0010{\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0y\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010bR'\u0010\u0082\u0001\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00020&8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b;", "Landroidx/compose/ui/d$c;", "Lb4/b0;", "Lb4/r;", "Lb4/s1;", "Li4/d;", "text", "Li4/r0;", "style", "Ln4/q$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Li4/m0;", "Ljn0/h0;", "onTextLayout", "Lt4/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Li4/d$c;", "Li4/w;", "placeholders", "Lj3/i;", "onPlaceholderLayout", "Lg2/g;", "selectionController", "Lk3/s1;", "overrideColor", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(Li4/d;Li4/r0;Ln4/q$b;Lwn0/l;IZIILjava/util/List;Lwn0/l;Lg2/g;Lk3/s1;Lwn0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lw4/d;", "density", "Lg2/e;", "H2", "(Lw4/d;)Lg2/e;", "updatedText", "P2", "(Li4/d;)Z", "J2", "()V", "color", "R2", "(Lk3/s1;Li4/r0;)Z", "T2", "S2", "(Li4/r0;Ljava/util/List;IIZLn4/q$b;I)Z", "Q2", "(Lwn0/l;Lwn0/l;Lg2/g;Lwn0/l;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "E2", "(ZZZZ)V", "D2", "Lg4/y;", "G0", "(Lg4/y;)V", "Lz3/k0;", "measureScope", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "M2", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "c", "Lz3/r;", "intrinsicMeasureScope", "Lz3/q;", Snapshot.HEIGHT, "O2", "(Lz3/r;Lz3/q;I)I", "B", Snapshot.WIDTH, "N2", "q", "L2", Gender.MALE, "K2", "n", "Lm3/c;", "contentDrawScope", "F2", "(Lm3/c;)V", Gender.FEMALE, "Li4/d;", "o", "Li4/r0;", "p", "Ln4/q$b;", "Lwn0/l;", "r", "I", "s", "Z", "t", "u", "v", "Ljava/util/List;", "w", "x", "Lg2/g;", "y", "Lk3/s1;", "z", "", "Lz3/a;", "A", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "Lg2/e;", "_layoutCache", "", "C", "semanticsTextLayoutResult", "D", "Landroidx/compose/foundation/text/modifiers/b$a;", "I2", "()Landroidx/compose/foundation/text/modifiers/b$a;", "setTextSubstitution$foundation_release", "(Landroidx/compose/foundation/text/modifiers/b$a;)V", "textSubstitution", "G2", "()Lg2/e;", "layoutCache", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends androidx.compose.ui.d.c implements b0, r, s1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Map<z3.a, Integer> baselineCache;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private g2.e _layoutCache;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private l<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private TextSubstitutionValue textSubstitution;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private i4.d text;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private q.b fontFamilyResolver;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private l<? super TextLayoutResult, h0> onTextLayout;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private List<i4.d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private l<? super List<i>, h0> onPlaceholderLayout;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private g selectionController;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private k3.s1 overrideColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private l<? super TextSubstitutionValue, h0> onShowTranslation;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Li4/m0;", "textLayoutResult", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class C0107b extends u implements l<List<TextLayoutResult>, Boolean> {
        C0107b() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x00b7  */
        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<TextLayoutResult> list) {
            TextLayoutResult textLayoutResultB;
            TextLayoutResult textLayoutResultB2 = b.this.G2().getLayoutCache();
            if (textLayoutResultB2 != null) {
                i4.d text = textLayoutResultB2.getLayoutInput().getText();
                TextStyle textStyle = b.this.style;
                k3.s1 s1Var = b.this.overrideColor;
                textLayoutResultB = TextLayoutResult.b(textLayoutResultB2, new TextLayoutInput(text, textStyle.L((16609105 & 1) != 0 ? p1.INSTANCE.j() : s1Var != null ? s1Var.a() : p1.INSTANCE.j(), (16609105 & 2) != 0 ? v.INSTANCE.a() : 0L, (16609105 & 4) != 0 ? null : null, (16609105 & 8) != 0 ? null : null, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : null, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? v.INSTANCE.a() : 0L, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? p1.INSTANCE.j() : 0L, (16609105 & 4096) != 0 ? null : null, (16609105 & PKIFailureInfo.certRevoked) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? j.INSTANCE.g() : 0, (16609105 & 65536) != 0 ? t4.l.INSTANCE.f() : 0, (16609105 & 131072) != 0 ? v.INSTANCE.a() : 0L, (16609105 & 262144) != 0 ? null : null, (16609105 & PKIFailureInfo.signerNotTrusted) != 0 ? null : null, (16609105 & PKIFailureInfo.badCertTemplate) != 0 ? t4.f.INSTANCE.b() : 0, (16609105 & PKIFailureInfo.badSenderNonce) != 0 ? t4.e.INSTANCE.c() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), textLayoutResultB2.getLayoutInput().g(), textLayoutResultB2.getLayoutInput().getMaxLines(), textLayoutResultB2.getLayoutInput().getSoftWrap(), textLayoutResultB2.getLayoutInput().getOverflow(), textLayoutResultB2.getLayoutInput().getDensity(), textLayoutResultB2.getLayoutInput().getLayoutDirection(), textLayoutResultB2.getLayoutInput().getFontFamilyResolver(), textLayoutResultB2.getLayoutInput().getConstraints(), (DefaultConstructorMarker) null), 0L, 2, null);
                if (textLayoutResultB != null) {
                    list.add(textLayoutResultB);
                } else {
                    textLayoutResultB = null;
                }
            } else {
                textLayoutResultB = null;
            }
            return Boolean.valueOf(textLayoutResultB != null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/d;", "updatedText", "", "a", "(Li4/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<i4.d, Boolean> {
        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i4.d dVar) {
            b.this.P2(dVar);
            b.this.J2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<Boolean, Boolean> {
        d() {
            super(1);
        }

        public final Boolean a(boolean z11) {
            if (b.this.getTextSubstitution() == null) {
                return Boolean.FALSE;
            }
            l lVar = b.this.onShowTranslation;
            if (lVar != null) {
                TextSubstitutionValue textSubstitution = b.this.getTextSubstitution();
                s.h(textSubstitution);
                lVar.invoke(textSubstitution);
            }
            TextSubstitutionValue textSubstitution2 = b.this.getTextSubstitution();
            if (textSubstitution2 != null) {
                textSubstitution2.f(z11);
            }
            b.this.J2();
            return Boolean.TRUE;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<Boolean> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            b.this.D2();
            b.this.J2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f5004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(w0 w0Var) {
            super(1);
            this.f5004c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.h(aVar, this.f5004c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public /* synthetic */ b(i4.d dVar, TextStyle textStyle, q.b bVar, l lVar, int i11, boolean z11, int i12, int i13, List list, l lVar2, g gVar, k3.s1 s1Var, l lVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, textStyle, bVar, lVar, i11, z11, i12, i13, list, lVar2, gVar, s1Var, lVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g2.e G2() {
        if (this._layoutCache == null) {
            this._layoutCache = new g2.e(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        g2.e eVar = this._layoutCache;
        s.h(eVar);
        return eVar;
    }

    private final g2.e H2(w4.d density) {
        g2.e layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.getIsShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.k(density);
            return layoutCache;
        }
        g2.e eVarG2 = G2();
        eVarG2.k(density);
        return eVarG2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2() {
        t1.b(this);
        e0.b(this);
        b4.s.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P2(i4.d updatedText) {
        h0 h0Var;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, updatedText, false, null, 12, null);
            g2.e eVar = new g2.e(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
            eVar.k(G2().getDensity());
            textSubstitutionValue2.e(eVar);
            this.textSubstitution = textSubstitutionValue2;
            return true;
        }
        if (s.f(updatedText, textSubstitutionValue.getSubstitution())) {
            return false;
        }
        textSubstitutionValue.g(updatedText);
        g2.e layoutCache = textSubstitutionValue.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.n(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
            h0Var = h0.f84049a;
        } else {
            h0Var = null;
        }
        return h0Var != null;
    }

    @Override // b4.b0
    public int B(z3.r rVar, z3.q qVar, int i11) {
        return H2(rVar).i(rVar.getLayoutDirection());
    }

    public final void D2() {
        this.textSubstitution = null;
    }

    public final void E2(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (textChanged || layoutChanged || callbacksChanged) {
            G2().n(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                t1.b(this);
            }
            if (textChanged || layoutChanged || callbacksChanged) {
                e0.b(this);
                b4.s.a(this);
            }
            if (drawChanged) {
                b4.s.a(this);
            }
        }
    }

    @Override // b4.r
    public void F(m3.c cVar) {
        if (getIsAttached()) {
            g gVar = this.selectionController;
            if (gVar != null) {
                gVar.b(cVar);
            }
            j1 j1VarA = cVar.getDrawContext().a();
            TextLayoutResult textLayoutResultC = H2(cVar).c();
            i4.j multiParagraph = textLayoutResultC.getMultiParagraph();
            boolean z11 = true;
            boolean z12 = textLayoutResultC.i() && !t.e(this.overflow, t.INSTANCE.c());
            if (z12) {
                i iVarB = j3.j.b(j3.g.INSTANCE.c(), n.a(w4.r.g(textLayoutResultC.getSize()), w4.r.f(textLayoutResultC.getSize())));
                j1VarA.u();
                j1.w(j1VarA, iVarB, 0, 2, null);
            }
            try {
                k kVarC = this.style.C();
                if (kVarC == null) {
                    kVarC = k.INSTANCE.c();
                }
                k kVar = kVarC;
                Shadow shadowZ = this.style.z();
                if (shadowZ == null) {
                    shadowZ = Shadow.INSTANCE.a();
                }
                Shadow shadow = shadowZ;
                m3.g gVarK = this.style.k();
                if (gVarK == null) {
                    gVarK = m3.j.f90966a;
                }
                m3.g gVar2 = gVarK;
                h1 h1VarI = this.style.i();
                if (h1VarI != null) {
                    i4.j.G(multiParagraph, j1VarA, h1VarI, this.style.f(), shadow, kVar, gVar2, 0, 64, null);
                } else {
                    k3.s1 s1Var = this.overrideColor;
                    long jA = s1Var != null ? s1Var.a() : p1.INSTANCE.j();
                    if (jA == 16) {
                        jA = this.style.j() != 16 ? this.style.j() : p1.INSTANCE.a();
                    }
                    multiParagraph.D(j1VarA, (32 & 2) != 0 ? p1.INSTANCE.j() : jA, (32 & 4) != 0 ? null : shadow, (32 & 8) != 0 ? null : kVar, (32 & 16) == 0 ? gVar2 : null, (32 & 32) != 0 ? m3.f.INSTANCE.a() : 0);
                }
                if (z12) {
                    j1VarA.o();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.getIsShowingSubstitution()) ? g2.j.a(this.text) : false)) {
                    List<i4.d.Range<Placeholder>> list = this.placeholders;
                    if (list != null && !list.isEmpty()) {
                        z11 = false;
                    }
                    if (z11) {
                        return;
                    }
                }
                cVar.M0();
            } catch (Throwable th2) {
                if (!z12) {
                    throw th2;
                }
                j1VarA.o();
                throw th2;
            }
        }
    }

    public final void F2(m3.c contentDrawScope) {
        F(contentDrawScope);
    }

    @Override // b4.s1
    public void G0(y yVar) {
        l c0107b = this.semanticsTextLayoutResult;
        if (c0107b == null) {
            c0107b = new C0107b();
            this.semanticsTextLayoutResult = c0107b;
        }
        g4.v.r0(yVar, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            g4.v.v0(yVar, textSubstitutionValue.getSubstitution());
            g4.v.o0(yVar, textSubstitutionValue.getIsShowingSubstitution());
        }
        g4.v.x0(yVar, null, new c(), 1, null);
        g4.v.D0(yVar, null, new d(), 1, null);
        g4.v.d(yVar, null, new e(), 1, null);
        g4.v.u(yVar, null, c0107b, 1, null);
    }

    /* JADX INFO: renamed from: I2, reason: from getter */
    public final TextSubstitutionValue getTextSubstitution() {
        return this.textSubstitution;
    }

    public final int K2(z3.r intrinsicMeasureScope, z3.q measurable, int width) {
        return n(intrinsicMeasureScope, measurable, width);
    }

    public final int L2(z3.r intrinsicMeasureScope, z3.q measurable, int height) {
        return M(intrinsicMeasureScope, measurable, height);
    }

    @Override // b4.b0
    public int M(z3.r rVar, z3.q qVar, int i11) {
        return H2(rVar).h(rVar.getLayoutDirection());
    }

    public final j0 M2(k0 measureScope, z3.h0 measurable, long constraints) {
        return c(measureScope, measurable, constraints);
    }

    public final int N2(z3.r intrinsicMeasureScope, z3.q measurable, int width) {
        return q(intrinsicMeasureScope, measurable, width);
    }

    public final int O2(z3.r intrinsicMeasureScope, z3.q measurable, int height) {
        return B(intrinsicMeasureScope, measurable, height);
    }

    public final boolean Q2(l<? super TextLayoutResult, h0> onTextLayout, l<? super List<i>, h0> onPlaceholderLayout, g selectionController, l<? super TextSubstitutionValue, h0> onShowTranslation) {
        boolean z11;
        if (this.onTextLayout != onTextLayout) {
            this.onTextLayout = onTextLayout;
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.onPlaceholderLayout != onPlaceholderLayout) {
            this.onPlaceholderLayout = onPlaceholderLayout;
            z11 = true;
        }
        if (!s.f(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z11 = true;
        }
        if (this.onShowTranslation == onShowTranslation) {
            return z11;
        }
        this.onShowTranslation = onShowTranslation;
        return true;
    }

    public final boolean R2(k3.s1 color, TextStyle style) {
        boolean zF = s.f(color, this.overrideColor);
        this.overrideColor = color;
        return (zF && style.H(this.style)) ? false : true;
    }

    public final boolean S2(TextStyle style, List<i4.d.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, q.b fontFamilyResolver, int overflow) {
        boolean z11 = !this.style.I(style);
        this.style = style;
        if (!s.f(this.placeholders, placeholders)) {
            this.placeholders = placeholders;
            z11 = true;
        }
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z11 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z11 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z11 = true;
        }
        if (!s.f(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z11 = true;
        }
        if (t.e(this.overflow, overflow)) {
            return z11;
        }
        this.overflow = overflow;
        return true;
    }

    public final boolean T2(i4.d text) {
        boolean zF = s.f(this.text.getText(), text.getText());
        boolean z11 = (zF && s.f(this.text.g(), text.g()) && s.f(this.text.e(), text.e()) && this.text.n(text)) ? false : true;
        if (z11) {
            this.text = text;
        }
        if (!zF) {
            D2();
        }
        return z11;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        g2.e eVarH2 = H2(k0Var);
        boolean zF = eVarH2.f(j11, k0Var.getLayoutDirection());
        TextLayoutResult textLayoutResultC = eVarH2.c();
        textLayoutResultC.getMultiParagraph().getIntrinsics().a();
        if (zF) {
            e0.a(this);
            l<? super TextLayoutResult, h0> lVar = this.onTextLayout;
            if (lVar != null) {
                lVar.invoke(textLayoutResultC);
            }
            g gVar = this.selectionController;
            if (gVar != null) {
                gVar.e(textLayoutResultC);
            }
            Map<z3.a, Integer> linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(z3.b.a(), Integer.valueOf(Math.round(textLayoutResultC.getFirstBaseline())));
            linkedHashMap.put(z3.b.b(), Integer.valueOf(Math.round(textLayoutResultC.getLastBaseline())));
            this.baselineCache = linkedHashMap;
        }
        l<? super List<i>, h0> lVar2 = this.onPlaceholderLayout;
        if (lVar2 != null) {
            lVar2.invoke(textLayoutResultC.A());
        }
        w0 w0VarX0 = h0Var.x0(w4.b.INSTANCE.b(w4.r.g(textLayoutResultC.getSize()), w4.r.g(textLayoutResultC.getSize()), w4.r.f(textLayoutResultC.getSize()), w4.r.f(textLayoutResultC.getSize())));
        int iG = w4.r.g(textLayoutResultC.getSize());
        int iF = w4.r.f(textLayoutResultC.getSize());
        Map<z3.a, Integer> map = this.baselineCache;
        s.h(map);
        return k0Var.b1(iG, iF, map, new f(w0VarX0));
    }

    @Override // b4.b0
    public int n(z3.r rVar, z3.q qVar, int i11) {
        return H2(rVar).d(i11, rVar.getLayoutDirection());
    }

    @Override // b4.b0
    public int q(z3.r rVar, z3.q qVar, int i11) {
        return H2(rVar).d(i11, rVar.getLayoutDirection());
    }

    private b(i4.d dVar, TextStyle textStyle, q.b bVar, l<? super TextLayoutResult, h0> lVar, int i11, boolean z11, int i12, int i13, List<i4.d.Range<Placeholder>> list, l<? super List<i>, h0> lVar2, g gVar, k3.s1 s1Var, l<? super TextSubstitutionValue, h0> lVar3) {
        this.text = dVar;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = lVar;
        this.overflow = i11;
        this.softWrap = z11;
        this.maxLines = i12;
        this.minLines = i13;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = gVar;
        this.overrideColor = s1Var;
        this.onShowTranslation = lVar3;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0014\u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b$a;", "", "Li4/d;", "original", "substitution", "", "isShowingSubstitution", "Lg2/e;", "layoutCache", "<init>", "(Li4/d;Li4/d;ZLg2/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li4/d;", "b", "()Li4/d;", "c", "g", "(Li4/d;)V", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "f", "(Z)V", "Lg2/e;", "()Lg2/e;", "e", "(Lg2/e;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TextSubstitutionValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i4.d original;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private i4.d substitution;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private g2.e layoutCache;

        public TextSubstitutionValue(i4.d dVar, i4.d dVar2, boolean z11, g2.e eVar) {
            this.original = dVar;
            this.substitution = dVar2;
            this.isShowingSubstitution = z11;
            this.layoutCache = eVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g2.e getLayoutCache() {
            return this.layoutCache;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final i4.d getOriginal() {
            return this.original;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final i4.d getSubstitution() {
            return this.substitution;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void e(g2.e eVar) {
            this.layoutCache = eVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) other;
            return s.f(this.original, textSubstitutionValue.original) && s.f(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && s.f(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public final void f(boolean z11) {
            this.isShowingSubstitution = z11;
        }

        public final void g(i4.d dVar) {
            this.substitution = dVar;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            g2.e eVar = this.layoutCache;
            return iHashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ TextSubstitutionValue(i4.d dVar, i4.d dVar2, boolean z11, g2.e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, dVar2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : eVar);
        }
    }
}
