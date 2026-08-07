package p007h2;

import androidx.compose.ui.focus.o;
import androidx.compose.ui.platform.u2;
import androidx.compose.ui.platform.w2;
import androidx.compose.ui.platform.x0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import i4.TextLayoutResult;
import i4.p0;
import i4.q0;
import kotlin.b0;
import kotlin.c1;
import kotlin.l0;
import kotlin.m;
import kotlin.n;
import kotlin.n0;
import kotlin.n1;
import kotlin.o0;
import kotlin.r1;
import o4.TextFieldValue;
import o4.f0;
import o4.z0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.p1;
import p020r2.s3;
import wn0.l;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJB\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010!\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010\nJ\u000f\u0010*\u001a\u00020\bH\u0000¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\u00020\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\bH\u0000¢\u0006\u0004\b3\u0010+J\u0019\u00105\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b5\u0010\nJ\u000f\u00106\u001a\u00020\bH\u0000¢\u0006\u0004\b6\u0010+J\u000f\u00107\u001a\u00020\bH\u0000¢\u0006\u0004\b7\u0010+J\u000f\u00108\u001a\u00020\bH\u0000¢\u0006\u0004\b8\u0010+J\u001d\u00109\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001d\u0010=\u001a\u00020\u00102\u0006\u0010<\u001a\u00020;H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\bH\u0000¢\u0006\u0004\b?\u0010+J\u000f\u0010@\u001a\u00020\bH\u0000¢\u0006\u0004\b@\u0010+J\u000f\u0010A\u001a\u00020\u0006H\u0000¢\u0006\u0004\bA\u0010BR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\"\u0010N\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR.\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010^\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010m\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010u\u001a\u0004\u0018\u00010n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010}\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R*\u0010\u0085\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R,\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R/\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010a\u001a\u0005\b\u008f\u0001\u0010B\"\u0005\b\u0090\u0001\u0010\nR/\u0010\u0095\u0001\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010a\u001a\u0005\b\u0093\u0001\u0010B\"\u0005\b\u0094\u0001\u0010\nR\u001e\u0010\u0097\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010JR\u001b\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010\u0099\u0001R\u001d\u0010\u009b\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u0010JR7\u0010¢\u0001\u001a\u0005\u0018\u00010\u009c\u00012\t\u0010_\u001a\u0005\u0018\u00010\u009c\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u009d\u0001\u0010a\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R9\u0010¦\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010_\u001a\u0004\u0018\u00010\u00108F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0004\b!\u0010a\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0005\b¥\u0001\u0010.R\u0019\u0010¨\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010§\u0001R\u0018\u0010ª\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010©\u0001R\u001b\u0010\u00ad\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010¬\u0001R\u001e\u0010±\u0001\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0005\b°\u0001\u0010'R\u001f\u0010µ\u0001\u001a\u00030²\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b)\u0010³\u0001\u001a\u0006\b§\u0001\u0010´\u0001R\u0019\u0010¸\u0001\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¹\u0001"}, d2 = {"Lh2/h0;", "", "Lb2/n1;", "undoManager", "<init>", "(Lb2/n1;)V", "", "show", "Ljn0/h0;", "m0", "(Z)V", "Lj3/i;", "z", "()Lj3/i;", "Lo4/o0;", "value", "Lj3/g;", "currentPosition", "isStartOfSelection", "isStartHandle", "Lh2/s;", "adjustment", "isTouchBasedSelection", "Li4/p0;", "n0", "(Lo4/o0;JZZLh2/s;Z)J", "Lb2/n;", "handleState", "c0", "(Lb2/n;)V", "Li4/d;", "annotatedString", "selection", "q", "(Li4/d;J)Lo4/o0;", "Lb2/n0;", "Q", "(Z)Lb2/n0;", "r", "()Lb2/n0;", "showFloatingToolbar", "v", "x", "()V", "position", "t", "(Lj3/g;)V", "range", "g0", "(J)V", "X", "n", "cancelSelection", "o", "T", "s", Gender.UNKNOWN, "G", "(Z)J", "Lw4/d;", "density", "B", "(Lw4/d;)J", "l0", "R", "S", "()Z", "a", "Lb2/n1;", "getUndoManager", "()Lb2/n1;", "Lo4/f0;", "b", "Lo4/f0;", "J", "()Lo4/f0;", "e0", "(Lo4/f0;)V", "offsetMapping", "Lkotlin/Function1;", "c", "Lwn0/l;", "K", "()Lwn0/l;", "f0", "(Lwn0/l;)V", "onValueChange", "Lb2/b0;", DateTokenConverter.CONVERTER_KEY, "Lb2/b0;", "L", "()Lb2/b0;", "h0", "(Lb2/b0;)V", "state", "<set-?>", "e", "Lr2/p1;", Gender.OTHER, "()Lo4/o0;", "j0", "(Lo4/o0;)V", "Lo4/z0;", "f", "Lo4/z0;", "P", "()Lo4/z0;", "k0", "(Lo4/z0;)V", "visualTransformation", "Landroidx/compose/ui/platform/x0;", "g", "Landroidx/compose/ui/platform/x0;", "y", "()Landroidx/compose/ui/platform/x0;", "V", "(Landroidx/compose/ui/platform/x0;)V", "clipboardManager", "Landroidx/compose/ui/platform/u2;", "h", "Landroidx/compose/ui/platform/u2;", "getTextToolbar", "()Landroidx/compose/ui/platform/u2;", "i0", "(Landroidx/compose/ui/platform/u2;)V", "textToolbar", "Lr3/a;", IntegerTokenConverter.CONVERTER_KEY, "Lr3/a;", "H", "()Lr3/a;", "d0", "(Lr3/a;)V", "hapticFeedBack", "Landroidx/compose/ui/focus/o;", "j", "Landroidx/compose/ui/focus/o;", Gender.FEMALE, "()Landroidx/compose/ui/focus/o;", "b0", "(Landroidx/compose/ui/focus/o;)V", "focusRequester", "k", "D", "Z", "editable", "l", "E", "a0", "enabled", "m", "dragBeginPosition", "", "Ljava/lang/Integer;", "dragBeginOffsetInText", "dragTotalDistance", "Lb2/m;", "p", "C", "()Lb2/m;", "Y", "(Lb2/m;)V", "draggingHandle", "A", "()Lj3/g;", "W", "currentDragPosition", "I", "previousRawDragOffset", "Lo4/o0;", "oldValue", "Lh2/y;", "Lh2/y;", "previousSelectionLayout", "u", "Lb2/n0;", Gender.MALE, "touchSelectionObserver", "Lh2/h;", "Lh2/h;", "()Lh2/h;", "mouseSelectionObserver", Gender.NONE, "()Li4/d;", "transformedText", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n1 undoManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private f0 offsetMapping;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private l<? super TextFieldValue, jn0.h0> onValueChange;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private b0 state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 value;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private z0 visualTransformation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private x0 clipboardManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private u2 textToolbar;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private r3.a hapticFeedBack;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private o focusRequester;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p1 editable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p1 enabled;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long dragBeginPosition;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Integer dragBeginOffsetInText;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long dragTotalDistance;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p1 draggingHandle;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p1 currentDragPosition;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int previousRawDragOffset;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue oldValue;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private y previousSelectionLayout;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final n0 touchSelectionObserver;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p007h2.h mouseSelectionObserver;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<jn0.h0> {
        e() {
            super(0);
        }

        public final void b() {
            h0.p(h0.this, false, 1, null);
            h0.this.R();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.a<jn0.h0> {
        f() {
            super(0);
        }

        public final void b() {
            h0.this.s();
            h0.this.R();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements wn0.a<jn0.h0> {
        g() {
            super(0);
        }

        public final void b() {
            h0.this.T();
            h0.this.R();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.a<jn0.h0> {
        h() {
            super(0);
        }

        public final void b() {
            h0.this.U();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(j3.g gVar) {
        this.currentDragPosition.setValue(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(m mVar) {
        this.draggingHandle.setValue(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(n handleState) {
        b0 b0Var = this.state;
        if (b0Var != null) {
            if (b0Var.d() == handleState) {
                b0Var = null;
            }
            if (b0Var != null) {
                b0Var.B(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(boolean show) {
        b0 b0Var = this.state;
        if (b0Var != null) {
            b0Var.K(show);
        }
        if (show) {
            l0();
        } else {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long n0(TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, s adjustment, boolean isTouchBasedSelection) {
        c1 c1VarJ;
        int i11;
        r3.a aVar;
        b0 b0Var = this.state;
        if (b0Var == null || (c1VarJ = b0Var.j()) == null) {
            return p0.INSTANCE.a();
        }
        long jB = q0.b(this.offsetMapping.originalToTransformed(p0.n(value.getSelection())), this.offsetMapping.originalToTransformed(p0.i(value.getSelection())));
        boolean z11 = false;
        int iD = c1VarJ.d(currentPosition, false);
        int iN = (isStartHandle || isStartOfSelection) ? iD : p0.n(jB);
        int i12 = (!isStartHandle || isStartOfSelection) ? iD : p0.i(jB);
        y yVar = this.previousSelectionLayout;
        if (isStartOfSelection || yVar == null || (i11 = this.previousRawDragOffset) == -1) {
            i11 = -1;
        }
        y yVarC = z.c(c1VarJ.getValue(), iN, i12, i11, jB, isStartOfSelection, isStartHandle);
        if (!yVarC.c(yVar)) {
            return value.getSelection();
        }
        this.previousSelectionLayout = yVarC;
        this.previousRawDragOffset = iD;
        Selection selectionA = adjustment.a(yVarC);
        long jB2 = q0.b(this.offsetMapping.transformedToOriginal(selectionA.getStart().getOffset()), this.offsetMapping.transformedToOriginal(selectionA.getEnd().getOffset()));
        if (p0.g(jB2, value.getSelection())) {
            return value.getSelection();
        }
        boolean z12 = p0.m(jB2) != p0.m(value.getSelection()) && p0.g(q0.b(p0.i(jB2), p0.n(jB2)), value.getSelection());
        boolean z13 = p0.h(jB2) && p0.h(value.getSelection());
        if (isTouchBasedSelection && value.h().length() > 0 && !z12 && !z13 && (aVar = this.hapticFeedBack) != null) {
            aVar.a(r3.b.INSTANCE.b());
        }
        this.onValueChange.invoke(q(value.getText(), jB2));
        if (!isTouchBasedSelection) {
            m0(!p0.h(jB2));
        }
        b0 b0Var2 = this.state;
        if (b0Var2 != null) {
            b0Var2.D(isTouchBasedSelection);
        }
        b0 b0Var3 = this.state;
        if (b0Var3 != null) {
            b0Var3.M(!p0.h(jB2) && i0.c(this, true));
        }
        b0 b0Var4 = this.state;
        if (b0Var4 != null) {
            b0Var4.L(!p0.h(jB2) && i0.c(this, false));
        }
        b0 b0Var5 = this.state;
        if (b0Var5 == null) {
            return jB2;
        }
        if (p0.h(jB2) && i0.c(this, true)) {
            z11 = true;
        }
        b0Var5.J(z11);
        return jB2;
    }

    public static /* synthetic */ void p(h0 h0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        h0Var.o(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldValue q(i4.d annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (p0) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void u(h0 h0Var, j3.g gVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = null;
        }
        h0Var.t(gVar);
    }

    public static /* synthetic */ void w(h0 h0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        h0Var.v(z11);
    }

    private final j3.i z() {
        float fN;
        v vVarI;
        TextLayoutResult value;
        j3.i iVarE;
        v vVarI2;
        TextLayoutResult value2;
        j3.i iVarE2;
        v vVarI3;
        v vVarI4;
        b0 b0Var = this.state;
        if (b0Var != null) {
            if (b0Var.getIsLayoutResultStale()) {
                b0Var = null;
            }
            if (b0Var != null) {
                int iOriginalToTransformed = this.offsetMapping.originalToTransformed(p0.n(O().getSelection()));
                int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(p0.i(O().getSelection()));
                b0 b0Var2 = this.state;
                long jC = (b0Var2 == null || (vVarI4 = b0Var2.i()) == null) ? j3.g.INSTANCE.c() : vVarI4.P(G(true));
                b0 b0Var3 = this.state;
                long jC2 = (b0Var3 == null || (vVarI3 = b0Var3.i()) == null) ? j3.g.INSTANCE.c() : vVarI3.P(G(false));
                b0 b0Var4 = this.state;
                float fN2 = BitmapDescriptorFactory.HUE_RED;
                if (b0Var4 == null || (vVarI2 = b0Var4.i()) == null) {
                    fN = 0.0f;
                } else {
                    c1 c1VarJ = b0Var.j();
                    fN = j3.g.n(vVarI2.P(j3.h.a(BitmapDescriptorFactory.HUE_RED, (c1VarJ == null || (value2 = c1VarJ.getValue()) == null || (iVarE2 = value2.e(iOriginalToTransformed)) == null) ? 0.0f : iVarE2.getTop())));
                }
                b0 b0Var5 = this.state;
                if (b0Var5 != null && (vVarI = b0Var5.i()) != null) {
                    c1 c1VarJ2 = b0Var.j();
                    fN2 = j3.g.n(vVarI.P(j3.h.a(BitmapDescriptorFactory.HUE_RED, (c1VarJ2 == null || (value = c1VarJ2.getValue()) == null || (iVarE = value.e(iOriginalToTransformed2)) == null) ? 0.0f : iVarE.getTop())));
                }
                return new j3.i(Math.min(j3.g.m(jC), j3.g.m(jC2)), Math.min(fN, fN2), Math.max(j3.g.m(jC), j3.g.m(jC2)), Math.max(j3.g.n(jC), j3.g.n(jC2)) + (w4.h.g(25) * b0Var.getTextDelegate().getDensity().getDensity()));
            }
        }
        return j3.i.INSTANCE.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j3.g A() {
        return (j3.g) this.currentDragPosition.getValue();
    }

    public final long B(w4.d density) {
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(p0.n(O().getSelection()));
        b0 b0Var = this.state;
        c1 c1VarJ = b0Var != null ? b0Var.j() : null;
        s.h(c1VarJ);
        TextLayoutResult value = c1VarJ.getValue();
        j3.i iVarE = value.e(bo0.n.n(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return j3.h.a(iVarE.getLeft() + (density.O1(o0.b()) / 2), iVarE.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m C() {
        return (m) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean E() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final o getFocusRequester() {
        return this.focusRequester;
    }

    public final long G(boolean isStartHandle) {
        c1 c1VarJ;
        TextLayoutResult value;
        b0 b0Var = this.state;
        if (b0Var == null || (c1VarJ = b0Var.j()) == null || (value = c1VarJ.getValue()) == null) {
            return j3.g.INSTANCE.b();
        }
        i4.d dVarN = N();
        if (dVarN == null) {
            return j3.g.INSTANCE.b();
        }
        if (!s.f(dVarN.getText(), value.getLayoutInput().getText().getText())) {
            return j3.g.INSTANCE.b();
        }
        long selection = O().getSelection();
        return n0.b(value, this.offsetMapping.originalToTransformed(isStartHandle ? p0.n(selection) : p0.i(selection)), isStartHandle, p0.m(O().getSelection()));
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final r3.a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final p007h2.h getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final f0 getOffsetMapping() {
        return this.offsetMapping;
    }

    public final l<TextFieldValue, jn0.h0> K() {
        return this.onValueChange;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final b0 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final n0 getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    public final i4.d N() {
        l0 textDelegate;
        b0 b0Var = this.state;
        if (b0Var == null || (textDelegate = b0Var.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue O() {
        return (TextFieldValue) this.value.getValue();
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final z0 getVisualTransformation() {
        return this.visualTransformation;
    }

    public final n0 Q(boolean isStartHandle) {
        return new b(isStartHandle);
    }

    public final void R() {
        u2 u2Var;
        u2 u2Var2 = this.textToolbar;
        if ((u2Var2 != null ? u2Var2.getStatus() : null) != w2.Shown || (u2Var = this.textToolbar) == null) {
            return;
        }
        u2Var.hide();
    }

    public final boolean S() {
        return !s.f(this.oldValue.h(), O().h());
    }

    public final void T() {
        i4.d text;
        x0 x0Var = this.clipboardManager;
        if (x0Var == null || (text = x0Var.getText()) == null) {
            return;
        }
        i4.d dVarQ = o4.p0.c(O(), O().h().length()).q(text).q(o4.p0.b(O(), O().h().length()));
        int iL = p0.l(O().getSelection()) + text.length();
        this.onValueChange.invoke(q(dVarQ, q0.b(iL, iL)));
        c0(n.None);
        n1 n1Var = this.undoManager;
        if (n1Var != null) {
            n1Var.a();
        }
    }

    public final void U() {
        TextFieldValue textFieldValueQ = q(O().getText(), q0.b(0, O().h().length()));
        this.onValueChange.invoke(textFieldValueQ);
        this.oldValue = TextFieldValue.c(this.oldValue, null, textFieldValueQ.getSelection(), null, 5, null);
        v(true);
    }

    public final void V(x0 x0Var) {
        this.clipboardManager = x0Var;
    }

    public final void X(long range) {
        b0 b0Var = this.state;
        if (b0Var != null) {
            b0Var.A(range);
        }
        b0 b0Var2 = this.state;
        if (b0Var2 != null) {
            b0Var2.I(p0.INSTANCE.a());
        }
        if (p0.h(range)) {
            return;
        }
        x();
    }

    public final void Z(boolean z11) {
        this.editable.setValue(Boolean.valueOf(z11));
    }

    public final void a0(boolean z11) {
        this.enabled.setValue(Boolean.valueOf(z11));
    }

    public final void b0(o oVar) {
        this.focusRequester = oVar;
    }

    public final void d0(r3.a aVar) {
        this.hapticFeedBack = aVar;
    }

    public final void e0(f0 f0Var) {
        this.offsetMapping = f0Var;
    }

    public final void f0(l<? super TextFieldValue, jn0.h0> lVar) {
        this.onValueChange = lVar;
    }

    public final void g0(long range) {
        b0 b0Var = this.state;
        if (b0Var != null) {
            b0Var.I(range);
        }
        b0 b0Var2 = this.state;
        if (b0Var2 != null) {
            b0Var2.A(p0.INSTANCE.a());
        }
        if (p0.h(range)) {
            return;
        }
        x();
    }

    public final void h0(b0 b0Var) {
        this.state = b0Var;
    }

    public final void i0(u2 u2Var) {
        this.textToolbar = u2Var;
    }

    public final void j0(TextFieldValue textFieldValue) {
        this.value.setValue(textFieldValue);
    }

    public final void k0(z0 z0Var) {
        this.visualTransformation = z0Var;
    }

    public final void l0() {
        x0 x0Var;
        if (E()) {
            b0 b0Var = this.state;
            if (b0Var == null || b0Var.y()) {
                boolean z11 = this.visualTransformation instanceof o4.h0;
                e eVar = (p0.h(O().getSelection()) || z11) ? null : new e();
                f fVar = (p0.h(O().getSelection()) || !D() || z11) ? null : new f();
                g gVar = (D() && (x0Var = this.clipboardManager) != null && x0Var.b()) ? new g() : null;
                h hVar = p0.j(O().getSelection()) != O().h().length() ? new h() : null;
                u2 u2Var = this.textToolbar;
                if (u2Var != null) {
                    u2Var.a(z(), eVar, gVar, fVar, hVar);
                }
            }
        }
    }

    public final void n() {
        b0 b0Var = this.state;
        if (b0Var != null) {
            b0Var.A(p0.INSTANCE.a());
        }
        b0 b0Var2 = this.state;
        if (b0Var2 == null) {
            return;
        }
        b0Var2.I(p0.INSTANCE.a());
    }

    public final void o(boolean cancelSelection) {
        if (p0.h(O().getSelection())) {
            return;
        }
        x0 x0Var = this.clipboardManager;
        if (x0Var != null) {
            x0Var.a(o4.p0.a(O()));
        }
        if (cancelSelection) {
            int iK = p0.k(O().getSelection());
            this.onValueChange.invoke(q(O().getText(), q0.b(iK, iK)));
            c0(n.None);
        }
    }

    public final n0 r() {
        return new a();
    }

    public final void s() {
        if (p0.h(O().getSelection())) {
            return;
        }
        x0 x0Var = this.clipboardManager;
        if (x0Var != null) {
            x0Var.a(o4.p0.a(O()));
        }
        i4.d dVarQ = o4.p0.c(O(), O().h().length()).q(o4.p0.b(O(), O().h().length()));
        int iL = p0.l(O().getSelection());
        this.onValueChange.invoke(q(dVarQ, q0.b(iL, iL)));
        c0(n.None);
        n1 n1Var = this.undoManager;
        if (n1Var != null) {
            n1Var.a();
        }
    }

    public final void t(j3.g position) {
        if (!p0.h(O().getSelection())) {
            b0 b0Var = this.state;
            c1 c1VarJ = b0Var != null ? b0Var.j() : null;
            this.onValueChange.invoke(TextFieldValue.c(O(), null, q0.a((position == null || c1VarJ == null) ? p0.k(O().getSelection()) : this.offsetMapping.transformedToOriginal(c1.e(c1VarJ, position.getPackedValue(), false, 2, null))), null, 5, null));
        }
        c0((position == null || O().h().length() <= 0) ? n.None : n.Cursor);
        m0(false);
    }

    public final void v(boolean showFloatingToolbar) {
        o oVar;
        b0 b0Var = this.state;
        if (b0Var != null && !b0Var.e() && (oVar = this.focusRequester) != null) {
            oVar.f();
        }
        this.oldValue = O();
        m0(showFloatingToolbar);
        c0(n.Selection);
    }

    public final void x() {
        m0(false);
        c0(n.None);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final x0 getClipboardManager() {
        return this.clipboardManager;
    }

    public h0(n1 n1Var) {
        this.undoManager = n1Var;
        this.offsetMapping = r1.d();
        this.onValueChange = d.f70292c;
        this.value = s3.d(new TextFieldValue((String) null, 0L, (p0) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = z0.INSTANCE.c();
        Boolean bool = Boolean.TRUE;
        this.editable = s3.d(bool, null, 2, null);
        this.enabled = s3.d(bool, null, 2, null);
        j3.g.Companion companion = j3.g.INSTANCE;
        this.dragBeginPosition = companion.c();
        this.dragTotalDistance = companion.c();
        this.draggingHandle = s3.d(null, null, 2, null);
        this.currentDragPosition = s3.d(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (p0) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new i();
        this.mouseSelectionObserver = new c();
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"h2/h0$a", "Lb2/n0;", "Lj3/g;", "point", "Ljn0/h0;", "a", "(J)V", DateTokenConverter.CONVERTER_KEY, "()V", "startPoint", "c", "delta", "b", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements n0 {
        a() {
        }

        @Override // kotlin.n0
        public void b(long delta) {
            c1 c1VarJ;
            r3.a hapticFeedBack;
            h0 h0Var = h0.this;
            h0Var.dragTotalDistance = j3.g.r(h0Var.dragTotalDistance, delta);
            b0 state = h0.this.getState();
            if (state == null || (c1VarJ = state.j()) == null) {
                return;
            }
            h0 h0Var2 = h0.this;
            h0Var2.W(j3.g.d(j3.g.r(h0Var2.dragBeginPosition, h0Var2.dragTotalDistance)));
            f0 offsetMapping = h0Var2.getOffsetMapping();
            j3.g gVarA = h0Var2.A();
            s.h(gVarA);
            int iTransformedToOriginal = offsetMapping.transformedToOriginal(c1.e(c1VarJ, gVarA.getPackedValue(), false, 2, null));
            long jB = q0.b(iTransformedToOriginal, iTransformedToOriginal);
            if (p0.g(jB, h0Var2.O().getSelection())) {
                return;
            }
            b0 state2 = h0Var2.getState();
            if ((state2 == null || state2.y()) && (hapticFeedBack = h0Var2.getHapticFeedBack()) != null) {
                hapticFeedBack.a(r3.b.INSTANCE.b());
            }
            h0Var2.K().invoke(h0Var2.q(h0Var2.O().getText(), jB));
        }

        @Override // kotlin.n0
        public void c(long startPoint) {
            c1 c1VarJ;
            long jA = x.a(h0.this.G(true));
            b0 state = h0.this.getState();
            if (state == null || (c1VarJ = state.j()) == null) {
                return;
            }
            long jK = c1VarJ.k(jA);
            h0.this.dragBeginPosition = jK;
            h0.this.W(j3.g.d(jK));
            h0.this.dragTotalDistance = j3.g.INSTANCE.c();
            h0.this.Y(m.Cursor);
            h0.this.m0(false);
        }

        @Override // kotlin.n0
        public void d() {
            h0.this.Y(null);
            h0.this.W(null);
        }

        @Override // kotlin.n0
        public void onStop() {
            h0.this.Y(null);
            h0.this.W(null);
        }

        @Override // kotlin.n0
        public void onCancel() {
        }

        @Override // kotlin.n0
        public void a(long point) {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"h2/h0$b", "Lb2/n0;", "Lj3/g;", "point", "Ljn0/h0;", "a", "(J)V", DateTokenConverter.CONVERTER_KEY, "()V", "startPoint", "c", "delta", "b", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements n0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f70290b;

        b(boolean z11) {
            this.f70290b = z11;
        }

        @Override // kotlin.n0
        public void a(long point) {
            c1 c1VarJ;
            h0.this.Y(this.f70290b ? m.SelectionStart : m.SelectionEnd);
            long jA = x.a(h0.this.G(this.f70290b));
            b0 state = h0.this.getState();
            if (state == null || (c1VarJ = state.j()) == null) {
                return;
            }
            long jK = c1VarJ.k(jA);
            h0.this.dragBeginPosition = jK;
            h0.this.W(j3.g.d(jK));
            h0.this.dragTotalDistance = j3.g.INSTANCE.c();
            h0.this.previousRawDragOffset = -1;
            b0 state2 = h0.this.getState();
            if (state2 != null) {
                state2.D(true);
            }
            h0.this.m0(false);
        }

        @Override // kotlin.n0
        public void b(long delta) {
            h0 h0Var = h0.this;
            h0Var.dragTotalDistance = j3.g.r(h0Var.dragTotalDistance, delta);
            h0 h0Var2 = h0.this;
            h0Var2.W(j3.g.d(j3.g.r(h0Var2.dragBeginPosition, h0.this.dragTotalDistance)));
            h0 h0Var3 = h0.this;
            TextFieldValue textFieldValueO = h0Var3.O();
            j3.g gVarA = h0.this.A();
            s.h(gVarA);
            h0Var3.n0(textFieldValueO, gVarA.getPackedValue(), false, this.f70290b, s.INSTANCE.k(), true);
            h0.this.m0(false);
        }

        @Override // kotlin.n0
        public void d() {
            h0.this.Y(null);
            h0.this.W(null);
            h0.this.m0(true);
        }

        @Override // kotlin.n0
        public void onStop() {
            h0.this.Y(null);
            h0.this.W(null);
            h0.this.m0(true);
        }

        @Override // kotlin.n0
        public void onCancel() {
        }

        @Override // kotlin.n0
        public void c(long startPoint) {
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ0\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"h2/h0$c", "Lh2/h;", "Lj3/g;", "downPosition", "", "e", "(J)Z", "dragPosition", "c", "Lh2/s;", "adjustment", "a", "(JLh2/s;)Z", DateTokenConverter.CONVERTER_KEY, "Lo4/o0;", "value", "currentPosition", "isStartOfSelection", "Ljn0/h0;", "f", "(Lo4/o0;JZLh2/s;)V", "b", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements p007h2.h {
        c() {
        }

        @Override // p007h2.h
        public boolean a(long downPosition, s adjustment) {
            b0 state;
            if (!h0.this.E() || h0.this.O().h().length() == 0 || (state = h0.this.getState()) == null || state.j() == null) {
                return false;
            }
            o focusRequester = h0.this.getFocusRequester();
            if (focusRequester != null) {
                focusRequester.f();
            }
            h0.this.dragBeginPosition = downPosition;
            h0.this.previousRawDragOffset = -1;
            h0.w(h0.this, false, 1, null);
            f(h0.this.O(), h0.this.dragBeginPosition, true, adjustment);
            return true;
        }

        @Override // p007h2.h
        public boolean c(long dragPosition) {
            b0 state;
            if (!h0.this.E() || h0.this.O().h().length() == 0 || (state = h0.this.getState()) == null || state.j() == null) {
                return false;
            }
            f(h0.this.O(), dragPosition, false, s.INSTANCE.l());
            return true;
        }

        @Override // p007h2.h
        public boolean d(long dragPosition, s adjustment) {
            b0 state;
            if (!h0.this.E() || h0.this.O().h().length() == 0 || (state = h0.this.getState()) == null || state.j() == null) {
                return false;
            }
            f(h0.this.O(), dragPosition, false, adjustment);
            return true;
        }

        @Override // p007h2.h
        public boolean e(long downPosition) {
            b0 state = h0.this.getState();
            if (state == null || state.j() == null || !h0.this.E()) {
                return false;
            }
            h0.this.previousRawDragOffset = -1;
            f(h0.this.O(), downPosition, false, s.INSTANCE.l());
            return true;
        }

        public final void f(TextFieldValue value, long currentPosition, boolean isStartOfSelection, s adjustment) {
            h0.this.c0(p0.h(h0.this.n0(value, currentPosition, isStartOfSelection, false, adjustment, false)) ? n.Cursor : n.Selection);
        }

        @Override // p007h2.h
        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\bJ\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"h2/h0$i", "Lb2/n0;", "Ljn0/h0;", "e", "()V", "Lj3/g;", "point", "a", "(J)V", DateTokenConverter.CONVERTER_KEY, "startPoint", "c", "delta", "b", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i implements n0 {
        i() {
        }

        private final void e() {
            h0.this.Y(null);
            h0.this.W(null);
            h0.this.m0(true);
            h0.this.dragBeginOffsetInText = null;
            boolean zH = p0.h(h0.this.O().getSelection());
            h0.this.c0(zH ? n.Cursor : n.Selection);
            b0 state = h0.this.getState();
            if (state != null) {
                state.M(!zH && i0.c(h0.this, true));
            }
            b0 state2 = h0.this.getState();
            if (state2 != null) {
                state2.L(!zH && i0.c(h0.this, false));
            }
            b0 state3 = h0.this.getState();
            if (state3 == null) {
                return;
            }
            state3.J(zH && i0.c(h0.this, true));
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:23:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:24:0x00c0  */
        @Override // kotlin.n0
        public void b(long delta) {
            c1 c1VarJ;
            Integer num;
            int iD;
            long jN0;
            if (!h0.this.E() || h0.this.O().h().length() == 0) {
                return;
            }
            h0 h0Var = h0.this;
            h0Var.dragTotalDistance = j3.g.r(h0Var.dragTotalDistance, delta);
            b0 state = h0.this.getState();
            if (state != null && (c1VarJ = state.j()) != null) {
                h0 h0Var2 = h0.this;
                h0Var2.W(j3.g.d(j3.g.r(h0Var2.dragBeginPosition, h0Var2.dragTotalDistance)));
                if (h0Var2.dragBeginOffsetInText == null) {
                    j3.g gVarA = h0Var2.A();
                    s.h(gVarA);
                    if (c1VarJ.g(gVarA.getPackedValue())) {
                        num = h0Var2.dragBeginOffsetInText;
                        if (num != null) {
                            iD = num.intValue();
                        } else {
                            iD = c1VarJ.d(h0Var2.dragBeginPosition, false);
                        }
                        j3.g gVarA2 = h0Var2.A();
                        s.h(gVarA2);
                        int iD2 = c1VarJ.d(gVarA2.getPackedValue(), false);
                        if (h0Var2.dragBeginOffsetInText != null && iD == iD2) {
                            return;
                        }
                        TextFieldValue textFieldValueO = h0Var2.O();
                        j3.g gVarA3 = h0Var2.A();
                        s.h(gVarA3);
                        jN0 = h0Var2.n0(textFieldValueO, gVarA3.getPackedValue(), false, false, s.INSTANCE.n(), true);
                    } else {
                        int iTransformedToOriginal = h0Var2.getOffsetMapping().transformedToOriginal(c1.e(c1VarJ, h0Var2.dragBeginPosition, false, 2, null));
                        f0 offsetMapping = h0Var2.getOffsetMapping();
                        j3.g gVarA4 = h0Var2.A();
                        s.h(gVarA4);
                        s sVarL = iTransformedToOriginal == offsetMapping.transformedToOriginal(c1.e(c1VarJ, gVarA4.getPackedValue(), false, 2, null)) ? s.INSTANCE.l() : s.INSTANCE.n();
                        TextFieldValue textFieldValueO2 = h0Var2.O();
                        j3.g gVarA5 = h0Var2.A();
                        s.h(gVarA5);
                        jN0 = h0Var2.n0(textFieldValueO2, gVarA5.getPackedValue(), false, false, sVarL, true);
                    }
                } else {
                    num = h0Var2.dragBeginOffsetInText;
                    if (num != null) {
                        iD = num.intValue();
                    } else {
                        iD = c1VarJ.d(h0Var2.dragBeginPosition, false);
                    }
                    j3.g gVarA6 = h0Var2.A();
                    s.h(gVarA6);
                    int iD3 = c1VarJ.d(gVarA6.getPackedValue(), false);
                    if (h0Var2.dragBeginOffsetInText != null) {
                    }
                    TextFieldValue textFieldValueO3 = h0Var2.O();
                    j3.g gVarA7 = h0Var2.A();
                    s.h(gVarA7);
                    jN0 = h0Var2.n0(textFieldValueO3, gVarA7.getPackedValue(), false, false, s.INSTANCE.n(), true);
                }
                p0.b(jN0);
            }
            h0.this.m0(false);
        }

        @Override // kotlin.n0
        public void c(long startPoint) {
            long j11;
            c1 c1VarJ;
            c1 c1VarJ2;
            if (h0.this.E() && h0.this.C() == null) {
                h0.this.Y(m.SelectionEnd);
                h0.this.previousRawDragOffset = -1;
                h0.this.R();
                b0 state = h0.this.getState();
                if (state == null || (c1VarJ2 = state.j()) == null || !c1VarJ2.g(startPoint)) {
                    j11 = startPoint;
                    b0 state2 = h0.this.getState();
                    if (state2 != null && (c1VarJ = state2.j()) != null) {
                        h0 h0Var = h0.this;
                        int iTransformedToOriginal = h0Var.getOffsetMapping().transformedToOriginal(c1.e(c1VarJ, j11, false, 2, null));
                        TextFieldValue textFieldValueQ = h0Var.q(h0Var.O().getText(), q0.b(iTransformedToOriginal, iTransformedToOriginal));
                        h0Var.v(false);
                        r3.a hapticFeedBack = h0Var.getHapticFeedBack();
                        if (hapticFeedBack != null) {
                            hapticFeedBack.a(r3.b.INSTANCE.b());
                        }
                        h0Var.K().invoke(textFieldValueQ);
                    }
                } else {
                    if (h0.this.O().h().length() == 0) {
                        return;
                    }
                    h0.this.v(false);
                    h0 h0Var2 = h0.this;
                    j11 = startPoint;
                    h0.this.dragBeginOffsetInText = Integer.valueOf(p0.n(h0Var2.n0(TextFieldValue.c(h0Var2.O(), null, p0.INSTANCE.a(), null, 5, null), startPoint, true, false, s.INSTANCE.n(), true)));
                }
                h0.this.c0(n.None);
                h0.this.dragBeginPosition = j11;
                h0 h0Var3 = h0.this;
                h0Var3.W(j3.g.d(h0Var3.dragBeginPosition));
                h0.this.dragTotalDistance = j3.g.INSTANCE.c();
            }
        }

        @Override // kotlin.n0
        public void onCancel() {
            e();
        }

        @Override // kotlin.n0
        public void onStop() {
            e();
        }

        @Override // kotlin.n0
        public void d() {
        }

        @Override // kotlin.n0
        public void a(long point) {
        }
    }

    public /* synthetic */ h0(n1 n1Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : n1Var);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/o0;", "it", "Ljn0/h0;", "a", "(Lo4/o0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<TextFieldValue, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f70292c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return jn0.h0.f84049a;
        }

        public final void a(TextFieldValue textFieldValue) {
        }
    }
}
