package kotlin;

import android.view.KeyEvent;
import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.p0;
import java.util.List;
import o4.CommitTextCommand;
import o4.DeleteSurroundingTextCommand;
import o4.TextFieldValue;
import o4.f0;
import o4.i;
import o4.k;
import o4.n;
import o4.r;
import p007h2.g0;
import p007h2.h0;
import p007h2.k0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import t3.c;
import t3.d;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u00020\u00162\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010:\u001a\u0004\b=\u0010<R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010HR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010IR\u001a\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lb2/t0;", "", "Lb2/b0;", "state", "Lh2/h0;", "selectionManager", "Lo4/o0;", "value", "", "editable", "singleLine", "Lh2/k0;", "preparedSelectionState", "Lo4/f0;", "offsetMapping", "Lb2/n1;", "undoManager", "Lb2/k;", "keyCombiner", "Lb2/u;", "keyMapping", "Lkotlin/Function1;", "Ljn0/h0;", "onValueChange", "Lo4/r;", "imeAction", "<init>", "(Lb2/b0;Lh2/h0;Lo4/o0;ZZLh2/k0;Lo4/f0;Lb2/n1;Lb2/k;Lb2/u;Lwn0/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lo4/i;", "e", "(Ljava/util/List;)V", "f", "(Lo4/i;)V", "Lt3/b;", "event", "Lo4/a;", "m", "(Landroid/view/KeyEvent;)Lo4/a;", "Lh2/g0;", "block", "g", "(Lwn0/l;)V", "l", "(Landroid/view/KeyEvent;)Z", "a", "Lb2/b0;", "j", "()Lb2/b0;", "b", "Lh2/h0;", "h", "()Lh2/h0;", "c", "Lo4/o0;", "getValue", "()Lo4/o0;", DateTokenConverter.CONVERTER_KEY, "Z", "getEditable", "()Z", IntegerTokenConverter.CONVERTER_KEY, "Lh2/k0;", "getPreparedSelectionState", "()Lh2/k0;", "Lo4/f0;", "getOffsetMapping", "()Lo4/f0;", "Lb2/n1;", "k", "()Lb2/n1;", "Lb2/k;", "Lb2/u;", "Lwn0/l;", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h0 selectionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextFieldValue value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean editable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k0 preparedSelectionState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f0 offsetMapping;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n1 undoManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final k keyCombiner;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final u keyMapping;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l<TextFieldValue, jn0.h0> onValueChange;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int imeAction;

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh2/g0;", "Ljn0/h0;", "a", "(Lh2/g0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<g0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f15882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ t0 f15883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j0 f15884e;

        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh2/g0;", "Ljn0/h0;", "a", "(Lh2/g0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<g0, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f15885c = new a();

            a() {
                super(1);
            }

            public final void a(g0 g0Var) {
                g0Var.A();
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(g0 g0Var) {
                a(g0Var);
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: b2.t0$b$b, reason: collision with other inner class name */
        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh2/g0;", "Ljn0/h0;", "a", "(Lh2/g0;)V"}, k = 3, mv = {1, 8, 0})
        static final class C0294b extends u implements l<g0, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0294b f15886c = new C0294b();

            C0294b() {
                super(1);
            }

            public final void a(g0 g0Var) {
                g0Var.I();
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(g0 g0Var) {
                a(g0Var);
                return jn0.h0.f84049a;
            }
        }

        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh2/g0;", "Lo4/i;", "a", "(Lh2/g0;)Lo4/i;"}, k = 3, mv = {1, 8, 0})
        static final class c extends u implements l<g0, o4.i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f15887c = new c();

            c() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o4.i invoke(g0 g0Var) {
                return new DeleteSurroundingTextCommand(p0.i(g0Var.getSelection()) - g0Var.q(), 0);
            }
        }

        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh2/g0;", "Lo4/i;", "a", "(Lh2/g0;)Lo4/i;"}, k = 3, mv = {1, 8, 0})
        static final class d extends u implements l<g0, o4.i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f15888c = new d();

            d() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o4.i invoke(g0 g0Var) {
                int iL = g0Var.l();
                if (iL != -1) {
                    return new DeleteSurroundingTextCommand(0, iL - p0.i(g0Var.getSelection()));
                }
                return null;
            }
        }

        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh2/g0;", "Lo4/i;", "a", "(Lh2/g0;)Lo4/i;"}, k = 3, mv = {1, 8, 0})
        static final class e extends u implements l<g0, o4.i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f15889c = new e();

            e() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o4.i invoke(g0 g0Var) {
                Integer numT = g0Var.t();
                if (numT == null) {
                    return null;
                }
                return new DeleteSurroundingTextCommand(p0.i(g0Var.getSelection()) - numT.intValue(), 0);
            }
        }

        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh2/g0;", "Lo4/i;", "a", "(Lh2/g0;)Lo4/i;"}, k = 3, mv = {1, 8, 0})
        static final class f extends u implements l<g0, o4.i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f15890c = new f();

            f() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o4.i invoke(g0 g0Var) {
                Integer numM = g0Var.m();
                if (numM != null) {
                    return new DeleteSurroundingTextCommand(0, numM.intValue() - p0.i(g0Var.getSelection()));
                }
                return null;
            }
        }

        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh2/g0;", "Lo4/i;", "a", "(Lh2/g0;)Lo4/i;"}, k = 3, mv = {1, 8, 0})
        static final class g extends u implements l<g0, o4.i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final g f15891c = new g();

            g() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o4.i invoke(g0 g0Var) {
                Integer numI = g0Var.i();
                if (numI == null) {
                    return null;
                }
                return new DeleteSurroundingTextCommand(p0.i(g0Var.getSelection()) - numI.intValue(), 0);
            }
        }

        @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh2/g0;", "Lo4/i;", "a", "(Lh2/g0;)Lo4/i;"}, k = 3, mv = {1, 8, 0})
        static final class h extends u implements l<g0, o4.i> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final h f15892c = new h();

            h() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o4.i invoke(g0 g0Var) {
                Integer numF = g0Var.f();
                if (numF != null) {
                    return new DeleteSurroundingTextCommand(0, numF.intValue() - p0.i(g0Var.getSelection()));
                }
                return null;
            }
        }

        @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15893a;

            static {
                int[] iArr = new int[s.values().length];
                try {
                    iArr[s.COPY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s.PASTE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s.CUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[s.LEFT_CHAR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[s.RIGHT_CHAR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[s.LEFT_WORD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[s.RIGHT_WORD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[s.PREV_PARAGRAPH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[s.NEXT_PARAGRAPH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[s.UP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[s.DOWN.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[s.PAGE_UP.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[s.PAGE_DOWN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[s.LINE_START.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[s.LINE_END.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[s.LINE_LEFT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[s.LINE_RIGHT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[s.HOME.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[s.END.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[s.DELETE_PREV_CHAR.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[s.DELETE_NEXT_CHAR.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[s.DELETE_PREV_WORD.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[s.DELETE_NEXT_WORD.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[s.DELETE_FROM_LINE_START.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[s.DELETE_TO_LINE_END.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[s.NEW_LINE.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[s.TAB.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[s.SELECT_ALL.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[s.SELECT_LEFT_CHAR.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[s.SELECT_RIGHT_CHAR.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[s.SELECT_LEFT_WORD.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[s.SELECT_RIGHT_WORD.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[s.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[s.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[s.SELECT_LINE_START.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[s.SELECT_LINE_END.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[s.SELECT_LINE_LEFT.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[s.SELECT_LINE_RIGHT.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[s.SELECT_UP.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[s.SELECT_DOWN.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[s.SELECT_PAGE_UP.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[s.SELECT_PAGE_DOWN.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[s.SELECT_HOME.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[s.SELECT_END.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[s.DESELECT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[s.UNDO.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[s.REDO.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[s.CHARACTER_PALETTE.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                f15893a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar, t0 t0Var, j0 j0Var) {
            super(1);
            this.f15882c = sVar;
            this.f15883d = t0Var;
            this.f15884e = j0Var;
        }

        public final void a(g0 g0Var) {
            TextFieldValue textFieldValueG;
            TextFieldValue textFieldValueC;
            switch (i.f15893a[this.f15882c.ordinal()]) {
                case 1:
                    this.f15883d.getSelectionManager().o(false);
                    break;
                case 2:
                    this.f15883d.getSelectionManager().T();
                    break;
                case 3:
                    this.f15883d.getSelectionManager().s();
                    break;
                case 4:
                    g0Var.b(a.f15885c);
                    break;
                case 5:
                    g0Var.c(C0294b.f15886c);
                    break;
                case 6:
                    g0Var.B();
                    break;
                case 7:
                    g0Var.J();
                    break;
                case 8:
                    g0Var.G();
                    break;
                case 9:
                    g0Var.D();
                    break;
                case 10:
                    g0Var.Q();
                    break;
                case 11:
                    g0Var.z();
                    break;
                case 12:
                    g0Var.c0();
                    break;
                case 13:
                    g0Var.b0();
                    break;
                case 14:
                    g0Var.P();
                    break;
                case 15:
                    g0Var.M();
                    break;
                case 16:
                    g0Var.N();
                    break;
                case 17:
                    g0Var.O();
                    break;
                case 18:
                    g0Var.L();
                    break;
                case 19:
                    g0Var.K();
                    break;
                case 20:
                    List<o4.i> listY = g0Var.Y(c.f15887c);
                    if (listY != null) {
                        this.f15883d.e(listY);
                    }
                    break;
                case 21:
                    List<o4.i> listY2 = g0Var.Y(d.f15888c);
                    if (listY2 != null) {
                        this.f15883d.e(listY2);
                    }
                    break;
                case 22:
                    List<o4.i> listY3 = g0Var.Y(e.f15889c);
                    if (listY3 != null) {
                        this.f15883d.e(listY3);
                    }
                    break;
                case 23:
                    List<o4.i> listY4 = g0Var.Y(f.f15890c);
                    if (listY4 != null) {
                        this.f15883d.e(listY4);
                    }
                    break;
                case 24:
                    List<o4.i> listY5 = g0Var.Y(g.f15891c);
                    if (listY5 != null) {
                        this.f15883d.e(listY5);
                    }
                    break;
                case 25:
                    List<o4.i> listY6 = g0Var.Y(h.f15892c);
                    if (listY6 != null) {
                        this.f15883d.e(listY6);
                    }
                    break;
                case 26:
                    if (!this.f15883d.getSingleLine()) {
                        this.f15883d.f(new CommitTextCommand("\n", 1));
                    } else {
                        this.f15883d.getState().l().invoke(r.j(this.f15883d.imeAction));
                    }
                    break;
                case 27:
                    if (!this.f15883d.getSingleLine()) {
                        this.f15883d.f(new CommitTextCommand(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, 1));
                    } else {
                        this.f15884e.f86523a = false;
                    }
                    break;
                case 28:
                    g0Var.R();
                    break;
                case 29:
                    g0Var.A().S();
                    break;
                case 30:
                    g0Var.I().S();
                    break;
                case 31:
                    g0Var.B().S();
                    break;
                case 32:
                    g0Var.J().S();
                    break;
                case 33:
                    g0Var.G().S();
                    break;
                case 34:
                    g0Var.D().S();
                    break;
                case 35:
                    g0Var.P().S();
                    break;
                case 36:
                    g0Var.M().S();
                    break;
                case 37:
                    g0Var.N().S();
                    break;
                case 38:
                    g0Var.O().S();
                    break;
                case 39:
                    g0Var.Q().S();
                    break;
                case 40:
                    g0Var.z().S();
                    break;
                case 41:
                    g0Var.c0().S();
                    break;
                case 42:
                    g0Var.b0().S();
                    break;
                case 43:
                    g0Var.L().S();
                    break;
                case 44:
                    g0Var.K().S();
                    break;
                case 45:
                    g0Var.d();
                    break;
                case 46:
                    n1 undoManager = this.f15883d.getUndoManager();
                    if (undoManager != null) {
                        undoManager.b(g0Var.Z());
                    }
                    n1 undoManager2 = this.f15883d.getUndoManager();
                    if (undoManager2 != null && (textFieldValueG = undoManager2.g()) != null) {
                        this.f15883d.onValueChange.invoke(textFieldValueG);
                        break;
                    }
                    break;
                case 47:
                    n1 undoManager3 = this.f15883d.getUndoManager();
                    if (undoManager3 != null && (textFieldValueC = undoManager3.c()) != null) {
                        this.f15883d.onValueChange.invoke(textFieldValueC);
                        break;
                    }
                    break;
                case 48:
                    t.b();
                    break;
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(g0 g0Var) {
            a(g0Var);
            return jn0.h0.f84049a;
        }
    }

    public /* synthetic */ t0(b0 b0Var, h0 h0Var, TextFieldValue textFieldValue, boolean z11, boolean z12, k0 k0Var, f0 f0Var, n1 n1Var, k kVar, u uVar, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(b0Var, h0Var, textFieldValue, z11, z12, k0Var, f0Var, n1Var, kVar, uVar, lVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(List<? extends i> list) {
        k processor = this.state.getProcessor();
        List<? extends i> listP1 = v.p1(list);
        listP1.add(0, new n());
        this.onValueChange.invoke(processor.b(listP1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(i iVar) {
        e(v.e(iVar));
    }

    private final void g(l<? super g0, jn0.h0> block) {
        g0 g0Var = new g0(this.value, this.offsetMapping, this.state.j(), this.preparedSelectionState);
        block.invoke(g0Var);
        if (p0.g(g0Var.getSelection(), this.value.getSelection()) && s.f(g0Var.getAnnotatedString(), this.value.getText())) {
            return;
        }
        this.onValueChange.invoke(g0Var.Z());
    }

    private final CommitTextCommand m(KeyEvent event) {
        Integer numA;
        if (v0.a(event) && (numA = this.keyCombiner.a(event)) != null) {
            return new CommitTextCommand(i0.a(new StringBuilder(), numA.intValue()).toString(), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h0 getSelectionManager() {
        return this.selectionManager;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b0 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final n1 getUndoManager() {
        return this.undoManager;
    }

    public final boolean l(KeyEvent event) {
        s sVarA;
        CommitTextCommand commitTextCommandM = m(event);
        if (commitTextCommandM != null) {
            if (!this.editable) {
                return false;
            }
            f(commitTextCommandM);
            this.preparedSelectionState.b();
            return true;
        }
        if (!c.e(d.b(event), c.INSTANCE.a()) || (sVarA = this.keyMapping.a(event)) == null || (sVarA.getEditsText() && !this.editable)) {
            return false;
        }
        j0 j0Var = new j0();
        j0Var.f86523a = true;
        g(new b(sVarA, this, j0Var));
        n1 n1Var = this.undoManager;
        if (n1Var != null) {
            n1Var.a();
        }
        return j0Var.f86523a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private t0(b0 b0Var, h0 h0Var, TextFieldValue textFieldValue, boolean z11, boolean z12, k0 k0Var, f0 f0Var, n1 n1Var, k kVar, u uVar, l<? super TextFieldValue, jn0.h0> lVar, int i11) {
        this.state = b0Var;
        this.selectionManager = h0Var;
        this.value = textFieldValue;
        this.editable = z11;
        this.singleLine = z12;
        this.preparedSelectionState = k0Var;
        this.offsetMapping = f0Var;
        this.undoManager = n1Var;
        this.keyCombiner = kVar;
        this.keyMapping = uVar;
        this.onValueChange = lVar;
        this.imeAction = i11;
    }

    public /* synthetic */ t0(b0 b0Var, h0 h0Var, TextFieldValue textFieldValue, boolean z11, boolean z12, k0 k0Var, f0 f0Var, n1 n1Var, k kVar, u uVar, l lVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(b0Var, h0Var, (i12 & 4) != 0 ? new TextFieldValue((String) null, 0L, (p0) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? false : z12, k0Var, (i12 & 64) != 0 ? f0.INSTANCE.a() : f0Var, (i12 & 128) != 0 ? null : n1Var, kVar, (i12 & 512) != 0 ? w.a() : uVar, (i12 & 1024) != 0 ? a.f15881c : lVar, i11, null);
    }

    @p013kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/o0;", "it", "Ljn0/h0;", "a", "(Lo4/o0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<TextFieldValue, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15881c = new a();

        a() {
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
